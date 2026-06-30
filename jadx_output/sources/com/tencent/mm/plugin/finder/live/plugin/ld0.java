package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ld0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.g84 f113383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.nd0 f113384e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fy2.d f113385f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld0(r45.g84 g84Var, com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var, fy2.d dVar) {
        super(1);
        this.f113383d = g84Var;
        this.f113384e = nd0Var;
        this.f113385f = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.kd0(this.f113383d, ((java.lang.Boolean) obj).booleanValue(), this.f113384e, this.f113385f));
        return jz5.f0.f302826a;
    }
}
