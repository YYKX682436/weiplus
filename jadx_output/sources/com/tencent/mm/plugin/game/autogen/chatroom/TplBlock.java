package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class TplBlock extends com.tencent.mm.protobuf.f {
    public boolean can_be_at;
    public java.lang.String content;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jump_info;
    public int type;
    public java.lang.String username;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.TplBlock create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.TplBlock();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.TplBlock)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.TplBlock tplBlock = (com.tencent.mm.plugin.game.autogen.chatroom.TplBlock) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.type), java.lang.Integer.valueOf(tplBlock.type)) && n51.f.a(this.content, tplBlock.content) && n51.f.a(this.jump_info, tplBlock.jump_info) && n51.f.a(this.username, tplBlock.username) && n51.f.a(java.lang.Boolean.valueOf(this.can_be_at), java.lang.Boolean.valueOf(tplBlock.can_be_at));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.type);
            java.lang.String str = this.content;
            if (str != null) {
                fVar.j(2, str);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.jump_info;
            if (jumpInfo != null) {
                fVar.i(3, jumpInfo.computeSize());
                this.jump_info.writeFields(fVar);
            }
            java.lang.String str2 = this.username;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.a(5, this.can_be_at);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.type) + 0;
            java.lang.String str3 = this.content;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = this.jump_info;
            if (jumpInfo2 != null) {
                e17 += b36.f.i(3, jumpInfo2.computeSize());
            }
            java.lang.String str4 = this.username;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            return e17 + b36.f.a(5, this.can_be_at);
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
        com.tencent.mm.plugin.game.autogen.chatroom.TplBlock tplBlock = (com.tencent.mm.plugin.game.autogen.chatroom.TplBlock) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tplBlock.type = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            tplBlock.content = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                tplBlock.username = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            tplBlock.can_be_at = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
            if (bArr != null && bArr.length > 0) {
                jumpInfo3.parseFrom(bArr);
            }
            tplBlock.jump_info = jumpInfo3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.TplBlock setCan_be_at(boolean z17) {
        this.can_be_at = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.TplBlock setContent(java.lang.String str) {
        this.content = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.TplBlock setJump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.jump_info = jumpInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.TplBlock setType(int i17) {
        this.type = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.TplBlock setUsername(java.lang.String str) {
        this.username = str;
        return this;
    }
}
