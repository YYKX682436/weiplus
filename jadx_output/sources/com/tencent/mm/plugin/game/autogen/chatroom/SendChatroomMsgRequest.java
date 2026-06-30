package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class SendChatroomMsgRequest extends r45.mr5 {
    public java.lang.String chatroom_name;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack msg_pack;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.SendChatroomMsgRequest create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.SendChatroomMsgRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.SendChatroomMsgRequest)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.SendChatroomMsgRequest sendChatroomMsgRequest = (com.tencent.mm.plugin.game.autogen.chatroom.SendChatroomMsgRequest) fVar;
        return n51.f.a(this.BaseRequest, sendChatroomMsgRequest.BaseRequest) && n51.f.a(this.msg_pack, sendChatroomMsgRequest.msg_pack) && n51.f.a(this.chatroom_name, sendChatroomMsgRequest.chatroom_name);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = this.msg_pack;
            if (chatroomMsgPack != null) {
                fVar.i(2, chatroomMsgPack.computeSize());
                this.msg_pack.writeFields(fVar);
            }
            java.lang.String str = this.chatroom_name;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack2 = this.msg_pack;
            if (chatroomMsgPack2 != null) {
                i18 += b36.f.i(2, chatroomMsgPack2.computeSize());
            }
            java.lang.String str2 = this.chatroom_name;
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
        com.tencent.mm.plugin.game.autogen.chatroom.SendChatroomMsgRequest sendChatroomMsgRequest = (com.tencent.mm.plugin.game.autogen.chatroom.SendChatroomMsgRequest) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                sendChatroomMsgRequest.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            sendChatroomMsgRequest.chatroom_name = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack();
            if (bArr2 != null && bArr2.length > 0) {
                chatroomMsgPack3.parseFrom(bArr2);
            }
            sendChatroomMsgRequest.msg_pack = chatroomMsgPack3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.SendChatroomMsgRequest setChatroom_name(java.lang.String str) {
        this.chatroom_name = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.SendChatroomMsgRequest setMsg_pack(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack) {
        this.msg_pack = chatroomMsgPack;
        return this;
    }
}
