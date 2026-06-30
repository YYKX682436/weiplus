package dk5;

/* loaded from: classes9.dex */
public final class q6 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk5.e6 f234830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXMediaMessage f234831b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234832c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.m f234833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f234834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f234835f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f234836g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dk5.f6 f234837h;

    public q6(dk5.e6 e6Var, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.lang.String str, com.tencent.mm.pluginsdk.model.app.m mVar, java.util.LinkedList linkedList, boolean z17, boolean z18, dk5.f6 f6Var) {
        this.f234830a = e6Var;
        this.f234831b = wXMediaMessage;
        this.f234832c = str;
        this.f234833d = mVar;
        this.f234834e = linkedList;
        this.f234835f = z17;
        this.f234836g = z18;
        this.f234837h = f6Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelmulti.WxaInfo wxaInfo;
        k91.v5 v5Var = (k91.v5) obj;
        if (v5Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SendWXMediaMessageHelper", "sendImgMsg, get wxaAttributes for appbrand info failed");
            dk5.e6 e6Var = this.f234830a;
            if (e6Var != null) {
                dk5.e6.a(e6Var, 5, null, 2, null);
            }
        } else {
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject mediaObject = this.f234831b.mediaObject;
            kotlin.jvm.internal.o.f(mediaObject, "mediaObject");
            if (mediaObject instanceof com.tencent.mm.opensdk.modelmsg.WXImageObject) {
                com.tencent.mm.opensdk.modelmsg.WXImageObject wXImageObject = (com.tencent.mm.opensdk.modelmsg.WXImageObject) mediaObject;
                java.lang.String entranceMiniProgramUsername = wXImageObject.entranceMiniProgramUsername;
                if (entranceMiniProgramUsername != null) {
                    kotlin.jvm.internal.o.f(entranceMiniProgramUsername, "entranceMiniProgramUsername");
                    if (entranceMiniProgramUsername.length() > 0) {
                        java.lang.String field_appId = v5Var.field_appId;
                        kotlin.jvm.internal.o.f(field_appId, "field_appId");
                        java.lang.String str = v5Var.field_nickname;
                        java.lang.String str2 = str == null ? "" : str;
                        java.lang.String str3 = v5Var.field_smallHeadURL;
                        java.lang.String str4 = str3 == null ? "" : str3;
                        java.lang.String str5 = wXImageObject.entranceMiniProgramPath;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("1:");
                        sb6.append(gm0.j1.b().k());
                        sb6.append(':');
                        sb6.append(com.tencent.mm.sdk.platformtools.w2.a(com.tencent.mm.vfs.w6.q(wXImageObject.imagePath) + java.lang.System.currentTimeMillis() + gm0.j1.b().h()));
                        wxaInfo = new com.tencent.mm.modelmulti.WxaInfo(field_appId, str2, str4, str5, sb6.toString(), 1, 0);
                        com.tencent.mars.xlog.Log.i("MicroMsg.SendWXMediaMessageHelper", "sendImgMsg, get wxaAttributes success, username:" + this.f234832c + " wxaInfo:" + wxaInfo);
                        dk5.y6.f235010a.k(this.f234833d, this.f234831b, this.f234834e, this.f234835f, this.f234836g, this.f234830a, this.f234837h, wxaInfo);
                    }
                }
            }
            wxaInfo = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.SendWXMediaMessageHelper", "sendImgMsg, get wxaAttributes success, username:" + this.f234832c + " wxaInfo:" + wxaInfo);
            dk5.y6.f235010a.k(this.f234833d, this.f234831b, this.f234834e, this.f234835f, this.f234836g, this.f234830a, this.f234837h, wxaInfo);
        }
        return null;
    }
}
