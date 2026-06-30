package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class Notification extends com.tencent.mm.protobuf.f {
    public com.tencent.mm.plugin.game.autogen.chatroom.Color background_color;
    public boolean click_after_close;
    public int disappear_second;

    /* renamed from: id, reason: collision with root package name */
    public int f138699id;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jump_info;
    public java.lang.String left_icon_url;
    public int priority;
    public boolean right_icon_can_close;
    public java.lang.String right_icon_url;
    public int type;
    public com.tencent.mm.plugin.game.autogen.chatroom.Color word_color;
    public java.lang.String wording;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.Notification create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.Notification();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.Notification)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.Notification notification = (com.tencent.mm.plugin.game.autogen.chatroom.Notification) fVar;
        return n51.f.a(this.word_color, notification.word_color) && n51.f.a(this.background_color, notification.background_color) && n51.f.a(this.wording, notification.wording) && n51.f.a(this.jump_info, notification.jump_info) && n51.f.a(java.lang.Integer.valueOf(this.type), java.lang.Integer.valueOf(notification.type)) && n51.f.a(this.left_icon_url, notification.left_icon_url) && n51.f.a(this.right_icon_url, notification.right_icon_url) && n51.f.a(java.lang.Boolean.valueOf(this.right_icon_can_close), java.lang.Boolean.valueOf(notification.right_icon_can_close)) && n51.f.a(java.lang.Integer.valueOf(this.disappear_second), java.lang.Integer.valueOf(notification.disappear_second)) && n51.f.a(java.lang.Integer.valueOf(this.priority), java.lang.Integer.valueOf(notification.priority)) && n51.f.a(java.lang.Integer.valueOf(this.f138699id), java.lang.Integer.valueOf(notification.f138699id)) && n51.f.a(java.lang.Boolean.valueOf(this.click_after_close), java.lang.Boolean.valueOf(notification.click_after_close));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.plugin.game.autogen.chatroom.Color color = this.word_color;
            if (color != null) {
                fVar.i(1, color.computeSize());
                this.word_color.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.Color color2 = this.background_color;
            if (color2 != null) {
                fVar.i(2, color2.computeSize());
                this.background_color.writeFields(fVar);
            }
            java.lang.String str = this.wording;
            if (str != null) {
                fVar.j(3, str);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.jump_info;
            if (jumpInfo != null) {
                fVar.i(4, jumpInfo.computeSize());
                this.jump_info.writeFields(fVar);
            }
            fVar.e(5, this.type);
            java.lang.String str2 = this.left_icon_url;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.right_icon_url;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.a(8, this.right_icon_can_close);
            fVar.e(9, this.disappear_second);
            fVar.e(10, this.priority);
            fVar.e(11, this.f138699id);
            fVar.a(12, this.click_after_close);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.game.autogen.chatroom.Color color3 = this.word_color;
            int i18 = color3 != null ? 0 + b36.f.i(1, color3.computeSize()) : 0;
            com.tencent.mm.plugin.game.autogen.chatroom.Color color4 = this.background_color;
            if (color4 != null) {
                i18 += b36.f.i(2, color4.computeSize());
            }
            java.lang.String str4 = this.wording;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = this.jump_info;
            if (jumpInfo2 != null) {
                i18 += b36.f.i(4, jumpInfo2.computeSize());
            }
            int e17 = i18 + b36.f.e(5, this.type);
            java.lang.String str5 = this.left_icon_url;
            if (str5 != null) {
                e17 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.right_icon_url;
            if (str6 != null) {
                e17 += b36.f.j(7, str6);
            }
            return e17 + b36.f.a(8, this.right_icon_can_close) + b36.f.e(9, this.disappear_second) + b36.f.e(10, this.priority) + b36.f.e(11, this.f138699id) + b36.f.a(12, this.click_after_close);
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
        com.tencent.mm.plugin.game.autogen.chatroom.Notification notification = (com.tencent.mm.plugin.game.autogen.chatroom.Notification) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.mm.plugin.game.autogen.chatroom.Color color5 = new com.tencent.mm.plugin.game.autogen.chatroom.Color();
                    if (bArr != null && bArr.length > 0) {
                        color5.parseFrom(bArr);
                    }
                    notification.word_color = color5;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.mm.plugin.game.autogen.chatroom.Color color6 = new com.tencent.mm.plugin.game.autogen.chatroom.Color();
                    if (bArr2 != null && bArr2.length > 0) {
                        color6.parseFrom(bArr2);
                    }
                    notification.background_color = color6;
                }
                return 0;
            case 3:
                notification.wording = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
                    if (bArr3 != null && bArr3.length > 0) {
                        jumpInfo3.parseFrom(bArr3);
                    }
                    notification.jump_info = jumpInfo3;
                }
                return 0;
            case 5:
                notification.type = aVar2.g(intValue);
                return 0;
            case 6:
                notification.left_icon_url = aVar2.k(intValue);
                return 0;
            case 7:
                notification.right_icon_url = aVar2.k(intValue);
                return 0;
            case 8:
                notification.right_icon_can_close = aVar2.c(intValue);
                return 0;
            case 9:
                notification.disappear_second = aVar2.g(intValue);
                return 0;
            case 10:
                notification.priority = aVar2.g(intValue);
                return 0;
            case 11:
                notification.f138699id = aVar2.g(intValue);
                return 0;
            case 12:
                notification.click_after_close = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Notification setBackground_color(com.tencent.mm.plugin.game.autogen.chatroom.Color color) {
        this.background_color = color;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Notification setClick_after_close(boolean z17) {
        this.click_after_close = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Notification setDisappear_second(int i17) {
        this.disappear_second = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Notification setId(int i17) {
        this.f138699id = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Notification setJump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.jump_info = jumpInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Notification setLeft_icon_url(java.lang.String str) {
        this.left_icon_url = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Notification setPriority(int i17) {
        this.priority = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Notification setRight_icon_can_close(boolean z17) {
        this.right_icon_can_close = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Notification setRight_icon_url(java.lang.String str) {
        this.right_icon_url = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Notification setType(int i17) {
        this.type = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Notification setWord_color(com.tencent.mm.plugin.game.autogen.chatroom.Color color) {
        this.word_color = color;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Notification setWording(java.lang.String str) {
        this.wording = str;
        return this;
    }
}
