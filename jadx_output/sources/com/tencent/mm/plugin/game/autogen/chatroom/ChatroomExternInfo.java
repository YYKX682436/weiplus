package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class ChatroomExternInfo extends com.tencent.mm.protobuf.f {
    public java.lang.String cannot_join_reason;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ChatroomExternInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomExternInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChatroomExternInfo) && n51.f.a(this.cannot_join_reason, ((com.tencent.mm.plugin.game.autogen.chatroom.ChatroomExternInfo) fVar).cannot_join_reason);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.cannot_join_reason;
            if (str != null) {
                fVar.j(1, str);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.cannot_join_reason;
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
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomExternInfo chatroomExternInfo = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomExternInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        chatroomExternInfo.cannot_join_reason = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomExternInfo setCannot_join_reason(java.lang.String str) {
        this.cannot_join_reason = str;
        return this;
    }
}
