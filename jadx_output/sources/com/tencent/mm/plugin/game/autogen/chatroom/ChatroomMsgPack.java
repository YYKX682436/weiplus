package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes15.dex */
public class ChatroomMsgPack extends com.tencent.mm.protobuf.f {
    public int channel_id;
    public java.lang.String cli_msg_id;
    public java.lang.String from_username;
    public com.tencent.mm.plugin.game.autogen.chatroom.MsgContent msg_content;
    public com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions msg_options;
    public int msg_sub_type;
    public int msg_type;
    public long send_time;
    public long seq;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.msg_type), java.lang.Integer.valueOf(chatroomMsgPack.msg_type)) && n51.f.a(this.from_username, chatroomMsgPack.from_username) && n51.f.a(this.cli_msg_id, chatroomMsgPack.cli_msg_id) && n51.f.a(java.lang.Long.valueOf(this.seq), java.lang.Long.valueOf(chatroomMsgPack.seq)) && n51.f.a(java.lang.Long.valueOf(this.send_time), java.lang.Long.valueOf(chatroomMsgPack.send_time)) && n51.f.a(this.msg_content, chatroomMsgPack.msg_content) && n51.f.a(this.msg_options, chatroomMsgPack.msg_options) && n51.f.a(java.lang.Integer.valueOf(this.msg_sub_type), java.lang.Integer.valueOf(chatroomMsgPack.msg_sub_type)) && n51.f.a(java.lang.Integer.valueOf(this.channel_id), java.lang.Integer.valueOf(chatroomMsgPack.channel_id));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.msg_type);
            java.lang.String str = this.from_username;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.cli_msg_id;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.h(4, this.seq);
            fVar.h(5, this.send_time);
            com.tencent.mm.plugin.game.autogen.chatroom.MsgContent msgContent = this.msg_content;
            if (msgContent != null) {
                fVar.i(6, msgContent.computeSize());
                this.msg_content.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions msgOptions = this.msg_options;
            if (msgOptions != null) {
                fVar.i(7, msgOptions.computeSize());
                this.msg_options.writeFields(fVar);
            }
            fVar.e(8, this.msg_sub_type);
            fVar.e(9, this.channel_id);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.msg_type) + 0;
            java.lang.String str3 = this.from_username;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.cli_msg_id;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            int h17 = e17 + b36.f.h(4, this.seq) + b36.f.h(5, this.send_time);
            com.tencent.mm.plugin.game.autogen.chatroom.MsgContent msgContent2 = this.msg_content;
            if (msgContent2 != null) {
                h17 += b36.f.i(6, msgContent2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions msgOptions2 = this.msg_options;
            if (msgOptions2 != null) {
                h17 += b36.f.i(7, msgOptions2.computeSize());
            }
            return h17 + b36.f.e(8, this.msg_sub_type) + b36.f.e(9, this.channel_id);
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
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                chatroomMsgPack.msg_type = aVar2.g(intValue);
                return 0;
            case 2:
                chatroomMsgPack.from_username = aVar2.k(intValue);
                return 0;
            case 3:
                chatroomMsgPack.cli_msg_id = aVar2.k(intValue);
                return 0;
            case 4:
                chatroomMsgPack.seq = aVar2.i(intValue);
                return 0;
            case 5:
                chatroomMsgPack.send_time = aVar2.i(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.mm.plugin.game.autogen.chatroom.MsgContent msgContent3 = new com.tencent.mm.plugin.game.autogen.chatroom.MsgContent();
                    if (bArr != null && bArr.length > 0) {
                        msgContent3.parseFrom(bArr);
                    }
                    chatroomMsgPack.msg_content = msgContent3;
                }
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions msgOptions3 = new com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions();
                    if (bArr2 != null && bArr2.length > 0) {
                        msgOptions3.parseFrom(bArr2);
                    }
                    chatroomMsgPack.msg_options = msgOptions3;
                }
                return 0;
            case 8:
                chatroomMsgPack.msg_sub_type = aVar2.g(intValue);
                return 0;
            case 9:
                chatroomMsgPack.channel_id = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack setChannel_id(int i17) {
        this.channel_id = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack setCli_msg_id(java.lang.String str) {
        this.cli_msg_id = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack setFrom_username(java.lang.String str) {
        this.from_username = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack setMsg_content(com.tencent.mm.plugin.game.autogen.chatroom.MsgContent msgContent) {
        this.msg_content = msgContent;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack setMsg_options(com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions msgOptions) {
        this.msg_options = msgOptions;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack setMsg_sub_type(int i17) {
        this.msg_sub_type = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack setMsg_type(int i17) {
        this.msg_type = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack setSend_time(long j17) {
        this.send_time = j17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack setSeq(long j17) {
        this.seq = j17;
        return this;
    }
}
