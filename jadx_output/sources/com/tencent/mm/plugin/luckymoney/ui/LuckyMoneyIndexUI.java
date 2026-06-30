package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class LuckyMoneyIndexUI extends com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI {

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f146140g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f146141h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f146142i;

    /* renamed from: m, reason: collision with root package name */
    public int f146143m;

    public static void V6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI luckyMoneyIndexUI, int i17) {
        luckyMoneyIndexUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).bj();
        intent.setClass(luckyMoneyIndexUI.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.class);
        intent.putExtra("key_way", 3);
        intent.putExtra("key_type", i17);
        intent.putExtra("pay_channel", luckyMoneyIndexUI.f146143m);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(luckyMoneyIndexUI, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyIndexUI", "goPrepareLuckmoney", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyIndexUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(luckyMoneyIndexUI, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyIndexUI", "goPrepareLuckmoney", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void W6() {
        java.lang.String stringExtra = getIntent().getStringExtra("key_username");
        java.util.HashMap hashMap = com.tencent.mm.plugin.luckymoney.model.m5.f145452a;
        com.tencent.mm.plugin.luckymoney.model.c1 a17 = c01.e2.S(stringExtra) ? hb3.o.Ni().Di().a() : hb3.o.Ni().wi().a();
        if (a17 == null) {
            return;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.j2d);
        if ((a17.f145189n & 1) != 1) {
            imageView.setImageResource(com.tencent.mm.R.drawable.c_q);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyIndexUI", "initView: topBg use money bg");
            imageView.setImageResource(com.tencent.mm.R.drawable.c_p);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bum;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.f492445go2);
        setBackBtn(new com.tencent.mm.plugin.luckymoney.ui.x5(this));
        this.f146140g = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.j2c);
        this.f146141h = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.j2a);
        this.f146142i = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.j28);
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.j2b)).setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.y5(this));
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.j2_)).setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.z5(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.glo), new com.tencent.mm.plugin.luckymoney.ui.b6(this), null, com.tencent.mm.ui.fb.TRANSPARENT_GOLD_TEXT);
        W6();
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().k(this, null);
        initView();
        java.lang.String stringExtra = getIntent().getStringExtra("key_username");
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_username");
        java.util.HashMap hashMap = com.tencent.mm.plugin.luckymoney.model.m5.f145452a;
        if (c01.e2.S(stringExtra2)) {
            doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.y5("v1.0", ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_HAS_SOURCE_INT_SYNC, 0)).intValue(), stringExtra), false);
        } else {
            doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.x5(com.tencent.mm.storage.z3.R4(stringExtra) ? 0 : 25, "v1.0", ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_ENVELOPE_HAS_SOURCE_INT_SYNC, 0)).intValue(), stringExtra), false);
        }
        this.f146143m = getIntent().getIntExtra("pay_channel", -1);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 3, 0, 0, 0, 1);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        cu4.g wi6 = ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi();
        wi6.e(this, wi6.i(), null);
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof com.tencent.mm.plugin.luckymoney.model.x5)) {
            return false;
        }
        if (i17 != 0 || i18 != 0) {
            return true;
        }
        com.tencent.mm.plugin.luckymoney.model.x5 x5Var = (com.tencent.mm.plugin.luckymoney.model.x5) m1Var;
        com.tencent.mm.plugin.luckymoney.ui.ok okVar = new com.tencent.mm.plugin.luckymoney.ui.ok();
        okVar.f147283a = getResources().getColor(com.tencent.mm.R.color.f479359xe);
        okVar.f147286d = 101;
        com.tencent.mm.plugin.luckymoney.ui.rk.b(this, this.f146140g, x5Var.f145706u, okVar, "Text");
        com.tencent.mm.plugin.luckymoney.ui.ok okVar2 = new com.tencent.mm.plugin.luckymoney.ui.ok();
        okVar2.f147283a = getResources().getColor(com.tencent.mm.R.color.f479359xe);
        okVar2.f147286d = 100;
        com.tencent.mm.plugin.luckymoney.ui.rk.b(this, this.f146141h, x5Var.f145708w, okVar2, "Text");
        com.tencent.mm.plugin.luckymoney.ui.ok okVar3 = new com.tencent.mm.plugin.luckymoney.ui.ok();
        okVar3.f147286d = 102;
        com.tencent.mm.plugin.luckymoney.ui.rk.b(this, this.f146142i, x5Var.f145705t, okVar3, "Pic");
        W6();
        return true;
    }
}
