package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class d9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.o9 f112240d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(com.tencent.mm.plugin.finder.live.plugin.o9 o9Var) {
        super(0);
        this.f112240d = o9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.o9 o9Var = this.f112240d;
        o9Var.getClass();
        if (zl2.r4.f473950a.I0().getBoolean("FRAME_SCALE_TIPS_SHOW_KEY", true) && o9Var.f113721v == 1 && !((mm2.e1) o9Var.P0(mm2.e1.class)).b7()) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            o9Var.f113718s = com.tencent.mm.plugin.finder.live.util.y.m(o9Var, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.live.plugin.f9(o9Var, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
