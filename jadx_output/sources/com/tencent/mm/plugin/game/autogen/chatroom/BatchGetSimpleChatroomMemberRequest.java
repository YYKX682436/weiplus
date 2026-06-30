package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes2.dex */
public class BatchGetSimpleChatroomMemberRequest extends r45.mr5 {
    public java.util.LinkedList<java.lang.String> username_list = new java.util.LinkedList<>();

    public static final com.tencent.mm.plugin.game.autogen.chatroom.BatchGetSimpleChatroomMemberRequest create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.BatchGetSimpleChatroomMemberRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.BatchGetSimpleChatroomMemberRequest)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.BatchGetSimpleChatroomMemberRequest batchGetSimpleChatroomMemberRequest = (com.tencent.mm.plugin.game.autogen.chatroom.BatchGetSimpleChatroomMemberRequest) fVar;
        return n51.f.a(this.BaseRequest, batchGetSimpleChatroomMemberRequest.BaseRequest) && n51.f.a(this.username_list, batchGetSimpleChatroomMemberRequest.username_list);
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
            fVar.g(2, 1, this.username_list);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.g(2, 1, this.username_list);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.username_list.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        com.tencent.mm.plugin.game.autogen.chatroom.BatchGetSimpleChatroomMemberRequest batchGetSimpleChatroomMemberRequest = (com.tencent.mm.plugin.game.autogen.chatroom.BatchGetSimpleChatroomMemberRequest) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            batchGetSimpleChatroomMemberRequest.username_list.add(aVar2.k(intValue));
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.he heVar3 = new r45.he();
            if (bArr2 != null && bArr2.length > 0) {
                heVar3.parseFrom(bArr2);
            }
            batchGetSimpleChatroomMemberRequest.BaseRequest = heVar3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.BatchGetSimpleChatroomMemberRequest setUsername_list(java.util.LinkedList<java.lang.String> linkedList) {
        this.username_list = linkedList;
        return this;
    }
}
