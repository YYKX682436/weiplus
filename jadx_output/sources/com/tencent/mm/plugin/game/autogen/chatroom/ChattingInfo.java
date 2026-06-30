package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class ChattingInfo extends com.tencent.mm.protobuf.f {
    public java.lang.String avator;
    public int chating_type;
    public java.lang.String desc;
    public int version;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ChattingInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ChattingInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChattingInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChattingInfo chattingInfo = (com.tencent.mm.plugin.game.autogen.chatroom.ChattingInfo) fVar;
        return n51.f.a(this.desc, chattingInfo.desc) && n51.f.a(java.lang.Integer.valueOf(this.chating_type), java.lang.Integer.valueOf(chattingInfo.chating_type)) && n51.f.a(this.avator, chattingInfo.avator) && n51.f.a(java.lang.Integer.valueOf(this.version), java.lang.Integer.valueOf(chattingInfo.version));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.desc;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.chating_type);
            java.lang.String str2 = this.avator;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.version);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.desc;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.chating_type);
            java.lang.String str4 = this.avator;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.e(4, this.version);
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
        com.tencent.mm.plugin.game.autogen.chatroom.ChattingInfo chattingInfo = (com.tencent.mm.plugin.game.autogen.chatroom.ChattingInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            chattingInfo.desc = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            chattingInfo.chating_type = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            chattingInfo.avator = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        chattingInfo.version = aVar2.g(intValue);
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChattingInfo setAvator(java.lang.String str) {
        this.avator = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChattingInfo setChating_type(int i17) {
        this.chating_type = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChattingInfo setDesc(java.lang.String str) {
        this.desc = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChattingInfo setVersion(int i17) {
        this.version = i17;
        return this;
    }
}
