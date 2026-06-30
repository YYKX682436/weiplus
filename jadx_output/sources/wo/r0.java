package wo;

/* loaded from: classes12.dex */
public abstract class r0 {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f447793c = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    public final wo.q0 f447794a;

    /* renamed from: b, reason: collision with root package name */
    public final wo.v0 f447795b;

    public r0(wo.q0 q0Var) {
        int andIncrement = f447793c.getAndIncrement();
        this.f447794a = q0Var;
        this.f447795b = new wo.v0("cached_string_" + android.os.Process.myUid() + "_" + andIncrement);
    }

    public final java.lang.String a() {
        wo.v0 v0Var = this.f447795b;
        try {
            v0Var.a();
            java.lang.String a17 = this.f447794a.a(null);
            if (android.text.TextUtils.isEmpty(a17)) {
                d();
                return e();
            }
            c();
            return a17;
        } finally {
            v0Var.c();
        }
    }

    public abstract java.lang.String b();

    public void c() {
    }

    public void d() {
    }

    public final java.lang.String e() {
        wo.v0 v0Var = this.f447795b;
        try {
            v0Var.a();
            java.lang.String b17 = b();
            if (!android.text.TextUtils.isEmpty(b17)) {
                this.f447794a.d(b17);
            }
            return b17;
        } finally {
            v0Var.c();
        }
    }

    public final void f() {
        wo.v0 v0Var = this.f447795b;
        try {
            v0Var.a();
            wo.q0 q0Var = this.f447794a;
            synchronized (q0Var.f447789c) {
                q0Var.f447787a = false;
                q0Var.f447788b = null;
                q0Var.c(null);
            }
        } finally {
            v0Var.c();
        }
    }
}
