package com.tencent.mm.plugin.game.chatroom.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/game/chatroom/ui/GameChatRoomAffinityUI;", "Lcom/tencent/mm/plugin/game/chatroom/ui/GameChatRoomUI;", "<init>", "()V", "game-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class GameChatRoomAffinityUI extends com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI {
    @Override // com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomUI, com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m53.f4 f4Var;
        super.onCreate(bundle);
        android.graphics.Bitmap a17 = m95.a.a(getContext().getResources(), com.tencent.mm.R.raw.game_chat_room_logo, 3.0f);
        m53.t b17 = com.tencent.mm.plugin.game.commlib.i.b();
        java.lang.String str = (b17 == null || (f4Var = b17.f324064e) == null) ? null : f4Var.f323679d;
        if (str == null) {
            str = getContext().getString(com.tencent.mm.R.string.f492202fl4);
            kotlin.jvm.internal.o.f(str, "getString(...)");
        }
        setTaskDescription(new android.app.ActivityManager.TaskDescription(str, a17, 0));
    }
}
