package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes9.dex */
public class o3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f139250d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f139251e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.JoinChatRoomConfirmView f139252f;

    public o3(com.tencent.mm.plugin.game.chatroom.view.JoinChatRoomConfirmView joinChatRoomConfirmView, android.view.View view, android.view.View view2) {
        this.f139252f = joinChatRoomConfirmView;
        this.f139250d = view;
        this.f139251e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.chatroom.view.JoinChatRoomConfirmView joinChatRoomConfirmView = this.f139252f;
        joinChatRoomConfirmView.f138990h.removeAllViews();
        android.view.View view = this.f139250d;
        int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
        android.view.View view2 = this.f139251e;
        if (measuredWidth + (view2 != null ? view2.getMeasuredWidth() : 0) > joinChatRoomConfirmView.f138990h.getMeasuredWidth()) {
            joinChatRoomConfirmView.f138990h.setOrientation(1);
        } else {
            joinChatRoomConfirmView.f138990h.setOrientation(0);
        }
        if (view != null) {
            joinChatRoomConfirmView.f138990h.addView(view);
        }
        if (view2 != null) {
            joinChatRoomConfirmView.f138990h.addView(view2);
        }
    }
}
