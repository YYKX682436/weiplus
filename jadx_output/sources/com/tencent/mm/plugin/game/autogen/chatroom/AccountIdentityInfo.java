package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes2.dex */
public class AccountIdentityInfo extends com.tencent.mm.protobuf.f {
    public java.lang.String auth_desc;
    public int auth_icon_type;
    public int auth_type;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.AccountIdentityInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.AccountIdentityInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.AccountIdentityInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.AccountIdentityInfo accountIdentityInfo = (com.tencent.mm.plugin.game.autogen.chatroom.AccountIdentityInfo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.auth_type), java.lang.Integer.valueOf(accountIdentityInfo.auth_type)) && n51.f.a(this.auth_desc, accountIdentityInfo.auth_desc) && n51.f.a(java.lang.Integer.valueOf(this.auth_icon_type), java.lang.Integer.valueOf(accountIdentityInfo.auth_icon_type));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.auth_type);
            java.lang.String str = this.auth_desc;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.auth_icon_type);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.auth_type) + 0;
            java.lang.String str2 = this.auth_desc;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.e(3, this.auth_icon_type);
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
        com.tencent.mm.plugin.game.autogen.chatroom.AccountIdentityInfo accountIdentityInfo = (com.tencent.mm.plugin.game.autogen.chatroom.AccountIdentityInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            accountIdentityInfo.auth_type = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            accountIdentityInfo.auth_desc = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        accountIdentityInfo.auth_icon_type = aVar2.g(intValue);
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.AccountIdentityInfo setAuth_desc(java.lang.String str) {
        this.auth_desc = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.AccountIdentityInfo setAuth_icon_type(int i17) {
        this.auth_icon_type = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.AccountIdentityInfo setAuth_type(int i17) {
        this.auth_type = i17;
        return this;
    }
}
