package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class ReceiveChatroomMsgRequest extends r45.mr5 {
    public java.lang.String chatroom_name;
    public long seq;
    public java.lang.String version;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgRequest create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgRequest)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgRequest receiveChatroomMsgRequest = (com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgRequest) fVar;
        return n51.f.a(this.BaseRequest, receiveChatroomMsgRequest.BaseRequest) && n51.f.a(this.chatroom_name, receiveChatroomMsgRequest.chatroom_name) && n51.f.a(java.lang.Long.valueOf(this.seq), java.lang.Long.valueOf(receiveChatroomMsgRequest.seq)) && n51.f.a(this.version, receiveChatroomMsgRequest.version);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.chatroom_name;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.seq);
            java.lang.String str2 = this.version;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.chatroom_name;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int h17 = i18 + b36.f.h(3, this.seq);
            java.lang.String str4 = this.version;
            return str4 != null ? h17 + b36.f.j(4, str4) : h17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgRequest receiveChatroomMsgRequest = (com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgRequest) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                receiveChatroomMsgRequest.chatroom_name = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                receiveChatroomMsgRequest.seq = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            receiveChatroomMsgRequest.version = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.he heVar3 = new r45.he();
            if (bArr != null && bArr.length > 0) {
                heVar3.parseFrom(bArr);
            }
            receiveChatroomMsgRequest.BaseRequest = heVar3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgRequest setChatroom_name(java.lang.String str) {
        this.chatroom_name = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgRequest setSeq(long j17) {
        this.seq = j17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgRequest setVersion(java.lang.String str) {
        this.version = str;
        return this;
    }
}
