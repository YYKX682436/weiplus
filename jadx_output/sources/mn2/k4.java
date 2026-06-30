package mn2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class k4 {

    /* renamed from: e, reason: collision with root package name */
    public static final mn2.k4 f330036e;

    /* renamed from: f, reason: collision with root package name */
    public static final mn2.k4 f330037f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ mn2.k4[] f330038g;

    /* renamed from: d, reason: collision with root package name */
    public final int f330039d;

    static {
        mn2.k4 k4Var = new mn2.k4("SMALL", 0, 30);
        f330036e = k4Var;
        mn2.k4 k4Var2 = new mn2.k4("BIG", 1, 100);
        f330037f = k4Var2;
        mn2.k4[] k4VarArr = {k4Var, k4Var2};
        f330038g = k4VarArr;
        rz5.b.a(k4VarArr);
    }

    public k4(java.lang.String str, int i17, int i18) {
        this.f330039d = i18;
    }

    public static mn2.k4 valueOf(java.lang.String str) {
        return (mn2.k4) java.lang.Enum.valueOf(mn2.k4.class, str);
    }

    public static mn2.k4[] values() {
        return (mn2.k4[]) f330038g.clone();
    }
}
