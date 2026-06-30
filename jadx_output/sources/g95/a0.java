package g95;

/* loaded from: classes9.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final g95.a0 f269793d = new g95.a0();

    @Override // java.lang.Runnable
    public final void run() {
        g95.c0 c0Var = g95.d0.f269796a;
        ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) g95.d0.f269798c).getValue()).putLong("time", c01.id.c());
        java.lang.String[] b17 = c0Var.b().b();
        kotlin.jvm.internal.o.d(b17);
        if (b17.length > 1) {
            kz5.v.A(b17, new g95.z());
        }
        kz5.z.H(b17, g95.d0.f269799d);
        c0Var.b().X(b17);
    }
}
