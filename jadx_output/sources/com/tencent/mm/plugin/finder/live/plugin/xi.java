package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class xi implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.cj f115087d;

    public xi(com.tencent.mm.plugin.finder.live.plugin.cj cjVar) {
        this.f115087d = cjVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.plugin.finder.live.plugin.cj cjVar = this.f115087d;
        com.tencent.mars.xlog.Log.i(cjVar.f112160h, "container onViewAttachedToWindow");
        if (cjVar.f112166q) {
            cjVar.f112166q = false;
            cm2.t tVar = cjVar.f112159g;
            kotlin.jvm.internal.o.e(tVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.PromoteGameItem");
            cm2.u uVar = (cm2.u) tVar;
            hq0.e0 e0Var = cjVar.f112164o;
            if (e0Var != null) {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = cjVar.f112165p;
                kotlin.jvm.internal.o.f(constraintLayout, "access$getContainer$p(...)");
                cjVar.a(constraintLayout, uVar.f43400v, e0Var);
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.plugin.finder.live.plugin.cj cjVar = this.f115087d;
        com.tencent.mars.xlog.Log.i(cjVar.f112160h, "container onViewDetachedFromWindow");
        cjVar.f112166q = true;
        cjVar.f112165p.removeAllViews();
    }
}
