package g26;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes16.dex */
public abstract class d0 {

    /* renamed from: d, reason: collision with root package name */
    public static final g26.d0 f267986d;

    /* renamed from: e, reason: collision with root package name */
    public static final g26.d0 f267987e;

    /* renamed from: f, reason: collision with root package name */
    public static final g26.d0 f267988f;

    /* renamed from: g, reason: collision with root package name */
    public static final g26.d0 f267989g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ g26.d0[] f267990h;

    static {
        final java.lang.String str = "START";
        final int i17 = 0;
        g26.d0 d0Var = new g26.d0(str, i17) { // from class: g26.b0
            @Override // g26.d0
            public g26.d0 a(f26.c3 nextType) {
                kotlin.jvm.internal.o.g(nextType, "nextType");
                return b(nextType);
            }
        };
        f267986d = d0Var;
        final java.lang.String str2 = "ACCEPT_NULL";
        final int i18 = 1;
        g26.d0 d0Var2 = new g26.d0(str2, i18) { // from class: g26.z
            @Override // g26.d0
            public g26.d0 a(f26.c3 nextType) {
                kotlin.jvm.internal.o.g(nextType, "nextType");
                return b(nextType);
            }
        };
        f267987e = d0Var2;
        final java.lang.String str3 = "UNKNOWN";
        final int i19 = 2;
        g26.d0 d0Var3 = new g26.d0(str3, i19) { // from class: g26.c0
            @Override // g26.d0
            public g26.d0 a(f26.c3 nextType) {
                kotlin.jvm.internal.o.g(nextType, "nextType");
                g26.d0 b17 = b(nextType);
                return b17 == g26.d0.f267987e ? this : b17;
            }
        };
        f267988f = d0Var3;
        final java.lang.String str4 = "NOT_NULL";
        final int i27 = 3;
        g26.d0 d0Var4 = new g26.d0(str4, i27) { // from class: g26.a0
            @Override // g26.d0
            public g26.d0 a(f26.c3 nextType) {
                kotlin.jvm.internal.o.g(nextType, "nextType");
                return this;
            }
        };
        f267989g = d0Var4;
        g26.d0[] d0VarArr = {d0Var, d0Var2, d0Var3, d0Var4};
        f267990h = d0VarArr;
        rz5.b.a(d0VarArr);
    }

    public d0(java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
    }

    public static g26.d0 valueOf(java.lang.String str) {
        return (g26.d0) java.lang.Enum.valueOf(g26.d0.class, str);
    }

    public static g26.d0[] values() {
        return (g26.d0[]) f267990h.clone();
    }

    public abstract g26.d0 a(f26.c3 c3Var);

    public final g26.d0 b(f26.c3 c3Var) {
        kotlin.jvm.internal.o.g(c3Var, "<this>");
        if (c3Var.x0()) {
            return f267987e;
        }
        if (c3Var instanceof f26.v) {
        }
        return f26.c.f259137a.a(g26.a.a(false, true, g26.w.f268018a, null, null, 24, null), f26.h0.c(c3Var), f26.x1.f259234a) ? f267989g : f267988f;
    }
}
