package l53;

/* loaded from: classes8.dex */
public final class d implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l53.i f316641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316642b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f316643c;

    public d(l53.i iVar, java.lang.String str, android.content.Context context) {
        this.f316641a = iVar;
        this.f316642b = str;
        this.f316643c = context;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar;
        l53.a aVar;
        l53.i iVar = this.f316641a;
        if (i17 != 0 || i18 != 0 || (fVar = oVar.f70711b.f70700a) == null) {
            com.tencent.mars.xlog.Log.e("MiniGameVideoShareProcessor", "gamelog.share , share video , upload, doShareCgi failed errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + "  filePath = " + iVar.f316660a.f323305c);
            l53.a aVar2 = iVar.f316662c;
            if (aVar2 != null) {
                aVar2.a("doShareCgi error");
                return;
            }
            return;
        }
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.videougc.AddWxagVideoResponse");
        q33.b bVar = (q33.b) fVar;
        java.lang.String str2 = bVar.f359937g;
        if (str2 == null || str2.length() == 0) {
            com.tencent.mars.xlog.Log.e("MiniGameVideoShareProcessor", "gamelog.share , share video , upload, doShareCgi failed share_url is null");
            l53.a aVar3 = iVar.f316662c;
            if (aVar3 != null) {
                aVar3.a("share_url is null");
                return;
            }
            return;
        }
        java.lang.String str3 = bVar.f359937g;
        if (str3 == null) {
            str3 = "";
        }
        m33.k1 videoFile = iVar.f316660a;
        kotlin.jvm.internal.o.g(videoFile, "videoFile");
        java.lang.String shareThumbUrl = this.f316642b;
        kotlin.jvm.internal.o.g(shareThumbUrl, "shareThumbUrl");
        if (l53.c.f316640a == null) {
            l53.c.f316640a = new java.util.HashMap();
        }
        l53.b bVar2 = new l53.b(videoFile, str3, shareThumbUrl);
        java.util.HashMap hashMap = l53.c.f316640a;
        if (hashMap != null) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(videoFile.f323305c);
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        }
        int i19 = iVar.f316661b;
        android.content.Context context = this.f316643c;
        if (i19 == 1) {
            iVar.c(context, str3, shareThumbUrl);
            return;
        }
        if (i19 == 2) {
            iVar.d(context, str3, shareThumbUrl);
        } else if (i19 == 3 && (aVar = iVar.f316662c) != null) {
            aVar.b(str3, shareThumbUrl);
        }
    }
}
