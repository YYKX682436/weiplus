package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class ContentBlock extends com.tencent.mm.protobuf.f {
    public com.tencent.mm.plugin.game.autogen.chatroom.Color color;
    public java.lang.String content;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jump_info;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock contentBlock = (com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock) fVar;
        return n51.f.a(this.content, contentBlock.content) && n51.f.a(this.color, contentBlock.color) && n51.f.a(this.jump_info, contentBlock.jump_info);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.content;
            if (str != null) {
                fVar.j(1, str);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.Color color = this.color;
            if (color != null) {
                fVar.i(2, color.computeSize());
                this.color.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.jump_info;
            if (jumpInfo != null) {
                fVar.i(3, jumpInfo.computeSize());
                this.jump_info.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.content;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            com.tencent.mm.plugin.game.autogen.chatroom.Color color2 = this.color;
            if (color2 != null) {
                j17 += b36.f.i(2, color2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = this.jump_info;
            return jumpInfo2 != null ? j17 + b36.f.i(3, jumpInfo2.computeSize()) : j17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock contentBlock = (com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            contentBlock.content = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                com.tencent.mm.plugin.game.autogen.chatroom.Color color3 = new com.tencent.mm.plugin.game.autogen.chatroom.Color();
                if (bArr != null && bArr.length > 0) {
                    color3.parseFrom(bArr);
                }
                contentBlock.color = color3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j19.get(i19);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
            if (bArr2 != null && bArr2.length > 0) {
                jumpInfo3.parseFrom(bArr2);
            }
            contentBlock.jump_info = jumpInfo3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock setColor(com.tencent.mm.plugin.game.autogen.chatroom.Color color) {
        this.color = color;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock setContent(java.lang.String str) {
        this.content = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock setJump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.jump_info = jumpInfo;
        return this;
    }
}
