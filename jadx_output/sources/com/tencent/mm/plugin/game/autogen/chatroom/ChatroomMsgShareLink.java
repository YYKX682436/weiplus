package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class ChatroomMsgShareLink extends com.tencent.mm.protobuf.f {
    public java.lang.String desc;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jump_info;
    public java.lang.String pic_url;
    public java.lang.String title;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgShareLink create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgShareLink();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgShareLink)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgShareLink chatroomMsgShareLink = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgShareLink) fVar;
        return n51.f.a(this.pic_url, chatroomMsgShareLink.pic_url) && n51.f.a(this.title, chatroomMsgShareLink.title) && n51.f.a(this.desc, chatroomMsgShareLink.desc) && n51.f.a(this.jump_info, chatroomMsgShareLink.jump_info);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.pic_url;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.title;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.desc;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.jump_info;
            if (jumpInfo != null) {
                fVar.i(4, jumpInfo.computeSize());
                this.jump_info.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.pic_url;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.title;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.desc;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = this.jump_info;
            return jumpInfo2 != null ? j17 + b36.f.i(4, jumpInfo2.computeSize()) : j17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgShareLink chatroomMsgShareLink = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgShareLink) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            chatroomMsgShareLink.pic_url = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            chatroomMsgShareLink.title = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            chatroomMsgShareLink.desc = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
            if (bArr != null && bArr.length > 0) {
                jumpInfo3.parseFrom(bArr);
            }
            chatroomMsgShareLink.jump_info = jumpInfo3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgShareLink setDesc(java.lang.String str) {
        this.desc = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgShareLink setJump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.jump_info = jumpInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgShareLink setPic_url(java.lang.String str) {
        this.pic_url = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgShareLink setTitle(java.lang.String str) {
        this.title = str;
        return this;
    }
}
