package gi5;

/* loaded from: classes12.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f272326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tt.h f272327e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272328f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272329g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gi5.v f272330h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272331i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ai5.c f272332m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ gg3.c f272333n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(tt.h hVar, java.lang.String str, java.lang.String str2, gi5.v vVar, java.lang.String str3, ai5.c cVar, gg3.c cVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f272327e = hVar;
        this.f272328f = str;
        this.f272329g = str2;
        this.f272330h = vVar;
        this.f272331i = str3;
        this.f272332m = cVar;
        this.f272333n = cVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gi5.t(this.f272327e, this.f272328f, this.f272329g, this.f272330h, this.f272331i, this.f272332m, this.f272333n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gi5.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f272326d;
        tt.h hVar = this.f272327e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pt.k0 k0Var = (pt.k0) i95.n0.c(pt.k0.class);
            this.f272326d = 1;
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
        java.lang.String str = this.f272328f;
        if (gVar == gVar2) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download video success, result: ");
            sb6.append(gVar);
            sb6.append(" mediaId: ");
            sb6.append(str);
            sb6.append(" length: ");
            java.lang.String str2 = this.f272329g;
            sb6.append(com.tencent.mm.vfs.w6.k(str2));
            sb6.append(" path: ");
            sb6.append(str2);
            com.tencent.mars.xlog.Log.i("MediaGallery.RecordVideoStateManager", sb6.toString());
            if (hVar.f421768e != null) {
                com.tencent.mars.xlog.Log.i("MediaGallery.RecordVideoStateManager", "video download check duplicate file. mediaId: " + str + " checkDupRsp: " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(str2, 19, null, null).f477691a);
            }
            ((java.util.HashSet) ((jz5.n) this.f272330h.f272338g).getValue()).remove(this.f272331i);
            jg3.b.X6(this.f272330h, this.f272332m, gg3.d.f271733e, this.f272333n, null, 4, null);
        } else {
            com.tencent.mars.xlog.Log.e("MediaGallery.RecordVideoStateManager", "download video failed, result: " + gVar + " mediaId:  " + str + " ret:" + iVar.f421774b);
            jg3.b.X6(this.f272330h, this.f272332m, gg3.d.f271734f, this.f272333n, null, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
