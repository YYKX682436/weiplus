package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class Color extends com.tencent.mm.protobuf.f {
    public java.lang.String dark_color;
    public java.lang.String h5_dark_color;
    public java.lang.String h5_light_color;
    public java.lang.String light_color;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.Color create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.Color();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.Color)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.Color color = (com.tencent.mm.plugin.game.autogen.chatroom.Color) fVar;
        return n51.f.a(this.light_color, color.light_color) && n51.f.a(this.dark_color, color.dark_color) && n51.f.a(this.h5_light_color, color.h5_light_color) && n51.f.a(this.h5_dark_color, color.h5_dark_color);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.light_color;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.dark_color;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.h5_light_color;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.h5_dark_color;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.light_color;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.dark_color;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.h5_light_color;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.h5_dark_color;
            return str8 != null ? j17 + b36.f.j(4, str8) : j17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.Color color = (com.tencent.mm.plugin.game.autogen.chatroom.Color) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            color.light_color = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            color.dark_color = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            color.h5_light_color = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        color.h5_dark_color = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Color setDark_color(java.lang.String str) {
        this.dark_color = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Color setH5_dark_color(java.lang.String str) {
        this.h5_dark_color = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Color setH5_light_color(java.lang.String str) {
        this.h5_light_color = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Color setLight_color(java.lang.String str) {
        this.light_color = str;
        return this;
    }
}
