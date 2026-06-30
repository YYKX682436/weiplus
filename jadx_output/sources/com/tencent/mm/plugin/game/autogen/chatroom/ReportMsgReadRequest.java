package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes2.dex */
public class ReportMsgReadRequest extends r45.mr5 {
    public java.lang.String chatroom_name;
    public java.util.LinkedList<java.lang.Long> read_seq_list = new java.util.LinkedList<>();

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ReportMsgReadRequest create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ReportMsgReadRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ReportMsgReadRequest)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ReportMsgReadRequest reportMsgReadRequest = (com.tencent.mm.plugin.game.autogen.chatroom.ReportMsgReadRequest) fVar;
        return n51.f.a(this.BaseRequest, reportMsgReadRequest.BaseRequest) && n51.f.a(this.chatroom_name, reportMsgReadRequest.chatroom_name) && n51.f.a(this.read_seq_list, reportMsgReadRequest.read_seq_list);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.chatroom_name;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 3, this.read_seq_list);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.chatroom_name;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.g(3, 3, this.read_seq_list);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.read_seq_list.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        com.tencent.mm.plugin.game.autogen.chatroom.ReportMsgReadRequest reportMsgReadRequest = (com.tencent.mm.plugin.game.autogen.chatroom.ReportMsgReadRequest) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                reportMsgReadRequest.chatroom_name = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            reportMsgReadRequest.read_seq_list.add(java.lang.Long.valueOf(aVar2.i(intValue)));
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr2 = (byte[]) j17.get(i19);
            r45.he heVar3 = new r45.he();
            if (bArr2 != null && bArr2.length > 0) {
                heVar3.parseFrom(bArr2);
            }
            reportMsgReadRequest.BaseRequest = heVar3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ReportMsgReadRequest setChatroom_name(java.lang.String str) {
        this.chatroom_name = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ReportMsgReadRequest setRead_seq_list(java.util.LinkedList<java.lang.Long> linkedList) {
        this.read_seq_list = linkedList;
        return this;
    }
}
