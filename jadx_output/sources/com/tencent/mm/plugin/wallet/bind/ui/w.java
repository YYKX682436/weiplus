package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes9.dex */
public class w implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI f178647d;

    public w(com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI walletBankcardManageUI) {
        this.f178647d = walletBankcardManageUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        final com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) adapterView.getAdapter().getItem(i17);
        com.tencent.mm.wallet_core.ui.r1.q0(18, 1);
        com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI walletBankcardManageUI = this.f178647d;
        if (bankcard != null) {
            com.tencent.mm.plugin.wallet.bind.ui.c cVar = walletBankcardManageUI.f178554i;
            java.util.List list = cVar.f178621h;
            if (list != null && !((java.util.ArrayList) list).isEmpty()) {
                java.util.Iterator it = ((java.util.ArrayList) cVar.f178621h).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.String str = (java.lang.String) it.next();
                    if (str.equals(bankcard.field_bindSerial)) {
                        ((java.util.ArrayList) cVar.f178621h).remove(str);
                        gm0.j1.i();
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_BANKCARD_SERIAL_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.c1(cVar.f178621h, ","));
                        break;
                    }
                }
            }
            if (bankcard.F0()) {
                if (bankcard.field_wxcreditState == 0) {
                    if (com.tencent.mm.plugin.wallet.bind.ui.d.a(bankcard)) {
                        gm0.j1.i();
                        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(196659, null);
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        if (android.text.TextUtils.isEmpty(str2)) {
                            sb6.append(bankcard.field_bankcardType);
                        } else {
                            sb6.append(str2);
                            sb6.append("&");
                            sb6.append(bankcard.field_bankcardType);
                        }
                        gm0.j1.i();
                        gm0.j1.u().c().w(196659, sb6.toString());
                    }
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putParcelable("key_bankcard", bankcard);
                    bundle.putString("key_bank_username", bankcard.field_bizUsername);
                    bundle.putString("key_bank_type", bankcard.field_bankcardType);
                    com.tencent.mm.wallet_core.a.k(walletBankcardManageUI, "wxcredit", "WXCreditOpenProcess", bundle, null);
                } else {
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putParcelable("key_bankcard", bankcard);
                    com.tencent.mm.wallet_core.a.k(walletBankcardManageUI, "wxcredit", "WXCreditManagerProcess", bundle2, null);
                }
            } else if (bankcard.A0()) {
                walletBankcardManageUI.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBankcardManageUI", "do honey pay card back");
                if (u73.h.g()) {
                    com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                    create.putString("card_id", bankcard.field_bindSerial);
                    ((h45.q) i95.n0.c(h45.q.class)).startUseCase("honeyPayCardBackUseCase", create, new com.tencent.mm.plugin.wallet.bind.ui.x(walletBankcardManageUI));
                } else {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("key_card_no", bankcard.field_bindSerial);
                    j45.l.j(walletBankcardManageUI, "honey_pay", ".ui.HoneyPayCardBackUI", intent, null);
                }
            } else {
                at4.u1 p17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().p();
                boolean z17 = (p17.f13981a & 4096) > 0;
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "isReportLocation, ret = %s switchBit %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(p17.f13981a));
                if (z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletBankcardManageUI", "jump to H5 bankcard detail page");
                    gm0.j1.i();
                    java.lang.String str3 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_BANKCARD_DETAIL_URL_STRING_SYNC, "");
                    gm0.j1.i();
                    long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_BANKCARD_DETAIL_URL_TIMESTAMP_LONG_SYNC, 0L)).longValue();
                    long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str3) || currentTimeMillis - longValue >= 7200) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBankcardManageUI", "listen BankcardLogoReadyEvent for newest url");
                        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
                        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BankcardLogoReadyEvent>(a0Var) { // from class: com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI$6$1
                            {
                                this.__eventId = 585646942;
                            }

                            @Override // com.tencent.mm.sdk.event.IListener
                            public boolean callback(com.tencent.mm.autogen.events.BankcardLogoReadyEvent bankcardLogoReadyEvent) {
                                dead();
                                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBankcardManageUI", "BankcardLogoReady,jump bank url");
                                com.tencent.mm.plugin.wallet.bind.ui.w.this.f178647d.X6(bankcard);
                                return true;
                            }
                        }.alive();
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBankcardManageUI", "bank's url is not null");
                        walletBankcardManageUI.X6(bankcard);
                    }
                } else {
                    walletBankcardManageUI.Y6(bankcard);
                }
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14422, 1, bankcard.field_bankcardType);
        } else {
            walletBankcardManageUI.U6(null);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14422, 2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
