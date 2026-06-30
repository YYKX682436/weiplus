package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class ChatroomPreloadInfo extends com.tencent.mm.protobuf.f {
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo preload_create_account_jump_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo preload_premade_h5_jump_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo preload_profile_jump_info;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPreloadInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPreloadInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPreloadInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPreloadInfo chatroomPreloadInfo = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPreloadInfo) fVar;
        return n51.f.a(this.preload_profile_jump_info, chatroomPreloadInfo.preload_profile_jump_info) && n51.f.a(this.preload_create_account_jump_info, chatroomPreloadInfo.preload_create_account_jump_info) && n51.f.a(this.preload_premade_h5_jump_info, chatroomPreloadInfo.preload_premade_h5_jump_info);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.preload_profile_jump_info;
            if (jumpInfo != null) {
                fVar.i(1, jumpInfo.computeSize());
                this.preload_profile_jump_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = this.preload_create_account_jump_info;
            if (jumpInfo2 != null) {
                fVar.i(2, jumpInfo2.computeSize());
                this.preload_create_account_jump_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo3 = this.preload_premade_h5_jump_info;
            if (jumpInfo3 != null) {
                fVar.i(3, jumpInfo3.computeSize());
                this.preload_premade_h5_jump_info.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo4 = this.preload_profile_jump_info;
            int i18 = jumpInfo4 != null ? 0 + b36.f.i(1, jumpInfo4.computeSize()) : 0;
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo5 = this.preload_create_account_jump_info;
            if (jumpInfo5 != null) {
                i18 += b36.f.i(2, jumpInfo5.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo6 = this.preload_premade_h5_jump_info;
            return jumpInfo6 != null ? i18 + b36.f.i(3, jumpInfo6.computeSize()) : i18;
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
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPreloadInfo chatroomPreloadInfo = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPreloadInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo7 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
                if (bArr != null && bArr.length > 0) {
                    jumpInfo7.parseFrom(bArr);
                }
                chatroomPreloadInfo.preload_profile_jump_info = jumpInfo7;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo8 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
                if (bArr2 != null && bArr2.length > 0) {
                    jumpInfo8.parseFrom(bArr2);
                }
                chatroomPreloadInfo.preload_create_account_jump_info = jumpInfo8;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo9 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
            if (bArr3 != null && bArr3.length > 0) {
                jumpInfo9.parseFrom(bArr3);
            }
            chatroomPreloadInfo.preload_premade_h5_jump_info = jumpInfo9;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPreloadInfo setPreload_create_account_jump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.preload_create_account_jump_info = jumpInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPreloadInfo setPreload_premade_h5_jump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.preload_premade_h5_jump_info = jumpInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPreloadInfo setPreload_profile_jump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.preload_profile_jump_info = jumpInfo;
        return this;
    }
}
