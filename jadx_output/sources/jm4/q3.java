package jm4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class q3 {

    /* renamed from: e, reason: collision with root package name */
    public static final jm4.p3 f300406e;

    /* renamed from: f, reason: collision with root package name */
    public static final jm4.q3 f300407f;

    /* renamed from: g, reason: collision with root package name */
    public static final jm4.q3 f300408g;

    /* renamed from: h, reason: collision with root package name */
    public static final jm4.q3 f300409h;

    /* renamed from: i, reason: collision with root package name */
    public static final jm4.q3 f300410i;

    /* renamed from: m, reason: collision with root package name */
    public static final jm4.q3 f300411m;

    /* renamed from: n, reason: collision with root package name */
    public static final jm4.q3 f300412n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ jm4.q3[] f300413o;

    /* renamed from: d, reason: collision with root package name */
    public final int f300414d;

    static {
        jm4.q3 q3Var = new jm4.q3("BASE", 0, 0);
        f300407f = q3Var;
        jm4.q3 q3Var2 = new jm4.q3(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 1, 1);
        f300408g = q3Var2;
        jm4.q3 q3Var3 = new jm4.q3("LIVE", 2, 2);
        f300409h = q3Var3;
        jm4.q3 q3Var4 = new jm4.q3("CHAT_ROOM", 3, 3);
        f300410i = q3Var4;
        jm4.q3 q3Var5 = new jm4.q3("BASIC", 4, 4);
        f300411m = q3Var5;
        jm4.q3 q3Var6 = new jm4.q3("MAX", 5, 4);
        jm4.q3 q3Var7 = new jm4.q3("MIN", 6, 0);
        f300412n = q3Var7;
        jm4.q3[] q3VarArr = {q3Var, q3Var2, q3Var3, q3Var4, q3Var5, q3Var6, q3Var7, new jm4.q3("COUNT", 7, 5)};
        f300413o = q3VarArr;
        rz5.b.a(q3VarArr);
        f300406e = new jm4.p3(null);
    }

    public q3(java.lang.String str, int i17, int i18) {
        this.f300414d = i18;
    }

    public static jm4.q3 valueOf(java.lang.String str) {
        return (jm4.q3) java.lang.Enum.valueOf(jm4.q3.class, str);
    }

    public static jm4.q3[] values() {
        return (jm4.q3[]) f300413o.clone();
    }
}
