package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes8.dex */
public class ChatroomData extends com.tencent.mm.protobuf.f {
    public com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo admin_info;
    public int allow_user_num;
    public java.lang.String announcement;
    public java.lang.String appid;
    public java.lang.String application_question;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo apply_jump_info;
    public boolean can_chat;
    public boolean can_join;
    public boolean can_onlooker;
    public java.lang.String chatroom_icon;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo chatroom_member_jump_info;
    public java.lang.String chatroom_name;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo chatroom_profile_jump_info;
    public int chatroom_type;
    public boolean is_private;
    public int kick_out_type;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomNotice notice;
    public java.lang.String report_str;
    public int room_member_num;
    public java.lang.String room_name;
    public boolean top_chatroom;
    public int user_chatroom_relation;
    public java.lang.String version;
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.RestrictRule> rule_list = new java.util.LinkedList<>();
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomTag> chatroom_tag_list = new java.util.LinkedList<>();

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData) fVar;
        return n51.f.a(this.chatroom_name, chatroomData.chatroom_name) && n51.f.a(this.room_name, chatroomData.room_name) && n51.f.a(this.chatroom_icon, chatroomData.chatroom_icon) && n51.f.a(this.appid, chatroomData.appid) && n51.f.a(this.admin_info, chatroomData.admin_info) && n51.f.a(java.lang.Integer.valueOf(this.chatroom_type), java.lang.Integer.valueOf(chatroomData.chatroom_type)) && n51.f.a(java.lang.Boolean.valueOf(this.is_private), java.lang.Boolean.valueOf(chatroomData.is_private)) && n51.f.a(this.announcement, chatroomData.announcement) && n51.f.a(java.lang.Integer.valueOf(this.user_chatroom_relation), java.lang.Integer.valueOf(chatroomData.user_chatroom_relation)) && n51.f.a(java.lang.Integer.valueOf(this.room_member_num), java.lang.Integer.valueOf(chatroomData.room_member_num)) && n51.f.a(this.rule_list, chatroomData.rule_list) && n51.f.a(java.lang.Boolean.valueOf(this.can_join), java.lang.Boolean.valueOf(chatroomData.can_join)) && n51.f.a(java.lang.Boolean.valueOf(this.can_onlooker), java.lang.Boolean.valueOf(chatroomData.can_onlooker)) && n51.f.a(java.lang.Boolean.valueOf(this.can_chat), java.lang.Boolean.valueOf(chatroomData.can_chat)) && n51.f.a(this.application_question, chatroomData.application_question) && n51.f.a(this.version, chatroomData.version) && n51.f.a(this.apply_jump_info, chatroomData.apply_jump_info) && n51.f.a(this.chatroom_profile_jump_info, chatroomData.chatroom_profile_jump_info) && n51.f.a(java.lang.Integer.valueOf(this.kick_out_type), java.lang.Integer.valueOf(chatroomData.kick_out_type)) && n51.f.a(this.chatroom_member_jump_info, chatroomData.chatroom_member_jump_info) && n51.f.a(this.notice, chatroomData.notice) && n51.f.a(java.lang.Boolean.valueOf(this.top_chatroom), java.lang.Boolean.valueOf(chatroomData.top_chatroom)) && n51.f.a(this.chatroom_tag_list, chatroomData.chatroom_tag_list) && n51.f.a(java.lang.Integer.valueOf(this.allow_user_num), java.lang.Integer.valueOf(chatroomData.allow_user_num)) && n51.f.a(this.report_str, chatroomData.report_str);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.chatroom_name;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.room_name;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.chatroom_icon;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.appid;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo adminInfo = this.admin_info;
            if (adminInfo != null) {
                fVar.i(5, adminInfo.computeSize());
                this.admin_info.writeFields(fVar);
            }
            fVar.e(6, this.chatroom_type);
            fVar.a(7, this.is_private);
            java.lang.String str5 = this.announcement;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.e(9, this.user_chatroom_relation);
            fVar.e(10, this.room_member_num);
            fVar.g(11, 8, this.rule_list);
            fVar.a(12, this.can_join);
            fVar.a(13, this.can_onlooker);
            fVar.a(14, this.can_chat);
            java.lang.String str6 = this.application_question;
            if (str6 != null) {
                fVar.j(15, str6);
            }
            java.lang.String str7 = this.version;
            if (str7 != null) {
                fVar.j(16, str7);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.apply_jump_info;
            if (jumpInfo != null) {
                fVar.i(17, jumpInfo.computeSize());
                this.apply_jump_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = this.chatroom_profile_jump_info;
            if (jumpInfo2 != null) {
                fVar.i(18, jumpInfo2.computeSize());
                this.chatroom_profile_jump_info.writeFields(fVar);
            }
            fVar.e(19, this.kick_out_type);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo3 = this.chatroom_member_jump_info;
            if (jumpInfo3 != null) {
                fVar.i(20, jumpInfo3.computeSize());
                this.chatroom_member_jump_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomNotice chatroomNotice = this.notice;
            if (chatroomNotice != null) {
                fVar.i(21, chatroomNotice.computeSize());
                this.notice.writeFields(fVar);
            }
            fVar.a(22, this.top_chatroom);
            fVar.g(23, 8, this.chatroom_tag_list);
            fVar.e(24, this.allow_user_num);
            java.lang.String str8 = this.report_str;
            if (str8 != null) {
                fVar.j(25, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.chatroom_name;
            int j17 = str9 != null ? b36.f.j(1, str9) + 0 : 0;
            java.lang.String str10 = this.room_name;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.chatroom_icon;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.appid;
            if (str12 != null) {
                j17 += b36.f.j(4, str12);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo adminInfo2 = this.admin_info;
            if (adminInfo2 != null) {
                j17 += b36.f.i(5, adminInfo2.computeSize());
            }
            int e17 = j17 + b36.f.e(6, this.chatroom_type) + b36.f.a(7, this.is_private);
            java.lang.String str13 = this.announcement;
            if (str13 != null) {
                e17 += b36.f.j(8, str13);
            }
            int e18 = e17 + b36.f.e(9, this.user_chatroom_relation) + b36.f.e(10, this.room_member_num) + b36.f.g(11, 8, this.rule_list) + b36.f.a(12, this.can_join) + b36.f.a(13, this.can_onlooker) + b36.f.a(14, this.can_chat);
            java.lang.String str14 = this.application_question;
            if (str14 != null) {
                e18 += b36.f.j(15, str14);
            }
            java.lang.String str15 = this.version;
            if (str15 != null) {
                e18 += b36.f.j(16, str15);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo4 = this.apply_jump_info;
            if (jumpInfo4 != null) {
                e18 += b36.f.i(17, jumpInfo4.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo5 = this.chatroom_profile_jump_info;
            if (jumpInfo5 != null) {
                e18 += b36.f.i(18, jumpInfo5.computeSize());
            }
            int e19 = e18 + b36.f.e(19, this.kick_out_type);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo6 = this.chatroom_member_jump_info;
            if (jumpInfo6 != null) {
                e19 += b36.f.i(20, jumpInfo6.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomNotice chatroomNotice2 = this.notice;
            if (chatroomNotice2 != null) {
                e19 += b36.f.i(21, chatroomNotice2.computeSize());
            }
            int a17 = e19 + b36.f.a(22, this.top_chatroom) + b36.f.g(23, 8, this.chatroom_tag_list) + b36.f.e(24, this.allow_user_num);
            java.lang.String str16 = this.report_str;
            return str16 != null ? a17 + b36.f.j(25, str16) : a17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.rule_list.clear();
            this.chatroom_tag_list.clear();
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
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData chatroomData = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                chatroomData.chatroom_name = aVar2.k(intValue);
                return 0;
            case 2:
                chatroomData.room_name = aVar2.k(intValue);
                return 0;
            case 3:
                chatroomData.chatroom_icon = aVar2.k(intValue);
                return 0;
            case 4:
                chatroomData.appid = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo adminInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo();
                    if (bArr2 != null && bArr2.length > 0) {
                        adminInfo3.parseFrom(bArr2);
                    }
                    chatroomData.admin_info = adminInfo3;
                }
                return 0;
            case 6:
                chatroomData.chatroom_type = aVar2.g(intValue);
                return 0;
            case 7:
                chatroomData.is_private = aVar2.c(intValue);
                return 0;
            case 8:
                chatroomData.announcement = aVar2.k(intValue);
                return 0;
            case 9:
                chatroomData.user_chatroom_relation = aVar2.g(intValue);
                return 0;
            case 10:
                chatroomData.room_member_num = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    com.tencent.mm.plugin.game.autogen.chatroom.RestrictRule restrictRule = new com.tencent.mm.plugin.game.autogen.chatroom.RestrictRule();
                    if (bArr3 != null && bArr3.length > 0) {
                        restrictRule.parseFrom(bArr3);
                    }
                    chatroomData.rule_list.add(restrictRule);
                }
                return 0;
            case 12:
                chatroomData.can_join = aVar2.c(intValue);
                return 0;
            case 13:
                chatroomData.can_onlooker = aVar2.c(intValue);
                return 0;
            case 14:
                chatroomData.can_chat = aVar2.c(intValue);
                return 0;
            case 15:
                chatroomData.application_question = aVar2.k(intValue);
                return 0;
            case 16:
                chatroomData.version = aVar2.k(intValue);
                return 0;
            case 17:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo7 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
                    if (bArr4 != null && bArr4.length > 0) {
                        jumpInfo7.parseFrom(bArr4);
                    }
                    chatroomData.apply_jump_info = jumpInfo7;
                }
                return 0;
            case 18:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo8 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
                    if (bArr5 != null && bArr5.length > 0) {
                        jumpInfo8.parseFrom(bArr5);
                    }
                    chatroomData.chatroom_profile_jump_info = jumpInfo8;
                }
                return 0;
            case 19:
                chatroomData.kick_out_type = aVar2.g(intValue);
                return 0;
            case 20:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j29.get(i29);
                    com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo9 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
                    if (bArr6 != null && bArr6.length > 0) {
                        jumpInfo9.parseFrom(bArr6);
                    }
                    chatroomData.chatroom_member_jump_info = jumpInfo9;
                }
                return 0;
            case 21:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size6 = j37.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j37.get(i37);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomNotice chatroomNotice3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomNotice();
                    if (bArr7 != null && bArr7.length > 0) {
                        chatroomNotice3.parseFrom(bArr7);
                    }
                    chatroomData.notice = chatroomNotice3;
                }
                return 0;
            case 22:
                chatroomData.top_chatroom = aVar2.c(intValue);
                return 0;
            case 23:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size7 = j38.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j38.get(i38);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomTag chatroomTag = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomTag();
                    if (bArr8 != null && bArr8.length > 0) {
                        chatroomTag.parseFrom(bArr8);
                    }
                    chatroomData.chatroom_tag_list.add(chatroomTag);
                }
                return 0;
            case 24:
                chatroomData.allow_user_num = aVar2.g(intValue);
                return 0;
            case 25:
                chatroomData.report_str = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData setAdmin_info(com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo adminInfo) {
        this.admin_info = adminInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData setAllow_user_num(int i17) {
        this.allow_user_num = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData setAnnouncement(java.lang.String str) {
        this.announcement = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData setAppid(java.lang.String str) {
        this.appid = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData setApplication_question(java.lang.String str) {
        this.application_question = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData setApply_jump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.apply_jump_info = jumpInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData setCan_chat(boolean z17) {
        this.can_chat = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData setCan_join(boolean z17) {
        this.can_join = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData setCan_onlooker(boolean z17) {
        this.can_onlooker = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData setChatroom_icon(java.lang.String str) {
        this.chatroom_icon = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData setChatroom_member_jump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.chatroom_member_jump_info = jumpInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData setChatroom_name(java.lang.String str) {
        this.chatroom_name = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData setChatroom_profile_jump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.chatroom_profile_jump_info = jumpInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData setChatroom_tag_list(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomTag> linkedList) {
        this.chatroom_tag_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData setChatroom_type(int i17) {
        this.chatroom_type = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData setIs_private(boolean z17) {
        this.is_private = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData setKick_out_type(int i17) {
        this.kick_out_type = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData setNotice(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomNotice chatroomNotice) {
        this.notice = chatroomNotice;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData setReport_str(java.lang.String str) {
        this.report_str = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData setRoom_member_num(int i17) {
        this.room_member_num = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData setRoom_name(java.lang.String str) {
        this.room_name = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData setRule_list(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.RestrictRule> linkedList) {
        this.rule_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData setTop_chatroom(boolean z17) {
        this.top_chatroom = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData setUser_chatroom_relation(int i17) {
        this.user_chatroom_relation = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData setVersion(java.lang.String str) {
        this.version = str;
        return this;
    }
}
