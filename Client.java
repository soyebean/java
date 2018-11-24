import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 熟悉流程 
 * 创建客户端
 * 1.建立链接：指定端口 使用Socket创建客户端+服务的地址和端口 
 * 2.操作：输入输出流操作 
 * 3.释放资源
 * 
 * @author soyebean
 *
 */
public class Client {
	public static void main(String[] args) {
		System.out.println("----client------");
		try {
			Socket client =new Socket("localhost",8888);
			DataOutputStream dos=new DataOutputStream(client.getOutputStream());
			String data="hello";
			dos.writeUTF(data);
			dos.flush();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
