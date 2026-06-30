package vz4;

/* loaded from: classes8.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f441773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441775f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vz4.j f441776g;

    public y(kotlin.jvm.internal.c0 c0Var, java.lang.String str, java.lang.String str2, vz4.j jVar) {
        this.f441773d = c0Var;
        this.f441774e = str;
        this.f441775f = str2;
        this.f441776g = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vz4.d0 d0Var = vz4.d0.f441729a;
        java.lang.Object obj = vz4.d0.f441730b;
        kotlin.jvm.internal.c0 c0Var = this.f441773d;
        java.lang.String str = this.f441774e;
        java.lang.String str2 = this.f441775f;
        vz4.j jVar = this.f441776g;
        synchronized (obj) {
            if (!c0Var.f310112d) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WePkgUpdateManager", "gamelog.webpkg, fetchLastLitePkg ,check time out pkgId = " + str + " appId = " + str2);
                c0Var.f310112d = true;
                jVar.a("check time out");
            }
        }
    }
}
