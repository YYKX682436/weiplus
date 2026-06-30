package wo1;

/* loaded from: classes5.dex */
public final class h1 implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wo1.i1 f447945a;

    public h1(wo1.i1 i1Var) {
        this.f447945a = i1Var;
    }

    @Override // n3.k0
    public final n3.g3 a(android.view.View view, n3.g3 insets) {
        kotlin.jvm.internal.o.g(view, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(insets, "insets");
        int i17 = insets.a(8).f247047d;
        wo1.i1 i1Var = this.f447945a;
        int paddingBottom = i1Var.f447953o.getPaddingBottom();
        com.tencent.mars.xlog.Log.i("FluentBottomSheet", "imeBottom=" + i17 + ", paddingBottom=" + paddingBottom);
        if (i17 == paddingBottom) {
            return insets;
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(paddingBottom, i17);
        ofInt.addUpdateListener(new wo1.g1(i1Var));
        ofInt.setDuration(200L);
        ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
        ofInt.start();
        return insets;
    }
}
