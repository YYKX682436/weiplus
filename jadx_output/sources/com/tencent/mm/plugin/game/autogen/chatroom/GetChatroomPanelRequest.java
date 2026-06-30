package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes2.dex */
public class GetChatroomPanelRequest extends r45.mr5 {
    public java.lang.String chatroom_name;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomPanelRequest create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomPanelRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomPanelRequest)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomPanelRequest getChatroomPanelRequest = (com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomPanelRequest) fVar;
        return n51.f.a(this.BaseRequest, getChatroomPanelRequest.BaseRequest) && n51.f.a(this.chatroom_name, getChatroomPanelRequest.chatroom_name);
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
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.chatroom_name;
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
        com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomPanelRequest getChatroomPanelRequest = (com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomPanelRequest) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            getChatroomPanelRequest.chatroom_name = aVar2.k(intValue);
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
            getChatroomPanelRequest.BaseRequest = heVar3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomPanelRequest setChatroom_name(java.lang.String str) {
        this.chatroom_name = str;
        return this;
    }
}
