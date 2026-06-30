package com.tencent.mm.xeffect;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\tR$\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/xeffect/WeVisReportWrapper;", "Lcom/tencent/mm/xeffect/IWeVisReport;", "", dm.i4.COL_ID, "", "value", "Ljz5/f0;", "report", "TAG", "Ljava/lang/String;", "impl", "Lcom/tencent/mm/xeffect/IWeVisReport;", "getImpl", "()Lcom/tencent/mm/xeffect/IWeVisReport;", "setImpl", "(Lcom/tencent/mm/xeffect/IWeVisReport;)V", "<init>", "()V", "renderlib_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes10.dex */
public final class WeVisReportWrapper implements com.tencent.mm.xeffect.IWeVisReport {
    private static com.tencent.mm.xeffect.IWeVisReport impl;
    public static final com.tencent.mm.xeffect.WeVisReportWrapper INSTANCE = new com.tencent.mm.xeffect.WeVisReportWrapper();
    private static final java.lang.String TAG = TAG;
    private static final java.lang.String TAG = TAG;

    private WeVisReportWrapper() {
    }

    public final com.tencent.mm.xeffect.IWeVisReport getImpl() {
        return impl;
    }

    @Override // com.tencent.mm.xeffect.IWeVisReport
    public void report(long j17, java.lang.String str) {
        com.tencent.mm.xeffect.IWeVisReport iWeVisReport = impl;
        if (iWeVisReport != null) {
            iWeVisReport.report(j17, str);
        } else {
            com.tencent.mm.xeffect.XEffectLog.b(TAG, "no report impl", new java.lang.Object[0]);
        }
    }

    public final void setImpl(com.tencent.mm.xeffect.IWeVisReport iWeVisReport) {
        impl = iWeVisReport;
    }
}
