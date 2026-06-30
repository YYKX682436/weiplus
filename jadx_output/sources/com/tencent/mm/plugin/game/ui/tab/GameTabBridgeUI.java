package com.tencent.mm.plugin.game.ui.tab;

@db5.a(19)
/* loaded from: classes8.dex */
public class GameTabBridgeUI extends com.tencent.mm.plugin.game.ui.GameCenterActivity {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f141769i = 0;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.BroadcastReceiver f141770h = new p53.g(this);

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
        return 0;
    }

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity
    public int W6() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity
    public int X6() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity
    public boolean Y6() {
        return false;
    }

    public final void Z6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabBridgeUI", "GameTabHomeUI goBack!");
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
            com.tencent.mars.xlog.Log.i("MicroMsg.GameTabBridgeUI", "back to FindMoreFriendsUI");
        }
        android.content.Intent intent2 = new android.content.Intent("com.tencent.mm.game.ACTION_EXIT");
        intent2.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        sendBroadcast(intent2, com.tencent.mm.plugin.game.g0.f139448a);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489136be3;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setBackBtn(new p53.f(this));
        setMMTitle(com.tencent.mm.R.string.fq7);
    }

    @Override // com.tencent.mm.plugin.game.ui.GameCenterActivity, com.tencent.mm.plugin.game.ui.GameBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabBridgeUI", "%s create", getClass().getSimpleName());
        com.tencent.mm.plugin.game.ui.tab.GameTabWidget.f141771f = hashCode();
        initView();
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("com.tencent.mm.game.ACTION_EXIT");
        boolean a17 = fp.h.a(33);
        android.content.BroadcastReceiver broadcastReceiver = this.f141770h;
        if (a17) {
            registerReceiver(broadcastReceiver, intentFilter, com.tencent.mm.plugin.game.g0.f139448a, null);
        } else {
            registerReceiver(broadcastReceiver, intentFilter, com.tencent.mm.plugin.game.g0.f139448a, null, 4);
        }
        android.content.Intent intent = getIntent();
        com.tencent.mm.plugin.game.model.GameTabData gameTabData = (com.tencent.mm.plugin.game.model.GameTabData) intent.getParcelableExtra("tab_data");
        java.lang.String stringExtra = intent.getStringExtra("tab_key");
        com.tencent.mm.plugin.game.ui.tab.GameTabWidget gameTabWidget = (com.tencent.mm.plugin.game.ui.tab.GameTabWidget) findViewById(com.tencent.mm.R.id.nvu);
        p53.c cVar = new p53.c(this);
        gameTabWidget.setAdapter(cVar);
        cVar.f352053e = gameTabData;
        cVar.f352054f = stringExtra;
        cVar.notifyDataSetChanged();
        intent.setComponent((android.content.ComponentName) intent.getParcelableExtra("next_tab_component"));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.ipcinvoker.wx_extension.j0 j0Var = (com.tencent.mm.ipcinvoker.wx_extension.j0) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.j0.class);
        p53.e eVar = new p53.e(this, currentTimeMillis, intent);
        ((h80.k) j0Var).getClass();
        com.tencent.mm.ipcinvoker.d0.e(com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService.f68462e, null, com.tencent.mm.plugin.game.ui.tab.GameTabWidget.a.class, eVar, null);
    }

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f141770h);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        Z6();
        return true;
    }

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (getSwipeBackLayout() != null) {
            getSwipeBackLayout().setEnableGesture(false);
        }
    }
}
