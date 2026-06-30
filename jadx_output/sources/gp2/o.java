package gp2;

/* loaded from: classes3.dex */
public final class o implements ne2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f274283a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f274284b;

    public o(gp2.l0 l0Var, long j17) {
        this.f274283a = l0Var;
        this.f274284b = j17;
    }

    @Override // ne2.d
    public void a(r45.q84 info) {
        kotlin.jvm.internal.o.g(info, "info");
        gp2.l0 l0Var = this.f274283a;
        com.tencent.mars.xlog.Log.i(l0Var.t(), "checkAutoPlayByOutside: liveId=" + this.f274284b + " charge_live liveFreeTimeManager callback freeTomeToWatch=" + info.getInteger(1));
        if (info.getInteger(1) <= 0) {
            c50.m0.b(l0Var, null, 1, null);
        }
    }
}
