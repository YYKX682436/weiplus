package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class KickOutCardInfo extends com.tencent.mm.protobuf.f {
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo right_button_jump_info;
    public java.lang.String right_button_wording;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.KickOutCardInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.KickOutCardInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.KickOutCardInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.KickOutCardInfo kickOutCardInfo = (com.tencent.mm.plugin.game.autogen.chatroom.KickOutCardInfo) fVar;
        return n51.f.a(this.right_button_wording, kickOutCardInfo.right_button_wording) && n51.f.a(this.right_button_jump_info, kickOutCardInfo.right_button_jump_info);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.right_button_wording;
            if (str != null) {
                fVar.j(1, str);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.right_button_jump_info;
            if (jumpInfo != null) {
                fVar.i(2, jumpInfo.computeSize());
                this.right_button_jump_info.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.right_button_wording;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = this.right_button_jump_info;
            return jumpInfo2 != null ? j17 + b36.f.i(2, jumpInfo2.computeSize()) : j17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.KickOutCardInfo kickOutCardInfo = (com.tencent.mm.plugin.game.autogen.chatroom.KickOutCardInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            kickOutCardInfo.right_button_wording = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
            if (bArr != null && bArr.length > 0) {
                jumpInfo3.parseFrom(bArr);
            }
            kickOutCardInfo.right_button_jump_info = jumpInfo3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.KickOutCardInfo setRight_button_jump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.right_button_jump_info = jumpInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.KickOutCardInfo setRight_button_wording(java.lang.String str) {
        this.right_button_wording = str;
        return this;
    }
}
