package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes3.dex */
public class p0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.ChatRoomStateView f139254d;

    public p0(com.tencent.mm.plugin.game.chatroom.view.ChatRoomStateView chatRoomStateView) {
        this.f139254d = chatRoomStateView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.game.chatroom.view.ChatRoomStateView chatRoomStateView = this.f139254d;
        android.view.View view = chatRoomStateView.f138928g;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomStateView$2", "onTimerExpired", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomStateView$2", "onTimerExpired", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        chatRoomStateView.f138935q = null;
        return true;
    }
}
