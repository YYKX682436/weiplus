package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes2.dex */
public class ChatroomNotice extends com.tencent.mm.protobuf.f {
    public java.lang.String notice_text;
    public long update_time;
    public int updater_uin;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ChatroomNotice create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomNotice();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChatroomNotice)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomNotice chatroomNotice = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomNotice) fVar;
        return n51.f.a(this.notice_text, chatroomNotice.notice_text) && n51.f.a(java.lang.Long.valueOf(this.update_time), java.lang.Long.valueOf(chatroomNotice.update_time)) && n51.f.a(java.lang.Integer.valueOf(this.updater_uin), java.lang.Integer.valueOf(chatroomNotice.updater_uin));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.notice_text;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.update_time);
            fVar.e(3, this.updater_uin);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.notice_text;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.update_time) + b36.f.e(3, this.updater_uin);
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
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomNotice chatroomNotice = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomNotice) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            chatroomNotice.notice_text = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            chatroomNotice.update_time = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        chatroomNotice.updater_uin = aVar2.g(intValue);
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomNotice setNotice_text(java.lang.String str) {
        this.notice_text = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomNotice setUpdate_time(long j17) {
        this.update_time = j17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomNotice setUpdater_uin(int i17) {
        this.updater_uin = i17;
        return this;
    }
}
