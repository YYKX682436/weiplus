package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class iz implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.oz f113036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f113037b;

    public iz(com.tencent.mm.plugin.finder.live.plugin.oz ozVar, android.view.ViewGroup viewGroup) {
        this.f113036a = ozVar;
        this.f113037b = viewGroup;
    }

    @Override // n3.k0
    public final n3.g3 a(android.view.View v17, n3.g3 insets) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(insets, "insets");
        com.tencent.mm.plugin.finder.live.plugin.oz ozVar = this.f113036a;
        if (!ozVar.x0() && !((mm2.c1) ozVar.P0(mm2.c1.class)).R7()) {
            android.view.ViewGroup viewGroup = this.f113037b;
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.addRule(12);
                layoutParams2.topMargin = 0;
                layoutParams2.bottomMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 14) + com.tencent.mm.ui.bl.c(viewGroup.getContext());
                com.tencent.mars.xlog.Log.i("MultiStreamIndicatorPlugin", "bottomMargin: " + layoutParams2.bottomMargin);
            }
            viewGroup.requestLayout();
        }
        return n3.l1.i(v17, insets);
    }
}
