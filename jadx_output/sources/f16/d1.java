package f16;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d1 {

    /* renamed from: d, reason: collision with root package name */
    public static final f16.d1 f258715d;

    /* renamed from: e, reason: collision with root package name */
    public static final f16.d1 f258716e;

    /* renamed from: f, reason: collision with root package name */
    public static final f16.d1 f258717f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f16.d1[] f258718g;

    static {
        f16.d1 d1Var = new f16.d1("FLEXIBLE_LOWER", 0);
        f258715d = d1Var;
        f16.d1 d1Var2 = new f16.d1("FLEXIBLE_UPPER", 1);
        f258716e = d1Var2;
        f16.d1 d1Var3 = new f16.d1("INFLEXIBLE", 2);
        f258717f = d1Var3;
        f16.d1[] d1VarArr = {d1Var, d1Var2, d1Var3};
        f258718g = d1VarArr;
        rz5.b.a(d1VarArr);
    }

    public d1(java.lang.String str, int i17) {
    }

    public static f16.d1 valueOf(java.lang.String str) {
        return (f16.d1) java.lang.Enum.valueOf(f16.d1.class, str);
    }

    public static f16.d1[] values() {
        return (f16.d1[]) f258718g.clone();
    }
}
