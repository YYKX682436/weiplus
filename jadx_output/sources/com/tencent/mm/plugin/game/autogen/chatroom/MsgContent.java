package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class MsgContent extends com.tencent.mm.protobuf.f {
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp chatroom_app;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji chatroom_emoji;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage chatroom_image;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgCard chatroom_img_card;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgLink chatroom_img_link;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgNotice chatroom_notice;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgShareLink chatroom_share_link;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSheetCard chatroom_sheet_card;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSys chatroom_sys;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgText chatroom_text;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgTpl chatroom_tpl;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.MsgContent create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.MsgContent();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.MsgContent)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.MsgContent msgContent = (com.tencent.mm.plugin.game.autogen.chatroom.MsgContent) fVar;
        return n51.f.a(this.chatroom_app, msgContent.chatroom_app) && n51.f.a(this.chatroom_tpl, msgContent.chatroom_tpl) && n51.f.a(this.chatroom_text, msgContent.chatroom_text) && n51.f.a(this.chatroom_sys, msgContent.chatroom_sys) && n51.f.a(this.chatroom_notice, msgContent.chatroom_notice) && n51.f.a(this.chatroom_emoji, msgContent.chatroom_emoji) && n51.f.a(this.chatroom_img_link, msgContent.chatroom_img_link) && n51.f.a(this.chatroom_share_link, msgContent.chatroom_share_link) && n51.f.a(this.chatroom_img_card, msgContent.chatroom_img_card) && n51.f.a(this.chatroom_image, msgContent.chatroom_image) && n51.f.a(this.chatroom_sheet_card, msgContent.chatroom_sheet_card);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp chatroomMsgApp = this.chatroom_app;
            if (chatroomMsgApp != null) {
                fVar.i(1, chatroomMsgApp.computeSize());
                this.chatroom_app.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgTpl chatroomMsgTpl = this.chatroom_tpl;
            if (chatroomMsgTpl != null) {
                fVar.i(2, chatroomMsgTpl.computeSize());
                this.chatroom_tpl.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgText chatroomMsgText = this.chatroom_text;
            if (chatroomMsgText != null) {
                fVar.i(7, chatroomMsgText.computeSize());
                this.chatroom_text.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSys chatroomMsgSys = this.chatroom_sys;
            if (chatroomMsgSys != null) {
                fVar.i(3, chatroomMsgSys.computeSize());
                this.chatroom_sys.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgNotice chatroomMsgNotice = this.chatroom_notice;
            if (chatroomMsgNotice != null) {
                fVar.i(4, chatroomMsgNotice.computeSize());
                this.chatroom_notice.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji chatroomMsgEmoji = this.chatroom_emoji;
            if (chatroomMsgEmoji != null) {
                fVar.i(5, chatroomMsgEmoji.computeSize());
                this.chatroom_emoji.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgLink chatroomMsgImgLink = this.chatroom_img_link;
            if (chatroomMsgImgLink != null) {
                fVar.i(6, chatroomMsgImgLink.computeSize());
                this.chatroom_img_link.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgShareLink chatroomMsgShareLink = this.chatroom_share_link;
            if (chatroomMsgShareLink != null) {
                fVar.i(8, chatroomMsgShareLink.computeSize());
                this.chatroom_share_link.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgCard chatroomMsgImgCard = this.chatroom_img_card;
            if (chatroomMsgImgCard != null) {
                fVar.i(9, chatroomMsgImgCard.computeSize());
                this.chatroom_img_card.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage chatroomMsgImage = this.chatroom_image;
            if (chatroomMsgImage != null) {
                fVar.i(10, chatroomMsgImage.computeSize());
                this.chatroom_image.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSheetCard chatroomMsgSheetCard = this.chatroom_sheet_card;
            if (chatroomMsgSheetCard != null) {
                fVar.i(11, chatroomMsgSheetCard.computeSize());
                this.chatroom_sheet_card.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp chatroomMsgApp2 = this.chatroom_app;
            int i18 = chatroomMsgApp2 != null ? 0 + b36.f.i(1, chatroomMsgApp2.computeSize()) : 0;
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgTpl chatroomMsgTpl2 = this.chatroom_tpl;
            if (chatroomMsgTpl2 != null) {
                i18 += b36.f.i(2, chatroomMsgTpl2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgText chatroomMsgText2 = this.chatroom_text;
            if (chatroomMsgText2 != null) {
                i18 += b36.f.i(7, chatroomMsgText2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSys chatroomMsgSys2 = this.chatroom_sys;
            if (chatroomMsgSys2 != null) {
                i18 += b36.f.i(3, chatroomMsgSys2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgNotice chatroomMsgNotice2 = this.chatroom_notice;
            if (chatroomMsgNotice2 != null) {
                i18 += b36.f.i(4, chatroomMsgNotice2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji chatroomMsgEmoji2 = this.chatroom_emoji;
            if (chatroomMsgEmoji2 != null) {
                i18 += b36.f.i(5, chatroomMsgEmoji2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgLink chatroomMsgImgLink2 = this.chatroom_img_link;
            if (chatroomMsgImgLink2 != null) {
                i18 += b36.f.i(6, chatroomMsgImgLink2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgShareLink chatroomMsgShareLink2 = this.chatroom_share_link;
            if (chatroomMsgShareLink2 != null) {
                i18 += b36.f.i(8, chatroomMsgShareLink2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgCard chatroomMsgImgCard2 = this.chatroom_img_card;
            if (chatroomMsgImgCard2 != null) {
                i18 += b36.f.i(9, chatroomMsgImgCard2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage chatroomMsgImage2 = this.chatroom_image;
            if (chatroomMsgImage2 != null) {
                i18 += b36.f.i(10, chatroomMsgImage2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSheetCard chatroomMsgSheetCard2 = this.chatroom_sheet_card;
            return chatroomMsgSheetCard2 != null ? i18 + b36.f.i(11, chatroomMsgSheetCard2.computeSize()) : i18;
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
        com.tencent.mm.plugin.game.autogen.chatroom.MsgContent msgContent = (com.tencent.mm.plugin.game.autogen.chatroom.MsgContent) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp chatroomMsgApp3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp();
                    if (bArr != null && bArr.length > 0) {
                        chatroomMsgApp3.parseFrom(bArr);
                    }
                    msgContent.chatroom_app = chatroomMsgApp3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgTpl chatroomMsgTpl3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgTpl();
                    if (bArr2 != null && bArr2.length > 0) {
                        chatroomMsgTpl3.parseFrom(bArr2);
                    }
                    msgContent.chatroom_tpl = chatroomMsgTpl3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSys chatroomMsgSys3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSys();
                    if (bArr3 != null && bArr3.length > 0) {
                        chatroomMsgSys3.parseFrom(bArr3);
                    }
                    msgContent.chatroom_sys = chatroomMsgSys3;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgNotice chatroomMsgNotice3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgNotice();
                    if (bArr4 != null && bArr4.length > 0) {
                        chatroomMsgNotice3.parseFrom(bArr4);
                    }
                    msgContent.chatroom_notice = chatroomMsgNotice3;
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji chatroomMsgEmoji3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji();
                    if (bArr5 != null && bArr5.length > 0) {
                        chatroomMsgEmoji3.parseFrom(bArr5);
                    }
                    msgContent.chatroom_emoji = chatroomMsgEmoji3;
                }
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgLink chatroomMsgImgLink3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgLink();
                    if (bArr6 != null && bArr6.length > 0) {
                        chatroomMsgImgLink3.parseFrom(bArr6);
                    }
                    msgContent.chatroom_img_link = chatroomMsgImgLink3;
                }
                return 0;
            case 7:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgText chatroomMsgText3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgText();
                    if (bArr7 != null && bArr7.length > 0) {
                        chatroomMsgText3.parseFrom(bArr7);
                    }
                    msgContent.chatroom_text = chatroomMsgText3;
                }
                return 0;
            case 8:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgShareLink chatroomMsgShareLink3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgShareLink();
                    if (bArr8 != null && bArr8.length > 0) {
                        chatroomMsgShareLink3.parseFrom(bArr8);
                    }
                    msgContent.chatroom_share_link = chatroomMsgShareLink3;
                }
                return 0;
            case 9:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgCard chatroomMsgImgCard3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgCard();
                    if (bArr9 != null && bArr9.length > 0) {
                        chatroomMsgImgCard3.parseFrom(bArr9);
                    }
                    msgContent.chatroom_img_card = chatroomMsgImgCard3;
                }
                return 0;
            case 10:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage chatroomMsgImage3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage();
                    if (bArr10 != null && bArr10.length > 0) {
                        chatroomMsgImage3.parseFrom(bArr10);
                    }
                    msgContent.chatroom_image = chatroomMsgImage3;
                }
                return 0;
            case 11:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSheetCard chatroomMsgSheetCard3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSheetCard();
                    if (bArr11 != null && bArr11.length > 0) {
                        chatroomMsgSheetCard3.parseFrom(bArr11);
                    }
                    msgContent.chatroom_sheet_card = chatroomMsgSheetCard3;
                }
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MsgContent setChatroom_app(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp chatroomMsgApp) {
        this.chatroom_app = chatroomMsgApp;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MsgContent setChatroom_emoji(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgEmoji chatroomMsgEmoji) {
        this.chatroom_emoji = chatroomMsgEmoji;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MsgContent setChatroom_image(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImage chatroomMsgImage) {
        this.chatroom_image = chatroomMsgImage;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MsgContent setChatroom_img_card(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgCard chatroomMsgImgCard) {
        this.chatroom_img_card = chatroomMsgImgCard;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MsgContent setChatroom_img_link(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgLink chatroomMsgImgLink) {
        this.chatroom_img_link = chatroomMsgImgLink;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MsgContent setChatroom_notice(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgNotice chatroomMsgNotice) {
        this.chatroom_notice = chatroomMsgNotice;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MsgContent setChatroom_share_link(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgShareLink chatroomMsgShareLink) {
        this.chatroom_share_link = chatroomMsgShareLink;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MsgContent setChatroom_sheet_card(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSheetCard chatroomMsgSheetCard) {
        this.chatroom_sheet_card = chatroomMsgSheetCard;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MsgContent setChatroom_sys(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSys chatroomMsgSys) {
        this.chatroom_sys = chatroomMsgSys;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MsgContent setChatroom_text(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgText chatroomMsgText) {
        this.chatroom_text = chatroomMsgText;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MsgContent setChatroom_tpl(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgTpl chatroomMsgTpl) {
        this.chatroom_tpl = chatroomMsgTpl;
        return this;
    }
}
