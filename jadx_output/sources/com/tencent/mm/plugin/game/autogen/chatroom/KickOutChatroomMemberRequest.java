package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes2.dex */
public class KickOutChatroomMemberRequest extends r45.mr5 {
    public java.lang.String username;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.KickOutChatroomMemberRequest create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.KickOutChatroomMemberRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.KickOutChatroomMemberRequest)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.KickOutChatroomMemberRequest kickOutChatroomMemberRequest = (com.tencent.mm.plugin.game.autogen.chatroom.KickOutChatroomMemberRequest) fVar;
        return n51.f.a(this.BaseRequest, kickOutChatroomMemberRequest.BaseRequest) && n51.f.a(this.username, kickOutChatroomMemberRequest.username);
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
            java.lang.String str = this.username;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.username;
            return str2 != null ? i18 + b36.f.j(2, str2) : i18;
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
        com.tencent.mm.plugin.game.autogen.chatroom.KickOutChatroomMemberRequest kickOutChatroomMemberRequest = (com.tencent.mm.plugin.game.autogen.chatroom.KickOutChatroomMemberRequest) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            kickOutChatroomMemberRequest.username = aVar2.k(intValue);
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
            kickOutChatroomMemberRequest.BaseRequest = heVar3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.KickOutChatroomMemberRequest setUsername(java.lang.String str) {
        this.username = str;
        return this;
    }
}
