package mm2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class k6 {

    /* renamed from: d, reason: collision with root package name */
    public static final mm2.k6 f329199d;

    /* renamed from: e, reason: collision with root package name */
    public static final mm2.k6 f329200e;

    /* renamed from: f, reason: collision with root package name */
    public static final mm2.k6 f329201f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ mm2.k6[] f329202g;

    static {
        mm2.k6 k6Var = new mm2.k6("ORDER", 0);
        f329199d = k6Var;
        mm2.k6 k6Var2 = new mm2.k6("SINGLE_LOOP", 1);
        f329200e = k6Var2;
        mm2.k6 k6Var3 = new mm2.k6("RANDOM", 2);
        f329201f = k6Var3;
        mm2.k6[] k6VarArr = {k6Var, k6Var2, k6Var3};
        f329202g = k6VarArr;
        rz5.b.a(k6VarArr);
    }

    public k6(java.lang.String str, int i17) {
    }

    public static mm2.k6 valueOf(java.lang.String str) {
        return (mm2.k6) java.lang.Enum.valueOf(mm2.k6.class, str);
    }

    public static mm2.k6[] values() {
        return (mm2.k6[]) f329202g.clone();
    }
}
