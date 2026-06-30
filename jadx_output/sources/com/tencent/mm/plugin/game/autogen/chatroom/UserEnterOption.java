package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class UserEnterOption extends com.tencent.mm.protobuf.f {
    public java.lang.String avatar;
    public java.lang.String option_desc;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.UserEnterOption create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.UserEnterOption();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.UserEnterOption)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.UserEnterOption userEnterOption = (com.tencent.mm.plugin.game.autogen.chatroom.UserEnterOption) fVar;
        return n51.f.a(this.avatar, userEnterOption.avatar) && n51.f.a(this.option_desc, userEnterOption.option_desc);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.avatar;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.option_desc;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.avatar;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.option_desc;
            return str4 != null ? j17 + b36.f.j(2, str4) : j17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.UserEnterOption userEnterOption = (com.tencent.mm.plugin.game.autogen.chatroom.UserEnterOption) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            userEnterOption.avatar = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        userEnterOption.option_desc = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.UserEnterOption setAvatar(java.lang.String str) {
        this.avatar = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.UserEnterOption setOption_desc(java.lang.String str) {
        this.option_desc = str;
        return this;
    }
}
