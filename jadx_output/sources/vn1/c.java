package vn1;

/* loaded from: classes7.dex */
public final class c extends android.bluetooth.le.AdvertiseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vn1.m f438199a;

    public c(vn1.m mVar) {
        this.f438199a = mVar;
    }

    @Override // android.bluetooth.le.AdvertiseCallback
    public void onStartFailure(int i17) {
        com.tencent.mars.xlog.Log.e("MM.BLE.BLEDeviceManager", "BLE advertising failed with error code: " + i17);
        vn1.m mVar = this.f438199a;
        mVar.getClass();
        vn1.a aVar = mVar.f438214b;
        if (aVar != null) {
            aVar.f(false);
        }
    }

    @Override // android.bluetooth.le.AdvertiseCallback
    public void onStartSuccess(android.bluetooth.le.AdvertiseSettings settingsInEffect) {
        kotlin.jvm.internal.o.g(settingsInEffect, "settingsInEffect");
        com.tencent.mars.xlog.Log.i("MM.BLE.BLEDeviceManager", "BLE advertising started successfully");
        vn1.m mVar = this.f438199a;
        mVar.getClass();
        vn1.a aVar = mVar.f438214b;
        if (aVar != null) {
            aVar.f(true);
        }
    }
}
