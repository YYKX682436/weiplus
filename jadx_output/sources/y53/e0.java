package y53;

/* loaded from: classes8.dex */
public final class e0 implements c01.p8 {
    @Override // c01.p8
    public void a(java.lang.String str, java.lang.String str2, int i17) {
    }

    @Override // c01.p8
    public void b(java.lang.String str, int i17, c01.o8 o8Var) {
        if (str != null) {
            i(str, o8Var);
        }
    }

    @Override // c01.p8
    public void d() {
    }

    @Override // c01.p8
    public void e(java.lang.String str) {
    }

    @Override // c01.p8
    public void f(java.lang.String str) {
    }

    @Override // c01.p8
    public void g(java.lang.String str, java.lang.String str2, int i17, c01.o8 o8Var) {
        if (str != null) {
            i(str, o8Var);
        }
    }

    @Override // c01.p8
    public void h(java.lang.String str, int i17, java.lang.String str2) {
    }

    public final void i(java.lang.String str, c01.o8 o8Var) {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = str;
        if (com.tencent.mm.storage.z3.a4(str)) {
            h0Var.f310123d = ((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).Bi(str);
        }
        com.tencent.mars.xlog.Log.i("GameLife.GetContactInterceptor", "[getContact] username=" + str + " talker=" + ((java.lang.String) h0Var.f310123d));
        if (com.tencent.mm.storage.z3.Z3((java.lang.String) h0Var.f310123d)) {
            ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Ai((java.lang.String) h0Var.f310123d, new y53.c0(str, h0Var, o8Var));
        } else {
            c01.p8 a17 = c01.n8.a();
            if (a17 instanceof c01.l8) {
                ((c01.k7) ((c01.l8) a17)).f37286a.b(str, 15, new y53.d0(h0Var, o8Var));
            }
        }
    }
}
