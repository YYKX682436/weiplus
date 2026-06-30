package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class j6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164332d;

    public j6(com.tencent.mm.plugin.sns.model.k6 k6Var, java.lang.String str) {
        this.f164332d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.storage.b2 D0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager$2");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_clear_sns_tmp_file, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(fj6);
        java.lang.String str = this.f164332d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsRetryEditTipManager", "removeDraftTmpFile clear:%s finalDraftKey:%s", valueOf, str);
        if (fj6 && (D0 = com.tencent.mm.plugin.sns.model.l4.Dj().D0(str)) != null) {
            byte[] bArr = D0.field_draft;
            if (!com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                try {
                    android.content.Intent intent = (android.content.Intent) android.content.Intent.CREATOR.createFromParcel(obtain);
                    java.lang.String stringExtra = intent.getStringExtra("KSightThumbPath");
                    java.lang.String stringExtra2 = intent.getStringExtra("KSightPath");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsRetryEditTipManager", "delete %s, %s", stringExtra, stringExtra2);
                    dw3.c0 c0Var = dw3.c0.f244182a;
                    c0Var.l(stringExtra2);
                    c0Var.l(stringExtra);
                } catch (java.lang.Exception unused) {
                    com.tencent.mm.plugin.sns.model.l4.Dj().J0(str, null, 0);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager$2");
    }
}
