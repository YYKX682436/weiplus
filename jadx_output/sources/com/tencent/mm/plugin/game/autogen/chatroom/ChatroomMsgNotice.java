package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class ChatroomMsgNotice extends com.tencent.mm.protobuf.f {
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgTpl chatroom_msg_tpl;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgNotice create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgNotice();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgNotice) && n51.f.a(this.chatroom_msg_tpl, ((com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgNotice) fVar).chatroom_msg_tpl);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgTpl chatroomMsgTpl = this.chatroom_msg_tpl;
            if (chatroomMsgTpl != null) {
                fVar.i(1, chatroomMsgTpl.computeSize());
                this.chatroom_msg_tpl.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgTpl chatroomMsgTpl2 = this.chatroom_msg_tpl;
            if (chatroomMsgTpl2 != null) {
                return 0 + b36.f.i(1, chatroomMsgTpl2.computeSize());
            }
            return 0;
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
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgNotice chatroomMsgNotice = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgNotice) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgTpl chatroomMsgTpl3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgTpl();
            if (bArr != null && bArr.length > 0) {
                chatroomMsgTpl3.parseFrom(bArr);
            }
            chatroomMsgNotice.chatroom_msg_tpl = chatroomMsgTpl3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgNotice setChatroom_msg_tpl(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgTpl chatroomMsgTpl) {
        this.chatroom_msg_tpl = chatroomMsgTpl;
        return this;
    }
}
