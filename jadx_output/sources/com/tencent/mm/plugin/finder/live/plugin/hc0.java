package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class hc0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.nd0 f112797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.g84 f112798e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc0(com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var, r45.g84 g84Var) {
        super(0);
        this.f112797d = nd0Var;
        this.f112798e = g84Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = this.f112797d;
        fy2.d dVar = (fy2.d) nd0Var.P0(fy2.d.class);
        r45.g84 g84Var = this.f112798e;
        if (dVar.P6(g84Var != null ? g84Var.getString(1) : null, 0)) {
            nd0Var.L1(g84Var);
        }
        return jz5.f0.f302826a;
    }
}
