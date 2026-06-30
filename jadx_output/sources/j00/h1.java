package j00;

/* loaded from: classes5.dex */
public final class h1 extends ea5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f296782a;

    public h1(j00.k1 k1Var) {
        this.f296782a = k1Var;
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackCheckSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackCheckSuccessAsync(j17, projectId, name, i17, type);
        this.f296782a.f296816m.set(false);
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackFailAsync(j17, i17, i18, projectId, name, i19, type);
        this.f296782a.f296816m.set(false);
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackSuccessAsync(j17, projectId, name, i17, type);
        this.f296782a.f296816m.set(false);
    }
}
