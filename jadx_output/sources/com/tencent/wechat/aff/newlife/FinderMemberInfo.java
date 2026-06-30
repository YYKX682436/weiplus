package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class FinderMemberInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderMemberInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderMemberInfo();
    public boolean can_join_member = false;
    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderMemberSetting> member_setting = new java.util.LinkedList<>();

    public static com.tencent.wechat.aff.newlife.FinderMemberInfo create() {
        return new com.tencent.wechat.aff.newlife.FinderMemberInfo();
    }

    public static com.tencent.wechat.aff.newlife.FinderMemberInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderMemberInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderMemberInfo();
    }

    public com.tencent.wechat.aff.newlife.FinderMemberInfo addAllElementMemberSetting(java.util.Collection<com.tencent.wechat.aff.newlife.FinderMemberSetting> collection) {
        this.member_setting.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMemberInfo addAllElementMember_setting(java.util.Collection<com.tencent.wechat.aff.newlife.FinderMemberSetting> collection) {
        this.member_setting.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMemberInfo addElementMemberSetting(com.tencent.wechat.aff.newlife.FinderMemberSetting finderMemberSetting) {
        this.member_setting.add(finderMemberSetting);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMemberInfo addElementMember_setting(com.tencent.wechat.aff.newlife.FinderMemberSetting finderMemberSetting) {
        this.member_setting.add(finderMemberSetting);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMemberInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderMemberInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderMemberInfo finderMemberInfo = (com.tencent.wechat.aff.newlife.FinderMemberInfo) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.can_join_member), java.lang.Boolean.valueOf(finderMemberInfo.can_join_member)) && n51.f.a(this.member_setting, finderMemberInfo.member_setting);
    }

    public boolean getCanJoinMember() {
        return this.can_join_member;
    }

    public boolean getCan_join_member() {
        return this.can_join_member;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderMemberSetting> getMemberSetting() {
        return this.member_setting;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderMemberSetting> getMember_setting() {
        return this.member_setting;
    }

    public com.tencent.wechat.aff.newlife.FinderMemberInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderMemberInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.can_join_member);
            fVar.g(2, 8, this.member_setting);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.can_join_member) + 0 + b36.f.g(2, 8, this.member_setting);
        }
        if (i17 == 2) {
            this.member_setting.clear();
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
            this.can_join_member = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.aff.newlife.FinderMemberSetting finderMemberSetting = new com.tencent.wechat.aff.newlife.FinderMemberSetting();
            if (bArr != null && bArr.length > 0) {
                finderMemberSetting.parseFrom(bArr);
            }
            this.member_setting.add(finderMemberSetting);
        }
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderMemberInfo setCanJoinMember(boolean z17) {
        this.can_join_member = z17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMemberInfo setCan_join_member(boolean z17) {
        this.can_join_member = z17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMemberInfo setMemberSetting(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderMemberSetting> linkedList) {
        this.member_setting = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMemberInfo setMember_setting(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderMemberSetting> linkedList) {
        this.member_setting = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMemberInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderMemberInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderMemberInfo) super.parseFrom(bArr);
    }
}
