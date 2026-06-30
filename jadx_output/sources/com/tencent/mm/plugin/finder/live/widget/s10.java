package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class s10 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.z10 f119697a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f119698b;

    public s10(com.tencent.mm.plugin.finder.live.widget.z10 z10Var, yz5.a aVar) {
        this.f119697a = z10Var;
        this.f119698b = aVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.y63 y63Var;
        r45.y63 y63Var2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.live.widget.z10 z10Var = this.f119697a;
        z10Var.f120506o = false;
        int i17 = fVar.f70615a;
        yz5.a aVar = this.f119698b;
        if (i17 == 0 && fVar.f70616b == 0) {
            z10Var.f120509r = (r45.yq1) ((r45.ps1) fVar.f70618d).getCustom(2);
            z10Var.f120510s = (r45.fr1) ((r45.ps1) fVar.f70618d).getCustom(1);
            ((mm2.c1) z10Var.f120494c.P0(mm2.c1.class)).Y8(z10Var.f120510s);
            r45.yq1 yq1Var = (r45.yq1) ((r45.ps1) fVar.f70618d).getCustom(2);
            z10Var.f120505n = (yq1Var == null || (y63Var2 = (r45.y63) yq1Var.getCustom(0)) == null) ? false : y63Var2.getBoolean(1);
            r45.yq1 yq1Var2 = (r45.yq1) ((r45.ps1) fVar.f70618d).getCustom(2);
            z10Var.f120504m = (yq1Var2 == null || (y63Var = (r45.y63) yq1Var2.getCustom(0)) == null) ? null : y63Var.getString(2);
            aVar.invoke();
        } else {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}
