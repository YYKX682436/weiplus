package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class FinderMemberSetting extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderMemberSetting DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderMemberSetting();
    public int member_level = 0;
    public int price = 0;

    public static com.tencent.wechat.aff.newlife.FinderMemberSetting create() {
        return new com.tencent.wechat.aff.newlife.FinderMemberSetting();
    }

    public static com.tencent.wechat.aff.newlife.FinderMemberSetting getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderMemberSetting newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderMemberSetting();
    }

    public com.tencent.wechat.aff.newlife.FinderMemberSetting build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderMemberSetting)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderMemberSetting finderMemberSetting = (com.tencent.wechat.aff.newlife.FinderMemberSetting) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.member_level), java.lang.Integer.valueOf(finderMemberSetting.member_level)) && n51.f.a(java.lang.Integer.valueOf(this.price), java.lang.Integer.valueOf(finderMemberSetting.price));
    }

    public int getMemberLevel() {
        return this.member_level;
    }

    public int getMember_level() {
        return this.member_level;
    }

    public int getPrice() {
        return this.price;
    }

    public com.tencent.wechat.aff.newlife.FinderMemberSetting mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderMemberSetting();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.member_level);
            fVar.e(2, this.price);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.member_level) + 0 + b36.f.e(2, this.price);
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
            this.member_level = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.price = aVar2.g(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderMemberSetting setMemberLevel(int i17) {
        this.member_level = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMemberSetting setMember_level(int i17) {
        this.member_level = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMemberSetting setPrice(int i17) {
        this.price = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMemberSetting mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderMemberSetting parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderMemberSetting) super.parseFrom(bArr);
    }
}
