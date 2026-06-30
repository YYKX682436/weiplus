package im2;

/* loaded from: classes.dex */
public final class n3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292455d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(im2.z3 z3Var) {
        super(1);
        this.f292455d = z3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        im2.z3 z3Var = this.f292455d;
        com.tencent.mars.xlog.Log.i(z3Var.f292635d, "#showChargeSheet choose wecoin:" + intValue);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ((jz5.n) z3Var.L).getValue();
        kotlin.jvm.internal.o.f(relativeLayout, "access$getPreSaleValueLayout(...)");
        relativeLayout.postDelayed(new im2.k0(z3Var, relativeLayout), 50L);
        z3Var.f292667x1 = intValue;
        ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) z3Var.K).getValue()).setVisibility(z3Var.f292667x1 > 0 ? 0 : 8);
        ((android.widget.TextView) ((jz5.n) z3Var.M).getValue()).setText(java.lang.String.valueOf(z3Var.f292667x1));
        return jz5.f0.f302826a;
    }
}
