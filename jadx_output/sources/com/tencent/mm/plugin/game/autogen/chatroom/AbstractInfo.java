package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class AbstractInfo extends com.tencent.mm.protobuf.f {
    public java.lang.String abstract_desc;
    public com.tencent.mm.plugin.game.autogen.chatroom.Color word_color;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.AbstractInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.AbstractInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.AbstractInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.AbstractInfo abstractInfo = (com.tencent.mm.plugin.game.autogen.chatroom.AbstractInfo) fVar;
        return n51.f.a(this.word_color, abstractInfo.word_color) && n51.f.a(this.abstract_desc, abstractInfo.abstract_desc);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.plugin.game.autogen.chatroom.Color color = this.word_color;
            if (color != null) {
                fVar.i(1, color.computeSize());
                this.word_color.writeFields(fVar);
            }
            java.lang.String str = this.abstract_desc;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.game.autogen.chatroom.Color color2 = this.word_color;
            int i18 = color2 != null ? 0 + b36.f.i(1, color2.computeSize()) : 0;
            java.lang.String str2 = this.abstract_desc;
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
        com.tencent.mm.plugin.game.autogen.chatroom.AbstractInfo abstractInfo = (com.tencent.mm.plugin.game.autogen.chatroom.AbstractInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            abstractInfo.abstract_desc = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.tencent.mm.plugin.game.autogen.chatroom.Color color3 = new com.tencent.mm.plugin.game.autogen.chatroom.Color();
            if (bArr != null && bArr.length > 0) {
                color3.parseFrom(bArr);
            }
            abstractInfo.word_color = color3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.AbstractInfo setAbstract_desc(java.lang.String str) {
        this.abstract_desc = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.AbstractInfo setWord_color(com.tencent.mm.plugin.game.autogen.chatroom.Color color) {
        this.word_color = color;
        return this;
    }
}
