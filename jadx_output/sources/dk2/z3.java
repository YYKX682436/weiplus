package dk2;

/* loaded from: classes.dex */
public final class z3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f234415a;

    public z3(kotlin.coroutines.Continuation continuation) {
        this.f234415a = continuation;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar == null) {
            return null;
        }
        if (zl2.q4.f473933a.E()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BatchGetObjectAsyncInfo resp:");
            com.tencent.mm.protobuf.f resp = fVar.f70618d;
            kotlin.jvm.internal.o.f(resp, "resp");
            sb6.append(pm0.b0.b(resp));
            com.tencent.mars.xlog.Log.i("FinderLiveAssistant2", sb6.toString());
        }
        int i17 = fVar.f70615a;
        kotlin.coroutines.Continuation continuation = this.f234415a;
        if (i17 != 0 || fVar.f70616b != 0) {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
            return fVar;
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m521constructorimpl(fVar.f70618d));
        return fVar;
    }
}
