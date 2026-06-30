package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.WalletGetUserInfoEvent f179380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f179381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f179382f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f179383g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.a f179384h;

    public h(com.tencent.mm.plugin.wallet_core.id_verify.a aVar, com.tencent.mm.autogen.events.WalletGetUserInfoEvent walletGetUserInfoEvent, android.content.Intent intent, android.app.Activity activity, android.os.Bundle bundle) {
        this.f179384h = aVar;
        this.f179380d = walletGetUserInfoEvent;
        this.f179381e = intent;
        this.f179382f = activity;
        this.f179383g = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet_core.id_verify.r rVar;
        boolean z17;
        java.lang.Class<?> cls;
        boolean z18;
        this.f179380d.f192364d = null;
        com.tencent.mm.plugin.wallet_core.id_verify.a aVar = this.f179384h;
        aVar.getClass();
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(aVar.f179316f);
        android.os.Bundle bundle = this.f179383g;
        android.app.Activity activity = this.f179382f;
        android.content.Intent intent = this.f179381e;
        if (K0 || com.tencent.mm.sdk.platformtools.t8.K0(aVar.f179317g)) {
            aVar.l(activity, aVar.f179318h, bundle);
            int i17 = aVar.f179318h;
            if (i17 == -1 || i17 == 0) {
                com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent = new com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent();
                walletRealNameResultNotifyEvent.f54973g.f6120a = aVar.f179318h;
                walletRealNameResultNotifyEvent.e();
                boolean z19 = intent.getExtras().getBoolean("is_from_new_cashier");
                int i18 = aVar.f179318h;
                if (i18 == -1) {
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putString("notifyType", "WCPayRealnameVerifyLogic");
                    bundle2.putBoolean("stopUseCase", true);
                    ((h45.q) i95.n0.c(h45.q.class)).notifyAddPaycardUsecase(bundle2, "", new com.tencent.mm.plugin.wallet_core.id_verify.g(this));
                } else if (i18 == 0 && z19 && !aVar.f179323m && (rVar = aVar.f179324n) != null) {
                    rVar.run(activity);
                }
                if (aVar.f179320j) {
                    com.tencent.mm.autogen.events.KindaBindCardEvent kindaBindCardEvent = new com.tencent.mm.autogen.events.KindaBindCardEvent();
                    int intExtra = aVar.f179321k.getIntExtra("retcode", -1);
                    am.di diVar = kindaBindCardEvent.f54454g;
                    if (intExtra == 1) {
                        diVar.f6453a = true;
                        diVar.f6455c = aVar.f179321k.getStringExtra("bind_serial");
                        diVar.f6456d = aVar.f179321k.getStringExtra("password");
                        diVar.f6457e = aVar.f179321k.getStringExtra("bank_type");
                        diVar.f6458f = aVar.f179321k.getStringExtra("mobile_no");
                        diVar.f6459g = aVar.f179321k.getStringExtra("realname_title");
                        diVar.f6460h = aVar.f179321k.getStringExtra("realname_desc");
                        diVar.f6461i = aVar.f179321k.getStringExtra("realname_btn_title");
                        diVar.f6462j = aVar.f179321k.getStringExtra("realname_err_jump_page");
                        diVar.f6464l = aVar.f179321k.getIntExtra("passport_page_style", 0);
                        diVar.f6465m = aVar.f179321k.getStringExtra("confirm_btn_title");
                        diVar.f6466n = aVar.f179321k.getStringExtra("confirm_btn_url");
                        diVar.f6467o = aVar.f179321k.getStringExtra("cancel_btn_title");
                        diVar.f6468p = aVar.f179321k.getStringExtra("bottom_wording");
                        diVar.f6469q = aVar.f179321k.getStringExtra("bottom_url");
                        diVar.f6470r = aVar.f179321k.getStringExtra("bottom_username");
                    } else if (aVar.f179321k.getIntExtra("retcode", -1) == -1) {
                        z17 = false;
                        diVar.f6453a = false;
                        diVar.f6454b = bundle.getBoolean("key_need_bind_response", z17);
                        diVar.f6463k = java.lang.Boolean.TRUE;
                        kindaBindCardEvent.e();
                        return;
                    }
                    z17 = false;
                    diVar.f6454b = bundle.getBoolean("key_need_bind_response", z17);
                    diVar.f6463k = java.lang.Boolean.TRUE;
                    kindaBindCardEvent.e();
                    return;
                }
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "real name verify process end,jump to " + aVar.f179316f + aVar.f179317g);
        boolean z27 = aVar.f213801c.getBoolean("process_finish_stay_orgpage", true);
        intent.putExtra("key_process_is_end", true);
        intent.putExtra("key_process_is_stay", z27);
        intent.putExtra("key_should_contain_activity_when_on_new_intent", true);
        boolean z28 = intent.getExtras().getBoolean("is_from_new_cashier");
        try {
            cls = java.lang.Class.forName(intent.getExtras().getString("start_activity_class", ""));
        } catch (java.lang.ClassNotFoundException unused) {
            cls = null;
        }
        if (z28) {
            if (cls == null) {
                com.tencent.mm.plugin.wallet_core.id_verify.a aVar2 = this.f179384h;
                aVar2.k(this.f179382f, aVar2.f179316f, aVar2.f179317g, aVar2.f179318h, this.f179381e, z27);
            } else {
                com.tencent.mm.plugin.wallet_core.id_verify.a aVar3 = this.f179384h;
                aVar3.h(this.f179382f, cls, aVar3.f179318h, this.f179381e, z27);
            }
            com.tencent.mm.plugin.wallet_core.id_verify.r rVar2 = aVar.f179324n;
            if (rVar2 != null) {
                rVar2.run(activity);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.wallet_core.id_verify.a aVar4 = this.f179384h;
        aVar4.k(this.f179382f, aVar4.f179316f, aVar4.f179317g, aVar4.f179318h, this.f179381e, z27);
        int i19 = aVar.f179318h;
        if (i19 == -1 || i19 == 0) {
            com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent2 = new com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent();
            walletRealNameResultNotifyEvent2.f54973g.f6120a = aVar.f179318h;
            walletRealNameResultNotifyEvent2.e();
            if (aVar.f179318h == -1) {
                android.os.Bundle bundle3 = new android.os.Bundle();
                bundle3.putString("notifyType", "WCPayRealnameVerifyLogic");
                bundle3.putBoolean("stopUseCase", true);
                ((h45.q) i95.n0.c(h45.q.class)).notifyAddPaycardUsecase(bundle3, "", new com.tencent.mm.plugin.wallet_core.id_verify.f(this));
            }
            ((h45.q) i95.n0.c(h45.q.class)).notifyWalletPageRefresh();
            if (aVar.f179320j) {
                com.tencent.mm.autogen.events.KindaBindCardEvent kindaBindCardEvent2 = new com.tencent.mm.autogen.events.KindaBindCardEvent();
                int intExtra2 = aVar.f179321k.getIntExtra("retcode", -1);
                am.di diVar2 = kindaBindCardEvent2.f54454g;
                if (intExtra2 == 1) {
                    diVar2.f6453a = true;
                    diVar2.f6455c = aVar.f179321k.getStringExtra("bind_serial");
                    diVar2.f6456d = aVar.f179321k.getStringExtra("password");
                    diVar2.f6457e = aVar.f179321k.getStringExtra("bank_type");
                    diVar2.f6458f = aVar.f179321k.getStringExtra("mobile_no");
                    diVar2.f6459g = aVar.f179321k.getStringExtra("realname_title");
                    diVar2.f6460h = aVar.f179321k.getStringExtra("realname_desc");
                    diVar2.f6461i = aVar.f179321k.getStringExtra("realname_btn_title");
                    diVar2.f6462j = aVar.f179321k.getStringExtra("realname_err_jump_page");
                    diVar2.f6464l = aVar.f179321k.getIntExtra("passport_page_style", 0);
                    diVar2.f6465m = aVar.f179321k.getStringExtra("confirm_btn_title");
                    diVar2.f6466n = aVar.f179321k.getStringExtra("confirm_btn_url");
                    diVar2.f6467o = aVar.f179321k.getStringExtra("cancel_btn_title");
                    diVar2.f6468p = aVar.f179321k.getStringExtra("bottom_wording");
                    diVar2.f6469q = aVar.f179321k.getStringExtra("bottom_url");
                    diVar2.f6470r = aVar.f179321k.getStringExtra("bottom_username");
                } else if (aVar.f179321k.getIntExtra("retcode", -1) == -1) {
                    z18 = false;
                    diVar2.f6453a = false;
                    diVar2.f6454b = bundle.getBoolean("key_need_bind_response", z18);
                    diVar2.f6463k = java.lang.Boolean.TRUE;
                    kindaBindCardEvent2.e();
                }
                z18 = false;
                diVar2.f6454b = bundle.getBoolean("key_need_bind_response", z18);
                diVar2.f6463k = java.lang.Boolean.TRUE;
                kindaBindCardEvent2.e();
            }
        }
    }
}
