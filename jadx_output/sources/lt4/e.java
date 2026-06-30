package lt4;

/* loaded from: classes9.dex */
public class e extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.wallet_index.model.WalletGetA8KeyRedirectListener f321289d;

    public e() {
        super(0);
        this.f321289d = new com.tencent.mm.plugin.wallet_index.model.WalletGetA8KeyRedirectListener();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0025. Please report as an issue. */
    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        boolean z17 = iEvent instanceof com.tencent.mm.autogen.events.GetA8KeyRedirectEvent;
        com.tencent.mm.plugin.wallet_index.model.WalletGetA8KeyRedirectListener walletGetA8KeyRedirectListener = this.f321289d;
        if (!z17) {
            if (iEvent instanceof com.tencent.mm.autogen.events.PayAuthNativeEvent) {
                com.tencent.mm.autogen.events.PayAuthNativeEvent payAuthNativeEvent = (com.tencent.mm.autogen.events.PayAuthNativeEvent) iEvent;
                walletGetA8KeyRedirectListener.getClass();
                com.tencent.mm.wallet_core.b.a().getClass();
                if (walletGetA8KeyRedirectListener.f181060g == null) {
                    walletGetA8KeyRedirectListener.f181060g = new java.util.LinkedList();
                }
                ((java.util.LinkedList) walletGetA8KeyRedirectListener.f181060g).offer(payAuthNativeEvent);
                if (!com.tencent.mm.sdk.event.d.f192370d.b(walletGetA8KeyRedirectListener)) {
                    walletGetA8KeyRedirectListener.alive();
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("a8key_scene", payAuthNativeEvent.f54608g.f6266b);
                am.bo boVar = payAuthNativeEvent.f54608g;
                bundle.putString("qrcode_url", boVar.f6265a);
                bundle.putInt("channel", boVar.f6267c);
                bundle.putInt("chat_type", boVar.f6269e);
                bundle.putInt("send_type", boVar.f6270f);
                bundle.putInt("qrcode_session_type", boVar.f6271g);
                bundle.putString("qrcode_session_name", boVar.f6272h);
                bundle.putString("qrcode_timeline_objid", boVar.f6273i);
                bundle.putString("qrcodeSenderName", boVar.f6274j);
                java.lang.String str = boVar.f6275k;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    if (str.startsWith("msg_")) {
                        str = str.substring(4);
                    }
                    bundle.putString("qrcodeSenderMsgId", str);
                }
                java.lang.String str2 = boVar.f6276l;
                long j17 = boVar.f6277m;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    str2 = boVar.f6265a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletGetA8KeyRedirectListener", "doAuthNative initRawUrl is empty, use qrcode_url as fallback");
                }
                if (j17 == 0) {
                    j17 = c01.id.a() / 1000;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletGetA8KeyRedirectListener", "doAuthNative initTimestamp is 0, use current timestamp as fallback");
                }
                bundle.putString("payInitRawUrl", str2 != null ? str2 : "");
                bundle.putLong("payInitTimestamp", j17);
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletGetA8KeyRedirectListener", "doAuthNative initRawUrl: " + str2 + ", initTimestamp: " + j17);
                ((h45.q) i95.n0.c(h45.q.class)).startScanQRCodePay(boVar.f6268d, bundle);
            }
            return false;
        }
        com.tencent.mm.autogen.events.GetA8KeyRedirectEvent getA8KeyRedirectEvent = (com.tencent.mm.autogen.events.GetA8KeyRedirectEvent) iEvent;
        walletGetA8KeyRedirectListener.f181059f = getA8KeyRedirectEvent;
        am.df dfVar = getA8KeyRedirectEvent.f54376g;
        java.lang.String str3 = dfVar.f6447b;
        android.os.Bundle bundle2 = dfVar.f6449d;
        if (bundle2 != null) {
            walletGetA8KeyRedirectListener.f181058e = bundle2.getInt("pay_channel", 0);
        }
        switch (walletGetA8KeyRedirectListener.f181059f.f54376g.f6446a) {
            case 10:
            case 11:
                if (!com.tencent.mm.sdk.event.d.f192370d.b(walletGetA8KeyRedirectListener)) {
                    walletGetA8KeyRedirectListener.alive();
                }
                if (str3 != null) {
                    if (str3.startsWith("weixin://wxpay")) {
                        walletGetA8KeyRedirectListener.f181057d = 4;
                        gm0.j1.i();
                        gm0.j1.n().f273288b.a(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, walletGetA8KeyRedirectListener);
                        w60.j jVar = (w60.j) i95.n0.c(w60.j.class);
                        walletGetA8KeyRedirectListener.f181059f.f54376g.getClass();
                        java.lang.Object Ai = ((v60.u) jVar).Ai(str3, null, 4, 0, o45.cg.a(), new byte[0]);
                        gm0.j1.i();
                        gm0.j1.n().f273288b.g((com.tencent.mm.modelbase.m1) Ai);
                        walletGetA8KeyRedirectListener.f181061h = java.lang.System.currentTimeMillis();
                    } else {
                        walletGetA8KeyRedirectListener.f181057d = 1;
                        walletGetA8KeyRedirectListener.d(str3, walletGetA8KeyRedirectListener.f181058e);
                    }
                }
                return true;
            case 12:
                java.lang.String[] split = str3.replace(com.tencent.mm.plugin.wallet_index.model.WalletGetA8KeyRedirectListener.f181055i, "").split("&");
                java.lang.String str4 = null;
                java.lang.String str5 = null;
                java.lang.String str6 = null;
                for (java.lang.String str7 : split) {
                    if (str7.startsWith("errcode=")) {
                        str4 = str7.replace("errcode=", "");
                    } else if (str7.startsWith("errmsg=")) {
                        str6 = str7.replace("errmsg=", "");
                    } else if (str7.startsWith("importkey=")) {
                        str5 = str7.replace("importkey=", "");
                    }
                }
                if (!"0".equals(str4) || com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
                        str6 = ((android.content.Context) walletGetA8KeyRedirectListener.f181059f.f54376g.f6448c.get()).getString(com.tencent.mm.R.string.l0g);
                    }
                    db5.e1.t((android.content.Context) walletGetA8KeyRedirectListener.f181059f.f54376g.f6448c.get(), str6, "", new nt4.w(walletGetA8KeyRedirectListener));
                } else {
                    android.content.Context context = (android.content.Context) walletGetA8KeyRedirectListener.f181059f.f54376g.f6448c.get();
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("key_import_key", str5);
                    intent.putExtra("key_req_bind_scene", 2);
                    intent.putExtra("key_custom_bind_tips", (java.lang.String) null);
                    j45.l.j(context, "wallet", ".bind.ui.WalletBindUI", intent, null);
                    com.tencent.mm.autogen.events.GetA8KeyRedirectEvent getA8KeyRedirectEvent2 = walletGetA8KeyRedirectListener.f181059f;
                    java.lang.Runnable runnable = getA8KeyRedirectEvent2.f192364d;
                    if (runnable != null) {
                        getA8KeyRedirectEvent2.f54377h.f6554a = 1;
                        runnable.run();
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
