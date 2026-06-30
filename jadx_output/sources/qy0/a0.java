package qy0;

/* loaded from: classes5.dex */
public final class a0 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f367556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f367557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qy0.d0 f367558f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(kotlin.jvm.internal.c0 c0Var, qy0.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f367557e = c0Var;
        this.f367558f = d0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        qy0.a0 a0Var = new qy0.a0(this.f367557e, this.f367558f, (kotlin.coroutines.Continuation) obj3);
        a0Var.f367556d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        a0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Throwable th6 = (java.lang.Throwable) this.f367556d;
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC", "change on completion");
        this.f367557e.f310112d = th6 == null;
        this.f367558f.P6().dismiss();
        return jz5.f0.f302826a;
    }
}
