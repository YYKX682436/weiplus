package kr4;

/* loaded from: classes4.dex */
public final class e extends dm.vb {

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f311504v = dm.vb.f240654t;

    @Override // dm.vb, l75.f0
    public l75.e0 getDBInfo() {
        l75.e0 info = f311504v;
        kotlin.jvm.internal.o.f(info, "info");
        return info;
    }

    public final com.tencent.mm.storage.z3 t0() {
        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
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

    public java.lang.String toString() {
        return "";
    }
}
