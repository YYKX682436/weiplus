package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class Slot extends com.tencent.mm.protobuf.f {
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jump_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser online_user_status;
    public int slot_type;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.Slot create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.Slot();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.Slot)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.Slot slot = (com.tencent.mm.plugin.game.autogen.chatroom.Slot) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.slot_type), java.lang.Integer.valueOf(slot.slot_type)) && n51.f.a(this.online_user_status, slot.online_user_status) && n51.f.a(this.jump_info, slot.jump_info);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.slot_type);
            com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser onlineUser = this.online_user_status;
            if (onlineUser != null) {
                fVar.i(2, onlineUser.computeSize());
                this.online_user_status.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.jump_info;
            if (jumpInfo != null) {
                fVar.i(3, jumpInfo.computeSize());
                this.jump_info.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.slot_type) + 0;
            com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser onlineUser2 = this.online_user_status;
            if (onlineUser2 != null) {
                e17 += b36.f.i(2, onlineUser2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = this.jump_info;
            return jumpInfo2 != null ? e17 + b36.f.i(3, jumpInfo2.computeSize()) : e17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.Slot slot = (com.tencent.mm.plugin.game.autogen.chatroom.Slot) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            slot.slot_type = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser onlineUser3 = new com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser();
                if (bArr != null && bArr.length > 0) {
                    onlineUser3.parseFrom(bArr);
                }
                slot.online_user_status = onlineUser3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
            if (bArr2 != null && bArr2.length > 0) {
                jumpInfo3.parseFrom(bArr2);
            }
            slot.jump_info = jumpInfo3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Slot setJump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.jump_info = jumpInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Slot setOnline_user_status(com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser onlineUser) {
        this.online_user_status = onlineUser;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Slot setSlot_type(int i17) {
        this.slot_type = i17;
        return this;
    }
}
