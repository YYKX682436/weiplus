package so2;

/* loaded from: classes3.dex */
public final class v5 implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f410677a;

    public v5(kotlinx.coroutines.q qVar) {
        this.f410677a = qVar;
    }

    @Override // fp0.p
    public void a(fp0.d task, fp0.u status) {
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        mv2.i0 i0Var = (mv2.i0) task;
        com.tencent.mars.xlog.Log.i("Finder.SetProfileCoverViewModel", "onLoaderFin status:" + status + " url:" + i0Var.f331577g);
        fp0.u uVar = fp0.u.f265290f;
        kotlinx.coroutines.q qVar = this.f410677a;
        if (status != uVar || com.tencent.mm.sdk.platformtools.t8.K0(i0Var.f331577g)) {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(""));
        } else {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(i0Var.f331577g));
        }
    }
}
