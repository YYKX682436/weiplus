package ku3;

/* loaded from: classes3.dex */
public final class y1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ku3.z1 f312465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bs0.f f312466f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f312467g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(ku3.z1 z1Var, bs0.f fVar, float f17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f312465e = z1Var;
        this.f312466f = fVar;
        this.f312467g = f17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ku3.y1(this.f312465e, this.f312466f, this.f312467g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ku3.y1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f312464d;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        ku3.z1 z1Var = this.f312465e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            bs0.j jVar = z1Var.f312494e.f475577e;
            this.f312464d = 1;
            obj = jVar.D0(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return f0Var2;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        float f17 = this.f312467g;
        bs0.f fVar = this.f312466f;
        if (bitmap != null) {
            um5.d dVar = new um5.d();
            dVar.b(bitmap);
            int width = z1Var.c().getWidth();
            int height = z1Var.c().getHeight();
            dVar.f429141b = width;
            dVar.f429142c = height;
            dVar.f429144e.f429193b.b().d(30.0f);
            dVar.a(new ku3.w1(z1Var, fVar, f17));
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RecordFrameShaderPlugin", "request bitmap is null");
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            ku3.x1 x1Var = new ku3.x1(z1Var, fVar, f17, null);
            this.f312464d = 2;
            if (kotlinx.coroutines.l.g(g3Var, x1Var, this) == aVar) {
                return aVar;
            }
        }
        return f0Var2;
    }
}
