package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class GetMyChatroomResponse extends r45.js5 {
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo> my_chatroom_info_list = new java.util.LinkedList<>();
    public com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomNotice my_chatroom_notice;
    public java.lang.String next_version;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomResponse create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomResponse)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomResponse getMyChatroomResponse = (com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomResponse) fVar;
        return n51.f.a(this.BaseResponse, getMyChatroomResponse.BaseResponse) && n51.f.a(this.next_version, getMyChatroomResponse.next_version) && n51.f.a(this.my_chatroom_info_list, getMyChatroomResponse.my_chatroom_info_list) && n51.f.a(this.my_chatroom_notice, getMyChatroomResponse.my_chatroom_notice);
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
            fVar.g(3, 8, this.my_chatroom_info_list);
            com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomNotice myChatroomNotice = this.my_chatroom_notice;
            if (myChatroomNotice != null) {
                fVar.i(4, myChatroomNotice.computeSize());
                this.my_chatroom_notice.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str2 = this.next_version;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int g17 = i18 + b36.f.g(3, 8, this.my_chatroom_info_list);
            com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomNotice myChatroomNotice2 = this.my_chatroom_notice;
            return myChatroomNotice2 != null ? g17 + b36.f.i(4, myChatroomNotice2.computeSize()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.my_chatroom_info_list.clear();
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
        com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomResponse getMyChatroomResponse = (com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomResponse) objArr[1];
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
                getMyChatroomResponse.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            getMyChatroomResponse.next_version = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo myChatroomInfo = new com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo();
                if (bArr3 != null && bArr3.length > 0) {
                    myChatroomInfo.parseFrom(bArr3);
                }
                getMyChatroomResponse.my_chatroom_info_list.add(myChatroomInfo);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomNotice myChatroomNotice3 = new com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomNotice();
            if (bArr4 != null && bArr4.length > 0) {
                myChatroomNotice3.parseFrom(bArr4);
            }
            getMyChatroomResponse.my_chatroom_notice = myChatroomNotice3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomResponse setMy_chatroom_info_list(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo> linkedList) {
        this.my_chatroom_info_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomResponse setMy_chatroom_notice(com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomNotice myChatroomNotice) {
        this.my_chatroom_notice = myChatroomNotice;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetMyChatroomResponse setNext_version(java.lang.String str) {
        this.next_version = str;
        return this;
    }
}
