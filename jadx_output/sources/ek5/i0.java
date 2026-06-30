package ek5;

/* loaded from: classes.dex */
public final class i0 extends ek5.c {
    @Override // ek5.b
    public co.a d(android.content.Intent intent, n50.i param) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(param, "param");
        se5.a aVar = new se5.a();
        param.a(aVar);
        l15.c cVar = new l15.c();
        cVar.fromXml(param.d());
        aVar.l(cVar);
        return aVar;
    }

    @Override // ek5.b
    public java.lang.Class e() {
        return gk5.a1.class;
    }

    @Override // ek5.b
    public java.lang.Class f() {
        return hk5.g0.class;
    }

    @Override // ek5.b
    public int g() {
        return 49;
    }

    @Override // ek5.b
    public java.lang.Class h() {
        return se5.a.class;
    }

    @Override // ek5.b
    public java.util.List i() {
        return kz5.c0.i(5, 15, 25, 97, 4, 7, 101);
    }
}
