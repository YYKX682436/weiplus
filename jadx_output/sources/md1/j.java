package md1;

/* loaded from: classes7.dex */
public class j implements fb1.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325747d;

    public j(md1.s sVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f325747d = c0Var;
    }

    @Override // fb1.h
    public void a(fb1.c cVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "onStatusChange");
        if (cVar instanceof fb1.a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "onStatusChange:%s", ((fb1.a) cVar).f260827a);
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE.j(null, dz.k.ReasonInCommingCall);
        }
    }

    @Override // fb1.h
    public androidx.lifecycle.y getLifecycleOwner() {
        return this.f325747d.t3().P;
    }
}
