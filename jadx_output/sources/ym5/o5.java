package ym5;

/* loaded from: classes10.dex */
public final class o5 implements ym5.g6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ym5.y5 f463456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.footer.SelectColorBar f463457b;

    public o5(ym5.y5 y5Var, com.tencent.mm.view.footer.SelectColorBar selectColorBar) {
        this.f463456a = y5Var;
        this.f463457b = selectColorBar;
    }

    @Override // ym5.g6
    public void a(int i17) {
        ym5.y5 y5Var = this.f463456a;
        java.lang.String str = y5Var.f463581x;
        y5Var.f463358u.getCurMode();
        java.util.Objects.toString(y5Var.f463358u.getTag());
        com.tencent.mm.view.footer.SelectColorBar selectColorBar = this.f463457b;
        if (i17 == 3) {
            java.lang.Object tag = y5Var.f463358u.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((java.lang.Integer) tag).intValue();
            selectColorBar.setSelectColor(intValue);
            y5Var.f463357t.setTextBackground(intValue);
        } else {
            y5Var.f463358u.setTag(java.lang.Integer.valueOf(selectColorBar.getCurColor()));
            y5Var.f463357t.setTextBackground(0);
        }
        y5Var.f463357t.setEnableStoke(i17 == 2);
    }
}
