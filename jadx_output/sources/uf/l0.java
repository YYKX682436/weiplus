package uf;

/* loaded from: classes7.dex */
public final class l0 implements z91.a {
    @Override // z91.a
    public void a(aa1.e eVar) {
        if (eVar != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaCastController", "setVolume fail:" + eVar.f2487c);
        }
    }

    @Override // z91.a
    public void b(aa1.e response) {
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastController", "setVolume success");
    }
}
