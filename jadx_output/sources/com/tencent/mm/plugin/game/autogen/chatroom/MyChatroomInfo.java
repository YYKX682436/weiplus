package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class MyChatroomInfo extends com.tencent.mm.protobuf.f {
    public com.tencent.mm.plugin.game.autogen.chatroom.AbstractInfo abstract_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.AtInfo at_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo chatroom_info;
    public java.lang.String last_msg_desc;
    public long unread_msg_count;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo myChatroomInfo = (com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo) fVar;
        return n51.f.a(this.chatroom_info, myChatroomInfo.chatroom_info) && n51.f.a(this.at_info, myChatroomInfo.at_info) && n51.f.a(java.lang.Long.valueOf(this.unread_msg_count), java.lang.Long.valueOf(myChatroomInfo.unread_msg_count)) && n51.f.a(this.abstract_info, myChatroomInfo.abstract_info) && n51.f.a(this.last_msg_desc, myChatroomInfo.last_msg_desc);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo chatroomRecInfo = this.chatroom_info;
            if (chatroomRecInfo != null) {
                fVar.i(1, chatroomRecInfo.computeSize());
                this.chatroom_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.AtInfo atInfo = this.at_info;
            if (atInfo != null) {
                fVar.i(2, atInfo.computeSize());
                this.at_info.writeFields(fVar);
            }
            fVar.h(3, this.unread_msg_count);
            com.tencent.mm.plugin.game.autogen.chatroom.AbstractInfo abstractInfo = this.abstract_info;
            if (abstractInfo != null) {
                fVar.i(4, abstractInfo.computeSize());
                this.abstract_info.writeFields(fVar);
            }
            java.lang.String str = this.last_msg_desc;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo chatroomRecInfo2 = this.chatroom_info;
            int i18 = chatroomRecInfo2 != null ? 0 + b36.f.i(1, chatroomRecInfo2.computeSize()) : 0;
            com.tencent.mm.plugin.game.autogen.chatroom.AtInfo atInfo2 = this.at_info;
            if (atInfo2 != null) {
                i18 += b36.f.i(2, atInfo2.computeSize());
            }
            int h17 = i18 + b36.f.h(3, this.unread_msg_count);
            com.tencent.mm.plugin.game.autogen.chatroom.AbstractInfo abstractInfo2 = this.abstract_info;
            if (abstractInfo2 != null) {
                h17 += b36.f.i(4, abstractInfo2.computeSize());
            }
            java.lang.String str2 = this.last_msg_desc;
            return str2 != null ? h17 + b36.f.j(5, str2) : h17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo myChatroomInfo = (com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo chatroomRecInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo();
                if (bArr != null && bArr.length > 0) {
                    chatroomRecInfo3.parseFrom(bArr);
                }
                myChatroomInfo.chatroom_info = chatroomRecInfo3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.tencent.mm.plugin.game.autogen.chatroom.AtInfo atInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.AtInfo();
                if (bArr2 != null && bArr2.length > 0) {
                    atInfo3.parseFrom(bArr2);
                }
                myChatroomInfo.at_info = atInfo3;
            }
            return 0;
        }
        if (intValue == 3) {
            myChatroomInfo.unread_msg_count = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            myChatroomInfo.last_msg_desc = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            com.tencent.mm.plugin.game.autogen.chatroom.AbstractInfo abstractInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.AbstractInfo();
            if (bArr3 != null && bArr3.length > 0) {
                abstractInfo3.parseFrom(bArr3);
            }
            myChatroomInfo.abstract_info = abstractInfo3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo setAbstract_info(com.tencent.mm.plugin.game.autogen.chatroom.AbstractInfo abstractInfo) {
        this.abstract_info = abstractInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo setAt_info(com.tencent.mm.plugin.game.autogen.chatroom.AtInfo atInfo) {
        this.at_info = atInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo setChatroom_info(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo chatroomRecInfo) {
        this.chatroom_info = chatroomRecInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo setLast_msg_desc(java.lang.String str) {
        this.last_msg_desc = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo setUnread_msg_count(long j17) {
        this.unread_msg_count = j17;
        return this;
    }
}
