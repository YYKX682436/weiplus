package vw3;

/* loaded from: classes5.dex */
public final class i6 extends ea5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUDRUI f440991a;

    public i6(com.tencent.mm.plugin.repairer.ui.RepairerUDRUI repairerUDRUI) {
        this.f440991a = repairerUDRUI;
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackFailAsync(j17, i17, i18, projectId, name, i19, type);
        com.tencent.mars.xlog.Log.i("MicroMsg.Repairer.RepairerUDRUI", " [CheckResourceTask]: fail projectId=" + projectId + " name=" + name + " errNo=" + i17 + " errCode=" + i18);
        com.tencent.mm.sdk.platformtools.u3.h(new vw3.g6(this.f440991a, i17, i18));
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        super.onCallBackSuccessAsync(j17, projectId, name, i17, type);
        com.tencent.mars.xlog.Log.i("MicroMsg.Repairer.RepairerUDRUI", " [CheckResourceTask]: success projectId=" + projectId + " name=" + name + " version=" + i17);
        com.tencent.mm.sdk.platformtools.u3.h(new vw3.h6(this.f440991a));
    }
}
