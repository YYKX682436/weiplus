package com.tencent.mm.wexnet;

/* loaded from: classes5.dex */
public final class u extends ea5.k {
    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackFailAsync(j17, i17, i18, projectId, name, i19, type);
        com.tencent.mars.xlog.Log.i("MicroMsg.UDRXNetNPULibsHelper", " [CheckResourceTask]: fail projectId=" + projectId + " name=" + name + " errNo=" + i17 + " errCode=" + i18);
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackSuccessAsync(j17, projectId, name, i17, type);
        com.tencent.mars.xlog.Log.i("MicroMsg.UDRXNetNPULibsHelper", " [CheckResourceTask]: success projectId=" + projectId + " name=" + name + " version=" + i17);
    }
}
