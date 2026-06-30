package ec5;

/* loaded from: classes9.dex */
public class a extends co.a {

    /* renamed from: e, reason: collision with root package name */
    public final int f251195e;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, "xmlContent", l15.c.class), com.tencent.mm.protobuf.i.u(-1, com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH), com.tencent.mm.protobuf.i.u(-1, com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID)});
        this.f251195e = appendAttrs;
        super.set__serialName("previewmsg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, "", ""});
    }

    @Override // co.a
    public java.lang.Object clone() {
        return super.clone();
    }

    public java.lang.String getFilePath() {
        return super.getString(this.f251195e + 1);
    }

    public l15.c j() {
        return (l15.c) super.getCustom(this.f251195e + 0);
    }

    public void k(l15.c cVar) {
        super.set(this.f251195e + 0, cVar);
    }

    public void l(java.lang.String str) {
        super.set(this.f251195e + 1, str);
    }

    public void n(java.lang.String str) {
        super.set(this.f251195e + 2, str);
    }
}
