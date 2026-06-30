package cp2;

/* loaded from: classes2.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp2.v0 f220911d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(cp2.v0 v0Var) {
        super(0);
        this.f220911d = v0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cp2.v0 v0Var = this.f220911d;
        if (v0Var.f220931h == 0 && nq2.d.f338980a.e()) {
            com.tencent.mars.xlog.Log.i("Finder.NearbyLivePresenter", "requestRefreshForPermission first enter asyncRequestLbs");
            pm0.v.L("LbsPresenter_requestLbs", true, cp2.p0.f220877d);
            v0Var.Q();
        } else if (!v0Var.f220946z) {
            v0Var.f220946z = true;
            pm0.v.L("LbsPresenter_requestLbs", true, new cp2.r0(v0Var));
        }
        return jz5.f0.f302826a;
    }
}
