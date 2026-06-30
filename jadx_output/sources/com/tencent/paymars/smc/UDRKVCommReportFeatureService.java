package com.tencent.paymars.smc;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000f"}, d2 = {"Lcom/tencent/paymars/smc/UDRKVCommReportFeatureService;", "Lea5/l;", "", "getProjectId", "", "addToPeriod", "", "taskId", "Lcom/tencent/wechat/aff/udr/x;", "resource", "Ljz5/f0;", "postProcessAsync", "<init>", "()V", "Companion", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class UDRKVCommReportFeatureService extends ea5.l {
    private static final java.lang.String TAG = "UDRKVCommReportFeatureService";

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public boolean addToPeriod() {
        return true;
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_6eea8388";
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public void postProcessAsync(long j17, final com.tencent.wechat.aff.udr.x resource) {
        kotlin.jvm.internal.o.g(resource, "resource");
        super.postProcessAsync(j17, resource);
        com.tencent.mars.xlog.Log.i(TAG, "smc-config postProcess: %s process:%s", resource.getPath(), bm5.f1.a());
        ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.paymars.smc.UDRKVCommReportFeatureService$postProcessAsync$1
            @Override // java.lang.Runnable
            public final void run() {
                ((com.tencent.paymars.smc.SmcManager) com.tencent.paymars.MarsContext.getContext().getManager(com.tencent.paymars.smc.SmcManager.class)).updateFreqLimitConfig(com.tencent.wechat.aff.udr.x.this.getPath());
            }
        });
    }
}
