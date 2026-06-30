package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class ChatroomMsgText extends com.tencent.mm.protobuf.f {
    public java.lang.String content;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgText create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgText();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgText) && n51.f.a(this.content, ((com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgText) fVar).content);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.content;
            if (str != null) {
                fVar.j(1, str);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.content;
            if (str2 != null) {
                return 0 + b36.f.j(1, str2);
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
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgText chatroomMsgText = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgText) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        chatroomMsgText.content = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgText setContent(java.lang.String str) {
        this.content = str;
        return this;
    }
}
