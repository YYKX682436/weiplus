package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class a3 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.i3 f139024d;

    public a3(com.tencent.mm.plugin.game.chatroom.view.i3 i3Var) {
        this.f139024d = i3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
    
        if (r8 > r9) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bd, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
    
        if (r0 > r5) goto L45;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compare(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r8 = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) r8
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r9 = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) r9
            com.tencent.mm.plugin.game.chatroom.view.i3 r0 = r7.f139024d
            java.util.Map r1 = r0.f139168g
            java.lang.String r2 = r8.cli_msg_id
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            boolean r1 = r1.containsKey(r2)
            java.util.List r2 = r0.f139167f
            java.util.Map r3 = r0.f139168g
            if (r1 == 0) goto L32
            r1 = r3
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            boolean r4 = r1.containsValue(r8)
            if (r4 != 0) goto L32
            java.lang.String r4 = r8.cli_msg_id
            java.lang.Object r4 = r1.get(r4)
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r4 = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) r4
            r5 = r2
            java.util.LinkedList r5 = (java.util.LinkedList) r5
            r5.add(r4)
            java.lang.String r4 = r8.cli_msg_id
            r1.remove(r4)
        L32:
            java.lang.String r1 = r9.cli_msg_id
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            boolean r1 = r3.containsKey(r1)
            if (r1 == 0) goto L55
            boolean r1 = r3.containsValue(r9)
            if (r1 != 0) goto L55
            java.lang.String r1 = r9.cli_msg_id
            java.lang.Object r1 = r3.get(r1)
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r1 = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) r1
            r4 = r2
            java.util.LinkedList r4 = (java.util.LinkedList) r4
            r4.add(r1)
            java.lang.String r1 = r9.cli_msg_id
            r3.remove(r1)
        L55:
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView r0 = r0.f139176r
            int r1 = r0.f138967m2
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L5f
            r5 = r3
            goto L60
        L5f:
            r5 = r4
        L60:
            if (r5 != 0) goto L77
            int r5 = r8.channel_id
            if (r5 == r1) goto L6c
            r1 = r2
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            r1.add(r8)
        L6c:
            int r1 = r9.channel_id
            int r0 = r0.f138967m2
            if (r1 == r0) goto L77
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            r2.add(r9)
        L77:
            long r0 = r8.seq
            long r5 = r9.seq
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto Lb8
            com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions r8 = r8.msg_options
            com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions r9 = r9.msg_options
            r0 = -1
            r2 = 4
            if (r8 == 0) goto L9b
            com.tencent.mm.protobuf.g r8 = r8.cli_local_data
            if (r8 != 0) goto L8d
            goto L9b
        L8d:
            byte[] r8 = r8.g()
            long r5 = kk.u.b(r8)
            lt0.l r8 = s33.y.f402541a
            long r5 = r5 >> r2
            long r5 = r5 & r0
            int r8 = (int) r5
            goto L9c
        L9b:
            r8 = r4
        L9c:
            if (r9 == 0) goto Lb1
            com.tencent.mm.protobuf.g r9 = r9.cli_local_data
            if (r9 != 0) goto La3
            goto Lb1
        La3:
            byte[] r9 = r9.g()
            long r5 = kk.u.b(r9)
            lt0.l r9 = s33.y.f402541a
            long r5 = r5 >> r2
            long r0 = r0 & r5
            int r9 = (int) r0
            goto Lb2
        Lb1:
            r9 = r4
        Lb2:
            if (r8 != r9) goto Lb5
            goto Lbd
        Lb5:
            if (r8 <= r9) goto Lbb
            goto Lbc
        Lb8:
            if (r0 <= 0) goto Lbb
            goto Lbc
        Lbb:
            r3 = -1
        Lbc:
            r4 = r3
        Lbd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.chatroom.view.a3.compare(java.lang.Object, java.lang.Object):int");
    }
}
