package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class v20 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.e30 f120027d;

    public v20(com.tencent.mm.plugin.finder.live.widget.e30 e30Var) {
        this.f120027d = e30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.e30 e30Var = this.f120027d;
        e30Var.f118219x.setVisibility(0);
        if (((mm2.w) e30Var.f118212q.P0(mm2.w.class)).O6()) {
            return;
        }
        e30Var.f118220y.setAlpha(1.0f);
    }
}
