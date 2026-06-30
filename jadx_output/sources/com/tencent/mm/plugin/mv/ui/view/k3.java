package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes15.dex */
public final class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.l3 f151886d;

    public k3(com.tencent.mm.plugin.mv.ui.view.l3 l3Var) {
        this.f151886d = l3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.mv.ui.view.l3 l3Var = this.f151886d;
        l3Var.f151894d = 2;
        com.tencent.mm.plugin.mv.ui.view.m3 m3Var = l3Var.f151891a;
        float f17 = ((com.tencent.mm.plugin.mv.ui.view.n3) m3Var).f151910a.f151703f + ((com.tencent.mm.plugin.mv.ui.view.n3) m3Var).f151910a.f151705h;
        ((com.tencent.mm.plugin.mv.ui.view.n3) m3Var).f151910a.f151706i.startScroll(0, 0, (int) f17, 0, (int) ((f17 / l3Var.f151892b) * 1000));
        ((com.tencent.mm.plugin.mv.ui.view.n3) l3Var.f151891a).f151910a.postInvalidate();
    }
}
