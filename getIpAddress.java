import java.net.InetAddress;
import java.net.UnknownHostException;

public class getIpAddress {

    /**
     * IPアドレスの取得処理
     * （自端末のホスト名およびIPアドレスを取得する）
     * @param args
     */
    public static void main(String[] args) {
        InetAddress ia = null;
        try {
            String hostname = InetAddress.getLocalHost().getHostName();

            ia = InetAddress.getByName(hostname);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        // 端末ホスト名を設定
        System.out.println("ホスト名　：" + ia.getHostName());
        // 端末IPアドレスを設定
        System.out.println("IPアドレス：" + ia.getHostAddress());
    }
}
