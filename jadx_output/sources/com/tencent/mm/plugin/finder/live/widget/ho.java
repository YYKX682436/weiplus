package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ho implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.io f118578d;

    public ho(com.tencent.mm.plugin.finder.live.widget.io ioVar) {
        this.f118578d = ioVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.ViewTreeObserver viewTreeObserver;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGlobalLayout height: ");
        com.tencent.mm.plugin.finder.live.widget.io ioVar = this.f118578d;
        android.view.View view = ioVar.f212027f;
        sb6.append(view != null ? java.lang.Integer.valueOf(view.getHeight()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveMMCustomHalfBottomDialog", sb6.toString());
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        android.view.View view2 = ioVar.f212027f;
        ((b92.d1) zbVar).nj(ioVar, view2 != null ? view2.getHeight() : 0);
        android.view.View view3 = ioVar.f212027f;
        if (view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }
}
