package xc5;

/* loaded from: classes12.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f453480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc5.k1 f453481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mf3.k f453482f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mf3.w f453483g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l70.d f453484h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l70.d f453485i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ sf3.g f453486m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ gg3.c f453487n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f453488o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(xc5.k1 k1Var, mf3.k kVar, mf3.w wVar, l70.d dVar, l70.d dVar2, sf3.g gVar, gg3.c cVar, com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453481e = k1Var;
        this.f453482f = kVar;
        this.f453483g = wVar;
        this.f453484h = dVar;
        this.f453485i = dVar2;
        this.f453486m = gVar;
        this.f453487n = cVar;
        this.f453488o = f9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xc5.i1(this.f453481e, this.f453482f, this.f453483g, this.f453484h, this.f453485i, this.f453486m, this.f453487n, this.f453488o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xc5.i1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f453480d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            l70.d dVar = this.f453484h;
            java.lang.String str = dVar.f316805f;
            l70.d dVar2 = this.f453485i;
            java.lang.String str2 = dVar2.f316805f;
            xc5.k1 k1Var = this.f453481e;
            mf3.k kVar = this.f453482f;
            mf3.w wVar = this.f453483g;
            if (k1Var.i7(kVar, wVar, str, str2)) {
                com.tencent.mars.xlog.Log.i("MediaGallery.MsgHistoryGalleryLiveStateManager", "live res already exists. mediaId=" + kVar.getId());
                xc5.z0 z0Var = kVar instanceof xc5.z0 ? (xc5.z0) kVar : null;
                if (z0Var != null) {
                    z0Var.i(wVar, dVar.f316805f, dVar2.f316805f);
                }
                k1Var.l7(kVar, this.f453486m.c(), dVar2.f316805f);
                vf3.i.Z6(this.f453481e, this.f453482f, vf3.e.f436378e, null, this.f453487n, this.f453486m, 2, null);
                return f0Var;
            }
            xc5.k1 k1Var2 = this.f453481e;
            mf3.k kVar2 = this.f453482f;
            vf3.e eVar = vf3.e.f436380g;
            k1Var2.Y6(kVar2, eVar, new vf3.f(eVar, null, 0, 0.0f, 6, null), this.f453487n, this.f453486m);
            xc5.k1 k1Var3 = this.f453481e;
            mf3.k kVar3 = this.f453482f;
            com.tencent.mm.storage.f9 f9Var = this.f453488o;
            mf3.w wVar2 = this.f453483g;
            l70.d dVar3 = this.f453484h;
            l70.d dVar4 = this.f453485i;
            gg3.c cVar = this.f453487n;
            sf3.g gVar = this.f453486m;
            this.f453480d = 1;
            if (xc5.k1.b7(k1Var3, kVar3, f9Var, wVar2, dVar3, dVar4, cVar, gVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
