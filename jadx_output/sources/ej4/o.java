package ej4;

/* loaded from: classes11.dex */
public final class o implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ej4.o f253372d = new ej4.o();

    @Override // l75.q0
    public final void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        boolean z17 = false;
        if (w0Var != null && w0Var.f316974b == 2) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusEventCenter", "greeting notify");
            ej4.c0 c0Var = ej4.c0.f253335a;
            java.lang.String a17 = en1.a.a();
            kotlin.jvm.internal.o.f(a17, "username(...)");
            ej4.c0.d(c0Var, a17, null, false, 6, null);
        }
    }
}
