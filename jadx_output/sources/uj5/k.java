package uj5;

/* loaded from: classes5.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f428464d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f428465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.SurfaceView f428466f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.view.SurfaceView surfaceView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f428466f = surfaceView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        uj5.k kVar = new uj5.k(this.f428466f, continuation);
        kVar.f428465e = obj;
        return kVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((uj5.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f428464d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f428465e;
            uj5.j jVar = new uj5.j(this.f428466f, null);
            this.f428465e = y0Var;
            this.f428464d = 1;
            obj = kotlinx.coroutines.a4.c(100L, jVar, this);
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
        if (bitmap != null) {
            return bitmap;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SnapShotUtilKt", "PixelCopy request timed out");
        return null;
    }
}
