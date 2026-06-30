package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class LbsInfo extends com.tencent.mm.protobuf.f {
    public java.lang.String location_desc;
    public com.tencent.mm.plugin.game.autogen.chatroom.GCLocationInfo location_info;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.LbsInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.LbsInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.LbsInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.LbsInfo lbsInfo = (com.tencent.mm.plugin.game.autogen.chatroom.LbsInfo) fVar;
        return n51.f.a(this.location_info, lbsInfo.location_info) && n51.f.a(this.location_desc, lbsInfo.location_desc);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.plugin.game.autogen.chatroom.GCLocationInfo gCLocationInfo = this.location_info;
            if (gCLocationInfo != null) {
                fVar.i(1, gCLocationInfo.computeSize());
                this.location_info.writeFields(fVar);
            }
            java.lang.String str = this.location_desc;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.game.autogen.chatroom.GCLocationInfo gCLocationInfo2 = this.location_info;
            int i18 = gCLocationInfo2 != null ? 0 + b36.f.i(1, gCLocationInfo2.computeSize()) : 0;
            java.lang.String str2 = this.location_desc;
            return str2 != null ? i18 + b36.f.j(2, str2) : i18;
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
        com.tencent.mm.plugin.game.autogen.chatroom.LbsInfo lbsInfo = (com.tencent.mm.plugin.game.autogen.chatroom.LbsInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            lbsInfo.location_desc = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.tencent.mm.plugin.game.autogen.chatroom.GCLocationInfo gCLocationInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.GCLocationInfo();
            if (bArr != null && bArr.length > 0) {
                gCLocationInfo3.parseFrom(bArr);
            }
            lbsInfo.location_info = gCLocationInfo3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.LbsInfo setLocation_desc(java.lang.String str) {
        this.location_desc = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.LbsInfo setLocation_info(com.tencent.mm.plugin.game.autogen.chatroom.GCLocationInfo gCLocationInfo) {
        this.location_info = gCLocationInfo;
        return this;
    }
}
