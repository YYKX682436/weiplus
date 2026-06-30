package fi1;

/* loaded from: classes8.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f262796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView f262797e;

    public s(com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView hybridOpenMaterialView, android.view.MotionEvent motionEvent) {
        this.f262797e = hybridOpenMaterialView;
        this.f262796d = motionEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.MotionEvent motionEvent = this.f262796d;
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
        obtain.setAction(1);
        com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView hybridOpenMaterialView = this.f262797e;
        hybridOpenMaterialView.dispatchTouchEvent(obtain);
        android.view.MotionEvent obtain2 = android.view.MotionEvent.obtain(motionEvent);
        obtain2.setAction(0);
        hybridOpenMaterialView.dispatchTouchEvent(obtain2);
    }
}
