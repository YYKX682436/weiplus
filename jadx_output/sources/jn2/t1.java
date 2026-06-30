package jn2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class t1 {

    /* renamed from: d, reason: collision with root package name */
    public static final jn2.t1 f300704d;

    /* renamed from: e, reason: collision with root package name */
    public static final jn2.t1 f300705e;

    /* renamed from: f, reason: collision with root package name */
    public static final jn2.t1 f300706f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ jn2.t1[] f300707g;

    static {
        jn2.t1 t1Var = new jn2.t1(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0);
        f300704d = t1Var;
        jn2.t1 t1Var2 = new jn2.t1("SING_PREPARING", 1);
        f300705e = t1Var2;
        jn2.t1 t1Var3 = new jn2.t1("SING_PLAYING", 2);
        f300706f = t1Var3;
        jn2.t1[] t1VarArr = {t1Var, t1Var2, t1Var3};
        f300707g = t1VarArr;
        rz5.b.a(t1VarArr);
    }

    public t1(java.lang.String str, int i17) {
    }

    public static jn2.t1 valueOf(java.lang.String str) {
        return (jn2.t1) java.lang.Enum.valueOf(jn2.t1.class, str);
    }

    public static jn2.t1[] values() {
        return (jn2.t1[]) f300707g.clone();
    }
}
