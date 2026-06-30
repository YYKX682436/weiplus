package nr0;

/* loaded from: classes14.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f339112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f339113e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nr0.x f339114f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(int i17, int i18, nr0.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339112d = i17;
        this.f339113e = i18;
        this.f339114f = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nr0.w(this.f339112d, this.f339113e, this.f339114f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        nr0.w wVar = (nr0.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        wVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setPreviewSize:[");
        int i17 = this.f339112d;
        sb6.append(i17);
        sb6.append(' ');
        int i18 = this.f339113e;
        sb6.append(i18);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.GLEnvBuilder", sb6.toString());
        nr0.x xVar = this.f339114f;
        xVar.f339121m.b(i17, i18);
        kotlin.coroutines.Continuation continuation = xVar.f339125q;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (continuation != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(f0Var));
        }
        xVar.f339125q = null;
        return f0Var;
    }
}
