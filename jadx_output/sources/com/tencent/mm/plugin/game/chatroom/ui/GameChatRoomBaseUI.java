package com.tencent.mm.plugin.game.chatroom.ui;

/* loaded from: classes8.dex */
public abstract class GameChatRoomBaseUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public long f138751d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f138752e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f138753f = 0;

    public abstract long T6();

    public abstract long U6();

    public abstract long V6();

    public abstract long W6();

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.plugin.game.commlib.util.i.a(this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        if (this.f138752e != 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f138752e;
            com.tencent.mm.plugin.game.commlib.util.i.f(this);
            com.tencent.mars.xlog.Log.i("MicroMsg.GameChatRoomBaseUI", "visit page(%s), stayTime:%sms, foregroundTime:%sms", getClass().getSimpleName(), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(this.f138751d));
            if (T6() != -1) {
                long T6 = T6();
                long W6 = W6();
                long V6 = V6();
                long U6 = U6();
                long j17 = this.f138751d / 1000;
                com.tencent.mm.autogen.mmdata.rpt.GameChatRoomReportStruct gameChatRoomReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GameChatRoomReportStruct();
                gameChatRoomReportStruct.f58321d = T6;
                gameChatRoomReportStruct.f58322e = W6;
                gameChatRoomReportStruct.f58323f = 0L;
                gameChatRoomReportStruct.f58324g = 29L;
                gameChatRoomReportStruct.f58325h = 0L;
                gameChatRoomReportStruct.f58326i = V6;
                gameChatRoomReportStruct.f58327j = U6;
                gameChatRoomReportStruct.f58336s = com.tencent.mm.sdk.platformtools.t8.V(com.tencent.mm.game.report.g.f68198d, 0L);
                gameChatRoomReportStruct.f58338u = gameChatRoomReportStruct.b("session_id", com.tencent.mm.plugin.game.commlib.util.i.b().getString("session_id"), true);
                gameChatRoomReportStruct.f58339v = java.lang.System.currentTimeMillis();
                gameChatRoomReportStruct.p(com.tencent.mm.game.report.g.f68196b);
                gameChatRoomReportStruct.f58334q = j17;
                gameChatRoomReportStruct.k();
            }
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f138751d += java.lang.System.currentTimeMillis() - this.f138753f;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        if (this.f138752e == 0) {
            this.f138752e = java.lang.System.currentTimeMillis();
        }
        this.f138753f = java.lang.System.currentTimeMillis();
        super.onResume();
    }
}
