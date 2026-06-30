package xd4;

/* loaded from: classes4.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f453620d;

    /* renamed from: e, reason: collision with root package name */
    public int f453621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f453622f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xd4.b f453623g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f453624h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(kotlin.jvm.internal.h0 h0Var, xd4.b bVar, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453622f = h0Var;
        this.f453623g = bVar;
        this.f453624h = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.video.FlexibleDownloadWrapper$waitForMoovReady$1");
        xd4.a aVar = new xd4.a(this.f453622f, this.f453623g, this.f453624h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.video.FlexibleDownloadWrapper$waitForMoovReady$1");
        return aVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.FlexibleDownloadWrapper$waitForMoovReady$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.FlexibleDownloadWrapper$waitForMoovReady$1");
        java.lang.Object invokeSuspend = ((xd4.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.FlexibleDownloadWrapper$waitForMoovReady$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.video.FlexibleDownloadWrapper$waitForMoovReady$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.h0 h0Var;
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.FlexibleDownloadWrapper$waitForMoovReady$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f453621e;
        yz5.l lVar = this.f453624h;
        xd4.b bVar = this.f453623g;
        jz5.f0 f0Var = jz5.f0.f302826a;
        kotlin.jvm.internal.h0 h0Var2 = this.f453622f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                fk4.k a17 = bVar.a();
                this.f453620d = h0Var2;
                this.f453621e = 1;
                obj = a17.d(this);
                if (obj == aVar) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.FlexibleDownloadWrapper$waitForMoovReady$1");
                    return aVar;
                }
                h0Var = h0Var2;
            } else {
                if (i17 != 1) {
                    java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.FlexibleDownloadWrapper$waitForMoovReady$1");
                    throw illegalStateException;
                }
                h0Var = (kotlin.jvm.internal.h0) this.f453620d;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            h0Var.f310123d = obj;
            com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo = (com.tencent.mars.cdn.CdnManager.VideoInfo) h0Var2.f310123d;
            if (videoInfo == null || (str = videoInfo.svrFlag) == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getDownloadFlag$p", "com.tencent.mm.plugin.sns.ui.video.FlexibleDownloadWrapper");
                java.lang.String str2 = bVar.f453628c;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getDownloadFlag$p", "com.tencent.mm.plugin.sns.ui.video.FlexibleDownloadWrapper");
                str = str2;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setDownloadFlag$p", "com.tencent.mm.plugin.sns.ui.video.FlexibleDownloadWrapper");
            bVar.f453628c = str;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setDownloadFlag$p", "com.tencent.mm.plugin.sns.ui.video.FlexibleDownloadWrapper");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("try update downloadFlag to ");
            com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo2 = (com.tencent.mars.cdn.CdnManager.VideoInfo) h0Var2.f310123d;
            sb6.append(videoInfo2 != null ? videoInfo2.svrFlag : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.FlexibleVideoDownloader", sb6.toString());
            com.tencent.mars.xlog.Log.i("MicroMsg.FlexibleVideoDownloader", "onMoovReady");
            lVar.invoke(h0Var2.f310123d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.FlexibleDownloadWrapper$waitForMoovReady$1");
            return f0Var;
        } catch (java.util.concurrent.CancellationException unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FlexibleVideoDownloader", "waitForMoovReady job is canceled");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.FlexibleDownloadWrapper$waitForMoovReady$1");
            return f0Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FlexibleVideoDownloader", e17, "waitForMoovReady", new java.lang.Object[0]);
            lVar.invoke(null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.video.FlexibleDownloadWrapper$waitForMoovReady$1");
            return f0Var;
        }
    }
}
