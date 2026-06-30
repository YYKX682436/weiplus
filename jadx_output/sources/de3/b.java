package de3;

/* loaded from: classes7.dex */
public enum b {
    ;

    public static synchronized java.util.Map a(com.tencent.mars.cdn.CronetLogic.WebPageProfile webPageProfile) {
        java.util.HashMap hashMap;
        synchronized (de3.b.class) {
            hashMap = new java.util.HashMap();
            if (webPageProfile != null) {
                hashMap.put("redirectStart", java.lang.Long.valueOf(webPageProfile.redirectStart));
                hashMap.put("redirectEnd", java.lang.Long.valueOf(webPageProfile.redirectEnd));
                hashMap.put("fetchStart", java.lang.Long.valueOf(webPageProfile.fetchStart));
                hashMap.put("domainLookUpStart", java.lang.Long.valueOf(webPageProfile.domainLookUpStart));
                hashMap.put("domainLookUpEnd", java.lang.Long.valueOf(webPageProfile.domainLookUpEnd));
                hashMap.put("connectStart", java.lang.Long.valueOf(webPageProfile.connectStart));
                hashMap.put("connectEnd", java.lang.Long.valueOf(webPageProfile.connectEnd));
                hashMap.put("SSLconnectionStart", java.lang.Long.valueOf(webPageProfile.SSLconnectionStart));
                hashMap.put("SSLconnectionEnd", java.lang.Long.valueOf(webPageProfile.SSLconnectionEnd));
                hashMap.put("requestStart", java.lang.Long.valueOf(webPageProfile.requestStart));
                hashMap.put("requestEnd", java.lang.Long.valueOf(webPageProfile.requestEnd));
                hashMap.put("responseStart", java.lang.Long.valueOf(webPageProfile.responseStart));
                hashMap.put("responseEnd", java.lang.Long.valueOf(webPageProfile.responseEnd));
                hashMap.put("rtt", java.lang.Integer.valueOf(webPageProfile.rtt));
                hashMap.put("estimate_nettype", java.lang.Integer.valueOf(webPageProfile.networkTypeEstimate));
                hashMap.put("httpRttEstimate", java.lang.Integer.valueOf(webPageProfile.httpRttEstimate));
                hashMap.put("transportRttEstimate", java.lang.Integer.valueOf(webPageProfile.transportRttEstimate));
                hashMap.put("downstreamThroughputKbpsEstimate", java.lang.Integer.valueOf(webPageProfile.downstreamThroughputKbpsEstimate));
                hashMap.put("throughputKbps", java.lang.Integer.valueOf(webPageProfile.throughputKbps));
                hashMap.put("peerIP", webPageProfile.peerIP);
                hashMap.put("port", java.lang.Integer.valueOf(webPageProfile.port));
                hashMap.put("protocol", webPageProfile.protocol);
                hashMap.put("socketReused", java.lang.Boolean.valueOf(webPageProfile.socketReused));
                hashMap.put("sendBytesCount", java.lang.Long.valueOf(webPageProfile.sendBytesCount));
                hashMap.put("receivedBytedCount", java.lang.Long.valueOf(webPageProfile.receivedBytedCount));
            }
        }
        return hashMap;
    }

    public static de3.b valueOf(java.lang.String str) {
        android.support.v4.media.f.a(java.lang.Enum.valueOf(de3.b.class, str));
        return null;
    }
}
