package e40;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class a0 {

    /* renamed from: e, reason: collision with root package name */
    public static final e40.z f247602e;

    /* renamed from: f, reason: collision with root package name */
    public static final e40.a0 f247603f;

    /* renamed from: g, reason: collision with root package name */
    public static final e40.a0 f247604g;

    /* renamed from: h, reason: collision with root package name */
    public static final e40.a0 f247605h;

    /* renamed from: i, reason: collision with root package name */
    public static final e40.a0 f247606i;

    /* renamed from: m, reason: collision with root package name */
    public static final e40.a0 f247607m;

    /* renamed from: n, reason: collision with root package name */
    public static final e40.a0 f247608n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ e40.a0[] f247609o;

    /* renamed from: d, reason: collision with root package name */
    public final int f247610d;

    static {
        e40.a0 a0Var = new e40.a0(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0, 0);
        f247603f = a0Var;
        e40.a0 a0Var2 = new e40.a0("DOWNLOADING", 1, 1);
        f247604g = a0Var2;
        e40.a0 a0Var3 = new e40.a0("PAUSE", 2, 2);
        e40.a0 a0Var4 = new e40.a0("CANCEL", 3, 3);
        f247605h = a0Var4;
        e40.a0 a0Var5 = new e40.a0("FAIL", 4, 4);
        f247606i = a0Var5;
        e40.a0 a0Var6 = new e40.a0("DOWNLOADED", 5, 5);
        f247607m = a0Var6;
        e40.a0 a0Var7 = new e40.a0("SAVED", 6, 6);
        f247608n = a0Var7;
        e40.a0[] a0VarArr = {a0Var, a0Var2, a0Var3, a0Var4, a0Var5, a0Var6, a0Var7};
        f247609o = a0VarArr;
        rz5.b.a(a0VarArr);
        f247602e = new e40.z(null);
    }

    public a0(java.lang.String str, int i17, int i18) {
        this.f247610d = i18;
    }

    public static e40.a0 valueOf(java.lang.String str) {
        return (e40.a0) java.lang.Enum.valueOf(e40.a0.class, str);
    }

    public static e40.a0[] values() {
        return (e40.a0[]) f247609o.clone();
    }
}
