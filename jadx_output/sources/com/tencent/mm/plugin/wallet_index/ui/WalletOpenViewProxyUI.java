package com.tencent.mm.plugin.wallet_index.ui;

@db5.a(7)
/* loaded from: classes9.dex */
public class WalletOpenViewProxyUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f181117g = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.balance.ui.lqt.d f181118d;

    /* renamed from: e, reason: collision with root package name */
    public gs4.f f181119e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f181120f = new java.util.HashMap();

    public static void Y6(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_LQT_VERSION_INT_SYNC;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenViewProxyUI", "LQTVersion Old: %s New: %s", c17.m(u3Var, 0), str);
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1(str, 0)));
    }

    public final void U6(boolean z17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("closeWebView", (java.lang.String) ((java.util.HashMap) this.f181120f).get("closeWebView"));
        if (z17) {
            setResult(-1, intent);
        } else {
            setResult(0, intent);
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.wallet_index.ui.e0 e0Var = new com.tencent.mm.plugin.wallet_index.ui.e0(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(e0Var, 50L, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103, types: [int] */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v110 */
    public final void V6(java.lang.String str) {
        android.content.DialogInterface.OnCancelListener onCancelListener;
        boolean z17;
        java.lang.String str2;
        int P;
        boolean z18 = true;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletOpenViewProxyUI", "func[handleOpenView] packageExt null or nil");
        } else {
            java.lang.String str3 = (java.lang.String) ((java.util.HashMap) this.f181120f).get("openview");
            if ("open_wcpay_biz_view".equals(str3)) {
                h45.a0.e(getContext(), null);
            } else {
                if ("open_wcpay_hbrefund".equals(str3)) {
                    com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                    create.putInt("refund_open_from", 3);
                    create.putString("refund_json", this.f181119e.b());
                    create.putString("refund_lingqian_title", this.f181119e.f275084d);
                    create.putString("refund_lingqian_desc", this.f181119e.f275085e);
                    create.putString("refund_origin_title", this.f181119e.f275086f);
                    create.putString("refund_origin_desc", this.f181119e.f275087g);
                    create.putString("top_tip", this.f181119e.f275088h);
                    create.putString("refund_time_title", this.f181119e.f275089i);
                    com.tencent.mm.autogen.mmdata.rpt.WCPayHongBaoRefundClickReportStruct wCPayHongBaoRefundClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCPayHongBaoRefundClickReportStruct();
                    gm0.j1.i();
                    int i17 = com.tencent.mm.sdk.platformtools.t8.B0(((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_EXT_PAY_SETTING_LONG_SYNC, 0L)).longValue() & 3, 2L) ? 2 : 1;
                    create.putBool("is_return_to_lq", i17 == 1);
                    ((h45.q) i95.n0.c(h45.q.class)).startUseCase("hongbaoRefundWay", create, new com.tencent.mm.plugin.wallet_index.ui.g0(this));
                    wCPayHongBaoRefundClickReportStruct.f62103f = 3L;
                    wCPayHongBaoRefundClickReportStruct.f62101d = i17;
                    wCPayHongBaoRefundClickReportStruct.k();
                } else if ("open_wallet_delay_transfer_setting_ui".equals(str3)) {
                    com.tencent.mm.wallet_core.b a17 = com.tencent.mm.wallet_core.b.a();
                    a17.getClass();
                    boolean c17 = a17.c(e42.c0.clicfg_pay_delay_transfer_kinda_switch, false);
                    com.tencent.mm.wallet_core.b a18 = com.tencent.mm.wallet_core.b.a();
                    a18.getClass();
                    ?? r07 = c17;
                    if (a18.c(e42.c0.clicfg_pay_delay_transfer_flutter_switch, false)) {
                        r07 = 2;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenViewProxyUI", "func[handleOpenView] do open wallet_delay_transfer_setting_ui，openType ：%s", java.lang.Integer.valueOf((int) r07));
                    if (r07 == 1) {
                        com.tencent.kinda.gen.ITransmitKvData create2 = com.tencent.kinda.gen.ITransmitKvData.create();
                        create2.putBool("isOpenFlutter", false);
                        ((h45.q) i95.n0.c(h45.q.class)).startUseCase("delayTransferUseCase", create2, new com.tencent.mm.plugin.wallet_index.ui.i0(this));
                        return;
                    } else if (r07 == 2) {
                        com.tencent.kinda.gen.ITransmitKvData create3 = com.tencent.kinda.gen.ITransmitKvData.create();
                        create3.putBool("isOpenFlutter", true);
                        ((h45.q) i95.n0.c(h45.q.class)).startUseCase("delayTransferUseCase", create3, new com.tencent.mm.plugin.wallet_index.ui.k0(this));
                        return;
                    } else {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("key_scene", 1);
                        j45.l.j(getContext(), "wallet", ".pwd.ui.WalletDelayTransferSettingUI", intent, null);
                    }
                } else if ("open_wcpay_balance_view".equals(str3)) {
                    h45.a0.b(getContext(), 0);
                } else if ("open_wcpay_order_detail_view".equals(str3)) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("trans_id", (java.lang.String) ((java.util.HashMap) this.f181120f).get("trans_id"));
                    intent2.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
                    if (((java.util.HashMap) this.f181120f).containsKey("bill_id")) {
                        intent2.putExtra("bill_id", (java.lang.String) ((java.util.HashMap) this.f181120f).get("bill_id"));
                    }
                    j45.l.j(getContext(), "order", ".ui.MallOrderTransactionInfoUI", intent2, null);
                } else if ("open_wcpay_f2f_receive_detail".equals(str3)) {
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.putExtra("key_timestamp", com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) ((java.util.HashMap) this.f181120f).get("fromtimestamp"), 0L));
                    intent3.putExtra("key_from_scene", 1);
                    j45.l.j(getContext(), "collect", ".ui.CollectBillUI", intent3, null);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13944, 2);
                } else if ("open_wcpay_grouppay_detail".equals(str3)) {
                    android.content.Intent intent4 = new android.content.Intent();
                    intent4.putExtra("bill_no", (java.lang.String) ((java.util.HashMap) this.f181120f).get("billno"));
                    intent4.putExtra("chatroom", (java.lang.String) ((java.util.HashMap) this.f181120f).get("groupid"));
                    intent4.putExtra("key_sign", (java.lang.String) ((java.util.HashMap) this.f181120f).get("sign"));
                    intent4.putExtra("key_ver", (java.lang.String) ((java.util.HashMap) this.f181120f).get("ver"));
                    intent4.putExtra("enter_scene", 5);
                    j45.l.j(getContext(), "aa", ".ui.PaylistAAUI", intent4, null);
                } else if ("open_wcpay_t2bc_detail".equals(str3)) {
                    java.lang.String str4 = (java.lang.String) ((java.util.HashMap) this.f181120f).get("transfer_bill_id");
                    if (!((h45.q) i95.n0.c(h45.q.class)).tryStartTransferToBankDetailUseCase(str4, null)) {
                        android.content.Intent intent5 = new android.content.Intent();
                        intent5.putExtra("key_transfer_bill_id", str4);
                        intent5.putExtra("key_enter_scene", 1);
                        j45.l.j(getContext(), "remittance", ".bankcard.ui.BankRemitDetailUI", intent5, null);
                    }
                } else if ("open_honey_pay_home".equals(str3)) {
                    if (u73.h.g()) {
                        ((h45.q) i95.n0.c(h45.q.class)).startUseCase("HoneyPayPayerUseCase", com.tencent.kinda.gen.ITransmitKvData.create(), new com.tencent.mm.plugin.wallet_index.ui.l0(this));
                    } else {
                        j45.l.j(getContext(), "honey_pay", ".ui.HoneyPayMainUI", new android.content.Intent(), null);
                    }
                } else {
                    if ("open_honey_pay_card_back".equals(str3)) {
                        if (u73.h.g()) {
                            com.tencent.kinda.gen.ITransmitKvData create4 = com.tencent.kinda.gen.ITransmitKvData.create();
                            create4.putString("card_id", (java.lang.String) ((java.util.HashMap) this.f181120f).get("card_id"));
                            ((h45.q) i95.n0.c(h45.q.class)).startUseCase("honeyPayCardBackUseCase", create4, new com.tencent.mm.plugin.wallet_index.ui.m0(this));
                        } else {
                            android.content.Intent intent6 = new android.content.Intent();
                            intent6.putExtra("key_card_no", (java.lang.String) ((java.util.HashMap) this.f181120f).get("card_id"));
                            j45.l.j(getContext(), "honey_pay", ".ui.HoneyPayCardBackUI", intent6, null);
                        }
                        ku5.u0 u0Var = ku5.t0.f312615d;
                        com.tencent.mm.plugin.wallet_index.ui.n0 n0Var = new com.tencent.mm.plugin.wallet_index.ui.n0(this, true);
                        ku5.t0 t0Var = (ku5.t0) u0Var;
                        t0Var.getClass();
                        t0Var.z(n0Var, 500L, false);
                        return;
                    }
                    if ("open_honey_pay_user_detail".equals(str3)) {
                        android.content.Intent intent7 = new android.content.Intent();
                        intent7.putExtra("key_is_payer", false);
                        intent7.putExtra("key_card_no", (java.lang.String) ((java.util.HashMap) this.f181120f).get("card_id"));
                        j45.l.j(getContext(), "honey_pay", ".ui.HoneyPayProxyUI", intent7, null);
                        ku5.u0 u0Var2 = ku5.t0.f312615d;
                        com.tencent.mm.plugin.wallet_index.ui.o0 o0Var = new com.tencent.mm.plugin.wallet_index.ui.o0(this, true);
                        ku5.t0 t0Var2 = (ku5.t0) u0Var2;
                        t0Var2.getClass();
                        t0Var2.z(o0Var, 500L, false);
                        return;
                    }
                    if ("open_wcpay_t2bc_view".equals(str3)) {
                        if (!((h45.q) i95.n0.c(h45.q.class)).tryStartTransferToBankUseCase(null, null)) {
                            j45.l.j(getContext(), "remittance", ".bankcard.ui.BankRemitBankcardInputUI", new android.content.Intent(), null);
                        }
                    } else if ("open_wcpay_fetch_balance_view".equals(str3)) {
                        com.tencent.mm.autogen.events.WCPayStartBalanceFetchEvent wCPayStartBalanceFetchEvent = new com.tencent.mm.autogen.events.WCPayStartBalanceFetchEvent();
                        wCPayStartBalanceFetchEvent.f54949g.f6301a = getContext();
                        wCPayStartBalanceFetchEvent.e();
                    } else if ("open_wcpay_wallet_lock_view".equals(str3)) {
                        android.content.Intent intent8 = new android.content.Intent();
                        intent8.putExtra("wallet_lock_jsapi_scene", (java.lang.String) ((java.util.HashMap) this.f181120f).get("entry_scene"));
                        if (((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).Ai()) {
                            ((h45.q) i95.n0.c(h45.q.class)).startWalletLockSettingUseCase(this, intent8, new com.tencent.mm.plugin.wallet_index.ui.p0(this));
                        } else {
                            ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().l(this, intent8);
                        }
                    } else if ("open_wcpay_security_setting_view".equals(str3)) {
                        android.content.Intent intent9 = new android.content.Intent();
                        intent9.putExtra("wallet_lock_jsapi_scene", (java.lang.String) ((java.util.HashMap) this.f181120f).get("entry_scene"));
                        if (com.tencent.mm.wallet_core.b.a().e()) {
                            ((h45.q) i95.n0.c(h45.q.class)).startPaySecurityUseCase(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) ((java.util.HashMap) this.f181120f).get("entry_scene"), 0), new com.tencent.mm.plugin.wallet_index.ui.q0(this));
                        } else {
                            j45.l.j(this, "wallet", ".pwd.ui.WalletSecuritySettingUI", intent9, null);
                        }
                    } else if ("open_wcpay_c2c_message_view".equals(str3)) {
                        java.util.Map map = this.f181120f;
                        if (map != null && ((P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) ((java.util.HashMap) map).get("bizType"), -1)) == 1 || P == 7)) {
                            java.lang.String str5 = (java.lang.String) ((java.util.HashMap) this.f181120f).get("bizId");
                            java.lang.String str6 = (java.lang.String) ((java.util.HashMap) this.f181120f).get(dm.i4.COL_USERNAME);
                            long V = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) ((java.util.HashMap) this.f181120f).get("createTime"), -1L);
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenViewProxyUI", "view open c2c message view, bizType: %s, bizId: %s, username: %s, createTime: %s", java.lang.Integer.valueOf(P), str5, str6, java.lang.Long.valueOf(V));
                            com.tencent.mm.autogen.events.JsApiOpenC2CTransferMsgViewEvent jsApiOpenC2CTransferMsgViewEvent = new com.tencent.mm.autogen.events.JsApiOpenC2CTransferMsgViewEvent();
                            am.wh whVar = jsApiOpenC2CTransferMsgViewEvent.f54447g;
                            whVar.f8283b = str5;
                            whVar.f8284c = str6;
                            whVar.f8285d = java.lang.Long.valueOf(V);
                            jsApiOpenC2CTransferMsgViewEvent.e();
                        }
                    } else if ("open_lqt_auto_planindex_view".equals(str3)) {
                        j45.l.j(getContext(), "wallet", ".balance.ui.lqt.WalletLqtPlanBeforeHomeUI", new android.content.Intent(), null);
                    } else if ("open_wcpay_hk_f2f".equals(str3)) {
                        android.content.Intent intent10 = new android.content.Intent();
                        intent10.putExtra("key_from_scene", 1);
                        j45.l.j(getContext(), "collect", ".ui.CollectHKMainUI", intent10, null);
                    } else if ("open_lqt_auto_planadd_view".equals(str3)) {
                        android.content.Intent intent11 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.class);
                        intent11.putExtra("key_mode", 1);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent11);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/wallet_index/ui/WalletOpenViewProxyUI", "handleOpenView", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(this, "com/tencent/mm/plugin/wallet_index/ui/WalletOpenViewProxyUI", "handleOpenView", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else if ("open_wcpay_lqt_save".equals(str3)) {
                        com.tencent.mm.plugin.wallet.balance.model.lqt.c3.c((java.lang.String) ((java.util.HashMap) this.f181120f).get("trace_info"));
                        Y6((java.lang.String) ((java.util.HashMap) this.f181120f).get("lqt_fund_agent_entity"));
                        java.util.Map map2 = this.f181120f;
                        boolean l17 = j62.e.g().l("clicfg_android_balance_jump_route_change", false, false, true);
                        com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveJumpHandler", "[handle] enableKindaRoute: %s", java.lang.Boolean.valueOf(l17));
                        if (l17) {
                            java.lang.String str7 = map2 != null ? (java.lang.String) ((java.util.HashMap) map2).get("operate_id") : null;
                            android.content.Intent intent12 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.class);
                            intent12.putExtra("lqt_save_fetch_mode", 1);
                            intent12.putExtra("operate_id", str7);
                            if (str != null && r26.n0.B(str, "entry_scene", false)) {
                                intent12.putExtra("entrance_type", com.tencent.mm.sdk.platformtools.t8.D1(map2 != null ? (java.lang.String) ((java.util.HashMap) map2).get("entry_scene") : null, 0));
                            }
                            if (str != null && r26.n0.B(str, "amount", false)) {
                                double E1 = com.tencent.mm.sdk.platformtools.t8.E1(map2 != null ? (java.lang.String) ((java.util.HashMap) map2).get("amount") : null) / 100.0d;
                                intent12.putExtra("fill_money", com.tencent.mm.wallet_core.ui.r1.o(E1));
                                intent12.putExtra("limit_cashier_amount", E1);
                                intent12.putExtra("outer_trans_money", com.tencent.mm.wallet_core.ui.r1.o(E1));
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveJumpHandler", "[jumpToLqtSaveKinda] start lqt save use case (kinda only)");
                            if (!((h45.q) i95.n0.c(h45.q.class)).startLqtSaveUseCase(this, intent12, nt4.g.f339825a)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveJumpHandler", "[jumpToLqtSaveKinda] startLqtSaveUseCase not available, start failed");
                            }
                            finish();
                            z17 = false;
                        } else {
                            if (map2 != null) {
                                str2 = (java.lang.String) ((java.util.HashMap) map2).get("operate_id");
                                onCancelListener = null;
                                z17 = false;
                            } else {
                                onCancelListener = null;
                                z17 = false;
                                str2 = null;
                            }
                            new com.tencent.mm.plugin.wallet.balance.model.lqt.z().l().h(new nt4.i(this, com.tencent.mm.wallet_core.ui.b2.e(this, z17, z17, onCancelListener), str, map2, str2));
                        }
                        z18 = z17;
                    } else {
                        z18 = true;
                        if ("open_wcpay_grouppay_introview".equals(str3)) {
                            java.lang.String str8 = (java.lang.String) ((java.util.HashMap) this.f181120f).get("amount");
                            java.lang.String str9 = (java.lang.String) ((java.util.HashMap) this.f181120f).get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                            android.content.Intent intent13 = new android.content.Intent();
                            intent13.putExtra("amount", str8);
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(str9)) {
                                str9 = java.net.URLDecoder.decode(str9);
                                intent13.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str9);
                            }
                            intent13.putExtra("enter_scene", 5);
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenViewProxyUI", "view open grouppay, amount: %s, title: %s", str8, str9);
                            j45.l.j(this, "aa", ".ui.AAEntranceUI", intent13, null);
                        } else if ("open_transfer_operation_result_view".equals(str3)) {
                            new com.tencent.mm.plugin.remittance.ui.RemittanceJsapiConfirmEvent().b(getContext().getMainLooper());
                        }
                    }
                    z18 = true;
                }
            }
        }
        android.content.Intent intent14 = new android.content.Intent();
        intent14.putExtra("closeWebView", (java.lang.String) ((java.util.HashMap) this.f181120f).get("closeWebView"));
        setResult(-1, intent14);
        if (z18) {
            finish();
        }
    }

    public final void W6() {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this);
        u1Var.g(getString(com.tencent.mm.R.string.i0_));
        u1Var.k(getResources().getColor(com.tencent.mm.R.color.aaq));
        u1Var.m(com.tencent.mm.R.string.f492294fz1);
        u1Var.l(new com.tencent.mm.plugin.wallet_index.ui.f0(this));
        u1Var.q(false);
    }

    public final void X6(android.content.Intent intent) {
        if (intent == null) {
            intent = new android.content.Intent();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenViewProxyUI", "start LQTDetail");
        if (((h45.q) i95.n0.c(h45.q.class)).startLqtDetailUseCaseInMMProcess(getContext())) {
            return;
        }
        j45.l.j(getContext(), "wallet", ".balance.ui.lqt.WalletLqtDetailUI", intent, null);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 563) {
            if (i18 == -1) {
                java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenViewProxyUI", "select chatroom：%s", stringExtra);
                java.lang.String str = (java.lang.String) ((java.util.HashMap) this.f181120f).get("amount");
                java.lang.String str2 = (java.lang.String) ((java.util.HashMap) this.f181120f).get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("amount", str);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    str2 = java.net.URLDecoder.decode(str2);
                    intent2.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str2);
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    intent2.putExtra("chatroom_name", stringExtra);
                }
                intent2.putExtra("enter_scene", 5);
                j45.l.j(getContext(), "aa", ".ui.LaunchAAUI", intent2, null);
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenViewProxyUI", "view open grouppay, amount: %s, title: %s", str, str2);
            }
            finish();
        }
        super.onActivityResult(i17, i18, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(580);
        removeSceneEndListener(385);
        removeSceneEndListener(2996);
        removeSceneEndListener(1477);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenViewProxyUI", "onSceneEnd, errType: %s, errCode: %s, errMsg: %s, scene: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, m1Var);
        if (i17 != 0 || i18 != 0) {
            setResult(0);
            finish();
            return true;
        }
        if (m1Var instanceof ss4.d) {
            h45.y.f278968a = ((ss4.d) m1Var).H();
            V6(getIntent().getStringExtra("packageExt"));
            return true;
        }
        if (m1Var instanceof ss4.a0) {
            V6(getIntent().getStringExtra("packageExt"));
            return true;
        }
        if (!(m1Var instanceof com.tencent.mm.plugin.wallet.balance.model.lqt.f3)) {
            if (m1Var instanceof gs4.h) {
                this.f181119e = ((gs4.h) m1Var).H();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_HB_REFUND_CONFIG_REFACTOR_STRING_SYNC, this.f181119e.b());
                V6(getIntent().getStringExtra("packageExt"));
            }
            return false;
        }
        r45.p15 p15Var = ((com.tencent.mm.plugin.wallet.balance.model.lqt.f3) m1Var).f177632d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenViewProxyUI", "on open lqb account scene end, retcode: %s, regmsg: %s", java.lang.Integer.valueOf(p15Var.f382661d), p15Var.f382662e);
        r45.ce4 ce4Var = p15Var.f382663f;
        if (ce4Var != null) {
            this.f181118d.a(ce4Var, null);
        }
        if (p15Var.f382661d == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_account_type", 2);
            X6(intent);
            setResult(-1);
        } else if (p15Var.f382663f == null) {
            dp.a.makeText(this, p15Var.f382662e, 1).show();
            setResult(0);
        }
        finish();
        return true;
    }
}
