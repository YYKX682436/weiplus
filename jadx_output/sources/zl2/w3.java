package zl2;

/* loaded from: classes3.dex */
public final class w3 implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f474016a;

    public w3(kotlin.coroutines.Continuation continuation) {
        this.f474016a = continuation;
    }

    @Override // fp0.p
    public void a(fp0.d task, fp0.u status) {
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[dealWithBgPath] upload end");
        mv2.p0 p0Var = (mv2.p0) task;
        fp0.u uVar = fp0.u.f265290f;
        kotlin.coroutines.Continuation continuation = this.f474016a;
        if (status != uVar || com.tencent.mm.sdk.platformtools.t8.K0(p0Var.f331616h)) {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
        } else {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(p0Var.f331616h));
        }
    }
}
