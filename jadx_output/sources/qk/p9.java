package qk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p9 {

    /* renamed from: d, reason: collision with root package name */
    public static final qk.p9 f364312d;

    /* renamed from: e, reason: collision with root package name */
    public static final qk.p9 f364313e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ qk.p9[] f364314f;

    static {
        qk.p9 p9Var = new qk.p9(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0);
        f364312d = p9Var;
        qk.p9 p9Var2 = new qk.p9("BIZ_AUDIO", 1);
        f364313e = p9Var2;
        qk.p9[] p9VarArr = {p9Var, p9Var2};
        f364314f = p9VarArr;
        rz5.b.a(p9VarArr);
    }

    public p9(java.lang.String str, int i17) {
    }

    public static qk.p9 valueOf(java.lang.String str) {
        return (qk.p9) java.lang.Enum.valueOf(qk.p9.class, str);
    }

    public static qk.p9[] values() {
        return (qk.p9[]) f364314f.clone();
    }
}
