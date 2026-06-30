package qo1;

/* loaded from: classes5.dex */
public final /* synthetic */ class s0 extends kotlin.jvm.internal.m implements yz5.a {
    public s0(java.lang.Object obj) {
        super(0, obj, qo1.v0.class, "calcConversationListAndSize", "calcConversationListAndSize()I", 0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        qo1.v0 v0Var = (qo1.v0) this.receiver;
        java.lang.Object obj = v0Var.f365492r;
        com.tencent.wechat.aff.affroam.g gVar = obj instanceof com.tencent.wechat.aff.affroam.g ? (com.tencent.wechat.aff.affroam.g) obj : null;
        if (gVar == null) {
            i17 = 256;
        } else {
            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
            qo1.r0 r0Var = new qo1.r0(f0Var, v0Var);
            v0Var.f365487m = 2;
            ((ku5.t0) ku5.t0.f312615d).g(new qo1.m0(v0Var));
            ((ku5.t0) ku5.t0.f312615d).g(new qo1.o0(v0Var, gVar, r0Var, f0Var));
            i17 = 0;
        }
        return java.lang.Integer.valueOf(i17);
    }
}
