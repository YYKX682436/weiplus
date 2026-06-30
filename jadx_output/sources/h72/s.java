package h72;

/* loaded from: classes14.dex */
public class s {

    /* renamed from: r, reason: collision with root package name */
    public static volatile h72.s f279464r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String f279465s = com.tencent.mm.plugin.facedetect.model.s0.h().concat("/fdv_");

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String f279466t;

    /* renamed from: a, reason: collision with root package name */
    public ei3.m f279467a;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f279469c;

    /* renamed from: o, reason: collision with root package name */
    public final bi3.l f279481o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.facedetect.model.u f279482p;

    /* renamed from: q, reason: collision with root package name */
    public final ei3.k f279483q;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f279468b = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public h72.q f279470d = h72.q.UNINITIALIZED;

    /* renamed from: e, reason: collision with root package name */
    public int f279471e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f279472f = false;

    /* renamed from: g, reason: collision with root package name */
    public int f279473g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f279474h = false;

    /* renamed from: i, reason: collision with root package name */
    public h72.r f279475i = null;

    /* renamed from: j, reason: collision with root package name */
    public int f279476j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f279477k = -1;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f279478l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f279479m = "";

    /* renamed from: n, reason: collision with root package name */
    public final k55.k f279480n = new k55.k(com.tencent.mm.sdk.platformtools.x2.f193071a);

    static {
        com.tencent.mm.plugin.facedetect.model.s0.h();
        f279466t = com.tencent.mm.plugin.facedetect.model.s0.h().concat("/fdv_t_");
    }

    public s() {
        this.f279469c = null;
        ((h81.d) bi3.l.f21005a).getClass();
        this.f279481o = new h81.e();
        this.f279482p = new h72.o(this);
        this.f279483q = new h72.d(this);
        this.f279469c = new com.tencent.mm.sdk.platformtools.n3("face_video_handler");
    }

    public static void a(h72.s sVar) {
        sVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f279465s);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        sb6.append(".mp4");
        sVar.f279478l = sb6.toString();
    }

    public static void b(h72.s sVar) {
        sVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f279466t);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        sb6.append(".thumb");
        sVar.f279479m = sb6.toString();
    }

    public static void c(h72.s sVar) {
        com.tencent.mm.vfs.w6.h(sVar.f279478l);
        com.tencent.mm.vfs.w6.h(sVar.f279479m);
    }

    public static h72.s e() {
        h72.s sVar;
        if (f279464r != null) {
            return f279464r;
        }
        synchronized (h72.s.class) {
            if (f279464r == null) {
                f279464r = new h72.s();
            }
            sVar = f279464r;
        }
        return sVar;
    }

    public void d() {
        i("MicroMsg.FaceVideoRecorder", "carson: cancel Record Video", new java.lang.Object[0]);
        this.f279469c.postToWorker(new h72.l(this));
    }

    public tl.c f() {
        ei3.m mVar = this.f279467a;
        if (mVar != null) {
            return mVar.p();
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.FaceVideoRecorder", "hy: no media recorder");
        return null;
    }

    public boolean g(int i17, int i18, int i19, boolean z17, int i27, int i28, int i29, boolean z18, boolean z19) {
        j("MicroMsg.FaceVideoRecorder", "hy: init record", new java.lang.Object[0]);
        j("MicroMsg.FaceVideoRecorder", "hy: cameraOrientation: %d, previewWidth: %d, previewHeight: %d,isLandscape: %b,  degree: %d, acceptVoiceFromOutside: %s , compatNotLogin: %b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i27), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = new com.tencent.mm.modelcontrol.VideoTransPara();
        videoTransPara.f71203s = true;
        videoTransPara.f71191d = this.f279476j;
        videoTransPara.f71192e = this.f279477k;
        videoTransPara.f71193f = 30;
        videoTransPara.f71194g = 1200000;
        videoTransPara.f71197m = 10;
        videoTransPara.f71198n = 64000;
        videoTransPara.f71201q = 2;
        videoTransPara.f71202r = 1;
        videoTransPara.f71199o = 16000;
        videoTransPara.f71195h = 15;
        j("MicroMsg.FaceVideoRecorder", "hy: init serverProxy start", new java.lang.Object[0]);
        bi3.l lVar = this.f279481o;
        k55.k kVar = this.f279480n;
        if (!z19 || gm0.j1.b().n()) {
            h81.e eVar = (h81.e) lVar;
            eVar.getClass();
            if (kVar != null) {
                com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.createProxy(new com.tencent.mm.plugin.mmsight.model.CaptureMMProxy(kVar));
            }
            di3.w.e(videoTransPara, di3.v.MMSightCameraConfig);
            eVar.f279526c = videoTransPara;
        } else {
            h81.e eVar2 = (h81.e) lVar;
            eVar2.getClass();
            if (kVar != null) {
                com.tencent.mm.plugin.mmsight.model.CaptureMMProxy captureMMProxy = new com.tencent.mm.plugin.mmsight.model.CaptureMMProxy(kVar);
                captureMMProxy.setCompatNotLogin(true);
                com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.createProxy(captureMMProxy);
            }
            di3.w.e(videoTransPara, di3.v.MMSightCameraNotLoginConfig);
            eVar2.f279526c = videoTransPara;
        }
        j("MicroMsg.FaceVideoRecorder", "hy: init serverProxy end", new java.lang.Object[0]);
        this.f279469c.postToWorker(new h72.e(this, i17, i19, i18, z17, i27, z18, i28, i29));
        return true;
    }

    public boolean h() {
        boolean z17;
        synchronized (this.f279468b) {
            z17 = this.f279470d == h72.q.STARTED;
        }
        return z17;
    }

    public final void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.e(str, "[" + this + "]" + str2, objArr);
    }

    public final void j(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.i(str, "[" + this + "]" + str2, objArr);
    }

    public boolean k() {
        i("MicroMsg.FaceVideoRecorder", "carson: start Record Video", new java.lang.Object[0]);
        this.f279469c.postToWorker(new h72.k(this));
        return true;
    }

    public void l(h72.r rVar) {
        java.lang.String filePath;
        java.lang.String b17;
        i("MicroMsg.FaceVideoRecorder", "carson: stop Record Video", new java.lang.Object[0]);
        synchronized (this.f279468b) {
            filePath = this.f279467a.getFilePath();
            b17 = this.f279467a.b();
        }
        i("MicroMsg.FaceVideoRecorder", "stop video path: " + filePath + " thumbFile: " + b17, new java.lang.Object[0]);
        this.f279469c.postToWorker(new h72.n(this, rVar, filePath, b17));
    }
}
