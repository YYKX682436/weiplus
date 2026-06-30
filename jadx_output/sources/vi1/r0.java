package vi1;

/* loaded from: classes7.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.yz5 f437437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vi1.b1 f437438e;

    public r0(r45.yz5 yz5Var, vi1.b1 b1Var) {
        this.f437437d = yz5Var;
        this.f437438e = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Long valueOf;
        int i17 = this.f437437d.f391538d;
        vi1.b1 b1Var = this.f437438e;
        if (i17 == 0) {
            vi1.l2 l2Var = vi1.l2.f437401a;
            vi1.j2 a17 = l2Var.a(b1Var.f437274b);
            if (a17 == null) {
                return;
            }
            vi1.j2 a18 = l2Var.a(b1Var.f437274b);
            valueOf = a18 != null ? java.lang.Long.valueOf(a18.f437364m) : null;
            kotlin.jvm.internal.o.d(valueOf);
            a17.f437364m = valueOf.longValue() + 1;
            return;
        }
        if (i17 == 1) {
            vi1.l2 l2Var2 = vi1.l2.f437401a;
            vi1.j2 a19 = l2Var2.a(b1Var.f437274b);
            if (a19 != null) {
                vi1.j2 a27 = l2Var2.a(b1Var.f437274b);
                valueOf = a27 != null ? java.lang.Long.valueOf(a27.f437365n) : null;
                kotlin.jvm.internal.o.d(valueOf);
                a19.f437365n = valueOf.longValue() + 1;
            }
            java.lang.String string = b1Var.f437273a.getString(com.tencent.mm.R.string.f490146m7);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            b1Var.a(string);
            return;
        }
        if (i17 == 2) {
            vi1.l2 l2Var3 = vi1.l2.f437401a;
            vi1.j2 a28 = l2Var3.a(b1Var.f437274b);
            if (a28 != null) {
                vi1.j2 a29 = l2Var3.a(b1Var.f437274b);
                valueOf = a29 != null ? java.lang.Long.valueOf(a29.f437365n) : null;
                kotlin.jvm.internal.o.d(valueOf);
                a28.f437365n = valueOf.longValue() + 1;
            }
            java.lang.String string2 = b1Var.f437273a.getString(com.tencent.mm.R.string.f490147m8);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            b1Var.a(string2);
            return;
        }
        vi1.l2 l2Var4 = vi1.l2.f437401a;
        vi1.j2 a37 = l2Var4.a(b1Var.f437274b);
        if (a37 != null) {
            vi1.j2 a38 = l2Var4.a(b1Var.f437274b);
            valueOf = a38 != null ? java.lang.Long.valueOf(a38.f437365n) : null;
            kotlin.jvm.internal.o.d(valueOf);
            a37.f437365n = valueOf.longValue() + 1;
        }
        java.lang.String string3 = b1Var.f437273a.getString(com.tencent.mm.R.string.f490146m7);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        b1Var.a(string3);
    }
}
