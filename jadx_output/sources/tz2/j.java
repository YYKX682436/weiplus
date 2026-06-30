package tz2;

/* loaded from: classes14.dex */
public class j {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f423287d;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Intent f423290g;

    /* renamed from: j, reason: collision with root package name */
    public android.hardware.Camera.Parameters f423293j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f423294k;

    /* renamed from: a, reason: collision with root package name */
    public boolean f423284a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f423285b = false;

    /* renamed from: c, reason: collision with root package name */
    public long f423286c = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f423288e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f423289f = "";

    /* renamed from: h, reason: collision with root package name */
    public boolean f423291h = false;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f423292i = null;

    /* renamed from: l, reason: collision with root package name */
    public int f423295l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f423296m = 0;

    public void a(android.content.Intent intent, int i17) {
        this.f423284a = intent.getBooleanExtra("needVideo", false);
        h72.s.e().f279474h = this.f423284a;
        this.f423287d = intent.getStringExtra("appId");
        this.f423288e = intent.getStringExtra("k_ticket");
        this.f423289f = intent.getStringExtra("request_verify_pre_info");
        this.f423296m = intent.getIntExtra("key_video_upload_type", 0);
        this.f423295l = i17;
        this.f423294k = new com.tencent.mm.sdk.platformtools.n3("face_video_upload_req_handler");
        if (i17 == 0) {
            this.f423291h = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerRecorder", "needVideo %s,mAppId %s acceptVoiceFromOutSide:%s", java.lang.Boolean.valueOf(this.f423284a), this.f423287d, java.lang.Boolean.valueOf(this.f423291h));
    }

    public void b(android.hardware.Camera.Parameters parameters) {
        if (this.f423284a) {
            try {
                boolean z17 = this.f423296m == 1;
                this.f423293j = parameters;
                int i17 = parameters.getInt("rotation");
                java.lang.String[] split = parameters.get("preview-size").split("x");
                h72.s.e().g(i17, java.lang.Integer.parseInt(split[0]), java.lang.Integer.parseInt(split[1]), false, 0, java.lang.Integer.parseInt(split[0]), java.lang.Integer.parseInt(split[1]), this.f423291h, z17);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public void c() {
        if (!this.f423284a || this.f423293j == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerRecorder", "resetRecord");
        if (this.f423284a && h72.s.e().h()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerRecorder", "releaseRecord");
            h72.s.e().d();
        }
        b(this.f423293j);
    }

    public void d() {
        if (this.f423290g != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerRecorder", "sendRequestUploadVideo");
            j45.l.A(this.f423290g);
            this.f423290g = null;
        }
    }

    public void e() {
        if (!this.f423284a || h72.s.e().h()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerRecorder", com.tencent.mm.plugin.appbrand.jsapi.audio.d3.NAME);
        h72.s.e().k();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f423286c = android.os.SystemClock.elapsedRealtime();
    }

    public void f(long j17) {
        if (this.f423284a && h72.s.e().h()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerRecorder", com.tencent.mm.plugin.appbrand.jsapi.audio.l3.NAME);
            synchronized (this) {
                this.f423285b = true;
            }
            h72.s.e().l(new tz2.k(this, j17));
        }
    }
}
