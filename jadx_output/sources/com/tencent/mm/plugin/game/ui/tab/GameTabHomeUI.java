package com.tencent.mm.plugin.game.ui.tab;

/* loaded from: classes8.dex */
public class GameTabHomeUI extends com.tencent.mm.plugin.game.ui.GameCenterUI5 {
    public static final /* synthetic */ int D = 0;
    public java.lang.String B;
    public final android.content.BroadcastReceiver C = new p53.i(this);

    public final void a7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabHomeUI", "GameTabHomeUI goBack!");
        java.lang.String stringExtra = getIntent().getStringExtra("jump_find_more_friends");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (stringExtra.equals("jump_find_more_friends")) {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            intent.putExtra("preferred_tab", 2);
            j45.l.u(this, ".ui.LauncherUI", intent, null);
            finish();
            overridePendingTransition(com.tencent.mm.R.anim.f477880e4, com.tencent.mm.R.anim.f477889ed);
            com.tencent.mars.xlog.Log.i("MicroMsg.GameTabHomeUI", "back to FindMoreFriendsUI");
        }
        android.content.Intent intent2 = new android.content.Intent("com.tencent.mm.game.ACTION_EXIT");
        intent2.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        sendBroadcast(intent2, com.tencent.mm.plugin.game.g0.f139448a);
    }

    @Override // com.tencent.mm.plugin.game.ui.GameCenterUI5, com.tencent.mm.plugin.game.ui.GameCenterBaseUI, com.tencent.mm.plugin.game.ui.GameCenterActivity, com.tencent.mm.plugin.game.ui.GameBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabHomeUI", "%s create", getClass().getSimpleName());
        com.tencent.mm.plugin.game.model.GameTabData gameTabData = (com.tencent.mm.plugin.game.model.GameTabData) getIntent().getParcelableExtra("tab_data");
        this.B = getIntent().getStringExtra("tab_key");
        com.tencent.mm.plugin.game.ui.tab.GameTabWidget gameTabWidget = (com.tencent.mm.plugin.game.ui.tab.GameTabWidget) findViewById(com.tencent.mm.R.id.nvu);
        p53.c cVar = new p53.c(this);
        gameTabWidget.setAdapter(cVar);
        java.lang.String str = this.B;
        cVar.f352053e = gameTabData;
        cVar.f352054f = str;
        cVar.notifyDataSetChanged();
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("com.tencent.mm.game.ACTION_EXIT");
        boolean a17 = fp.h.a(33);
        android.content.BroadcastReceiver broadcastReceiver = this.C;
        if (a17) {
            registerReceiver(broadcastReceiver, intentFilter, com.tencent.mm.plugin.game.g0.f139448a, null);
        } else {
            registerReceiver(broadcastReceiver, intentFilter, com.tencent.mm.plugin.game.g0.f139448a, null, 4);
        }
        setBackBtn(new p53.h(this));
    }

    @Override // com.tencent.mm.plugin.game.ui.GameCenterUI5, com.tencent.mm.plugin.game.ui.GameBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.C);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        a7();
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (intent == null) {
            return;
        }
        setIntent(intent);
        java.lang.String stringExtra = intent.getStringExtra("tab_key");
        java.lang.String str = this.B;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (!str.equals(stringExtra)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameTabHomeUI", "reload %s. current_key:%s, next_key:%s", getClass().getSimpleName(), this.B, stringExtra);
            finish();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/tab/GameTabHomeUI", "onNewIntent", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/game/ui/tab/GameTabHomeUI", "onNewIntent", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        overridePendingTransition(com.tencent.mm.R.anim.f477815c9, com.tencent.mm.R.anim.f477815c9);
    }

    @Override // com.tencent.mm.plugin.game.ui.GameCenterUI5, com.tencent.mm.plugin.game.ui.GameCenterBaseUI, com.tencent.mm.plugin.game.ui.GameBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (getSwipeBackLayout() != null) {
            getSwipeBackLayout().setEnableGesture(false);
        }
    }
}
