package ym5;

/* loaded from: classes10.dex */
public final class h6 implements ym5.g6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.footer.SelectColorBar f463378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ym5.n6 f463379b;

    public h6(com.tencent.mm.view.footer.SelectColorBar selectColorBar, ym5.n6 n6Var) {
        this.f463378a = selectColorBar;
        this.f463379b = n6Var;
    }

    @Override // ym5.g6
    public void a(int i17) {
        com.tencent.mm.view.footer.SelectColorBar selectColorBar = this.f463378a;
        ym5.n6 n6Var = this.f463379b;
        if (i17 == 3) {
            java.lang.Object tag = n6Var.f463358u.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
            selectColorBar.setSelectColor(((java.lang.Integer) tag).intValue());
            com.tencent.mm.view.PhotoEditText photoEditText = n6Var.f463357t;
            java.lang.Object tag2 = n6Var.f463358u.getTag();
            kotlin.jvm.internal.o.e(tag2, "null cannot be cast to non-null type kotlin.Int");
            photoEditText.setTextBackground(((java.lang.Integer) tag2).intValue());
        } else {
            n6Var.f463358u.setTag(java.lang.Integer.valueOf(selectColorBar.getCurColor()));
            n6Var.f463357t.setTextBackground(0);
        }
        n6Var.f463357t.setEnableStoke(i17 == 2);
    }
}
