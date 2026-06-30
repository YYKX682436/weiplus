package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent f178741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.d f178742e;

    public a(com.tencent.mm.plugin.wallet.pay.ui.d dVar, com.tencent.mm.autogen.events.GenFingerPrintRsaKeyEvent genFingerPrintRsaKeyEvent) {
        this.f178742e = dVar;
        this.f178741d = genFingerPrintRsaKeyEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RegenFingerPrintRsaKey", "GenFingerPrintRsaKeyEvent callback");
        am.cf cfVar = this.f178741d.f54375h;
        com.tencent.mm.plugin.wallet.pay.ui.d dVar = this.f178742e;
        if (cfVar != null && cfVar.f6349a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RegenFingerPrintRsaKey", "GenFingerPrintRsaKeyEvent callback, result.isSuccess is true");
            dVar.a();
            com.tencent.mm.plugin.wallet.pay.ui.c cVar = dVar.f178754c;
            if (cVar != null) {
                cVar.R0(cfVar.f6349a, cfVar.f6350b, cfVar.f6351c);
                return;
            }
            return;
        }
        if (cfVar == null || cfVar.f6349a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RegenFingerPrintRsaKey", "GenFingerPrintRsaKeyEvent callback, result == null");
            return;
        }
        dVar.a();
        com.tencent.mm.plugin.wallet.pay.ui.c cVar2 = dVar.f178754c;
        if (cVar2 != null) {
            cVar2.R0(cfVar.f6349a, cfVar.f6350b, cfVar.f6351c);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.RegenFingerPrintRsaKey", "GenFingerPrintRsaKeyEvent callback, result.isSuccess is false");
    }
}
