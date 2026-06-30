package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class f90 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f112522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.g90 f112523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.z1 f112524f;

    public f90(android.view.View view, com.tencent.mm.plugin.finder.live.plugin.g90 g90Var, com.tencent.mm.plugin.webview.ui.tools.widget.z1 z1Var) {
        this.f112522d = view;
        this.f112523e = g90Var;
        this.f112524f = z1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f112522d;
        java.lang.Object parent = view != null ? view.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        com.tencent.mm.plugin.finder.live.plugin.g90 g90Var = this.f112523e;
        g90Var.f112653c.addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
        g90Var.a(((com.tencent.mm.plugin.webview.ui.tools.widget.o4) this.f112524f).d());
        android.os.Bundle bundle = new android.os.Bundle();
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", c1Var != null ? c1Var.l7() : false);
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", true);
        g90Var.f112652b.f113325g.statusChange(qo0.b.f365366i4, bundle);
    }
}
