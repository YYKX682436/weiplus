package com.tencent.wechat.aff.status;

/* loaded from: classes10.dex */
public class MarkStatusReadRequest extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.status.MarkStatusReadRequest DEFAULT_INSTANCE = new com.tencent.wechat.aff.status.MarkStatusReadRequest();
    private final boolean[] hasSetFields = new boolean[3];
    private java.lang.String status_id;
    private java.lang.String status_owner_username;

    public static com.tencent.wechat.aff.status.MarkStatusReadRequest create() {
        return new com.tencent.wechat.aff.status.MarkStatusReadRequest();
    }

    public static com.tencent.wechat.aff.status.MarkStatusReadRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.status.MarkStatusReadRequest newBuilder() {
        return new com.tencent.wechat.aff.status.MarkStatusReadRequest();
    }

    public com.tencent.wechat.aff.status.MarkStatusReadRequest build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.status.MarkStatusReadRequest)) {
            return false;
        }
        com.tencent.wechat.aff.status.MarkStatusReadRequest markStatusReadRequest = (com.tencent.wechat.aff.status.MarkStatusReadRequest) fVar;
        return n51.f.a(this.status_id, markStatusReadRequest.status_id) && n51.f.a(this.status_owner_username, markStatusReadRequest.status_owner_username);
    }

    public java.lang.String getStatusId() {
        return this.hasSetFields[1] ? this.status_id : "";
    }

    public java.lang.String getStatusOwnerUsername() {
        return this.hasSetFields[2] ? this.status_owner_username : "";
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasStatusId() {
        return hasFieldNumber(1);
    }

    public boolean hasStatusOwnerUsername() {
        return hasFieldNumber(2);
    }

    public com.tencent.wechat.aff.status.MarkStatusReadRequest mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.status.MarkStatusReadRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.status_id;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.status_owner_username;
            if (str2 != null && this.hasSetFields[2]) {
                fVar.j(2, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.status_id;
            if (str3 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.status_owner_username;
            return (str4 == null || !this.hasSetFields[2]) ? i18 : i18 + b36.f.j(2, str4);
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
            this.status_id = aVar2.k(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.status_owner_username = aVar2.k(intValue);
        this.hasSetFields[2] = true;
        return 0;
    }

    public com.tencent.wechat.aff.status.MarkStatusReadRequest setStatusId(java.lang.String str) {
        this.status_id = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.status.MarkStatusReadRequest setStatusOwnerUsername(java.lang.String str) {
        this.status_owner_username = str;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.status.MarkStatusReadRequest mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.status.MarkStatusReadRequest parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.status.MarkStatusReadRequest) super.parseFrom(bArr);
    }
}
