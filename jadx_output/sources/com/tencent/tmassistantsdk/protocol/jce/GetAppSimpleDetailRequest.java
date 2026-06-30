package com.tencent.tmassistantsdk.protocol.jce;

/* loaded from: classes13.dex */
public final class GetAppSimpleDetailRequest extends com.qq.taf.jce.JceStruct {
    static java.util.ArrayList<com.tencent.tmassistantsdk.protocol.jce.AppDetailParam> cache_appReqList;
    public java.util.ArrayList<com.tencent.tmassistantsdk.protocol.jce.AppDetailParam> appReqList;

    public GetAppSimpleDetailRequest() {
        this.appReqList = null;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        if (cache_appReqList == null) {
            cache_appReqList = new java.util.ArrayList<>();
            cache_appReqList.add(new com.tencent.tmassistantsdk.protocol.jce.AppDetailParam());
        }
        this.appReqList = (java.util.ArrayList) jceInputStream.read((com.qq.taf.jce.JceInputStream) cache_appReqList, 0, false);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        java.util.ArrayList<com.tencent.tmassistantsdk.protocol.jce.AppDetailParam> arrayList = this.appReqList;
        if (arrayList != null) {
            jceOutputStream.write((java.util.Collection) arrayList, 0);
        }
    }

    public GetAppSimpleDetailRequest(java.util.ArrayList<com.tencent.tmassistantsdk.protocol.jce.AppDetailParam> arrayList) {
        this.appReqList = arrayList;
    }
}
