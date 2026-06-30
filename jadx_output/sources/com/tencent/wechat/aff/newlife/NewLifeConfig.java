package com.tencent.wechat.aff.newlife;

/* loaded from: classes2.dex */
public class NewLifeConfig extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.NewLifeConfig DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.NewLifeConfig();
    public int hobby_select_flag = 0;
    public int identity_select_flag = 0;
    public long finderattr_flag = 0;
    public int sns_timeline_guide = 0;
    public int sns_detail_guide = 0;
    public int sns_action_sheet_guide = 0;

    public static com.tencent.wechat.aff.newlife.NewLifeConfig create() {
        return new com.tencent.wechat.aff.newlife.NewLifeConfig();
    }

    public static com.tencent.wechat.aff.newlife.NewLifeConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.NewLifeConfig newBuilder() {
        return new com.tencent.wechat.aff.newlife.NewLifeConfig();
    }

    public com.tencent.wechat.aff.newlife.NewLifeConfig build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.NewLifeConfig)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.NewLifeConfig newLifeConfig = (com.tencent.wechat.aff.newlife.NewLifeConfig) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.hobby_select_flag), java.lang.Integer.valueOf(newLifeConfig.hobby_select_flag)) && n51.f.a(java.lang.Integer.valueOf(this.identity_select_flag), java.lang.Integer.valueOf(newLifeConfig.identity_select_flag)) && n51.f.a(java.lang.Long.valueOf(this.finderattr_flag), java.lang.Long.valueOf(newLifeConfig.finderattr_flag)) && n51.f.a(java.lang.Integer.valueOf(this.sns_timeline_guide), java.lang.Integer.valueOf(newLifeConfig.sns_timeline_guide)) && n51.f.a(java.lang.Integer.valueOf(this.sns_detail_guide), java.lang.Integer.valueOf(newLifeConfig.sns_detail_guide)) && n51.f.a(java.lang.Integer.valueOf(this.sns_action_sheet_guide), java.lang.Integer.valueOf(newLifeConfig.sns_action_sheet_guide));
    }

    public long getFinderattrFlag() {
        return this.finderattr_flag;
    }

    public long getFinderattr_flag() {
        return this.finderattr_flag;
    }

    public int getHobbySelectFlag() {
        return this.hobby_select_flag;
    }

    public int getHobby_select_flag() {
        return this.hobby_select_flag;
    }

    public int getIdentitySelectFlag() {
        return this.identity_select_flag;
    }

    public int getIdentity_select_flag() {
        return this.identity_select_flag;
    }

    public int getSnsActionSheetGuide() {
        return this.sns_action_sheet_guide;
    }

    public int getSnsDetailGuide() {
        return this.sns_detail_guide;
    }

    public int getSnsTimelineGuide() {
        return this.sns_timeline_guide;
    }

    public int getSns_action_sheet_guide() {
        return this.sns_action_sheet_guide;
    }

    public int getSns_detail_guide() {
        return this.sns_detail_guide;
    }

    public int getSns_timeline_guide() {
        return this.sns_timeline_guide;
    }

    public com.tencent.wechat.aff.newlife.NewLifeConfig mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.NewLifeConfig();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.hobby_select_flag);
            fVar.e(2, this.identity_select_flag);
            fVar.h(3, this.finderattr_flag);
            fVar.e(4, this.sns_timeline_guide);
            fVar.e(5, this.sns_detail_guide);
            fVar.e(6, this.sns_action_sheet_guide);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.hobby_select_flag) + 0 + b36.f.e(2, this.identity_select_flag) + b36.f.h(3, this.finderattr_flag) + b36.f.e(4, this.sns_timeline_guide) + b36.f.e(5, this.sns_detail_guide) + b36.f.e(6, this.sns_action_sheet_guide);
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
        switch (intValue) {
            case 1:
                this.hobby_select_flag = aVar2.g(intValue);
                return 0;
            case 2:
                this.identity_select_flag = aVar2.g(intValue);
                return 0;
            case 3:
                this.finderattr_flag = aVar2.i(intValue);
                return 0;
            case 4:
                this.sns_timeline_guide = aVar2.g(intValue);
                return 0;
            case 5:
                this.sns_detail_guide = aVar2.g(intValue);
                return 0;
            case 6:
                this.sns_action_sheet_guide = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.newlife.NewLifeConfig setFinderattrFlag(long j17) {
        this.finderattr_flag = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeConfig setFinderattr_flag(long j17) {
        this.finderattr_flag = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeConfig setHobbySelectFlag(int i17) {
        this.hobby_select_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeConfig setHobby_select_flag(int i17) {
        this.hobby_select_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeConfig setIdentitySelectFlag(int i17) {
        this.identity_select_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeConfig setIdentity_select_flag(int i17) {
        this.identity_select_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeConfig setSnsActionSheetGuide(int i17) {
        this.sns_action_sheet_guide = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeConfig setSnsDetailGuide(int i17) {
        this.sns_detail_guide = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeConfig setSnsTimelineGuide(int i17) {
        this.sns_timeline_guide = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeConfig setSns_action_sheet_guide(int i17) {
        this.sns_action_sheet_guide = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeConfig setSns_detail_guide(int i17) {
        this.sns_detail_guide = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeConfig setSns_timeline_guide(int i17) {
        this.sns_timeline_guide = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeConfig mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.NewLifeConfig parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.NewLifeConfig) super.parseFrom(bArr);
    }
}
