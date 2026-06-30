package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f141546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.f0 f141547e;

    public e0(com.tencent.mm.plugin.game.ui.message.f0 f0Var, java.util.List list) {
        this.f141547e = f0Var;
        this.f141546d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.message.f0 f0Var = this.f141547e;
        com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView = f0Var.f141550f;
        java.util.List list = this.f141546d;
        interactiveMsgMRecycleView.f141501n2 = list.size() != 15;
        int size = ((java.util.LinkedList) f0Var.f141549e).size();
        ((java.util.LinkedList) f0Var.f141549e).addAll(list);
        com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView2 = f0Var.f141550f;
        interactiveMsgMRecycleView2.getClass();
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.ui.message.v(interactiveMsgMRecycleView2));
        f0Var.notifyItemRangeInserted(size, list.size());
    }
}
