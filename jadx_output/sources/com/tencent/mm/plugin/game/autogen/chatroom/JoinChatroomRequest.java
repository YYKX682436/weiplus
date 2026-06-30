package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class JoinChatroomRequest extends r45.mr5 {
    public java.lang.String chatroom_name;
    public com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo extern_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.Lbs lbs_info;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomRequest create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomRequest)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomRequest joinChatroomRequest = (com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomRequest) fVar;
        return n51.f.a(this.BaseRequest, joinChatroomRequest.BaseRequest) && n51.f.a(this.chatroom_name, joinChatroomRequest.chatroom_name) && n51.f.a(this.lbs_info, joinChatroomRequest.lbs_info) && n51.f.a(this.extern_info, joinChatroomRequest.extern_info);
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
            com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo exportExternInfo = this.extern_info;
            if (exportExternInfo != null) {
                fVar.i(4, exportExternInfo.computeSize());
                this.extern_info.writeFields(fVar);
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
            com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo exportExternInfo2 = this.extern_info;
            return exportExternInfo2 != null ? i18 + b36.f.i(4, exportExternInfo2.computeSize()) : i18;
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
        com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomRequest joinChatroomRequest = (com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomRequest) objArr[1];
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
                joinChatroomRequest.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            joinChatroomRequest.chatroom_name = aVar2.k(intValue);
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
                joinChatroomRequest.lbs_info = lbs3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo exportExternInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo();
            if (bArr3 != null && bArr3.length > 0) {
                exportExternInfo3.parseFrom(bArr3);
            }
            joinChatroomRequest.extern_info = exportExternInfo3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomRequest setChatroom_name(java.lang.String str) {
        this.chatroom_name = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomRequest setExtern_info(com.tencent.mm.plugin.game.autogen.chatroom.ExportExternInfo exportExternInfo) {
        this.extern_info = exportExternInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.JoinChatroomRequest setLbs_info(com.tencent.mm.plugin.game.autogen.chatroom.Lbs lbs) {
        this.lbs_info = lbs;
        return this;
    }
}
