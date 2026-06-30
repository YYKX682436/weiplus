package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class fl0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.gl0 f112568d;

    public fl0(com.tencent.mm.plugin.finder.live.plugin.gl0 gl0Var) {
        this.f112568d = gl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nn0.a W;
        com.tencent.mm.plugin.finder.live.plugin.gl0 gl0Var = this.f112568d;
        com.tencent.mm.plugin.finder.live.plugin.ll0 ll0Var = (com.tencent.mm.plugin.finder.live.plugin.ll0) gl0Var.X0(com.tencent.mm.plugin.finder.live.plugin.ll0.class);
        if (ll0Var != null) {
            ll0Var.t1();
        }
        com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var = (com.tencent.mm.plugin.finder.live.plugin.ob0) gl0Var.X0(com.tencent.mm.plugin.finder.live.plugin.ob0.class);
        mn0.b0 B1 = ob0Var != null ? ob0Var.B1() : null;
        nn0.c cVar = B1 instanceof nn0.c ? (nn0.c) B1 : null;
        if (cVar == null || (W = cVar.W()) == null) {
            return;
        }
        ((nn0.b) W).v(true);
    }
}
