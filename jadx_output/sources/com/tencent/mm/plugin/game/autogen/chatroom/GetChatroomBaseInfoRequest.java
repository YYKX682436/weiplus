package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class GetChatroomBaseInfoRequest extends r45.mr5 {
    public java.lang.String chatroom_name;
    public com.tencent.mm.plugin.game.autogen.chatroom.DebugOption debug_option;
    public com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo export_extern_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.Lbs lbs_info;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoRequest create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoRequest)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoRequest getChatroomBaseInfoRequest = (com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoRequest) fVar;
        return n51.f.a(this.BaseRequest, getChatroomBaseInfoRequest.BaseRequest) && n51.f.a(this.chatroom_name, getChatroomBaseInfoRequest.chatroom_name) && n51.f.a(this.lbs_info, getChatroomBaseInfoRequest.lbs_info) && n51.f.a(this.export_extern_info, getChatroomBaseInfoRequest.export_extern_info) && n51.f.a(this.debug_option, getChatroomBaseInfoRequest.debug_option);
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
            com.tencent.mm.plugin.game.autogen.chatroom.Lbs lbs = this.lbs_info;
            if (lbs != null) {
                fVar.i(3, lbs.computeSize());
                this.lbs_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo exportExternInfo = this.export_extern_info;
            if (exportExternInfo != null) {
                fVar.i(4, exportExternInfo.computeSize());
                this.export_extern_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.DebugOption debugOption = this.debug_option;
            if (debugOption != null) {
                fVar.i(5, debugOption.computeSize());
                this.debug_option.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.chatroom_name;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.Lbs lbs2 = this.lbs_info;
            if (lbs2 != null) {
                i18 += b36.f.i(3, lbs2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo exportExternInfo2 = this.export_extern_info;
            if (exportExternInfo2 != null) {
                i18 += b36.f.i(4, exportExternInfo2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.DebugOption debugOption2 = this.debug_option;
            return debugOption2 != null ? i18 + b36.f.i(5, debugOption2.computeSize()) : i18;
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
        com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoRequest getChatroomBaseInfoRequest = (com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoRequest) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                getChatroomBaseInfoRequest.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            getChatroomBaseInfoRequest.chatroom_name = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.tencent.mm.plugin.game.autogen.chatroom.Lbs lbs3 = new com.tencent.mm.plugin.game.autogen.chatroom.Lbs();
                if (bArr2 != null && bArr2.length > 0) {
                    lbs3.parseFrom(bArr2);
                }
                getChatroomBaseInfoRequest.lbs_info = lbs3;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo exportExternInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo();
                if (bArr3 != null && bArr3.length > 0) {
                    exportExternInfo3.parseFrom(bArr3);
                }
                getChatroomBaseInfoRequest.export_extern_info = exportExternInfo3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            com.tencent.mm.plugin.game.autogen.chatroom.DebugOption debugOption3 = new com.tencent.mm.plugin.game.autogen.chatroom.DebugOption();
            if (bArr4 != null && bArr4.length > 0) {
                debugOption3.parseFrom(bArr4);
            }
            getChatroomBaseInfoRequest.debug_option = debugOption3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoRequest setChatroom_name(java.lang.String str) {
        this.chatroom_name = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoRequest setDebug_option(com.tencent.mm.plugin.game.autogen.chatroom.DebugOption debugOption) {
        this.debug_option = debugOption;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoRequest setExport_extern_info(com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo exportExternInfo) {
        this.export_extern_info = exportExternInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoRequest setLbs_info(com.tencent.mm.plugin.game.autogen.chatroom.Lbs lbs) {
        this.lbs_info = lbs;
        return this;
    }
}
