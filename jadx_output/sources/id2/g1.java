package id2;

/* loaded from: classes3.dex */
public final class g1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f290583a;

    public g1(id2.v1 v1Var) {
        this.f290583a = v1Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        id2.v1 v1Var = this.f290583a;
        com.tencent.mars.xlog.Log.i(v1Var.f290834d, "doGetGiftList errType:" + i17 + ", errCode:" + i18);
        if (i17 == 0 && i18 == 0) {
            r45.aw1 aw1Var = (r45.aw1) ((r45.d81) fVar.f70618d).getCustom(5);
            v1Var.L = (aw1Var != null ? aw1Var.getInteger(0) : id2.v1.N) + 1;
            v1Var.W6(null);
        }
        id2.v1.R6(v1Var, "initView");
        return jz5.f0.f302826a;
    }
}
