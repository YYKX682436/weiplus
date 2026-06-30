package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class TagInfo extends com.tencent.mm.protobuf.f {
    public java.lang.String appid;
    public com.tencent.mm.plugin.game.autogen.chatroom.Color color;
    public java.lang.String desc;
    public int score;
    public int type;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.TagInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.TagInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.TagInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.TagInfo tagInfo = (com.tencent.mm.plugin.game.autogen.chatroom.TagInfo) fVar;
        return n51.f.a(this.desc, tagInfo.desc) && n51.f.a(java.lang.Integer.valueOf(this.type), java.lang.Integer.valueOf(tagInfo.type)) && n51.f.a(java.lang.Integer.valueOf(this.score), java.lang.Integer.valueOf(tagInfo.score)) && n51.f.a(this.appid, tagInfo.appid) && n51.f.a(this.color, tagInfo.color);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.desc;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.type);
            fVar.e(3, this.score);
            java.lang.String str2 = this.appid;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.Color color = this.color;
            if (color != null) {
                fVar.i(5, color.computeSize());
                this.color.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.desc;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.type) + b36.f.e(3, this.score);
            java.lang.String str4 = this.appid;
            if (str4 != null) {
                j17 += b36.f.j(4, str4);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.Color color2 = this.color;
            return color2 != null ? j17 + b36.f.i(5, color2.computeSize()) : j17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.TagInfo tagInfo = (com.tencent.mm.plugin.game.autogen.chatroom.TagInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tagInfo.desc = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            tagInfo.type = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            tagInfo.score = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            tagInfo.appid = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            com.tencent.mm.plugin.game.autogen.chatroom.Color color3 = new com.tencent.mm.plugin.game.autogen.chatroom.Color();
            if (bArr != null && bArr.length > 0) {
                color3.parseFrom(bArr);
            }
            tagInfo.color = color3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.TagInfo setAppid(java.lang.String str) {
        this.appid = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.TagInfo setColor(com.tencent.mm.plugin.game.autogen.chatroom.Color color) {
        this.color = color;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.TagInfo setDesc(java.lang.String str) {
        this.desc = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.TagInfo setScore(int i17) {
        this.score = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.TagInfo setType(int i17) {
        this.type = i17;
        return this;
    }
}
