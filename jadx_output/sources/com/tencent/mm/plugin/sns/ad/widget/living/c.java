package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public final class c implements ss5.j0 {
    public c(java.lang.ref.WeakReference containerRef) {
        kotlin.jvm.internal.o.g(containerRef, "containerRef");
    }

    @Override // ss5.j0
    public void a(int i17, int i18, java.lang.String str, r45.r71 resp, int i19, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCgiBack", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$Companion$FinderGetMsgCallback");
        kotlin.jvm.internal.o.g(resp, "resp");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdLivingStreamContainer", "do getLiveMsg callback, result errType is " + i17 + ", errCode is " + i18 + ", errMsg is " + str + ", reqVisitorRoleType is " + i19 + ", uniqueId is " + str2);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCgiBack", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$Companion$FinderGetMsgCallback");
    }
}
