package xd4;

/* loaded from: classes4.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f453701d;

    /* renamed from: e, reason: collision with root package name */
    public int f453702e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f453703f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xd4.t0 f453704g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(kotlin.jvm.internal.h0 h0Var, xd4.t0 t0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453703f = h0Var;
        this.f453704g = t0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
        xd4.s0 s0Var = new xd4.s0(this.f453703f, this.f453704g, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
        return s0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
        java.lang.Object invokeSuspend = ((xd4.s0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.h0 h0Var;
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f453702e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        xd4.t0 t0Var = this.f453704g;
        kotlin.jvm.internal.h0 h0Var2 = this.f453703f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                t0Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDownloader", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                fk4.u uVar = t0Var.f453707a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloader", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                this.f453701d = h0Var2;
                this.f453702e = 1;
                obj = ((fk4.k) uVar).d(this);
                if (obj == aVar) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
                    return aVar;
                }
                h0Var = h0Var2;
            } else {
                if (i17 != 1) {
                    java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
                    throw illegalStateException;
                }
                h0Var = (kotlin.jvm.internal.h0) this.f453701d;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            h0Var.f310123d = obj;
            com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo = (com.tencent.mars.cdn.CdnManager.VideoInfo) h0Var2.f310123d;
            if (videoInfo == null || (str = videoInfo.svrFlag) == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getDownloadFlag$p", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                java.lang.String str2 = t0Var.f453711e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getDownloadFlag$p", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                str = str2;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setDownloadFlag$p", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
            t0Var.f453711e = str;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setDownloadFlag$p", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("try update downloadFlag to ");
            com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo2 = (com.tencent.mars.cdn.CdnManager.VideoInfo) h0Var2.f310123d;
            sb6.append(videoInfo2 != null ? videoInfo2.svrFlag : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoResourceDownloaderDelegate", sb6.toString());
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoResourceDownloaderDelegate", "onMoovReady");
            xd4.t0.a(t0Var).a((com.tencent.mars.cdn.CdnManager.VideoInfo) h0Var2.f310123d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
            return f0Var;
        } catch (java.util.concurrent.CancellationException unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoResourceDownloaderDelegate", "waitForMoovReady job is canceled");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
            return f0Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoResourceDownloaderDelegate", e17, "waitForMoovReady", new java.lang.Object[0]);
            xd4.t0.a(t0Var).onError(e17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForMoovReady$1");
            return f0Var;
        }
    }
}
