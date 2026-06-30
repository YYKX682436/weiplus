package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public final class l2 {
    public l2(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.sdk.platformtools.o4 a() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("remittance_recv_account_choose_setting");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        return M;
    }

    public final int b(int i17, java.lang.String str) {
        java.lang.String str2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str2 = java.lang.String.valueOf(i17);
        } else {
            str2 = i17 + '_' + str;
        }
        int i18 = a().getInt(str2, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "getRemittanceRecvAccountChooseSetting: " + i18 + " key: " + str2);
        return i18;
    }

    public final int c() {
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WX_PAY_REMITTANCE_RECV_ACCOUNT_LAST_CHOICE_INT_SYNC, 0);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        return ((java.lang.Integer) m17).intValue();
    }

    public final java.lang.String d() {
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WX_PAY_REMITTANCE_RECV_ACCOUNT_LAST_CHOICE_BIND_SERIAL_STRING_SYNC, "");
        java.lang.String str = m17 instanceof java.lang.String ? (java.lang.String) m17 : null;
        return str == null ? "" : str;
    }

    public final void e(int i17, int i18, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27731, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), 0, 0, "");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27731, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), 0, 0, str);
        }
    }

    public final com.tencent.mm.plugin.remittance.ui.a f(java.lang.String str, java.lang.String str2) {
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(str);
        boolean z18 = !com.tencent.mm.sdk.platformtools.t8.K0(str2);
        return (z17 || z18) ? z17 != z18 ? com.tencent.mm.plugin.remittance.ui.a.f157620f : kotlin.jvm.internal.o.b(str, str2) ? com.tencent.mm.plugin.remittance.ui.a.f157619e : com.tencent.mm.plugin.remittance.ui.a.f157621g : com.tencent.mm.plugin.remittance.ui.a.f157618d;
    }
}
