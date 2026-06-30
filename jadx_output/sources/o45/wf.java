package o45;

/* loaded from: classes12.dex */
public abstract class wf extends o45.xf {

    /* renamed from: a, reason: collision with root package name */
    public static int f343023a = 2;

    /* renamed from: f, reason: collision with root package name */
    public static long f343028f;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f343024b = wo.q.f447781b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f343025c = wo.q.f447782c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f343026d = wo.q.f447783d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f343027e = wo.q.f447786g;

    /* renamed from: g, reason: collision with root package name */
    public static int f343029g = o45.zf.f343040a;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f343030h = o45.zf.f343041b;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f343031i = o45.zf.f343042c;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f343032j = o45.zf.f343043d;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f343033k = o45.zf.f343044e;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f343034l = o45.zf.f343045f;

    public static java.lang.String a() {
        return wo.q.f447784e;
    }

    public static void b(int i17) {
        o45.zf.f343040a = i17;
        o45.zf.f343044e = com.tencent.mm.sdk.platformtools.v8.a(i17);
        int i18 = o45.zf.f343040a & 255;
        o45.zf.f343041b = i18 >= 48 && i18 <= 95;
        o45.zf.f343043d = (o45.zf.f343040a & 255) >= 96;
        o45.zf.f343045f = com.tencent.mm.sdk.platformtools.v8.b(o45.zf.f343040a);
        int i19 = o45.zf.f343040a & 255;
        o45.zf.f343042c = i19 >= 64 && i19 <= 79;
        f343029g = o45.zf.f343040a;
        f343033k = o45.zf.f343044e;
        f343030h = o45.zf.f343041b;
        f343032j = o45.zf.f343043d;
        f343034l = o45.zf.f343045f;
        f343031i = o45.zf.f343042c;
    }
}
