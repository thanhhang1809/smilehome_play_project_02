package utils;

import java.nio.charset.Charset;

/**
 * Application's common constants.
 * 
 * @author Thanh Nguyen <btnguyen2k@gmail.com>
 * @since template-v0.1.0
 */
public class AppConstants {
    public final static String THREAD_POOL_DEFAULT = "default-dispatcher";
    public final static String THREAD_POOL_DB = "db-dispatcher";
    public final static String THREAD_POOL_WORKER = "worker-dispatcher";

    public final static Charset UTF8 = Charset.forName("UTF-8");

    public final static String CONTENT_TYPE_JSON = "application/json; charset=UTF-8";
    public final static String CONTENT_TYPE_HTML = "text/html; charset=UTF-8";

    public final static String API_GATEWAY_WEB = "WEB";
    public final static String API_GATEWAY_THRIFT = "THRIFT";
    public final static String API_GATEWAY_THRIFT_OVER_HTTP = "THRIFT_OVER_HTTP";
    public final static String API_GATEWAY_GRPC = "GRPC";

    public final static String CLUSTER_ROLE_MASTER = "master";
}
