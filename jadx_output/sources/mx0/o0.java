package mx0;

/* loaded from: classes5.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f332179e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCamSpatialDesc f332180f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f332181g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(mx0.e1 e1Var, com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332179e = e1Var;
        this.f332180f = mJCamSpatialDesc;
        this.f332181g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.o0(this.f332179e, this.f332180f, this.f332181g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332178d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pp0.p0 p0Var = this.f332179e.f331934a;
            com.tencent.maas.camstudio.MJCamSpatialDesc mJCamSpatialDesc = this.f332180f;
            this.f332178d = 1;
            obj = p0Var.K(mJCamSpatialDesc, this);
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
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        mx0.e1 e1Var = this.f332179e;
        e1Var.f(e1Var.f331941h ? mx0.d0.f331903q : mx0.d0.f331895f);
        com.tencent.mars.xlog.Log.i("MicroMsg.MaterialImportHelper", "exitImportCrop: after endAdjustSpatialDesc importPreviewState = " + this.f332179e.f331935b);
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        mx0.n0 n0Var = new mx0.n0(this.f332181g, booleanValue, null);
        this.f332178d = 2;
        if (kotlinx.coroutines.l.g(g3Var, n0Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
