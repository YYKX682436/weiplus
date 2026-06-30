package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class z80 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.g90 f115308d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z80(com.tencent.mm.plugin.finder.live.plugin.g90 g90Var) {
        super(0);
        this.f115308d = g90Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.g90 g90Var = this.f115308d;
        tn0.w0 d17 = g90Var.d();
        if (d17 != null) {
            com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer finderLiveFloatContainer = g90Var.f112657g;
            android.view.ViewGroup.LayoutParams layoutParams = finderLiveFloatContainer.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            int marginEnd = marginLayoutParams != null ? marginLayoutParams.getMarginEnd() : 0;
            android.view.ViewGroup.LayoutParams layoutParams2 = finderLiveFloatContainer.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            d17.b0(marginEnd, marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0);
        }
        return jz5.f0.f302826a;
    }
}
