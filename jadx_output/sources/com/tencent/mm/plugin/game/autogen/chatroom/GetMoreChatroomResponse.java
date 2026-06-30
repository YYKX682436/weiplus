package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class GetMoreChatroomResponse extends r45.js5 {
    public java.lang.String chatroom_filter;
    public boolean has_next;
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo> chatroom_info_list = new java.util.LinkedList<>();
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.BanAction> ban_action_list = new java.util.LinkedList<>();

    public static final com.tencent.mm.plugin.game.autogen.chatroom.GetMoreChatroomResponse create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.GetMoreChatroomResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.GetMoreChatroomResponse)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.GetMoreChatroomResponse getMoreChatroomResponse = (com.tencent.mm.plugin.game.autogen.chatroom.GetMoreChatroomResponse) fVar;
        return n51.f.a(this.BaseResponse, getMoreChatroomResponse.BaseResponse) && n51.f.a(this.chatroom_info_list, getMoreChatroomResponse.chatroom_info_list) && n51.f.a(java.lang.Boolean.valueOf(this.has_next), java.lang.Boolean.valueOf(getMoreChatroomResponse.has_next)) && n51.f.a(this.chatroom_filter, getMoreChatroomResponse.chatroom_filter) && n51.f.a(this.ban_action_list, getMoreChatroomResponse.ban_action_list);
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
            fVar.g(2, 8, this.chatroom_info_list);
            fVar.a(3, this.has_next);
            java.lang.String str = this.chatroom_filter;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.g(5, 8, this.ban_action_list);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, this.chatroom_info_list) + b36.f.a(3, this.has_next);
            java.lang.String str2 = this.chatroom_filter;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            return i18 + b36.f.g(5, 8, this.ban_action_list);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.chatroom_info_list.clear();
            this.ban_action_list.clear();
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
        com.tencent.mm.plugin.game.autogen.chatroom.GetMoreChatroomResponse getMoreChatroomResponse = (com.tencent.mm.plugin.game.autogen.chatroom.GetMoreChatroomResponse) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                getMoreChatroomResponse.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo chatroomRecInfo = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo();
                if (bArr3 != null && bArr3.length > 0) {
                    chatroomRecInfo.parseFrom(bArr3);
                }
                getMoreChatroomResponse.chatroom_info_list.add(chatroomRecInfo);
            }
            return 0;
        }
        if (intValue == 3) {
            getMoreChatroomResponse.has_next = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 4) {
            getMoreChatroomResponse.chatroom_filter = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            com.tencent.mm.plugin.game.autogen.chatroom.BanAction banAction = new com.tencent.mm.plugin.game.autogen.chatroom.BanAction();
            if (bArr4 != null && bArr4.length > 0) {
                banAction.parseFrom(bArr4);
            }
            getMoreChatroomResponse.ban_action_list.add(banAction);
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetMoreChatroomResponse setBan_action_list(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.BanAction> linkedList) {
        this.ban_action_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetMoreChatroomResponse setChatroom_filter(java.lang.String str) {
        this.chatroom_filter = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetMoreChatroomResponse setChatroom_info_list(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo> linkedList) {
        this.chatroom_info_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetMoreChatroomResponse setHas_next(boolean z17) {
        this.has_next = z17;
        return this;
    }
}
