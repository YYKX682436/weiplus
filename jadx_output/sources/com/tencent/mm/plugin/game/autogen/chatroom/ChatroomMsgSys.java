package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class ChatroomMsgSys extends com.tencent.mm.protobuf.f {
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgTpl chatroom_msg_tpl;
    public java.lang.String title;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSys create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSys();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSys)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSys chatroomMsgSys = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSys) fVar;
        return n51.f.a(this.title, chatroomMsgSys.title) && n51.f.a(this.chatroom_msg_tpl, chatroomMsgSys.chatroom_msg_tpl);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.title;
            if (str != null) {
                fVar.j(1, str);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgTpl chatroomMsgTpl = this.chatroom_msg_tpl;
            if (chatroomMsgTpl != null) {
                fVar.i(2, chatroomMsgTpl.computeSize());
                this.chatroom_msg_tpl.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.title;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgTpl chatroomMsgTpl2 = this.chatroom_msg_tpl;
            return chatroomMsgTpl2 != null ? j17 + b36.f.i(2, chatroomMsgTpl2.computeSize()) : j17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSys chatroomMsgSys = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSys) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            chatroomMsgSys.title = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgTpl chatroomMsgTpl3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgTpl();
            if (bArr != null && bArr.length > 0) {
                chatroomMsgTpl3.parseFrom(bArr);
            }
            chatroomMsgSys.chatroom_msg_tpl = chatroomMsgTpl3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSys setChatroom_msg_tpl(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgTpl chatroomMsgTpl) {
        this.chatroom_msg_tpl = chatroomMsgTpl;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSys setTitle(java.lang.String str) {
        this.title = str;
        return this;
    }
}
