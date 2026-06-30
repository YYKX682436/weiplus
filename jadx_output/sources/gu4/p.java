package gu4;

/* loaded from: classes9.dex */
public class p implements com.tencent.mm.plugin.walletlock.model.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f275957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI f275958b;

    public p(com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI fingerprintWalletLockUI, com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI fingerprintWalletLockUI2) {
        this.f275958b = fingerprintWalletLockUI;
        this.f275957a = null;
        this.f275957a = new java.lang.ref.WeakReference(fingerprintWalletLockUI2);
    }

    @Override // com.tencent.mm.plugin.walletlock.model.f
    public void a() {
        int i17 = com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI.C;
        com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI fingerprintWalletLockUI = this.f275958b;
        fingerprintWalletLockUI.W6();
        fingerprintWalletLockUI.d7();
    }

    public final com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI b() {
        java.lang.ref.WeakReference weakReference = this.f275957a;
        if (weakReference != null) {
            return (com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI) weakReference.get();
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.walletlock.model.f
    public void onResult(int i17, java.lang.String str) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI fingerprintWalletLockUI = this.f275958b;
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "onResult result: %d, errMsg: %s, isCancelled: %b", valueOf, str, java.lang.Boolean.valueOf(fingerprintWalletLockUI.f181306y));
        java.lang.String str2 = fingerprintWalletLockUI.f181293i;
        if (str2 != null && str2.equals("action.switch_on_pattern")) {
            com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
            wCPaySaftyClickReportStruct.f62116d = 3L;
            wCPaySaftyClickReportStruct.f62117e = 1L;
            wCPaySaftyClickReportStruct.k();
        }
        java.lang.String str3 = fingerprintWalletLockUI.f181293i;
        if (str3 != null && str3.equals("action.verify_pattern")) {
            int i18 = fingerprintWalletLockUI.B;
            if (i18 == 1) {
                com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
                wCPaySaftyClickReportStruct2.f62116d = 7L;
                wCPaySaftyClickReportStruct2.f62117e = 1L;
                wCPaySaftyClickReportStruct2.k();
            } else if (i18 == 2) {
                com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct3 = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
                wCPaySaftyClickReportStruct3.f62116d = 9L;
                wCPaySaftyClickReportStruct3.f62117e = 1L;
                wCPaySaftyClickReportStruct3.k();
            }
        }
        if (fingerprintWalletLockUI.f181306y) {
            return;
        }
        if (i17 != 0) {
            if (i17 == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "identify ERR_NO_MATCH");
                if (b() != null) {
                    com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI.T6(b(), i17, fingerprintWalletLockUI.getString(com.tencent.mm.R.string.knx));
                    return;
                }
                return;
            }
            if (i17 == 2) {
                if (b() != null) {
                    com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI.U6(b(), i17, fingerprintWalletLockUI.getString(com.tencent.mm.R.string.knq));
                    return;
                }
                return;
            }
            if (i17 == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "on error: %d", java.lang.Integer.valueOf(i17));
                if (b() != null) {
                    com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI.U6(b(), i17, fingerprintWalletLockUI.getString(com.tencent.mm.R.string.knw));
                    return;
                }
                return;
            }
            if (i17 == 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "user cancel");
                return;
            }
            if (i17 != 5) {
                if (i17 == 8 && b() != null) {
                    com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI.U6(b(), i17, fingerprintWalletLockUI.getString(com.tencent.mm.R.string.f493551ko5));
                    return;
                }
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "identify TIMEOUT");
            if (b() != null) {
                com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI.T6(b(), i17, fingerprintWalletLockUI.getString(com.tencent.mm.R.string.knx));
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FingerprintWalletLockUI", "identify success");
        if (b() != null) {
            com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI b17 = b();
            com.tencent.mm.plugin.walletlock.model.m.c(b17.B, 2, 0);
            zt5.s sVar = com.tencent.mm.plugin.walletlock.model.l.instance.f181371e;
            if (sVar != null) {
                b17.f181300s = sVar.f475621b;
                if (b17.f181295n.equals("action.switch_on_pattern")) {
                    b17.f181295n = b17.f181294m;
                    b17.a7();
                } else if (b17.f181295n.equals("action.verify_pattern")) {
                    if (fu4.a.d(b17.f181300s)) {
                        b17.f181295n = b17.f181294m;
                        b17.a7();
                    } else {
                        b17.f7(2);
                    }
                }
            }
        }
        java.lang.String str4 = fingerprintWalletLockUI.f181293i;
        if (str4 != null && str4.equals("action.switch_on_pattern")) {
            com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct4 = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
            wCPaySaftyClickReportStruct4.f62116d = 3L;
            wCPaySaftyClickReportStruct4.f62117e = 2L;
            wCPaySaftyClickReportStruct4.k();
        }
        java.lang.String str5 = fingerprintWalletLockUI.f181293i;
        if (str5 == null || !str5.equals("action.verify_pattern")) {
            return;
        }
        int i19 = fingerprintWalletLockUI.B;
        if (i19 == 1) {
            com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct5 = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
            wCPaySaftyClickReportStruct5.f62116d = 7L;
            wCPaySaftyClickReportStruct5.f62117e = 2L;
            wCPaySaftyClickReportStruct5.k();
            return;
        }
        if (i19 == 2) {
            com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct6 = new com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct();
            wCPaySaftyClickReportStruct6.f62116d = 9L;
            wCPaySaftyClickReportStruct6.f62117e = 2L;
            wCPaySaftyClickReportStruct6.k();
        }
    }
}
