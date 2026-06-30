package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public class h1 extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock f139142e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.i1 f139143f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.tencent.mm.plugin.game.chatroom.view.i1 i1Var, int i17, r35.m3 m3Var, com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock contentBlock) {
        super(i17, m3Var);
        this.f139143f = i1Var;
        this.f139142e = contentBlock;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        com.tencent.mm.plugin.game.chatroom.view.i1 i1Var = this.f139143f;
        s33.y.h(i1Var.f139297d, this.f139142e.jump_info);
        android.view.View view2 = i1Var.f139154i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH$3", "onClickImp", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH$3", "onClickImp", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
