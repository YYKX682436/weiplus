package zx2;

/* loaded from: classes2.dex */
public final class b implements zx2.b0 {
    public b(int i17) {
    }

    @Override // zx2.b0
    public void a(com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout) {
        android.view.View l17;
        int i17;
        android.view.View view;
        if (finderTabLayout != null) {
            zx2.t tVar = finderTabLayout.f133103g;
            boolean z17 = true;
            if (tVar.getChildCount() > 1) {
                android.view.View childAt = tVar.getChildAt(1);
                jz5.f0 f0Var = null;
                zx2.w wVar = childAt instanceof zx2.w ? (zx2.w) childAt : null;
                java.lang.Object tag = (wVar == null || (view = wVar.f477096g) == null) ? null : view.getTag();
                zx2.c cVar = tag instanceof zx2.c ? (zx2.c) tag : null;
                if (cVar == null || (l17 = cVar.l()) == null) {
                    return;
                }
                com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
                java.lang.System.nanoTime();
                if (!com.tencent.mm.ui.bk.y() && !com.tencent.mm.ui.bk.Q() && !com.tencent.mm.ui.bk.A()) {
                    z17 = false;
                }
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                int i18 = a17.f197135a;
                if (!z17 && i18 > (i17 = a17.f197136b)) {
                    i18 = i17;
                }
                int[] iArr = {0, 0};
                l17.getLocationOnScreen(iArr);
                int width = (i18 / 2) - (iArr[0] + (l17.getWidth() / 2));
                android.view.ViewGroup.LayoutParams layoutParams = finderTabLayout.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    com.tencent.mars.xlog.Log.i("Finder.CenterAlignStrategy", "marginStart: " + marginLayoutParams.getMarginStart() + " delta:" + width + ' ');
                    marginLayoutParams.setMarginStart(marginLayoutParams.getMarginStart() + width);
                    finderTabLayout.setLayoutParams(marginLayoutParams);
                    f0Var = jz5.f0.f302826a;
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.w("Finder.CenterAlignStrategy", "tabLayoutParams null!");
                }
            }
        }
    }
}
