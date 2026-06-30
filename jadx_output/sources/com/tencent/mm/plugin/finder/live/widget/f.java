package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class f implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.g f118296d;

    public f(com.tencent.mm.plugin.finder.live.widget.g gVar) {
        this.f118296d = gVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGlobalLayout height: ");
        com.tencent.mm.plugin.finder.live.widget.g gVar = this.f118296d;
        sb6.append(gVar.f118384g.f444837d.getHeight());
        com.tencent.mars.xlog.Log.i("BaseBottomPanelSheet", sb6.toString());
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).nj(gVar, gVar.f118384g.f444837d.getHeight());
        gVar.f118384g.f444837d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
