package vc1;

/* loaded from: classes13.dex */
public class a1 implements com.tencent.tencentmap.mapsdk.maps.TencentMap.OnAuthResultCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f434909a;

    public a1(vc1.p1 p1Var) {
        this.f434909a = p1Var;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnAuthResultCallback
    public void onAuthFail(int i17, java.lang.String str) {
        vc1.p1 p1Var = this.f434909a;
        vc1.k2 k2Var = p1Var.f435107x0;
        if (k2Var != null) {
            k2Var.onAuthFail(i17, str);
            return;
        }
        synchronized (p1Var) {
            vc1.p1 p1Var2 = this.f434909a;
            p1Var2.A0 = true;
            p1Var2.f435109y0 = i17;
            p1Var2.f435111z0 = str;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "onAuthFail authResultCallback null");
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnAuthResultCallback
    public void onAuthSuccess() {
        vc1.p1 p1Var = this.f434909a;
        p1Var.C0 = true;
        vc1.k2 k2Var = p1Var.f435107x0;
        if (k2Var != null) {
            k2Var.onAuthSuccess();
            return;
        }
        synchronized (p1Var) {
            this.f434909a.B0 = true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Map.DefaultTencentMapView", "onAuthSuccess authResultCallback null");
    }
}
