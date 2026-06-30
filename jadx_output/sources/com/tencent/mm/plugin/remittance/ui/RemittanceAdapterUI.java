package com.tencent.mm.plugin.remittance.ui;

@db5.a(7)
/* loaded from: classes9.dex */
public class RemittanceAdapterUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f157117u = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f157118d;

    /* renamed from: f, reason: collision with root package name */
    public int f157120f;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f157126o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f157127p;

    /* renamed from: q, reason: collision with root package name */
    public int f157128q;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f157119e = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f157121g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f157122h = false;

    /* renamed from: i, reason: collision with root package name */
    public nr4.a f157123i = null;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f157124m = null;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f157125n = null;

    /* renamed from: r, reason: collision with root package name */
    public int f157129r = 0;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f157130s = "";

    /* renamed from: t, reason: collision with root package name */
    public long f157131t = 0;

    public final void U6(com.tencent.mm.plugin.remittance.model.r0 r0Var) {
        java.lang.String str = r0Var.f157002u;
        java.lang.String str2 = r0Var.f156988d;
        this.f157119e = str2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) && com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            finish();
            return;
        }
        if (this.f157118d == 1) {
            if (r0Var.f156992h == 33) {
                nr4.a c17 = nr4.a.c(this.f157119e, 2);
                this.f157123i = c17;
                c17.a(20, getIntent().getStringExtra("receiver_name"));
            } else {
                nr4.a c18 = nr4.a.c(this.f157119e, 3);
                this.f157123i = c18;
                c18.a(10, getIntent().getStringExtra("receiver_name"));
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("fee", r0Var.f156990f);
        intent.putExtra("desc", r0Var.f156991g);
        intent.putExtra("scan_remittance_id", r0Var.f156993i);
        intent.putExtra("receiver_true_name", com.tencent.mm.wallet_core.ui.r1.y(r0Var.f156989e));
        intent.putExtra("receiver_true_name_busi", r0Var.f157006y);
        intent.putExtra("receiver_tips", r0Var.f156994m);
        intent.putExtra("rcvr_new_desc", r0Var.f156995n);
        intent.putExtra("payer_desc", r0Var.f156996o);
        intent.putExtra("rcvr_open_id", r0Var.f157002u);
        intent.putExtra("mch_name", r0Var.f156999r);
        intent.putExtra("mch_info", r0Var.f157005x);
        intent.putExtra("mch_photo", r0Var.f157000s);
        intent.putExtra("mch_type", r0Var.f157003v);
        intent.putExtra("mch_time", r0Var.f157001t);
        intent.putExtra("amount_remind_bit", r0Var.f157007z);
        intent.putExtra("payer_desc_required", r0Var.G);
        intent.putExtra("payer_desc_placeholder", r0Var.H);
        int i17 = r0Var.f156998q;
        if (i17 == 1) {
            intent.putExtra("busi_type", i17);
            intent.putExtra("rcvr_ticket", r0Var.f156997p);
            intent.putExtra("rcvr_open_id", r0Var.f157002u);
            intent.putExtra("get_pay_wifi", r0Var.f157004w);
            com.tencent.mm.plugin.remittance.model.BusiRemittanceResp busiRemittanceResp = r0Var.F;
            if (busiRemittanceResp != null) {
                intent.putExtra("BusiRemittanceResp", busiRemittanceResp);
            }
        }
        if (this.f157120f == 56) {
            intent.putExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, this.f157124m);
        }
        gm0.j1.i();
        com.tencent.mm.storage.z3 f07 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(this.f157119e);
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        java.lang.String str3 = this.f157119e;
        ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
        com.tencent.mm.modelavatar.g.f(str3, 3);
        if (f07 != null || this.f157119e.equals("")) {
            W6(this.f157119e, r0Var.f156992h, intent);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((c01.k7) c01.n8.a()).b(this.f157119e, 4, new com.tencent.mm.plugin.remittance.ui.j0(this, currentTimeMillis, r0Var, intent));
    }

    public final void V6(java.lang.String str) {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getContext());
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = getContext().getString(com.tencent.mm.R.string.l0g);
        }
        u1Var.g(str);
        u1Var.l(new com.tencent.mm.plugin.remittance.ui.i0(this));
        u1Var.n(getContext().getString(com.tencent.mm.R.string.ke6));
        u1Var.q(false);
    }

    public void W6(java.lang.String str, int i17, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceAdapterUI", "startRemittanceUI scene=" + this.f157118d + ", name=" + str + " payScene: " + i17);
        android.content.Intent intent2 = intent != null ? new android.content.Intent(intent) : new android.content.Intent();
        nr4.a.e(this.f157123i, intent2);
        int intExtra = intent2.getIntExtra("busi_type", 0);
        if (intExtra == 1) {
            intent2.setClass(this, com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI.class);
            intent2.putExtra("chat_type", getIntent().getIntExtra("chat_type", 0));
            intent2.putExtra("send_type", getIntent().getIntExtra("send_type", 0));
        } else {
            intent2.setClass(this, com.tencent.mm.plugin.remittance.ui.RemittanceUI.class);
        }
        intent2.putExtra("receiver_name", str);
        intent2.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f157118d);
        intent2.putExtra("pay_scene", i17);
        intent2.putExtra("pay_channel", this.f157120f);
        intent2.putExtra("qq_extend_info", this.f157121g);
        intent2.putExtra("qrcode_sender_username", getIntent().getStringExtra("qrcode_sender_username"));
        intent2.putExtra("msg_svr_id", java.lang.String.valueOf(this.f157131t));
        java.lang.String stringExtra = getIntent().getStringExtra("payInitRawUrl");
        long longExtra = getIntent().getLongExtra("payInitTimestamp", 0L);
        java.lang.String stringExtra2 = getIntent().getStringExtra("receiver_name");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        intent2.putExtra("payInitRawUrl", stringExtra == null ? "" : stringExtra);
        intent2.putExtra("payInitTimestamp", longExtra);
        intent2.putExtra("qrcode_url", stringExtra2 != null ? stringExtra2 : "");
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceAdapterUI", "startRemittanceUI initRawUrl: %s, qrcodeUrl: %s, initTimestamp: %d", stringExtra, stringExtra2, java.lang.Long.valueOf(longExtra));
        if (intExtra != 1) {
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceAdapterUI", "startRemittanceUI", "(Ljava/lang/String;ILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/remittance/ui/RemittanceAdapterUI", "startRemittanceUI", "(Ljava/lang/String;ILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        setResult(-1);
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 16) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        if (i18 != -1) {
            finish();
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceAdapterUI", "select user: %s", stringExtra);
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            finish();
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_group_name", this.f157119e);
        W6(stringExtra, 31, intent2);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f157122h) {
            return;
        }
        finish();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.wallet_core.h process;
        super.onCreate(bundle);
        setContentViewVisibility(8);
        this.f157118d = getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        this.f157119e = getIntent().getStringExtra("receiver_name");
        this.f157120f = getIntent().getIntExtra("pay_channel", -1);
        this.f157121g = getIntent().getStringExtra("qq_extend_info");
        this.f157123i = nr4.a.d(getIntent());
        this.f157125n = getIntent().getStringExtra("qrcodeUrl");
        this.f157128q = getIntent().getIntExtra("ScanScene", 0);
        this.f157126o = getIntent().getStringExtra("qrcode_sender_username");
        this.f157127p = getIntent().getStringExtra("stat_send_msg_user");
        this.f157129r = getIntent().getIntExtra("qrcodeSessionType", 0);
        this.f157130s = getIntent().getStringExtra("qrcodeSessionName");
        java.lang.String stringExtra = getIntent().getStringExtra("msg_svr_id");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            try {
                this.f157131t = com.tencent.mm.sdk.platformtools.t8.E1(stringExtra.replaceAll("[^\\d]", ""));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RemittanceAdapterUI", e17, "", new java.lang.Object[0]);
            }
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("payInitRawUrl");
        long longExtra = getIntent().getLongExtra("payInitTimestamp", 0L);
        if (longExtra == 0) {
            longExtra = c01.id.a() / 1000;
        }
        getIntent().putExtra("payInitRawUrl", stringExtra2 != null ? stringExtra2 : "");
        getIntent().putExtra("payInitTimestamp", longExtra);
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceAdapterUI", "onCreate initRawUrl: %s, initTimestamp: %d", stringExtra2, java.lang.Long.valueOf(longExtra));
        int i17 = this.f157120f;
        if (i17 == 56) {
            this.f157124m = this.f157123i.f339339a;
        }
        if (i17 == -1 && (process = getProcess()) != null) {
            this.f157120f = process.f213801c.getInt("pay_channel", -1);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceAdapterUI", "ScanScene:%s，mChannel: %s，mScene：%s，mQrcodeUrl：%s", java.lang.Integer.valueOf(this.f157128q), java.lang.Integer.valueOf(this.f157120f), java.lang.Integer.valueOf(this.f157118d), this.f157125n);
        if (this.f157120f < 0) {
            this.f157120f = 0;
        }
        int i18 = this.f157118d;
        if (i18 == 1) {
            this.f157122h = true;
            com.tencent.mm.plugin.remittance.model.r0 r0Var = new com.tencent.mm.plugin.remittance.model.r0(this.f157119e, this.f157120f, this.f157121g, this.f157126o, this.f157131t, this.f157130s, this.f157129r, this.f157127p);
            r0Var.setProcessName("RemittanceProcess");
            doSceneProgress(r0Var, true);
            return;
        }
        if (i18 == 7) {
            this.f157122h = true;
            addSceneEndListener(4708);
            com.tencent.mm.plugin.remittance.model.c0 c0Var = new com.tencent.mm.plugin.remittance.model.c0(this.f157125n, this.f157128q, this.f157120f, this.f157126o, this.f157131t, this.f157130s, this.f157129r);
            c0Var.setProcessName("MerchantPay");
            doSceneProgress(c0Var, true);
            return;
        }
        if (i18 == 3) {
            addSceneEndListener(580);
            if (getIntent() == null) {
                setResult(0);
                finish();
                return;
            } else {
                ss4.d dVar = new ss4.d(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), 3, "getTransferMoneyRequest", getIntent().getIntExtra("pay_channel", 0));
                dVar.setProcessName("RemittanceProcess");
                doSceneForceProgress(dVar);
                return;
            }
        }
        if (i18 == 2) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f157119e)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.RemittanceAdapterUI", "Username empty & finish. scene=" + this.f157118d);
                finish();
                return;
            }
            if (!com.tencent.mm.storage.z3.R4(this.f157119e)) {
                W6(this.f157119e, 31, null);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceAdapterUI", "do select a contact: %s", this.f157119e);
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyExclusiveSelectContactUI.class);
            intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 31);
            intent.putExtra("chatroomName", this.f157119e);
            intent.putExtra("key_title", getString(com.tencent.mm.R.string.i1d));
            intent.putExtra("key_same_name_tips", getString(com.tencent.mm.R.string.i1c));
            startActivityForResult(intent, 16);
            return;
        }
        if (i18 != 5 && i18 != 6) {
            W6(null, 31, null);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f157119e)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RemittanceAdapterUI", "Username empty & finish. scene=" + this.f157118d);
            finish();
            return;
        }
        java.lang.String str = this.f157119e;
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceAdapterUI", "startRemittanceUI scene=" + this.f157118d + ", name=" + str);
        android.content.Intent intent2 = new android.content.Intent();
        nr4.a.e(this.f157123i, intent2);
        intent2.setClass(this, com.tencent.mm.plugin.remittance.ui.RemittanceOSRedirect.class);
        intent2.putExtra("receiver_name", str);
        intent2.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f157118d);
        intent2.putExtra("pay_scene", 31);
        intent2.putExtra("pay_channel", this.f157120f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceAdapterUI", "startRemittanceOSUI", "(Ljava/lang/String;ILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/remittance/ui/RemittanceAdapterUI", "startRemittanceOSUI", "(Ljava/lang/String;ILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        setResult(-1);
        finish();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        if (this.f157118d == 3) {
            removeSceneEndListener(580);
        }
        if (this.f157118d == 7) {
            removeSceneEndListener(4708);
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17 = m1Var instanceof com.tencent.mm.plugin.remittance.model.r0;
        if (z17) {
            this.f157122h = false;
        }
        if (i17 != 0 || i18 != 0) {
            setResult(0);
            V6(str);
            return true;
        }
        if (z17) {
            com.tencent.mm.plugin.remittance.model.r0 r0Var = (com.tencent.mm.plugin.remittance.model.r0) m1Var;
            if (this.f157118d == 1) {
                int i19 = r0Var.B;
                if (i19 == 0 && r0Var.A == 1) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", r0Var.C);
                    com.tencent.mm.wallet_core.ui.r1.T(this, intent);
                    finish();
                    return true;
                }
                if (i19 == 0 && r0Var.A == 2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceAdapterUI", "WPHK handle action_type 2");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(r0Var.D)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceAdapterUI", "handle action_type 2 jump_route_info is null");
                    } else {
                        try {
                            byte[] decode = android.util.Base64.decode(r0Var.D, 0);
                            if (decode.length != 0) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceAdapterUI", "WPHK handle action_type 2, goto kinda common route");
                                com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                                create.putBinary("route_info", decode);
                                ((h45.q) i95.n0.c(h45.q.class)).startUseCase("commonRoute", create, new com.tencent.mm.plugin.remittance.ui.e0(this));
                                return true;
                            }
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RemittanceAdapterUI", e17, "handle action_type 2 catch exception", new java.lang.Object[0]);
                        }
                    }
                }
            }
            if (!com.tencent.mm.plugin.wallet_core.utils.l0.d(r0Var.E)) {
                U6(r0Var);
                return true;
            }
            com.tencent.mm.plugin.wallet_core.utils.l0 l0Var = new com.tencent.mm.plugin.wallet_core.utils.l0(this);
            l0Var.b(r0Var.E, new com.tencent.mm.plugin.remittance.ui.f0(this, r0Var, l0Var));
            return true;
        }
        if (m1Var instanceof ss4.d) {
            h45.y.f278968a = ((ss4.d) m1Var).H();
            W6(null, 31, null);
            return true;
        }
        if (!(m1Var instanceof com.tencent.mm.plugin.remittance.model.c0)) {
            return false;
        }
        com.tencent.mm.plugin.remittance.model.c0 c0Var = (com.tencent.mm.plugin.remittance.model.c0) m1Var;
        r45.al4 al4Var = c0Var.f156799f;
        if (al4Var.f370093d != 0) {
            V6(al4Var.f370094e);
        } else {
            if (com.tencent.mm.plugin.wallet_core.utils.l0.e(al4Var.f370101o)) {
                com.tencent.mm.plugin.wallet_core.utils.l0 l0Var2 = new com.tencent.mm.plugin.wallet_core.utils.l0(this);
                l0Var2.c(c0Var.f156799f.f370101o, new com.tencent.mm.plugin.remittance.ui.g0(this, l0Var2));
                return true;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(c0Var.f156799f.f370095f)) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("rawUrl", c0Var.f156799f.f370095f);
                intent2.putExtra("pay_channel", this.f157120f);
                intent2.putExtra("pay_chat_type", getIntent().getIntExtra("chat_type", 0));
                intent2.putExtra("pay_send_type", getIntent().getIntExtra("send_type", 0));
                intent2.putExtra("pay_qrcode_session_type", getIntent().getIntExtra("qrcodeSessionType", 0));
                intent2.putExtra("pay_qrcode_session_name", getIntent().getStringExtra("qrcodeSessionName"));
                intent2.putExtra("pay_qrcode_timeline_objid", getIntent().getStringExtra("qrcodeTimelineObjId"));
                com.tencent.mm.wallet_core.ui.r1.T(this, intent2);
                finish();
                return true;
            }
            r45.al4 al4Var2 = c0Var.f156799f;
            if (al4Var2.f370107u) {
                java.lang.String str2 = al4Var2.f370108v;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    try {
                        byte[] decode2 = android.util.Base64.decode(str2, 0);
                        if (decode2.length != 0) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceAdapterUI", "WPHK handle NetSceneMerchantPayGetQRCodeInfo, goto kinda common route");
                            com.tencent.kinda.gen.ITransmitKvData create2 = com.tencent.kinda.gen.ITransmitKvData.create();
                            create2.putBinary("route_info", decode2);
                            ((h45.q) i95.n0.c(h45.q.class)).startUseCase("commonRoute", create2, new com.tencent.mm.plugin.remittance.ui.h0(this));
                            return true;
                        }
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RemittanceAdapterUI", e18, "handle NetSceneMerchantPayGetQRCodeInfo catch exception", new java.lang.Object[0]);
                    }
                }
            }
            r45.al4 al4Var3 = c0Var.f156799f;
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("payScene", 73);
            intent3.putExtra("payChannel", this.f157120f);
            intent3.putExtra("shopName", al4Var3.f370096g);
            intent3.putExtra("shopHeadImgURL", al4Var3.f370097h);
            intent3.putExtra("scanId", al4Var3.f370098i);
            intent3.putExtra("shopAdName", al4Var3.f370099m);
            intent3.putExtra("shopAddress", al4Var3.f370100n);
            intent3.putExtra("amountBit", al4Var3.f370102p);
            intent3.putExtra("key_shop_amount", al4Var3.f370103q);
            intent3.putExtra("key_shop_desc", al4Var3.f370104r);
            intent3.putExtra("qrcodeUrl", this.f157125n);
            intent3.putExtra("chat_type", getIntent().getIntExtra("chat_type", 0));
            intent3.putExtra("send_type", getIntent().getIntExtra("send_type", 0));
            intent3.putExtra("qrcodeSessionType", getIntent().getIntExtra("qrcodeSessionType", 0));
            intent3.putExtra("qrcodeSessionName", getIntent().getStringExtra("qrcodeSessionName"));
            intent3.putExtra("qrcodeTimelineObjId", getIntent().getStringExtra("qrcodeTimelineObjId"));
            intent3.putExtra("qrcode_sender_username", this.f157126o);
            intent3.putExtra("msg_svr_id", java.lang.String.valueOf(this.f157131t));
            intent3.putExtra("merchantPayPayerDescRequired", al4Var3.f370105s);
            intent3.putExtra("merchantPayPayerDescPlaceholder", al4Var3.f370106t);
            android.content.Intent intent4 = new android.content.Intent(intent3);
            java.lang.String stringExtra = getIntent().getStringExtra("payInitRawUrl");
            long longExtra = getIntent().getLongExtra("payInitTimestamp", 0L);
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            intent4.putExtra("payInitRawUrl", stringExtra == null ? "" : stringExtra);
            intent4.putExtra("payInitTimestamp", longExtra);
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceAdapterUI", "startMerchantPayUI initRawUrl: %s, initTimestamp: %d", stringExtra, java.lang.Long.valueOf(longExtra));
            intent4.setClass(this, com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceAdapterUI", "startMerchantPayUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/remittance/ui/RemittanceAdapterUI", "startMerchantPayUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            setResult(-1);
            finish();
        }
        return true;
    }
}
