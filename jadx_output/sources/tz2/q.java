package tz2;

/* loaded from: classes14.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public boolean f423317a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.l f423318b;

    /* renamed from: c, reason: collision with root package name */
    public long f423319c;

    /* renamed from: d, reason: collision with root package name */
    public android.hardware.Camera.Parameters f423320d;

    /* renamed from: e, reason: collision with root package name */
    public int f423321e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f423322f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f423323g = "";

    /* renamed from: h, reason: collision with root package name */
    public long f423324h = 8388608;

    public static final /* synthetic */ java.lang.String a(tz2.q qVar) {
        qVar.getClass();
        return "MicroMsg.FaceFlashRecordManagerForPay";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(tz2.q r13, java.lang.String r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tz2.q.b(tz2.q, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c(java.lang.String str, java.lang.String str2) {
        new j72.e(java.lang.Integer.valueOf(this.f423321e), this.f423322f, this.f423323g, "", str, str2).l().K(new tz2.m(this));
    }

    public final void d(android.hardware.Camera.Parameters parameters) {
        if (this.f423317a) {
            try {
                this.f423320d = parameters;
                java.lang.Integer valueOf = parameters != null ? java.lang.Integer.valueOf(parameters.getInt("rotation")) : null;
                java.lang.String str = parameters != null ? parameters.get("preview-size") : null;
                java.util.List f07 = str != null ? r26.n0.f0(str, new java.lang.String[]{"x"}, false, 0, 6, null) : null;
                if (f07 != null) {
                    h72.s.e().g(valueOf != null ? valueOf.intValue() : 0, java.lang.Integer.parseInt((java.lang.String) f07.get(0)), java.lang.Integer.parseInt((java.lang.String) f07.get(1)), false, 0, java.lang.Integer.parseInt((java.lang.String) f07.get(0)), java.lang.Integer.parseInt((java.lang.String) f07.get(1)), false, false);
                }
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashRecordManagerForPay", "initRecord exception");
            }
        }
    }

    public final void e() {
        if (!this.f423317a || h72.s.e().h()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashRecordManagerForPay", com.tencent.mm.plugin.appbrand.jsapi.audio.d3.NAME);
        h72.s.e().k();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f423319c = android.os.SystemClock.elapsedRealtime();
    }
}
