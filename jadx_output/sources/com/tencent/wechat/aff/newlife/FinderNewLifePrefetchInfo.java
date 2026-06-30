package com.tencent.wechat.aff.newlife;

/* loaded from: classes4.dex */
public class FinderNewLifePrefetchInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo();
    public int prefetch_interval = 0;
    public int is_prefetch_freq_limit = 0;

    public static com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo create() {
        return new com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo();
    }

    public static com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo();
    }

    public com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo finderNewLifePrefetchInfo = (com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.prefetch_interval), java.lang.Integer.valueOf(finderNewLifePrefetchInfo.prefetch_interval)) && n51.f.a(java.lang.Integer.valueOf(this.is_prefetch_freq_limit), java.lang.Integer.valueOf(finderNewLifePrefetchInfo.is_prefetch_freq_limit));
    }

    public int getIsPrefetchFreqLimit() {
        return this.is_prefetch_freq_limit;
    }

    public int getIs_prefetch_freq_limit() {
        return this.is_prefetch_freq_limit;
    }

    public int getPrefetchInterval() {
        return this.prefetch_interval;
    }

    public int getPrefetch_interval() {
        return this.prefetch_interval;
    }

    public com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.prefetch_interval);
            fVar.e(2, this.is_prefetch_freq_limit);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.prefetch_interval) + 0 + b36.f.e(2, this.is_prefetch_freq_limit);
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
            this.prefetch_interval = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.is_prefetch_freq_limit = aVar2.g(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo setIsPrefetchFreqLimit(int i17) {
        this.is_prefetch_freq_limit = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo setIs_prefetch_freq_limit(int i17) {
        this.is_prefetch_freq_limit = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo setPrefetchInterval(int i17) {
        this.prefetch_interval = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo setPrefetch_interval(int i17) {
        this.prefetch_interval = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderNewLifePrefetchInfo) super.parseFrom(bArr);
    }
}
