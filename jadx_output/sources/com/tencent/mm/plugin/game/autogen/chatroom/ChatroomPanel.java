package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes2.dex */
public class ChatroomPanel extends com.tencent.mm.protobuf.f {
    public java.lang.String panel_icon;
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.Panel> panel_list = new java.util.LinkedList<>();
    public java.lang.String panel_text;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPanel create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPanel();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPanel)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPanel chatroomPanel = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPanel) fVar;
        return n51.f.a(this.panel_list, chatroomPanel.panel_list) && n51.f.a(this.panel_icon, chatroomPanel.panel_icon) && n51.f.a(this.panel_text, chatroomPanel.panel_text);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.panel_list);
            java.lang.String str = this.panel_icon;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.panel_text;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.panel_list) + 0;
            java.lang.String str3 = this.panel_icon;
            if (str3 != null) {
                g17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.panel_text;
            return str4 != null ? g17 + b36.f.j(3, str4) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.panel_list.clear();
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
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPanel chatroomPanel = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPanel) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                chatroomPanel.panel_icon = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            chatroomPanel.panel_text = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            com.tencent.mm.plugin.game.autogen.chatroom.Panel panel = new com.tencent.mm.plugin.game.autogen.chatroom.Panel();
            if (bArr2 != null && bArr2.length > 0) {
                panel.parseFrom(bArr2);
            }
            chatroomPanel.panel_list.add(panel);
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPanel setPanel_icon(java.lang.String str) {
        this.panel_icon = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPanel setPanel_list(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.Panel> linkedList) {
        this.panel_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomPanel setPanel_text(java.lang.String str) {
        this.panel_text = str;
        return this;
    }
}
