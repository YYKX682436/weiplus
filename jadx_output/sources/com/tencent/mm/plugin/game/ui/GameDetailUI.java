package com.tencent.mm.plugin.game.ui;

@db5.a(19)
/* loaded from: classes8.dex */
public class GameDetailUI extends com.tencent.mm.ui.MMBaseActivity {
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("game_app_id");
        m53.v0 f17 = com.tencent.mm.plugin.game.commlib.i.f();
        int i17 = f17 != null ? f17.f324116d : 0;
        if (i17 == 2) {
            r53.f.p(this, stringExtra, 0);
        } else if (i17 == 1) {
            r53.f.q(this, getIntent().getExtras());
        } else {
            java.lang.String d07 = com.tencent.mm.sdk.platformtools.t8.d0(this);
            if (com.tencent.mm.sdk.platformtools.t8.K0(d07) || d07.toLowerCase().equals("cn")) {
                r53.f.p(this, stringExtra, 0);
            } else {
                r53.f.q(this, getIntent().getExtras());
            }
        }
        finish();
    }
}
