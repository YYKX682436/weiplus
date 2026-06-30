package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class x4 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f151526d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public kp4.s0 f151527e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.z5 f151528f;

    public x4(com.tencent.mm.plugin.mv.ui.uic.z5 z5Var) {
        this.f151528f = z5Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f151526d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        kk4.b player;
        com.tencent.mm.plugin.mv.ui.uic.y4 viewHolder = (com.tencent.mm.plugin.mv.ui.uic.y4) k3Var;
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        kp4.s0 s0Var = this.f151527e;
        com.tencent.mm.plugin.mv.ui.view.FrameListView2 frameListView2 = viewHolder.f151555d;
        if (s0Var != null) {
            frameListView2.setThumbFetcherFactory(s0Var);
            kk4.d dVar = this.f151528f.f151579r;
            frameListView2.setThumbFetcherExtraData((dVar == null || (player = dVar.getPlayer()) == null) ? null : ((kk4.v) player).f308580e);
        }
        java.lang.Object obj = this.f151526d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        frameListView2.setTrackInfo((kp4.a) obj);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        return new com.tencent.mm.plugin.mv.ui.uic.y4(parent);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewDetachedFromWindow(androidx.recyclerview.widget.k3 k3Var) {
        com.tencent.mm.plugin.mv.ui.uic.y4 holder = (com.tencent.mm.plugin.mv.ui.uic.y4) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerItemEditUIC", "release frameListView");
        com.tencent.mm.plugin.mv.ui.view.FrameListView2 frameListView2 = holder.f151555d;
        rm5.k kVar = frameListView2.f151610t;
        if (kVar != null) {
            kVar.destroy();
        }
        frameListView2.f151610t = null;
        frameListView2.f151599f = null;
        com.tencent.mars.xlog.Log.i(frameListView2.f151597d, "clearThumb");
        frameListView2.f151600g.clear();
        frameListView2.f151601h = null;
        frameListView2.postInvalidate();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewRecycled(androidx.recyclerview.widget.k3 k3Var) {
        com.tencent.mm.plugin.mv.ui.uic.y4 holder = (com.tencent.mm.plugin.mv.ui.uic.y4) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewRecycled(holder);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerItemEditUIC", "release frameListView");
        com.tencent.mm.plugin.mv.ui.view.FrameListView2 frameListView2 = holder.f151555d;
        rm5.k kVar = frameListView2.f151610t;
        if (kVar != null) {
            kVar.destroy();
        }
        frameListView2.f151610t = null;
        frameListView2.f151599f = null;
        com.tencent.mars.xlog.Log.i(frameListView2.f151597d, "clearThumb");
        frameListView2.f151600g.clear();
        frameListView2.f151601h = null;
        frameListView2.postInvalidate();
    }
}
