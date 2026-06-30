package ho1;

/* loaded from: classes5.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f282853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po1.d f282854e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f282855f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f282856g;

    public y(android.net.Uri uri, po1.d dVar, com.tencent.mm.ui.widget.dialog.u3 u3Var, yz5.l lVar) {
        this.f282853d = uri;
        this.f282854e = dVar;
        this.f282855f = u3Var;
        this.f282856g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        po1.d dVar = this.f282854e;
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        try {
            boolean f17 = to1.g.f420911a.f(this.f282853d, dVar);
            c0Var.f310112d = f17;
            if (f17) {
                oo1.o.f347151a.a(dVar.f357295a);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RoamBackup.FlutterBackupPlugin", th6, "", new java.lang.Object[0]);
        }
        pm0.v.X(new ho1.x(this.f282855f, c0Var, this.f282856g, dVar));
    }
}
