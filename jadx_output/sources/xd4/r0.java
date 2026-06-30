package xd4;

/* loaded from: classes4.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f453698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xd4.t0 f453699e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(xd4.t0 t0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453699e = t0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
        xd4.r0 r0Var = new xd4.r0(this.f453699e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
        return r0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
        java.lang.Object invokeSuspend = ((xd4.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f453698d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        xd4.t0 t0Var = this.f453699e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                t0Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDownloader", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                fk4.u uVar = t0Var.f453707a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownloader", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                this.f453698d = 1;
                if (((fk4.k) uVar).c(this) == aVar) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
                    throw illegalStateException;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoResourceDownloaderDelegate", "video is downloaded completely");
            xd4.t0.a(t0Var).onCompleted();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
            return f0Var;
        } catch (java.util.concurrent.CancellationException unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoResourceDownloaderDelegate", "waitForComplete job is canceled");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
            return f0Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoResourceDownloaderDelegate", e17, "waitForComplete", new java.lang.Object[0]);
            xd4.t0.a(t0Var).onError(e17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate$waitForComplete$1");
            return f0Var;
        }
    }
}
