package vu0;

/* loaded from: classes5.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uu0.k f440100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pp0.s0 f440101f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440102g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vu0.k f440103h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440104i;

    public j(java.lang.String str, uu0.k kVar, pp0.s0 s0Var, java.lang.String str2, vu0.k kVar2, java.lang.String str3) {
        this.f440099d = str;
        this.f440100e = kVar;
        this.f440101f = s0Var;
        this.f440102g = str2;
        this.f440103h = kVar2;
        this.f440104i = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.nio.ByteBuffer d17 = ru0.a.d(new com.tencent.mm.vfs.r6(this.f440099d));
        uu0.k kVar = this.f440100e;
        int capacity = d17.capacity();
        kotlin.jvm.internal.o.g(kVar, "<this>");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("vr_domain", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT);
        hashMap.put("max_result_count", "1");
        hashMap.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.String.valueOf(java.lang.System.nanoTime()));
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ, "0");
        hashMap.put("len", java.lang.String.valueOf(capacity));
        hashMap.put("samples_per_sec", java.lang.String.valueOf(kVar.f431244b));
        hashMap.put("bits_per_sample", "16");
        hashMap.put("voice_file_type", "1");
        hashMap.put("voice_encode_type", "6");
        hashMap.put("result_type", "1");
        hashMap.put("end", "1");
        hashMap.put("cont_res", "1");
        hashMap.put("stable_results", "1");
        hashMap.toString();
        pp0.s0 s0Var = this.f440101f;
        java.lang.String voiceID = this.f440102g;
        kotlin.jvm.internal.o.f(voiceID, "$voiceID");
        vu0.k kVar2 = this.f440103h;
        com.tencent.maas.speech.MJILinkAppRequest iLinkAppRequest = kVar2.f440108c;
        vu0.i iVar = new vu0.i(kVar2, this.f440104i, this.f440102g);
        dz0.s2 s2Var = (dz0.s2) s0Var;
        s2Var.getClass();
        kotlin.jvm.internal.o.g(iLinkAppRequest, "iLinkAppRequest");
        synchronized (s2Var) {
            if (s2Var.f245006b) {
                return;
            }
            s2Var.f245005a.f(d17, hashMap, voiceID, iLinkAppRequest, "getfullspeechrecognition", iVar);
        }
    }
}
