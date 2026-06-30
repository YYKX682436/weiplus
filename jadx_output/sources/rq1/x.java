package rq1;

/* loaded from: classes5.dex */
public final class x extends ea5.l {
    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public boolean addToPeriod() {
        return true;
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_dda186fa";
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void onCallBackCheckSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackCheckSuccessAsync(j17, projectId, name, i17, type);
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.box.HotWordSearchUtilNative.TAG, "onCallBackCheckSuccessAsync, projectId: " + projectId + ", name: " + name + ", version: " + i17 + ", type: " + type.name());
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackFailAsync(j17, i17, i18, projectId, name, i19, type);
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.box.HotWordSearchUtilNative.TAG, "onCallBackFail, errNo: " + i17 + ", errCode: " + i18 + ", projectId: " + projectId + ", name: " + name + ", version: " + i19 + ", type: " + type.name());
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void onCallBackSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackSuccessAsync(j17, projectId, name, i17, type);
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.box.HotWordSearchUtilNative.TAG, "onCallBackCheckSuccess, projectId: " + projectId + ", name: " + name + ", version: " + i17 + ", type: " + type.name());
    }
}
