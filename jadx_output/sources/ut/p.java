package ut;

/* loaded from: classes12.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f430702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f430703e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f430704f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String str, ut.q0 q0Var, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f430702d = str;
        this.f430703e = q0Var;
        this.f430704f = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ut.p(this.f430702d, this.f430703e, this.f430704f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ut.p pVar = (ut.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        pVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ct.w2 w2Var = (ct.w2) i95.n0.c(ct.w2.class);
        java.lang.String str = this.f430702d;
        ((com.tencent.mm.pluginsdk.model.app.d3) w2Var).getClass();
        int a17 = com.tencent.mm.ui.report.f0.a(str);
        this.f430703e.f430712o.f430742z = a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.SendFileTask", this.f430704f + " html js scan done path=" + this.f430702d + " hasJs=" + a17);
        return jz5.f0.f302826a;
    }
}
