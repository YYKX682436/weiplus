package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameDebugView f141723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f141724e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.tencent.mm.plugin.game.ui.GameDebugView gameDebugView, n0.v2 v2Var) {
        super(0);
        this.f141723d = gameDebugView;
        this.f141724e = v2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.game.commlib.i.n().f323603d = 0;
        this.f141724e.setValue(this.f141723d.V6());
        return jz5.f0.f302826a;
    }
}
