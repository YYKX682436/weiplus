package tb1;

/* loaded from: classes7.dex */
public class g implements bi3.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView f416895a;

    public g(com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView) {
        this.f416895a = appBrandCameraView;
    }

    @Override // bi3.c
    public void a(byte[] bArr, int i17, int i18) {
        tb1.m mVar = this.f416895a.f80172h;
        if (mVar != null) {
            mVar.a(bArr, i17, i18);
        }
    }
}
