package df2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class l2 {

    /* renamed from: d, reason: collision with root package name */
    public static final df2.l2 f230622d;

    /* renamed from: e, reason: collision with root package name */
    public static final df2.l2 f230623e;

    /* renamed from: f, reason: collision with root package name */
    public static final df2.l2 f230624f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ df2.l2[] f230625g;

    static {
        df2.l2 l2Var = new df2.l2("IDLE", 0);
        f230622d = l2Var;
        df2.l2 l2Var2 = new df2.l2("SHOWING", 1);
        f230623e = l2Var2;
        df2.l2 l2Var3 = new df2.l2("HIDING", 2);
        f230624f = l2Var3;
        df2.l2[] l2VarArr = {l2Var, l2Var2, l2Var3};
        f230625g = l2VarArr;
        rz5.b.a(l2VarArr);
    }

    public l2(java.lang.String str, int i17) {
    }

    public static df2.l2 valueOf(java.lang.String str) {
        return (df2.l2) java.lang.Enum.valueOf(df2.l2.class, str);
    }

    public static df2.l2[] values() {
        return (df2.l2[]) f230625g.clone();
    }
}
