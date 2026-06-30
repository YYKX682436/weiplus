package ej4;

/* loaded from: classes11.dex */
public final class p implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ej4.p f253373d = new ej4.p();

    @Override // l75.q0
    public final void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        boolean z17 = true;
        if (w0Var != null && w0Var.f316974b == 2) {
            ej4.c0 c0Var = ej4.c0.f253335a;
            java.lang.String a17 = en1.a.a();
            kotlin.jvm.internal.o.f(a17, "username(...)");
            ej4.c0.d(c0Var, a17, null, false, 6, null);
        }
        java.lang.Object obj = w0Var != null ? w0Var.f316976d : null;
        mj4.w wVar = obj instanceof mj4.w ? (mj4.w) obj : null;
        java.lang.String str2 = wVar != null ? wVar.field_sessionId : null;
        if (str2 != null && !r26.n0.N(str2)) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        ej4.c0.d(ej4.c0.f253335a, str2, null, false, 6, null);
    }
}
