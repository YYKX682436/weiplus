package com.tencent.wechat.aff.finder;

/* loaded from: classes2.dex */
public class FinderObjectWrap extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.finder.FinderObjectWrap DEFAULT_INSTANCE = new com.tencent.wechat.aff.finder.FinderObjectWrap();
    public com.tencent.mm.protobuf.g finder_object = com.tencent.mm.protobuf.g.f192155b;
    public java.lang.String tid = "";
    public bw5.os0 commentScene = bw5.os0.MMFinder_GetComment_Scene_NotKnown;
    public long feed_source = 0;
    public int func_flag = 0;
    public long expired_time = 0;

    public static com.tencent.wechat.aff.finder.FinderObjectWrap create() {
        return new com.tencent.wechat.aff.finder.FinderObjectWrap();
    }

    public static com.tencent.wechat.aff.finder.FinderObjectWrap getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.finder.FinderObjectWrap newBuilder() {
        return new com.tencent.wechat.aff.finder.FinderObjectWrap();
    }

    public com.tencent.wechat.aff.finder.FinderObjectWrap build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.finder.FinderObjectWrap)) {
            return false;
        }
        com.tencent.wechat.aff.finder.FinderObjectWrap finderObjectWrap = (com.tencent.wechat.aff.finder.FinderObjectWrap) fVar;
        return n51.f.a(this.finder_object, finderObjectWrap.finder_object) && n51.f.a(this.tid, finderObjectWrap.tid) && n51.f.a(this.commentScene, finderObjectWrap.commentScene) && n51.f.a(java.lang.Long.valueOf(this.feed_source), java.lang.Long.valueOf(finderObjectWrap.feed_source)) && n51.f.a(java.lang.Integer.valueOf(this.func_flag), java.lang.Integer.valueOf(finderObjectWrap.func_flag)) && n51.f.a(java.lang.Long.valueOf(this.expired_time), java.lang.Long.valueOf(finderObjectWrap.expired_time));
    }

    public bw5.os0 getCommentScene() {
        return this.commentScene;
    }

    public long getExpiredTime() {
        return this.expired_time;
    }

    public long getExpired_time() {
        return this.expired_time;
    }

    public long getFeedSource() {
        return this.feed_source;
    }

    public long getFeed_source() {
        return this.feed_source;
    }

    public com.tencent.mm.protobuf.g getFinderObject() {
        return this.finder_object;
    }

    public com.tencent.mm.protobuf.g getFinder_object() {
        return this.finder_object;
    }

    public int getFuncFlag() {
        return this.func_flag;
    }

    public int getFunc_flag() {
        return this.func_flag;
    }

    public java.lang.String getTid() {
        return this.tid;
    }

    public com.tencent.wechat.aff.finder.FinderObjectWrap mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.finder.FinderObjectWrap();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.finder_object;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            java.lang.String str = this.tid;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.commentScene.f31385d);
            fVar.h(4, this.feed_source);
            fVar.e(5, this.func_flag);
            fVar.h(6, this.expired_time);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar2 = this.finder_object;
            int b17 = gVar2 != null ? 0 + b36.f.b(1, gVar2) : 0;
            java.lang.String str2 = this.tid;
            if (str2 != null) {
                b17 += b36.f.j(2, str2);
            }
            return b17 + b36.f.e(3, this.commentScene.f31385d) + b36.f.h(4, this.feed_source) + b36.f.e(5, this.func_flag) + b36.f.h(6, this.expired_time);
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
                this.finder_object = aVar2.d(intValue);
                return 0;
            case 2:
                this.tid = aVar2.k(intValue);
                return 0;
            case 3:
                this.commentScene = bw5.os0.i(aVar2.g(intValue));
                return 0;
            case 4:
                this.feed_source = aVar2.i(intValue);
                return 0;
            case 5:
                this.func_flag = aVar2.g(intValue);
                return 0;
            case 6:
                this.expired_time = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.finder.FinderObjectWrap setCommentScene(bw5.os0 os0Var) {
        this.commentScene = os0Var;
        return this;
    }

    public com.tencent.wechat.aff.finder.FinderObjectWrap setExpiredTime(long j17) {
        this.expired_time = j17;
        return this;
    }

    public com.tencent.wechat.aff.finder.FinderObjectWrap setExpired_time(long j17) {
        this.expired_time = j17;
        return this;
    }

    public com.tencent.wechat.aff.finder.FinderObjectWrap setFeedSource(long j17) {
        this.feed_source = j17;
        return this;
    }

    public com.tencent.wechat.aff.finder.FinderObjectWrap setFeed_source(long j17) {
        this.feed_source = j17;
        return this;
    }

    public com.tencent.wechat.aff.finder.FinderObjectWrap setFinderObject(com.tencent.mm.protobuf.g gVar) {
        this.finder_object = gVar;
        return this;
    }

    public com.tencent.wechat.aff.finder.FinderObjectWrap setFinder_object(com.tencent.mm.protobuf.g gVar) {
        this.finder_object = gVar;
        return this;
    }

    public com.tencent.wechat.aff.finder.FinderObjectWrap setFuncFlag(int i17) {
        this.func_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.finder.FinderObjectWrap setFunc_flag(int i17) {
        this.func_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.finder.FinderObjectWrap setTid(java.lang.String str) {
        this.tid = str;
        return this;
    }

    public com.tencent.wechat.aff.finder.FinderObjectWrap mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.finder.FinderObjectWrap parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.finder.FinderObjectWrap) super.parseFrom(bArr);
    }
}
