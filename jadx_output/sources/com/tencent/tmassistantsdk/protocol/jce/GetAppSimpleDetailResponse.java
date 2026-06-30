package com.tencent.tmassistantsdk.protocol.jce;

/* loaded from: classes13.dex */
public final class GetAppSimpleDetailResponse extends com.qq.taf.jce.JceStruct {
    static java.util.ArrayList<com.tencent.tmassistantsdk.protocol.jce.AppSimpleDetail> cache_appSimpleDetailList;
    public java.util.ArrayList<com.tencent.tmassistantsdk.protocol.jce.AppSimpleDetail> appSimpleDetailList;
    public int ret;

    public GetAppSimpleDetailResponse() {
        this.ret = 0;
        this.appSimpleDetailList = null;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        this.ret = jceInputStream.read(this.ret, 0, true);
        if (cache_appSimpleDetailList == null) {
            cache_appSimpleDetailList = new java.util.ArrayList<>();
            cache_appSimpleDetailList.add(new com.tencent.tmassistantsdk.protocol.jce.AppSimpleDetail());
        }
        this.appSimpleDetailList = (java.util.ArrayList) jceInputStream.read((com.qq.taf.jce.JceInputStream) cache_appSimpleDetailList, 1, true);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.ret, 0);
        jceOutputStream.write((java.util.Collection) this.appSimpleDetailList, 1);
    }

    public GetAppSimpleDetailResponse(int i17, java.util.ArrayList<com.tencent.tmassistantsdk.protocol.jce.AppSimpleDetail> arrayList) {
        this.ret = i17;
        this.appSimpleDetailList = arrayList;
    }
}
