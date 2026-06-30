package wo;

/* loaded from: classes13.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f447682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.hardware.Camera[] f447683e;

    public e1(int i17, android.hardware.Camera[] cameraArr) {
        this.f447682d = i17;
        this.f447683e = cameraArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            int i17 = this.f447682d;
            if (i17 >= 0) {
                android.hardware.Camera[] cameraArr = this.f447683e;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                cameraArr[0] = (android.hardware.Camera) yj0.a.k(obj, arrayList.toArray(), "com/tencent/mm/compatible/deviceinfo/MMCamera$1", "run", "()V", "android/hardware/Camera", "open", "(I)Landroid/hardware/Camera;");
            } else {
                this.f447683e[0] = (android.hardware.Camera) yj0.a.j(new java.lang.Object(), "com/tencent/mm/compatible/deviceinfo/MMCamera$1", "run", "()V", "android/hardware/Camera", "open", "()Landroid/hardware/Camera;");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMCamera", e17, "syncCreateCamera error in new free thread", new java.lang.Object[0]);
        }
        java.lang.Object obj2 = wo.f1.f447685a;
        synchronized (obj2) {
            try {
                obj2.notifyAll();
                com.tencent.mars.xlog.Log.i("MicroMsg.MMCamera", "openCamera notifyAll");
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMCamera", e18, "MMCamera_openLooperNull notify error", new java.lang.Object[0]);
            }
        }
    }
}
