package com.tencent.wechat.aff.finder;

/* loaded from: classes2.dex */
public class EducationTipsSaveData extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.finder.EducationTipsSaveData DEFAULT_INSTANCE = new com.tencent.wechat.aff.finder.EducationTipsSaveData();
    public int show_count = 0;
    public long last_show_timestame = 0;

    public static com.tencent.wechat.aff.finder.EducationTipsSaveData create() {
        return new com.tencent.wechat.aff.finder.EducationTipsSaveData();
    }

    public static com.tencent.wechat.aff.finder.EducationTipsSaveData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.finder.EducationTipsSaveData newBuilder() {
        return new com.tencent.wechat.aff.finder.EducationTipsSaveData();
    }

    public com.tencent.wechat.aff.finder.EducationTipsSaveData build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.finder.EducationTipsSaveData)) {
            return false;
        }
        com.tencent.wechat.aff.finder.EducationTipsSaveData educationTipsSaveData = (com.tencent.wechat.aff.finder.EducationTipsSaveData) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.show_count), java.lang.Integer.valueOf(educationTipsSaveData.show_count)) && n51.f.a(java.lang.Long.valueOf(this.last_show_timestame), java.lang.Long.valueOf(educationTipsSaveData.last_show_timestame));
    }

    public long getLastShowTimestame() {
        return this.last_show_timestame;
    }

    public long getLast_show_timestame() {
        return this.last_show_timestame;
    }

    public int getShowCount() {
        return this.show_count;
    }

    public int getShow_count() {
        return this.show_count;
    }

    public com.tencent.wechat.aff.finder.EducationTipsSaveData mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.finder.EducationTipsSaveData();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.show_count);
            fVar.h(2, this.last_show_timestame);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.show_count) + 0 + b36.f.h(2, this.last_show_timestame);
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
            this.show_count = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.last_show_timestame = aVar2.i(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.finder.EducationTipsSaveData setLastShowTimestame(long j17) {
        this.last_show_timestame = j17;
        return this;
    }

    public com.tencent.wechat.aff.finder.EducationTipsSaveData setLast_show_timestame(long j17) {
        this.last_show_timestame = j17;
        return this;
    }

    public com.tencent.wechat.aff.finder.EducationTipsSaveData setShowCount(int i17) {
        this.show_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.finder.EducationTipsSaveData setShow_count(int i17) {
        this.show_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.finder.EducationTipsSaveData mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.finder.EducationTipsSaveData parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.finder.EducationTipsSaveData) super.parseFrom(bArr);
    }
}
