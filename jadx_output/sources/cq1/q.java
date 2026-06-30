package cq1;

/* loaded from: classes8.dex */
public final class q implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cq1.s f221367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f221368b;

    public q(cq1.s sVar, kotlin.coroutines.Continuation continuation) {
        this.f221367a = sVar;
        this.f221368b = continuation;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        r45.r00 r00Var = (r45.r00) fVar.f70618d;
        this.f221367a.getClass();
        com.tencent.mars.xlog.Log.i("BizCommonSchemeUrlCgiServe", "CheckExternalUrlCgi: " + i17 + ", " + i18);
        kotlin.coroutines.Continuation continuation = this.f221368b;
        if (i17 == 0 && i18 == 0) {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(r00Var));
        } else {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
        }
        return jz5.f0.f302826a;
    }
}
