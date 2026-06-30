package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class NewLifeFeedJumpInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo();
    public java.lang.String feed_id = "";
    public java.util.LinkedList<com.tencent.mm.protobuf.g> jump_infos = new java.util.LinkedList<>();

    public static com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo create() {
        return new com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo();
    }

    public static com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo();
    }

    public com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo addAllElementJumpInfos(java.util.Collection<com.tencent.mm.protobuf.g> collection) {
        this.jump_infos.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo addAllElementJump_infos(java.util.Collection<com.tencent.mm.protobuf.g> collection) {
        this.jump_infos.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo addElementJumpInfos(com.tencent.mm.protobuf.g gVar) {
        this.jump_infos.add(gVar);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo addElementJump_infos(com.tencent.mm.protobuf.g gVar) {
        this.jump_infos.add(gVar);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo newLifeFeedJumpInfo = (com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo) fVar;
        return n51.f.a(this.feed_id, newLifeFeedJumpInfo.feed_id) && n51.f.a(this.jump_infos, newLifeFeedJumpInfo.jump_infos);
    }

    public java.lang.String getFeedId() {
        return this.feed_id;
    }

    public java.lang.String getFeed_id() {
        return this.feed_id;
    }

    public java.util.LinkedList<com.tencent.mm.protobuf.g> getJumpInfos() {
        return this.jump_infos;
    }

    public java.util.LinkedList<com.tencent.mm.protobuf.g> getJump_infos() {
        return this.jump_infos;
    }

    public com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.feed_id;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 6, this.jump_infos);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.feed_id;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 6, this.jump_infos);
        }
        if (i17 == 2) {
            this.jump_infos.clear();
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
            this.feed_id = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.jump_infos.add(aVar2.d(intValue));
        return 0;
    }

    public com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo setFeedId(java.lang.String str) {
        this.feed_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo setFeed_id(java.lang.String str) {
        this.feed_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo setJumpInfos(java.util.LinkedList<com.tencent.mm.protobuf.g> linkedList) {
        this.jump_infos = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo setJump_infos(java.util.LinkedList<com.tencent.mm.protobuf.g> linkedList) {
        this.jump_infos = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo) super.parseFrom(bArr);
    }
}
