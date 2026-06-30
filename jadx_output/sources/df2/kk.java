package df2;

/* loaded from: classes3.dex */
public final class kk implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pk f230585d;

    public kk(df2.pk pkVar) {
        this.f230585d = pkVar;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public final void w2(int i17, boolean z17) {
        df2.pk pkVar = this.f230585d;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = pkVar.f231074n;
        java.lang.Boolean valueOf = z2Var != null ? java.lang.Boolean.valueOf(z2Var.h()) : null;
        com.tencent.mars.xlog.Log.i(pkVar.f231073m, "onKeyboardHeightChanged, height:" + i17 + ", isResized:" + z17 + ",dialog is showing:" + valueOf);
        if (i17 > 0) {
            com.tencent.mm.ui.widget.dialog.z2 z2Var2 = pkVar.f231074n;
            if (z2Var2 == null || !z2Var2.h()) {
                return;
            }
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, i17);
            ofInt.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            ofInt.addUpdateListener(new df2.sj(pkVar, z2Var2));
            ofInt.addListener(new df2.tj(z2Var2));
            ofInt.setDuration(200L);
            ofInt.start();
            return;
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var3 = pkVar.f231074n;
        if (z2Var3 == null || !z2Var3.h()) {
            return;
        }
        android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(z2Var3.f212058g.getPaddingBottom(), 0);
        ofInt2.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofInt2.addUpdateListener(new df2.qj(z2Var3));
        ofInt2.addListener(new df2.rj(z2Var3));
        ofInt2.setDuration(200L);
        ofInt2.start();
    }
}
