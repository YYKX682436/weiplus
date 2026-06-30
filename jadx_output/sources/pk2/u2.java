package pk2;

/* loaded from: classes3.dex */
public final class u2 implements ek2.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356279a;

    public u2(pk2.o9 o9Var) {
        this.f356279a = o9Var;
    }

    @Override // ek2.v1
    public void a(int i17, int i18, java.lang.String str, r45.ko2 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        pk2.o9 o9Var = this.f356279a;
        if (i17 != 0 || i18 != 0) {
            pm0.v.X(new pk2.t2(o9Var));
            return;
        }
        mm2.c1 c1Var = (mm2.c1) o9Var.c(mm2.c1.class);
        r45.jy1 jy1Var = new r45.jy1();
        jy1Var.set(0, 2);
        jy1Var.set(2, 0);
        c1Var.W9(jy1Var, false, new pk2.s2(o9Var));
    }
}
