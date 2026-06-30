package com.tencent.wechat.aff.newlife;

/* loaded from: classes2.dex */
public class FinderObjectAsyncLoadInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo();
    public long object_id = 0;
    public java.util.LinkedList<com.tencent.mm.protobuf.g> feed_jump_info = new java.util.LinkedList<>();

    public static com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo create() {
        return new com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo();
    }

    public static com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo();
    }

    public com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo addAllElementFeedJumpInfo(java.util.Collection<com.tencent.mm.protobuf.g> collection) {
        this.feed_jump_info.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo addAllElementFeed_jump_info(java.util.Collection<com.tencent.mm.protobuf.g> collection) {
        this.feed_jump_info.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo addElementFeedJumpInfo(com.tencent.mm.protobuf.g gVar) {
        this.feed_jump_info.add(gVar);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo addElementFeed_jump_info(com.tencent.mm.protobuf.g gVar) {
        this.feed_jump_info.add(gVar);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo finderObjectAsyncLoadInfo = (com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.object_id), java.lang.Long.valueOf(finderObjectAsyncLoadInfo.object_id)) && n51.f.a(this.feed_jump_info, finderObjectAsyncLoadInfo.feed_jump_info);
    }

    public java.util.LinkedList<com.tencent.mm.protobuf.g> getFeedJumpInfo() {
        return this.feed_jump_info;
    }

    public java.util.LinkedList<com.tencent.mm.protobuf.g> getFeed_jump_info() {
        return this.feed_jump_info;
    }

    public long getObjectId() {
        return this.object_id;
    }

    public long getObject_id() {
        return this.object_id;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.object_id);
            fVar.g(12, 6, this.feed_jump_info);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.object_id) + 0 + b36.f.g(12, 6, this.feed_jump_info);
        }
        if (i17 == 2) {
            this.feed_jump_info.clear();
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
            this.object_id = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 12) {
            return -1;
        }
        this.feed_jump_info.add(aVar2.d(intValue));
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo setFeedJumpInfo(java.util.LinkedList<com.tencent.mm.protobuf.g> linkedList) {
        this.feed_jump_info = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo setFeed_jump_info(java.util.LinkedList<com.tencent.mm.protobuf.g> linkedList) {
        this.feed_jump_info = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo setObjectId(long j17) {
        this.object_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo setObject_id(long j17) {
        this.object_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo) super.parseFrom(bArr);
    }
}
