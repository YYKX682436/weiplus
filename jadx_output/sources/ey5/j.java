package ey5;

/* loaded from: classes13.dex */
public class j implements com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tencentmap.mapsdk.map.CancelableCallback f257654a;

    public j(ey5.r rVar, com.tencent.tencentmap.mapsdk.map.CancelableCallback cancelableCallback) {
        this.f257654a = cancelableCallback;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback
    public void onCancel() {
        this.f257654a.onCancel();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback
    public void onFinish() {
        com.tencent.tencentmap.mapsdk.map.CancelableCallback cancelableCallback = this.f257654a;
        if (cancelableCallback != null) {
            cancelableCallback.onFinish();
        }
    }
}
