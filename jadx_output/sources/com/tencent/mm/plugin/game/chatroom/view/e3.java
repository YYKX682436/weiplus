package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f139097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f139098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f139099f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.i3 f139100g;

    public e3(com.tencent.mm.plugin.game.chatroom.view.i3 i3Var, int i17, boolean z17, boolean z18) {
        this.f139100g = i3Var;
        this.f139097d = i17;
        this.f139098e = z17;
        this.f139099f = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.chatroom.view.i3 i3Var = this.f139100g;
        long j17 = this.f139097d == 1 ? i3Var.f139176r.f138974t2 : i3Var.f139176r.K2;
        if (j17 > 0) {
            int i17 = 0;
            if (i3Var.f139176r.F2.size() > 0) {
                for (int size = i3Var.f139176r.F2.size() - 1; size >= 0 && ((com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) i3Var.f139176r.F2.get(size)).seq > j17 && !com.tencent.mm.plugin.game.chatroom.view.i3.x(i3Var, (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) i3Var.f139176r.F2.get(size)); size--) {
                    i17++;
                }
            } else {
                if (i3Var.f139166e.size() <= 0) {
                    return;
                }
                for (int size2 = i3Var.f139166e.size() - 1; size2 >= 0 && ((com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) i3Var.f139166e.get(size2)).seq > j17 && !com.tencent.mm.plugin.game.chatroom.view.i3.x(i3Var, (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) i3Var.f139166e.get(size2)); size2--) {
                    i17++;
                }
            }
            if (this.f139098e) {
                com.tencent.mm.autogen.events.NotifyNewMsgEvent notifyNewMsgEvent = new com.tencent.mm.autogen.events.NotifyNewMsgEvent();
                notifyNewMsgEvent.f54550g.f8201a = i17;
                notifyNewMsgEvent.e();
            }
            if (this.f139099f) {
                com.tencent.mm.plugin.game.chatroom.view.GameChatListView.n1(i3Var.f139176r, i17);
            }
        }
    }
}
