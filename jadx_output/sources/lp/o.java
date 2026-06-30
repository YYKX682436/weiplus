package lp;

/* loaded from: classes12.dex */
public final class o implements q25.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f320236a = 0;

    static {
        q25.b.b(new lp.o(), "//testsocfeatures");
    }

    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        wo.s1 s1Var = wo.t1.f447800a;
        rk0.c.c("MicroMsg.SoCFeaturesTest", "getCPUHardware() => %s", s1Var.b());
        rk0.c.c("MicroMsg.SoCFeaturesTest", "getCPUInfo() => %s", s1Var.c());
        rk0.c.c("MicroMsg.SoCFeaturesTest", "getCPUCoreCount() => %s", java.lang.Integer.valueOf(s1Var.a()));
        java.util.Map c17 = s1Var.c();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
        sb6.append(": ");
        sb6.append((java.lang.String) c17.get("Features"));
        sb6.append(": ");
        sb6.append((java.lang.String) c17.get("Processor"));
        sb6.append(": ");
        sb6.append((java.lang.String) c17.get("CPU architecture"));
        sb6.append(": ");
        sb6.append((java.lang.String) c17.get("Hardware"));
        sb6.append(": ");
        sb6.append((java.lang.String) c17.get("Serial"));
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        rk0.c.c("MicroMsg.SoCFeaturesTest", "getCPUID() => %s", sb7);
        return true;
    }
}
