package g10;

/* loaded from: classes7.dex */
public final class s extends ea5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g10.v f267547a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bw5.s7 f267548b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f267549c;

    public s(g10.v vVar, bw5.s7 s7Var, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        this.f267547a = vVar;
        this.f267548b = s7Var;
        this.f267549c = continuation;
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackFailAsync(j17, i17, i18, projectId, name, i19, type);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "updateLatestBizUdrPkg, fail, projectId:" + projectId + ", name:" + name + ", errNo = " + i17 + ", errCode = " + i18);
        bw5.d5 d5Var = bw5.d5.EcsNirvanaUdrResult;
        ((ku5.t0) ku5.t0.f312615d).h(new q10.n(kz5.c1.k(new jz5.l("projectId", projectId), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, name)), d5Var, 1), "MicroMsg.EcsNirvanaReportUtil");
        kotlin.coroutines.Continuation continuation = this.f267549c;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackSuccessAsync(j17, projectId, name, i17, type);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "updateLatestBizUdrPkg, success");
        boolean Ni = this.f267547a.Ni(this.f267548b);
        bw5.d5 d5Var = bw5.d5.EcsNirvanaUdrResult;
        java.util.Map k17 = kz5.c1.k(new jz5.l("projectId", projectId), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, name));
        ((ku5.t0) ku5.t0.f312615d).h(new q10.n(k17, d5Var, 0), "MicroMsg.EcsNirvanaReportUtil");
        this.f267549c.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(Ni)));
    }
}
