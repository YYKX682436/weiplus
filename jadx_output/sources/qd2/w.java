package qd2;

/* loaded from: classes8.dex */
public final class w implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f361847a;

    public w(kotlinx.coroutines.q qVar) {
        this.f361847a = qVar;
    }

    @Override // fp0.p
    public void a(fp0.d task, fp0.u status) {
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        mv2.r0 r0Var = (mv2.r0) task;
        com.tencent.mars.xlog.Log.i("FinderModifyFeedHelper", "[uploadCover] onLoaderFin status:" + status + " url:" + r0Var.f331626h);
        fp0.u uVar = fp0.u.f265290f;
        kotlinx.coroutines.q qVar = this.f361847a;
        if (status != uVar || com.tencent.mm.sdk.platformtools.t8.K0(r0Var.f331626h)) {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(""));
        } else {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(r0Var.f331626h));
        }
    }
}
