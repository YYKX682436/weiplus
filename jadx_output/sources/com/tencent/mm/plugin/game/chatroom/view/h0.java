package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public class h0 extends androidx.recyclerview.widget.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f139140a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f139141b;

    public h0(com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView chatRoomListView, java.util.List list, java.util.List list2) {
        this.f139140a = list;
        this.f139141b = list2;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        return false;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean b(int i17, int i18) {
        w33.a aVar = (w33.a) this.f139140a.get(i17);
        w33.a aVar2 = (w33.a) this.f139141b.get(i18);
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData b17 = com.tencent.mm.plugin.game.chatroom.view.j1.b(aVar);
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData b18 = com.tencent.mm.plugin.game.chatroom.view.j1.b(aVar2);
        if (b17 == null || b18 == null) {
            return false;
        }
        java.lang.String str = b17.chatroom_name;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        return str.equals(b18.chatroom_name);
    }

    @Override // androidx.recyclerview.widget.b0
    public int d() {
        return this.f139141b.size();
    }

    @Override // androidx.recyclerview.widget.b0
    public int e() {
        return this.f139140a.size();
    }
}
