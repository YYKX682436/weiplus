package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class ChatRoomTabUI extends com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f141093x = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f141095h;

    /* renamed from: i, reason: collision with root package name */
    public long f141096i;

    /* renamed from: m, reason: collision with root package name */
    public int f141097m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.chat_tab.ChatCustomTabActionBar f141098n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.chat_tab.GameRoomListFragment f141099o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.chat_tab.GameMsgNoticeFragment f141100p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation f141101q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f141102r;

    /* renamed from: s, reason: collision with root package name */
    public int f141103s;

    /* renamed from: t, reason: collision with root package name */
    public int f141104t;

    /* renamed from: u, reason: collision with root package name */
    public int f141105u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f141106v;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.chat_tab.o f141094g = null;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.ipcinvoker.r f141107w = new com.tencent.mm.plugin.game.ui.chat_tab.h(this);

    @Override // com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI
    public long T6() {
        return 10L;
    }

    @Override // com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI
    public long U6() {
        return this.f141096i;
    }

    @Override // com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI
    public long V6() {
        return this.f141095h;
    }

    @Override // com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI
    public long W6() {
        return 1099L;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bf7;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        com.tencent.mm.plugin.game.ui.chat_tab.o oVar = this.f141094g;
        if (oVar == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatTabPresenter", "onBackPressed");
        com.tencent.mm.plugin.game.ui.chat_tab.r0.b(oVar.f141295a);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.tencent.mm.plugin.game.ui.chat_tab.o oVar = this.f141094g;
        if (oVar == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatTabPresenter", "onConfigurationChanged");
        oVar.f141295a.setRequestedOrientation(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
    
        if (r12.field_createTime < (r11.f470255e / 1000)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
    
        if ((d43.b.f226415h / 1000) > r5.field_createTime) goto L29;
     */
    @Override // com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r16) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.ui.chat_tab.ChatRoomTabUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.GAME_LOCAL_MSG_TAB_TYPE_INT_SYNC, java.lang.Integer.valueOf(this.f141098n.getmTabs().getSelectedTabPosition() + 1));
        this.f141101q = null;
        super.onDestroy();
        com.tencent.mm.game.report.g.f68198d = "";
        com.tencent.mm.plugin.game.ui.chat_tab.o oVar = this.f141094g;
        if (oVar != null) {
            oVar.b();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.tencent.mm.plugin.game.ui.chat_tab.o oVar = this.f141094g;
        if (oVar == null) {
            return;
        }
        oVar.c(intent);
    }

    @Override // com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        d43.b bVar = d43.b.f226411d;
        d43.b.f226412e.f17810o = 2;
        com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation iPCInvoke_readGameLifeConversation = this.f141101q;
        if (iPCInvoke_readGameLifeConversation != null) {
            iPCInvoke_readGameLifeConversation.invoke(new com.tencent.mm.ipcinvoker.type.IPCInteger(2), null);
        }
        com.tencent.mm.plugin.game.ui.chat_tab.o oVar = this.f141094g;
        if (oVar == null) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GAME_LIFE_LATEST_MSG_ID_LONG, java.lang.Long.valueOf(((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Ni().f470252b));
        } else {
            oVar.d();
        }
    }

    @Override // com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        d43.b bVar = d43.b.f226411d;
        d43.b.f226412e.f17810o = 1;
        com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.IPCInvoke_readGameLifeConversation iPCInvoke_readGameLifeConversation = this.f141101q;
        if (iPCInvoke_readGameLifeConversation != null) {
            iPCInvoke_readGameLifeConversation.invoke(new com.tencent.mm.ipcinvoker.type.IPCInteger(1), this.f141107w);
        }
        com.tencent.mm.plugin.game.ui.chat_tab.o oVar = this.f141094g;
        if (oVar == null) {
            return;
        }
        oVar.e();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean supportNavigationSwipeBack() {
        return !getIntent().getBooleanExtra("disable_game_page_swipe", false);
    }
}
