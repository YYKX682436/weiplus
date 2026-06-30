package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class JoinChatroomResponse extends r45.js5 {
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo chatroom_full_jump_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo create_account_jump_info;
    public java.lang.String errmsg;
    public boolean need_jump_create_account;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomResponse create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomResponse)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomResponse joinChatroomResponse = (com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomResponse) fVar;
        return n51.f.a(this.BaseResponse, joinChatroomResponse.BaseResponse) && n51.f.a(this.errmsg, joinChatroomResponse.errmsg) && n51.f.a(java.lang.Boolean.valueOf(this.need_jump_create_account), java.lang.Boolean.valueOf(joinChatroomResponse.need_jump_create_account)) && n51.f.a(this.create_account_jump_info, joinChatroomResponse.create_account_jump_info) && n51.f.a(this.chatroom_full_jump_info, joinChatroomResponse.chatroom_full_jump_info);
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
            java.lang.String str = this.errmsg;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.need_jump_create_account);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.create_account_jump_info;
            if (jumpInfo != null) {
                fVar.i(4, jumpInfo.computeSize());
                this.create_account_jump_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = this.chatroom_full_jump_info;
            if (jumpInfo2 != null) {
                fVar.i(5, jumpInfo2.computeSize());
                this.chatroom_full_jump_info.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str2 = this.errmsg;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int a17 = i18 + b36.f.a(3, this.need_jump_create_account);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo3 = this.create_account_jump_info;
            if (jumpInfo3 != null) {
                a17 += b36.f.i(4, jumpInfo3.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo4 = this.chatroom_full_jump_info;
            return jumpInfo4 != null ? a17 + b36.f.i(5, jumpInfo4.computeSize()) : a17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomResponse joinChatroomResponse = (com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomResponse) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                joinChatroomResponse.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            joinChatroomResponse.errmsg = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            joinChatroomResponse.need_jump_create_account = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo5 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
                if (bArr2 != null && bArr2.length > 0) {
                    jumpInfo5.parseFrom(bArr2);
                }
                joinChatroomResponse.create_account_jump_info = jumpInfo5;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo6 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
            if (bArr3 != null && bArr3.length > 0) {
                jumpInfo6.parseFrom(bArr3);
            }
            joinChatroomResponse.chatroom_full_jump_info = jumpInfo6;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomResponse setChatroom_full_jump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.chatroom_full_jump_info = jumpInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomResponse setCreate_account_jump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.create_account_jump_info = jumpInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomResponse setErrmsg(java.lang.String str) {
        this.errmsg = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomResponse setNeed_jump_create_account(boolean z17) {
        this.need_jump_create_account = z17;
        return this;
    }
}
