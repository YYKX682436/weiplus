package fn2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class v1 {

    /* renamed from: e, reason: collision with root package name */
    public static final fn2.v1 f264422e;

    /* renamed from: f, reason: collision with root package name */
    public static final fn2.v1 f264423f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ fn2.v1[] f264424g;

    /* renamed from: d, reason: collision with root package name */
    public final int f264425d;

    static {
        fn2.v1 v1Var = new fn2.v1("REQUEST_SONG", 0, 0);
        f264422e = v1Var;
        fn2.v1 v1Var2 = new fn2.v1("PLAYLIST", 1, 1);
        f264423f = v1Var2;
        fn2.v1[] v1VarArr = {v1Var, v1Var2};
        f264424g = v1VarArr;
        rz5.b.a(v1VarArr);
    }

    public v1(java.lang.String str, int i17, int i18) {
        this.f264425d = i18;
    }

    public static fn2.v1 valueOf(java.lang.String str) {
        return (fn2.v1) java.lang.Enum.valueOf(fn2.v1.class, str);
    }

    public static fn2.v1[] values() {
        return (fn2.v1[]) f264424g.clone();
    }
}
