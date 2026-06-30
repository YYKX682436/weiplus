package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class SourceInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.SourceInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.SourceInfo();
    public int source_type = 0;

    /* loaded from: classes6.dex */
    public enum SourceType implements com.tencent.mm.protobuf.h {
        NewLife(0),
        WebSearch(1);

        public static final int NewLife_VALUE = 0;
        public static final int WebSearch_VALUE = 1;
        public final int value;

        SourceType(int i17) {
            this.value = i17;
        }

        public static com.tencent.wechat.aff.newlife.SourceInfo.SourceType forNumber(int i17) {
            if (i17 == 0) {
                return NewLife;
            }
            if (i17 != 1) {
                return null;
            }
            return WebSearch;
        }

        @Override // com.tencent.mm.protobuf.h
        public final int getNumber() {
            return this.value;
        }

        public static com.tencent.wechat.aff.newlife.SourceInfo.SourceType valueOf(int i17) {
            return forNumber(i17);
        }
    }

    public static com.tencent.wechat.aff.newlife.SourceInfo create() {
        return new com.tencent.wechat.aff.newlife.SourceInfo();
    }

    public static com.tencent.wechat.aff.newlife.SourceInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.SourceInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.SourceInfo();
    }

    public com.tencent.wechat.aff.newlife.SourceInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.aff.newlife.SourceInfo) && n51.f.a(java.lang.Integer.valueOf(this.source_type), java.lang.Integer.valueOf(((com.tencent.wechat.aff.newlife.SourceInfo) fVar).source_type));
    }

    public int getSourceType() {
        return this.source_type;
    }

    public int getSource_type() {
        return this.source_type;
    }

    public com.tencent.wechat.aff.newlife.SourceInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.SourceInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).e(1, this.source_type);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.source_type) + 0;
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
        if (intValue != 1) {
            return -1;
        }
        this.source_type = aVar2.g(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.SourceInfo setSourceType(int i17) {
        this.source_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.SourceInfo setSource_type(int i17) {
        this.source_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.SourceInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.SourceInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.SourceInfo) super.parseFrom(bArr);
    }
}
