package ia3;

/* loaded from: classes15.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f289998a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f289999b;

    /* renamed from: c, reason: collision with root package name */
    public final long f290000c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f290001d;

    /* renamed from: e, reason: collision with root package name */
    public final int f290002e;

    /* renamed from: f, reason: collision with root package name */
    public final long f290003f;

    /* renamed from: g, reason: collision with root package name */
    public final long f290004g;

    /* renamed from: h, reason: collision with root package name */
    public final long f290005h;

    /* renamed from: i, reason: collision with root package name */
    public final long f290006i;

    /* renamed from: j, reason: collision with root package name */
    public final long f290007j;

    /* renamed from: k, reason: collision with root package name */
    public final long f290008k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f290009l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f290010m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f290011n = "";

    /* renamed from: o, reason: collision with root package name */
    public boolean f290012o = false;

    public d(ia3.e eVar, long j17, java.lang.String str, long j18, boolean z17, int i17, long j19, long j27, long j28, long j29, long j37, long j38, long j39, boolean z18, boolean z19, java.lang.String str2) {
        this.f289998a = j17;
        this.f289999b = str;
        this.f290000c = j18;
        this.f290001d = z17;
        this.f290002e = i17;
        this.f290003f = j19;
        this.f290004g = j27;
        this.f290005h = j28;
        this.f290006i = j29;
        this.f290007j = j38;
        this.f290008k = j39;
        this.f290009l = z18;
        this.f290010m = str2;
    }

    public void a(long j17, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.lite.LiteAppCenter.jsApiCallback(this.f289999b, this.f289998a, this.f290000c, "", j17, str, z17, this.f290001d);
    }

    public void b() {
        long j17 = this.f290008k;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVoiceHelper", "onEnd callbackId:%d", java.lang.Long.valueOf(j17));
        this.f290012o = true;
        if (j17 != 0) {
            a(j17, new org.json.JSONObject().toString(), true);
        }
    }

    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVoiceHelper", "onSpeechEnd");
        d(this.f290011n, true);
        long j17 = this.f290005h;
        if (j17 != 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVoiceHelper", "onSpeechEnd callbackId:%d", java.lang.Long.valueOf(j17));
            a(j17, jSONObject.toString(), true);
        }
    }

    public void d(java.lang.String str, boolean z17) {
        long j17 = this.f290003f;
        if (j17 != 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("result", str);
                jSONObject.put("isFinal", z17);
            } catch (java.lang.Exception unused) {
            }
            a(j17, jSONObject.toString(), true);
        }
    }
}
