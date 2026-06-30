package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public android.app.Dialog f178752a = null;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f178753b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.pay.ui.c f178754c;

    public d(android.content.Context context, com.tencent.mm.plugin.wallet.pay.ui.c cVar) {
        this.f178753b = context;
        this.f178754c = cVar;
    }

    public void a() {
        android.app.Dialog dialog = this.f178752a;
        if (dialog != null) {
            dialog.dismiss();
            this.f178752a = null;
        }
    }

    public void b(boolean z17, int i17, java.lang.String str) {
        android.app.Dialog dialog;
        com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent genFingerPrintRsaKeyEvent = new com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent();
        genFingerPrintRsaKeyEvent.f54375h = null;
        am.bf bfVar = genFingerPrintRsaKeyEvent.f54374g;
        bfVar.f6248a = z17;
        if (z17 && ((dialog = this.f178752a) == null || !dialog.isShowing())) {
            android.app.Dialog dialog2 = this.f178752a;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            this.f178752a = com.tencent.mm.wallet_core.ui.b2.h(this.f178753b, false, new com.tencent.mm.plugin.wallet.pay.ui.b(this));
        }
        bfVar.f6249b = i17;
        bfVar.f6250c = str;
        genFingerPrintRsaKeyEvent.f192364d = new com.tencent.mm.plugin.wallet.pay.ui.a(this, genFingerPrintRsaKeyEvent);
        genFingerPrintRsaKeyEvent.b(android.os.Looper.getMainLooper());
    }
}
