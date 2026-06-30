package yt3;

/* loaded from: classes10.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.p0 f465454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f465455e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f465456f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(yt3.p0 p0Var, boolean z17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f465454d = p0Var;
        this.f465455e = z17;
        this.f465456f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yt3.g0(this.f465454d, this.f465455e, this.f465456f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yt3.g0 g0Var = (yt3.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        yt3.p0 p0Var = this.f465454d;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = p0Var.f465584i;
        com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel(bool, "", recordConfigProvider != null ? recordConfigProvider.E : null, new java.lang.Long(-1L), bool, nu3.i.f340218a.l());
        captureDataManager$CaptureVideoNormalModel.f155667n = java.lang.Boolean.valueOf(this.f465455e);
        yz5.l lVar = this.f465456f;
        if (lVar != null) {
            lVar.invoke(captureDataManager$CaptureVideoNormalModel);
        } else {
            ut3.f.f431176c.a(p0Var.f465588p, captureDataManager$CaptureVideoNormalModel);
        }
        return jz5.f0.f302826a;
    }
}
