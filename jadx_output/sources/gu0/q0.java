package gu0;

/* loaded from: classes5.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f275792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f275794f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(gu0.k2 k2Var, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f275793e = k2Var;
        this.f275794f = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gu0.q0(this.f275793e, this.f275794f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gu0.q0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.o oVar;
        java.lang.String str;
        com.tencent.maas.instamovie.base.MJError mJError;
        com.tencent.maas.instamovie.base.MJError mJError2;
        eu0.o oVar2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f275792d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        yz5.p pVar = this.f275794f;
        gu0.k2 k2Var = this.f275793e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.f275792d = 1;
                obj = gu0.k2.e(k2Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            oVar = (jz5.o) obj;
            str = null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MJCC.Session", "exportVideoForReedit: exception: " + e17.getMessage());
            pVar.invoke(java.lang.Boolean.FALSE, "Exception: " + e17.getMessage());
        }
        if (oVar != null && oVar.f302843f == null) {
            k2Var.f275746v = (java.lang.String) oVar.f302841d;
            k2Var.f275747w = (java.lang.String) oVar.f302842e;
            com.tencent.mars.xlog.Log.i("MJCC.Session", "exportVideoForReedit: success, path=" + k2Var.f275746v + ", checksum=" + k2Var.f275747w);
            eu0.q qVar = new eu0.q();
            qVar.f256730a = "reedit";
            eu0.b bVar = k2Var.f275725a;
            qVar.f256731b = bVar.f256707m;
            qVar.f256732c = bVar.f256698d;
            qVar.f256733d = bVar.f256705k;
            qVar.f256734e = bVar.f256700f;
            eu0.o oVar3 = bVar.f256708n;
            if (oVar3 != null) {
                java.lang.String finderTabContextId = oVar3.f256727a;
                java.lang.String finderContextId = oVar3.f256728b;
                kotlin.jvm.internal.o.g(finderTabContextId, "finderTabContextId");
                kotlin.jvm.internal.o.g(finderContextId, "finderContextId");
                oVar2 = new eu0.o(finderTabContextId, finderContextId);
            } else {
                oVar2 = null;
            }
            qVar.f256735f = oVar2;
            k2Var.C = qVar;
            com.tencent.mars.xlog.Log.i("MJCC.Session", "exportVideoForReedit: new params=" + k2Var.C);
            k2Var.D = gu0.k2.a(k2Var);
            com.tencent.mars.xlog.Log.i("MJCC.Session", "exportVideoForReedit: new edit info: " + k2Var.D);
            k2Var.E = gu0.k2.b(k2Var);
            com.tencent.mars.xlog.Log.i("MJCC.Session", "exportVideoForReedit: new local create info: " + k2Var.E);
            pVar.invoke(java.lang.Boolean.TRUE, null);
            return f0Var;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("exportVideoForReedit: export failed, err=");
        sb6.append((oVar == null || (mJError2 = (com.tencent.maas.instamovie.base.MJError) oVar.f302843f) == null) ? null : mJError2.message);
        com.tencent.mars.xlog.Log.e("MJCC.Session", sb6.toString());
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Export video failed: ");
        if (oVar != null && (mJError = (com.tencent.maas.instamovie.base.MJError) oVar.f302843f) != null) {
            str = mJError.message;
        }
        sb7.append(str);
        pVar.invoke(bool, sb7.toString());
        return f0Var;
    }
}
