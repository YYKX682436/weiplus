package k14;

/* loaded from: classes5.dex */
public final class r extends ea5.k {
    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackFailAsync(j17, i17, i18, projectId, name, i19, type);
        com.tencent.mars.xlog.Log.e("MicroMsg.HearingAidDownloadResource", "downloadResources remote fail, errNo: " + i17 + ", errCode: " + i18 + ", projectId: " + projectId + ", name: " + name + ", version: " + i19);
        k14.t.f303380d.set(false);
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackSuccessAsync(j17, projectId, name, i17, type);
        if (((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui(projectId, name) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HearingAidDownloadResource", "downloadResources remote success");
            k14.t.f303379c.set(true);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.HearingAidDownloadResource", "downloadResources remote fail");
        }
        k14.t.f303380d.set(false);
    }
}
