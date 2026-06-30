package uv4;

/* loaded from: classes8.dex */
public final class s extends ea5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f431451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.udr.e0 f431452b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uv4.p f431453c;

    public s(java.lang.String str, com.tencent.mm.udr.e0 e0Var, uv4.p pVar) {
        this.f431451a = str;
        this.f431452b = e0Var;
        this.f431453c = pVar;
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackFailAsync(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.WebSearchTemplateHolder", "checkUDRResourcesIfNeeded: failed taskId=" + j17 + ", errNo=" + i17 + ", errCode=" + i18 + ", projectId=" + projectId + ", name=" + name + ", version=" + i19);
        try {
            boolean z17 = true;
            if (!(name.length() > 0)) {
                name = null;
            }
            if (name == null) {
                name = this.f431451a;
            }
            com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) this.f431452b).Ui(projectId, name);
            java.lang.String path = Ui != null ? Ui.getPath() : null;
            if (path == null) {
                path = "";
            }
            if (path.length() <= 0) {
                z17 = false;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateHolder", "checkUDRResourcesIfNeeded: even failed, got resource path=" + path + ", calling updateTemplateByUDR");
                this.f431453c.z(path);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.WebSearchTemplateHolder", "checkUDRResourcesIfNeeded: failed and resource is null or path is empty");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchTemplateHolder", e17, "checkUDRResourcesIfNeeded: failed to get resource or update template after check failed", new java.lang.Object[0]);
        }
        uv4.x xVar = uv4.x.f431458a;
        uv4.x.f431461d = false;
    }

    @Override // ea5.k, com.tencent.wechat.aff.udr.e
    public void onCallBackSuccessAsync(long j17, java.lang.String projectId, java.lang.String name, int i17, com.tencent.wechat.aff.udr.r type) {
        kotlin.jvm.internal.o.g(projectId, "projectId");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchTemplateHolder", "checkUDRResourcesIfNeeded: success taskId=" + j17 + ", projectId=" + projectId + ", name=" + name + ", version=" + i17 + ", type=" + type);
        uv4.x xVar = uv4.x.f431458a;
        uv4.x.f431461d = false;
    }
}
