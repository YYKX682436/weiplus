package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class BanAction extends com.tencent.mm.protobuf.f {
    public java.lang.String desc;
    public int type;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.BanAction create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.BanAction();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.BanAction)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.BanAction banAction = (com.tencent.mm.plugin.game.autogen.chatroom.BanAction) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.type), java.lang.Integer.valueOf(banAction.type)) && n51.f.a(this.desc, banAction.desc);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.type);
            java.lang.String str = this.desc;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.type) + 0;
            java.lang.String str2 = this.desc;
            return str2 != null ? e17 + b36.f.j(2, str2) : e17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.BanAction banAction = (com.tencent.mm.plugin.game.autogen.chatroom.BanAction) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            banAction.type = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        banAction.desc = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.BanAction setDesc(java.lang.String str) {
        this.desc = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.BanAction setType(int i17) {
        this.type = i17;
        return this;
    }
}
