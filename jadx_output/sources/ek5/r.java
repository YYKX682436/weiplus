package ek5;

/* loaded from: classes9.dex */
public final class r extends ek5.a {
    @Override // ek5.b
    public co.a d(android.content.Intent intent, n50.i param) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(param, "param");
        fc5.h hVar = new fc5.h();
        param.a(hVar);
        v05.b bVar = new v05.b();
        bVar.fromXml(param.d());
        hVar.k(bVar.toXml());
        return hVar;
    }

    @Override // ek5.b
    public java.lang.Class e() {
        return gk5.o.class;
    }

    @Override // ek5.b
    public java.lang.Class f() {
        return hk5.u.class;
    }

    @Override // ek5.b
    public java.lang.Class h() {
        return fc5.h.class;
    }

    @Override // ek5.b
    public java.util.List j() {
        return kz5.c0.i(21, 25);
    }
}
