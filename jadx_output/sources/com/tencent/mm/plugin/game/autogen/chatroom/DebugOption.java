package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class DebugOption extends com.tencent.mm.protobuf.f {
    public java.lang.String debug_info;
    public boolean need_debug;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.DebugOption create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.DebugOption();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.DebugOption)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.DebugOption debugOption = (com.tencent.mm.plugin.game.autogen.chatroom.DebugOption) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.need_debug), java.lang.Boolean.valueOf(debugOption.need_debug)) && n51.f.a(this.debug_info, debugOption.debug_info);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.need_debug);
            java.lang.String str = this.debug_info;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.need_debug) + 0;
            java.lang.String str2 = this.debug_info;
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
        com.tencent.mm.plugin.game.autogen.chatroom.DebugOption debugOption = (com.tencent.mm.plugin.game.autogen.chatroom.DebugOption) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            debugOption.need_debug = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        debugOption.debug_info = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.DebugOption setDebug_info(java.lang.String str) {
        this.debug_info = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.DebugOption setNeed_debug(boolean z17) {
        this.need_debug = z17;
        return this;
    }
}
