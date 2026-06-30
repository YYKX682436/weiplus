package xo1;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f455751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f455752e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.ref.WeakReference weakReference, java.util.List list) {
        super(0);
        this.f455751d = weakReference;
        this.f455752e = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.backup.roambackup.ui.device.NewPcDeviceUI newPcDeviceUI = (com.tencent.mm.plugin.backup.roambackup.ui.device.NewPcDeviceUI) this.f455751d.get();
        if (newPcDeviceUI != null && !newPcDeviceUI.isPaused() && !newPcDeviceUI.isFinishing() && !newPcDeviceUI.isDestroyed()) {
            newPcDeviceUI.U6((po1.d) kz5.n0.Z(this.f455752e));
        }
        return jz5.f0.f302826a;
    }
}
