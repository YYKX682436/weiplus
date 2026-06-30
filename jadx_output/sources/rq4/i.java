package rq4;

/* loaded from: classes14.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public int f398968b;

    /* renamed from: c, reason: collision with root package name */
    public int f398969c;

    /* renamed from: e, reason: collision with root package name */
    public long f398971e;

    /* renamed from: f, reason: collision with root package name */
    public long f398972f;

    /* renamed from: g, reason: collision with root package name */
    public long f398973g;

    /* renamed from: i, reason: collision with root package name */
    public int f398975i;

    /* renamed from: j, reason: collision with root package name */
    public int f398976j;

    /* renamed from: l, reason: collision with root package name */
    public int f398978l;

    /* renamed from: m, reason: collision with root package name */
    public int f398979m;

    /* renamed from: n, reason: collision with root package name */
    public long f398980n;

    /* renamed from: o, reason: collision with root package name */
    public long f398981o;

    /* renamed from: p, reason: collision with root package name */
    public long f398982p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f398983q;

    /* renamed from: r, reason: collision with root package name */
    public long f398984r;

    /* renamed from: t, reason: collision with root package name */
    public qj0.a f398986t;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f398967a = new int[2];

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f398970d = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final int[] f398974h = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public final int[] f398977k = new int[2];

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f398985s = jz5.h.a(jz5.i.f302831f, rq4.h.f398966d);

    public i() {
        ((ku5.t0) ku5.t0.f312615d).h(new rq4.f(this), "getGpuInfo");
    }

    public final void a() {
        com.tencent.mm.autogen.mmdata.rpt.VoipProfilerReportStruct voipProfilerReportStruct = new com.tencent.mm.autogen.mmdata.rpt.VoipProfilerReportStruct();
        qq4.b wi6 = gq4.v.wi();
        if (wi6 == null) {
            return;
        }
        long j17 = wi6.f365983q;
        jz5.g gVar = this.f398985s;
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPProfileReport", "error report while init time is null");
            ((vq4.i) gVar.getValue()).b();
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        voipProfilerReportStruct.f61804d = (int) (java.lang.System.currentTimeMillis() - j17);
        java.util.HashMap hashMap = this.f398970d;
        voipProfilerReportStruct.f61805e = java.lang.Math.max(100 - (hashMap.size() * 20), 0);
        int[] iArr = this.f398967a;
        voipProfilerReportStruct.f61806f = kz5.z.e0(iArr);
        voipProfilerReportStruct.f61807g = kz5.z.K(iArr);
        voipProfilerReportStruct.f61809i = this.f398968b;
        int[] iArr2 = this.f398974h;
        voipProfilerReportStruct.f61810j = kz5.z.e0(iArr2);
        voipProfilerReportStruct.f61811k = kz5.z.K(iArr2);
        voipProfilerReportStruct.f61813m = this.f398975i;
        int[] iArr3 = this.f398977k;
        voipProfilerReportStruct.f61814n = kz5.z.e0(iArr3);
        voipProfilerReportStruct.f61815o = kz5.z.K(iArr3);
        voipProfilerReportStruct.f61816p = this.f398978l;
        sq4.b bVar = (sq4.b) hashMap.get("EncoderLackFrame");
        voipProfilerReportStruct.f61808h = bVar != null ? bVar.c().f411384a : 0;
        sq4.b bVar2 = (sq4.b) hashMap.get("LocalRenderLackFrame");
        voipProfilerReportStruct.f61812l = bVar2 != null ? bVar2.c().f411384a : 0;
        sq4.b bVar3 = (sq4.b) hashMap.get("RemoteRenderLackFrame");
        voipProfilerReportStruct.f61817q = bVar3 != null ? bVar3.c().f411384a : 0;
        voipProfilerReportStruct.f61819s = (int) this.f398971e;
        voipProfilerReportStruct.f61818r = (int) this.f398973g;
        voipProfilerReportStruct.f61820t = (int) this.f398972f;
        if (this.f398983q) {
            voipProfilerReportStruct.f61821u = (int) this.f398980n;
            voipProfilerReportStruct.f61822v = (int) this.f398981o;
            voipProfilerReportStruct.f61823w = (int) this.f398982p;
        }
        vq4.e b17 = ((vq4.i) gVar.getValue()).b();
        java.lang.Integer h17 = r26.h0.h(b17.f439291f);
        voipProfilerReportStruct.f61824x = h17 != null ? h17.intValue() : 0;
        voipProfilerReportStruct.f61826z = voipProfilerReportStruct.b("CpuLoadInfo", b17.f439292g, true);
        java.lang.String jSONObject = b17.f439288c.toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        voipProfilerReportStruct.f61825y = voipProfilerReportStruct.b("PhoneTemprateInfo", r26.i0.t(jSONObject, ",", ";", false), true);
        java.lang.String jSONObject2 = b17.f439287b.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        voipProfilerReportStruct.A = voipProfilerReportStruct.b("CpuTemprateInfo", r26.i0.t(jSONObject2, ",", ";", false), true);
        java.lang.String jSONObject3 = b17.f439286a.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        voipProfilerReportStruct.B = voipProfilerReportStruct.b("BatteryTemprateInfo", r26.i0.t(jSONObject3, ",", ";", false), true);
        voipProfilerReportStruct.k();
    }

    public final java.lang.String b() {
        cl0.g gVar = new cl0.g();
        gVar.p("gl", this.f398980n);
        gVar.p("gfx", this.f398982p);
        gVar.p("egl", this.f398981o);
        gVar.o("cpuload", 0);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        return r26.i0.t(gVar2, ",", ";", false);
    }

    public final java.lang.String c() {
        cl0.g gVar = new cl0.g();
        gVar.o("encodeFirst", (int) this.f398973g);
        gVar.o("localFirst", (int) this.f398971e);
        gVar.o("remoteFirst", (int) this.f398972f);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        return r26.i0.t(gVar2, ",", ";", false);
    }

    public final java.lang.String d() {
        cl0.g gVar = new cl0.g();
        java.util.HashMap hashMap = this.f398970d;
        sq4.b bVar = (sq4.b) hashMap.get("LocalRenderLackFrame");
        gVar.o(com.google.android.gms.common.internal.ImagesContract.LOCAL, bVar != null ? bVar.c().f411384a : 0);
        sq4.b bVar2 = (sq4.b) hashMap.get("RemoteRenderLackFrame");
        gVar.o("remote", bVar2 != null ? bVar2.c().f411384a : 0);
        sq4.b bVar3 = (sq4.b) hashMap.get("EncoderLackFrame");
        gVar.o("encode", bVar3 != null ? bVar3.c().f411384a : 0);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        return r26.i0.t(gVar2, ",", ";", false);
    }

    public final void e(int i17, boolean z17) {
        java.util.HashMap hashMap = this.f398970d;
        if (z17) {
            int[] iArr = this.f398974h;
            int K = kz5.z.K(iArr);
            if (i17 < K || K == 0) {
                iArr[0] = i17;
            }
            if (i17 > kz5.z.e0(iArr)) {
                iArr[1] = i17;
            }
            int i18 = this.f398975i + i17;
            this.f398975i = i18;
            this.f398975i = i18 / 2;
            if (this.f398976j - i17 > 5) {
                long j17 = gq4.v.wi().f365983q;
                if (j17 != 0) {
                    sq4.b bVar = (sq4.b) hashMap.get("LocalRenderLackFrame");
                    if (bVar == null) {
                        bVar = new sq4.b();
                    }
                    bVar.f411373a = "LocalRenderLackFrame";
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    bVar.d(java.lang.System.currentTimeMillis() - j17);
                    bVar.b();
                    hashMap.put("LocalRenderLackFrame", bVar);
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPProfileReport", "local render frame lack");
                }
            }
            this.f398976j = i17;
            return;
        }
        int[] iArr2 = this.f398977k;
        int K2 = kz5.z.K(iArr2);
        if (i17 < K2 || K2 == 0) {
            iArr2[0] = i17;
        }
        if (i17 > kz5.z.e0(iArr2)) {
            iArr2[1] = i17;
        }
        int i19 = this.f398978l + i17;
        this.f398978l = i19;
        this.f398978l = i19 / 2;
        if (this.f398979m - i17 > 5) {
            long j18 = gq4.v.wi().f365983q;
            if (j18 != 0) {
                sq4.b bVar2 = (sq4.b) hashMap.get("RemoteRenderLackFrame");
                if (bVar2 == null) {
                    bVar2 = new sq4.b();
                }
                bVar2.f411373a = "RemoteRenderLackFrame";
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                bVar2.d(java.lang.System.currentTimeMillis() - j18);
                bVar2.b();
                hashMap.put("RemoteRenderLackFrame", bVar2);
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPProfileReport", "remote render frame lack");
            }
        }
        this.f398979m = i17;
    }
}
