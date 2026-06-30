package y53;

/* loaded from: classes8.dex */
public final class n implements com.tencent.mm.storage.c8 {
    @Override // com.tencent.mm.storage.c8
    public com.tencent.mm.storage.z3 get(java.lang.String str) {
        if ((str == null || str.length() == 0) || !com.tencent.mm.storage.z3.a4(str)) {
            return null;
        }
        y53.m Di = ((y53.x) i95.n0.c(y53.x.class)).Di(((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).Bi(str));
        com.tencent.mm.storage.z3 v07 = Di != null ? Di.v0() : new com.tencent.mm.storage.z3();
        v07.X1(str);
        return v07;
    }

    @Override // com.tencent.mm.storage.c8
    public int o0(com.tencent.mm.storage.z3 z3Var, boolean z17) {
        return (z3Var != null && com.tencent.mm.storage.z3.a4(z3Var.d1())) ? 1 : -1;
    }

    @Override // com.tencent.mm.storage.c8
    public void w0(com.tencent.mm.storage.e8 e8Var, com.tencent.mm.storage.z3 z3Var) {
    }
}
