package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class v50 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ep0 f114665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r60 f114666e;

    public v50(com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var, com.tencent.mm.plugin.finder.live.plugin.r60 r60Var) {
        this.f114665d = ep0Var;
        this.f114666e = r60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var = this.f114665d;
        android.view.View findViewById = ep0Var.getView().findViewById(ep0Var.p0());
        android.view.View findViewById2 = ep0Var.getView().findViewById(ep0Var.e0());
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = this.f114666e;
        int h17 = (r60Var.A.x / 2) - i65.a.h(r60Var.f365323d.getContext(), com.tencent.mm.R.dimen.f479666c3);
        int h18 = i65.a.h(r60Var.f365323d.getContext(), com.tencent.mm.R.dimen.ajz);
        if (h18 <= h17) {
            h17 = h18;
        }
        if (findViewById == null || findViewById2 == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        android.view.ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.width = h17;
        }
        int h19 = i65.a.h(r60Var.f365323d.getContext(), com.tencent.mm.R.dimen.f479672c9);
        android.view.ViewGroup viewGroup = r60Var.f365323d;
        int h27 = i65.a.h(viewGroup.getContext(), com.tencent.mm.R.dimen.f479649bo);
        int h28 = i65.a.h(viewGroup.getContext(), com.tencent.mm.R.dimen.f479727dj);
        if (marginLayoutParams2 != null) {
            if (marginLayoutParams2 instanceof android.widget.LinearLayout.LayoutParams) {
                marginLayoutParams2.setMargins(h19, marginLayoutParams2.topMargin, 0, 0);
            } else {
                marginLayoutParams2.setMargins(0, marginLayoutParams2.topMargin, h28, 0);
            }
            findViewById2.setLayoutParams(marginLayoutParams2);
            findViewById2.invalidate();
        }
        int i17 = ((je2.h) r60Var.P0(je2.h.class)).f299234g;
        if (i17 > 0) {
            h27 = i17 + com.tencent.mm.ui.zk.a(findViewById.getContext(), 28) + com.tencent.mm.ui.zk.a(findViewById.getContext(), 4);
        }
        if (marginLayoutParams != null) {
            int width = (viewGroup.getWidth() - h17) - h27;
            if (width < 0) {
                width = 0;
            }
            marginLayoutParams.setMargins(width, 0, marginLayoutParams.getMarginEnd(), 0);
        }
        findViewById.setLayoutParams(marginLayoutParams);
        findViewById.invalidate();
    }
}
