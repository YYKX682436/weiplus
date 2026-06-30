package vz4;

/* loaded from: classes8.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f441713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f441714e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441715f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441716g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vz4.j f441717h;

    public a0(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.c0 c0Var, java.lang.String str, java.lang.String str2, vz4.j jVar) {
        this.f441713d = h0Var;
        this.f441714e = c0Var;
        this.f441715f = str;
        this.f441716g = str2;
        this.f441717h = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.wepkg.event.h.b((com.tencent.mm.plugin.wepkg.event.c) this.f441713d.f310123d);
        vz4.d0 d0Var = vz4.d0.f441729a;
        java.lang.Object obj = vz4.d0.f441730b;
        kotlin.jvm.internal.c0 c0Var = this.f441714e;
        java.lang.String str = this.f441715f;
        java.lang.String str2 = this.f441716g;
        vz4.j jVar = this.f441717h;
        synchronized (obj) {
            if (!c0Var.f310112d) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WePkgUpdateManager", "gamelog.webpkg, fetchLastLitePkg ,download time out pkgId = " + str + " appId = " + str2);
                c0Var.f310112d = true;
                jVar.a("download time out");
            }
        }
    }
}
