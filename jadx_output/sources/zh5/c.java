package zh5;

/* loaded from: classes12.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f473003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zh5.d f473004e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zh5.l f473005f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473006g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473007h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473008i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ zh5.a f473009m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ sf3.g f473010n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(zh5.d dVar, zh5.l lVar, java.lang.String str, java.lang.String str2, java.lang.String str3, zh5.a aVar, sf3.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f473004e = dVar;
        this.f473005f = lVar;
        this.f473006g = str;
        this.f473007h = str2;
        this.f473008i = str3;
        this.f473009m = aVar;
        this.f473010n = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zh5.c(this.f473004e, this.f473005f, this.f473006g, this.f473007h, this.f473008i, this.f473009m, this.f473010n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zh5.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f473003d;
        zh5.d dVar = this.f473004e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            zh5.k kVar = dVar.f473014g;
            this.f473003d = 1;
            obj = kVar.b(this.f473005f, this);
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
        sf3.g gVar = this.f473010n;
        zh5.a aVar2 = this.f473009m;
        java.lang.String str = this.f473006g;
        if (fVar == fVar2) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download image success ");
            sb6.append(fVar);
            sb6.append(" mediaId:");
            sb6.append(str);
            sb6.append(" length: ");
            java.lang.String str2 = this.f473007h;
            sb6.append(com.tencent.mm.vfs.w6.k(str2));
            com.tencent.mars.xlog.Log.i("MediaGallery.CDNImageStateManager", sb6.toString());
            ((java.util.HashSet) ((jz5.n) dVar.f473015h).getValue()).remove(this.f473008i);
            dVar.W6(aVar2, sf3.k.f407397e, gVar);
            zh5.k0 k0Var = (zh5.k0) dVar.U6(zh5.k0.class);
            e60.t0 t0Var = k0Var != null ? ((zh5.e) k0Var).f473019d : null;
            if (t0Var != null) {
                com.tencent.mars.xlog.Log.i("MediaGallery.CDNImageStateManager", "image download check duplicate file. mediaId: " + str + " checkDupRsp: " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(str2, t0Var.f249735f, null, null).f477691a);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MediaGallery.CDNImageStateManager", "download image failed  " + fVar + " mediaId:" + str);
            dVar.W6(aVar2, sf3.k.f407398f, gVar);
        }
        return jz5.f0.f302826a;
    }
}
