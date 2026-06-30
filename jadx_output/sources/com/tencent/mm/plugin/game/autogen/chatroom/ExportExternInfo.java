package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class ExportExternInfo extends com.tencent.mm.protobuf.f {
    public long sourceid;
    public long ssid;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo exportExternInfo = (com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.sourceid), java.lang.Long.valueOf(exportExternInfo.sourceid)) && n51.f.a(java.lang.Long.valueOf(this.ssid), java.lang.Long.valueOf(exportExternInfo.ssid));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.sourceid);
            fVar.h(2, this.ssid);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.sourceid) + 0 + b36.f.h(2, this.ssid);
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
        com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo exportExternInfo = (com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            exportExternInfo.sourceid = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        exportExternInfo.ssid = aVar2.i(intValue);
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo setSourceid(long j17) {
        this.sourceid = j17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo setSsid(long j17) {
        this.ssid = j17;
        return this;
    }
}
