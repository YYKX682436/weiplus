package rm5;

/* loaded from: classes10.dex */
public final class r implements com.tencent.tav.core.AssetExportSession.ExportCallbackHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f397562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f397563b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f397564c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rm5.v f397565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f397566e;

    public r(yz5.l lVar, kotlin.jvm.internal.c0 c0Var, long j17, rm5.v vVar, yz5.p pVar) {
        this.f397562a = lVar;
        this.f397563b = c0Var;
        this.f397564c = j17;
        this.f397565d = vVar;
        this.f397566e = pVar;
    }

    @Override // com.tencent.tav.core.AssetExportSession.ExportCallbackHandler
    public final void handlerCallback(com.tencent.tav.core.AssetExportSession assetExportSession) {
        yz5.a aVar;
        com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus status = assetExportSession.getStatus();
        int errCode = assetExportSession.getErrCode();
        float progress = assetExportSession.getProgress();
        boolean z17 = status == com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusExporting;
        boolean z18 = status == com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusCompleted;
        if (z17) {
            yz5.l lVar = this.f397562a;
            if (lVar != null) {
                lVar.invoke(java.lang.Float.valueOf(progress));
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("export finish: finish:");
        kotlin.jvm.internal.c0 c0Var = this.f397563b;
        sb6.append(c0Var.f310112d);
        sb6.append(" status:");
        sb6.append(status);
        sb6.append(", progress:");
        sb6.append(progress);
        sb6.append(", cost:");
        sb6.append(android.os.SystemClock.elapsedRealtime() - this.f397564c);
        xm5.b.c("VideoComposition", sb6.toString(), new java.lang.Object[0]);
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        rm5.v vVar = this.f397565d;
        if (vVar.f397589q && (aVar = vVar.f397593u) != null) {
            aVar.invoke();
        }
        yz5.p pVar = this.f397566e;
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(errCode));
        }
        if (z18) {
            return;
        }
        vVar.d();
    }
}
