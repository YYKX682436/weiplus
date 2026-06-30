package xr1;

/* loaded from: classes3.dex */
public final class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xr1.d f456182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f456183b;

    public c(xr1.d dVar, kotlin.coroutines.Continuation continuation) {
        this.f456182a = dVar;
        this.f456183b = continuation;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        r45.mb3 mb3Var = (r45.mb3) fVar.f70618d;
        this.f456182a.getClass();
        com.tencent.mars.xlog.Log.i("BizPCRecentReadCgiServe", "runGetDataCgi: " + i17 + ", " + i18);
        kotlin.coroutines.Continuation continuation = this.f456183b;
        if (i17 == 0 && i18 == 0) {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(mb3Var));
        } else {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
        }
        return jz5.f0.f302826a;
    }
}
