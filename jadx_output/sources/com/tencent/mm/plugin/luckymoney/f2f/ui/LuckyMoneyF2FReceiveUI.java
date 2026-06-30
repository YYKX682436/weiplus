package com.tencent.mm.plugin.luckymoney.f2f.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class LuckyMoneyF2FReceiveUI extends com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI {

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f145095g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f145096h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f145097i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f145098m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f145099n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f145100o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f145101p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f145102q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f145103r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f145104s;

    /* renamed from: t, reason: collision with root package name */
    public int f145105t;

    /* renamed from: u, reason: collision with root package name */
    public android.util.DisplayMetrics f145106u;

    /* renamed from: v, reason: collision with root package name */
    public android.animation.ValueAnimator f145107v;

    /* renamed from: w, reason: collision with root package name */
    public android.animation.ValueAnimator f145108w;

    /* renamed from: x, reason: collision with root package name */
    public android.content.Intent f145109x;

    /* renamed from: y, reason: collision with root package name */
    public long f145110y = 0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f145111z = false;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bug;
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f145095g = findViewById(com.tencent.mm.R.id.f485814j63);
        this.f145096h = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.j67);
        this.f145097i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j68);
        this.f145098m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j6_);
        ((android.widget.ImageView) findViewById(com.tencent.mm.R.id.j6f)).setOnClickListener(new ub3.v(this));
        android.view.View contentView = getContentView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FReceiveUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FReceiveUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f145099n = getIntent().getStringExtra("key_share_url");
        at4.g0.e(6);
        doSceneProgress(new tb3.c(this.f145099n, null), true);
        this.f145106u = getResources().getDisplayMetrics();
        this.f145107v = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.f145108w = duration;
        duration.setStartDelay(1000L);
        this.f145107v.addUpdateListener(new ub3.w(this));
        this.f145107v.addListener(new ub3.x(this));
        this.f145108w.addListener(new ub3.y(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        addSceneEndListener(1997);
        if (this.f145111z) {
            finish();
        }
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("LuckyMoneyF2FReceiveUI", "errType: %d,errCode: %d,errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (!(m1Var instanceof tb3.c)) {
            return true;
        }
        tb3.c cVar = (tb3.c) m1Var;
        int i19 = cVar.f416989h;
        int i27 = cVar.f416991m;
        this.f145105t = cVar.f416993o;
        int i28 = cVar.f416995q;
        java.lang.String str2 = cVar.f416996r;
        java.lang.String str3 = cVar.f416997s;
        com.tencent.mars.xlog.Log.i("LuckyMoneyF2FReceiveUI", "hbStatus: %d, recvStatus:%d, errorType:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(cVar.f416991m), java.lang.Integer.valueOf(cVar.f416990i));
        if (com.tencent.mm.plugin.wallet_core.utils.l0.e(cVar.f416987f.f392235w)) {
            new com.tencent.mm.plugin.wallet_core.utils.l0(this).c(cVar.f416987f.f392235w, new ub3.z(this, cVar));
            return true;
        }
        com.tencent.mm.protobuf.g gVar = cVar.f416987f.f392237y;
        if (gVar != null && gVar.f192156a.length > 0) {
            java.lang.String i29 = gVar.i();
            if (this.f145110y != 0) {
                com.tencent.mars.xlog.Log.e("LuckyMoneyF2FReceiveUI", "last compliance usecase wast not stopped as expected!");
            }
            java.lang.Long a17 = com.tencent.mm.plugin.wallet_core.utils.a0.f180849a.a(i29, new ub3.a0(this, cVar.f417002x));
            this.f145110y = a17 != null ? a17.longValue() : 0L;
            return true;
        }
        com.tencent.mars.xlog.Log.w("HABBYGE-MALI", "recvStatus=%s, hbStatus=%s", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i19));
        if (i27 != 2) {
            if (cVar.f416994p != null) {
                com.tencent.mars.xlog.Log.i("LuckyMoneyF2FReceiveUI", "need real name verify");
                r45.lj5 lj5Var = cVar.f416994p;
                com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = new com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper();
                realnameGuideHelper.d(java.lang.String.valueOf(lj5Var.f379523d), lj5Var.f379524e, lj5Var.f379525f, lj5Var.f379526g, lj5Var.f379527h, m1Var.getType());
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".f2f.ui.LuckyMoneyF2FReceiveUI");
                bundle.putString("realname_verify_process_jump_plugin", "luckymoney");
                if (realnameGuideHelper.b(this, bundle, new ub3.c0(this, cVar), new ub3.d0(this), false)) {
                    this.f145111z = true;
                    return true;
                }
            }
            db5.e1.t(this, com.tencent.mm.sdk.platformtools.t8.K0(str) ? getString(com.tencent.mm.R.string.gkz) : str, "", new ub3.u(this));
            return true;
        }
        if (i19 == 5) {
            db5.e1.t(this, getString(com.tencent.mm.R.string.gku), "", new ub3.b0(this));
        } else {
            this.f145100o = cVar.f416988g;
            this.f145101p = cVar.f416992n;
            this.f145102q = cVar.f417000v;
            this.f145103r = cVar.f417001w;
            this.f145104s = cVar.f416998t;
            this.f145109x = new android.content.Intent();
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f145102q)) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f145101p) && !c01.e2.J(this.f145101p)) {
                    com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
                    r0Var.f70529a = this.f145101p;
                    ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    com.tencent.mm.modelavatar.d1.Ni().y0(r0Var);
                }
                com.tencent.mm.plugin.luckymoney.model.m5.b(this.f145096h, null, this.f145101p);
            } else {
                int d17 = com.tencent.mm.sdk.platformtools.j.d(this, 48.0f);
                this.f145096h.setRoundCorner(true);
                this.f145096h.b(this.f145102q, d17, d17, com.tencent.mm.R.drawable.bhn);
            }
            com.tencent.mm.plugin.luckymoney.model.e1 e1Var = new com.tencent.mm.plugin.luckymoney.model.e1();
            e1Var.f145245q = this.f145105t;
            e1Var.f145241n = this.f145100o;
            e1Var.f145235e = i19;
            e1Var.A = i27;
            e1Var.E = str3;
            e1Var.D = i28;
            e1Var.Q = this.f145101p;
            e1Var.N = str2;
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f145103r)) {
                e1Var.f145239i = com.tencent.mm.plugin.luckymoney.model.m5.m(this.f145101p);
            } else {
                e1Var.f145239i = this.f145103r;
            }
            e1Var.L = this.f145104s;
            e1Var.f145234d = 2;
            com.tencent.mars.xlog.Log.i("LuckyMoneyF2FReceiveUI", "is most lucky %d", java.lang.Integer.valueOf(cVar.f416999u));
            if (cVar.f416999u > 0) {
                e1Var.f145237g = getString(com.tencent.mm.R.string.gln);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f145102q)) {
                e1Var.f145240m = com.tencent.mm.plugin.luckymoney.model.m5.j(this.f145101p);
            } else {
                e1Var.f145240m = this.f145102q;
            }
            try {
                this.f145109x.putExtra("key_detail_info", e1Var.toByteArray());
                r45.lj5 lj5Var2 = cVar.f416994p;
                if (lj5Var2 != null) {
                    com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper2 = new com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper();
                    realnameGuideHelper2.d(java.lang.String.valueOf(lj5Var2.f379523d), lj5Var2.f379524e, lj5Var2.f379525f, lj5Var2.f379526g, lj5Var2.f379527h, m1Var.getType());
                    this.f145109x.putExtra("key_realname_guide_helper", realnameGuideHelper2);
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("LuckyMoneyF2FReceiveUI", "lucky detail toBytes error: " + e17.getMessage());
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f145103r)) {
                com.tencent.mm.plugin.luckymoney.model.m5.E(this, this.f145097i, this.f145103r);
            } else if (!com.tencent.mm.sdk.platformtools.t8.N0(this.f145100o, this.f145101p)) {
                com.tencent.mm.plugin.luckymoney.model.m5.E(this, this.f145097i, com.tencent.mm.plugin.luckymoney.model.m5.m(this.f145101p));
            }
            com.tencent.mm.plugin.luckymoney.model.m5.E(this, this.f145098m, this.f145104s);
            this.f145107v.start();
            android.view.View contentView = getContentView();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FReceiveUI", "showRedPacket", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(contentView, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FReceiveUI", "showRedPacket", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        removeSceneEndListener(1997);
    }
}
