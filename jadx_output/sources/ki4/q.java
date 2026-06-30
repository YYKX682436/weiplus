package ki4;

/* loaded from: classes11.dex */
public final class q implements com.tencent.mm.storage.c8 {
    @Override // com.tencent.mm.storage.c8
    public com.tencent.mm.storage.z3 get(java.lang.String str) {
        com.tencent.mm.storage.z3 z3Var;
        if ((str == null || r26.n0.N(str)) || !com.tencent.mm.storage.z3.H4(str)) {
            return null;
        }
        mj4.w Ai = ((ki4.x) i95.n0.c(ki4.x.class)).Ai(str);
        if (Ai != null) {
            z3Var = new com.tencent.mm.storage.z3();
            java.lang.String str2 = Ai.field_nickname;
            z3Var.M1(str2 == null || r26.n0.N(str2) ? "\u200b" : Ai.field_nickname);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.String str3 = Ai.field_nickname;
            ((ke0.e) xVar).getClass();
            z3Var.J2 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str3);
            z3Var.X1(Ai.field_userName);
            z3Var.E2 = z3Var.systemRowid;
        } else {
            z3Var = new com.tencent.mm.storage.z3();
        }
        z3Var.X1(str);
        return z3Var;
    }

    @Override // com.tencent.mm.storage.c8
    public int o0(com.tencent.mm.storage.z3 z3Var, boolean z17) {
        return (z3Var != null && com.tencent.mm.storage.z3.H4(z3Var.d1())) ? 1 : -1;
    }

    @Override // com.tencent.mm.storage.c8
    public void w0(com.tencent.mm.storage.e8 e8Var, com.tencent.mm.storage.z3 z3Var) {
    }
}
