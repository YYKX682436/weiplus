package y53;

/* loaded from: classes8.dex */
public final class m extends dm.m5 implements u53.u {
    public static final l75.e0 C = dm.m5.initAutoDBInfo(y53.m.class);
    public boolean B = true;

    @Override // dm.m5, l75.f0
    public l75.e0 getDBInfo() {
        return C;
    }

    public java.lang.String t0() {
        java.lang.String field_username = this.field_username;
        kotlin.jvm.internal.o.f(field_username, "field_username");
        return field_username;
    }

    public java.lang.String toString() {
        return "username: " + this.field_username + " nickname: " + this.field_nickname;
    }

    public final java.lang.String u0() {
        return "username: " + this.field_username;
    }

    public com.tencent.mm.storage.z3 v0() {
        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
        if (!this.B) {
            this.field_nickname = this.field_username;
        }
        z3Var.M1(this.field_nickname);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String str = this.field_nickname;
        ((ke0.e) xVar).getClass();
        z3Var.J2 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str);
        z3Var.X1(this.field_username);
        z3Var.E2 = z3Var.systemRowid;
        return z3Var;
    }
}
