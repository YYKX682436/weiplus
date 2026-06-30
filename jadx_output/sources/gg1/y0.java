package gg1;

/* loaded from: classes7.dex */
public final class y0 extends gg1.y {
    @Override // z91.a
    public void a(aa1.e eVar) {
        if (eVar != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoCast.VideoCastController", "setVolume fail:" + eVar.f2487c);
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoCast.VideoCastController", "setVolume fail:" + eVar.f2487c);
        }
    }

    @Override // z91.a
    public void b(aa1.e response) {
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastController", "setVolume success");
    }
}
