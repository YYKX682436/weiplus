package yx0;

/* loaded from: classes5.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.m f467104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camerafun.MJAIGCParams f467105f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f467106g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yx0.b8 b8Var, yx0.m mVar, com.tencent.maas.camerafun.MJAIGCParams mJAIGCParams, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467103d = b8Var;
        this.f467104e = mVar;
        this.f467105f = mJAIGCParams;
        this.f467106g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.a(this.f467103d, this.f467104e, this.f467105f, this.f467106g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "updateAIGCResult, state: " + this.f467103d.f467192s + ", isImportPreviewState: " + this.f467103d.Z());
        yx0.v vVar = this.f467103d.f467192s;
        yx0.v vVar2 = yx0.v.f467705s;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (vVar != vVar2 && !this.f467103d.Z()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "updateAIGCResult >> Invalid state: " + this.f467103d.f467192s);
            return f0Var;
        }
        yx0.m mVar = this.f467104e;
        yx0.b8 this_run = this.f467103d;
        kotlin.jvm.internal.o.f(this_run, "$this_run");
        com.tencent.maas.camerafun.MJAIGCParams mJAIGCParams = this.f467105f;
        boolean z17 = this.f467106g;
        mVar.getClass();
        pp0.p0 p0Var = this_run.K;
        if (p0Var != null) {
            p0Var.c0(mJAIGCParams, new yx0.l(z17, this_run));
        }
        return f0Var;
    }
}
