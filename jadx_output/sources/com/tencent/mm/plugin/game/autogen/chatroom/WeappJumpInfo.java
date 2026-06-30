package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes8.dex */
public class WeappJumpInfo extends com.tencent.mm.protobuf.f {
    public java.lang.String appid;
    public java.lang.String path;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.WeappJumpInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.WeappJumpInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.WeappJumpInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.WeappJumpInfo weappJumpInfo = (com.tencent.mm.plugin.game.autogen.chatroom.WeappJumpInfo) fVar;
        return n51.f.a(this.appid, weappJumpInfo.appid) && n51.f.a(this.path, weappJumpInfo.path);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.appid;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.path;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.appid;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.path;
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
        com.tencent.mm.plugin.game.autogen.chatroom.WeappJumpInfo weappJumpInfo = (com.tencent.mm.plugin.game.autogen.chatroom.WeappJumpInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            weappJumpInfo.appid = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        weappJumpInfo.path = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.WeappJumpInfo setAppid(java.lang.String str) {
        this.appid = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.WeappJumpInfo setPath(java.lang.String str) {
        this.path = str;
        return this;
    }
}
