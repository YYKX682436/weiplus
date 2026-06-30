package com.tencent.mm.plugin.game.ui.chat_tab;

@ul5.d(0)
/* loaded from: classes8.dex */
public class GameChatTabUI extends com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f141117r = 0;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.chat_tab.o f141118p = null;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f141119q;

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        com.tencent.mm.plugin.game.ui.chat_tab.o oVar = this.f141118p;
        if (oVar == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatTabPresenter", "onBackPressed");
        com.tencent.mm.plugin.game.ui.chat_tab.r0.b(oVar.f141295a);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.tencent.mm.plugin.game.ui.chat_tab.o oVar = this.f141118p;
        if (oVar == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatTabPresenter", "onConfigurationChanged");
        oVar.f141295a.setRequestedOrientation(1);
    }

    @Override // com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI, com.tencent.mm.plugin.gamelife.ui.GameLifeChattingCompatUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("game_from_detail_back", false)) {
            overridePendingTransition(com.tencent.mm.ui.uc.f211080c, com.tencent.mm.ui.uc.f211081d);
        }
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 gameTabData2 = (com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2) getIntent().getParcelableExtra("game_tab_data");
        if (gameTabData2 != null && gameTabData2.f141151d.size() > 1) {
            com.tencent.mm.plugin.game.ui.chat_tab.o oVar = new com.tencent.mm.plugin.game.ui.chat_tab.o(this);
            this.f141118p = oVar;
            oVar.a(getContentView(), new com.tencent.mm.plugin.game.ui.chat_tab.q(this));
        }
        android.view.View j17 = getSupportActionBar().j();
        if (j17 == null || !(j17 instanceof android.widget.LinearLayout)) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = j17.getLayoutParams();
        layoutParams.width = -1;
        j17.setLayoutParams(layoutParams);
        android.view.ViewGroup viewGroup = (android.widget.LinearLayout) j17;
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.bgr, viewGroup, false);
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) inflate.getLayoutParams();
        layoutParams2.gravity = 16;
        viewGroup.addView(inflate, layoutParams2);
        inflate.setOnClickListener(new com.tencent.mm.plugin.game.ui.chat_tab.s(this));
    }

    @Override // com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI, com.tencent.mm.plugin.gamelife.ui.GameLifeChattingCompatUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.game.ui.chat_tab.o oVar = this.f141118p;
        if (oVar != null) {
            oVar.b();
        }
    }

    @Override // com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI, wn.r
    public void onFinish() {
        com.tencent.mm.plugin.game.ui.chat_tab.o oVar = this.f141118p;
        if (oVar == null) {
            finish();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatTabPresenter", "finishPage");
            com.tencent.mm.plugin.game.ui.chat_tab.r0.b(oVar.f141295a);
        }
    }

    @Override // com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.tencent.mm.plugin.game.ui.chat_tab.o oVar = this.f141118p;
        if (oVar == null) {
            return;
        }
        oVar.c(intent);
    }

    @Override // com.tencent.mm.plugin.gamelife.ui.GameLifeChattingCompatUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.game.ui.chat_tab.o oVar = this.f141118p;
        if (oVar == null) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GAME_LIFE_LATEST_MSG_ID_LONG, java.lang.Long.valueOf(((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Ni().f470252b));
        } else {
            oVar.d();
        }
    }

    @Override // com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI, com.tencent.mm.plugin.gamelife.ui.GameLifeChattingCompatUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.game.ui.chat_tab.o oVar = this.f141118p;
        if (oVar != null) {
            oVar.e();
        }
        if (getIntent().getBooleanExtra("disable_game_page_swipe", false)) {
            android.os.Looper.myQueue().addIdleHandler(new com.tencent.mm.plugin.game.ui.chat_tab.r(this));
        }
    }
}
