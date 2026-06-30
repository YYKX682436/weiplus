package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class k50 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.q50 f118816d;

    public k50(com.tencent.mm.plugin.finder.live.widget.q50 q50Var) {
        this.f118816d = q50Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.live.widget.l40 l40Var = com.tencent.mm.plugin.finder.live.widget.m40.f119035e;
        com.tencent.mm.plugin.finder.live.widget.q50 q50Var = this.f118816d;
        g4Var.f(1, q50Var.f118183e.getString(com.tencent.mm.R.string.ovn));
        com.tencent.mm.plugin.finder.live.widget.l40 l40Var2 = com.tencent.mm.plugin.finder.live.widget.m40.f119035e;
        g4Var.o(2, q50Var.f118183e.getString(com.tencent.mm.R.string.ovu), q50Var.f118183e.getString(com.tencent.mm.R.string.ovv));
    }
}
