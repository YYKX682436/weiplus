package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class GetChatroomMsgResponse extends r45.js5 {
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> msg_pack_list = new java.util.LinkedList<>();

    public static final com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgResponse create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgResponse)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgResponse getChatroomMsgResponse = (com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgResponse) fVar;
        return n51.f.a(this.BaseResponse, getChatroomMsgResponse.BaseResponse) && n51.f.a(this.msg_pack_list, getChatroomMsgResponse.msg_pack_list);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, this.msg_pack_list);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, this.msg_pack_list);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.msg_pack_list.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgResponse getChatroomMsgResponse = (com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgResponse) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                getChatroomMsgResponse.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack();
            if (bArr3 != null && bArr3.length > 0) {
                chatroomMsgPack.parseFrom(bArr3);
            }
            getChatroomMsgResponse.msg_pack_list.add(chatroomMsgPack);
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgResponse setMsg_pack_list(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> linkedList) {
        this.msg_pack_list = linkedList;
        return this;
    }
}
