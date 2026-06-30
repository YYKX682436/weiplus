package com.tencent.mm.plugin.finder.megavideo.topstory.flow;

/* loaded from: classes10.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.megavideo.topstory.flow.q0 f120987d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.tencent.mm.plugin.finder.megavideo.topstory.flow.q0 q0Var) {
        super(0);
        this.f120987d = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.flutter.plugin.LVNativePlugin lVNativePlugin;
        com.tencent.pigeon.mega_video.MegaVideoCommCallback megaVideoCommCallback;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.q0 q0Var = this.f120987d;
        q0Var.f120996i = false;
        n40.o oVar = (n40.o) i95.n0.c(n40.o.class);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("select", java.lang.Boolean.FALSE);
        a03.h0 h0Var = (a03.h0) oVar;
        h0Var.getClass();
        pi0.l1 l1Var = h0Var.f426n;
        if (l1Var != null && (lVNativePlugin = (com.tencent.mm.plugin.flutter.plugin.LVNativePlugin) l1Var.j(com.tencent.mm.plugin.flutter.plugin.LVNativePlugin.class)) != null && (megaVideoCommCallback = lVNativePlugin.f137300h) != null) {
            megaVideoCommCallback.onEvent("TabSelectStateChange", hashMap, h03.r.f277915d);
        }
        androidx.lifecycle.b0 b0Var = q0Var.f120993f;
        b0Var.f(androidx.lifecycle.m.ON_PAUSE);
        b0Var.f(androidx.lifecycle.m.ON_STOP);
        return jz5.f0.f302826a;
    }
}
