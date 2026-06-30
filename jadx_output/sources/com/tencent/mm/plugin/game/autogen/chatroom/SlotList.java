package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class SlotList extends com.tencent.mm.protobuf.f {
    public java.lang.String head_desc;
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.Slot> slot_list = new java.util.LinkedList<>();
    public java.lang.String version;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.SlotList create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.SlotList();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.SlotList)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.SlotList slotList = (com.tencent.mm.plugin.game.autogen.chatroom.SlotList) fVar;
        return n51.f.a(this.slot_list, slotList.slot_list) && n51.f.a(this.version, slotList.version) && n51.f.a(this.head_desc, slotList.head_desc);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.slot_list);
            java.lang.String str = this.version;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.head_desc;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.slot_list) + 0;
            java.lang.String str3 = this.version;
            if (str3 != null) {
                g17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.head_desc;
            return str4 != null ? g17 + b36.f.j(3, str4) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.slot_list.clear();
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
        com.tencent.mm.plugin.game.autogen.chatroom.SlotList slotList = (com.tencent.mm.plugin.game.autogen.chatroom.SlotList) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                slotList.version = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            slotList.head_desc = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            com.tencent.mm.plugin.game.autogen.chatroom.Slot slot = new com.tencent.mm.plugin.game.autogen.chatroom.Slot();
            if (bArr2 != null && bArr2.length > 0) {
                slot.parseFrom(bArr2);
            }
            slotList.slot_list.add(slot);
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.SlotList setHead_desc(java.lang.String str) {
        this.head_desc = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.SlotList setSlot_list(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.Slot> linkedList) {
        this.slot_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.SlotList setVersion(java.lang.String str) {
        this.version = str;
        return this;
    }
}
