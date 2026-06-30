package com.tencent.wechat.aff.newlife;

/* loaded from: classes2.dex */
public class FinderTipsShowTabExtInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderTipsShowTabExtInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderTipsShowTabExtInfo();
    public int jumpPriority = 0;
    public java.lang.String show_ext_info = "";

    public static com.tencent.wechat.aff.newlife.FinderTipsShowTabExtInfo create() {
        return new com.tencent.wechat.aff.newlife.FinderTipsShowTabExtInfo();
    }

    public static com.tencent.wechat.aff.newlife.FinderTipsShowTabExtInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderTipsShowTabExtInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderTipsShowTabExtInfo();
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowTabExtInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderTipsShowTabExtInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderTipsShowTabExtInfo finderTipsShowTabExtInfo = (com.tencent.wechat.aff.newlife.FinderTipsShowTabExtInfo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.jumpPriority), java.lang.Integer.valueOf(finderTipsShowTabExtInfo.jumpPriority)) && n51.f.a(this.show_ext_info, finderTipsShowTabExtInfo.show_ext_info);
    }

    public int getJumpPriority() {
        return this.jumpPriority;
    }

    public java.lang.String getShowExtInfo() {
        return this.show_ext_info;
    }

    public java.lang.String getShow_ext_info() {
        return this.show_ext_info;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowTabExtInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderTipsShowTabExtInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.jumpPriority);
            java.lang.String str = this.show_ext_info;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.jumpPriority) + 0;
            java.lang.String str2 = this.show_ext_info;
            return str2 != null ? e17 + b36.f.j(2, str2) : e17;
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.jumpPriority = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.show_ext_info = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowTabExtInfo setJumpPriority(int i17) {
        this.jumpPriority = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowTabExtInfo setShowExtInfo(java.lang.String str) {
        this.show_ext_info = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowTabExtInfo setShow_ext_info(java.lang.String str) {
        this.show_ext_info = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowTabExtInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderTipsShowTabExtInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderTipsShowTabExtInfo) super.parseFrom(bArr);
    }
}
