package sz0;

/* loaded from: classes14.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f413926d;

    /* renamed from: e, reason: collision with root package name */
    public int f413927e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vo0.b f413928f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sz0.l f413929g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(vo0.b bVar, sz0.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f413928f = bVar;
        this.f413929g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sz0.k(this.f413928f, this.f413929g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sz0.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f413927e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vo0.b bVar = this.f413928f;
            this.f413926d = bVar;
            this.f413927e = 1;
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            sz0.j jVar = new sz0.j(nVar);
            wo0.c cVar = (wo0.c) bVar;
            cVar.getClass();
            cVar.f447873d = jVar;
            bVar.a();
            obj = nVar.a();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (bitmap != null) {
            h1.a aVar2 = new h1.a(e1.e.b(bitmap), 0L, 0L, 6, null);
            sz0.l lVar = this.f413929g;
            ((n0.q4) lVar.f413931m).setValue(aVar2);
            ((n0.q4) lVar.f413932n).setValue(java.lang.Boolean.TRUE);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageLoaderPainter", "get img from network " + lVar.f413930i);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageLoaderPainter", "get from network error");
        }
        return f0Var2;
    }
}
