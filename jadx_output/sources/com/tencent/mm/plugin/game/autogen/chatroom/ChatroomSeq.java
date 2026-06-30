package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class ChatroomSeq extends com.tencent.mm.protobuf.f {
    public int channel_id;
    public java.lang.String chatroom_name;
    public long seq;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ChatroomSeq create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomSeq();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChatroomSeq)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomSeq chatroomSeq = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomSeq) fVar;
        return n51.f.a(this.chatroom_name, chatroomSeq.chatroom_name) && n51.f.a(java.lang.Integer.valueOf(this.channel_id), java.lang.Integer.valueOf(chatroomSeq.channel_id)) && n51.f.a(java.lang.Long.valueOf(this.seq), java.lang.Long.valueOf(chatroomSeq.seq));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.chatroom_name;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.channel_id);
            fVar.h(3, this.seq);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.chatroom_name;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.channel_id) + b36.f.h(3, this.seq);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomSeq chatroomSeq = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomSeq) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            chatroomSeq.chatroom_name = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            chatroomSeq.channel_id = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        chatroomSeq.seq = aVar2.i(intValue);
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomSeq setChannel_id(int i17) {
        this.channel_id = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomSeq setChatroom_name(java.lang.String str) {
        this.chatroom_name = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomSeq setSeq(long j17) {
        this.seq = j17;
        return this;
    }
}
