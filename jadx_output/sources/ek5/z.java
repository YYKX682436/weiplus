package ek5;

/* loaded from: classes9.dex */
public final class z extends ek5.c {
    @Override // ek5.b
    public co.a d(android.content.Intent intent, n50.i param) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(param, "param");
        oe5.a aVar = new oe5.a();
        param.a(aVar);
        if (param.d().length() > 0) {
            e15.k kVar = new e15.k();
            kVar.fromXml(param.d());
            aVar.k(kVar);
        }
        return aVar;
    }

    @Override // ek5.b
    public java.lang.Class e() {
        return gk5.x0.class;
    }

    @Override // ek5.b
    public java.lang.Class f() {
        return hk5.c0.class;
    }

    @Override // ek5.b
    public int g() {
        return 49;
    }

    @Override // ek5.b
    public java.lang.Class h() {
        return oe5.a.class;
    }

    @Override // ek5.b
    public java.util.List i() {
        return kz5.b0.c(118);
    }
}
