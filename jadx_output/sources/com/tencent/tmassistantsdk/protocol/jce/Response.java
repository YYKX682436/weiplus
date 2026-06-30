package com.tencent.tmassistantsdk.protocol.jce;

/* loaded from: classes13.dex */
public final class Response extends com.qq.taf.jce.JceStruct implements java.lang.Cloneable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String TAG = "Response";
    static byte[] cache_body;
    static com.tencent.tmassistantsdk.protocol.jce.RspHead cache_head;
    public byte[] body;
    public com.tencent.tmassistantsdk.protocol.jce.RspHead head;

    public Response() {
        this.head = null;
        this.body = null;
    }

    public java.lang.String className() {
        return "jce.Response";
    }

    public java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // com.qq.taf.jce.JceStruct
    public void display(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(sb6, i17);
        jceDisplayer.display((com.qq.taf.jce.JceStruct) this.head, "head");
        jceDisplayer.display(this.body, "body");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void displaySimple(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(sb6, i17);
        jceDisplayer.displaySimple((com.qq.taf.jce.JceStruct) this.head, true);
        jceDisplayer.displaySimple(this.body, false);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.tencent.tmassistantsdk.protocol.jce.Response response = (com.tencent.tmassistantsdk.protocol.jce.Response) obj;
        return com.qq.taf.jce.JceUtil.equals(this.head, response.head) && com.qq.taf.jce.JceUtil.equals(this.body, response.body);
    }

    public java.lang.String fullClassName() {
        return TAG;
    }

    public byte[] getBody() {
        return this.body;
    }

    public com.tencent.tmassistantsdk.protocol.jce.RspHead getHead() {
        return this.head;
    }

    public int hashCode() {
        try {
            throw new java.lang.Exception("Need define key first!");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return 0;
        }
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        if (cache_head == null) {
            cache_head = new com.tencent.tmassistantsdk.protocol.jce.RspHead();
        }
        this.head = (com.tencent.tmassistantsdk.protocol.jce.RspHead) jceInputStream.read((com.qq.taf.jce.JceStruct) cache_head, 0, true);
        if (cache_body == null) {
            cache_body = r0;
            byte[] bArr = {0};
        }
        this.body = jceInputStream.read(cache_body, 1, true);
    }

    public void setBody(byte[] bArr) {
        this.body = bArr;
    }

    public void setHead(com.tencent.tmassistantsdk.protocol.jce.RspHead rspHead) {
        this.head = rspHead;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write((com.qq.taf.jce.JceStruct) this.head, 0);
        jceOutputStream.write(this.body, 1);
    }

    public Response(com.tencent.tmassistantsdk.protocol.jce.RspHead rspHead, byte[] bArr) {
        this.head = rspHead;
        this.body = bArr;
    }
}
