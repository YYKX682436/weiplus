package xc5;

/* loaded from: classes12.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f453508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l70.d f453509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc5.l0 f453510f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f453511g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mf3.k f453512h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sf3.g f453513i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l70.d dVar, xc5.l0 l0Var, java.lang.String str, mf3.k kVar, sf3.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453509e = dVar;
        this.f453510f = l0Var;
        this.f453511g = str;
        this.f453512h = kVar;
        this.f453513i = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xc5.k0(this.f453509e, this.f453510f, this.f453511g, this.f453512h, this.f453513i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xc5.k0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f453508d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xs.d1 d1Var = (xs.d1) i95.n0.c(xs.d1.class);
            this.f453508d = 1;
            obj = ((v70.w) d1Var).bj(this.f453509e, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        l70.e eVar = (l70.e) obj;
        xc5.l0 l0Var = this.f453510f;
        java.util.HashSet hashSet = (java.util.HashSet) ((jz5.n) l0Var.f453532g).getValue();
        java.lang.String str = this.f453511g;
        hashSet.remove(str);
        l70.f fVar = eVar.f316818a;
        l70.f fVar2 = l70.f.f316820d;
        sf3.g gVar = this.f453513i;
        mf3.k kVar = this.f453512h;
        if (fVar == fVar2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryImageStateManager", "download mid success. mediaId: " + str);
            sf3.g e17 = kVar.e();
            sf3.g b17 = e17 != null ? e17.b(sf3.m.f407404f) : null;
            if (b17 != null && b17.f407391e != sf3.m.f407402d) {
                gVar = b17;
            }
            l0Var.W6(kVar, sf3.k.f407397e, gVar);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryImageStateManager", "download failed. mediaId: " + str + " ret: " + eVar.f316819b);
            l0Var.W6(kVar, sf3.k.f407398f, gVar);
        }
        return jz5.f0.f302826a;
    }
}
