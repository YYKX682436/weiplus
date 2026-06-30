package pi5;

/* loaded from: classes.dex */
public final class x implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f354894d;

    public x(kotlin.jvm.internal.h0 h0Var) {
        this.f354894d = h0Var;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = (java.lang.String) obj2;
        kotlin.jvm.internal.h0 h0Var = this.f354894d;
        java.lang.String str3 = (java.lang.String) ((java.util.HashMap) h0Var.f310123d).get(str);
        java.lang.String str4 = (java.lang.String) ((java.util.HashMap) h0Var.f310123d).get(str2);
        if (!(str3 == null || r26.n0.N(str3))) {
            str = str3;
        }
        kotlin.jvm.internal.o.d(str);
        char A0 = r26.p0.A0(str);
        if (!(str4 == null || r26.n0.N(str4))) {
            str2 = str4;
        }
        kotlin.jvm.internal.o.d(str2);
        return kotlin.jvm.internal.o.i(A0, r26.p0.A0(str2));
    }
}
