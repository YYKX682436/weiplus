package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes2.dex */
public class AtInfo extends com.tencent.mm.protobuf.f {
    public java.util.LinkedList<java.lang.Long> seq_list = new java.util.LinkedList<>();

    public static final com.tencent.mm.plugin.game.autogen.chatroom.AtInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.AtInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.AtInfo) && n51.f.a(this.seq_list, ((com.tencent.mm.plugin.game.autogen.chatroom.AtInfo) fVar).seq_list);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 3, this.seq_list);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 3, this.seq_list) + 0;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.seq_list.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        com.tencent.mm.plugin.game.autogen.chatroom.AtInfo atInfo = (com.tencent.mm.plugin.game.autogen.chatroom.AtInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        atInfo.seq_list.add(java.lang.Long.valueOf(aVar2.i(intValue)));
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.AtInfo setSeq_list(java.util.LinkedList<java.lang.Long> linkedList) {
        this.seq_list = linkedList;
        return this;
    }
}
