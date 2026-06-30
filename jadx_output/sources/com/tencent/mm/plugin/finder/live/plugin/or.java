package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class or extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f113780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        super(4);
        this.f113780d = etVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String string;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        r45.tp2 resp = (r45.tp2) obj4;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f113780d;
        if (intValue == 0 && intValue2 == 0) {
            df2.oh ohVar = (df2.oh) etVar.U0(df2.oh.class);
            if (ohVar != null) {
                ohVar.Z6("doSendLocationMsg");
            }
        } else {
            r45.zm6 zm6Var = (r45.zm6) resp.getCustom(7);
            if (zm6Var != null && zm6Var.getBoolean(1)) {
                java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eby);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                zl2.q4 q4Var = zl2.q4.f473933a;
                r45.zm6 zm6Var2 = (r45.zm6) resp.getCustom(7);
                if (zm6Var2 != null && (string = zm6Var2.getString(0)) != null) {
                    string2 = string;
                }
                q4Var.P(string2);
            }
        }
        java.lang.String string3 = resp.getString(1);
        com.tencent.mm.plugin.finder.live.plugin.nr nrVar = new com.tencent.mm.plugin.finder.live.plugin.nr(etVar);
        etVar.getClass();
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.mr(intValue, intValue2, etVar, "", string3, nrVar));
        return jz5.f0.f302826a;
    }
}
