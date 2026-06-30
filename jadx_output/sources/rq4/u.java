package rq4;

/* loaded from: classes14.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public static long f399110b;

    /* renamed from: c, reason: collision with root package name */
    public static long f399111c;

    /* renamed from: d, reason: collision with root package name */
    public static long f399112d;

    /* renamed from: e, reason: collision with root package name */
    public static long f399113e;

    /* renamed from: f, reason: collision with root package name */
    public static long f399114f;

    /* renamed from: g, reason: collision with root package name */
    public static long f399115g;

    /* renamed from: h, reason: collision with root package name */
    public static long f399116h;

    /* renamed from: a, reason: collision with root package name */
    public static final rq4.u f399109a = new rq4.u();

    /* renamed from: i, reason: collision with root package name */
    public static org.json.JSONArray f399117i = new org.json.JSONArray();

    public final void a() {
        org.json.JSONArray jSONArray;
        com.tencent.mm.autogen.mmdata.rpt.video_background_eventStruct video_background_eventstruct = new com.tencent.mm.autogen.mmdata.rpt.video_background_eventStruct();
        video_background_eventstruct.f63172d = f399110b;
        video_background_eventstruct.f63173e = f399111c;
        long j17 = f399112d;
        video_background_eventstruct.f63174f = j17;
        video_background_eventstruct.f63175g = f399113e;
        video_background_eventstruct.f63176h = f399114f;
        video_background_eventstruct.f63177i = f399115g;
        video_background_eventstruct.f63178j = f399116h;
        if (j17 == 2) {
            jSONArray = f399117i;
        } else {
            ar4.c cVar = ar4.c.f13401a;
            jSONArray = ar4.c.f13404d;
        }
        if (jSONArray.length() > 0 && f399114f > 0) {
            java.lang.String jSONArray2 = jSONArray.toString();
            kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
            video_background_eventstruct.f63179k = video_background_eventstruct.b("Background_event", r26.p0.E0(r26.i0.t(jSONArray2, ",", ";", false), 1024), true);
            video_background_eventstruct.k();
        }
        f399110b = 0L;
        f399111c = 0L;
        f399112d = 0L;
        f399113e = 0L;
        f399114f = 0L;
        f399115g = 0L;
        f399116h = 0L;
        f399117i = new org.json.JSONArray();
    }

    public final void b(int i17, boolean z17) {
        org.json.JSONArray jSONArray = f399117i;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("action", i17);
        jSONObject.put("isFront", z17 ? 1 : 2);
        jSONObject.put("timeStamp", java.lang.System.currentTimeMillis());
        jSONArray.put(jSONObject);
    }

    public final void c(boolean z17, boolean z18) {
        f399112d = z17 ? 2L : 1L;
        f399113e = z18 ? 1L : 2L;
        f399114f = java.lang.System.currentTimeMillis();
    }
}
