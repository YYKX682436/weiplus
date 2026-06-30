package ob1;

/* loaded from: classes7.dex */
public class m {

    /* renamed from: e, reason: collision with root package name */
    public static final ob1.m f344018e = new ob1.m(0, "", jc1.f.f298912a, null);

    /* renamed from: f, reason: collision with root package name */
    public static final ob1.m f344019f = new ob1.m(-1, "fail:internal error", jc1.c.H, null);

    /* renamed from: g, reason: collision with root package name */
    public static final ob1.m f344020g;

    /* renamed from: h, reason: collision with root package name */
    public static final ob1.m f344021h;

    /* renamed from: i, reason: collision with root package name */
    public static final ob1.m f344022i;

    /* renamed from: j, reason: collision with root package name */
    public static final ob1.m f344023j;

    /* renamed from: k, reason: collision with root package name */
    public static final ob1.m f344024k;

    /* renamed from: l, reason: collision with root package name */
    public static final ob1.m f344025l;

    /* renamed from: m, reason: collision with root package name */
    public static final ob1.m f344026m;

    /* renamed from: n, reason: collision with root package name */
    public static final ob1.m f344027n;

    /* renamed from: o, reason: collision with root package name */
    public static final ob1.m f344028o;

    /* renamed from: p, reason: collision with root package name */
    public static final ob1.m f344029p;

    /* renamed from: q, reason: collision with root package name */
    public static final ob1.m f344030q;

    /* renamed from: r, reason: collision with root package name */
    public static final ob1.m f344031r;

    /* renamed from: s, reason: collision with root package name */
    public static final ob1.m f344032s;

    /* renamed from: t, reason: collision with root package name */
    public static final ob1.m f344033t;

    /* renamed from: u, reason: collision with root package name */
    public static final ob1.m f344034u;

    /* renamed from: v, reason: collision with root package name */
    public static final ob1.m f344035v;

    /* renamed from: w, reason: collision with root package name */
    public static final ob1.m f344036w;

    /* renamed from: x, reason: collision with root package name */
    public static final ob1.m f344037x;

    /* renamed from: a, reason: collision with root package name */
    public final int f344038a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f344039b;

    /* renamed from: c, reason: collision with root package name */
    public final jc1.d f344040c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f344041d;

    static {
        jc1.d dVar = jc1.c.f298880d;
        f344020g = new ob1.m(-1, "fail:internal error", dVar, null);
        f344021h = new ob1.m(10000, "fail:not init", jc1.c.f298877a, null);
        f344022i = new ob1.m(10001, "fail:not available", jc1.c.f298878b, null);
        f344023j = new ob1.m(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID, "fail:no service", jc1.c.f298879c, null);
        f344024k = new ob1.m(10005, "fail:no characteristic", jc1.c.f298876J, null);
        f344025l = new ob1.m(10006, "fail:no connection", jc1.c.K, null);
        jc1.d dVar2 = jc1.c.L;
        f344026m = new ob1.m(10007, "fail:property not support", dVar2, null);
        f344027n = new ob1.m(10008, "fail:system error", dVar, null);
        f344028o = new ob1.m(10009, "fail:system not support", jc1.c.f298881e, null);
        f344029p = new ob1.m(10008, "fail:no descriptor", dVar, null);
        f344030q = new ob1.m(10008, "fail:fail to set descriptor", dVar, null);
        f344031r = new ob1.m(10008, "fail:fail to write descriptor", dVar, null);
        f344032s = new ob1.m(10012, "fail:operate time out", jc1.c.M, null);
        f344033t = new ob1.m(-1, "fail:already connect", jc1.c.N, null);
        f344034u = new ob1.m(10013, "fail:invalid data", jc1.f.f298919h, null);
        f344035v = new ob1.m(10014, "fail:need pin", jc1.c.P, null);
        f344036w = new ob1.m(-1, "fail:location permission is denied", jc1.c.O, null);
        f344037x = new ob1.m(10007, "fail:The writeType is not supported", dVar2, null);
    }

    public m(int i17, java.lang.String str, jc1.d dVar, java.lang.Object obj) {
        this.f344038a = i17;
        this.f344039b = str;
        this.f344040c = dVar;
        this.f344041d = obj;
    }

    public static ob1.m a(java.lang.String str) {
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        jc1.d dVar = jc1.c.f298880d;
        if (isEmpty) {
            return new ob1.m(-1, "fail:system error", dVar, null);
        }
        return new ob1.m(-1, "fail:system error, " + str, dVar, null);
    }

    public static ob1.m b(java.lang.String str) {
        return new ob1.m(10008, "fail:system error, " + str, jc1.c.f298880d, null);
    }

    public java.lang.String toString() {
        return "Result{errCode=" + this.f344038a + ", errMsg='" + this.f344039b + "', errorInfo=" + this.f344040c + ", retObj=" + this.f344041d + '}';
    }
}
