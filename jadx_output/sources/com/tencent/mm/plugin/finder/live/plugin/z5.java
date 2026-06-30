package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class z5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.c6 f115299d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(com.tencent.mm.plugin.finder.live.plugin.c6 c6Var) {
        super(0);
        this.f115299d = c6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.c6 c6Var = this.f115299d;
        com.tencent.mars.xlog.Log.i(c6Var.f112117q, "dynamicCardServerLost");
        c6Var.f112120t = true;
        return jz5.f0.f302826a;
    }
}
