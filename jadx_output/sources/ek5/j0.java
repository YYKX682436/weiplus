package ek5;

/* loaded from: classes9.dex */
public final class j0 extends ek5.c {
    @Override // ek5.b
    public co.a d(android.content.Intent intent, n50.i param) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(param, "param");
        jd5.c cVar = new jd5.c();
        param.a(cVar);
        java.lang.String stringExtra = intent.getStringExtra("Retr_File_Name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        cVar.r(stringExtra);
        java.lang.String stringExtra2 = intent.getStringExtra("image_path");
        cVar.o(stringExtra2 != null ? stringExtra2 : "");
        cVar.q(intent.getIntExtra("Retr_length", 0));
        return cVar;
    }

    @Override // ek5.b
    public java.lang.Class e() {
        return k50.d1.class;
    }

    @Override // ek5.b
    public java.lang.Class f() {
        return r50.p0.class;
    }

    @Override // ek5.b
    public int g() {
        return 43;
    }

    @Override // ek5.b
    public java.lang.Class h() {
        return jd5.c.class;
    }

    @Override // ek5.b
    public java.util.List j() {
        return kz5.c0.i(1, 11);
    }
}
