package k02;

/* loaded from: classes8.dex */
public final class r implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f303101b;

    public r(java.lang.String str, int i17) {
        this.f303100a = str;
        this.f303101b = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        c02.h hVar;
        c02.h hVar2;
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.downloader.game.dl.protobuf.GetCloudGameRetainConfResponse");
        c02.o oVar2 = (c02.o) fVar;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("GameDetainManager", "gamelog cgiGetCloudGameRetainConf CGI return, errType = " + i17 + ", errCode = " + str);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("response.detain_config_switch  = ");
        c02.c cVar = oVar2.f37613d;
        java.lang.Integer num = null;
        sb6.append(cVar != null ? java.lang.Boolean.valueOf(cVar.f37588d) : null);
        sb6.append("   response.user_record  = ");
        java.util.LinkedList linkedList = oVar2.f37614e;
        sb6.append(linkedList);
        sb6.append("  downloaderMaxDetainTime = ");
        c02.c cVar2 = oVar2.f37613d;
        if (cVar2 != null && (hVar2 = cVar2.f37590f) != null) {
            num = java.lang.Integer.valueOf(hVar2.f37599d);
        }
        sb6.append(num);
        com.tencent.mars.xlog.Log.i("GameDetainManager", sb6.toString());
        c02.c cVar3 = oVar2.f37613d;
        if (cVar3 == null || !cVar3.f37588d || (hVar = cVar3.f37590f) == null) {
            return;
        }
        if (hVar.f37599d > (linkedList != null ? linkedList.size() : 0)) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            int i19 = this.f303101b == 0 ? 2 : 3;
            java.lang.String appId = this.f303100a;
            kotlin.jvm.internal.o.g(appId, "appId");
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            c02.l lVar2 = new c02.l();
            lVar2.f37605d = appId;
            lVar.f70664a = lVar2;
            lVar.f70665b = new c02.m();
            lVar.f70666c = "/cgi-bin/mmgame-bin/getcloudgamedownloadinfo";
            lVar.f70667d = 4786;
            com.tencent.mm.ipcinvoker.wx_extension.h0.a(lVar.a(), new k02.q(null, context, null, appId, i19));
        }
    }
}
