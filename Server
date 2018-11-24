import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 熟悉流程 创建服务器 
 * 1.指定端口 使用ServerSocket创建服务器 
 * 2.阻塞式等待链接accept 
 * 3.操作：输入输出流操作 
 * 4.释放资源
 * 
 * @author soyebean
 *
 */
public class Server {
	public static void main(String[] args) {
		System.out.println("------server-----");
		ServerSocket server;
		try {
			server = new ServerSocket(8888);
			Socket client=server.accept();
			
			System.out.println("一个客户端建立链接");
			DataInputStream dis=new DataInputStream(client.getInputStream());
			String data=dis.readUTF();
			System.out.println(data);
			dis.close();
			client.close();
			server.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
}
