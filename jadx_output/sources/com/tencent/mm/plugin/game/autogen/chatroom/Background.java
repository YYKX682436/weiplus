package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class Background extends com.tencent.mm.protobuf.f {
    public com.tencent.mm.plugin.game.autogen.chatroom.BgImgInfo img_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.BgPagInfo pag_info;
    public int type;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.Background create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.Background();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.Background)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.Background background = (com.tencent.mm.plugin.game.autogen.chatroom.Background) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.type), java.lang.Integer.valueOf(background.type)) && n51.f.a(this.pag_info, background.pag_info) && n51.f.a(this.img_info, background.img_info);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.type);
            com.tencent.mm.plugin.game.autogen.chatroom.BgPagInfo bgPagInfo = this.pag_info;
            if (bgPagInfo != null) {
                fVar.i(2, bgPagInfo.computeSize());
                this.pag_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.BgImgInfo bgImgInfo = this.img_info;
            if (bgImgInfo != null) {
                fVar.i(3, bgImgInfo.computeSize());
                this.img_info.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.type) + 0;
            com.tencent.mm.plugin.game.autogen.chatroom.BgPagInfo bgPagInfo2 = this.pag_info;
            if (bgPagInfo2 != null) {
                e17 += b36.f.i(2, bgPagInfo2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.BgImgInfo bgImgInfo2 = this.img_info;
            return bgImgInfo2 != null ? e17 + b36.f.i(3, bgImgInfo2.computeSize()) : e17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.Background background = (com.tencent.mm.plugin.game.autogen.chatroom.Background) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            background.type = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.mm.plugin.game.autogen.chatroom.BgPagInfo bgPagInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.BgPagInfo();
                if (bArr != null && bArr.length > 0) {
                    bgPagInfo3.parseFrom(bArr);
                }
                background.pag_info = bgPagInfo3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.tencent.mm.plugin.game.autogen.chatroom.BgImgInfo bgImgInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.BgImgInfo();
            if (bArr2 != null && bArr2.length > 0) {
                bgImgInfo3.parseFrom(bArr2);
            }
            background.img_info = bgImgInfo3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Background setImg_info(com.tencent.mm.plugin.game.autogen.chatroom.BgImgInfo bgImgInfo) {
        this.img_info = bgImgInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Background setPag_info(com.tencent.mm.plugin.game.autogen.chatroom.BgPagInfo bgPagInfo) {
        this.pag_info = bgPagInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Background setType(int i17) {
        this.type = i17;
        return this;
    }
}
