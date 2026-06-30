package xc5;

/* loaded from: classes12.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.k1 f453412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l70.d f453413e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mf3.k f453414f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mf3.w f453415g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l70.d f453416h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(xc5.k1 k1Var, l70.d dVar, mf3.k kVar, mf3.w wVar, l70.d dVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453412d = k1Var;
        this.f453413e = dVar;
        this.f453414f = kVar;
        this.f453415g = wVar;
        this.f453416h = dVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xc5.d1(this.f453412d, this.f453413e, this.f453414f, this.f453415g, this.f453416h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xc5.d1 d1Var = (xc5.d1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        d1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.HashSet g76 = this.f453412d.g7();
        xc5.k1 k1Var = this.f453412d;
        l70.d dVar = this.f453413e;
        mf3.k kVar = this.f453414f;
        mf3.w wVar = this.f453415g;
        l70.d dVar2 = this.f453416h;
        synchronized (g76) {
            if (k1Var.g7().add(dVar.f316804e)) {
                ((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).Zi(dVar.f316804e);
                com.tencent.mars.xlog.Log.i("MediaGallery.MsgHistoryGalleryLiveStateManager", "cancel download image. mediaId=" + kVar.getId() + " level=" + wVar);
            }
            if (k1Var.g7().add(dVar2.f316804e)) {
                ((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).Zi(dVar2.f316804e);
                com.tencent.mars.xlog.Log.i("MediaGallery.MsgHistoryGalleryLiveStateManager", "cancel download video. mediaId=" + kVar.getId() + " level=" + wVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
