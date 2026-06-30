package vd2;

/* loaded from: classes3.dex */
public final class s3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vd2.g5 f435911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vd2.g5 f435912b;

    public s3(vd2.g5 g5Var, vd2.g5 g5Var2) {
        this.f435911a = g5Var;
        this.f435912b = g5Var2;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0 && fVar.f70616b == 0) {
            vd2.g5 g5Var = this.f435911a;
            if (g5Var != null) {
                g5Var.a(null);
                return f0Var;
            }
        } else {
            vd2.g5 g5Var2 = this.f435912b;
            if (g5Var2 != null) {
                g5Var2.a(java.lang.Integer.valueOf(fVar.f70616b));
                return f0Var;
            }
        }
        return null;
    }
}
