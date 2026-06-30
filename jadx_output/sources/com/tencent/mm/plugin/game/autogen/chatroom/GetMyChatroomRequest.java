package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class GetMyChatroomRequest extends r45.mr5 {
    public java.util.LinkedList<java.lang.String> chatroom_name_list = new java.util.LinkedList<>();
    public java.lang.String first_chatroom_name;
    public int scene_type;
    public java.lang.String version;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomRequest create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomRequest)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomRequest getMyChatroomRequest = (com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomRequest) fVar;
        return n51.f.a(this.BaseRequest, getMyChatroomRequest.BaseRequest) && n51.f.a(this.version, getMyChatroomRequest.version) && n51.f.a(this.chatroom_name_list, getMyChatroomRequest.chatroom_name_list) && n51.f.a(this.first_chatroom_name, getMyChatroomRequest.first_chatroom_name) && n51.f.a(java.lang.Integer.valueOf(this.scene_type), java.lang.Integer.valueOf(getMyChatroomRequest.scene_type));
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
            java.lang.String str = this.version;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, this.chatroom_name_list);
            java.lang.String str2 = this.first_chatroom_name;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.scene_type);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.version;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int g17 = i18 + b36.f.g(3, 1, this.chatroom_name_list);
            java.lang.String str4 = this.first_chatroom_name;
            if (str4 != null) {
                g17 += b36.f.j(4, str4);
            }
            return g17 + b36.f.e(5, this.scene_type);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.chatroom_name_list.clear();
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
        com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomRequest getMyChatroomRequest = (com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomRequest) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                getMyChatroomRequest.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            getMyChatroomRequest.version = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            getMyChatroomRequest.chatroom_name_list.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 4) {
            getMyChatroomRequest.first_chatroom_name = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        getMyChatroomRequest.scene_type = aVar2.g(intValue);
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomRequest setChatroom_name_list(java.util.LinkedList<java.lang.String> linkedList) {
        this.chatroom_name_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomRequest setFirst_chatroom_name(java.lang.String str) {
        this.first_chatroom_name = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomRequest setScene_type(int i17) {
        this.scene_type = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomRequest setVersion(java.lang.String str) {
        this.version = str;
        return this;
    }
}
