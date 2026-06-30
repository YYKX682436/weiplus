package com.tencent.mm.plugin.shake.shakecard.ui;

/* loaded from: classes11.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ShakeAcceptCouponCardEvent f162063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.shakecard.ui.e f162064e;

    public b(com.tencent.mm.plugin.shake.shakecard.ui.e eVar, com.tencent.mm.autogen.events.ShakeAcceptCouponCardEvent shakeAcceptCouponCardEvent) {
        this.f162064e = eVar;
        this.f162063d = shakeAcceptCouponCardEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardDialog", "doNetSceneAccept callback");
        am.fu fuVar = this.f162063d.f54771h;
        com.tencent.mm.plugin.shake.shakecard.ui.e eVar = this.f162064e;
        eVar.D = fuVar;
        if (fuVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardDialog", "doNetSceneAccept callback, mCardAcceptResult == null");
            return;
        }
        eVar.f162079o.setVisibility(8);
        am.fu fuVar2 = eVar.D;
        if (fuVar2 != null) {
            eVar.E = fuVar2.f6707a;
        }
        if (fuVar2 == null || !fuVar2.f6708b) {
            eVar.G = com.tencent.mm.plugin.shake.shakecard.ui.c.ACCEPTED_FAIL;
            eVar.h();
            eVar.f();
            return;
        }
        com.tencent.mm.plugin.shake.shakecard.ui.c cVar = com.tencent.mm.plugin.shake.shakecard.ui.c.ACCEPTED_SUCCES;
        eVar.G = cVar;
        eVar.h();
        eVar.e();
        if (eVar.G == cVar) {
            eVar.f162089y.setText(com.tencent.mm.R.string.j1q);
            if (eVar.B == 1) {
                eVar.f162088x.setImageResource(com.tencent.mm.R.raw.shake_success_icon);
            } else {
                eVar.f162088x.setImageResource(com.tencent.mm.R.raw.shake_success_icon_no_activity);
            }
        }
        eVar.f162090z = true;
        com.tencent.mm.plugin.shake.shakecard.ui.d dVar = eVar.H;
        if (dVar != null) {
            dVar.a();
        }
    }
}
