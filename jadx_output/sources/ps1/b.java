package ps1;

/* loaded from: classes.dex */
public final class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f358053a;

    public b(kotlin.coroutines.Continuation continuation) {
        this.f358053a = continuation;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        r45.r14 r14Var = (r45.r14) fVar.f70618d;
        com.tencent.mars.xlog.Log.i("BrandServiceManageCgiServe", "runCgi: " + i17 + ", " + i18);
        kotlin.coroutines.Continuation continuation = this.f358053a;
        if (i17 == 0 && i18 == 0) {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(r14Var));
        } else {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
        }
        return jz5.f0.f302826a;
    }
}
