package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class RestrictRule extends com.tencent.mm.protobuf.f {
    public boolean can_pass;
    public com.tencent.mm.plugin.game.autogen.chatroom.Color color;
    public java.lang.String rule_desc;
    public com.tencent.mm.plugin.game.autogen.chatroom.ShowIcon show_icon;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.RestrictRule create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.RestrictRule();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.RestrictRule)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.RestrictRule restrictRule = (com.tencent.mm.plugin.game.autogen.chatroom.RestrictRule) fVar;
        return n51.f.a(this.rule_desc, restrictRule.rule_desc) && n51.f.a(java.lang.Boolean.valueOf(this.can_pass), java.lang.Boolean.valueOf(restrictRule.can_pass)) && n51.f.a(this.color, restrictRule.color) && n51.f.a(this.show_icon, restrictRule.show_icon);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.rule_desc;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.a(2, this.can_pass);
            com.tencent.mm.plugin.game.autogen.chatroom.Color color = this.color;
            if (color != null) {
                fVar.i(3, color.computeSize());
                this.color.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ShowIcon showIcon = this.show_icon;
            if (showIcon != null) {
                fVar.i(4, showIcon.computeSize());
                this.show_icon.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.rule_desc;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.a(2, this.can_pass);
            com.tencent.mm.plugin.game.autogen.chatroom.Color color2 = this.color;
            if (color2 != null) {
                j17 += b36.f.i(3, color2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ShowIcon showIcon2 = this.show_icon;
            return showIcon2 != null ? j17 + b36.f.i(4, showIcon2.computeSize()) : j17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.RestrictRule restrictRule = (com.tencent.mm.plugin.game.autogen.chatroom.RestrictRule) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            restrictRule.rule_desc = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            restrictRule.can_pass = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                com.tencent.mm.plugin.game.autogen.chatroom.Color color3 = new com.tencent.mm.plugin.game.autogen.chatroom.Color();
                if (bArr != null && bArr.length > 0) {
                    color3.parseFrom(bArr);
                }
                restrictRule.color = color3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j19.get(i19);
            com.tencent.mm.plugin.game.autogen.chatroom.ShowIcon showIcon3 = new com.tencent.mm.plugin.game.autogen.chatroom.ShowIcon();
            if (bArr2 != null && bArr2.length > 0) {
                showIcon3.parseFrom(bArr2);
            }
            restrictRule.show_icon = showIcon3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.RestrictRule setCan_pass(boolean z17) {
        this.can_pass = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.RestrictRule setColor(com.tencent.mm.plugin.game.autogen.chatroom.Color color) {
        this.color = color;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.RestrictRule setRule_desc(java.lang.String str) {
        this.rule_desc = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.RestrictRule setShow_icon(com.tencent.mm.plugin.game.autogen.chatroom.ShowIcon showIcon) {
        this.show_icon = showIcon;
        return this;
    }
}
