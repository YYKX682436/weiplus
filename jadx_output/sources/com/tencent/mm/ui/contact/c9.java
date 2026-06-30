package com.tencent.mm.ui.contact;

/* loaded from: classes8.dex */
public abstract class c9 {
    public static final void a(java.lang.String str, int i17, int i18, int i19) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(13234, java.lang.String.format("%s,%d,%d,%d,%d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), 0));
    }

    public static void b(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactReportLogic", "reportCreateChatroomClick %d %d", 13941, java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13941, java.lang.Integer.valueOf(i17));
    }
}
