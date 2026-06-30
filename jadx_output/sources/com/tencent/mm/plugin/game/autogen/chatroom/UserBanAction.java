package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class UserBanAction extends com.tencent.mm.protobuf.f {
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.BanAction> ban_action_list = new java.util.LinkedList<>();

    public static final com.tencent.mm.plugin.game.autogen.chatroom.UserBanAction create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.UserBanAction();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.UserBanAction) && n51.f.a(this.ban_action_list, ((com.tencent.mm.plugin.game.autogen.chatroom.UserBanAction) fVar).ban_action_list);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.ban_action_list);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.ban_action_list) + 0;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.ban_action_list.clear();
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
        com.tencent.mm.plugin.game.autogen.chatroom.UserBanAction userBanAction = (com.tencent.mm.plugin.game.autogen.chatroom.UserBanAction) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            com.tencent.mm.plugin.game.autogen.chatroom.BanAction banAction = new com.tencent.mm.plugin.game.autogen.chatroom.BanAction();
            if (bArr2 != null && bArr2.length > 0) {
                banAction.parseFrom(bArr2);
            }
            userBanAction.ban_action_list.add(banAction);
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.UserBanAction setBan_action_list(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.BanAction> linkedList) {
        this.ban_action_list = linkedList;
        return this;
    }
}
