package nl4;

/* loaded from: classes10.dex */
public final class m implements zy2.a6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nl4.r f338217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zy2.b6 f338218b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f338219c;

    public m(nl4.r rVar, zy2.b6 b6Var, kotlin.coroutines.Continuation continuation) {
        this.f338217a = rVar;
        this.f338218b = b6Var;
        this.f338219c = continuation;
    }

    @Override // zy2.a6
    public final void a(java.lang.Object obj, int i17, int i18) {
        com.tencent.mars.xlog.Log.i(this.f338217a.f338242l, "requestFinderData ret:" + i18 + ", type:" + i17 + ", feed:" + obj);
        kotlin.coroutines.Continuation continuation = this.f338219c;
        if (obj == null || !(obj instanceof com.tencent.mm.protocal.protobuf.FinderObject)) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("error:" + i18 + ", type:" + i17 + ", request finderObject failed"))));
            return;
        }
        dk4.a sj6 = ((c61.l7) this.f338218b).sj((com.tencent.mm.protocal.protobuf.FinderObject) obj);
        if (sj6 != null) {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(sj6));
            return;
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("error:" + i18 + ", type:" + i17 + ", mediaInfo from finderObject failed"))));
    }
}
