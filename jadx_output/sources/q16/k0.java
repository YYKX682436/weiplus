package q16;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final q16.k0 f359765d;

    /* renamed from: e, reason: collision with root package name */
    public static final q16.k0 f359766e;

    /* renamed from: f, reason: collision with root package name */
    public static final q16.k0 f359767f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ q16.k0[] f359768g;

    static {
        q16.k0 k0Var = new q16.k0(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BOTH_PATTERN, 0);
        f359765d = k0Var;
        q16.k0 k0Var2 = new q16.k0("ONLY_NON_SYNTHESIZED", 1);
        f359766e = k0Var2;
        q16.k0 k0Var3 = new q16.k0("NONE", 2);
        f359767f = k0Var3;
        q16.k0[] k0VarArr = {k0Var, k0Var2, k0Var3};
        f359768g = k0VarArr;
        rz5.b.a(k0VarArr);
    }

    public k0(java.lang.String str, int i17) {
    }

    public static q16.k0 valueOf(java.lang.String str) {
        return (q16.k0) java.lang.Enum.valueOf(q16.k0.class, str);
    }

    public static q16.k0[] values() {
        return (q16.k0[]) f359768g.clone();
    }
}
