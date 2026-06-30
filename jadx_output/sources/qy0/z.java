package qy0;

/* loaded from: classes5.dex */
public final class z extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f367687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qy0.d0 f367688e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dz0.l f367689f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(qy0.d0 d0Var, dz0.l lVar, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f367688e = d0Var;
        this.f367689f = lVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        qy0.z zVar = new qy0.z(this.f367688e, this.f367689f, (kotlin.coroutines.Continuation) obj3);
        zVar.f367687d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        zVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.printErrStackTrace("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", (java.lang.Throwable) this.f367687d, "maas error", new java.lang.Object[0]);
        this.f367688e.P6().dismiss();
        ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) this.f367689f).r7(com.tencent.mm.R.string.m6j);
        return jz5.f0.f302826a;
    }
}
