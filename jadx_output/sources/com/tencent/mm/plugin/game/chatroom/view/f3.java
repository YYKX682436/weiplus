package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f139108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo f139109e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.i3 f139110f;

    public f3(com.tencent.mm.plugin.game.chatroom.view.i3 i3Var, long j17, com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo voteInfo) {
        this.f139110f = i3Var;
        this.f139108d = j17;
        this.f139109e = voteInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.chatroom.view.i3 i3Var = this.f139110f;
        for (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack : i3Var.f139166e) {
            if (chatroomMsgPack.seq == this.f139108d) {
                if (chatroomMsgPack.msg_options == null) {
                    chatroomMsgPack.msg_options = new com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions();
                }
                chatroomMsgPack.msg_options.vote_info = this.f139109e;
                java.util.List list = i3Var.f139166e;
                list.set(list.indexOf(chatroomMsgPack), chatroomMsgPack);
                return;
            }
        }
    }
}
