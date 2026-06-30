package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class xh0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ai0 f115086d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh0(com.tencent.mm.plugin.finder.live.plugin.ai0 ai0Var) {
        super(0);
        this.f115086d = ai0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.ai0 ai0Var = this.f115086d;
        com.tencent.mars.xlog.Log.i(ai0Var.f111889q, "dynamicCardServerLost");
        ai0Var.f111893u = true;
        return jz5.f0.f302826a;
    }
}
