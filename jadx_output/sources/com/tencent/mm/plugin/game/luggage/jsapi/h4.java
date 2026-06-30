package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public final class h4 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.j4 f139661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f139662b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139663c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139664d;

    public h4(com.tencent.mm.plugin.game.luggage.jsapi.j4 j4Var, android.content.Context context, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var, java.lang.String str) {
        this.f139661a = j4Var;
        this.f139662b = context;
        this.f139663c = q5Var;
        this.f139664d = str;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        this.f139661a.getClass();
        com.tencent.mars.xlog.Log.i("saveMiniGameVideoToAlbum", "gamelog.jsapi, web , saveMiniGameVideoToAlbum, success, destPath = ".concat(destPath));
        java.lang.Object[] objArr = {q75.c.c(destPath)};
        android.content.Context context = this.f139662b;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.k7b, objArr), 1).show();
        q75.c.f(destPath, context);
        this.f139663c.a(null, null);
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        this.f139661a.getClass();
        com.tencent.mars.xlog.Log.e("saveMiniGameVideoToAlbum", "gamelog.jsapi, web , saveMiniGameVideoToAlbum, error videoId = " + this.f139664d + ", srcPath = " + srcPath);
        this.f139663c.a("onExportFail", null);
    }
}
