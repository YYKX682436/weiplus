package tf1;

/* loaded from: classes7.dex */
public class j implements com.tencent.mm.plugin.appbrand.jsapi.media.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tf1.i f418885a;

    public j(tf1.i iVar) {
        this.f418885a = iVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.r1
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BackgroundPlayAudioFocusHelper", "audio focus lossTransient");
        this.f418885a.f418882a.u(null);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.r1
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BackgroundPlayAudioFocusHelper", "audio focus gain");
        tf1.f fVar = this.f418885a.f418882a;
        if (fVar.f418869r) {
            fVar.w(null);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.r1
    public void onStop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BackgroundPlayAudioFocusHelper", "audio focus loss, passive pause");
        tf1.i iVar = this.f418885a;
        iVar.f418882a.x();
        iVar.a();
    }
}
