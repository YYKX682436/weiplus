package com.tencent.mm.plugin.game;

/* loaded from: classes8.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f141976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f141977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f141978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f141979g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f141980h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f141981i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m33.h1 f141982m;

    public y0(com.tencent.mm.plugin.game.p0 p0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.Context context, java.lang.String str4, java.lang.String str5, m33.h1 h1Var) {
        this.f141976d = str;
        this.f141977e = str2;
        this.f141978f = str3;
        this.f141979g = context;
        this.f141980h = str4;
        this.f141981i = str5;
        this.f141982m = h1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r33.f fVar = new r33.f(this.f141976d, this.f141977e, this.f141978f);
        android.content.Context context = this.f141979g;
        java.lang.String str = this.f141980h;
        m33.h1 h1Var = this.f141982m;
        if (str == null || str.length() == 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("error", "appId is invalid");
            h1Var.b(hashMap);
            return;
        }
        java.lang.String str2 = fVar.f368977a;
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetLaunchGameInfo", "reportStartAction appId = %s, gameAppId = %s", str2, str);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("pubappid", str2);
        com.tencent.mm.game.report.l.f(context, 103, 10301, 1, 41002, str, 0, com.tencent.mm.game.report.l.b(hashMap2));
        fVar.f368980d = this.f141981i;
        m53.h2 h2Var = new m53.h2();
        h2Var.f323747d = str;
        h2Var.f323748e = str2;
        h2Var.f323749f = fVar.f368978b;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = h2Var;
        lVar.f70665b = new m53.i2();
        lVar.f70666c = "/cgi-bin/mmgame-bin/getlaunchgameinfo";
        lVar.f70667d = 5060;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(a17, new r33.b(fVar, h1Var, context));
    }
}
