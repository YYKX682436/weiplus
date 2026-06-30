package pr0;

/* loaded from: classes14.dex */
public abstract class g implements android.hardware.display.DisplayManager.DisplayListener, nr0.y, nr0.z, nr0.b0, nr0.a0 {

    /* renamed from: e, reason: collision with root package name */
    public sr0.i f357834e;

    /* renamed from: i, reason: collision with root package name */
    public final android.hardware.display.DisplayManager f357838i;

    /* renamed from: d, reason: collision with root package name */
    public final int f357833d = hashCode();

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f357835f = jz5.h.b(pr0.f.f357827d);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f357836g = jz5.h.b(new pr0.e(this));

    /* renamed from: h, reason: collision with root package name */
    public volatile long f357837h = -1;

    public g() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("display");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        this.f357838i = (android.hardware.display.DisplayManager) systemService;
    }

    public final nr0.x k() {
        return (nr0.x) ((jz5.n) this.f357836g).getValue();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKit", "Display #" + i17 + " added.");
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKit", "Display #" + i17 + " changed.");
        if (this.f357834e == null) {
            return;
        }
        if (java.lang.System.currentTimeMillis() - this.f357837h < 1000) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Camera.CameraKit", "jump onDisplayChanged");
            return;
        }
        sr0.i iVar = this.f357834e;
        kotlin.jvm.internal.o.d(iVar);
        int d17 = iVar.d();
        sr0.i iVar2 = this.f357834e;
        kotlin.jvm.internal.o.d(iVar2);
        if (k().f339121m.f456178d != ((((sr0.f) iVar2).A() - d17) + com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) {
            this.f357837h = java.lang.System.currentTimeMillis();
            pr0.n0 n0Var = (pr0.n0) this;
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKit", "updateScreenRotate");
            n0Var.m("updateScreenRotate", new pr0.l0(n0Var, null));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKit", "Display #" + i17 + " removed.");
    }
}
