package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class m90 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f113473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f113474b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ea0 f113475c;

    public m90(yz5.a aVar, cm2.m0 m0Var, com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var) {
        this.f113473a = aVar;
        this.f113474b = m0Var;
        this.f113475c = ea0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.g byteString;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean b17 = fVar.b();
        yz5.a aVar = this.f113473a;
        if (b17) {
            r45.zs1 zs1Var = (r45.zs1) fVar.f70618d;
            if (!((zs1Var != null ? zs1Var.getByteString(1) : null) == null)) {
                r45.y23 y23Var = new r45.y23();
                r45.zs1 zs1Var2 = (r45.zs1) fVar.f70618d;
                byte[] g17 = (zs1Var2 == null || (byteString = zs1Var2.getByteString(1)) == null) ? null : byteString.g();
                if (g17 != null) {
                    try {
                        y23Var.parseFrom(g17);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                    }
                }
                cm2.m0 m0Var = this.f113474b;
                m0Var.n(y23Var);
                com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var = this.f113475c;
                so2.j5 j5Var = ((mm2.f6) ea0Var.P0(mm2.f6.class)).f329049w;
                cm2.m0 m0Var2 = j5Var instanceof cm2.m0 ? (cm2.m0) j5Var : null;
                if (m0Var2 != null && m0Var2.f43369w == y23Var.getLong(0)) {
                    ((mm2.f6) ea0Var.P0(mm2.f6.class)).c7(m0Var);
                    ea0Var.y1().n(ea0Var.S0(), m0Var);
                }
                if (aVar != null) {
                    aVar.invoke();
                }
                return jz5.f0.f302826a;
            }
        }
        if (aVar != null) {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}
