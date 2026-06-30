package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class b3 implements java.util.Comparator {
    public b3(com.tencent.mm.plugin.game.chatroom.view.i3 i3Var) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        long j17 = ((com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) obj).seq;
        long j18 = ((com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) obj2).seq;
        if (j17 == j18) {
            return 0;
        }
        return j17 > j18 ? 1 : -1;
    }
}
