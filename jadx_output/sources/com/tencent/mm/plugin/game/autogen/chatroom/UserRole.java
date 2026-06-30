package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class UserRole extends com.tencent.mm.protobuf.f {
    public java.lang.String background_color;
    public com.tencent.mm.plugin.game.autogen.chatroom.Color bg_color;
    public com.tencent.mm.plugin.game.autogen.chatroom.Color color;
    public java.lang.String desc;
    public int role;
    public com.tencent.mm.plugin.game.autogen.chatroom.RoleIcon role_icon;
    public java.lang.String word_color;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.UserRole create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.UserRole();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.UserRole)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.UserRole userRole = (com.tencent.mm.plugin.game.autogen.chatroom.UserRole) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.role), java.lang.Integer.valueOf(userRole.role)) && n51.f.a(this.background_color, userRole.background_color) && n51.f.a(this.word_color, userRole.word_color) && n51.f.a(this.desc, userRole.desc) && n51.f.a(this.color, userRole.color) && n51.f.a(this.bg_color, userRole.bg_color) && n51.f.a(this.role_icon, userRole.role_icon);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.role);
            java.lang.String str = this.background_color;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.word_color;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.desc;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.Color color = this.color;
            if (color != null) {
                fVar.i(5, color.computeSize());
                this.color.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.Color color2 = this.bg_color;
            if (color2 != null) {
                fVar.i(6, color2.computeSize());
                this.bg_color.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.RoleIcon roleIcon = this.role_icon;
            if (roleIcon != null) {
                fVar.i(7, roleIcon.computeSize());
                this.role_icon.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.role) + 0;
            java.lang.String str4 = this.background_color;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.word_color;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.desc;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.Color color3 = this.color;
            if (color3 != null) {
                e17 += b36.f.i(5, color3.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.Color color4 = this.bg_color;
            if (color4 != null) {
                e17 += b36.f.i(6, color4.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.RoleIcon roleIcon2 = this.role_icon;
            return roleIcon2 != null ? e17 + b36.f.i(7, roleIcon2.computeSize()) : e17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.UserRole userRole = (com.tencent.mm.plugin.game.autogen.chatroom.UserRole) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                userRole.role = aVar2.g(intValue);
                return 0;
            case 2:
                userRole.background_color = aVar2.k(intValue);
                return 0;
            case 3:
                userRole.word_color = aVar2.k(intValue);
                return 0;
            case 4:
                userRole.desc = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.mm.plugin.game.autogen.chatroom.Color color5 = new com.tencent.mm.plugin.game.autogen.chatroom.Color();
                    if (bArr != null && bArr.length > 0) {
                        color5.parseFrom(bArr);
                    }
                    userRole.color = color5;
                }
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.tencent.mm.plugin.game.autogen.chatroom.Color color6 = new com.tencent.mm.plugin.game.autogen.chatroom.Color();
                    if (bArr2 != null && bArr2.length > 0) {
                        color6.parseFrom(bArr2);
                    }
                    userRole.bg_color = color6;
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.tencent.mm.plugin.game.autogen.chatroom.RoleIcon roleIcon3 = new com.tencent.mm.plugin.game.autogen.chatroom.RoleIcon();
                    if (bArr3 != null && bArr3.length > 0) {
                        roleIcon3.parseFrom(bArr3);
                    }
                    userRole.role_icon = roleIcon3;
                }
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.UserRole setBackground_color(java.lang.String str) {
        this.background_color = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.UserRole setBg_color(com.tencent.mm.plugin.game.autogen.chatroom.Color color) {
        this.bg_color = color;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.UserRole setColor(com.tencent.mm.plugin.game.autogen.chatroom.Color color) {
        this.color = color;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.UserRole setDesc(java.lang.String str) {
        this.desc = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.UserRole setRole(int i17) {
        this.role = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.UserRole setRole_icon(com.tencent.mm.plugin.game.autogen.chatroom.RoleIcon roleIcon) {
        this.role_icon = roleIcon;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.UserRole setWord_color(java.lang.String str) {
        this.word_color = str;
        return this;
    }
}
