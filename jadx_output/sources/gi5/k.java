package gi5;

/* loaded from: classes12.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f272311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tt.h f272312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272313f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272314g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gi5.l f272315h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272316i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ai5.c f272317m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ sf3.g f272318n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(tt.h hVar, java.lang.String str, java.lang.String str2, gi5.l lVar, java.lang.String str3, ai5.c cVar, sf3.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f272312e = hVar;
        this.f272313f = str;
        this.f272314g = str2;
        this.f272315h = lVar;
        this.f272316i = str3;
        this.f272317m = cVar;
        this.f272318n = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gi5.k(this.f272312e, this.f272313f, this.f272314g, this.f272315h, this.f272316i, this.f272317m, this.f272318n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gi5.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f272311d;
        tt.h hVar = this.f272312e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pt.k0 k0Var = (pt.k0) i95.n0.c(pt.k0.class);
            this.f272311d = 1;
            ((ot.q) k0Var).getClass();
            obj = tt.f.f421757f.a().T6(hVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        tt.i iVar = (tt.i) obj;
        tt.g gVar = iVar.f421773a;
        tt.g gVar2 = tt.g.f421758d;
        sf3.g gVar3 = this.f272318n;
        ai5.c cVar = this.f272317m;
        gi5.l lVar = this.f272315h;
        java.lang.String str = this.f272313f;
        if (gVar == gVar2) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download image success ");
            sb6.append(gVar);
            sb6.append(" mediaId:");
            sb6.append(str);
            sb6.append(" length: ");
            java.lang.String str2 = this.f272314g;
            sb6.append(com.tencent.mm.vfs.w6.k(str2));
            com.tencent.mars.xlog.Log.i("MediaGallery.RecordImageStateManager", sb6.toString());
            ((java.util.HashSet) ((jz5.n) lVar.f272320h).getValue()).remove(this.f272316i);
            lVar.W6(cVar, sf3.k.f407397e, gVar3);
            if (hVar.f421768e != null) {
                com.tencent.mars.xlog.Log.i("MediaGallery.RecordImageStateManager", "image download check duplicate file. mediaId: " + str + " checkDupRsp: " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(str2, 19, null, null).f477691a);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MediaGallery.RecordImageStateManager", "download image failed  " + gVar + " mediaId:" + str + " ret:" + iVar.f421774b);
            lVar.W6(cVar, sf3.k.f407398f, gVar3);
        }
        return jz5.f0.f302826a;
    }
}
