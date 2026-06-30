package xj5;

/* loaded from: classes5.dex */
public abstract class a implements xj5.e {

    /* renamed from: g, reason: collision with root package name */
    public static final int f454885g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f454886h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f454887i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f454888m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f454889n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f454890o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f454891p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f454892q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f454893r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f454894s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f454895t;

    /* renamed from: d, reason: collision with root package name */
    public int f454896d;

    /* renamed from: e, reason: collision with root package name */
    public int f454897e = -1;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f454898f;

    static {
        int i17 = f454885g;
        int i18 = i17 + 1;
        f454885g = i18;
        f454886h = i17;
        int i19 = i18 + 1;
        f454885g = i19;
        f454887i = i18;
        int i27 = i19 + 1;
        f454885g = i27;
        f454888m = i19;
        int i28 = i27 + 1;
        f454885g = i28;
        f454889n = i27;
        int i29 = i28 + 1;
        f454885g = i29;
        f454890o = i28;
        int i37 = i29 + 1;
        f454885g = i37;
        f454891p = i29;
        int i38 = i37 + 1;
        f454885g = i38;
        f454892q = i37;
        int i39 = i38 + 1;
        f454885g = i39;
        f454893r = i38;
        int i47 = i39 + 1;
        f454885g = i47;
        f454894s = i39;
        f454885g = i47 + 1;
        f454895t = i47;
    }

    public java.util.Map a() {
        return null;
    }

    public final java.util.Map b() {
        java.util.Map a17 = a();
        java.util.Map k17 = kz5.c1.k(new jz5.l("group_bar_position_index", java.lang.Integer.valueOf(this.f454896d)), new jz5.l("group_bar_item_type", java.lang.Integer.valueOf(c())));
        if (a17 != null) {
            k17 = kz5.c1.m(k17, a17);
        }
        java.util.Map map = this.f454898f;
        return map != null ? kz5.c1.m(k17, map) : k17;
    }

    public abstract int c();

    public boolean d(xj5.a other) {
        kotlin.jvm.internal.o.g(other, "other");
        return false;
    }
}
