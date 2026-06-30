package ea5;

/* loaded from: classes15.dex */
public abstract class l implements fs.n, com.tencent.wechat.aff.udr.i {
    public com.tencent.wechat.aff.udr.h udrCallback;

    public boolean addToPeriod() {
        return !(this instanceof il0.d);
    }

    public java.util.ArrayList<com.tencent.wechat.aff.udr.v> getParameter() {
        return new java.util.ArrayList<>();
    }

    public java.lang.String getProjectId() {
        return null;
    }

    public java.util.ArrayList<java.lang.String> getProjectIdList() {
        return null;
    }

    public final com.tencent.wechat.aff.udr.h getUdrCallback() {
        com.tencent.wechat.aff.udr.h hVar = this.udrCallback;
        if (hVar != null) {
            return hVar;
        }
        kotlin.jvm.internal.o.o("udrCallback");
        throw null;
    }

    public void haveSpecifiedResourceAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        getUdrCallback().N1(j17);
    }

    public void onCallBackCheckSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        getUdrCallback().F(j17);
    }

    public void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        getUdrCallback().e(j17);
    }

    public void onCallBackStartPeriodAsync(long j17, java.lang.String projectId) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        getUdrCallback().c0(j17);
    }

    public void onCallBackSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        getUdrCallback().I(j17);
    }

    public void postProcessAsync(long j17, com.tencent.wechat.aff.udr.x resource) {
        kotlin.jvm.internal.o.g(resource, "resource");
        getUdrCallback().Y0(j17);
    }

    @Override // com.tencent.wechat.aff.udr.i
    public void setCallback(com.tencent.wechat.aff.udr.h p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        setUdrCallback(p07);
    }

    public final void setUdrCallback(com.tencent.wechat.aff.udr.h hVar) {
        kotlin.jvm.internal.o.g(hVar, "<set-?>");
        this.udrCallback = hVar;
    }
}
