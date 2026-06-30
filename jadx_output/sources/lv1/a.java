package lv1;

/* loaded from: classes8.dex */
public class a extends fv1.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cdndownloader.service.CDNDownloadService f321492e;

    public a(com.tencent.mm.plugin.cdndownloader.service.CDNDownloadService cDNDownloadService) {
        this.f321492e = cDNDownloadService;
    }

    @Override // fv1.c
    public boolean Ba(java.lang.String str) {
        hv1.d.f().c(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadService", "removeDownloadTask: true");
        return true;
    }

    @Override // fv1.c
    public boolean Je(java.lang.String str) {
        hv1.d.f().d(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadService", "pauseDownloadTask: true");
        return true;
    }

    @Override // fv1.c
    public void Vf() {
    }

    @Override // fv1.c
    public void Wb() {
        vk0.e eVar = vk0.c.f437751a;
        com.tencent.mm.plugin.cdndownloader.service.CDNDownloadService cDNDownloadService = this.f321492e;
        if (eVar.b(cDNDownloadService)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadService", "addIPCTaskMarker");
        eVar.a(cDNDownloadService);
    }

    @Override // fv1.c
    public void X8(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadService", "notifyNetworkChange: " + i17);
        if (com.tencent.mm.sdk.platformtools.x2.p()) {
            return;
        }
        com.tencent.mars.WeChatMars.onNetworkChange();
        if (com.tencent.paymars.WeChatMars.isEnable()) {
            com.tencent.paymars.WeChatMars.onNetworkChange();
        }
    }

    @Override // fv1.c
    public int aa(com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo cDNTaskInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadService", "resumeDownloadTask: %s", cDNTaskInfo.f95499e);
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_CDNDownloadService_2";
        mVar.F = cDNTaskInfo.f95498d;
        mVar.field_mediaId = cDNTaskInfo.f95500f;
        mVar.field_fullpath = cDNTaskInfo.f95501g;
        vz.y1 y1Var = (vz.y1) i95.n0.c(vz.y1.class);
        java.lang.String str = cDNTaskInfo.f95499e;
        ((uz.a2) y1Var).getClass();
        mVar.f241811z = com.tencent.mm.plugin.downloader.api.f.a(str);
        vz.y1 y1Var2 = (vz.y1) i95.n0.c(vz.y1.class);
        java.lang.String str2 = cDNTaskInfo.f95502h;
        ((uz.a2) y1Var2).getClass();
        mVar.I = com.tencent.mm.plugin.downloader.api.f.a(str2);
        mVar.f241787f = com.tencent.mm.plugin.cdndownloader.service.CDNDownloadService.f95515e;
        mVar.A = cDNTaskInfo.f95504m;
        mVar.B = cDNTaskInfo.f95505n;
        mVar.E = cDNTaskInfo.f95507p;
        mVar.G = cDNTaskInfo.f95506o;
        mVar.H = true;
        com.tencent.mm.plugin.cdndownloader.service.CDNDownloadService.a(this.f321492e, mVar, cDNTaskInfo.f95503i);
        int g17 = hv1.d.f().g(mVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadService", "resumeDownloadTask: " + g17);
        return g17;
    }

    @Override // fv1.c
    public void ca(fv1.f fVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadService", "registerCallback");
        com.tencent.mm.plugin.cdndownloader.service.CDNDownloadService.f95514d = fVar;
    }

    @Override // fv1.c
    public void d3(fv1.f fVar) {
        com.tencent.mm.plugin.cdndownloader.service.CDNDownloadService.f95514d = null;
    }

    @Override // fv1.c
    public void m5() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadService", "removeIPCTaskMarker");
        vk0.c.f437751a.c(this.f321492e);
    }

    @Override // fv1.c
    public com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState p6(java.lang.String str) {
        com.tencent.mars.cdn.CdnManager cdnManager = (com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class);
        if (cdnManager == null) {
            cdnManager = new com.tencent.mars.cdn.CdnManager(com.tencent.mars.MarsContext.getContext());
            com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.cdn.CdnManager.class, cdnManager);
        }
        com.tencent.mars.cdn.CdnManager.CdnTaskStateInfo httpMultiSocketDownloadTaskState = cdnManager.httpMultiSocketDownloadTaskState(str);
        com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState cDNTaskState = new com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState();
        if (httpMultiSocketDownloadTaskState != null) {
            cDNTaskState.f95511d = httpMultiSocketDownloadTaskState.taskState;
            cDNTaskState.f95513f = (int) httpMultiSocketDownloadTaskState.fileTotalSize;
            cDNTaskState.f95512e = (int) httpMultiSocketDownloadTaskState.completeSize;
        }
        return cDNTaskState;
    }

    @Override // fv1.c
    public int y2(com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo cDNTaskInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadService", "addDownloadTask: %s filepath:%s", cDNTaskInfo.f95499e, cDNTaskInfo.f95501g);
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_CDNDownloadService_1";
        mVar.F = cDNTaskInfo.f95498d;
        mVar.field_mediaId = cDNTaskInfo.f95500f;
        mVar.field_fullpath = cDNTaskInfo.f95501g;
        vz.y1 y1Var = (vz.y1) i95.n0.c(vz.y1.class);
        java.lang.String str = cDNTaskInfo.f95499e;
        ((uz.a2) y1Var).getClass();
        mVar.f241811z = com.tencent.mm.plugin.downloader.api.f.a(str);
        vz.y1 y1Var2 = (vz.y1) i95.n0.c(vz.y1.class);
        java.lang.String str2 = cDNTaskInfo.f95502h;
        ((uz.a2) y1Var2).getClass();
        mVar.I = com.tencent.mm.plugin.downloader.api.f.a(str2);
        mVar.f241787f = com.tencent.mm.plugin.cdndownloader.service.CDNDownloadService.f95515e;
        mVar.A = cDNTaskInfo.f95504m;
        mVar.B = cDNTaskInfo.f95505n;
        mVar.G = cDNTaskInfo.f95506o;
        mVar.E = cDNTaskInfo.f95507p;
        com.tencent.mm.plugin.cdndownloader.service.CDNDownloadService.a(this.f321492e, mVar, cDNTaskInfo.f95503i);
        int b17 = hv1.d.f().b(mVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.CDNDownloadService", "addDownloadTask: " + b17);
        return b17;
    }
}
