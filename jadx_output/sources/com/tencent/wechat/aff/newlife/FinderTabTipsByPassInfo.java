package com.tencent.wechat.aff.newlife;

/* loaded from: classes2.dex */
public class FinderTabTipsByPassInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo();
    public com.tencent.mm.protobuf.g by_pass_custom_info;
    public com.tencent.mm.protobuf.g inner_exp_info;
    public int tab_tips_object_id_type = 0;
    public long topic_id = 0;
    public int position = 0;
    public java.lang.String wording = "";

    public FinderTabTipsByPassInfo() {
        com.tencent.mm.protobuf.g gVar = com.tencent.mm.protobuf.g.f192155b;
        this.by_pass_custom_info = gVar;
        this.inner_exp_info = gVar;
    }

    public static com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo create() {
        return new com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo();
    }

    public static com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo();
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo finderTabTipsByPassInfo = (com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.tab_tips_object_id_type), java.lang.Integer.valueOf(finderTabTipsByPassInfo.tab_tips_object_id_type)) && n51.f.a(java.lang.Long.valueOf(this.topic_id), java.lang.Long.valueOf(finderTabTipsByPassInfo.topic_id)) && n51.f.a(java.lang.Integer.valueOf(this.position), java.lang.Integer.valueOf(finderTabTipsByPassInfo.position)) && n51.f.a(this.wording, finderTabTipsByPassInfo.wording) && n51.f.a(this.by_pass_custom_info, finderTabTipsByPassInfo.by_pass_custom_info) && n51.f.a(this.inner_exp_info, finderTabTipsByPassInfo.inner_exp_info);
    }

    public com.tencent.mm.protobuf.g getByPassCustomInfo() {
        return this.by_pass_custom_info;
    }

    public com.tencent.mm.protobuf.g getBy_pass_custom_info() {
        return this.by_pass_custom_info;
    }

    public com.tencent.mm.protobuf.g getInnerExpInfo() {
        return this.inner_exp_info;
    }

    public com.tencent.mm.protobuf.g getInner_exp_info() {
        return this.inner_exp_info;
    }

    public int getPosition() {
        return this.position;
    }

    public int getTabTipsObjectIdType() {
        return this.tab_tips_object_id_type;
    }

    public int getTab_tips_object_id_type() {
        return this.tab_tips_object_id_type;
    }

    public long getTopicId() {
        return this.topic_id;
    }

    public long getTopic_id() {
        return this.topic_id;
    }

    public java.lang.String getWording() {
        return this.wording;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.tab_tips_object_id_type);
            fVar.h(2, this.topic_id);
            fVar.e(3, this.position);
            java.lang.String str = this.wording;
            if (str != null) {
                fVar.j(4, str);
            }
            com.tencent.mm.protobuf.g gVar = this.by_pass_custom_info;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.inner_exp_info;
            if (gVar2 != null) {
                fVar.b(6, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.tab_tips_object_id_type) + 0 + b36.f.h(2, this.topic_id) + b36.f.e(3, this.position);
            java.lang.String str2 = this.wording;
            if (str2 != null) {
                e17 += b36.f.j(4, str2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.by_pass_custom_info;
            if (gVar3 != null) {
                e17 += b36.f.b(5, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.inner_exp_info;
            return gVar4 != null ? e17 + b36.f.b(6, gVar4) : e17;
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
                this.tab_tips_object_id_type = aVar2.g(intValue);
                return 0;
            case 2:
                this.topic_id = aVar2.i(intValue);
                return 0;
            case 3:
                this.position = aVar2.g(intValue);
                return 0;
            case 4:
                this.wording = aVar2.k(intValue);
                return 0;
            case 5:
                this.by_pass_custom_info = aVar2.d(intValue);
                return 0;
            case 6:
                this.inner_exp_info = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo setByPassCustomInfo(com.tencent.mm.protobuf.g gVar) {
        this.by_pass_custom_info = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo setBy_pass_custom_info(com.tencent.mm.protobuf.g gVar) {
        this.by_pass_custom_info = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo setInnerExpInfo(com.tencent.mm.protobuf.g gVar) {
        this.inner_exp_info = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo setInner_exp_info(com.tencent.mm.protobuf.g gVar) {
        this.inner_exp_info = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo setPosition(int i17) {
        this.position = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo setTabTipsObjectIdType(int i17) {
        this.tab_tips_object_id_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo setTab_tips_object_id_type(int i17) {
        this.tab_tips_object_id_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo setTopicId(long j17) {
        this.topic_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo setTopic_id(long j17) {
        this.topic_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo setWording(java.lang.String str) {
        this.wording = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderTabTipsByPassInfo) super.parseFrom(bArr);
    }
}
