package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class LocalMyChatRoom extends com.tencent.mm.protobuf.f {
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo> my_chatroom_info_list = new java.util.LinkedList<>();
    public com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomNotice my_chatroom_notice;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom localMyChatRoom = (com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom) fVar;
        return n51.f.a(this.my_chatroom_info_list, localMyChatRoom.my_chatroom_info_list) && n51.f.a(this.my_chatroom_notice, localMyChatRoom.my_chatroom_notice);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.my_chatroom_info_list);
            com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomNotice myChatroomNotice = this.my_chatroom_notice;
            if (myChatroomNotice != null) {
                fVar.i(2, myChatroomNotice.computeSize());
                this.my_chatroom_notice.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.my_chatroom_info_list) + 0;
            com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomNotice myChatroomNotice2 = this.my_chatroom_notice;
            return myChatroomNotice2 != null ? g17 + b36.f.i(2, myChatroomNotice2.computeSize()) : g17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom localMyChatRoom = (com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo myChatroomInfo = new com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo();
                if (bArr2 != null && bArr2.length > 0) {
                    myChatroomInfo.parseFrom(bArr2);
                }
                localMyChatRoom.my_chatroom_info_list.add(myChatroomInfo);
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomNotice myChatroomNotice3 = new com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomNotice();
            if (bArr3 != null && bArr3.length > 0) {
                myChatroomNotice3.parseFrom(bArr3);
            }
            localMyChatRoom.my_chatroom_notice = myChatroomNotice3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom setMy_chatroom_info_list(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo> linkedList) {
        this.my_chatroom_info_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom setMy_chatroom_notice(com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomNotice myChatroomNotice) {
        this.my_chatroom_notice = myChatroomNotice;
        return this;
    }
}
