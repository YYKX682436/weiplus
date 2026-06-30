package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class ChatroomMsgImgCard extends com.tencent.mm.protobuf.f {
    public java.lang.String desc;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo img_jump_info;
    public java.lang.String pic_url;
    public boolean show_video_play;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgCard create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgCard();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgCard)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgCard chatroomMsgImgCard = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgCard) fVar;
        return n51.f.a(this.pic_url, chatroomMsgImgCard.pic_url) && n51.f.a(this.desc, chatroomMsgImgCard.desc) && n51.f.a(this.img_jump_info, chatroomMsgImgCard.img_jump_info) && n51.f.a(java.lang.Boolean.valueOf(this.show_video_play), java.lang.Boolean.valueOf(chatroomMsgImgCard.show_video_play));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.pic_url;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.desc;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.img_jump_info;
            if (jumpInfo != null) {
                fVar.i(3, jumpInfo.computeSize());
                this.img_jump_info.writeFields(fVar);
            }
            fVar.a(4, this.show_video_play);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.pic_url;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.desc;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = this.img_jump_info;
            if (jumpInfo2 != null) {
                j17 += b36.f.i(3, jumpInfo2.computeSize());
            }
            return j17 + b36.f.a(4, this.show_video_play);
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
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgCard chatroomMsgImgCard = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgCard) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            chatroomMsgImgCard.pic_url = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            chatroomMsgImgCard.desc = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            chatroomMsgImgCard.show_video_play = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
            if (bArr != null && bArr.length > 0) {
                jumpInfo3.parseFrom(bArr);
            }
            chatroomMsgImgCard.img_jump_info = jumpInfo3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgCard setDesc(java.lang.String str) {
        this.desc = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgCard setImg_jump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.img_jump_info = jumpInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgCard setPic_url(java.lang.String str) {
        this.pic_url = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgCard setShow_video_play(boolean z17) {
        this.show_video_play = z17;
        return this;
    }
}
