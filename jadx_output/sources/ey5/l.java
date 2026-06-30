package ey5;

/* loaded from: classes13.dex */
public class l implements com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tencentmap.mapsdk.map.CancelableCallback f257656a;

    public l(ey5.r rVar, com.tencent.tencentmap.mapsdk.map.CancelableCallback cancelableCallback) {
        this.f257656a = cancelableCallback;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback
    public void onCancel() {
        com.tencent.tencentmap.mapsdk.map.CancelableCallback cancelableCallback = this.f257656a;
        if (cancelableCallback != null) {
            cancelableCallback.onCancel();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback
    public void onFinish() {
        com.tencent.tencentmap.mapsdk.map.CancelableCallback cancelableCallback = this.f257656a;
        if (cancelableCallback != null) {
            cancelableCallback.onFinish();
        }
    }
}
