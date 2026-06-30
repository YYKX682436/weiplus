package w11;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class p1 {

    /* renamed from: d, reason: collision with root package name */
    public static final w11.p1 f442102d;

    /* renamed from: e, reason: collision with root package name */
    public static final w11.p1 f442103e;

    /* renamed from: f, reason: collision with root package name */
    public static final w11.p1 f442104f;

    /* renamed from: g, reason: collision with root package name */
    public static final w11.p1 f442105g;

    /* renamed from: h, reason: collision with root package name */
    public static final w11.p1 f442106h;

    /* renamed from: i, reason: collision with root package name */
    public static final w11.p1 f442107i;

    /* renamed from: m, reason: collision with root package name */
    public static final w11.p1 f442108m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ w11.p1[] f442109n;

    static {
        w11.p1 p1Var = new w11.p1("TEXT", 0);
        f442102d = p1Var;
        w11.p1 p1Var2 = new w11.p1("IMAGE", 1);
        f442103e = p1Var2;
        w11.p1 p1Var3 = new w11.p1("VIDEO", 2);
        f442104f = p1Var3;
        w11.p1 p1Var4 = new w11.p1("CDN_IMAGE", 3);
        f442105g = p1Var4;
        w11.p1 p1Var5 = new w11.p1("EMOJI", 4);
        f442106h = p1Var5;
        w11.p1 p1Var6 = new w11.p1("APPMSG", 5);
        w11.p1 p1Var7 = new w11.p1(com.google.android.gms.stats.CodePackage.LOCATION, 6);
        f442107i = p1Var7;
        w11.p1 p1Var8 = new w11.p1("SHARECARD", 7);
        f442108m = p1Var8;
        w11.p1[] p1VarArr = {p1Var, p1Var2, p1Var3, p1Var4, p1Var5, p1Var6, p1Var7, p1Var8};
        f442109n = p1VarArr;
        rz5.b.a(p1VarArr);
    }

    public p1(java.lang.String str, int i17) {
    }

    public static w11.p1 valueOf(java.lang.String str) {
        return (w11.p1) java.lang.Enum.valueOf(w11.p1.class, str);
    }

    public static w11.p1[] values() {
        return (w11.p1[]) f442109n.clone();
    }
}
