package rm5;

/* loaded from: classes10.dex */
public final class u implements com.tencent.tav.core.AssetParallelExportSession.ExportCallbackHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f397569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f397570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.q f397571c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rm5.v f397572d;

    public u(yz5.l lVar, long j17, yz5.q qVar, rm5.v vVar) {
        this.f397569a = lVar;
        this.f397570b = j17;
        this.f397571c = qVar;
        this.f397572d = vVar;
    }

    @Override // com.tencent.tav.core.AssetParallelExportSession.ExportCallbackHandler
    public final void handlerCallback(com.tencent.tav.core.AssetParallelExportSession assetParallelExportSession) {
        com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus assetExportSessionStatus = assetParallelExportSession.status;
        int errCode = assetParallelExportSession.getErrCode();
        float f17 = assetParallelExportSession.progress;
        int i17 = assetExportSessionStatus == null ? -1 : rm5.t.f397568a[assetExportSessionStatus.ordinal()];
        if (i17 == 1) {
            yz5.l lVar = this.f397569a;
            if (lVar != null) {
                lVar.invoke(java.lang.Float.valueOf(f17));
                return;
            }
            return;
        }
        yz5.q qVar = this.f397571c;
        if (i17 == 2) {
            xm5.b.c("VideoComposition", "export completed: " + f17 + ", cost:" + (android.os.SystemClock.elapsedRealtime() - this.f397570b), new java.lang.Object[0]);
            if (qVar != null) {
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(errCode);
                java.util.ArrayList<com.tencent.tav.core.parallel.info.PipelineIndicatorInfo> indicatorInfo = assetParallelExportSession.getIndicatorInfo();
                kotlin.jvm.internal.o.f(indicatorInfo, "getIndicatorInfo(...)");
                qVar.invoke(bool, valueOf, indicatorInfo);
                return;
            }
            return;
        }
        if (i17 == 3) {
            xm5.b.c("VideoComposition", "export canceled: " + f17, new java.lang.Object[0]);
            yz5.a aVar = this.f397572d.f397593u;
            if (aVar != null) {
                if (aVar != null) {
                    aVar.invoke();
                    return;
                }
                return;
            } else {
                if (qVar != null) {
                    java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(errCode);
                    java.util.ArrayList<com.tencent.tav.core.parallel.info.PipelineIndicatorInfo> indicatorInfo2 = assetParallelExportSession.getIndicatorInfo();
                    kotlin.jvm.internal.o.f(indicatorInfo2, "getIndicatorInfo(...)");
                    qVar.invoke(bool2, valueOf2, indicatorInfo2);
                    return;
                }
                return;
            }
        }
        if (i17 == 4 || i17 == 5) {
            xm5.b.c("VideoComposition", "export failed: status:" + assetExportSessionStatus + ", progress:" + f17, new java.lang.Object[0]);
            if (qVar != null) {
                java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
                java.lang.Integer valueOf3 = java.lang.Integer.valueOf(errCode);
                java.util.ArrayList<com.tencent.tav.core.parallel.info.PipelineIndicatorInfo> indicatorInfo3 = assetParallelExportSession.getIndicatorInfo();
                kotlin.jvm.internal.o.f(indicatorInfo3, "getIndicatorInfo(...)");
                qVar.invoke(bool3, valueOf3, indicatorInfo3);
                return;
            }
            return;
        }
        xm5.b.c("VideoComposition", "export failed other status:" + assetExportSessionStatus + ", progress:" + f17, new java.lang.Object[0]);
        if (qVar != null) {
            java.lang.Boolean bool4 = java.lang.Boolean.FALSE;
            java.lang.Integer valueOf4 = java.lang.Integer.valueOf(errCode);
            java.util.ArrayList<com.tencent.tav.core.parallel.info.PipelineIndicatorInfo> indicatorInfo4 = assetParallelExportSession.getIndicatorInfo();
            kotlin.jvm.internal.o.f(indicatorInfo4, "getIndicatorInfo(...)");
            qVar.invoke(bool4, valueOf4, indicatorInfo4);
        }
    }
}
