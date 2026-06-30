package rq4;

/* loaded from: classes14.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Long f399069c;

    /* renamed from: e, reason: collision with root package name */
    public static int f399071e;

    /* renamed from: h, reason: collision with root package name */
    public static int f399074h;

    /* renamed from: i, reason: collision with root package name */
    public static long f399075i;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f399077k;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f399080n;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f399083q;

    /* renamed from: s, reason: collision with root package name */
    public static jz5.l f399085s;

    /* renamed from: t, reason: collision with root package name */
    public static int f399086t;

    /* renamed from: v, reason: collision with root package name */
    public static long f399088v;

    /* renamed from: y, reason: collision with root package name */
    public static long f399091y;

    /* renamed from: z, reason: collision with root package name */
    public static long f399092z;

    /* renamed from: a, reason: collision with root package name */
    public static final rq4.q f399067a = new rq4.q();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f399068b = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public static rq4.o f399070d = rq4.o.f399057d;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f399072f = "0";

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentLinkedQueue f399073g = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.String f399076j = "";

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.String f399078l = "";

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.String f399079m = "";

    /* renamed from: o, reason: collision with root package name */
    public static boolean f399081o = true;

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.String f399082p = "";

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.String f399084r = "";

    /* renamed from: u, reason: collision with root package name */
    public static java.lang.String f399087u = "";

    /* renamed from: w, reason: collision with root package name */
    public static final androidx.lifecycle.j0 f399089w = new androidx.lifecycle.j0(null);

    /* renamed from: x, reason: collision with root package name */
    public static final jz5.g f399090x = jz5.h.a(jz5.i.f302831f, rq4.p.f399066d);

    public final void a(java.lang.Integer num, java.lang.Long l17, java.lang.String str, java.lang.Boolean bool) {
        if (num != null) {
            f399074h = num.intValue();
            if (l17 != null) {
                f399075i = l17.longValue();
                if (str == null) {
                    return;
                }
                f399076j = str;
                if (bool != null) {
                    f399077k = bool.booleanValue();
                    gq4.v.wi().f365980n = f399077k;
                    gq4.v.wi().f365979m = c();
                    f399089w.postValue(new jz5.l(num, l17));
                    ((vq4.i) f399090x.getValue()).c();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x02e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r27, long r29) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rq4.q.b(long, long):void");
    }

    public final java.lang.String c() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("roomKey", f399075i);
        jSONObject2.put("roomId", f399074h);
        jSONObject2.put("callName", f399076j);
        jSONObject2.put("callType", f399077k);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        jSONObject2.put("timeStamp", java.lang.System.currentTimeMillis());
        jSONObject.put("voipInfo", jSONObject2.toString());
        java.lang.String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        return jSONObject3;
    }
}
