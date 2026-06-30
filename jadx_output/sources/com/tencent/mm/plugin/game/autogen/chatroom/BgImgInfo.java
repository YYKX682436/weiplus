package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class BgImgInfo extends com.tencent.mm.protobuf.f {
    public java.lang.String img_url;
    public boolean need_gaussian_blur;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.BgImgInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.BgImgInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.BgImgInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.BgImgInfo bgImgInfo = (com.tencent.mm.plugin.game.autogen.chatroom.BgImgInfo) fVar;
        return n51.f.a(this.img_url, bgImgInfo.img_url) && n51.f.a(java.lang.Boolean.valueOf(this.need_gaussian_blur), java.lang.Boolean.valueOf(bgImgInfo.need_gaussian_blur));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.img_url;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.a(2, this.need_gaussian_blur);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.img_url;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.a(2, this.need_gaussian_blur);
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
        com.tencent.mm.plugin.game.autogen.chatroom.BgImgInfo bgImgInfo = (com.tencent.mm.plugin.game.autogen.chatroom.BgImgInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bgImgInfo.img_url = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        bgImgInfo.need_gaussian_blur = aVar2.c(intValue);
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.BgImgInfo setImg_url(java.lang.String str) {
        this.img_url = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.BgImgInfo setNeed_gaussian_blur(boolean z17) {
        this.need_gaussian_blur = z17;
        return this;
    }
}
