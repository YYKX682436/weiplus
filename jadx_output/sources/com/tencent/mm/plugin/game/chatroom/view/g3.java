package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f139131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo f139132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.i3 f139133f;

    public g3(com.tencent.mm.plugin.game.chatroom.view.i3 i3Var, long j17, com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo topicInfo) {
        this.f139133f = i3Var;
        this.f139131d = j17;
        this.f139132e = topicInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.chatroom.view.i3 i3Var = this.f139133f;
        for (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack : i3Var.f139166e) {
            if (chatroomMsgPack.seq == this.f139131d) {
                if (chatroomMsgPack.msg_options == null) {
                    chatroomMsgPack.msg_options = new com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions();
                }
                chatroomMsgPack.msg_options.topic_info = this.f139132e;
                java.util.List list = i3Var.f139166e;
                list.set(list.indexOf(chatroomMsgPack), chatroomMsgPack);
                return;
            }
        }
    }
}
