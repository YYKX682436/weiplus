package com.tencent.youtu.sdkkitframework.net;

/* loaded from: classes13.dex */
public class YtSDKKitNetHelper {
    private static final java.lang.String TAG = "YtSDKKitNetHelper";
    private static final int TIME_OUT = 10000;
    private static com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper _instane;
    private javax.net.ssl.HttpsURLConnection conn;
    private java.lang.Thread networkThread;
    private java.util.HashMap<java.lang.Integer, java.lang.Thread> runningMap = new java.util.HashMap<>();

    private YtSDKKitNetHelper() {
    }

    public static synchronized void clearInstance() {
        synchronized (com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper.class) {
            com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper ytSDKKitNetHelper = _instane;
            if (ytSDKKitNetHelper != null) {
                ytSDKKitNetHelper.stopNetworkRequest();
            }
            _instane = null;
        }
    }

    public static synchronized com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper getInstance() {
        com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper ytSDKKitNetHelper;
        synchronized (com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper.class) {
            if (_instane == null) {
                _instane = new com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper();
            }
            ytSDKKitNetHelper = _instane;
        }
        return ytSDKKitNetHelper;
    }

    public void sendNetworkRequest(final java.lang.String str, final java.lang.String str2, final java.util.HashMap<java.lang.String, java.lang.String> hashMap, final com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper.1
            @Override // java.lang.Runnable
            public void run() {
                int responseCode;
                try {
                    try {
                        com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper.this.runningMap.put(java.lang.Integer.valueOf(android.os.Process.myTid()), com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper.this.networkThread);
                        com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper.this.conn = (javax.net.ssl.HttpsURLConnection) new java.net.URL(str).openConnection();
                        com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper.this.conn.setRequestMethod("POST");
                        com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper.this.conn.setConnectTimeout(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().getNetworkRequestTimeoutMS());
                        java.util.HashMap hashMap2 = hashMap;
                        if (hashMap2 != null) {
                            for (java.util.Map.Entry entry : hashMap2.entrySet()) {
                                com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper.this.conn.addRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                            }
                        }
                        com.tencent.youtu.sdkkitframework.common.YtLogger.i(com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper.TAG, "Write buffer");
                        java.io.OutputStream outputStream = com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper.this.conn.getOutputStream();
                        java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(outputStream, com.tencent.mapsdk.internal.rv.f51270c));
                        bufferedWriter.write(str2);
                        bufferedWriter.flush();
                        bufferedWriter.close();
                        outputStream.close();
                        com.tencent.youtu.sdkkitframework.common.YtLogger.i(com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper.TAG, "Wait response");
                        responseCode = com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper.this.conn.getResponseCode();
                        com.tencent.youtu.sdkkitframework.common.YtLogger.i(com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper.TAG, "Get response");
                    } catch (java.lang.Exception e17) {
                        com.tencent.youtu.sdkkitframework.common.YtLogger.e(com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper.TAG, "Network response failed " + e17.getLocalizedMessage());
                        iYtSDKKitNetResponseParser.onNetworkResponseEvent(null, e17);
                    }
                    if (!com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper.this.runningMap.containsKey(java.lang.Integer.valueOf(android.os.Process.myTid()))) {
                        com.tencent.youtu.sdkkitframework.common.YtLogger.i(com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper.TAG, "Exit network response handling");
                        com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper.this.conn.disconnect();
                        return;
                    }
                    if (responseCode == 200) {
                        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper.this.conn.getInputStream()));
                        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("");
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            stringBuffer.append(readLine);
                        }
                        bufferedReader.close();
                        java.util.HashMap<java.lang.String, java.lang.String> hashMap3 = new java.util.HashMap<>();
                        hashMap3.put("response", stringBuffer.toString());
                        iYtSDKKitNetResponseParser.onNetworkResponseEvent(hashMap3, null);
                    } else {
                        com.tencent.youtu.sdkkitframework.common.YtLogger.e(com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper.TAG, "Network response failed " + responseCode);
                        iYtSDKKitNetResponseParser.onNetworkResponseEvent(null, new java.lang.Exception("Https Response Failed with code:" + responseCode));
                    }
                } finally {
                    com.tencent.youtu.sdkkitframework.common.YtLogger.i(com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper.TAG, "Network disconnected");
                    com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper.this.conn.disconnect();
                }
            }
        });
        this.networkThread = thread;
        thread.setName("YtNetworkRequestThread");
        this.networkThread.start();
    }

    public void stopNetworkRequest() {
        for (java.util.Map.Entry<java.lang.Integer, java.lang.Thread> entry : this.runningMap.entrySet()) {
            if (entry.getValue() == this.networkThread) {
                this.runningMap.remove(entry.getKey());
                com.tencent.youtu.sdkkitframework.common.YtLogger.i(TAG, "network remove " + entry.getKey());
                return;
            }
        }
    }
}
