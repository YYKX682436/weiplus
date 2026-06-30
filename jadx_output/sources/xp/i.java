package xp;

/* loaded from: classes10.dex */
public class i {

    /* renamed from: v, reason: collision with root package name */
    public static boolean f455842v = true;

    /* renamed from: w, reason: collision with root package name */
    public static float f455843w = -1.0f;

    /* renamed from: a, reason: collision with root package name */
    public int f455844a;

    /* renamed from: b, reason: collision with root package name */
    public int f455845b;

    /* renamed from: c, reason: collision with root package name */
    public int f455846c;

    /* renamed from: d, reason: collision with root package name */
    public int f455847d;

    /* renamed from: e, reason: collision with root package name */
    public int f455848e;

    /* renamed from: f, reason: collision with root package name */
    public float f455849f;

    /* renamed from: g, reason: collision with root package name */
    public float f455850g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f455851h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f455852i;

    /* renamed from: j, reason: collision with root package name */
    public int f455853j;

    /* renamed from: k, reason: collision with root package name */
    public int f455854k;

    /* renamed from: l, reason: collision with root package name */
    public float f455855l;

    /* renamed from: m, reason: collision with root package name */
    public float f455856m;

    /* renamed from: n, reason: collision with root package name */
    public float f455857n;

    /* renamed from: o, reason: collision with root package name */
    public float f455858o;

    /* renamed from: q, reason: collision with root package name */
    public float f455860q;

    /* renamed from: r, reason: collision with root package name */
    public int f455861r;

    /* renamed from: t, reason: collision with root package name */
    public java.util.LinkedList f455863t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.List f455864u;

    /* renamed from: p, reason: collision with root package name */
    public boolean f455859p = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f455862s = false;

    public i() {
        this.f455851h = true;
        android.content.Context context = vp.c.f438736a;
        if (context == null) {
            throw new java.lang.RuntimeException("Danmaku not init, please call DanmakuConfig.init()");
        }
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i17 = displayMetrics.widthPixels;
        int i18 = displayMetrics.heightPixels;
        if (this.f455859p) {
            this.f455854k = java.lang.Math.max(i17, i18);
            this.f455853j = java.lang.Math.min(i17, i18);
        } else {
            this.f455854k = java.lang.Math.min(i17, i18);
            this.f455853j = java.lang.Math.max(i17, i18);
        }
        this.f455844a = 8000;
        this.f455845b = a(12);
        this.f455846c = 3;
        this.f455861r = 3;
        this.f455847d = a(1.5f);
        this.f455848e = a(1);
        this.f455849f = a(5.0f);
        this.f455850g = a(5.0f);
        this.f455851h = true;
        this.f455852i = true;
        this.f455855l = a(16.0f);
        this.f455856m = 0.0f;
        this.f455857n = a(5.0f);
        this.f455858o = a(4.0f);
        this.f455860q = 1.0f;
    }

    public static int a(float f17) {
        if (f455843w < 0.0f) {
            f455843w = xp.d.b().getResources().getDisplayMetrics().density;
        }
        return (int) ((f17 * f455843w) + 0.5f);
    }

    public void b(boolean z17) {
        if (this.f455859p != z17) {
            int i17 = this.f455853j;
            this.f455853j = this.f455854k;
            this.f455854k = i17;
        }
        this.f455859p = z17;
    }
}
