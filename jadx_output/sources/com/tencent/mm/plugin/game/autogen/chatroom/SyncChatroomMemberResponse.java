package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class SyncChatroomMemberResponse extends r45.js5 {
    public java.util.LinkedList<java.lang.String> member_username_list = new java.util.LinkedList<>();
    public java.lang.String next_version;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.SyncChatroomMemberResponse create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.SyncChatroomMemberResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.SyncChatroomMemberResponse)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.SyncChatroomMemberResponse syncChatroomMemberResponse = (com.tencent.mm.plugin.game.autogen.chatroom.SyncChatroomMemberResponse) fVar;
        return n51.f.a(this.BaseResponse, syncChatroomMemberResponse.BaseResponse) && n51.f.a(this.next_version, syncChatroomMemberResponse.next_version) && n51.f.a(this.member_username_list, syncChatroomMemberResponse.member_username_list);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.next_version;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, this.member_username_list);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str2 = this.next_version;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.g(3, 1, this.member_username_list);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.member_username_list.clear();
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
        com.tencent.mm.plugin.game.autogen.chatroom.SyncChatroomMemberResponse syncChatroomMemberResponse = (com.tencent.mm.plugin.game.autogen.chatroom.SyncChatroomMemberResponse) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                syncChatroomMemberResponse.next_version = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            syncChatroomMemberResponse.member_username_list.add(aVar2.k(intValue));
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr2 = (byte[]) j17.get(i19);
            r45.ie ieVar3 = new r45.ie();
            if (bArr2 != null && bArr2.length > 0) {
                ieVar3.parseFrom(bArr2);
            }
            syncChatroomMemberResponse.BaseResponse = ieVar3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.SyncChatroomMemberResponse setMember_username_list(java.util.LinkedList<java.lang.String> linkedList) {
        this.member_username_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.SyncChatroomMemberResponse setNext_version(java.lang.String str) {
        this.next_version = str;
        return this;
    }
}
