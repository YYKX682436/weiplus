package rp4;

/* loaded from: classes4.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ct0.b f398685d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ct0.b bVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f398685d = bVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rp4.r(this.f398685d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rp4.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        dw3.c0 c0Var = dw3.c0.f244182a;
        java.lang.String videoPath = this.f398685d.f222204a;
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        if (!gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, true)) {
            return null;
        }
        java.lang.String h17 = ai3.d.h("mp4");
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaFileUtil", "auto save " + videoPath + " exportPath " + h17, videoPath, h17);
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ai(com.tencent.mm.sdk.platformtools.x2.f193071a, videoPath, h17);
        q75.c.f(h17, com.tencent.mm.sdk.platformtools.x2.f193071a);
        return h17;
    }
}
