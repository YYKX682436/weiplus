package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class ReceiveChatroomMsgResponse extends r45.js5 {
    public com.tencent.mm.plugin.game.autogen.chatroom.AtInfo at_info;
    public long last_received_seq;
    public long next_seq;
    public java.lang.String next_version;
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> msg_pack_list = new java.util.LinkedList<>();
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.NoticeMsg> notice_msg_list = new java.util.LinkedList<>();
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> refresh_msg_pack_list = new java.util.LinkedList<>();

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgResponse create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgResponse)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgResponse receiveChatroomMsgResponse = (com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgResponse) fVar;
        return n51.f.a(this.BaseResponse, receiveChatroomMsgResponse.BaseResponse) && n51.f.a(this.msg_pack_list, receiveChatroomMsgResponse.msg_pack_list) && n51.f.a(java.lang.Long.valueOf(this.next_seq), java.lang.Long.valueOf(receiveChatroomMsgResponse.next_seq)) && n51.f.a(this.at_info, receiveChatroomMsgResponse.at_info) && n51.f.a(this.notice_msg_list, receiveChatroomMsgResponse.notice_msg_list) && n51.f.a(java.lang.Long.valueOf(this.last_received_seq), java.lang.Long.valueOf(receiveChatroomMsgResponse.last_received_seq)) && n51.f.a(this.refresh_msg_pack_list, receiveChatroomMsgResponse.refresh_msg_pack_list) && n51.f.a(this.next_version, receiveChatroomMsgResponse.next_version);
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
            fVar.h(3, this.next_seq);
            com.tencent.mm.plugin.game.autogen.chatroom.AtInfo atInfo = this.at_info;
            if (atInfo != null) {
                fVar.i(4, atInfo.computeSize());
                this.at_info.writeFields(fVar);
            }
            fVar.g(5, 8, this.notice_msg_list);
            fVar.h(6, this.last_received_seq);
            fVar.g(7, 8, this.refresh_msg_pack_list);
            java.lang.String str = this.next_version;
            if (str != null) {
                fVar.j(8, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, this.msg_pack_list) + b36.f.h(3, this.next_seq);
            com.tencent.mm.plugin.game.autogen.chatroom.AtInfo atInfo2 = this.at_info;
            if (atInfo2 != null) {
                i18 += b36.f.i(4, atInfo2.computeSize());
            }
            int g17 = i18 + b36.f.g(5, 8, this.notice_msg_list) + b36.f.h(6, this.last_received_seq) + b36.f.g(7, 8, this.refresh_msg_pack_list);
            java.lang.String str2 = this.next_version;
            return str2 != null ? g17 + b36.f.j(8, str2) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.msg_pack_list.clear();
            this.notice_msg_list.clear();
            this.refresh_msg_pack_list.clear();
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
        com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgResponse receiveChatroomMsgResponse = (com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgResponse) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    receiveChatroomMsgResponse.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack();
                    if (bArr3 != null && bArr3.length > 0) {
                        chatroomMsgPack.parseFrom(bArr3);
                    }
                    receiveChatroomMsgResponse.msg_pack_list.add(chatroomMsgPack);
                }
                return 0;
            case 3:
                receiveChatroomMsgResponse.next_seq = aVar2.i(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    com.tencent.mm.plugin.game.autogen.chatroom.AtInfo atInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.AtInfo();
                    if (bArr4 != null && bArr4.length > 0) {
                        atInfo3.parseFrom(bArr4);
                    }
                    receiveChatroomMsgResponse.at_info = atInfo3;
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    com.tencent.mm.plugin.game.autogen.chatroom.NoticeMsg noticeMsg = new com.tencent.mm.plugin.game.autogen.chatroom.NoticeMsg();
                    if (bArr5 != null && bArr5.length > 0) {
                        noticeMsg.parseFrom(bArr5);
                    }
                    receiveChatroomMsgResponse.notice_msg_list.add(noticeMsg);
                }
                return 0;
            case 6:
                receiveChatroomMsgResponse.last_received_seq = aVar2.i(intValue);
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack2 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack();
                    if (bArr6 != null && bArr6.length > 0) {
                        chatroomMsgPack2.parseFrom(bArr6);
                    }
                    receiveChatroomMsgResponse.refresh_msg_pack_list.add(chatroomMsgPack2);
                }
                return 0;
            case 8:
                receiveChatroomMsgResponse.next_version = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgResponse setAt_info(com.tencent.mm.plugin.game.autogen.chatroom.AtInfo atInfo) {
        this.at_info = atInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgResponse setLast_received_seq(long j17) {
        this.last_received_seq = j17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgResponse setMsg_pack_list(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> linkedList) {
        this.msg_pack_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgResponse setNext_seq(long j17) {
        this.next_seq = j17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgResponse setNext_version(java.lang.String str) {
        this.next_version = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgResponse setNotice_msg_list(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.NoticeMsg> linkedList) {
        this.notice_msg_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgResponse setRefresh_msg_pack_list(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> linkedList) {
        this.refresh_msg_pack_list = linkedList;
        return this;
    }
}
