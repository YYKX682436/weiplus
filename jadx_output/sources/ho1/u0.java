package ho1;

/* loaded from: classes5.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.a1 f282824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f282825e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f282826f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f282827g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282828h;

    public u0(ho1.a1 a1Var, long j17, int i17, int i18, java.lang.String str) {
        this.f282824d = a1Var;
        this.f282825e = j17;
        this.f282826f = i17;
        this.f282827g = i18;
        this.f282828h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.backup.roambackup.impl.RoamBackupActivity.f92622v;
        java.lang.ref.WeakReference weakReference2 = com.tencent.mm.plugin.backup.roambackup.impl.RoamBackupActivity.f92622v;
        com.tencent.mm.plugin.backup.roambackup.impl.RoamBackupActivity roamBackupActivity = weakReference2 != null ? (com.tencent.mm.plugin.backup.roambackup.impl.RoamBackupActivity) weakReference2.get() : null;
        boolean z17 = (roamBackupActivity == null || roamBackupActivity.isFinishing() || roamBackupActivity.isDestroyed()) ? false : true;
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        if (com.tencent.matrix.lifecycle.owners.f0.f52739u && z17) {
            com.tencent.mars.xlog.Log.i(this.f282824d.f282622a, "Skip force notify, because RoamUI on foreground. pkgId=" + this.f282825e);
            return;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mars.xlog.Log.i(this.f282824d.f282622a, "[For delete] do force notify, packageId=" + this.f282825e + ", deleteType=" + this.f282826f + ", errorCode=" + this.f282827g + ", title=" + this.f282828h);
        java.lang.String string = this.f282826f == 0 ? this.f282827g == 0 ? context.getString(com.tencent.mm.R.string.f492849mw4) : context.getString(com.tencent.mm.R.string.f492848mw3) : this.f282827g == 0 ? context.getString(com.tencent.mm.R.string.mw6) : context.getString(com.tencent.mm.R.string.f492850mw5);
        kotlin.jvm.internal.o.d(string);
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        i13.q qVar = new i13.q(uuid, this.f282828h, string, java.lang.System.currentTimeMillis(), new ho1.t0(this.f282824d, this.f282825e, this.f282826f, context));
        k13.l1 l1Var = (k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi();
        l1Var.f(qVar);
        l1Var.c();
        ((ku5.t0) ku5.t0.f312615d).k(new ho1.s0(l1Var, qVar), 5000L);
    }
}
