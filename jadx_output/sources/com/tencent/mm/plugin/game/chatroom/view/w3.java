package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public class w3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f139334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f139335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w33.d f139336f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.x3 f139337g;

    public w3(com.tencent.mm.plugin.game.chatroom.view.x3 x3Var, int i17, androidx.recyclerview.widget.k3 k3Var, w33.d dVar) {
        this.f139337g = x3Var;
        this.f139334d = i17;
        this.f139335e = k3Var;
        this.f139336f = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/MyChatRoomListView$MyChatroomAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = this.f139334d;
        w33.d dVar = this.f139336f;
        androidx.recyclerview.widget.k3 k3Var = this.f139335e;
        com.tencent.mm.plugin.game.chatroom.view.x3 x3Var = this.f139337g;
        if (i17 == 4) {
            x3Var.y(true);
            ((com.tencent.mm.plugin.game.chatroom.view.w0) k3Var).j(true, dVar.f442714b);
        } else {
            x3Var.y(false);
            ((com.tencent.mm.plugin.game.chatroom.view.w0) k3Var).j(false, dVar.f442714b);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/MyChatRoomListView$MyChatroomAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
