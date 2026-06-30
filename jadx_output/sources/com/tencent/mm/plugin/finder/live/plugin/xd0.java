package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class xd0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.de0 f115075d;

    public xd0(com.tencent.mm.plugin.finder.live.plugin.de0 de0Var) {
        this.f115075d = de0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.de0 de0Var = this.f115075d;
        if (de0Var.f365323d.getVisibility() == 0) {
            de0Var.K0(8);
        }
        de0Var.w1().removeMessages(de0Var.f112281v);
        de0Var.w1().sendEmptyMessage(de0Var.f112280u);
    }
}
