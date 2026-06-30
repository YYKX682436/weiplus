package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class BackgroundInfo extends com.tencent.mm.protobuf.f {
    public java.lang.String background_url;
    public com.tencent.mm.plugin.game.autogen.chatroom.Color color;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.BackgroundInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.BackgroundInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.BackgroundInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.BackgroundInfo backgroundInfo = (com.tencent.mm.plugin.game.autogen.chatroom.BackgroundInfo) fVar;
        return n51.f.a(this.background_url, backgroundInfo.background_url) && n51.f.a(this.color, backgroundInfo.color);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.background_url;
            if (str != null) {
                fVar.j(1, str);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.Color color = this.color;
            if (color != null) {
                fVar.i(2, color.computeSize());
                this.color.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.background_url;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            com.tencent.mm.plugin.game.autogen.chatroom.Color color2 = this.color;
            return color2 != null ? j17 + b36.f.i(2, color2.computeSize()) : j17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.BackgroundInfo backgroundInfo = (com.tencent.mm.plugin.game.autogen.chatroom.BackgroundInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            backgroundInfo.background_url = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
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
            backgroundInfo.color = color3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.BackgroundInfo setBackground_url(java.lang.String str) {
        this.background_url = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.BackgroundInfo setColor(com.tencent.mm.plugin.game.autogen.chatroom.Color color) {
        this.color = color;
        return this;
    }
}
