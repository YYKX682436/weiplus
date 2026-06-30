package ns4;

/* loaded from: classes3.dex */
public final class g0 implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.p0 f339528d;

    public g0(ns4.p0 p0Var) {
        this.f339528d = p0Var;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public final void w2(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("WeCoinCustomAmountInputDialog", "KeyboardHeightObserver " + i17 + ' ' + z17);
        ns4.p0 p0Var = this.f339528d;
        if (i17 > 0) {
            com.tencent.mm.ui.widget.dialog.z2 z2Var = p0Var.f339610c;
            if (z2Var.h()) {
                android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, i17);
                ofInt.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                ofInt.addUpdateListener(new ns4.j0(p0Var, z2Var));
                ofInt.addListener(new ns4.k0(z2Var));
                ofInt.setDuration(200L);
                ofInt.start();
                return;
            }
            return;
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var2 = p0Var.f339610c;
        if (z2Var2.h()) {
            android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(z2Var2.f212058g.getPaddingBottom(), 0);
            ofInt2.setInterpolator(new android.view.animation.DecelerateInterpolator());
            ofInt2.addUpdateListener(new ns4.h0(z2Var2));
            ofInt2.addListener(new ns4.i0(z2Var2));
            ofInt2.setDuration(200L);
            ofInt2.start();
        }
    }
}
