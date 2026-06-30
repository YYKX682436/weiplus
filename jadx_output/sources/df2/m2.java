package df2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class m2 {

    /* renamed from: d, reason: collision with root package name */
    public static final df2.m2 f230745d;

    /* renamed from: e, reason: collision with root package name */
    public static final df2.m2 f230746e;

    /* renamed from: f, reason: collision with root package name */
    public static final df2.m2 f230747f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ df2.m2[] f230748g;

    static {
        df2.m2 m2Var = new df2.m2("IDLE", 0);
        f230745d = m2Var;
        df2.m2 m2Var2 = new df2.m2("WAITING", 1);
        f230746e = m2Var2;
        df2.m2 m2Var3 = new df2.m2("LINKING", 2);
        f230747f = m2Var3;
        df2.m2[] m2VarArr = {m2Var, m2Var2, m2Var3};
        f230748g = m2VarArr;
        rz5.b.a(m2VarArr);
    }

    public m2(java.lang.String str, int i17) {
    }

    public static df2.m2 valueOf(java.lang.String str) {
        return (df2.m2) java.lang.Enum.valueOf(df2.m2.class, str);
    }

    public static df2.m2[] values() {
        return (df2.m2[]) f230748g.clone();
    }
}
