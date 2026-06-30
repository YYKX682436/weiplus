package gx0;

/* loaded from: classes5.dex */
public final class ke implements com.tencent.maas.moviecomposing.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f276637a;

    public ke(kotlinx.coroutines.q qVar) {
        this.f276637a = qVar;
    }

    @Override // com.tencent.maas.moviecomposing.u
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        kotlinx.coroutines.q qVar = this.f276637a;
        if (mJError == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new xt0.c(mJError))));
        }
    }
}
