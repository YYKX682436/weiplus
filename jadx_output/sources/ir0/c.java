package ir0;

/* loaded from: classes11.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final ir0.c f293924d = new ir0.c();

    public c() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        long j17;
        java.lang.String task = (java.lang.String) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        kotlin.jvm.internal.o.g(task, "task");
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            ri.i0 i0Var = ri.k0.f395920a;
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("@[0-9a-z]+");
            kotlin.jvm.internal.o.f(compile, "compile(...)");
            java.lang.String replaceAll = compile.matcher(task).replaceAll("");
            kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
            j17 = longValue;
            str = task;
            i0Var.a(new ri.j0(100, null, 0, 0, longValue, 0L, 0L, 0, replaceAll, 0, null, 0, null, 0L, 0L, 0L, null, null, 0, 0, 0, 0, 0, 0L, null, null, null, 0, 0, null, null, 0, 0, -274, 1, null));
        } else {
            str = task;
            j17 = longValue;
        }
        oj.j.b("MicroMsg.MatrixLifecycleBoot", "heavy task(cost " + j17 + "ms):" + str, new java.lang.Object[0]);
        return jz5.f0.f302826a;
    }
}
