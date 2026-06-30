package com.tencent.tmassistantsdk.protocol.jce;

/* loaded from: classes13.dex */
public final class ApkDownUrl extends com.qq.taf.jce.JceStruct {
    static java.util.ArrayList<java.lang.String> cache_urlList;
    public byte type;
    public java.util.ArrayList<java.lang.String> urlList;

    public ApkDownUrl() {
        this.type = (byte) 0;
        this.urlList = null;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        this.type = jceInputStream.read(this.type, 0, true);
        if (cache_urlList == null) {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            cache_urlList = arrayList;
            arrayList.add("");
        }
        this.urlList = (java.util.ArrayList) jceInputStream.read((com.qq.taf.jce.JceInputStream) cache_urlList, 1, true);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.type, 0);
        jceOutputStream.write((java.util.Collection) this.urlList, 1);
    }

    public ApkDownUrl(byte b17, java.util.ArrayList<java.lang.String> arrayList) {
        this.type = b17;
        this.urlList = arrayList;
    }
}
