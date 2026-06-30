package wt1;

/* loaded from: classes11.dex */
public class a extends com.tencent.mm.sdk.event.n implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.autogen.events.ShakeAcceptCouponCardEvent f449245d;

    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ShakeAcceptCouponCardEvent shakeAcceptCouponCardEvent = (com.tencent.mm.autogen.events.ShakeAcceptCouponCardEvent) iEvent;
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AccessCardEventListener", "ShakeAcceptCouponCardEvent account is not ready");
        } else if (shakeAcceptCouponCardEvent instanceof com.tencent.mm.autogen.events.ShakeAcceptCouponCardEvent) {
            this.f449245d = shakeAcceptCouponCardEvent;
            am.eu euVar = shakeAcceptCouponCardEvent.f54770g;
            java.lang.String str = euVar.f6608a;
            java.lang.String str2 = euVar.f6609b;
            int i17 = euVar.f6610c;
            if (!android.text.TextUtils.isEmpty(str)) {
                gm0.j1.n().f273288b.a(1037, this);
                com.tencent.mars.xlog.Log.i("MicroMsg.AccessCardEventListener", "ShakeAcceptCouponCardEvent doscene from scene " + i17);
                gm0.j1.n().f273288b.g(new xt1.w(str, i17, "", str2, "", "", 0, 0, null));
                return true;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AccessCardEventListener", "ShakeAcceptCouponCardEvent card_id is empty");
            java.lang.Runnable runnable = this.f449245d.f192364d;
            if (runnable != null) {
                runnable.run();
            }
            this.f449245d = null;
        }
        return false;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof xt1.w) {
            am.fu fuVar = new am.fu();
            com.tencent.mars.xlog.Log.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return errcode " + i18 + " errmsg" + str);
            if (i17 == 0 && i18 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene is success");
                xt1.w wVar = (xt1.w) m1Var;
                int i19 = wVar.f456598g;
                java.lang.String str2 = wVar.f456597f;
                java.lang.String str3 = wVar.f456599h;
                if (i19 == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return ok ");
                    fuVar.f6708b = true;
                    com.tencent.mm.plugin.card.model.CardInfo cardInfo = new com.tencent.mm.plugin.card.model.CardInfo();
                    lu1.t.i(cardInfo, str2);
                    if (android.text.TextUtils.isEmpty(cardInfo.field_card_id)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return card_id is empty ");
                        fuVar.f6707a = "";
                    } else {
                        fuVar.f6707a = cardInfo.field_card_id;
                    }
                    xt1.t0.Di().b("key_accept_card_info", cardInfo);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return false, retCode " + i19 + " retMsg" + str3);
                    fuVar.f6708b = false;
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene is fail");
                fuVar.f6708b = false;
            }
            gm0.j1.n().f273288b.q(1037, this);
            com.tencent.mm.autogen.events.ShakeAcceptCouponCardEvent shakeAcceptCouponCardEvent = this.f449245d;
            shakeAcceptCouponCardEvent.f54771h = fuVar;
            java.lang.Runnable runnable = shakeAcceptCouponCardEvent.f192364d;
            if (runnable != null) {
                runnable.run();
            }
            this.f449245d = null;
        }
    }
}
