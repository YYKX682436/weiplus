package com.tencent.mm.plugin.game.ui.tab;

/* loaded from: classes8.dex */
public class GameTabWebUI extends com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI {
    public android.app.Activity T3;
    public java.lang.String U3;
    public final android.content.BroadcastReceiver V3 = new p53.k(this);

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void P7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWebUI", "%s goBack!", this.T3.getClass().getSimpleName());
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
            com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWebUI", "back to FindMoreFriendsUI.");
        }
        android.content.Intent intent2 = new android.content.Intent("com.tencent.mm.game.ACTION_EXIT");
        intent2.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        sendBroadcast(intent2, com.tencent.mm.plugin.game.g0.f139448a);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        P7();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI, com.tencent.mm.plugin.webview.ui.tools.game.GameBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWebUI", "%s create", getClass().getSimpleName());
        this.T3 = this;
        com.tencent.mm.plugin.game.model.GameTabData gameTabData = (com.tencent.mm.plugin.game.model.GameTabData) getIntent().getParcelableExtra("tab_data");
        this.U3 = getIntent().getStringExtra("tab_key");
        com.tencent.mm.plugin.game.ui.tab.GameTabWidget gameTabWidget = new com.tencent.mm.plugin.game.ui.tab.GameTabWidget(this);
        p53.c cVar = new p53.c(this);
        gameTabWidget.setAdapter(cVar);
        java.lang.String str = this.U3;
        cVar.f352053e = gameTabData;
        cVar.f352054f = str;
        cVar.notifyDataSetChanged();
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.pil)).addView(gameTabWidget);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("com.tencent.mm.game.ACTION_EXIT");
        boolean a17 = fp.h.a(33);
        android.content.BroadcastReceiver broadcastReceiver = this.V3;
        if (a17) {
            registerReceiver(broadcastReceiver, intentFilter, com.tencent.mm.plugin.game.g0.f139448a, null);
        } else {
            registerReceiver(broadcastReceiver, intentFilter, com.tencent.mm.plugin.game.g0.f139448a, null, 4);
        }
        setBackBtn(new p53.j(this));
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI, com.tencent.mm.plugin.webview.ui.tools.game.GameBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.V3);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (intent == null) {
            return;
        }
        setIntent(intent);
        java.lang.String stringExtra = intent.getStringExtra("tab_key");
        java.lang.String str = this.U3;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (!str.equals(stringExtra)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWebUI", "reload %s", this.T3.getClass().getSimpleName());
            finish();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/tab/GameTabWebUI", "onNewIntent", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/game/ui/tab/GameTabWebUI", "onNewIntent", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        overridePendingTransition(com.tencent.mm.R.anim.f477815c9, com.tencent.mm.R.anim.f477815c9);
    }
}
