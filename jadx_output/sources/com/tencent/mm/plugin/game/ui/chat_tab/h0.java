package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public final class h0 extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameRoomStaggeredListFragment f141274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock f141275f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f141276g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.game.ui.chat_tab.GameRoomStaggeredListFragment gameRoomStaggeredListFragment, com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock contentBlock, android.view.View view) {
        super(1, null);
        this.f141274e = gameRoomStaggeredListFragment;
        this.f141275f = contentBlock;
        this.f141276g = view;
    }

    @Override // tg3.a
    public void a(android.view.View widget) {
        kotlin.jvm.internal.o.g(widget, "widget");
        s33.y.h(this.f141274e.requireContext(), this.f141275f.jump_info);
        android.view.View view = this.f141276g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/GameRoomStaggeredListFragment$handleGamePermission$2", "onClickImp", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/ui/chat_tab/GameRoomStaggeredListFragment$handleGamePermission$2", "onClickImp", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
