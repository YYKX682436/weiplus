package ey5;

/* loaded from: classes13.dex */
public class k implements com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tencentmap.mapsdk.map.CancelableCallback f257655a;

    public k(ey5.r rVar, com.tencent.tencentmap.mapsdk.map.CancelableCallback cancelableCallback) {
        this.f257655a = cancelableCallback;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback
    public void onCancel() {
        com.tencent.tencentmap.mapsdk.map.CancelableCallback cancelableCallback = this.f257655a;
        if (cancelableCallback != null) {
            cancelableCallback.onCancel();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback
    public void onFinish() {
        com.tencent.tencentmap.mapsdk.map.CancelableCallback cancelableCallback = this.f257655a;
        if (cancelableCallback != null) {
            cancelableCallback.onFinish();
        }
    }
}
