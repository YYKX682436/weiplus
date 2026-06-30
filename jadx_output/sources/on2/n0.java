package on2;

/* loaded from: classes3.dex */
public final class n0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ on2.v0 f346973a;

    public n0(on2.v0 v0Var) {
        this.f346973a = v0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.cz1 cz1Var;
        r45.yy1 yy1Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.ht1 ht1Var = (r45.ht1) fVar.f70618d;
            on2.v0 v0Var = this.f346973a;
            v0Var.R = ht1Var;
            if (ht1Var != null && (cz1Var = (r45.cz1) ht1Var.getCustom(1)) != null && (yy1Var = (r45.yy1) cz1Var.getCustom(13)) != null) {
                v0Var.c7(yy1Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
