package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class ShowIcon extends com.tencent.mm.protobuf.f {
    public java.lang.String dark_icon;
    public java.lang.String light_icon;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ShowIcon create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ShowIcon();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ShowIcon)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ShowIcon showIcon = (com.tencent.mm.plugin.game.autogen.chatroom.ShowIcon) fVar;
        return n51.f.a(this.light_icon, showIcon.light_icon) && n51.f.a(this.dark_icon, showIcon.dark_icon);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.light_icon;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.dark_icon;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.light_icon;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.dark_icon;
            return str4 != null ? j17 + b36.f.j(2, str4) : j17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.ShowIcon showIcon = (com.tencent.mm.plugin.game.autogen.chatroom.ShowIcon) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            showIcon.light_icon = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        showIcon.dark_icon = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ShowIcon setDark_icon(java.lang.String str) {
        this.dark_icon = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ShowIcon setLight_icon(java.lang.String str) {
        this.light_icon = str;
        return this;
    }
}
