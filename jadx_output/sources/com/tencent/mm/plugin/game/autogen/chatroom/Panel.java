package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class Panel extends com.tencent.mm.protobuf.f {
    public java.lang.String desc;
    public java.lang.String icon;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jump_info;
    public int type;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.Panel create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.Panel();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.Panel)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.Panel panel = (com.tencent.mm.plugin.game.autogen.chatroom.Panel) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.type), java.lang.Integer.valueOf(panel.type)) && n51.f.a(this.icon, panel.icon) && n51.f.a(this.desc, panel.desc) && n51.f.a(this.jump_info, panel.jump_info);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.type);
            java.lang.String str = this.icon;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.desc;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.jump_info;
            if (jumpInfo != null) {
                fVar.i(4, jumpInfo.computeSize());
                this.jump_info.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.type) + 0;
            java.lang.String str3 = this.icon;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.desc;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = this.jump_info;
            return jumpInfo2 != null ? e17 + b36.f.i(4, jumpInfo2.computeSize()) : e17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.Panel panel = (com.tencent.mm.plugin.game.autogen.chatroom.Panel) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            panel.type = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            panel.icon = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            panel.desc = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
            if (bArr != null && bArr.length > 0) {
                jumpInfo3.parseFrom(bArr);
            }
            panel.jump_info = jumpInfo3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Panel setDesc(java.lang.String str) {
        this.desc = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Panel setIcon(java.lang.String str) {
        this.icon = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Panel setJump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.jump_info = jumpInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Panel setType(int i17) {
        this.type = i17;
        return this;
    }
}
