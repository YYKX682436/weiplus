package w71;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class a1 {

    /* renamed from: e, reason: collision with root package name */
    public static final w71.a1 f443379e;

    /* renamed from: f, reason: collision with root package name */
    public static final w71.a1 f443380f;

    /* renamed from: g, reason: collision with root package name */
    public static final w71.a1 f443381g;

    /* renamed from: h, reason: collision with root package name */
    public static final w71.a1 f443382h;

    /* renamed from: i, reason: collision with root package name */
    public static final w71.a1 f443383i;

    /* renamed from: m, reason: collision with root package name */
    public static final w71.a1 f443384m;

    /* renamed from: n, reason: collision with root package name */
    public static final w71.a1 f443385n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ w71.a1[] f443386o;

    /* renamed from: d, reason: collision with root package name */
    public final int f443387d;

    static {
        w71.a1 a1Var = new w71.a1("UNKNOWN", 0, 0);
        f443379e = a1Var;
        w71.a1 a1Var2 = new w71.a1("WIFI", 1, 1);
        f443380f = a1Var2;
        w71.a1 a1Var3 = new w71.a1("CELLULAR_2G", 2, 2);
        f443381g = a1Var3;
        w71.a1 a1Var4 = new w71.a1("CELLULAR_3G", 3, 3);
        f443382h = a1Var4;
        w71.a1 a1Var5 = new w71.a1("CELLULAR_4G", 4, 4);
        f443383i = a1Var5;
        w71.a1 a1Var6 = new w71.a1("CELLULAR_5G", 5, 5);
        f443384m = a1Var6;
        w71.a1 a1Var7 = new w71.a1("NON", 6, 10001);
        f443385n = a1Var7;
        w71.a1[] a1VarArr = {a1Var, a1Var2, a1Var3, a1Var4, a1Var5, a1Var6, a1Var7, new w71.a1("MAX", 7, 10001), new w71.a1("MIN", 8, 0), new w71.a1("COUNT", 9, 7)};
        f443386o = a1VarArr;
        rz5.b.a(a1VarArr);
    }

    public a1(java.lang.String str, int i17, int i18) {
        this.f443387d = i18;
    }

    public static w71.a1 valueOf(java.lang.String str) {
        return (w71.a1) java.lang.Enum.valueOf(w71.a1.class, str);
    }

    public static w71.a1[] values() {
        return (w71.a1[]) f443386o.clone();
    }
}
