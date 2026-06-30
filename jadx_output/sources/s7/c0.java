package s7;

/* loaded from: classes16.dex */
public class c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final s7.c0 f403605c = new s7.c0(s7.a0.none, null);

    /* renamed from: d, reason: collision with root package name */
    public static final s7.c0 f403606d = new s7.c0(s7.a0.xMidYMid, s7.b0.meet);

    /* renamed from: a, reason: collision with root package name */
    public final s7.a0 f403607a;

    /* renamed from: b, reason: collision with root package name */
    public final s7.b0 f403608b;

    public c0(s7.a0 a0Var, s7.b0 b0Var) {
        this.f403607a = a0Var;
        this.f403608b = b0Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s7.c0.class != obj.getClass()) {
            return false;
        }
        s7.c0 c0Var = (s7.c0) obj;
        return this.f403607a == c0Var.f403607a && this.f403608b == c0Var.f403608b;
    }

    public java.lang.String toString() {
        return this.f403607a + " " + this.f403608b;
    }
}
