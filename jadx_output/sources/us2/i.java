package us2;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vt3.p f430492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CdnManager.C2CDownloadRequest f430493e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(vt3.p pVar, com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest) {
        super(1);
        this.f430492d = pVar;
        this.f430493e = c2CDownloadRequest;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadTemplate cancel. id:");
        vt3.p pVar = this.f430492d;
        sb6.append(pVar.f440020b);
        sb6.append(" version:");
        sb6.append(pVar.f440023e);
        com.tencent.mars.xlog.Log.i("ShootComposingTemplateManager", sb6.toString());
        ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).cancelTask(this.f430493e.fileKey);
        return jz5.f0.f302826a;
    }
}
