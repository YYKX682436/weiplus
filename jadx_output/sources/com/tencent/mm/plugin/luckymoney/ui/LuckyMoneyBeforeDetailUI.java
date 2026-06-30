package com.tencent.mm.plugin.luckymoney.ui;

@db5.a(7)
/* loaded from: classes9.dex */
public class LuckyMoneyBeforeDetailUI extends com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f145975u = 0;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Dialog f145976g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f145977h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f145978i;

    /* renamed from: m, reason: collision with root package name */
    public int f145979m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f145980n;

    /* renamed from: o, reason: collision with root package name */
    public cc3.b f145981o;

    /* renamed from: p, reason: collision with root package name */
    public int f145982p;

    /* renamed from: q, reason: collision with root package name */
    public int f145983q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f145984r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f145985s;

    /* renamed from: t, reason: collision with root package name */
    public int f145986t;

    public final void V6() {
        com.tencent.mm.plugin.luckymoney.model.e1 a17;
        com.tencent.mm.plugin.luckymoney.model.q6 a18;
        r45.wv3 wv3Var;
        boolean booleanExtra = getIntent().getBooleanExtra("key_has_story", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBeforeDetailUI", "try fetch story info : %s", java.lang.Boolean.valueOf(booleanExtra));
        if (!booleanExtra) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBeforeDetailUI", "no story, don't fetch data");
            W6(false);
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("key_packet_id");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && (a17 = gb3.l.a(this.f145977h)) != null && (a18 = com.tencent.mm.plugin.luckymoney.model.q6.a(a17.T)) != null && (wv3Var = a18.f145565b) != null) {
            stringExtra = wv3Var.f389500f;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBeforeDetailUI", "no packet id");
            W6(false);
            return;
        }
        dc3.a aVar = new dc3.a();
        aVar.field_packet_id = stringExtra;
        boolean z17 = hb3.o.Ni().Vi().get(aVar, new java.lang.String[0]);
        long j17 = aVar.field_update_time;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBeforeDetailUI", "has story info: %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j17));
        if (java.lang.System.currentTimeMillis() - j17 > 86400000) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyBeforeDetailUI", "need refetch story");
            z17 = false;
        }
        if (z17) {
            r45.nm5 t07 = dc3.a.t0(aVar);
            t07.f381503i.addAll(hb3.o.Ni().aj().y0(stringExtra));
            ((java.util.HashMap) gb3.l.f270018b).put(stringExtra, t07);
            W6(false);
            return;
        }
        if (this.f145976g == null) {
            this.f145976g = db5.e1.O(getContext(), null, 3, com.tencent.mm.R.style.f494256i6, getString(com.tencent.mm.R.string.ggc), true, true, new com.tencent.mm.plugin.luckymoney.ui.m(this));
        }
        cc3.b bVar = new cc3.b();
        this.f145981o = bVar;
        bVar.f213885c = new cc3.a(stringExtra, true, this.f145980n);
        this.f145981o.c(new com.tencent.mm.plugin.luckymoney.ui.n(this, stringExtra), true);
    }

    public final void W6(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBeforeDetailUI", "go to detail ui");
        android.app.Dialog dialog = this.f145976g;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.tencent.mm.plugin.luckymoney.ui.p pVar = new com.tencent.mm.plugin.luckymoney.ui.p(this);
        if (z17) {
            com.tencent.mm.sdk.platformtools.u3.i(pVar, 100L);
        } else {
            pVar.run();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.modelbase.m1 w5Var;
        com.tencent.mm.plugin.luckymoney.model.e1 e1Var;
        super.onCreate(bundle);
        overridePendingTransition(0, com.tencent.mm.R.anim.f477867dq);
        com.tencent.mm.ui.bk.p0(this, getResources().getColor(com.tencent.mm.R.color.a9e));
        setContentViewVisibility(8);
        this.f145977h = getIntent().getStringExtra("key_sendid");
        this.f145978i = getIntent().getStringExtra("key_receiveid");
        this.f145979m = getIntent().getIntExtra("scene_id", 0);
        getIntent().getStringExtra("key_username");
        this.f145980n = getIntent().getStringExtra("key_from_username");
        this.f145982p = getIntent().getIntExtra("key_hb_kind", 1);
        this.f145983q = getIntent().getIntExtra("key_from", 0);
        this.f145984r = getIntent().getStringExtra("key_live_id");
        this.f145985s = getIntent().getStringExtra("key_live_attach");
        this.f145986t = getIntent().getIntExtra("key_live_anchor_type", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("key_native_url");
        int intExtra = getIntent().getIntExtra("key_jump_from", 2);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBeforeDetailUI", "[onCreate] mFromScene: %s ，mJumpFrom：%s ,mSendId:%s ", java.lang.Integer.valueOf(this.f145983q), java.lang.Integer.valueOf(intExtra), this.f145977h);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBeforeDetailUI", "[onCreate] mNativeUrl : %s", stringExtra);
        if (intExtra == 2) {
            if (gb3.l.a(this.f145977h) != null) {
                V6();
                return;
            }
            try {
                byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_detail_info");
                if (byteArrayExtra != null && (e1Var = (com.tencent.mm.plugin.luckymoney.model.e1) new com.tencent.mm.plugin.luckymoney.model.e1().parseFrom(byteArrayExtra)) != null) {
                    gb3.l.b(this.f145977h, e1Var);
                    V6();
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyBeforeDetailUI", "Parse LuckyMoneyDetail fail!" + e17.getLocalizedMessage());
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f145977h) && !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            try {
                this.f145977h = android.net.Uri.parse(stringExtra).getQueryParameter("sendid");
            } catch (java.lang.Exception unused) {
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f145977h)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyBeforeDetailUI", "sendid null or nil, finish");
            finish();
            return;
        }
        java.lang.String str = this.f145977h;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBeforeDetailUI", "get recordList");
        this.f145976g = db5.e1.O(getContext(), null, 3, com.tencent.mm.R.style.f494256i6, getString(com.tencent.mm.R.string.ggc), true, true, new com.tencent.mm.plugin.luckymoney.ui.q(this));
        int i17 = this.f145979m;
        if (i17 != 0) {
            w5Var = com.tencent.mm.plugin.luckymoney.model.m5.t(i17) ? new com.tencent.mm.plugin.luckymoney.model.w5(str, 11, 0, stringExtra, "v1.0", "") : this.f145983q == 3 ? new yb3.d(str, 11, 0, stringExtra, "v1.0", "", this.f145984r, this.f145985s, this.f145986t) : new com.tencent.mm.plugin.luckymoney.model.v5(str, 11, 0, stringExtra, "v1.0", "", this.f145978i);
        } else {
            int i18 = this.f145982p;
            w5Var = i18 == 5 ? new com.tencent.mm.plugin.luckymoney.model.w5(str, 11, 0, stringExtra, "v1.0", "") : (this.f145983q == 3 || i18 == 7) ? new yb3.d(str, 11, 0, stringExtra, "v1.0", "", this.f145984r, this.f145985s, this.f145986t) : new com.tencent.mm.plugin.luckymoney.model.v5(str, 11, 0, stringExtra, "v1.0", "", this.f145978i);
        }
        doSceneProgress(w5Var, false);
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyBeforeDetailUI", "onSceneEnd() errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " netsceneType:" + m1Var.getType());
        if (!(m1Var instanceof com.tencent.mm.plugin.luckymoney.model.v5)) {
            return false;
        }
        if (i17 != 0 || i18 != 0) {
            db5.e1.T(this, str);
            finish();
            return true;
        }
        com.tencent.mm.plugin.luckymoney.model.v5 v5Var = (com.tencent.mm.plugin.luckymoney.model.v5) m1Var;
        gb3.l.b(this.f145977h, v5Var.f145665h);
        getIntent().putExtra("key_process_content", v5Var.f145666i);
        getIntent().putExtra("key_detail_emoji_md5", v5Var.f145667m);
        getIntent().putExtra("key_detail_emoji_type", v5Var.f145668n);
        getIntent().putExtra("key_emoji_switch", v5Var.f145669o);
        com.tencent.mm.plugin.luckymoney.model.e1 e1Var = v5Var.f145665h;
        if (e1Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(e1Var.Q)) {
            this.f145980n = v5Var.f145665h.Q;
        }
        V6();
        return true;
    }
}
