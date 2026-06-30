package zx2;

/* loaded from: classes2.dex */
public final class a implements zx2.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f477028a;

    /* renamed from: b, reason: collision with root package name */
    public final int f477029b;

    public a(boolean z17, int i17, int i18, kotlin.jvm.internal.i iVar) {
        z17 = (i18 & 1) != 0 ? true : z17;
        i17 = (i18 & 2) != 0 ? 0 : i17;
        this.f477028a = z17;
        this.f477029b = i17;
    }

    @Override // zx2.b0
    public void a(com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout) {
        int i17;
        int i18;
        if (finderTabLayout != null) {
            int childCount = finderTabLayout.f133103g.getChildCount();
            boolean z17 = true;
            if (childCount < 2 || childCount % 2 != 0 || !this.f477028a) {
                com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
                java.lang.System.nanoTime();
                if (!com.tencent.mm.ui.bk.y() && !com.tencent.mm.ui.bk.Q() && !com.tencent.mm.ui.bk.A()) {
                    z17 = false;
                }
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                int i19 = a17.f197135a;
                if (!z17 && i19 > (i17 = a17.f197136b)) {
                    i19 = i17;
                }
                int[] iArr = {0, 0};
                finderTabLayout.getLocationOnScreen(iArr);
                c(finderTabLayout, ((i19 / 2) - (iArr[0] + (finderTabLayout.getWidth() / 2))) + this.f477029b);
                return;
            }
            int i27 = childCount / 2;
            zx2.c b17 = b(finderTabLayout, i27 - 1);
            zx2.c b18 = b(finderTabLayout, i27);
            android.view.View m17 = b17 != null ? b17.m() : null;
            android.view.View o17 = b18 != null ? b18.o() : null;
            if (m17 == null || o17 == null) {
                return;
            }
            int[] iArr2 = {0, 0};
            m17.getLocationOnScreen(iArr2);
            int[] iArr3 = {0, 0};
            o17.getLocationOnScreen(iArr3);
            int width = ((iArr2[0] + m17.getWidth()) + iArr3[0]) / 2;
            com.tencent.mm.ui.ah a18 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
            java.lang.System.nanoTime();
            boolean z18 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            int i28 = a18.f197135a;
            if (!z18 && i28 > (i18 = a18.f197136b)) {
                i28 = i18;
            }
            c(finderTabLayout, (i28 / 2) - width);
        }
    }

    public final zx2.c b(com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout, int i17) {
        android.view.View view;
        android.view.View childAt = finderTabLayout.f133103g.getChildAt(i17);
        zx2.w wVar = childAt instanceof zx2.w ? (zx2.w) childAt : null;
        java.lang.Object tag = (wVar == null || (view = wVar.f477096g) == null) ? null : view.getTag();
        if (tag instanceof zx2.c) {
            return (zx2.c) tag;
        }
        return null;
    }

    public final void c(com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout, int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = finderTabLayout.getLayoutParams();
        jz5.f0 f0Var = null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            com.tencent.mars.xlog.Log.i("Finder.CenterAlignStrategy", "marginStart: " + marginLayoutParams.getMarginStart() + " delta:" + i17 + ' ');
            marginLayoutParams.setMarginStart(marginLayoutParams.getMarginStart() + i17);
            finderTabLayout.setLayoutParams(marginLayoutParams);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("Finder.CenterAlignStrategy", "tabLayoutParams null!");
        }
    }
}
