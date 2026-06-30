package mx0;

/* loaded from: classes5.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f332091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f332092f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(mx0.e1 e1Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332091e = e1Var;
        this.f332092f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.k0(this.f332091e, this.f332092f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.k0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332090d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pp0.p0 p0Var = this.f332091e.f331934a;
            this.f332090d = 1;
            obj = p0Var.o(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.l lVar = (jz5.l) obj;
        mx0.e1 e1Var = this.f332091e;
        e1Var.f(lVar != null ? mx0.d0.f331900n : e1Var.f331941h ? mx0.d0.f331903q : mx0.d0.f331895f);
        com.tencent.mars.xlog.Log.i("MicroMsg.MaterialImportHelper", "enterImportCrop: after beginAdjustSpatialDesc importPreviewState = " + this.f332091e.f331935b);
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        mx0.j0 j0Var = new mx0.j0(this.f332092f, lVar, null);
        this.f332090d = 2;
        if (kotlinx.coroutines.l.g(g3Var, j0Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
