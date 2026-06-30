package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class bl0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.gl0 f112049d;

    public bl0(com.tencent.mm.plugin.finder.live.plugin.gl0 gl0Var) {
        this.f112049d = gl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f112049d.f112712p;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        view.animate().alpha(0.0f).withEndAction(new com.tencent.mm.plugin.finder.live.plugin.al0(view)).start();
    }
}
