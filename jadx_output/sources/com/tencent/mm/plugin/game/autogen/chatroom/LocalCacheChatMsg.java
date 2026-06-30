package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class LocalCacheChatMsg extends com.tencent.mm.protobuf.f {
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> chatroom_msg_list = new java.util.LinkedList<>();
    public java.lang.String host_user_name;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.LocalCacheChatMsg create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.LocalCacheChatMsg();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.LocalCacheChatMsg)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.LocalCacheChatMsg localCacheChatMsg = (com.tencent.mm.plugin.game.autogen.chatroom.LocalCacheChatMsg) fVar;
        return n51.f.a(this.chatroom_msg_list, localCacheChatMsg.chatroom_msg_list) && n51.f.a(this.host_user_name, localCacheChatMsg.host_user_name);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.chatroom_msg_list);
            java.lang.String str = this.host_user_name;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.chatroom_msg_list) + 0;
            java.lang.String str2 = this.host_user_name;
            return str2 != null ? g17 + b36.f.j(2, str2) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.chatroom_msg_list.clear();
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
        com.tencent.mm.plugin.game.autogen.chatroom.LocalCacheChatMsg localCacheChatMsg = (com.tencent.mm.plugin.game.autogen.chatroom.LocalCacheChatMsg) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            localCacheChatMsg.host_user_name = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack();
            if (bArr2 != null && bArr2.length > 0) {
                chatroomMsgPack.parseFrom(bArr2);
            }
            localCacheChatMsg.chatroom_msg_list.add(chatroomMsgPack);
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.LocalCacheChatMsg setChatroom_msg_list(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> linkedList) {
        this.chatroom_msg_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.LocalCacheChatMsg setHost_user_name(java.lang.String str) {
        this.host_user_name = str;
        return this;
    }
}
