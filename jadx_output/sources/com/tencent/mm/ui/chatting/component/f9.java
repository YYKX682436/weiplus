package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class f9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st0.e f199035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.g9 f199036e;

    public f9(com.tencent.mm.ui.chatting.component.g9 g9Var, st0.e eVar) {
        this.f199036e = g9Var;
        this.f199035d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "pre sync");
        st0.e eVar = this.f199035d;
        if (((com.tencent.mm.storage.z9) eVar).b1()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "before sync");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            boolean d17 = ((com.tencent.mm.storage.z9) eVar).d1();
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "syncNotifyRecord finish, ret: %b, cost: %d", java.lang.Boolean.valueOf(d17), java.lang.Long.valueOf(elapsedRealtime2));
            this.f199036e.getClass();
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.C(1584L, 0L, elapsedRealtime2);
            g0Var.C(1584L, 1L, 1L);
            long j17 = elapsedRealtime2 / 1000;
            int[] iArr = {5, 10, 20, 30, 40, 50, 60, 90, 180, com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1, 600};
            if (j17 < 600) {
                int i18 = 0;
                while (true) {
                    if (i18 >= 11) {
                        i17 = 21;
                        break;
                    } else {
                        if (j17 < iArr[i18]) {
                            i17 = i18 + 21;
                            break;
                        }
                        i18++;
                    }
                }
            } else {
                i17 = 32;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1584L, i17, 1L);
        }
    }
}
