package com.tencent.tencentmap.net;

/* loaded from: classes13.dex */
public class NetManager {
    private static com.tencent.tencentmap.net.NetManager sInstance;

    private NetManager() {
    }

    public static synchronized com.tencent.tencentmap.net.NetManager getInstance() {
        com.tencent.tencentmap.net.NetManager netManager;
        synchronized (com.tencent.tencentmap.net.NetManager.class) {
            if (sInstance == null) {
                sInstance = new com.tencent.tencentmap.net.NetManager();
            }
            netManager = sInstance;
        }
        return netManager;
    }

    public com.tencent.tencentmap.net.NetResponse doGet(java.lang.String str) {
        com.tencent.map.tools.net.NetResponse doGet = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).doGet();
        if (doGet != null) {
            return new com.tencent.tencentmap.net.NetResponse(doGet);
        }
        return null;
    }

    public com.tencent.tencentmap.net.NetResponse doPost(java.lang.String str, byte[] bArr) {
        com.tencent.map.tools.net.NetResponse doPost = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).postData(bArr).doPost();
        if (doPost != null) {
            return new com.tencent.tencentmap.net.NetResponse(doPost);
        }
        return null;
    }

    public com.tencent.tencentmap.net.NetResponse doPostNoBuffer(java.lang.String str, java.lang.String str2, byte[] bArr) {
        com.tencent.map.tools.net.NetResponse doPost = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).postData(bArr).doPost();
        if (doPost != null) {
            return new com.tencent.tencentmap.net.NetResponse(doPost);
        }
        return null;
    }

    public void doRangePost(java.lang.String str, byte[] bArr, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.tencent.map.tools.net.http.HttpCanceler httpCanceler) {
        com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).token(str2).postData(bArr).nonce(str3).timestamp(str4).startTag(str5).canceler(httpCanceler).doPost();
    }

    public com.tencent.tencentmap.net.NetResponse doGet(java.lang.String str, java.lang.String str2) {
        com.tencent.map.tools.net.NetResponse doGet = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).doGet();
        if (doGet != null) {
            return new com.tencent.tencentmap.net.NetResponse(doGet);
        }
        return null;
    }

    public com.tencent.tencentmap.net.NetResponse doPost(java.lang.String str, java.lang.String str2, byte[] bArr) {
        com.tencent.map.tools.net.NetResponse doPost = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).postData(bArr).doPost();
        if (doPost != null) {
            return new com.tencent.tencentmap.net.NetResponse(doPost);
        }
        return null;
    }

    public com.tencent.tencentmap.net.NetResponse doGet(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.map.tools.net.NetResponse doGet = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).retryNum(i17).doGet();
        if (doGet != null) {
            return new com.tencent.tencentmap.net.NetResponse(doGet);
        }
        return null;
    }

    public com.tencent.tencentmap.net.NetResponse doPost(java.lang.String str, java.lang.String str2, byte[] bArr, int i17) {
        com.tencent.map.tools.net.NetResponse doPost = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).retryNum(i17).postData(bArr).doPost();
        if (doPost != null) {
            return new com.tencent.tencentmap.net.NetResponse(doPost);
        }
        return null;
    }

    public com.tencent.tencentmap.net.NetResponse doGet(java.lang.String str, java.lang.String str2, int i17, int i18, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        com.tencent.map.tools.net.NetResponse doGet = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).retryNum(i17).timeOut(i18).header(hashMap).doGet();
        if (doGet != null) {
            return new com.tencent.tencentmap.net.NetResponse(doGet);
        }
        return null;
    }

    public com.tencent.tencentmap.net.NetResponse doPost(java.lang.String str, java.lang.String str2, byte[] bArr, int i17, int i18, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        com.tencent.map.tools.net.NetResponse doPost = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).timeOut(i18).retryNum(i17).header(hashMap).postData(bArr).doPost();
        if (doPost != null) {
            return new com.tencent.tencentmap.net.NetResponse(doPost);
        }
        return null;
    }

    public com.tencent.tencentmap.net.NetResponse doGet(java.lang.String str, int i17, com.tencent.map.tools.net.http.HttpCanceler httpCanceler) {
        com.tencent.map.tools.net.NetResponse doGet = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).retryNum(i17).canceler(httpCanceler).doGet();
        if (doGet != null) {
            return new com.tencent.tencentmap.net.NetResponse(doGet);
        }
        return null;
    }

    public com.tencent.tencentmap.net.NetResponse doGet(java.lang.String str, java.lang.String str2, int i17, com.tencent.map.tools.net.http.HttpCanceler httpCanceler) {
        com.tencent.map.tools.net.NetResponse doGet = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).retryNum(i17).canceler(httpCanceler).doGet();
        if (doGet != null) {
            return new com.tencent.tencentmap.net.NetResponse(doGet);
        }
        return null;
    }

    public com.tencent.tencentmap.net.NetResponse doPost(java.lang.String str, byte[] bArr, int i17, com.tencent.map.tools.net.http.HttpCanceler httpCanceler) {
        com.tencent.map.tools.net.NetResponse doPost = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).retryNum(i17).canceler(httpCanceler).postData(bArr).doPost();
        if (doPost != null) {
            return new com.tencent.tencentmap.net.NetResponse(doPost);
        }
        return null;
    }

    public com.tencent.tencentmap.net.NetResponse doGet(java.lang.String str, java.lang.String str2, int i17, java.util.HashMap<java.lang.String, java.lang.String> hashMap, com.tencent.map.tools.net.http.HttpCanceler httpCanceler) {
        com.tencent.map.tools.net.NetResponse doGet = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).retryNum(i17).header(hashMap).canceler(httpCanceler).doGet();
        if (doGet != null) {
            return new com.tencent.tencentmap.net.NetResponse(doGet);
        }
        return null;
    }

    public com.tencent.tencentmap.net.NetResponse doPost(java.lang.String str, java.lang.String str2, byte[] bArr, int i17, com.tencent.map.tools.net.http.HttpCanceler httpCanceler) {
        com.tencent.map.tools.net.NetResponse doPost = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).retryNum(i17).canceler(httpCanceler).postData(bArr).doPost();
        if (doPost != null) {
            return new com.tencent.tencentmap.net.NetResponse(doPost);
        }
        return null;
    }

    public com.tencent.tencentmap.net.NetResponse doGet(java.lang.String str, java.lang.String str2, int i17, int i18, java.util.HashMap<java.lang.String, java.lang.String> hashMap, com.tencent.map.tools.net.http.HttpCanceler httpCanceler) {
        com.tencent.map.tools.net.NetResponse doGet = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).timeOut(i18).retryNum(i17).header(hashMap).canceler(httpCanceler).doGet();
        if (doGet != null) {
            return new com.tencent.tencentmap.net.NetResponse(doGet);
        }
        return null;
    }

    public com.tencent.tencentmap.net.NetResponse doPost(java.lang.String str, java.lang.String str2, byte[] bArr, int i17, java.util.HashMap<java.lang.String, java.lang.String> hashMap, com.tencent.map.tools.net.http.HttpCanceler httpCanceler) {
        com.tencent.map.tools.net.NetResponse doPost = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).retryNum(i17).header(hashMap).canceler(httpCanceler).postData(bArr).doPost();
        if (doPost != null) {
            return new com.tencent.tencentmap.net.NetResponse(doPost);
        }
        return null;
    }

    public com.tencent.tencentmap.net.NetResponse doPost(java.lang.String str, java.lang.String str2, byte[] bArr, int i17, java.util.HashMap<java.lang.String, java.lang.String> hashMap, com.tencent.map.tools.net.http.HttpCanceler httpCanceler, int i18) {
        com.tencent.map.tools.net.NetResponse doPost = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).timeOut(i18).retryNum(i17).header(hashMap).canceler(httpCanceler).postData(bArr).doPost();
        if (doPost != null) {
            return new com.tencent.tencentmap.net.NetResponse(doPost);
        }
        return null;
    }

    public com.tencent.tencentmap.net.NetResponse doPost(java.lang.String str, java.lang.String str2, byte[] bArr, int i17, java.util.HashMap<java.lang.String, java.lang.String> hashMap, int i18) {
        com.tencent.map.tools.net.NetResponse doPost = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).userAgent(str2).timeOut(i18).retryNum(i17).header(hashMap).postData(bArr).doPost();
        if (doPost != null) {
            return new com.tencent.tencentmap.net.NetResponse(doPost);
        }
        return null;
    }
}
