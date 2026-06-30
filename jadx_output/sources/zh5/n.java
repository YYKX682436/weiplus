package zh5;

/* loaded from: classes12.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f473046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zh5.p f473047e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zh5.l f473048f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473049g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473050h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473051i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ zh5.x f473052m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ gg3.c f473053n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(zh5.p pVar, zh5.l lVar, java.lang.String str, java.lang.String str2, java.lang.String str3, zh5.x xVar, gg3.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f473047e = pVar;
        this.f473048f = lVar;
        this.f473049g = str;
        this.f473050h = str2;
        this.f473051i = str3;
        this.f473052m = xVar;
        this.f473053n = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zh5.n(this.f473047e, this.f473048f, this.f473049g, this.f473050h, this.f473051i, this.f473052m, this.f473053n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zh5.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f473046d;
        zh5.p pVar = this.f473047e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            zh5.k kVar = pVar.f473057f;
            this.f473046d = 1;
            obj = kVar.b(this.f473048f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        zh5.f fVar = (zh5.f) obj;
        zh5.f fVar2 = zh5.f.f473021d;
        java.lang.String str = this.f473049g;
        if (fVar == fVar2) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download video success, result: ");
            sb6.append(fVar);
            sb6.append(" mediaId: ");
            sb6.append(str);
            sb6.append(" length: ");
            java.lang.String str2 = this.f473050h;
            sb6.append(com.tencent.mm.vfs.w6.k(str2));
            sb6.append(" path: ");
            sb6.append(str2);
            com.tencent.mars.xlog.Log.i("MediaGallery.CDNVideoStateManager", sb6.toString());
            zh5.k0 k0Var = (zh5.k0) pVar.U6(zh5.k0.class);
            e60.t0 t0Var = k0Var != null ? ((zh5.e) k0Var).f473019d : null;
            if (t0Var != null) {
                com.tencent.mars.xlog.Log.i("MediaGallery.CDNVideoStateManager", "video download check duplicate file. mediaId: " + str + " checkDupRsp: " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(str2, t0Var.f249735f, null, null).f477691a);
            }
            ((java.util.HashSet) ((jz5.n) pVar.f473059h).getValue()).remove(this.f473051i);
            jg3.b.X6(this.f473047e, this.f473052m, gg3.d.f271733e, this.f473053n, null, 4, null);
        } else {
            com.tencent.mars.xlog.Log.e("MediaGallery.CDNVideoStateManager", "download video failed, result: " + fVar + " mediaId:  " + str + " ret:" + fVar);
            jg3.b.X6(this.f473047e, this.f473052m, gg3.d.f271734f, this.f473053n, null, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
