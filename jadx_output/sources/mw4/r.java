package mw4;

/* loaded from: classes7.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f331789d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(mw4.w wVar, kotlin.coroutines.Continuation continuation) {
        super(1);
        this.f331789d = continuation;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.cdn.CronetLogic.CronetTaskResult cronetTaskResult = (com.tencent.mars.cdn.CronetLogic.CronetTaskResult) obj;
        kotlin.coroutines.Continuation continuation = this.f331789d;
        if (cronetTaskResult == null) {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
        } else if (cronetTaskResult.statusCode != 200 || cronetTaskResult.getHeaderMapList() == null) {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
        } else {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(cronetTaskResult.getHeaderMapList()));
        }
        return jz5.f0.f302826a;
    }
}
