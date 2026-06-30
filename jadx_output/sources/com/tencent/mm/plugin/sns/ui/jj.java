package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class jj extends com.tencent.mm.plugin.sns.ui.SnsHeader {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsHeader
    public void j(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUserName", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove");
        if (str == null || str2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsHeader", "userName or selfName is null ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUserName", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove");
        } else {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310568a, null, new com.tencent.mm.plugin.sns.ui.ij(this, str, str2, str3, str4, null), 2, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUserName", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove");
        }
    }
}
