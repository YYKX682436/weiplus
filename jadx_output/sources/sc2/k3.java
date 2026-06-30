package sc2;

/* loaded from: classes2.dex */
public final class k3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.m3 f406013e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f406014f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.RoundCornerLinearLayout f406015g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(in5.s0 s0Var, sc2.m3 m3Var, xc2.p0 p0Var, com.tencent.mm.ui.widget.RoundCornerLinearLayout roundCornerLinearLayout) {
        super(1);
        this.f406012d = s0Var;
        this.f406013e = m3Var;
        this.f406014f = p0Var;
        this.f406015g = roundCornerLinearLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        float dimensionPixelSize = this.f406012d.f293121e.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        this.f406013e.getClass();
        xc2.p0 p0Var = this.f406014f;
        boolean z17 = p0Var != null && p0Var.f453256r == 2;
        com.tencent.mm.ui.widget.RoundCornerLinearLayout roundCornerLinearLayout = this.f406015g;
        if (z17) {
            roundCornerLinearLayout.c(dimensionPixelSize, 0.0f, dimensionPixelSize, 0.0f);
        } else {
            roundCornerLinearLayout.setRadius(dimensionPixelSize);
        }
        roundCornerLinearLayout.setBackgroundColor(intValue);
        return jz5.f0.f302826a;
    }
}
