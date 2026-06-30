package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class OnlineUser extends com.tencent.mm.protobuf.f {
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData> chat_user_data = new java.util.LinkedList<>();
    public com.tencent.mm.plugin.game.autogen.chatroom.Color icon_color;
    public java.lang.String left_icon;
    public boolean need_fold;
    public long status;
    public java.lang.String status_desc;
    public java.lang.String status_icon;
    public com.tencent.mm.plugin.game.autogen.chatroom.TextInfo text_desc;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser onlineUser = (com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser) fVar;
        return n51.f.a(this.chat_user_data, onlineUser.chat_user_data) && n51.f.a(java.lang.Long.valueOf(this.status), java.lang.Long.valueOf(onlineUser.status)) && n51.f.a(this.status_icon, onlineUser.status_icon) && n51.f.a(this.icon_color, onlineUser.icon_color) && n51.f.a(this.status_desc, onlineUser.status_desc) && n51.f.a(this.text_desc, onlineUser.text_desc) && n51.f.a(java.lang.Boolean.valueOf(this.need_fold), java.lang.Boolean.valueOf(onlineUser.need_fold)) && n51.f.a(this.left_icon, onlineUser.left_icon);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.chat_user_data);
            fVar.h(2, this.status);
            java.lang.String str = this.status_icon;
            if (str != null) {
                fVar.j(3, str);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.Color color = this.icon_color;
            if (color != null) {
                fVar.i(4, color.computeSize());
                this.icon_color.writeFields(fVar);
            }
            java.lang.String str2 = this.status_desc;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.TextInfo textInfo = this.text_desc;
            if (textInfo != null) {
                fVar.i(6, textInfo.computeSize());
                this.text_desc.writeFields(fVar);
            }
            fVar.a(7, this.need_fold);
            java.lang.String str3 = this.left_icon;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.chat_user_data) + 0 + b36.f.h(2, this.status);
            java.lang.String str4 = this.status_icon;
            if (str4 != null) {
                g17 += b36.f.j(3, str4);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.Color color2 = this.icon_color;
            if (color2 != null) {
                g17 += b36.f.i(4, color2.computeSize());
            }
            java.lang.String str5 = this.status_desc;
            if (str5 != null) {
                g17 += b36.f.j(5, str5);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.TextInfo textInfo2 = this.text_desc;
            if (textInfo2 != null) {
                g17 += b36.f.i(6, textInfo2.computeSize());
            }
            int a17 = g17 + b36.f.a(7, this.need_fold);
            java.lang.String str6 = this.left_icon;
            return str6 != null ? a17 + b36.f.j(8, str6) : a17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.chat_user_data.clear();
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
        com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser onlineUser = (com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData chatroomUserData = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData();
                    if (bArr2 != null && bArr2.length > 0) {
                        chatroomUserData.parseFrom(bArr2);
                    }
                    onlineUser.chat_user_data.add(chatroomUserData);
                }
                return 0;
            case 2:
                onlineUser.status = aVar2.i(intValue);
                return 0;
            case 3:
                onlineUser.status_icon = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    com.tencent.mm.plugin.game.autogen.chatroom.Color color3 = new com.tencent.mm.plugin.game.autogen.chatroom.Color();
                    if (bArr3 != null && bArr3.length > 0) {
                        color3.parseFrom(bArr3);
                    }
                    onlineUser.icon_color = color3;
                }
                return 0;
            case 5:
                onlineUser.status_desc = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    com.tencent.mm.plugin.game.autogen.chatroom.TextInfo textInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.TextInfo();
                    if (bArr4 != null && bArr4.length > 0) {
                        textInfo3.parseFrom(bArr4);
                    }
                    onlineUser.text_desc = textInfo3;
                }
                return 0;
            case 7:
                onlineUser.need_fold = aVar2.c(intValue);
                return 0;
            case 8:
                onlineUser.left_icon = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser setChat_user_data(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomUserData> linkedList) {
        this.chat_user_data = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser setIcon_color(com.tencent.mm.plugin.game.autogen.chatroom.Color color) {
        this.icon_color = color;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser setLeft_icon(java.lang.String str) {
        this.left_icon = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser setNeed_fold(boolean z17) {
        this.need_fold = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser setStatus(long j17) {
        this.status = j17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser setStatus_desc(java.lang.String str) {
        this.status_desc = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser setStatus_icon(java.lang.String str) {
        this.status_icon = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.OnlineUser setText_desc(com.tencent.mm.plugin.game.autogen.chatroom.TextInfo textInfo) {
        this.text_desc = textInfo;
        return this;
    }
}
