package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes8.dex */
public class AdminInfo extends com.tencent.mm.protobuf.f {
    public java.util.LinkedList<java.lang.String> admin_username_list = new java.util.LinkedList<>();
    public java.lang.String owner_username;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo adminInfo = (com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo) fVar;
        return n51.f.a(this.owner_username, adminInfo.owner_username) && n51.f.a(this.admin_username_list, adminInfo.admin_username_list);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.owner_username;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 1, this.admin_username_list);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.owner_username;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 1, this.admin_username_list);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.admin_username_list.clear();
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
        com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo adminInfo = (com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            adminInfo.owner_username = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        adminInfo.admin_username_list.add(aVar2.k(intValue));
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo setAdmin_username_list(java.util.LinkedList<java.lang.String> linkedList) {
        this.admin_username_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo setOwner_username(java.lang.String str) {
        this.owner_username = str;
        return this;
    }
}
