package zy2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class p9 {

    /* renamed from: d, reason: collision with root package name */
    public static final zy2.p9 f477528d;

    /* renamed from: e, reason: collision with root package name */
    public static final zy2.p9 f477529e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ zy2.p9[] f477530f;

    static {
        zy2.p9 p9Var = new zy2.p9("FINDER_POI_REDIRECT_TYPE_DEFAULT", 0);
        f477528d = p9Var;
        zy2.p9 p9Var2 = new zy2.p9("FINDER_POI_REDIRECT_TYPE_POI_PAGE", 1);
        zy2.p9 p9Var3 = new zy2.p9("FINDER_POI_REDIRECT_TYPE_MPH5", 2);
        zy2.p9 p9Var4 = new zy2.p9("FINDER_POI_REDIRECT_TYPE_USER_PAGE", 3);
        zy2.p9 p9Var5 = new zy2.p9("FINDER_POI_REDIRECT_TYPE_MAP", 4);
        f477529e = p9Var5;
        zy2.p9[] p9VarArr = {p9Var, p9Var2, p9Var3, p9Var4, p9Var5};
        f477530f = p9VarArr;
        rz5.b.a(p9VarArr);
    }

    public p9(java.lang.String str, int i17) {
    }

    public static zy2.p9 valueOf(java.lang.String str) {
        return (zy2.p9) java.lang.Enum.valueOf(zy2.p9.class, str);
    }

    public static zy2.p9[] values() {
        return (zy2.p9[]) f477530f.clone();
    }
}
