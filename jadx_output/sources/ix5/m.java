package ix5;

/* loaded from: classes16.dex */
public final class m implements com.tencent.shadow.dynamic.host.EnterCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f295654a;

    public m(kotlin.coroutines.Continuation continuation) {
        this.f295654a = continuation;
    }

    @Override // com.tencent.shadow.dynamic.host.EnterCallback
    public final void onComplete(com.tencent.shadow.dynamic.host.ErrorInfo errorInfo, java.lang.Object obj) {
        boolean isOk = errorInfo.isOk();
        kotlin.coroutines.Continuation continuation = this.f295654a;
        if (!isOk) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(com.tencent.wva.hostsdk.WVAException.Companion.a(errorInfo, obj))));
            return;
        }
        if (obj == null ? true : obj instanceof java.util.Map) {
            java.lang.Object obj2 = (java.util.Map) obj;
            if (obj2 == null) {
                obj2 = kz5.q0.f314001d;
            }
            continuation.resumeWith(kotlin.Result.m521constructorimpl(obj2));
            return;
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        hx5.f fVar = com.tencent.wva.hostsdk.WVAException.Companion;
        com.tencent.shadow.dynamic.host.ErrorInfo errorInfo2 = hx5.e.f285711a;
        continuation.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(fVar.a(hx5.e.f285711a, obj))));
    }
}
