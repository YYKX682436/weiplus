package l53;

/* loaded from: classes8.dex */
public final class e implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l53.i f316644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragmentActivity f316645b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316646c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316648e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f316649f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316650g;

    public e(l53.i iVar, com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.HashMap hashMap, java.lang.String str4) {
        this.f316644a = iVar;
        this.f316645b = mMFragmentActivity;
        this.f316646c = str;
        this.f316647d = str2;
        this.f316648e = str3;
        this.f316649f = hashMap;
        this.f316650g = str4;
    }

    @Override // k70.u
    public final void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        java.lang.String str = this.f316648e;
        kotlin.jvm.internal.o.d(str);
        l53.i iVar = this.f316644a;
        iVar.getClass();
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage();
        com.tencent.mm.opensdk.modelmsg.WXWebpageObject wXWebpageObject = new com.tencent.mm.opensdk.modelmsg.WXWebpageObject();
        java.lang.String str2 = this.f316646c;
        wXWebpageObject.webpageUrl = str2;
        wXMediaMessage.mediaObject = wXWebpageObject;
        java.util.HashMap hashMap = this.f316649f;
        java.lang.String str3 = (java.lang.String) hashMap.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (str3 == null) {
            str3 = "";
        }
        wXMediaMessage.title = str3;
        wXMediaMessage.description = (java.lang.String) hashMap.get("desc");
        android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(this.f316647d);
        if (Bi != null && !Bi.isRecycled()) {
            com.tencent.mars.xlog.Log.i("MiniGameVideoShareProcessor", "gamelog.share , share video ,thumb image is not null");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            Bi.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            wXMediaMessage.thumbData = byteArrayOutputStream.toByteArray();
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str4 = iVar.f316660a.f323303a;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str4);
        com.tencent.mm.autogen.events.SendAppMsgEvent sendAppMsgEvent = new com.tencent.mm.autogen.events.SendAppMsgEvent();
        am.jt jtVar = sendAppMsgEvent.f54749g;
        jtVar.f7080a = wXMediaMessage;
        jtVar.f7081b = "wx62d9035fd4fd2059";
        jtVar.f7082c = h17 != null ? h17.field_appName : "";
        jtVar.f7083d = str;
        jtVar.f7084e = 2;
        jtVar.f7087h = null;
        jtVar.f7088i = str2;
        jtVar.f7089j = str2;
        sendAppMsgEvent.e();
        java.lang.String str5 = this.f316650g;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent = new com.tencent.mm.autogen.events.SendMsgEvent();
            am.mt mtVar = sendMsgEvent.f54752g;
            mtVar.f7362a = str;
            mtVar.f7363b = str5;
            mtVar.f7364c = c01.e2.C(str);
            mtVar.f7365d = 0;
            sendMsgEvent.e();
        }
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f316645b;
        db5.e1.T(mMFragmentActivity, mMFragmentActivity.getResources().getString(com.tencent.mm.R.string.f490560yi));
        l53.a aVar = iVar.f316662c;
        if (aVar != null) {
            aVar.onSuccess();
        }
        com.tencent.mars.xlog.Log.i("MiniGameVideoShareProcessor", "gamelog.share , share video ,shareToFriend success");
    }
}
