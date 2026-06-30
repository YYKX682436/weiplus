package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class c9 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.o9 f112126d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(com.tencent.mm.plugin.finder.live.plugin.o9 o9Var) {
        super(2);
        this.f112126d = o9Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        com.tencent.mm.plugin.finder.live.plugin.o9 o9Var = this.f112126d;
        com.tencent.mm.plugin.finder.live.plugin.o9.t1(o9Var);
        if (booleanValue && !o9Var.f113723x) {
            o9Var.f113723x = true;
            com.tencent.mm.plugin.finder.live.plugin.o9.u1(o9Var, 2);
        }
        if (booleanValue2) {
            com.tencent.mm.plugin.finder.live.plugin.o9.u1(o9Var, 3);
        }
        df2.zb zbVar = (df2.zb) o9Var.U0(df2.zb.class);
        if (zbVar != null) {
            zbVar.v7(false, null);
            if (zbVar.m7()) {
                r45.ff1 ff1Var = zbVar.f231944r;
                boolean z17 = ff1Var != null && ff1Var.getInteger(7) == 5;
                zbVar.q7(6);
                zbVar.s7(r45.n72.kActionType_AiassistantClose, 3, "");
                if (z17) {
                    zbVar.r7(3, df2.ab.f229704d);
                }
                zbVar.u7();
            }
        }
        return jz5.f0.f302826a;
    }
}
