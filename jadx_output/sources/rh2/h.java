package rh2;

/* loaded from: classes5.dex */
public final class h extends ea5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.udr.e0 f395652a;

    public h(com.tencent.mm.udr.e0 e0Var) {
        this.f395652a = e0Var;
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackFailAsync(j17, i17, i18, projectId, name, i19, type);
        com.tencent.mars.xlog.Log.e("MicroMsg.KWSResourceLoader", "[prefetch] download failed: " + name + ", errNo=" + i17 + ", errCode=" + i18);
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackSuccessAsync(j17, projectId, name, i17, type);
        com.tencent.mars.xlog.Log.i("MicroMsg.KWSResourceLoader", "[prefetch] downloaded: " + name + " v" + i17);
        ((ku5.t0) ku5.t0.f312615d).r(new rh2.g(this.f395652a), "kws-prefetch");
    }
}
