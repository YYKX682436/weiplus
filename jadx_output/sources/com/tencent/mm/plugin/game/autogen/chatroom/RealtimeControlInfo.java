package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class RealtimeControlInfo extends com.tencent.mm.protobuf.f {
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomBanAction chatroom_ban_action;
    public boolean disable_emoji;
    public boolean enable_custom_emoji;
    public com.tencent.mm.plugin.game.autogen.chatroom.KickOutCardInfo kick_out_card_info;
    public java.lang.String kick_out_wording;
    public com.tencent.mm.plugin.game.autogen.chatroom.PremadeCardInfo premade_card_info;
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData> update_user_data_list = new java.util.LinkedList<>();
    public com.tencent.mm.plugin.game.autogen.chatroom.UserBanAction user_ban_action;
    public int user_chatroom_relation;
    public java.lang.String version;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo realtimeControlInfo = (com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.user_chatroom_relation), java.lang.Integer.valueOf(realtimeControlInfo.user_chatroom_relation)) && n51.f.a(this.user_ban_action, realtimeControlInfo.user_ban_action) && n51.f.a(this.chatroom_ban_action, realtimeControlInfo.chatroom_ban_action) && n51.f.a(this.version, realtimeControlInfo.version) && n51.f.a(this.kick_out_wording, realtimeControlInfo.kick_out_wording) && n51.f.a(this.update_user_data_list, realtimeControlInfo.update_user_data_list) && n51.f.a(java.lang.Boolean.valueOf(this.disable_emoji), java.lang.Boolean.valueOf(realtimeControlInfo.disable_emoji)) && n51.f.a(this.premade_card_info, realtimeControlInfo.premade_card_info) && n51.f.a(java.lang.Boolean.valueOf(this.enable_custom_emoji), java.lang.Boolean.valueOf(realtimeControlInfo.enable_custom_emoji)) && n51.f.a(this.kick_out_card_info, realtimeControlInfo.kick_out_card_info);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.user_chatroom_relation);
            com.tencent.mm.plugin.game.autogen.chatroom.UserBanAction userBanAction = this.user_ban_action;
            if (userBanAction != null) {
                fVar.i(2, userBanAction.computeSize());
                this.user_ban_action.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomBanAction chatroomBanAction = this.chatroom_ban_action;
            if (chatroomBanAction != null) {
                fVar.i(3, chatroomBanAction.computeSize());
                this.chatroom_ban_action.writeFields(fVar);
            }
            java.lang.String str = this.version;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.kick_out_wording;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.g(6, 8, this.update_user_data_list);
            fVar.a(7, this.disable_emoji);
            com.tencent.mm.plugin.game.autogen.chatroom.PremadeCardInfo premadeCardInfo = this.premade_card_info;
            if (premadeCardInfo != null) {
                fVar.i(8, premadeCardInfo.computeSize());
                this.premade_card_info.writeFields(fVar);
            }
            fVar.a(9, this.enable_custom_emoji);
            com.tencent.mm.plugin.game.autogen.chatroom.KickOutCardInfo kickOutCardInfo = this.kick_out_card_info;
            if (kickOutCardInfo != null) {
                fVar.i(10, kickOutCardInfo.computeSize());
                this.kick_out_card_info.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.user_chatroom_relation) + 0;
            com.tencent.mm.plugin.game.autogen.chatroom.UserBanAction userBanAction2 = this.user_ban_action;
            if (userBanAction2 != null) {
                e17 += b36.f.i(2, userBanAction2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomBanAction chatroomBanAction2 = this.chatroom_ban_action;
            if (chatroomBanAction2 != null) {
                e17 += b36.f.i(3, chatroomBanAction2.computeSize());
            }
            java.lang.String str3 = this.version;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.kick_out_wording;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            int g17 = e17 + b36.f.g(6, 8, this.update_user_data_list) + b36.f.a(7, this.disable_emoji);
            com.tencent.mm.plugin.game.autogen.chatroom.PremadeCardInfo premadeCardInfo2 = this.premade_card_info;
            if (premadeCardInfo2 != null) {
                g17 += b36.f.i(8, premadeCardInfo2.computeSize());
            }
            int a17 = g17 + b36.f.a(9, this.enable_custom_emoji);
            com.tencent.mm.plugin.game.autogen.chatroom.KickOutCardInfo kickOutCardInfo2 = this.kick_out_card_info;
            return kickOutCardInfo2 != null ? a17 + b36.f.i(10, kickOutCardInfo2.computeSize()) : a17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.update_user_data_list.clear();
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
        com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo realtimeControlInfo = (com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                realtimeControlInfo.user_chatroom_relation = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    com.tencent.mm.plugin.game.autogen.chatroom.UserBanAction userBanAction3 = new com.tencent.mm.plugin.game.autogen.chatroom.UserBanAction();
                    if (bArr2 != null && bArr2.length > 0) {
                        userBanAction3.parseFrom(bArr2);
                    }
                    realtimeControlInfo.user_ban_action = userBanAction3;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomBanAction chatroomBanAction3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomBanAction();
                    if (bArr3 != null && bArr3.length > 0) {
                        chatroomBanAction3.parseFrom(bArr3);
                    }
                    realtimeControlInfo.chatroom_ban_action = chatroomBanAction3;
                }
                return 0;
            case 4:
                realtimeControlInfo.version = aVar2.k(intValue);
                return 0;
            case 5:
                realtimeControlInfo.kick_out_wording = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData();
                    if (bArr4 != null && bArr4.length > 0) {
                        chatroomUserData.parseFrom(bArr4);
                    }
                    realtimeControlInfo.update_user_data_list.add(chatroomUserData);
                }
                return 0;
            case 7:
                realtimeControlInfo.disable_emoji = aVar2.c(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    com.tencent.mm.plugin.game.autogen.chatroom.PremadeCardInfo premadeCardInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.PremadeCardInfo();
                    if (bArr5 != null && bArr5.length > 0) {
                        premadeCardInfo3.parseFrom(bArr5);
                    }
                    realtimeControlInfo.premade_card_info = premadeCardInfo3;
                }
                return 0;
            case 9:
                realtimeControlInfo.enable_custom_emoji = aVar2.c(intValue);
                return 0;
            case 10:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    com.tencent.mm.plugin.game.autogen.chatroom.KickOutCardInfo kickOutCardInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.KickOutCardInfo();
                    if (bArr6 != null && bArr6.length > 0) {
                        kickOutCardInfo3.parseFrom(bArr6);
                    }
                    realtimeControlInfo.kick_out_card_info = kickOutCardInfo3;
                }
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo setChatroom_ban_action(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomBanAction chatroomBanAction) {
        this.chatroom_ban_action = chatroomBanAction;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo setDisable_emoji(boolean z17) {
        this.disable_emoji = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo setEnable_custom_emoji(boolean z17) {
        this.enable_custom_emoji = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo setKick_out_card_info(com.tencent.mm.plugin.game.autogen.chatroom.KickOutCardInfo kickOutCardInfo) {
        this.kick_out_card_info = kickOutCardInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo setKick_out_wording(java.lang.String str) {
        this.kick_out_wording = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo setPremade_card_info(com.tencent.mm.plugin.game.autogen.chatroom.PremadeCardInfo premadeCardInfo) {
        this.premade_card_info = premadeCardInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo setUpdate_user_data_list(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData> linkedList) {
        this.update_user_data_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo setUser_ban_action(com.tencent.mm.plugin.game.autogen.chatroom.UserBanAction userBanAction) {
        this.user_ban_action = userBanAction;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo setUser_chatroom_relation(int i17) {
        this.user_chatroom_relation = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.RealtimeControlInfo setVersion(java.lang.String str) {
        this.version = str;
        return this;
    }
}
