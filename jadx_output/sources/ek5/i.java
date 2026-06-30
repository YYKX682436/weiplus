package ek5;

/* loaded from: classes.dex */
public final class i extends ek5.c {
    @Override // ek5.b
    public co.a d(android.content.Intent intent, n50.i param) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(param, "param");
        lb5.a aVar = new lb5.a();
        param.a(aVar);
        java.lang.String stringExtra = intent.getStringExtra("Retr_File_Name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        aVar.n(stringExtra);
        aVar.o(param.d());
        return aVar;
    }

    @Override // ek5.b
    public java.lang.Class e() {
        return gk5.e.class;
    }

    @Override // ek5.b
    public java.lang.Class f() {
        return hk5.o.class;
    }

    @Override // ek5.b
    public int g() {
        return 47;
    }

    @Override // ek5.b
    public java.lang.Class h() {
        return lb5.a.class;
    }

    @Override // ek5.b
    public java.util.List j() {
        return kz5.b0.c(5);
    }
}
