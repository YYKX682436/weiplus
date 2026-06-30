package q41;

/* loaded from: classes11.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k41.g0 f360034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f360035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f360036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f360037g;

    public c(k41.g0 g0Var, int i17, int i18, long j17) {
        this.f360034d = g0Var;
        this.f360035e = i17;
        this.f360036f = i18;
        this.f360037g = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
        k41.g0 g0Var = this.f360034d;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23393, g0Var.field_username, g0Var.field_nickname, g0Var.field_openImAppId, ((l41.q2) b0Var).fj(g0Var.field_openImAppId, g0Var.field_openImDescWordingId), java.lang.Integer.valueOf(this.f360035e), java.lang.Integer.valueOf(this.f360036f), 0, "", g0Var.field_finderUsername, java.lang.Long.valueOf(this.f360037g), java.lang.Integer.valueOf(g0Var.field_kefuType));
    }
}
