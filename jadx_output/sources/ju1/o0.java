package ju1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class o0 {

    /* renamed from: e, reason: collision with root package name */
    public static final ju1.o0 f301775e;

    /* renamed from: f, reason: collision with root package name */
    public static final ju1.o0 f301776f;

    /* renamed from: g, reason: collision with root package name */
    public static final ju1.o0 f301777g;

    /* renamed from: h, reason: collision with root package name */
    public static final ju1.o0 f301778h;

    /* renamed from: i, reason: collision with root package name */
    public static final ju1.o0 f301779i;

    /* renamed from: m, reason: collision with root package name */
    public static final ju1.o0 f301780m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ ju1.o0[] f301781n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f301782d;

    static {
        ju1.o0 o0Var = new ju1.o0("IDLE", 0, "");
        f301775e = o0Var;
        ju1.o0 o0Var2 = new ju1.o0("LOADING", 1, "");
        f301776f = o0Var2;
        ju1.o0 o0Var3 = new ju1.o0("DELETING", 2, "");
        f301777g = o0Var3;
        ju1.o0 o0Var4 = new ju1.o0("INCOMPLETE", 3, "");
        f301778h = o0Var4;
        ju1.o0 o0Var5 = new ju1.o0("UP_TO_DATE", 4, "");
        f301779i = o0Var5;
        ju1.o0 o0Var6 = new ju1.o0("FAILED", 5, "");
        f301780m = o0Var6;
        ju1.o0[] o0VarArr = {o0Var, o0Var2, o0Var3, o0Var4, o0Var5, o0Var6};
        f301781n = o0VarArr;
        rz5.b.a(o0VarArr);
    }

    public o0(java.lang.String str, int i17, java.lang.String str2) {
        this.f301782d = str2;
    }

    public static ju1.o0 valueOf(java.lang.String str) {
        return (ju1.o0) java.lang.Enum.valueOf(ju1.o0.class, str);
    }

    public static ju1.o0[] values() {
        return (ju1.o0[]) f301781n.clone();
    }
}
