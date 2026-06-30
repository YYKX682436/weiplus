package com.tencent.paymars.mm;

/* loaded from: classes6.dex */
public class ConnectRecord implements java.io.Serializable {
    public int bizType = 0;
    public int protoType = 0;
    public boolean connectSucceed = false;
    public long beginTimestampMs = 0;
    public int costMs = 0;
    public int netType = 0;

    /* loaded from: classes6.dex */
    public static class BizType {
        public static final int CDN = 1;
        public static final int CGI = 0;
    }

    /* loaded from: classes6.dex */
    public static class ProtoType {
        public static final int QUIC = 1;
        public static final int TCP = 0;
    }
}
