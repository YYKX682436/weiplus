package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class GetFirstEnterInfoResponse extends r45.js5 {
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock> content_list = new java.util.LinkedList<>();
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo enter_jump_info;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.GetFirstEnterInfoResponse create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.GetFirstEnterInfoResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.GetFirstEnterInfoResponse)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.GetFirstEnterInfoResponse getFirstEnterInfoResponse = (com.tencent.mm.plugin.game.autogen.chatroom.GetFirstEnterInfoResponse) fVar;
        return n51.f.a(this.BaseResponse, getFirstEnterInfoResponse.BaseResponse) && n51.f.a(this.content_list, getFirstEnterInfoResponse.content_list) && n51.f.a(this.enter_jump_info, getFirstEnterInfoResponse.enter_jump_info);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, this.content_list);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.enter_jump_info;
            if (jumpInfo != null) {
                fVar.i(3, jumpInfo.computeSize());
                this.enter_jump_info.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, this.content_list);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = this.enter_jump_info;
            return jumpInfo2 != null ? i18 + b36.f.i(3, jumpInfo2.computeSize()) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.content_list.clear();
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
        com.tencent.mm.plugin.game.autogen.chatroom.GetFirstEnterInfoResponse getFirstEnterInfoResponse = (com.tencent.mm.plugin.game.autogen.chatroom.GetFirstEnterInfoResponse) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                getFirstEnterInfoResponse.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock contentBlock = new com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock();
                if (bArr3 != null && bArr3.length > 0) {
                    contentBlock.parseFrom(bArr3);
                }
                getFirstEnterInfoResponse.content_list.add(contentBlock);
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
            if (bArr4 != null && bArr4.length > 0) {
                jumpInfo3.parseFrom(bArr4);
            }
            getFirstEnterInfoResponse.enter_jump_info = jumpInfo3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetFirstEnterInfoResponse setContent_list(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock> linkedList) {
        this.content_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetFirstEnterInfoResponse setEnter_jump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.enter_jump_info = jumpInfo;
        return this;
    }
}
