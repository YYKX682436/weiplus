package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class MyChatroomNotice extends com.tencent.mm.protobuf.f {
    public com.tencent.mm.plugin.game.autogen.chatroom.Color bg_color;
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock> content_list = new java.util.LinkedList<>();

    public static final com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomNotice create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomNotice();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomNotice)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomNotice myChatroomNotice = (com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomNotice) fVar;
        return n51.f.a(this.content_list, myChatroomNotice.content_list) && n51.f.a(this.bg_color, myChatroomNotice.bg_color);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.content_list);
            com.tencent.mm.plugin.game.autogen.chatroom.Color color = this.bg_color;
            if (color != null) {
                fVar.i(2, color.computeSize());
                this.bg_color.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.content_list) + 0;
            com.tencent.mm.plugin.game.autogen.chatroom.Color color2 = this.bg_color;
            return color2 != null ? g17 + b36.f.i(2, color2.computeSize()) : g17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomNotice myChatroomNotice = (com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomNotice) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock contentBlock = new com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock();
                if (bArr2 != null && bArr2.length > 0) {
                    contentBlock.parseFrom(bArr2);
                }
                myChatroomNotice.content_list.add(contentBlock);
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            com.tencent.mm.plugin.game.autogen.chatroom.Color color3 = new com.tencent.mm.plugin.game.autogen.chatroom.Color();
            if (bArr3 != null && bArr3.length > 0) {
                color3.parseFrom(bArr3);
            }
            myChatroomNotice.bg_color = color3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomNotice setBg_color(com.tencent.mm.plugin.game.autogen.chatroom.Color color) {
        this.bg_color = color;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomNotice setContent_list(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock> linkedList) {
        this.content_list = linkedList;
        return this;
    }
}
