package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class ChatroomRecInfo extends com.tencent.mm.protobuf.f {
    public long basic_update_time;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChattingInfo chating_des;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroom_data;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack last_chatroom_msg;
    public int user_chatting_count;
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPackExtend> chosen_chatroom_msg = new java.util.LinkedList<>();
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPackExtend> bullet_msg_list = new java.util.LinkedList<>();

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo chatroomRecInfo = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo) fVar;
        return n51.f.a(this.chatroom_data, chatroomRecInfo.chatroom_data) && n51.f.a(java.lang.Long.valueOf(this.basic_update_time), java.lang.Long.valueOf(chatroomRecInfo.basic_update_time)) && n51.f.a(this.chating_des, chatroomRecInfo.chating_des) && n51.f.a(java.lang.Integer.valueOf(this.user_chatting_count), java.lang.Integer.valueOf(chatroomRecInfo.user_chatting_count)) && n51.f.a(this.last_chatroom_msg, chatroomRecInfo.last_chatroom_msg) && n51.f.a(this.chosen_chatroom_msg, chatroomRecInfo.chosen_chatroom_msg) && n51.f.a(this.bullet_msg_list, chatroomRecInfo.bullet_msg_list);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData = this.chatroom_data;
            if (chatroomData != null) {
                fVar.i(1, chatroomData.computeSize());
                this.chatroom_data.writeFields(fVar);
            }
            fVar.h(2, this.basic_update_time);
            com.tencent.mm.plugin.game.autogen.chatroom.ChattingInfo chattingInfo = this.chating_des;
            if (chattingInfo != null) {
                fVar.i(3, chattingInfo.computeSize());
                this.chating_des.writeFields(fVar);
            }
            fVar.e(4, this.user_chatting_count);
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = this.last_chatroom_msg;
            if (chatroomMsgPack != null) {
                fVar.i(5, chatroomMsgPack.computeSize());
                this.last_chatroom_msg.writeFields(fVar);
            }
            fVar.g(6, 8, this.chosen_chatroom_msg);
            fVar.g(7, 8, this.bullet_msg_list);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData2 = this.chatroom_data;
            int i18 = (chatroomData2 != null ? 0 + b36.f.i(1, chatroomData2.computeSize()) : 0) + b36.f.h(2, this.basic_update_time);
            com.tencent.mm.plugin.game.autogen.chatroom.ChattingInfo chattingInfo2 = this.chating_des;
            if (chattingInfo2 != null) {
                i18 += b36.f.i(3, chattingInfo2.computeSize());
            }
            int e17 = i18 + b36.f.e(4, this.user_chatting_count);
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack2 = this.last_chatroom_msg;
            if (chatroomMsgPack2 != null) {
                e17 += b36.f.i(5, chatroomMsgPack2.computeSize());
            }
            return e17 + b36.f.g(6, 8, this.chosen_chatroom_msg) + b36.f.g(7, 8, this.bullet_msg_list);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.chosen_chatroom_msg.clear();
            this.bullet_msg_list.clear();
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
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo chatroomRecInfo = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData();
                    if (bArr2 != null && bArr2.length > 0) {
                        chatroomData3.parseFrom(bArr2);
                    }
                    chatroomRecInfo.chatroom_data = chatroomData3;
                }
                return 0;
            case 2:
                chatroomRecInfo.basic_update_time = aVar2.i(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChattingInfo chattingInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChattingInfo();
                    if (bArr3 != null && bArr3.length > 0) {
                        chattingInfo3.parseFrom(bArr3);
                    }
                    chatroomRecInfo.chating_des = chattingInfo3;
                }
                return 0;
            case 4:
                chatroomRecInfo.user_chatting_count = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack();
                    if (bArr4 != null && bArr4.length > 0) {
                        chatroomMsgPack3.parseFrom(bArr4);
                    }
                    chatroomRecInfo.last_chatroom_msg = chatroomMsgPack3;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPackExtend chatroomMsgPackExtend = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPackExtend();
                    if (bArr5 != null && bArr5.length > 0) {
                        chatroomMsgPackExtend.parseFrom(bArr5);
                    }
                    chatroomRecInfo.chosen_chatroom_msg.add(chatroomMsgPackExtend);
                }
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPackExtend chatroomMsgPackExtend2 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPackExtend();
                    if (bArr6 != null && bArr6.length > 0) {
                        chatroomMsgPackExtend2.parseFrom(bArr6);
                    }
                    chatroomRecInfo.bullet_msg_list.add(chatroomMsgPackExtend2);
                }
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo setBasic_update_time(long j17) {
        this.basic_update_time = j17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo setBullet_msg_list(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPackExtend> linkedList) {
        this.bullet_msg_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo setChating_des(com.tencent.mm.plugin.game.autogen.chatroom.ChattingInfo chattingInfo) {
        this.chating_des = chattingInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo setChatroom_data(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData) {
        this.chatroom_data = chatroomData;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo setChosen_chatroom_msg(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPackExtend> linkedList) {
        this.chosen_chatroom_msg = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo setLast_chatroom_msg(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack) {
        this.last_chatroom_msg = chatroomMsgPack;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo setUser_chatting_count(int i17) {
        this.user_chatting_count = i17;
        return this;
    }
}
