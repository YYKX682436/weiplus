package gc0;

/* loaded from: classes5.dex */
public final class w2 extends ea5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f270347b;

    public w2(java.lang.String str, kotlin.coroutines.Continuation<? super com.tencent.wechat.aff.udr.x> continuation) {
        this.f270346a = str;
        this.f270347b = continuation;
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackCheckSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackCheckSuccessAsync(j17, projectId, name, i17, type);
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackFailAsync(j17, i17, i18, projectId, name, i19, type);
        com.tencent.mars.xlog.Log.i("MicroMsg.RemarkRecommender", "fail() called with: errNo = " + i17 + ", errCode = " + i18 + ", projectId = " + projectId + ", name = " + name + ", version = " + i19);
        this.f270347b.resumeWith(kotlin.Result.m521constructorimpl(null));
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackSuccessAsync(j17, projectId, name, i17, type);
        gc0.d3 d3Var = gc0.d3.f270131a;
        com.tencent.mm.udr.e0 e0Var = (com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class);
        d3Var.e().getClass();
        com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) e0Var).Ui("ilinkres_0f34f0cc", this.f270346a);
        boolean z17 = Ui != null && d3Var.f(Ui);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("success() called with: projectId = ");
        sb6.append(projectId);
        sb6.append(", name = ");
        sb6.append(name);
        sb6.append(", version = ");
        sb6.append(i17);
        sb6.append(" res:");
        sb6.append(Ui != null);
        sb6.append(" isValid:");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.RemarkRecommender", sb6.toString());
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        if (!z17) {
            Ui = null;
        }
        this.f270347b.resumeWith(kotlin.Result.m521constructorimpl(Ui));
    }
}
