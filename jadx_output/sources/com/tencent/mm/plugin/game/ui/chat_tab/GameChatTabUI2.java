package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class GameChatTabUI2 extends com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI {

    /* renamed from: g, reason: collision with root package name */
    public long f141120g;

    /* renamed from: h, reason: collision with root package name */
    public long f141121h;

    @Override // com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI
    public long T6() {
        return 10L;
    }

    @Override // com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI
    public long U6() {
        return this.f141121h;
    }

    @Override // com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI
    public long V6() {
        return this.f141120g;
    }

    @Override // com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI
    public long W6() {
        return 1099L;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.di9;
    }

    @Override // com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.game.model.e1 b17;
        super.onCreate(bundle);
        android.os.Bundle extras = getIntent().getExtras();
        if (!extras.containsKey("game_report_ssid")) {
            getIntent().putExtra("game_report_ssid", getIntent().getIntExtra("game_report_from_scene", 0));
        }
        if (!extras.containsKey("game_report_sourceid")) {
            getIntent().putExtra("game_report_sourceid", 0L);
        }
        this.f141120g = getIntent().getLongExtra("game_report_ssid", 0L);
        this.f141121h = getIntent().getLongExtra("game_report_sourceid", 0L);
        java.lang.String str = "";
        com.tencent.mm.game.report.g.f68198d = "";
        java.lang.String stringExtra = getIntent().getStringExtra("game_msg_ui_from_msgid");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && (b17 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().b1(stringExtra)) != null) {
            b17.t0();
            str = b17.L2.f140371b.f140316a;
            com.tencent.mm.game.report.g.f68198d = b17.T2;
        }
        androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.h(com.tencent.mm.R.id.gd9, new com.tencent.mm.plugin.game.ui.chat_tab.GameRoomListFragment(str, true), null, 1);
        beginTransaction.d();
        setMMTitle("聊天");
        hideActionBarOperationArea();
        setBackBtn(new com.tencent.mm.plugin.game.ui.chat_tab.t(this));
    }
}
