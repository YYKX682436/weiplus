package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class ChatroomMsgApp extends com.tencent.mm.protobuf.f {
    public java.lang.String bg_pic_url;
    public com.tencent.mm.plugin.game.autogen.chatroom.Color button_bg_color;
    public java.lang.String button_des;
    public java.lang.String des;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jump_info;
    public java.lang.String second_des;
    public java.lang.String title;
    public int type;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp chatroomMsgApp = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp) fVar;
        return n51.f.a(this.title, chatroomMsgApp.title) && n51.f.a(this.des, chatroomMsgApp.des) && n51.f.a(this.button_des, chatroomMsgApp.button_des) && n51.f.a(this.bg_pic_url, chatroomMsgApp.bg_pic_url) && n51.f.a(java.lang.Integer.valueOf(this.type), java.lang.Integer.valueOf(chatroomMsgApp.type)) && n51.f.a(this.second_des, chatroomMsgApp.second_des) && n51.f.a(this.button_bg_color, chatroomMsgApp.button_bg_color) && n51.f.a(this.jump_info, chatroomMsgApp.jump_info);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.title;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.des;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.button_des;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.bg_pic_url;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.type);
            java.lang.String str5 = this.second_des;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.Color color = this.button_bg_color;
            if (color != null) {
                fVar.i(8, color.computeSize());
                this.button_bg_color.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.jump_info;
            if (jumpInfo != null) {
                fVar.i(7, jumpInfo.computeSize());
                this.jump_info.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.title;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.des;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.button_des;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.bg_pic_url;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.type);
            java.lang.String str10 = this.second_des;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.Color color2 = this.button_bg_color;
            if (color2 != null) {
                e17 += b36.f.i(8, color2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = this.jump_info;
            return jumpInfo2 != null ? e17 + b36.f.i(7, jumpInfo2.computeSize()) : e17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp chatroomMsgApp = (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                chatroomMsgApp.title = aVar2.k(intValue);
                return 0;
            case 2:
                chatroomMsgApp.des = aVar2.k(intValue);
                return 0;
            case 3:
                chatroomMsgApp.button_des = aVar2.k(intValue);
                return 0;
            case 4:
                chatroomMsgApp.bg_pic_url = aVar2.k(intValue);
                return 0;
            case 5:
                chatroomMsgApp.type = aVar2.g(intValue);
                return 0;
            case 6:
                chatroomMsgApp.second_des = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
                    if (bArr != null && bArr.length > 0) {
                        jumpInfo3.parseFrom(bArr);
                    }
                    chatroomMsgApp.jump_info = jumpInfo3;
                }
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    com.tencent.mm.plugin.game.autogen.chatroom.Color color3 = new com.tencent.mm.plugin.game.autogen.chatroom.Color();
                    if (bArr2 != null && bArr2.length > 0) {
                        color3.parseFrom(bArr2);
                    }
                    chatroomMsgApp.button_bg_color = color3;
                }
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp setBg_pic_url(java.lang.String str) {
        this.bg_pic_url = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp setButton_bg_color(com.tencent.mm.plugin.game.autogen.chatroom.Color color) {
        this.button_bg_color = color;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp setButton_des(java.lang.String str) {
        this.button_des = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp setDes(java.lang.String str) {
        this.des = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp setJump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.jump_info = jumpInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp setSecond_des(java.lang.String str) {
        this.second_des = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp setTitle(java.lang.String str) {
        this.title = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgApp setType(int i17) {
        this.type = i17;
        return this;
    }
}
