package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class k90 extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ea0 f113208b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k90(com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var, java.lang.Class cls) {
        super(cls);
        this.f113208b = ea0Var;
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        r45.ny2 result = (r45.ny2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var = this.f113208b;
        so2.j5 j5Var = ((mm2.f6) ea0Var.S0().a(mm2.f6.class)).f329049w;
        r45.ov2 ov2Var = (r45.ov2) result.getCustom(0);
        if (!(j5Var instanceof cm2.k0) || ov2Var == null) {
            return;
        }
        cm2.k0 k0Var = (cm2.k0) j5Var;
        if (kotlin.jvm.internal.o.b(ov2Var.getString(1), k0Var.f43362x)) {
            k0Var.f43360v = ov2Var;
            ea0Var.D1(k0Var);
        }
    }
}
