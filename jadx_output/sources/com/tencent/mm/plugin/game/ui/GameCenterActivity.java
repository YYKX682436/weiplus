package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public abstract class GameCenterActivity extends com.tencent.mm.plugin.game.ui.GameBaseActivity {
    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
    }
}
