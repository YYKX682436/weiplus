package com.tencent.wechat.aff.status;

/* loaded from: classes2.dex */
public class GetStatusReadListRequest extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.status.GetStatusReadListRequest DEFAULT_INSTANCE = new com.tencent.wechat.aff.status.GetStatusReadListRequest();
    private final boolean[] hasSetFields = new boolean[2];
    private java.lang.String status_id;

    public static com.tencent.wechat.aff.status.GetStatusReadListRequest create() {
        return new com.tencent.wechat.aff.status.GetStatusReadListRequest();
    }

    public static com.tencent.wechat.aff.status.GetStatusReadListRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.status.GetStatusReadListRequest newBuilder() {
        return new com.tencent.wechat.aff.status.GetStatusReadListRequest();
    }

    public com.tencent.wechat.aff.status.GetStatusReadListRequest build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.aff.status.GetStatusReadListRequest) && n51.f.a(this.status_id, ((com.tencent.wechat.aff.status.GetStatusReadListRequest) fVar).status_id);
    }

    public java.lang.String getStatusId() {
        return this.hasSetFields[1] ? this.status_id : "";
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasStatusId() {
        return hasFieldNumber(1);
    }

    public com.tencent.wechat.aff.status.GetStatusReadListRequest mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.status.GetStatusReadListRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.status_id;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.status_id;
            if (str2 == null || !this.hasSetFields[1]) {
                return 0;
            }
            return 0 + b36.f.j(1, str2);
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
        this.status_id = aVar2.k(intValue);
        this.hasSetFields[1] = true;
        return 0;
    }

    public com.tencent.wechat.aff.status.GetStatusReadListRequest setStatusId(java.lang.String str) {
        this.status_id = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.status.GetStatusReadListRequest mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.status.GetStatusReadListRequest parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.status.GetStatusReadListRequest) super.parseFrom(bArr);
    }
}
