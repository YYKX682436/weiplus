package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.storage.l0 f166043a = new com.tencent.mm.plugin.sns.storage.l0();

    public final java.lang.String a(java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdClickFlagInfoKey", "com.tencent.mm.plugin.sns.storage.AdClickStorage");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUin", "com.tencent.mm.plugin.sns.storage.AdClickStorage");
        try {
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                str2 = gm0.j1.b().j();
                kotlin.jvm.internal.o.d(str2);
            } else {
                str2 = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getUin();
                kotlin.jvm.internal.o.d(str2);
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdClickStorage", th6);
            str2 = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUin", "com.tencent.mm.plugin.sns.storage.AdClickStorage");
        sb6.append(str2);
        sb6.append('_');
        sb6.append(str);
        sb6.append("_click");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdClickFlagInfoKey", "com.tencent.mm.plugin.sns.storage.AdClickStorage");
        return sb7;
    }
}
