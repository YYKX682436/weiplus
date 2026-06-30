package o72;

/* loaded from: classes.dex */
public abstract class p5 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f343440a = "";

    /* renamed from: b, reason: collision with root package name */
    public static java.util.Set f343441b;

    static {
        if (hz4.q.f286451a) {
            return;
        }
        synchronized (hz4.q.class) {
            if (!hz4.q.f286451a) {
                hz4.q.a();
                hz4.q.f286451a = true;
            }
        }
    }

    public static java.lang.String a(boolean z17) {
        if (z17) {
            return gm0.j1.u().d();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(f343440a)) {
            f343440a = lp0.b.h();
        }
        return f343440a;
    }

    public static java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(a(false), "wenote/html/upload");
        if (!r6Var.m()) {
            r6Var.J();
        }
        sb6.append(r6Var.o());
        sb6.append("/wenoteupload.htm");
        return sb6.toString();
    }

    public static java.lang.String c() {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(a(true), "wenote/image/localpath");
        if (!r6Var.m()) {
            r6Var.J();
        }
        return r6Var.o();
    }
}
