package hu3;

/* loaded from: classes5.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f285144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem f285145e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f285146f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem improveRecordMaasFilterItem, hu3.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f285145e = improveRecordMaasFilterItem;
        this.f285146f = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hu3.k(this.f285145e, this.f285146f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hu3.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f285144d;
        hu3.n0 n0Var = this.f285146f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select filter >> ");
            com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem improveRecordMaasFilterItem = this.f285145e;
            sb6.append(improveRecordMaasFilterItem.f155704e);
            com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", sb6.toString());
            this.f285144d = 1;
            obj = n0Var.h(improveRecordMaasFilterItem, true, this);
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
        android.view.Surface surface = (android.view.Surface) obj;
        if (surface != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "switch filter success");
            if (n0Var.f285164h == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "no select beauty , goto toggle render");
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
                hu3.j jVar = new hu3.j(n0Var, surface, null);
                this.f285144d = 2;
                if (kotlinx.coroutines.l.g(g3Var, jVar, this) == aVar) {
                    return aVar;
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
