package fm;

/* loaded from: classes8.dex */
public final class d extends ea5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.mmdata.rpt.MMBaseStringResourceLoadStruct f263976a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f263977b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f263978c;

    public d(com.tencent.mm.autogen.mmdata.rpt.MMBaseStringResourceLoadStruct mMBaseStringResourceLoadStruct, long j17, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        this.f263976a = mMBaseStringResourceLoadStruct;
        this.f263977b = j17;
        this.f263978c = continuation;
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackFailAsync(j17, i17, i18, projectId, name, i19, type);
        com.tencent.mm.autogen.mmdata.rpt.MMBaseStringResourceLoadStruct mMBaseStringResourceLoadStruct = this.f263976a;
        mMBaseStringResourceLoadStruct.f58779j = i18;
        mMBaseStringResourceLoadStruct.p(java.lang.String.valueOf(java.lang.System.currentTimeMillis() - this.f263977b));
        mMBaseStringResourceLoadStruct.k();
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f263978c.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackSuccessAsync(j17, projectId, name, i17, type);
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis() - this.f263977b);
        com.tencent.mm.autogen.mmdata.rpt.MMBaseStringResourceLoadStruct mMBaseStringResourceLoadStruct = this.f263976a;
        mMBaseStringResourceLoadStruct.p(valueOf);
        mMBaseStringResourceLoadStruct.k();
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f263978c.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
    }
}
