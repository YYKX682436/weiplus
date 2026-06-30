package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class ChatroomUserData extends com.tencent.mm.protobuf.f {
    public java.lang.String avatar;
    public boolean can_at_all;
    public boolean can_be_at;
    public boolean can_be_kicked;
    public boolean can_kick_member;
    public java.lang.String chatroom_name;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo create_account_jump_info;
    public java.lang.String extern_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo h5_profile_jump_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.AccountIdentityInfo indentity;
    public boolean is_authorized;
    public boolean is_robot;
    public boolean is_self;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jump_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.LbsInfo lbs_info;
    public java.lang.String nickname;
    public int role;
    public int sex;
    public java.lang.String signature;
    public com.tencent.mm.plugin.game.autogen.chatroom.TagInfo tag_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.UserRole user_role;
    public java.lang.String username;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData) fVar;
        return n51.f.a(this.username, chatroomUserData.username) && n51.f.a(this.nickname, chatroomUserData.nickname) && n51.f.a(this.avatar, chatroomUserData.avatar) && n51.f.a(java.lang.Integer.valueOf(this.sex), java.lang.Integer.valueOf(chatroomUserData.sex)) && n51.f.a(this.jump_info, chatroomUserData.jump_info) && n51.f.a(this.signature, chatroomUserData.signature) && n51.f.a(java.lang.Boolean.valueOf(this.is_authorized), java.lang.Boolean.valueOf(chatroomUserData.is_authorized)) && n51.f.a(this.tag_info, chatroomUserData.tag_info) && n51.f.a(this.lbs_info, chatroomUserData.lbs_info) && n51.f.a(this.chatroom_name, chatroomUserData.chatroom_name) && n51.f.a(java.lang.Integer.valueOf(this.role), java.lang.Integer.valueOf(chatroomUserData.role)) && n51.f.a(java.lang.Boolean.valueOf(this.can_be_at), java.lang.Boolean.valueOf(chatroomUserData.can_be_at)) && n51.f.a(java.lang.Boolean.valueOf(this.is_robot), java.lang.Boolean.valueOf(chatroomUserData.is_robot)) && n51.f.a(java.lang.Boolean.valueOf(this.can_kick_member), java.lang.Boolean.valueOf(chatroomUserData.can_kick_member)) && n51.f.a(this.user_role, chatroomUserData.user_role) && n51.f.a(java.lang.Boolean.valueOf(this.can_be_kicked), java.lang.Boolean.valueOf(chatroomUserData.can_be_kicked)) && n51.f.a(java.lang.Boolean.valueOf(this.can_at_all), java.lang.Boolean.valueOf(chatroomUserData.can_at_all)) && n51.f.a(this.h5_profile_jump_info, chatroomUserData.h5_profile_jump_info) && n51.f.a(this.create_account_jump_info, chatroomUserData.create_account_jump_info) && n51.f.a(this.indentity, chatroomUserData.indentity) && n51.f.a(this.extern_info, chatroomUserData.extern_info) && n51.f.a(java.lang.Boolean.valueOf(this.is_self), java.lang.Boolean.valueOf(chatroomUserData.is_self));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.username;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.nickname;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.avatar;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.sex);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.jump_info;
            if (jumpInfo != null) {
                fVar.i(5, jumpInfo.computeSize());
                this.jump_info.writeFields(fVar);
            }
            java.lang.String str4 = this.signature;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.a(7, this.is_authorized);
            com.tencent.mm.plugin.game.autogen.chatroom.TagInfo tagInfo = this.tag_info;
            if (tagInfo != null) {
                fVar.i(8, tagInfo.computeSize());
                this.tag_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.LbsInfo lbsInfo = this.lbs_info;
            if (lbsInfo != null) {
                fVar.i(9, lbsInfo.computeSize());
                this.lbs_info.writeFields(fVar);
            }
            java.lang.String str5 = this.chatroom_name;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            fVar.e(11, this.role);
            fVar.a(12, this.can_be_at);
            fVar.a(13, this.is_robot);
            fVar.a(14, this.can_kick_member);
            com.tencent.mm.plugin.game.autogen.chatroom.UserRole userRole = this.user_role;
            if (userRole != null) {
                fVar.i(15, userRole.computeSize());
                this.user_role.writeFields(fVar);
            }
            fVar.a(16, this.can_be_kicked);
            fVar.a(17, this.can_at_all);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = this.h5_profile_jump_info;
            if (jumpInfo2 != null) {
                fVar.i(18, jumpInfo2.computeSize());
                this.h5_profile_jump_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo3 = this.create_account_jump_info;
            if (jumpInfo3 != null) {
                fVar.i(19, jumpInfo3.computeSize());
                this.create_account_jump_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.AccountIdentityInfo accountIdentityInfo = this.indentity;
            if (accountIdentityInfo != null) {
                fVar.i(20, accountIdentityInfo.computeSize());
                this.indentity.writeFields(fVar);
            }
            java.lang.String str6 = this.extern_info;
            if (str6 != null) {
                fVar.j(21, str6);
            }
            fVar.a(22, this.is_self);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.username;
            int j17 = str7 != null ? b36.f.j(1, str7) + 0 : 0;
            java.lang.String str8 = this.nickname;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.avatar;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            int e17 = j17 + b36.f.e(4, this.sex);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo4 = this.jump_info;
            if (jumpInfo4 != null) {
                e17 += b36.f.i(5, jumpInfo4.computeSize());
            }
            java.lang.String str10 = this.signature;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            int a17 = e17 + b36.f.a(7, this.is_authorized);
            com.tencent.mm.plugin.game.autogen.chatroom.TagInfo tagInfo2 = this.tag_info;
            if (tagInfo2 != null) {
                a17 += b36.f.i(8, tagInfo2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.LbsInfo lbsInfo2 = this.lbs_info;
            if (lbsInfo2 != null) {
                a17 += b36.f.i(9, lbsInfo2.computeSize());
            }
            java.lang.String str11 = this.chatroom_name;
            if (str11 != null) {
                a17 += b36.f.j(10, str11);
            }
            int e18 = a17 + b36.f.e(11, this.role) + b36.f.a(12, this.can_be_at) + b36.f.a(13, this.is_robot) + b36.f.a(14, this.can_kick_member);
            com.tencent.mm.plugin.game.autogen.chatroom.UserRole userRole2 = this.user_role;
            if (userRole2 != null) {
                e18 += b36.f.i(15, userRole2.computeSize());
            }
            int a18 = e18 + b36.f.a(16, this.can_be_kicked) + b36.f.a(17, this.can_at_all);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo5 = this.h5_profile_jump_info;
            if (jumpInfo5 != null) {
                a18 += b36.f.i(18, jumpInfo5.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo6 = this.create_account_jump_info;
            if (jumpInfo6 != null) {
                a18 += b36.f.i(19, jumpInfo6.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.AccountIdentityInfo accountIdentityInfo2 = this.indentity;
            if (accountIdentityInfo2 != null) {
                a18 += b36.f.i(20, accountIdentityInfo2.computeSize());
            }
            java.lang.String str12 = this.extern_info;
            if (str12 != null) {
                a18 += b36.f.j(21, str12);
            }
            return a18 + b36.f.a(22, this.is_self);
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
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                chatroomUserData.username = aVar2.k(intValue);
                return 0;
            case 2:
                chatroomUserData.nickname = aVar2.k(intValue);
                return 0;
            case 3:
                chatroomUserData.avatar = aVar2.k(intValue);
                return 0;
            case 4:
                chatroomUserData.sex = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo7 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
                    if (bArr != null && bArr.length > 0) {
                        jumpInfo7.parseFrom(bArr);
                    }
                    chatroomUserData.jump_info = jumpInfo7;
                }
                return 0;
            case 6:
                chatroomUserData.signature = aVar2.k(intValue);
                return 0;
            case 7:
                chatroomUserData.is_authorized = aVar2.c(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    com.tencent.mm.plugin.game.autogen.chatroom.TagInfo tagInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.TagInfo();
                    if (bArr2 != null && bArr2.length > 0) {
                        tagInfo3.parseFrom(bArr2);
                    }
                    chatroomUserData.tag_info = tagInfo3;
                }
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    com.tencent.mm.plugin.game.autogen.chatroom.LbsInfo lbsInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.LbsInfo();
                    if (bArr3 != null && bArr3.length > 0) {
                        lbsInfo3.parseFrom(bArr3);
                    }
                    chatroomUserData.lbs_info = lbsInfo3;
                }
                return 0;
            case 10:
                chatroomUserData.chatroom_name = aVar2.k(intValue);
                return 0;
            case 11:
                chatroomUserData.role = aVar2.g(intValue);
                return 0;
            case 12:
                chatroomUserData.can_be_at = aVar2.c(intValue);
                return 0;
            case 13:
                chatroomUserData.is_robot = aVar2.c(intValue);
                return 0;
            case 14:
                chatroomUserData.can_kick_member = aVar2.c(intValue);
                return 0;
            case 15:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j28.get(i28);
                    com.tencent.mm.plugin.game.autogen.chatroom.UserRole userRole3 = new com.tencent.mm.plugin.game.autogen.chatroom.UserRole();
                    if (bArr4 != null && bArr4.length > 0) {
                        userRole3.parseFrom(bArr4);
                    }
                    chatroomUserData.user_role = userRole3;
                }
                return 0;
            case 16:
                chatroomUserData.can_be_kicked = aVar2.c(intValue);
                return 0;
            case 17:
                chatroomUserData.can_at_all = aVar2.c(intValue);
                return 0;
            case 18:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j29.get(i29);
                    com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo8 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
                    if (bArr5 != null && bArr5.length > 0) {
                        jumpInfo8.parseFrom(bArr5);
                    }
                    chatroomUserData.h5_profile_jump_info = jumpInfo8;
                }
                return 0;
            case 19:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size6 = j37.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j37.get(i37);
                    com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo9 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
                    if (bArr6 != null && bArr6.length > 0) {
                        jumpInfo9.parseFrom(bArr6);
                    }
                    chatroomUserData.create_account_jump_info = jumpInfo9;
                }
                return 0;
            case 20:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size7 = j38.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j38.get(i38);
                    com.tencent.mm.plugin.game.autogen.chatroom.AccountIdentityInfo accountIdentityInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.AccountIdentityInfo();
                    if (bArr7 != null && bArr7.length > 0) {
                        accountIdentityInfo3.parseFrom(bArr7);
                    }
                    chatroomUserData.indentity = accountIdentityInfo3;
                }
                return 0;
            case 21:
                chatroomUserData.extern_info = aVar2.k(intValue);
                return 0;
            case 22:
                chatroomUserData.is_self = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData setAvatar(java.lang.String str) {
        this.avatar = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData setCan_at_all(boolean z17) {
        this.can_at_all = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData setCan_be_at(boolean z17) {
        this.can_be_at = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData setCan_be_kicked(boolean z17) {
        this.can_be_kicked = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData setCan_kick_member(boolean z17) {
        this.can_kick_member = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData setChatroom_name(java.lang.String str) {
        this.chatroom_name = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData setCreate_account_jump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.create_account_jump_info = jumpInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData setExtern_info(java.lang.String str) {
        this.extern_info = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData setH5_profile_jump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.h5_profile_jump_info = jumpInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData setIndentity(com.tencent.mm.plugin.game.autogen.chatroom.AccountIdentityInfo accountIdentityInfo) {
        this.indentity = accountIdentityInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData setIs_authorized(boolean z17) {
        this.is_authorized = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData setIs_robot(boolean z17) {
        this.is_robot = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData setIs_self(boolean z17) {
        this.is_self = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData setJump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.jump_info = jumpInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData setLbs_info(com.tencent.mm.plugin.game.autogen.chatroom.LbsInfo lbsInfo) {
        this.lbs_info = lbsInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData setNickname(java.lang.String str) {
        this.nickname = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData setRole(int i17) {
        this.role = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData setSex(int i17) {
        this.sex = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData setSignature(java.lang.String str) {
        this.signature = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData setTag_info(com.tencent.mm.plugin.game.autogen.chatroom.TagInfo tagInfo) {
        this.tag_info = tagInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData setUser_role(com.tencent.mm.plugin.game.autogen.chatroom.UserRole userRole) {
        this.user_role = userRole;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData setUsername(java.lang.String str) {
        this.username = str;
        return this;
    }
}
