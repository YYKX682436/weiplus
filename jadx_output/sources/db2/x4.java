package db2;

/* loaded from: classes8.dex */
public final class x4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.u f228234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228235b;

    public x4(yz5.u uVar, java.lang.String str) {
        this.f228234a = uVar;
        this.f228235b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.i23 i23Var;
        r45.i23 i23Var2;
        r45.i23 i23Var3;
        r45.i23 i23Var4;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = 2;
        int i18 = 0;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.l23 l23Var = (r45.l23) fVar.f70618d;
            java.lang.String string = (l23Var == null || (i23Var4 = (r45.i23) l23Var.getCustom(1)) == null) ? null : i23Var4.getString(0);
            r45.l23 l23Var2 = (r45.l23) fVar.f70618d;
            if (l23Var2 != null && (i23Var3 = (r45.i23) l23Var2.getCustom(1)) != null) {
                i18 = i23Var3.getInteger(1);
            }
            r45.l23 l23Var3 = (r45.l23) fVar.f70618d;
            if (l23Var3 != null && (i23Var2 = (r45.i23) l23Var3.getCustom(1)) != null) {
                i17 = i23Var2.getInteger(4);
            }
            r45.l23 l23Var4 = (r45.l23) fVar.f70618d;
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (l23Var4 == null || (i23Var = (r45.i23) l23Var4.getCustom(1)) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderJumpInfo) i23Var.getCustom(5);
            if (com.tencent.mm.sdk.platformtools.t8.K0(string) || string == null) {
                this.f228234a.K(java.lang.Integer.valueOf(db2.z4.f228262d), "", this.f228235b, "", java.lang.Integer.valueOf(i18), 2, finderJumpInfo);
            } else {
                yz5.u uVar = this.f228234a;
                java.util.Map map = db2.z4.f228259a;
                uVar.K(0, "", this.f228235b, string, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), finderJumpInfo);
            }
        } else {
            this.f228234a.K(java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c, this.f228235b, "", 0, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
