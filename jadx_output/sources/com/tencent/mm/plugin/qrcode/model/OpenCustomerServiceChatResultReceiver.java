package com.tencent.mm.plugin.qrcode.model;

/* loaded from: classes9.dex */
public class OpenCustomerServiceChatResultReceiver extends android.os.ResultReceiver {

    /* renamed from: d, reason: collision with root package name */
    public boolean f154946d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.qrcode.model.n f154947e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f154948f;

    public OpenCustomerServiceChatResultReceiver(android.os.Handler handler, com.tencent.mm.plugin.qrcode.model.n nVar, java.lang.Runnable runnable) {
        super(handler);
        this.f154946d = false;
        this.f154948f = null;
        this.f154947e = nVar;
        this.f154948f = runnable;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i17, android.os.Bundle bundle) {
        int i18;
        com.tencent.mm.plugin.qrcode.model.n nVar;
        com.tencent.mm.plugin.qrcode.model.n nVar2;
        if (bundle != null && (i18 = bundle.getInt("result_key_action", -1)) >= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenCustomerServiceChatResultReceiver", "startKfConversation onReceiveResult action: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(bundle.getInt("result_key_err_code", -1)), bundle.getString("result_key_err_msg"));
            if (i18 == 5) {
                this.f154946d = true;
                return;
            }
            if (i18 == 2) {
                com.tencent.mm.plugin.qrcode.model.n nVar3 = this.f154947e;
                if (nVar3 != null) {
                    ((e04.p) nVar3).D(true);
                    return;
                }
                return;
            }
            if (i18 == 4) {
                if (this.f154946d || (nVar2 = this.f154947e) == null) {
                    return;
                }
                ((e04.p) nVar2).D(true);
                return;
            }
            if (i18 == 3) {
                if (this.f154948f != null) {
                    this.f154947e = null;
                    ((ku5.t0) ku5.t0.f312615d).E(this.f154948f, 600L);
                    return;
                }
                return;
            }
            if (i18 != 6 || this.f154946d || (nVar = this.f154947e) == null) {
                return;
            }
            ((e04.p) nVar).D(true);
        }
    }
}
