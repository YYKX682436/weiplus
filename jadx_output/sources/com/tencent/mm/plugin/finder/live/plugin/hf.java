package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class hf implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f112804d;

    public hf(com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        this.f112804d = mgVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f112804d;
        boolean x07 = mgVar.x0();
        com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "onCardVisibleLiveData, visible = " + bool + ", isLandscape = " + x07);
        if (x07) {
            return;
        }
        kotlin.jvm.internal.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        com.tencent.mm.plugin.finder.live.view.FinderMaxSizeLayout finderMaxSizeLayout = mgVar.f113510w;
        if (booleanValue) {
            finderMaxSizeLayout.setMaxWidth(com.tencent.mm.ui.bl.b(mgVar.f365323d.getContext()).x - com.tencent.mm.plugin.finder.live.plugin.mg.f113498x1);
            finderMaxSizeLayout.requestLayout();
        } else {
            finderMaxSizeLayout.setMaxWidth(0);
            finderMaxSizeLayout.requestLayout();
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.gf(mgVar));
    }
}
