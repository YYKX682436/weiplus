package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class ChatroomMsgImgLink extends com.tencent.mm.protobuf.f {
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jump_info;
    public int pic_height;
    public java.lang.String pic_url;
    public int pic_width;
    public int playtime;
    public int type;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgLink create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgLink();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgLink)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgLink chatroomMsgImgLink = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgLink) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.type), java.lang.Integer.valueOf(chatroomMsgImgLink.type)) && n51.f.a(this.pic_url, chatroomMsgImgLink.pic_url) && n51.f.a(java.lang.Integer.valueOf(this.playtime), java.lang.Integer.valueOf(chatroomMsgImgLink.playtime)) && n51.f.a(this.jump_info, chatroomMsgImgLink.jump_info) && n51.f.a(java.lang.Integer.valueOf(this.pic_width), java.lang.Integer.valueOf(chatroomMsgImgLink.pic_width)) && n51.f.a(java.lang.Integer.valueOf(this.pic_height), java.lang.Integer.valueOf(chatroomMsgImgLink.pic_height));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.type);
            java.lang.String str = this.pic_url;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.playtime);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.jump_info;
            if (jumpInfo != null) {
                fVar.i(4, jumpInfo.computeSize());
                this.jump_info.writeFields(fVar);
            }
            fVar.e(5, this.pic_width);
            fVar.e(6, this.pic_height);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.type) + 0;
            java.lang.String str2 = this.pic_url;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            int e18 = e17 + b36.f.e(3, this.playtime);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = this.jump_info;
            if (jumpInfo2 != null) {
                e18 += b36.f.i(4, jumpInfo2.computeSize());
            }
            return e18 + b36.f.e(5, this.pic_width) + b36.f.e(6, this.pic_height);
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
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgLink chatroomMsgImgLink = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgLink) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                chatroomMsgImgLink.type = aVar2.g(intValue);
                return 0;
            case 2:
                chatroomMsgImgLink.pic_url = aVar2.k(intValue);
                return 0;
            case 3:
                chatroomMsgImgLink.playtime = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
                    if (bArr != null && bArr.length > 0) {
                        jumpInfo3.parseFrom(bArr);
                    }
                    chatroomMsgImgLink.jump_info = jumpInfo3;
                }
                return 0;
            case 5:
                chatroomMsgImgLink.pic_width = aVar2.g(intValue);
                return 0;
            case 6:
                chatroomMsgImgLink.pic_height = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgLink setJump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.jump_info = jumpInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgLink setPic_height(int i17) {
        this.pic_height = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgLink setPic_url(java.lang.String str) {
        this.pic_url = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgLink setPic_width(int i17) {
        this.pic_width = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgLink setPlaytime(int i17) {
        this.playtime = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgImgLink setType(int i17) {
        this.type = i17;
        return this;
    }
}
