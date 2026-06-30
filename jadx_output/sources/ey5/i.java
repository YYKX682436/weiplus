package ey5;

/* loaded from: classes13.dex */
public class i implements com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f257653a;

    public i(ey5.r rVar, java.lang.Runnable runnable) {
        this.f257653a = runnable;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback
    public void onCancel() {
        java.lang.Runnable runnable = this.f257653a;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback
    public void onFinish() {
        java.lang.Runnable runnable = this.f257653a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
