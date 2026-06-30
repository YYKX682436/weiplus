package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class TeamIcon extends com.tencent.mm.protobuf.f {
    public java.lang.String desc;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jump_info;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.TeamIcon create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.TeamIcon();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.TeamIcon)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.TeamIcon teamIcon = (com.tencent.mm.plugin.game.autogen.chatroom.TeamIcon) fVar;
        return n51.f.a(this.jump_info, teamIcon.jump_info) && n51.f.a(this.desc, teamIcon.desc);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.jump_info;
            if (jumpInfo != null) {
                fVar.i(1, jumpInfo.computeSize());
                this.jump_info.writeFields(fVar);
            }
            java.lang.String str = this.desc;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = this.jump_info;
            int i18 = jumpInfo2 != null ? 0 + b36.f.i(1, jumpInfo2.computeSize()) : 0;
            java.lang.String str2 = this.desc;
            return str2 != null ? i18 + b36.f.j(2, str2) : i18;
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
        com.tencent.mm.plugin.game.autogen.chatroom.TeamIcon teamIcon = (com.tencent.mm.plugin.game.autogen.chatroom.TeamIcon) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            teamIcon.desc = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
            if (bArr != null && bArr.length > 0) {
                jumpInfo3.parseFrom(bArr);
            }
            teamIcon.jump_info = jumpInfo3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.TeamIcon setDesc(java.lang.String str) {
        this.desc = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.TeamIcon setJump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.jump_info = jumpInfo;
        return this;
    }
}
