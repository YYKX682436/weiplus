package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class GetCanJoinChatroomResponse extends r45.js5 {
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpDetail chatroom_rank_jump_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo create_jump_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpDetail find_more_chatroom_jump_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo find_more_jump_info;
    public boolean show_entrance;
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo> chatroom_info_list = new java.util.LinkedList<>();
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.BanAction> ban_action_list = new java.util.LinkedList<>();

    public static final com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse getCanJoinChatroomResponse = (com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse) fVar;
        return n51.f.a(this.BaseResponse, getCanJoinChatroomResponse.BaseResponse) && n51.f.a(this.chatroom_info_list, getCanJoinChatroomResponse.chatroom_info_list) && n51.f.a(this.create_jump_info, getCanJoinChatroomResponse.create_jump_info) && n51.f.a(this.ban_action_list, getCanJoinChatroomResponse.ban_action_list) && n51.f.a(java.lang.Boolean.valueOf(this.show_entrance), java.lang.Boolean.valueOf(getCanJoinChatroomResponse.show_entrance)) && n51.f.a(this.find_more_jump_info, getCanJoinChatroomResponse.find_more_jump_info) && n51.f.a(this.find_more_chatroom_jump_info, getCanJoinChatroomResponse.find_more_chatroom_jump_info) && n51.f.a(this.chatroom_rank_jump_info, getCanJoinChatroomResponse.chatroom_rank_jump_info);
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
            fVar.g(2, 8, this.chatroom_info_list);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.create_jump_info;
            if (jumpInfo != null) {
                fVar.i(3, jumpInfo.computeSize());
                this.create_jump_info.writeFields(fVar);
            }
            fVar.g(4, 8, this.ban_action_list);
            fVar.a(5, this.show_entrance);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = this.find_more_jump_info;
            if (jumpInfo2 != null) {
                fVar.i(6, jumpInfo2.computeSize());
                this.find_more_jump_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpDetail chatroomJumpDetail = this.find_more_chatroom_jump_info;
            if (chatroomJumpDetail != null) {
                fVar.i(7, chatroomJumpDetail.computeSize());
                this.find_more_chatroom_jump_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpDetail chatroomJumpDetail2 = this.chatroom_rank_jump_info;
            if (chatroomJumpDetail2 != null) {
                fVar.i(8, chatroomJumpDetail2.computeSize());
                this.chatroom_rank_jump_info.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, this.chatroom_info_list);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo3 = this.create_jump_info;
            if (jumpInfo3 != null) {
                i18 += b36.f.i(3, jumpInfo3.computeSize());
            }
            int g17 = i18 + b36.f.g(4, 8, this.ban_action_list) + b36.f.a(5, this.show_entrance);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo4 = this.find_more_jump_info;
            if (jumpInfo4 != null) {
                g17 += b36.f.i(6, jumpInfo4.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpDetail chatroomJumpDetail3 = this.find_more_chatroom_jump_info;
            if (chatroomJumpDetail3 != null) {
                g17 += b36.f.i(7, chatroomJumpDetail3.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpDetail chatroomJumpDetail4 = this.chatroom_rank_jump_info;
            return chatroomJumpDetail4 != null ? g17 + b36.f.i(8, chatroomJumpDetail4.computeSize()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.chatroom_info_list.clear();
            this.ban_action_list.clear();
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
        com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse getCanJoinChatroomResponse = (com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse) objArr[1];
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
                    getCanJoinChatroomResponse.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo chatroomRecInfo = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo();
                    if (bArr3 != null && bArr3.length > 0) {
                        chatroomRecInfo.parseFrom(bArr3);
                    }
                    getCanJoinChatroomResponse.chatroom_info_list.add(chatroomRecInfo);
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo5 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
                    if (bArr4 != null && bArr4.length > 0) {
                        jumpInfo5.parseFrom(bArr4);
                    }
                    getCanJoinChatroomResponse.create_jump_info = jumpInfo5;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    com.tencent.mm.plugin.game.autogen.chatroom.BanAction banAction = new com.tencent.mm.plugin.game.autogen.chatroom.BanAction();
                    if (bArr5 != null && bArr5.length > 0) {
                        banAction.parseFrom(bArr5);
                    }
                    getCanJoinChatroomResponse.ban_action_list.add(banAction);
                }
                return 0;
            case 5:
                getCanJoinChatroomResponse.show_entrance = aVar2.c(intValue);
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo6 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
                    if (bArr6 != null && bArr6.length > 0) {
                        jumpInfo6.parseFrom(bArr6);
                    }
                    getCanJoinChatroomResponse.find_more_jump_info = jumpInfo6;
                }
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpDetail chatroomJumpDetail5 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpDetail();
                    if (bArr7 != null && bArr7.length > 0) {
                        chatroomJumpDetail5.parseFrom(bArr7);
                    }
                    getCanJoinChatroomResponse.find_more_chatroom_jump_info = chatroomJumpDetail5;
                }
                return 0;
            case 8:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpDetail chatroomJumpDetail6 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpDetail();
                    if (bArr8 != null && bArr8.length > 0) {
                        chatroomJumpDetail6.parseFrom(bArr8);
                    }
                    getCanJoinChatroomResponse.chatroom_rank_jump_info = chatroomJumpDetail6;
                }
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse setBan_action_list(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.BanAction> linkedList) {
        this.ban_action_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse setChatroom_info_list(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo> linkedList) {
        this.chatroom_info_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse setChatroom_rank_jump_info(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpDetail chatroomJumpDetail) {
        this.chatroom_rank_jump_info = chatroomJumpDetail;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse setCreate_jump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.create_jump_info = jumpInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse setFind_more_chatroom_jump_info(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpDetail chatroomJumpDetail) {
        this.find_more_chatroom_jump_info = chatroomJumpDetail;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse setFind_more_jump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.find_more_jump_info = jumpInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse setShow_entrance(boolean z17) {
        this.show_entrance = z17;
        return this;
    }
}
