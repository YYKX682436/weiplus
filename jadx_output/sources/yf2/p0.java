package yf2;

/* loaded from: classes10.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.s0 f461765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf2.j2 f461766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f461767f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(yf2.s0 s0Var, yf2.j2 j2Var, yz5.a aVar) {
        super(0);
        this.f461765d = s0Var;
        this.f461766e = j2Var;
        this.f461767f = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yf2.j2 j2Var = this.f461766e;
        yf2.s0 s0Var = this.f461765d;
        s0Var.e7(3, j2Var);
        com.tencent.mars.xlog.Log.i("FinderStartLivePostLicenseWidget", "handleLicenseConfirmed");
        s0Var.f7(1);
        com.tencent.mars.xlog.Log.i("FinderStartLivePostLicenseWidget", "reportLicenseConfirmed");
        r45.q12 q12Var = (r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) s0Var.business(mm2.g1.class)).f329068f).getValue();
        if (q12Var != null ? zl2.r4.f473950a.T1(q12Var) : false) {
            com.tencent.mars.xlog.Log.i("FinderStartLivePostLicenseWidget", "reportGameLiveLicenseConfirmed");
        } else {
            com.tencent.mars.xlog.Log.i("FinderStartLivePostLicenseWidget", "reportNormalLiveLicenseConfirmed");
        }
        yz5.a aVar = this.f461767f;
        if (aVar != null) {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}
