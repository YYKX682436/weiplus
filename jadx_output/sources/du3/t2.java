package du3;

/* loaded from: classes10.dex */
public final class t2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.t3 f243716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f243717e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f243718f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(du3.t3 t3Var, boolean z17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243716d = t3Var;
        this.f243717e = z17;
        this.f243718f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new du3.t2(this.f243716d, this.f243717e, this.f243718f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        du3.t2 t2Var = (du3.t2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        t2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        du3.t3 t3Var = this.f243716d;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = t3Var.f243724n;
        com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel(bool, "", recordConfigProvider != null ? recordConfigProvider.E : null, new java.lang.Long(-1L), bool, nu3.i.f340218a.l());
        captureDataManager$CaptureVideoNormalModel.f155667n = java.lang.Boolean.valueOf(this.f243717e);
        yz5.l lVar = this.f243718f;
        if (lVar != null) {
            lVar.invoke(captureDataManager$CaptureVideoNormalModel);
        } else {
            ut3.f.f431176c.a(t3Var.f243719f.getContext(), captureDataManager$CaptureVideoNormalModel);
        }
        return jz5.f0.f302826a;
    }
}
