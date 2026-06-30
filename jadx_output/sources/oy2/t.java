package oy2;

/* loaded from: classes8.dex */
public final class t implements al5.o2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oy2.a0 f350002d;

    public t(oy2.a0 a0Var) {
        this.f350002d = a0Var;
    }

    @Override // al5.o2
    public final void F3(int i17, int i18, int i19, int i27) {
        boolean z17 = i18 == 0;
        oy2.a0 a0Var = this.f350002d;
        a0Var.getClass();
        com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout scrollFrameLayout = a0Var.f349947l;
        com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout expandableScrollFrameLayout = scrollFrameLayout instanceof com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout ? (com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout) scrollFrameLayout : null;
        if (expandableScrollFrameLayout == null) {
            return;
        }
        expandableScrollFrameLayout.setContentAtTop(z17);
    }
}
