package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class i8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.l8 f112936d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(com.tencent.mm.plugin.finder.live.plugin.l8 l8Var) {
        super(0);
        this.f112936d = l8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.l8 l8Var = this.f112936d;
        com.tencent.mm.plugin.finder.live.widget.n7 n7Var = l8Var.f113359q;
        if (n7Var != null) {
            com.tencent.mm.plugin.finder.live.widget.e0.t(n7Var, false, 1, null);
        }
        l8Var.f113359q = null;
        return jz5.f0.f302826a;
    }
}
