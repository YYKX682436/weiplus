package rs0;

/* loaded from: classes14.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final rs0.j f399306d = new rs0.j(null);

    /* renamed from: a, reason: collision with root package name */
    public android.os.HandlerThread f399307a;

    /* renamed from: b, reason: collision with root package name */
    public rs0.h f399308b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f399309c;

    static {
        fp.d0.o("GPUDetector");
    }

    public final void a() {
        try {
            rs0.j jVar = f399306d;
            if (jVar.c() != -1) {
                java.lang.String string = jVar.d().getString("gl_extension_support_list", "");
                if (string == null) {
                    string = "";
                }
                if (!kotlin.jvm.internal.o.b(string, "") && jVar.b() != null && jVar.a() != null && kotlin.jvm.internal.o.b(com.tencent.gpudetector.JniGPUDetector.INSTANCE.getVersion(), jVar.a())) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GpuDetectorUtil", "sp has value and not to do queryGpuInfo");
                    return;
                }
            }
            int i17 = pu5.i.f358473b;
            android.os.HandlerThread a17 = pu5.f.a("GpuDetectorUtil", 5);
            this.f399307a = a17;
            a17.start();
            android.os.HandlerThread handlerThread = this.f399307a;
            com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3(handlerThread != null ? handlerThread.getLooper() : null);
            this.f399309c = n3Var;
            n3Var.post(new rs0.l(this));
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.GpuDetectorUtil", "error happened " + e17, new java.lang.Object[0]);
        }
    }

    public final void b(int i17, int i18, int i19, java.lang.String str, java.lang.String str2, java.lang.String str3, int i27, java.lang.String str4, int i28) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GpuDetectorUtil", "report gpu info archName:" + i17 + ",code:" + i18 + ",coreSum:" + i19 + ",name:" + str + ",vendor:" + str2 + ",version:" + str3 + ",rating:" + i27 + ",archNameDetail:" + str4 + ",glOesExtensionSupported:" + i28);
        jx3.f.INSTANCE.r(20128, true, true, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, str2, str3, java.lang.Integer.valueOf(i27), str4, java.lang.Integer.valueOf(i28));
    }

    public final void c(com.tencent.gpudetector.JniGPUDetector.GpuDeviceModel gpuDeviceModel) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("arch", java.lang.String.valueOf(gpuDeviceModel.getArch()));
        jSONObject.put("code", java.lang.String.valueOf(gpuDeviceModel.getCode()));
        jSONObject.put("numCores", java.lang.String.valueOf(gpuDeviceModel.getNumCores()));
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, gpuDeviceModel.getName());
        jSONObject.put("vendor", gpuDeviceModel.getVendor());
        jSONObject.put("version", gpuDeviceModel.getVersion());
        jSONObject.put("archDetail", com.tencent.gpudetector.JniGPUDetector.INSTANCE.getArchNameDetail(gpuDeviceModel.getArch()));
        f399306d.d().putString("gpu_info_device_model", jSONObject.toString());
    }
}
