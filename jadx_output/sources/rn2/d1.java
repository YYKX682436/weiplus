package rn2;

/* loaded from: classes8.dex */
public final class d1 implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.f1 f397689d;

    public d1(rn2.f1 f1Var) {
        this.f397689d = f1Var;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public final void w2(int i17, boolean z17) {
        rn2.f1 f1Var = this.f397689d;
        com.tencent.mars.xlog.Log.i(f1Var.f397729d, "onKeyboardHeightChanged, height:" + i17 + ", isResized:" + z17);
        boolean z18 = i17 > 0;
        if (f1Var.f397733h == z18) {
            return;
        }
        f1Var.f397733h = z18;
        rn2.g gVar = f1Var.f397731f;
        if (gVar != null) {
            rn2.t2 t2Var = (rn2.t2) gVar;
            android.view.View view = t2Var.H;
            android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
            int dimensionPixelOffset = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479731dn);
            if (layoutParams2 != null) {
                if (z18) {
                    int i18 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
                    android.view.View view2 = t2Var.H;
                    int height = view2 != null ? view2.getHeight() : 0;
                    int[] iArr = new int[2];
                    android.view.View view3 = t2Var.f397865q;
                    if (view3 != null) {
                        view3.getLocationOnScreen(iArr);
                    }
                    int i19 = iArr[1];
                    android.view.View view4 = t2Var.f397865q;
                    int height2 = view4 != null ? view4.getHeight() : 0;
                    int i27 = ((i18 - dimensionPixelOffset) - height) - (i19 + height2);
                    com.tencent.mars.xlog.Log.i("FinderLiveLotteryCreateViewCallback", "adjustConfirmBtnLayout screenHeight:" + i18 + ", bottomSpaceHeight:" + dimensionPixelOffset + ", confirmBtnContainerH:" + height + ",descContainerY:" + i19 + ",itemHeight:" + height2 + ",leftHeight:" + i27 + ",height:" + i17);
                    if (height == 0 || i19 == 0 || i27 <= i17) {
                        android.view.View view5 = t2Var.f397862p;
                        if (view5 != null) {
                            int id6 = view5.getId();
                            layoutParams2.removeRule(2);
                            layoutParams2.removeRule(12);
                            layoutParams2.addRule(3, id6);
                            layoutParams2.bottomMargin = 0;
                        }
                    } else {
                        layoutParams2.removeRule(2);
                        layoutParams2.removeRule(3);
                        layoutParams2.addRule(12);
                        layoutParams2.bottomMargin = i17;
                    }
                } else {
                    layoutParams2.removeRule(2);
                    layoutParams2.removeRule(3);
                    layoutParams2.addRule(12);
                    layoutParams2.bottomMargin = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479732dp);
                }
                android.view.View view6 = t2Var.H;
                android.view.ViewParent parent = view6 != null ? view6.getParent() : null;
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.updateViewLayout(t2Var.H, layoutParams2);
                }
            }
        }
    }
}
