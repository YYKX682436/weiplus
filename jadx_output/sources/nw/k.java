package nw;

/* loaded from: classes7.dex */
public final class k extends ie3.j {
    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_3deef268";
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void haveSpecifiedResourceAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        super.haveSpecifiedResourceAsync(j17, projectId, name, i17, i18, i19);
        com.tencent.mars.xlog.Log.i("MicroMsg.UDRMagicEcsTimelineFeatureService", "haveSpecifiedResourceAsync projectId " + projectId + ", name " + name + ", version " + i17 + " errNo " + i18 + " errCode " + i19);
    }

    @Override // ie3.j, ea5.l, com.tencent.wechat.aff.udr.i
    public void postProcessAsync(long j17, com.tencent.wechat.aff.udr.x resource) {
        kotlin.jvm.internal.o.g(resource, "resource");
        com.tencent.mars.xlog.Log.i("MicroMsg.UDRMagicEcsTimelineFeatureService", "postProcessAsync " + resource);
        super.postProcessAsync(j17, resource);
    }
}
