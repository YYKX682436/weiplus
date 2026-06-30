package com.tencent.mm.plugin.wallet_index.model;

/* loaded from: classes9.dex */
public class WalletGetA8KeyRedirectListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletPayResultEvent> implements com.tencent.mm.modelbase.u0 {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f181055i = "http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyc) + "?";

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f181056m = "http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyb) + "?";

    /* renamed from: d, reason: collision with root package name */
    public int f181057d;

    /* renamed from: e, reason: collision with root package name */
    public int f181058e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.autogen.events.GetA8KeyRedirectEvent f181059f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Queue f181060g;

    /* renamed from: h, reason: collision with root package name */
    public long f181061h;

    public WalletGetA8KeyRedirectListener() {
        super(com.tencent.mm.app.a0.f53288d);
        this.f181058e = 0;
        this.__eventId = 520089918;
    }

    public final void c(int i17, int i18, long j17) {
        int i19 = this.f181057d == 1 ? 163 : 132;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
        iDKey.SetID(i19);
        iDKey.SetValue(1L);
        iDKey.SetKey(26);
        arrayList.add(iDKey);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
            iDKey2.SetID(i19);
            iDKey2.SetValue(1L);
            com.tencent.mars.smc.IDKey iDKey3 = new com.tencent.mars.smc.IDKey();
            iDKey3.SetID(i19);
            iDKey3.SetValue(1L);
            iDKey2.SetKey(8);
            if (i18 < 0) {
                iDKey3.SetKey(9);
            } else if (i18 > 0) {
                iDKey3.SetKey(10);
            }
        }
        if (this.f181057d == 4 && j17 > 0) {
            com.tencent.mars.smc.IDKey iDKey4 = new com.tencent.mars.smc.IDKey();
            iDKey4.SetID(i19);
            iDKey4.SetValue(1L);
            com.tencent.mars.smc.IDKey iDKey5 = new com.tencent.mars.smc.IDKey();
            iDKey5.SetID(i19);
            iDKey5.SetValue(1L);
            com.tencent.mars.smc.IDKey iDKey6 = new com.tencent.mars.smc.IDKey();
            iDKey6.SetID(i19);
            iDKey6.SetValue((int) j17);
            iDKey4.SetKey(0);
            if (j17 <= 1000) {
                iDKey5.SetKey(1);
                iDKey6.SetKey(4);
            } else if (j17 > 1000 && j17 <= 3000) {
                iDKey5.SetKey(2);
                iDKey6.SetKey(5);
            } else if (j17 > 3000) {
                iDKey5.SetKey(3);
                iDKey6.SetKey(6);
            }
            arrayList.add(iDKey4);
            arrayList.add(iDKey5);
            arrayList.add(iDKey6);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, true, false);
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent) {
        boolean z17;
        com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent2 = walletPayResultEvent;
        com.tencent.mm.wallet_core.model.n1.f213951a = java.lang.System.currentTimeMillis();
        boolean z18 = false;
        if (walletPayResultEvent2 != null) {
            am.s10 s10Var = walletPayResultEvent2.f54965g;
            if (s10Var.f7863c == -1) {
                android.content.Intent intent = new android.content.Intent();
                intent.addFlags(67108864);
                android.content.Intent intent2 = s10Var.f7861a;
                if (intent2 == null || intent2.getIntExtra("pay_channel", 0) != 13) {
                    j45.l.u(com.tencent.mm.sdk.platformtools.x2.f193071a, ".ui.LauncherUI", intent, null);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletGetA8KeyRedirectListener", "channel is MMPAY_CHANNEL_SCAN_QRCODE_IMAGE_CHANNEL ，return org page");
                }
                z17 = true;
            } else {
                z17 = false;
            }
            if (s10Var.f7865e) {
                java.util.Queue queue = this.f181060g;
                if (queue != null && ((java.util.LinkedList) queue).size() > 0) {
                    com.tencent.mm.autogen.events.PayAuthNativeEvent payAuthNativeEvent = (com.tencent.mm.autogen.events.PayAuthNativeEvent) ((java.util.LinkedList) this.f181060g).poll();
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletGetA8KeyRedirectListener", "One PayAuthNativeEvent has been consumed, and the size of mKindaAuthNativeEventQueue is " + ((java.util.LinkedList) this.f181060g).size());
                    int i17 = s10Var.f7863c;
                    if (i17 == 0) {
                        payAuthNativeEvent.f54609h.f6367a = 1;
                    } else if (i17 == 3) {
                        payAuthNativeEvent.f54609h.f6367a = 2;
                    }
                    com.tencent.mm.sdk.platformtools.u3.h(new nt4.x(this, payAuthNativeEvent));
                    z18 = true;
                } else if (this.f181060g != null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WalletGetA8KeyRedirectListener", "The state of mKindaAuthNativeEventQueue is error! it's empty!");
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WalletGetA8KeyRedirectListener", "The state of mKindaAuthNativeEventQueue is error! it is null!");
                }
            } else {
                z18 = z17;
            }
        }
        com.tencent.mars.xlog.Log.f("MicroMsg.WalletGetA8KeyRedirectListener", "mismatched event");
        java.util.Queue queue2 = this.f181060g;
        if (queue2 != null) {
            if (!z18 || ((java.util.LinkedList) queue2).size() > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletGetA8KeyRedirectListener", "event isn't consumed, isDealEvent: " + z18 + ", and mKindaAuthNativeEventQueue.size(): " + ((java.util.LinkedList) this.f181060g).size());
            } else {
                dead();
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletGetA8KeyRedirectListener", "event is finish and consumed");
            }
        }
        return z18;
    }

    public final void d(java.lang.String str, int i17) {
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
        payInfo.f192109e = this.f181057d;
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        for (java.lang.String str4 : str.replace(f181056m, "").split("&")) {
            if (str4.startsWith("errcode=")) {
                str2 = str4.replace("errcode=", "");
            } else if (str4.startsWith("errmsg=")) {
                str3 = str4.replace("errmsg=", "");
            } else if (str4.startsWith("reqkey=")) {
                payInfo.f192114m = str4.replace("reqkey=", "");
            } else if (str4.startsWith("uuid=")) {
                payInfo.f192115n = str4.replace("uuid=", "");
            } else if (str4.startsWith("appid=")) {
                payInfo.f192116o = str4.replace("appid=", "");
            } else if (str4.startsWith("appsource=")) {
                payInfo.f192117p = str4.replace("appsource=", "");
            } else if (str4.startsWith("productid=")) {
                payInfo.f192120s = str4.replace("productid=", "");
            }
        }
        payInfo.f192111g = i17;
        if ("0".equals(str2)) {
            com.tencent.mm.wallet_core.b.a().getClass();
            ((h45.q) i95.n0.c(h45.q.class)).startWxpayQueryCashierPay(payInfo.f192114m, payInfo.f192109e, payInfo.f192111g);
            com.tencent.mm.autogen.events.GetA8KeyRedirectEvent getA8KeyRedirectEvent = this.f181059f;
            java.lang.Runnable runnable = getA8KeyRedirectEvent.f192364d;
            if (runnable != null) {
                getA8KeyRedirectEvent.f54377h.f6554a = 1;
                runnable.run();
            }
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                str3 = ((android.content.Context) this.f181059f.f54376g.f6448c.get()).getString(com.tencent.mm.R.string.l0g);
            }
            db5.e1.t((android.content.Context) this.f181059f.f54376g.f6448c.get(), str3, "", new nt4.v(this));
        }
        if (android.text.TextUtils.isEmpty(str2) || !java.util.regex.Pattern.compile("[0-9]*").matcher(str2).matches()) {
            return;
        }
        c(0, java.lang.Integer.valueOf(str2).intValue(), 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof w60.k) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f181061h;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11170, java.lang.Integer.valueOf(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR), 0, java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a)), "");
            c(i17, i18, currentTimeMillis);
            gm0.j1.i();
            gm0.j1.n().f273288b.q(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, this);
            if (i17 == 0 && i18 == 0) {
                d(((com.tencent.mm.modelsimple.k0) ((w60.k) m1Var)).Q(), this.f181058e);
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = ((android.content.Context) this.f181059f.f54376g.f6448c.get()).getString(com.tencent.mm.R.string.l0g);
            }
            db5.e1.t((android.content.Context) this.f181059f.f54376g.f6448c.get(), str, "", new nt4.u(this));
            return;
        }
        if (!(m1Var instanceof com.tencent.mm.wallet_core.tenpay.model.q)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletGetA8KeyRedirectListener", "other scene");
            return;
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.q(385, this);
        if (i17 != 0) {
            throw null;
        }
        if (i18 != 0) {
            throw null;
        }
        ((com.tencent.mm.wallet_core.tenpay.model.q) m1Var).getClass();
        if (!"0".equals(null)) {
            throw null;
        }
        throw null;
    }
}
