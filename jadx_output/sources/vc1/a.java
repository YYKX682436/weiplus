package vc1;

/* loaded from: classes13.dex */
public class a implements com.tencent.tencentmap.mapsdk.map.TencentMap.OnScreenShotListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f434908a;

    public a(vc1.p1 p1Var) {
        this.f434908a = p1Var;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.TencentMap.OnScreenShotListener
    public void onMapScreenShot(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            this.f434908a.f435066d.setImageBitmap(bitmap);
        }
    }
}
