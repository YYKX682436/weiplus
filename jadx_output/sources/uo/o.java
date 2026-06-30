package uo;

/* loaded from: classes11.dex */
public final class o implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public static final uo.o f429530d = new uo.o();

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "initCameraNumbers getNumberOfCameras start");
        uo.q qVar = uo.q.f429532a;
        uo.q.f429533b = android.hardware.Camera.getNumberOfCameras();
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "initCameraNumbers getNumberOfCameras Done mCameraNumber is " + uo.q.f429533b);
        uo.q qVar2 = uo.q.f429532a;
        qVar2.b();
        qVar2.a();
        com.tencent.mm.sdk.platformtools.o4.L().putInt("cameraNumberCache", uo.q.f429533b);
        com.tencent.mm.sdk.platformtools.o4.L().putInt("camera2NumberInfoCache", uo.q.f429536e);
        com.tencent.mm.sdk.platformtools.o4.L().putString("camera2SupportLevelsCache", uo.q.f429537f);
        return java.lang.Integer.valueOf(uo.q.f429533b);
    }
}
