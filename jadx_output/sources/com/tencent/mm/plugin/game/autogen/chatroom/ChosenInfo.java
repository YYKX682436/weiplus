package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class ChosenInfo extends com.tencent.mm.protobuf.f {
    public boolean can_be_chosen;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ChosenInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ChosenInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChosenInfo) && n51.f.a(java.lang.Boolean.valueOf(this.can_be_chosen), java.lang.Boolean.valueOf(((com.tencent.mm.plugin.game.autogen.chatroom.ChosenInfo) fVar).can_be_chosen));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).a(1, this.can_be_chosen);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.can_be_chosen) + 0;
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
        com.tencent.mm.plugin.game.autogen.chatroom.ChosenInfo chosenInfo = (com.tencent.mm.plugin.game.autogen.chatroom.ChosenInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        chosenInfo.can_be_chosen = aVar2.c(intValue);
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChosenInfo setCan_be_chosen(boolean z17) {
        this.can_be_chosen = z17;
        return this;
    }
}
