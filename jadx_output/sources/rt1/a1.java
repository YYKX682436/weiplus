package rt1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class a1 {

    /* renamed from: d, reason: collision with root package name */
    public static final rt1.a1 f399384d;

    /* renamed from: e, reason: collision with root package name */
    public static final rt1.a1 f399385e;

    /* renamed from: f, reason: collision with root package name */
    public static final rt1.a1 f399386f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ rt1.a1[] f399387g;

    static {
        rt1.a1 a1Var = new rt1.a1("FETCH_DATA_NO_CACHE", 0);
        f399384d = a1Var;
        rt1.a1 a1Var2 = new rt1.a1("FETCH_DATA_WITH_CACHE", 1);
        f399385e = a1Var2;
        rt1.a1 a1Var3 = new rt1.a1("SYNC_DATA_MODIFICATION", 2);
        f399386f = a1Var3;
        rt1.a1[] a1VarArr = {a1Var, a1Var2, a1Var3};
        f399387g = a1VarArr;
        rz5.b.a(a1VarArr);
    }

    public a1(java.lang.String str, int i17) {
    }

    public static rt1.a1 valueOf(java.lang.String str) {
        return (rt1.a1) java.lang.Enum.valueOf(rt1.a1.class, str);
    }

    public static rt1.a1[] values() {
        return (rt1.a1[]) f399387g.clone();
    }
}
