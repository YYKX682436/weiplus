package vc1;

/* loaded from: classes13.dex */
public class u0 implements com.tencent.tencentmap.mapsdk.map.TencentMap.OnScreenShotListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f435183a;

    public u0(vc1.p1 p1Var) {
        this.f435183a = p1Var;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnScreenShotListener
    public void onMapScreenShot(android.graphics.Bitmap bitmap) {
        vc1.p1 p1Var = this.f435183a;
        if (bitmap != null) {
            p1Var.f435066d.setImageBitmap(bitmap);
        }
        p1Var.f435071f0.set(false);
    }
}
