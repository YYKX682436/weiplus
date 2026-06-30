package fk;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f263258a = new java.util.concurrent.ConcurrentHashMap();

    public static final void a(wj.q0 actionType, java.lang.String posId, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(posId, "posId");
        float f17 = ik.f.f291821a.c(posId).f446524m;
        boolean z17 = true;
        if ((f17 == 0.0f) || f17 < c06.e.f37716d.b()) {
            return;
        }
        boolean b17 = str == null || str.length() == 0 ? false : kotlin.jvm.internal.o.b(r26.n0.o0(str, '-', str), "123456");
        if (b17) {
            if (str2 != null && str2.length() != 0) {
                z17 = false;
            }
            if (z17) {
                str2 = "use_fallback";
            } else {
                str2 = str2 + "|use_fallback";
            }
        }
        java.lang.String str4 = str2;
        if (b17 && actionType == wj.q0.f446478e) {
            wj.o0 o0Var = wj.o0.f446456e;
            if (i17 == 0) {
                wj.o0 o0Var2 = wj.o0.f446456e;
                i17 = 7;
            }
        }
        ((ku5.t0) ku5.t0.f312615d).g(new fk.b(posId, str, actionType, i17, str4, str3));
    }

    public static /* synthetic */ void b(wj.q0 q0Var, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, java.lang.Object obj) {
        if ((i18 & 8) != 0) {
            i17 = 0;
        }
        a(q0Var, str, str2, i17, (i18 & 16) != 0 ? null : str3, (i18 & 32) != 0 ? null : str4);
    }
}
