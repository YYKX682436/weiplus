package wd4;

/* loaded from: classes4.dex */
public final class z2 implements wd4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity f445077a;

    public z2(com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity) {
        this.f445077a = snsOnlineVideoActivity;
    }

    @Override // wd4.c
    public java.lang.Boolean a(com.tencent.mm.plugin.appbrand.service.k5 openMaterialService, wd4.h params) {
        boolean z17;
        r45.jj4 jj4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$3");
        kotlin.jvm.internal.o.g(openMaterialService, "openMaterialService");
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity = this.f445077a;
        snsOnlineVideoActivity.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        java.lang.String str = snsOnlineVideoActivity.f167312e;
        if (str == null || (jj4Var = snsOnlineVideoActivity.f167320o) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsOnlineVideoActivity", "getDownloadResult, localId or media is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            z17 = false;
        } else {
            java.lang.String i17 = com.tencent.mm.plugin.sns.model.y6.i(str, jj4Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsOnlineVideoActivity", "getDownloadResult, downloadedPath: %s", i17);
            z17 = !android.text.TextUtils.isEmpty(i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        }
        java.lang.Boolean bool = z17 ? java.lang.Boolean.TRUE : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$3");
        return bool;
    }

    @Override // wd4.c
    public java.lang.Object b(com.tencent.mm.plugin.appbrand.service.k5 k5Var, wd4.h hVar, kotlin.coroutines.Continuation continuation) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$3");
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        java.lang.String materialPath = hVar.b().a().f86271f;
        kotlin.jvm.internal.o.f(materialPath, "materialPath");
        com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity = this.f445077a;
        snsOnlineVideoActivity.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = snsOnlineVideoActivity.f167325r;
        if (onlineVideoView == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsOnlineVideoActivity", "startDownload, videoView is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            z17 = false;
        } else {
            boolean T = onlineVideoView.T(materialPath);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            z17 = T;
        }
        if (!z17) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            nVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        }
        wd4.y2 y2Var = new wd4.y2(materialPath, nVar, snsOnlineVideoActivity);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView2 = snsOnlineVideoActivity.f167325r;
        if (onlineVideoView2 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsOnlineVideoActivity", "addDownloadListener, videoView is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addDownloadListener", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            if (onlineVideoView2.f166443i2 == null) {
                onlineVideoView2.f166443i2 = new java.util.ArrayList();
            }
            ((java.util.ArrayList) onlineVideoView2.f166443i2).add(y2Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownloadListener", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$3");
        return a17;
    }

    @Override // wd4.e
    public java.lang.String getName() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$3");
        return "SnsOnlineVideoActivity$Open";
    }
}
