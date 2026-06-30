package gt;

/* loaded from: classes7.dex */
public class x4 extends com.tencent.mm.sdk.event.n {
    public x4() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.FetchAppBrandInfoForMusicEvent fetchAppBrandInfoForMusicEvent = (com.tencent.mm.autogen.events.FetchAppBrandInfoForMusicEvent) iEvent;
        if (!gm0.j1.a()) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreAppBrand", "FetchAppBrandInfoForMusicEvent callback");
        am.ja jaVar = fetchAppBrandInfoForMusicEvent.f54253g;
        com.tencent.mm.plugin.appbrand.media.music.h hVar = com.tencent.mm.plugin.appbrand.media.music.f.f85760a;
        jaVar.f7018a = hVar.f85761a;
        jaVar.f7019b = hVar.f85768h;
        jaVar.f7020c = hVar.f85767g;
        jaVar.f7021d = hVar.f85766f;
        com.tencent.mm.plugin.appbrand.app.r9.ij().n1(fetchAppBrandInfoForMusicEvent.f54253g.f7019b, "roundedSquareIconURL", "brandIconURL", "bigHeadURL");
        return true;
    }
}
