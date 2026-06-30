package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class GetChatroomBaseInfoResponse extends r45.js5 {
    public com.tencent.mm.plugin.game.autogen.chatroom.Background background;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo channel_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomButton chatroom_button;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomEnterInfo chatroom_enter_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo control_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData current_chatroom_data;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData current_user_data;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomExternInfo extern_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.FirstEnterNotify first_enter_notify;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpInfo jump_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.MsgBaseInfo msg_base_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPreloadInfo preload_info;
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.RobotInfo> robot_info_list = new java.util.LinkedList<>();

    public static final com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse getChatroomBaseInfoResponse = (com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse) fVar;
        return n51.f.a(this.BaseResponse, getChatroomBaseInfoResponse.BaseResponse) && n51.f.a(this.current_user_data, getChatroomBaseInfoResponse.current_user_data) && n51.f.a(this.current_chatroom_data, getChatroomBaseInfoResponse.current_chatroom_data) && n51.f.a(this.chatroom_button, getChatroomBaseInfoResponse.chatroom_button) && n51.f.a(this.control_info, getChatroomBaseInfoResponse.control_info) && n51.f.a(this.preload_info, getChatroomBaseInfoResponse.preload_info) && n51.f.a(this.robot_info_list, getChatroomBaseInfoResponse.robot_info_list) && n51.f.a(this.jump_info, getChatroomBaseInfoResponse.jump_info) && n51.f.a(this.extern_info, getChatroomBaseInfoResponse.extern_info) && n51.f.a(this.channel_info, getChatroomBaseInfoResponse.channel_info) && n51.f.a(this.msg_base_info, getChatroomBaseInfoResponse.msg_base_info) && n51.f.a(this.first_enter_notify, getChatroomBaseInfoResponse.first_enter_notify) && n51.f.a(this.chatroom_enter_info, getChatroomBaseInfoResponse.chatroom_enter_info) && n51.f.a(this.background, getChatroomBaseInfoResponse.background);
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
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData = this.current_user_data;
            if (chatroomUserData != null) {
                fVar.i(2, chatroomUserData.computeSize());
                this.current_user_data.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData = this.current_chatroom_data;
            if (chatroomData != null) {
                fVar.i(3, chatroomData.computeSize());
                this.current_chatroom_data.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomButton chatroomButton = this.chatroom_button;
            if (chatroomButton != null) {
                fVar.i(4, chatroomButton.computeSize());
                this.chatroom_button.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo realtimeControlInfo = this.control_info;
            if (realtimeControlInfo != null) {
                fVar.i(5, realtimeControlInfo.computeSize());
                this.control_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPreloadInfo chatroomPreloadInfo = this.preload_info;
            if (chatroomPreloadInfo != null) {
                fVar.i(6, chatroomPreloadInfo.computeSize());
                this.preload_info.writeFields(fVar);
            }
            fVar.g(7, 8, this.robot_info_list);
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpInfo chatroomJumpInfo = this.jump_info;
            if (chatroomJumpInfo != null) {
                fVar.i(8, chatroomJumpInfo.computeSize());
                this.jump_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomExternInfo chatroomExternInfo = this.extern_info;
            if (chatroomExternInfo != null) {
                fVar.i(9, chatroomExternInfo.computeSize());
                this.extern_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo channelInfo = this.channel_info;
            if (channelInfo != null) {
                fVar.i(10, channelInfo.computeSize());
                this.channel_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.MsgBaseInfo msgBaseInfo = this.msg_base_info;
            if (msgBaseInfo != null) {
                fVar.i(11, msgBaseInfo.computeSize());
                this.msg_base_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.FirstEnterNotify firstEnterNotify = this.first_enter_notify;
            if (firstEnterNotify != null) {
                fVar.i(12, firstEnterNotify.computeSize());
                this.first_enter_notify.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomEnterInfo chatroomEnterInfo = this.chatroom_enter_info;
            if (chatroomEnterInfo != null) {
                fVar.i(13, chatroomEnterInfo.computeSize());
                this.chatroom_enter_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.Background background = this.background;
            if (background != null) {
                fVar.i(14, background.computeSize());
                this.background.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0;
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData2 = this.current_user_data;
            if (chatroomUserData2 != null) {
                i18 += b36.f.i(2, chatroomUserData2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData2 = this.current_chatroom_data;
            if (chatroomData2 != null) {
                i18 += b36.f.i(3, chatroomData2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomButton chatroomButton2 = this.chatroom_button;
            if (chatroomButton2 != null) {
                i18 += b36.f.i(4, chatroomButton2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo realtimeControlInfo2 = this.control_info;
            if (realtimeControlInfo2 != null) {
                i18 += b36.f.i(5, realtimeControlInfo2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPreloadInfo chatroomPreloadInfo2 = this.preload_info;
            if (chatroomPreloadInfo2 != null) {
                i18 += b36.f.i(6, chatroomPreloadInfo2.computeSize());
            }
            int g17 = i18 + b36.f.g(7, 8, this.robot_info_list);
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpInfo chatroomJumpInfo2 = this.jump_info;
            if (chatroomJumpInfo2 != null) {
                g17 += b36.f.i(8, chatroomJumpInfo2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomExternInfo chatroomExternInfo2 = this.extern_info;
            if (chatroomExternInfo2 != null) {
                g17 += b36.f.i(9, chatroomExternInfo2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo channelInfo2 = this.channel_info;
            if (channelInfo2 != null) {
                g17 += b36.f.i(10, channelInfo2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.MsgBaseInfo msgBaseInfo2 = this.msg_base_info;
            if (msgBaseInfo2 != null) {
                g17 += b36.f.i(11, msgBaseInfo2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.FirstEnterNotify firstEnterNotify2 = this.first_enter_notify;
            if (firstEnterNotify2 != null) {
                g17 += b36.f.i(12, firstEnterNotify2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomEnterInfo chatroomEnterInfo2 = this.chatroom_enter_info;
            if (chatroomEnterInfo2 != null) {
                g17 += b36.f.i(13, chatroomEnterInfo2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.Background background2 = this.background;
            return background2 != null ? g17 + b36.f.i(14, background2.computeSize()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.robot_info_list.clear();
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
        com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse getChatroomBaseInfoResponse = (com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse) objArr[1];
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
                    getChatroomBaseInfoResponse.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData();
                    if (bArr3 != null && bArr3.length > 0) {
                        chatroomUserData3.parseFrom(bArr3);
                    }
                    getChatroomBaseInfoResponse.current_user_data = chatroomUserData3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData();
                    if (bArr4 != null && bArr4.length > 0) {
                        chatroomData3.parseFrom(bArr4);
                    }
                    getChatroomBaseInfoResponse.current_chatroom_data = chatroomData3;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomButton chatroomButton3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomButton();
                    if (bArr5 != null && bArr5.length > 0) {
                        chatroomButton3.parseFrom(bArr5);
                    }
                    getChatroomBaseInfoResponse.chatroom_button = chatroomButton3;
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo realtimeControlInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo();
                    if (bArr6 != null && bArr6.length > 0) {
                        realtimeControlInfo3.parseFrom(bArr6);
                    }
                    getChatroomBaseInfoResponse.control_info = realtimeControlInfo3;
                }
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPreloadInfo chatroomPreloadInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPreloadInfo();
                    if (bArr7 != null && bArr7.length > 0) {
                        chatroomPreloadInfo3.parseFrom(bArr7);
                    }
                    getChatroomBaseInfoResponse.preload_info = chatroomPreloadInfo3;
                }
                return 0;
            case 7:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    com.tencent.mm.plugin.game.autogen.chatroom.RobotInfo robotInfo = new com.tencent.mm.plugin.game.autogen.chatroom.RobotInfo();
                    if (bArr8 != null && bArr8.length > 0) {
                        robotInfo.parseFrom(bArr8);
                    }
                    getChatroomBaseInfoResponse.robot_info_list.add(robotInfo);
                }
                return 0;
            case 8:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpInfo chatroomJumpInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpInfo();
                    if (bArr9 != null && bArr9.length > 0) {
                        chatroomJumpInfo3.parseFrom(bArr9);
                    }
                    getChatroomBaseInfoResponse.jump_info = chatroomJumpInfo3;
                }
                return 0;
            case 9:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomExternInfo chatroomExternInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomExternInfo();
                    if (bArr10 != null && bArr10.length > 0) {
                        chatroomExternInfo3.parseFrom(bArr10);
                    }
                    getChatroomBaseInfoResponse.extern_info = chatroomExternInfo3;
                }
                return 0;
            case 10:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr11 = (byte[]) j47.get(i49);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo channelInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo();
                    if (bArr11 != null && bArr11.length > 0) {
                        channelInfo3.parseFrom(bArr11);
                    }
                    getChatroomBaseInfoResponse.channel_info = channelInfo3;
                }
                return 0;
            case 11:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr12 = (byte[]) j48.get(i57);
                    com.tencent.mm.plugin.game.autogen.chatroom.MsgBaseInfo msgBaseInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.MsgBaseInfo();
                    if (bArr12 != null && bArr12.length > 0) {
                        msgBaseInfo3.parseFrom(bArr12);
                    }
                    getChatroomBaseInfoResponse.msg_base_info = msgBaseInfo3;
                }
                return 0;
            case 12:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr13 = (byte[]) j49.get(i58);
                    com.tencent.mm.plugin.game.autogen.chatroom.FirstEnterNotify firstEnterNotify3 = new com.tencent.mm.plugin.game.autogen.chatroom.FirstEnterNotify();
                    if (bArr13 != null && bArr13.length > 0) {
                        firstEnterNotify3.parseFrom(bArr13);
                    }
                    getChatroomBaseInfoResponse.first_enter_notify = firstEnterNotify3;
                }
                return 0;
            case 13:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr14 = (byte[]) j57.get(i59);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomEnterInfo chatroomEnterInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomEnterInfo();
                    if (bArr14 != null && bArr14.length > 0) {
                        chatroomEnterInfo3.parseFrom(bArr14);
                    }
                    getChatroomBaseInfoResponse.chatroom_enter_info = chatroomEnterInfo3;
                }
                return 0;
            case 14:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr15 = (byte[]) j58.get(i66);
                    com.tencent.mm.plugin.game.autogen.chatroom.Background background3 = new com.tencent.mm.plugin.game.autogen.chatroom.Background();
                    if (bArr15 != null && bArr15.length > 0) {
                        background3.parseFrom(bArr15);
                    }
                    getChatroomBaseInfoResponse.background = background3;
                }
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse setBackground(com.tencent.mm.plugin.game.autogen.chatroom.Background background) {
        this.background = background;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse setChannel_info(com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo channelInfo) {
        this.channel_info = channelInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse setChatroom_button(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomButton chatroomButton) {
        this.chatroom_button = chatroomButton;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse setChatroom_enter_info(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomEnterInfo chatroomEnterInfo) {
        this.chatroom_enter_info = chatroomEnterInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse setControl_info(com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo realtimeControlInfo) {
        this.control_info = realtimeControlInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse setCurrent_chatroom_data(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData) {
        this.current_chatroom_data = chatroomData;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse setCurrent_user_data(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData) {
        this.current_user_data = chatroomUserData;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse setExtern_info(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomExternInfo chatroomExternInfo) {
        this.extern_info = chatroomExternInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse setFirst_enter_notify(com.tencent.mm.plugin.game.autogen.chatroom.FirstEnterNotify firstEnterNotify) {
        this.first_enter_notify = firstEnterNotify;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse setJump_info(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpInfo chatroomJumpInfo) {
        this.jump_info = chatroomJumpInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse setMsg_base_info(com.tencent.mm.plugin.game.autogen.chatroom.MsgBaseInfo msgBaseInfo) {
        this.msg_base_info = msgBaseInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse setPreload_info(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPreloadInfo chatroomPreloadInfo) {
        this.preload_info = chatroomPreloadInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse setRobot_info_list(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.RobotInfo> linkedList) {
        this.robot_info_list = linkedList;
        return this;
    }
}
