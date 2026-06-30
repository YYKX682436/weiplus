package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class ChatroomMsgPackExtend extends com.tencent.mm.protobuf.f {
    public java.lang.String brief_content;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack msg_pack;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData user_data;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPackExtend create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPackExtend();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPackExtend)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPackExtend chatroomMsgPackExtend = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPackExtend) fVar;
        return n51.f.a(this.msg_pack, chatroomMsgPackExtend.msg_pack) && n51.f.a(this.user_data, chatroomMsgPackExtend.user_data) && n51.f.a(this.brief_content, chatroomMsgPackExtend.brief_content);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = this.msg_pack;
            if (chatroomMsgPack != null) {
                fVar.i(1, chatroomMsgPack.computeSize());
                this.msg_pack.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData = this.user_data;
            if (chatroomUserData != null) {
                fVar.i(2, chatroomUserData.computeSize());
                this.user_data.writeFields(fVar);
            }
            java.lang.String str = this.brief_content;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack2 = this.msg_pack;
            int i18 = chatroomMsgPack2 != null ? 0 + b36.f.i(1, chatroomMsgPack2.computeSize()) : 0;
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData2 = this.user_data;
            if (chatroomUserData2 != null) {
                i18 += b36.f.i(2, chatroomUserData2.computeSize());
            }
            java.lang.String str2 = this.brief_content;
            return str2 != null ? i18 + b36.f.j(3, str2) : i18;
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
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPackExtend chatroomMsgPackExtend = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPackExtend) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack();
                if (bArr != null && bArr.length > 0) {
                    chatroomMsgPack3.parseFrom(bArr);
                }
                chatroomMsgPackExtend.msg_pack = chatroomMsgPack3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            chatroomMsgPackExtend.brief_content = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData();
            if (bArr2 != null && bArr2.length > 0) {
                chatroomUserData3.parseFrom(bArr2);
            }
            chatroomMsgPackExtend.user_data = chatroomUserData3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPackExtend setBrief_content(java.lang.String str) {
        this.brief_content = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPackExtend setMsg_pack(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack) {
        this.msg_pack = chatroomMsgPack;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPackExtend setUser_data(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData) {
        this.user_data = chatroomUserData;
        return this;
    }
}
