package df;

/* loaded from: classes15.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f229479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df.p0 f229480e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(df.p0 p0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229480e = p0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df.h0(this.f229480e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f229479d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        df.p0 p0Var = this.f229480e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.flutter.embedding.engine.renderer.FlutterRenderer attachedRenderer = p0Var.f229532a.getAttachedRenderer();
            if (attachedRenderer != null) {
                this.f229479d = 1;
                if (df.p0.n(p0Var, attachedRenderer, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return f0Var;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (p0Var.f229532a.getAttachedRenderer() != null) {
            this.f229479d = 2;
            p0Var.getClass();
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            p0Var.f229532a.post(new df.o0(rVar));
            java.lang.Object j17 = rVar.j();
            if (j17 != aVar) {
                j17 = f0Var;
            }
            if (j17 == aVar) {
                return aVar;
            }
        }
        return f0Var;
    }
}
