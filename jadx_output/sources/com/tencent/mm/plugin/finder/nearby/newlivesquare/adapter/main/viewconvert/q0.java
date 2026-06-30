package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes.dex */
public final class q0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f121893e;

    /* renamed from: f, reason: collision with root package name */
    public final float f121894f;

    public q0(boolean z17, int i17, float f17) {
        this.f121893e = i17;
        this.f121894f = f17;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.dvo;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vp2.j item = (vp2.j) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.ryg);
        android.view.ViewGroup.LayoutParams layoutParams = p17.getLayoutParams();
        int i19 = this.f121893e;
        layoutParams.width = i19;
        layoutParams.height = (int) (this.f121894f * i19);
        p17.setLayoutParams(layoutParams);
    }
}
