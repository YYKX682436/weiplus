package rs0;

/* loaded from: classes14.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rs0.n f399304d;

    public l(rs0.n nVar) {
        this.f399304d = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rs0.g gVar = rs0.i.f399296a;
        rs0.h n17 = rs0.g.n(gVar, null, null, 1, 1, null, 16, null);
        rs0.n nVar = this.f399304d;
        nVar.f399308b = n17;
        java.lang.String glGetString = android.opengl.GLES20.glGetString(7939);
        if (glGetString == null || glGetString.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GpuDetectorUtil", "queryGpuInfo: GL_EXTENSIONS is null or empty");
        } else {
            kotlin.jvm.internal.o.d(glGetString);
            nVar.getClass();
            rs0.n.f399306d.d().putString("gl_extension_support_list", glGetString);
        }
        nVar.getClass();
        try {
            com.tencent.gpudetector.JniGPUDetector.GpuDeviceModel gpuDeviceModel = new com.tencent.gpudetector.JniGPUDetector.GpuDeviceModel();
            com.tencent.gpudetector.JniGPUDetector jniGPUDetector = new com.tencent.gpudetector.JniGPUDetector();
            if (jniGPUDetector.GetGPUDeviceModel(gpuDeviceModel)) {
                int i17 = gVar.e("GL_OES_EGL_image_external_essl3") ? 1 : 0;
                int arch = gpuDeviceModel.getArch();
                int code = gpuDeviceModel.getCode();
                int numCores = gpuDeviceModel.getNumCores();
                java.lang.String name = gpuDeviceModel.getName();
                java.lang.String vendor = gpuDeviceModel.getVendor();
                java.lang.String version = gpuDeviceModel.getVersion();
                int gpuPerfScoreInfo = jniGPUDetector.getGpuPerfScoreInfo();
                com.tencent.gpudetector.JniGPUDetector.Companion companion = com.tencent.gpudetector.JniGPUDetector.INSTANCE;
                nVar.b(arch, code, numCores, name, vendor, version, gpuPerfScoreInfo, companion.getArchNameDetail(gpuDeviceModel.getArch()), i17);
                int gpuPerfScoreInfo2 = jniGPUDetector.getGpuPerfScoreInfo();
                rs0.j jVar = rs0.n.f399306d;
                jVar.d().putInt("gpu_info_rating", gpuPerfScoreInfo2);
                jVar.d().putString("gpu_detector_version", companion.getVersion());
                nVar.c(gpuDeviceModel);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.GpuDetectorUtil", "Failed to detect GPU " + e17, new java.lang.Object[0]);
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = nVar.f399309c;
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(null);
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var2 = nVar.f399309c;
        if (n3Var2 != null) {
            n3Var2.post(new rs0.k(nVar));
        }
    }
}
