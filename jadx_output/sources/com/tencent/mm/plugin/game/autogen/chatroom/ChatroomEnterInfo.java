package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class ChatroomEnterInfo extends com.tencent.mm.protobuf.f {
    public com.tencent.mm.plugin.game.autogen.chatroom.BackgroundInfo background_info;
    public java.lang.String buttom_desc;
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock> content_list = new java.util.LinkedList<>();
    public java.lang.String report_str;
    public java.lang.String title;
    public com.tencent.mm.plugin.game.autogen.chatroom.UserEnterOption user_enter_option;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ChatroomEnterInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomEnterInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChatroomEnterInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomEnterInfo chatroomEnterInfo = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomEnterInfo) fVar;
        return n51.f.a(this.title, chatroomEnterInfo.title) && n51.f.a(this.content_list, chatroomEnterInfo.content_list) && n51.f.a(this.user_enter_option, chatroomEnterInfo.user_enter_option) && n51.f.a(this.buttom_desc, chatroomEnterInfo.buttom_desc) && n51.f.a(this.background_info, chatroomEnterInfo.background_info) && n51.f.a(this.report_str, chatroomEnterInfo.report_str);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.title;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.content_list);
            com.tencent.mm.plugin.game.autogen.chatroom.UserEnterOption userEnterOption = this.user_enter_option;
            if (userEnterOption != null) {
                fVar.i(3, userEnterOption.computeSize());
                this.user_enter_option.writeFields(fVar);
            }
            java.lang.String str2 = this.buttom_desc;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.BackgroundInfo backgroundInfo = this.background_info;
            if (backgroundInfo != null) {
                fVar.i(5, backgroundInfo.computeSize());
                this.background_info.writeFields(fVar);
            }
            java.lang.String str3 = this.report_str;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.title;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.g(2, 8, this.content_list);
            com.tencent.mm.plugin.game.autogen.chatroom.UserEnterOption userEnterOption2 = this.user_enter_option;
            if (userEnterOption2 != null) {
                j17 += b36.f.i(3, userEnterOption2.computeSize());
            }
            java.lang.String str5 = this.buttom_desc;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.BackgroundInfo backgroundInfo2 = this.background_info;
            if (backgroundInfo2 != null) {
                j17 += b36.f.i(5, backgroundInfo2.computeSize());
            }
            java.lang.String str6 = this.report_str;
            return str6 != null ? j17 + b36.f.j(6, str6) : j17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.content_list.clear();
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
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomEnterInfo chatroomEnterInfo = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomEnterInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                chatroomEnterInfo.title = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock contentBlock = new com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock();
                    if (bArr2 != null && bArr2.length > 0) {
                        contentBlock.parseFrom(bArr2);
                    }
                    chatroomEnterInfo.content_list.add(contentBlock);
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    com.tencent.mm.plugin.game.autogen.chatroom.UserEnterOption userEnterOption3 = new com.tencent.mm.plugin.game.autogen.chatroom.UserEnterOption();
                    if (bArr3 != null && bArr3.length > 0) {
                        userEnterOption3.parseFrom(bArr3);
                    }
                    chatroomEnterInfo.user_enter_option = userEnterOption3;
                }
                return 0;
            case 4:
                chatroomEnterInfo.buttom_desc = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    com.tencent.mm.plugin.game.autogen.chatroom.BackgroundInfo backgroundInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.BackgroundInfo();
                    if (bArr4 != null && bArr4.length > 0) {
                        backgroundInfo3.parseFrom(bArr4);
                    }
                    chatroomEnterInfo.background_info = backgroundInfo3;
                }
                return 0;
            case 6:
                chatroomEnterInfo.report_str = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomEnterInfo setBackground_info(com.tencent.mm.plugin.game.autogen.chatroom.BackgroundInfo backgroundInfo) {
        this.background_info = backgroundInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomEnterInfo setButtom_desc(java.lang.String str) {
        this.buttom_desc = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomEnterInfo setContent_list(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock> linkedList) {
        this.content_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomEnterInfo setReport_str(java.lang.String str) {
        this.report_str = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomEnterInfo setTitle(java.lang.String str) {
        this.title = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomEnterInfo setUser_enter_option(com.tencent.mm.plugin.game.autogen.chatroom.UserEnterOption userEnterOption) {
        this.user_enter_option = userEnterOption;
        return this;
    }
}
