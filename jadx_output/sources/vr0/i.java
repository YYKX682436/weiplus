package vr0;

/* loaded from: classes14.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wa.a f439477d;

    public i(wa.a aVar) {
        this.f439477d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            androidx.camera.core.impl.utils.futures.Futures.getDone(this.f439477d);
        } catch (java.lang.Error e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", "focusOn error:" + e17);
        } catch (java.lang.RuntimeException e18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", "focusOn error:" + e18);
        } catch (java.util.concurrent.ExecutionException e19) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraXImpl", "focusOn error:" + e19.getCause());
        }
    }
}
