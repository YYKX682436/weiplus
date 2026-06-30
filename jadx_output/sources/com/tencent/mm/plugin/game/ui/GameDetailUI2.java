package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class GameDetailUI2 extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f140744o = 0;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f140748g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f140749h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f140750i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f140751m;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f140745d = null;

    /* renamed from: e, reason: collision with root package name */
    public final int f140746e = 18;

    /* renamed from: f, reason: collision with root package name */
    public int f140747f = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f140752n = false;

    public final void T6() {
        java.lang.String stringExtra = getIntent().getStringExtra("jump_game_center");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && stringExtra.equals("jump_game_center")) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.game.ui.GameCenterUI.class);
            intent.putExtra("jump_find_more_friends", "jump_find_more_friends");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameDetailUI2", "backToGameCenterUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/game/ui/GameDetailUI2", "backToGameCenterUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bfa;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.flx);
        setBackBtn(new com.tencent.mm.plugin.game.ui.r2(this));
        ((com.tencent.mm.plugin.game.widget.TextProgressBar) findViewById(com.tencent.mm.R.id.go7)).setTextSize(this.f140746e);
        this.f140748g = findViewById(com.tencent.mm.R.id.gjr);
        this.f140749h = findViewById(com.tencent.mm.R.id.gjy);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.gjl);
        this.f140750i = textView;
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.game.ui.s2(this));
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.gjn);
        this.f140751m = textView2;
        textView2.setOnClickListener(new com.tencent.mm.plugin.game.ui.t2(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameDetailUI2", "requestCode = %d, resultCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 1) {
            if (i17 == 2) {
                if (i18 == -1 && !com.tencent.mm.sdk.platformtools.t8.K0(intent.getStringExtra("Select_Conv_User"))) {
                    throw null;
                }
            } else if (i17 != 3) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GameDetailUI2", "error request code");
            } else if (i18 == -1) {
                com.tencent.mm.game.report.l.f(getContext(), 12, 1207, 2, 15, this.f140745d, this.f140747f, null);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameDetailUI2", "account not ready");
            finish();
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("game_app_id");
        this.f140745d = stringExtra;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameDetailUI2", "appid is null or nill");
            finish();
        } else {
            this.f140747f = getIntent().getIntExtra("game_report_from_scene", 0);
        }
        initView();
        gm0.j1.d().a(1217, this);
        java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = this.f140745d;
        ((kt.c) i0Var).getClass();
        gm0.j1.d().g(new com.tencent.mm.plugin.game.model.d3(d17, this.f140745d, com.tencent.mm.pluginsdk.model.app.w.r(this, str), true));
        com.tencent.mm.plugin.game.commlib.util.i.a(this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.game.commlib.util.i.f(this);
        gm0.j1.d().q(1217, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        T6();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            return;
        }
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        if (com.tencent.mm.ui.pc.a(this, i17, i18, str, 4)) {
            return;
        }
        dp.a.makeText(this, getString(com.tencent.mm.R.string.fna, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
    }
}
