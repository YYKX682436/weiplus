package gf;

/* loaded from: classes7.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf.g0 f271085d;

    public h0(gf.g0 g0Var) {
        this.f271085d = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gf.l0.f271116b = true;
        gf.l0 l0Var = gf.l0.f271115a;
        gf.g0 g0Var = this.f271085d;
        if (g0Var.f271066d) {
            com.tencent.skyline.jni.SkylineJNI.enableNewImage();
        } else {
            com.tencent.skyline.jni.SkylineJNI.disableNewImage();
        }
        if (g0Var.f271067e) {
            com.tencent.skyline.jni.SkylineJNI.enableNewSVGImage();
        } else {
            com.tencent.skyline.jni.SkylineJNI.disableNewSVGImage();
        }
        com.tencent.skyline.jni.SkylineJNI.setDiskCacheDirPath(com.tencent.mm.vfs.w6.i("wcf://WxaSkylineCache/", true));
        com.tencent.skyline.jni.SkylineJNI.setCronetClient(new df.e());
        com.tencent.skyline.jni.SkylineJNI.setEnableReport(g0Var.f271069g);
        com.tencent.skyline.jni.SkylineJNI.setReporter(new df.d1());
        com.tencent.skyline.jni.ISkylineExperiment iSkylineExperiment = g0Var.f271074l;
        if (iSkylineExperiment != null) {
            com.tencent.skyline.jni.SkylineJNI.setSkylineExperiment(iSkylineExperiment);
        }
        com.tencent.mars.xlog.Log.i("Luggage.SkylineBoot", "notifyDone");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (gf.l0.f271117c) {
            java.util.ArrayList arrayList2 = gf.l0.f271118d;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Runnable runnable = (java.lang.Runnable) it.next();
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
