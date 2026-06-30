package xt2;

/* loaded from: classes3.dex */
public final class m2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f456888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.z64 f456889e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f456890f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(xt2.e3 e3Var, r45.z64 z64Var, cm2.m0 m0Var) {
        super(0);
        this.f456888d = e3Var;
        this.f456889e = z64Var;
        this.f456890f = m0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView subsidyOverlay;
        com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView subsidyOverlay2;
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        xt2.e3 e3Var = this.f456888d;
        subsidyOverlay = e3Var.getSubsidyOverlay();
        subsidyOverlay.getLocationInWindow(iArr);
        android.widget.LinearLayout linearLayout = e3Var.f456723z;
        linearLayout.getLocationInWindow(iArr2);
        float f17 = iArr2[0] - iArr[0];
        float height = (iArr2[1] - iArr[1]) + (linearLayout.getHeight() / 2.0f);
        float height2 = linearLayout.getHeight();
        float f18 = height2 < 1.0f ? 1.0f : height2;
        com.tencent.mars.xlog.Log.i(e3Var.f456706h, "subsidy shrink target leftX=" + f17 + ", centerY=" + height + ", h=" + f18);
        subsidyOverlay2 = e3Var.getSubsidyOverlay();
        r45.z64 z64Var = this.f456889e;
        cm2.m0 m0Var = this.f456890f;
        java.util.LinkedList list = m0Var.f43368v.getList(2);
        subsidyOverlay2.e(z64Var, list != null ? (java.lang.String) kz5.n0.Z(list) : null, f17, height, f18, new xt2.i2(e3Var), new xt2.j2(e3Var), new xt2.k2(e3Var, m0Var), new xt2.l2(e3Var, m0Var));
        return jz5.f0.f302826a;
    }
}
