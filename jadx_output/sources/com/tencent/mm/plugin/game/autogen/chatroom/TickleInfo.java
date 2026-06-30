package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class TickleInfo extends com.tencent.mm.protobuf.f {
    public boolean is_tickle;
    public java.lang.String to_username;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.TickleInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.TickleInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.TickleInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.TickleInfo tickleInfo = (com.tencent.mm.plugin.game.autogen.chatroom.TickleInfo) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.is_tickle), java.lang.Boolean.valueOf(tickleInfo.is_tickle)) && n51.f.a(this.to_username, tickleInfo.to_username);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.is_tickle);
            java.lang.String str = this.to_username;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.is_tickle) + 0;
            java.lang.String str2 = this.to_username;
            return str2 != null ? a17 + b36.f.j(2, str2) : a17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.TickleInfo tickleInfo = (com.tencent.mm.plugin.game.autogen.chatroom.TickleInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tickleInfo.is_tickle = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        tickleInfo.to_username = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.TickleInfo setIs_tickle(boolean z17) {
        this.is_tickle = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.TickleInfo setTo_username(java.lang.String str) {
        this.to_username = str;
        return this;
    }
}
