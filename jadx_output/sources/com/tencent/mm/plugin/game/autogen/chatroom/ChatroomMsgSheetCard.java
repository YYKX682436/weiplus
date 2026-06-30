package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class ChatroomMsgSheetCard extends com.tencent.mm.protobuf.f {
    public java.lang.String bg_pic_url;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jump_info;
    public java.lang.String pic_url;
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.SheetRow> sheet_row_list = new java.util.LinkedList<>();
    public java.lang.String title;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSheetCard create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSheetCard();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSheetCard)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSheetCard chatroomMsgSheetCard = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSheetCard) fVar;
        return n51.f.a(this.title, chatroomMsgSheetCard.title) && n51.f.a(this.pic_url, chatroomMsgSheetCard.pic_url) && n51.f.a(this.jump_info, chatroomMsgSheetCard.jump_info) && n51.f.a(this.sheet_row_list, chatroomMsgSheetCard.sheet_row_list) && n51.f.a(this.bg_pic_url, chatroomMsgSheetCard.bg_pic_url);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.title;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.pic_url;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.jump_info;
            if (jumpInfo != null) {
                fVar.i(3, jumpInfo.computeSize());
                this.jump_info.writeFields(fVar);
            }
            fVar.g(4, 8, this.sheet_row_list);
            java.lang.String str3 = this.bg_pic_url;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.title;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.pic_url;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = this.jump_info;
            if (jumpInfo2 != null) {
                j17 += b36.f.i(3, jumpInfo2.computeSize());
            }
            int g17 = j17 + b36.f.g(4, 8, this.sheet_row_list);
            java.lang.String str6 = this.bg_pic_url;
            return str6 != null ? g17 + b36.f.j(5, str6) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.sheet_row_list.clear();
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
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSheetCard chatroomMsgSheetCard = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSheetCard) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            chatroomMsgSheetCard.title = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            chatroomMsgSheetCard.pic_url = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j18.get(i18);
                com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
                if (bArr2 != null && bArr2.length > 0) {
                    jumpInfo3.parseFrom(bArr2);
                }
                chatroomMsgSheetCard.jump_info = jumpInfo3;
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            chatroomMsgSheetCard.bg_pic_url = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j19.get(i19);
            com.tencent.mm.plugin.game.autogen.chatroom.SheetRow sheetRow = new com.tencent.mm.plugin.game.autogen.chatroom.SheetRow();
            if (bArr3 != null && bArr3.length > 0) {
                sheetRow.parseFrom(bArr3);
            }
            chatroomMsgSheetCard.sheet_row_list.add(sheetRow);
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSheetCard setBg_pic_url(java.lang.String str) {
        this.bg_pic_url = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSheetCard setJump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.jump_info = jumpInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSheetCard setPic_url(java.lang.String str) {
        this.pic_url = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSheetCard setSheet_row_list(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.SheetRow> linkedList) {
        this.sheet_row_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSheetCard setTitle(java.lang.String str) {
        this.title = str;
        return this;
    }
}
