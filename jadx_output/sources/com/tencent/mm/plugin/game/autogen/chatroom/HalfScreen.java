package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes8.dex */
public class HalfScreen extends com.tencent.mm.protobuf.f {
    public int screen_height_dp;
    public float screen_height_percent;
    public int type;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen halfScreen = (com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.type), java.lang.Integer.valueOf(halfScreen.type)) && n51.f.a(java.lang.Integer.valueOf(this.screen_height_dp), java.lang.Integer.valueOf(halfScreen.screen_height_dp)) && n51.f.a(java.lang.Float.valueOf(this.screen_height_percent), java.lang.Float.valueOf(halfScreen.screen_height_percent));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.type);
            fVar.e(2, this.screen_height_dp);
            fVar.d(3, this.screen_height_percent);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.type) + 0 + b36.f.e(2, this.screen_height_dp) + b36.f.d(3, this.screen_height_percent);
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
        com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen halfScreen = (com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            halfScreen.type = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            halfScreen.screen_height_dp = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        halfScreen.screen_height_percent = aVar2.f(intValue);
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen setScreen_height_dp(int i17) {
        this.screen_height_dp = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen setScreen_height_percent(float f17) {
        this.screen_height_percent = f17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen setType(int i17) {
        this.type = i17;
        return this;
    }
}
