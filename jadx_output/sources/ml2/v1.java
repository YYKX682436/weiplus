package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class v1 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.v1 f328140e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.v1 f328141f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.v1 f328142g;

    /* renamed from: h, reason: collision with root package name */
    public static final ml2.v1 f328143h;

    /* renamed from: i, reason: collision with root package name */
    public static final ml2.v1 f328144i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ ml2.v1[] f328145m;

    /* renamed from: d, reason: collision with root package name */
    public final long f328146d;

    static {
        ml2.v1 v1Var = new ml2.v1("LIVE_LIVING", 0, 1L);
        f328140e = v1Var;
        ml2.v1 v1Var2 = new ml2.v1("LIVE_STOPPED", 1, 2L);
        f328141f = v1Var2;
        ml2.v1 v1Var3 = new ml2.v1("LIVE_FORBIDDEN", 2, 3L);
        f328142g = v1Var3;
        ml2.v1 v1Var4 = new ml2.v1("LIVE_IN_BLACK_LIST", 3, 5L);
        f328143h = v1Var4;
        ml2.v1 v1Var5 = new ml2.v1("LIVE_NO_ACCESS_PERMISSION", 4, 6L);
        f328144i = v1Var5;
        ml2.v1[] v1VarArr = {v1Var, v1Var2, v1Var3, v1Var4, v1Var5, new ml2.v1("LIVE_OVERLOAD", 5, 7L)};
        f328145m = v1VarArr;
        rz5.b.a(v1VarArr);
    }

    public v1(java.lang.String str, int i17, long j17) {
        this.f328146d = j17;
    }

    public static ml2.v1 valueOf(java.lang.String str) {
        return (ml2.v1) java.lang.Enum.valueOf(ml2.v1.class, str);
    }

    public static ml2.v1[] values() {
        return (ml2.v1[]) f328145m.clone();
    }
}
