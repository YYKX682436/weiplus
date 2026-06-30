package d55;

/* loaded from: classes12.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f226603a = new java.util.LinkedList();

    public static void a(int i17, java.lang.String str, java.lang.String str2) {
        d55.p0 p0Var = (d55.p0) d55.p0.f226604f.a();
        if (p0Var == null) {
            p0Var = new d55.p0();
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String name = java.lang.Thread.currentThread().getName();
        p0Var.f226606a = i17;
        p0Var.f226607b = currentTimeMillis;
        p0Var.f226608c = str;
        p0Var.f226610e = name;
        p0Var.f226609d = str2;
        synchronized (d55.o0.class) {
            ((java.util.LinkedList) f226603a).add(p0Var);
        }
    }
}
