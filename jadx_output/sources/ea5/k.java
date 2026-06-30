package ea5;

/* loaded from: classes15.dex */
public abstract class k implements com.tencent.wechat.aff.udr.e {
    private com.tencent.wechat.aff.udr.d udrCallback;

    @Override // com.tencent.wechat.aff.udr.e
    public void onCallBackCheckSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.wechat.aff.udr.d dVar = this.udrCallback;
        if (dVar != null) {
            dVar.F(j17);
        }
    }

    @Override // com.tencent.wechat.aff.udr.e
    public void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.wechat.aff.udr.d dVar = this.udrCallback;
        if (dVar != null) {
            dVar.e(j17);
        }
    }

    @Override // com.tencent.wechat.aff.udr.e
    public void onCallBackSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.wechat.aff.udr.d dVar = this.udrCallback;
        if (dVar != null) {
            dVar.I(j17);
        }
    }

    @Override // com.tencent.wechat.aff.udr.e
    public void setCallback(com.tencent.wechat.aff.udr.d dVar) {
        if (dVar != null) {
            this.udrCallback = dVar;
        }
    }
}
