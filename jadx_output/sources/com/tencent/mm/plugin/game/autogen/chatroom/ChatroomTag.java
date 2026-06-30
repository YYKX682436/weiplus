package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class ChatroomTag extends com.tencent.mm.protobuf.f {
    public com.tencent.mm.plugin.game.autogen.chatroom.Color background_color;
    public boolean bold;
    public com.tencent.mm.plugin.game.autogen.chatroom.Color color;
    public java.lang.String desc;
    public java.lang.String icon;
    public long tag_id;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo tag_jump_info;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ChatroomTag create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomTag();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChatroomTag)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomTag chatroomTag = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomTag) fVar;
        return n51.f.a(this.desc, chatroomTag.desc) && n51.f.a(this.icon, chatroomTag.icon) && n51.f.a(this.background_color, chatroomTag.background_color) && n51.f.a(this.color, chatroomTag.color) && n51.f.a(this.tag_jump_info, chatroomTag.tag_jump_info) && n51.f.a(java.lang.Long.valueOf(this.tag_id), java.lang.Long.valueOf(chatroomTag.tag_id)) && n51.f.a(java.lang.Boolean.valueOf(this.bold), java.lang.Boolean.valueOf(chatroomTag.bold));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.desc;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.icon;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.Color color = this.background_color;
            if (color != null) {
                fVar.i(3, color.computeSize());
                this.background_color.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.Color color2 = this.color;
            if (color2 != null) {
                fVar.i(4, color2.computeSize());
                this.color.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.tag_jump_info;
            if (jumpInfo != null) {
                fVar.i(5, jumpInfo.computeSize());
                this.tag_jump_info.writeFields(fVar);
            }
            fVar.h(6, this.tag_id);
            fVar.a(7, this.bold);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.desc;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.icon;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.Color color3 = this.background_color;
            if (color3 != null) {
                j17 += b36.f.i(3, color3.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.Color color4 = this.color;
            if (color4 != null) {
                j17 += b36.f.i(4, color4.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = this.tag_jump_info;
            if (jumpInfo2 != null) {
                j17 += b36.f.i(5, jumpInfo2.computeSize());
            }
            return j17 + b36.f.h(6, this.tag_id) + b36.f.a(7, this.bold);
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
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomTag chatroomTag = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomTag) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                chatroomTag.desc = aVar2.k(intValue);
                return 0;
            case 2:
                chatroomTag.icon = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.mm.plugin.game.autogen.chatroom.Color color5 = new com.tencent.mm.plugin.game.autogen.chatroom.Color();
                    if (bArr != null && bArr.length > 0) {
                        color5.parseFrom(bArr);
                    }
                    chatroomTag.background_color = color5;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    com.tencent.mm.plugin.game.autogen.chatroom.Color color6 = new com.tencent.mm.plugin.game.autogen.chatroom.Color();
                    if (bArr2 != null && bArr2.length > 0) {
                        color6.parseFrom(bArr2);
                    }
                    chatroomTag.color = color6;
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
                    if (bArr3 != null && bArr3.length > 0) {
                        jumpInfo3.parseFrom(bArr3);
                    }
                    chatroomTag.tag_jump_info = jumpInfo3;
                }
                return 0;
            case 6:
                chatroomTag.tag_id = aVar2.i(intValue);
                return 0;
            case 7:
                chatroomTag.bold = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomTag setBackground_color(com.tencent.mm.plugin.game.autogen.chatroom.Color color) {
        this.background_color = color;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomTag setBold(boolean z17) {
        this.bold = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomTag setColor(com.tencent.mm.plugin.game.autogen.chatroom.Color color) {
        this.color = color;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomTag setDesc(java.lang.String str) {
        this.desc = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomTag setIcon(java.lang.String str) {
        this.icon = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomTag setTag_id(long j17) {
        this.tag_id = j17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomTag setTag_jump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.tag_jump_info = jumpInfo;
        return this;
    }
}
