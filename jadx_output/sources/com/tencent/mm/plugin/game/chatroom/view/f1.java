package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.i1 f139106d;

    public f1(com.tencent.mm.plugin.game.chatroom.view.i1 i1Var) {
        this.f139106d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).getClass();
        int i17 = l33.c.f315428a;
        boolean z17 = true;
        if (i17 != 1 && i17 != 3) {
            z17 = false;
        }
        if (z17) {
            ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Vi();
            yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.game.chatroom.view.i1 i1Var = this.f139106d;
        boolean L0 = com.tencent.mm.sdk.platformtools.t8.L0(i1Var.f139159q);
        android.content.Context context = i1Var.f139297d;
        if (!L0) {
            for (com.tencent.mm.plugin.game.autogen.chatroom.BanAction banAction : i1Var.f139159q) {
                if (banAction.type == 2) {
                    com.tencent.mm.plugin.game.chatroom.view.j1.d(context, banAction.desc);
                    yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
        }
        s33.y.h(context, i1Var.f139153h);
        com.tencent.mm.game.report.g.f68195a.k(1003L, 2L, 7L, 0L, i1Var.f139157o, i1Var.f139158p, "", "", "");
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomVH$RoomGroupVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
