package fn5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final fn5.p0 f264747d;

    /* renamed from: e, reason: collision with root package name */
    public static final fn5.p0 f264748e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ fn5.p0[] f264749f;

    static {
        fn5.p0 p0Var = new fn5.p0("NORMAL", 0);
        f264747d = p0Var;
        fn5.p0 p0Var2 = new fn5.p0("PERSON", 1);
        f264748e = p0Var2;
        fn5.p0[] p0VarArr = {p0Var, p0Var2};
        f264749f = p0VarArr;
        rz5.b.a(p0VarArr);
    }

    public p0(java.lang.String str, int i17) {
    }

    public static fn5.p0 valueOf(java.lang.String str) {
        return (fn5.p0) java.lang.Enum.valueOf(fn5.p0.class, str);
    }

    public static fn5.p0[] values() {
        return (fn5.p0[]) f264749f.clone();
    }
}
