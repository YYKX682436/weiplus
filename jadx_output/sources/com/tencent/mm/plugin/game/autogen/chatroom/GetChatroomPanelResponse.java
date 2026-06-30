package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes2.dex */
public class GetChatroomPanelResponse extends r45.js5 {
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPanel chatroom_panel;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomPanelResponse create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomPanelResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomPanelResponse)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomPanelResponse getChatroomPanelResponse = (com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomPanelResponse) fVar;
        return n51.f.a(this.BaseResponse, getChatroomPanelResponse.BaseResponse) && n51.f.a(this.chatroom_panel, getChatroomPanelResponse.chatroom_panel);
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
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPanel chatroomPanel = this.chatroom_panel;
            if (chatroomPanel != null) {
                fVar.i(2, chatroomPanel.computeSize());
                this.chatroom_panel.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPanel chatroomPanel2 = this.chatroom_panel;
            return chatroomPanel2 != null ? i18 + b36.f.i(2, chatroomPanel2.computeSize()) : i18;
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
        com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomPanelResponse getChatroomPanelResponse = (com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomPanelResponse) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                getChatroomPanelResponse.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPanel chatroomPanel3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPanel();
            if (bArr2 != null && bArr2.length > 0) {
                chatroomPanel3.parseFrom(bArr2);
            }
            getChatroomPanelResponse.chatroom_panel = chatroomPanel3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomPanelResponse setChatroom_panel(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPanel chatroomPanel) {
        this.chatroom_panel = chatroomPanel;
        return this;
    }
}
