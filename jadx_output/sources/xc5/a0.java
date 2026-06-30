package xc5;

/* loaded from: classes12.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.h0 f453371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l70.e f453372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mf3.k f453373f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(xc5.h0 h0Var, l70.e eVar, mf3.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453371d = h0Var;
        this.f453372e = eVar;
        this.f453373f = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xc5.a0(this.f453371d, this.f453372e, this.f453373f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xc5.a0 a0Var = (xc5.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        rf3.u uVar;
        mf3.s sVar;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xc5.h0 h0Var = this.f453371d;
        h0Var.f453467y = false;
        l70.e eVar = this.f453372e;
        l70.f fVar = eVar.f316818a;
        l70.f fVar2 = l70.f.f316820d;
        mf3.k kVar = this.f453373f;
        if (fVar == fVar2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryImageBottomBarLayer", "download origin success. mediaId: " + kVar.getId());
            lg3.a aVar2 = h0Var.f453465w;
            if (aVar2 != null) {
                ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar2).h(kVar, new vf3.f(vf3.e.f436381h, null, 0, 0.0f, 14, null));
            }
            rf3.q qVar = (rf3.q) h0Var.g(rf3.q.class);
            if (qVar != null && (sVar = (uVar = (rf3.u) qVar).f326110m) != null) {
                uVar.t(sVar);
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryImageBottomBarLayer", "download origin failed. ret: " + eVar.f316819b);
            kVar.f(mf3.w.f326128d);
            lg3.a aVar3 = h0Var.f453465w;
            if (aVar3 != null) {
                ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar3).h(kVar, new vf3.f(vf3.e.f436382i, null, 0, 0.0f, 14, null));
            }
        }
        h0Var.a0();
        return jz5.f0.f302826a;
    }
}
