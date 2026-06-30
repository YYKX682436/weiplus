package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public abstract class GameCenterBaseUI extends com.tencent.mm.plugin.game.ui.GameCenterActivity {

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.e1 f140701m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.e1 f140702n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.e1 f140703o;

    /* renamed from: h, reason: collision with root package name */
    public boolean f140699h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f140700i = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f140704p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f140705q = true;

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity
    public java.lang.String T6() {
        return null;
    }

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity
    public java.lang.String U6() {
        return null;
    }

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity
    public int V6() {
        return 10;
    }

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity
    public int W6() {
        return this.f140700i;
    }

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity
    public int X6() {
        return 1000;
    }

    @Override // com.tencent.mm.plugin.game.ui.GameCenterActivity, com.tencent.mm.plugin.game.ui.GameBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameCenterBaseUI", "account not ready");
            finish();
        } else {
            this.f140700i = getIntent().getIntExtra("game_report_from_scene", 0);
            this.f140699h = getIntent().getBooleanExtra("from_find_more_friend", false);
            r53.f.l().postToWorker(new com.tencent.mm.plugin.game.ui.h0(this));
            com.tencent.mm.game.report.l.d(this, 10, 1000, 0, 1, 0, null, this.f140700i, 0, null, null, null);
        }
    }

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameCenterBaseUI", "account not ready");
            return;
        }
        if (!this.f140705q) {
            r53.d dVar = r53.b.f392640a;
            if (dVar.f392648b) {
                dVar.f392648b = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.GameCenterBaseUI", "restart page from country setting");
                if (!isFinishing()) {
                    finish();
                }
                android.content.Intent intent = new android.content.Intent("com.tencent.mm.game.ACTION_EXIT");
                intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
                sendBroadcast(intent, com.tencent.mm.plugin.game.g0.f139448a);
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("game_report_from_scene", 901);
                intent2.putExtra("switch_country_no_anim", true);
                j45.l.j(this, "game", ".ui.GameCenterUI", intent2, null);
            }
        }
        this.f140705q = false;
    }
}
