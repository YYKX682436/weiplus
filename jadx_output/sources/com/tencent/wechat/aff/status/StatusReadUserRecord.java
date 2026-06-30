package com.tencent.wechat.aff.status;

/* loaded from: classes2.dex */
public class StatusReadUserRecord extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.status.StatusReadUserRecord DEFAULT_INSTANCE = new com.tencent.wechat.aff.status.StatusReadUserRecord();
    private final boolean[] hasSetFields = new boolean[4];
    private long read_time;
    private java.lang.String status_id;
    private java.lang.String username;

    public static com.tencent.wechat.aff.status.StatusReadUserRecord create() {
        return new com.tencent.wechat.aff.status.StatusReadUserRecord();
    }

    public static com.tencent.wechat.aff.status.StatusReadUserRecord getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.status.StatusReadUserRecord newBuilder() {
        return new com.tencent.wechat.aff.status.StatusReadUserRecord();
    }

    public com.tencent.wechat.aff.status.StatusReadUserRecord build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.status.StatusReadUserRecord)) {
            return false;
        }
        com.tencent.wechat.aff.status.StatusReadUserRecord statusReadUserRecord = (com.tencent.wechat.aff.status.StatusReadUserRecord) fVar;
        return n51.f.a(this.status_id, statusReadUserRecord.status_id) && n51.f.a(this.username, statusReadUserRecord.username) && n51.f.a(java.lang.Long.valueOf(this.read_time), java.lang.Long.valueOf(statusReadUserRecord.read_time));
    }

    public long getReadTime() {
        return this.read_time;
    }

    public java.lang.String getStatusId() {
        return this.hasSetFields[3] ? this.status_id : "";
    }

    public java.lang.String getUsername() {
        return this.hasSetFields[1] ? this.username : "";
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasReadTime() {
        return hasFieldNumber(2);
    }

    public boolean hasStatusId() {
        return hasFieldNumber(3);
    }

    public boolean hasUsername() {
        return hasFieldNumber(1);
    }

    public com.tencent.wechat.aff.status.StatusReadUserRecord mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.status.StatusReadUserRecord();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.status_id;
            if (str != null && this.hasSetFields[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.username;
            if (str2 != null && this.hasSetFields[1]) {
                fVar.j(1, str2);
            }
            if (this.hasSetFields[2]) {
                fVar.h(2, this.read_time);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.status_id;
            if (str3 != null && this.hasSetFields[3]) {
                i18 = 0 + b36.f.j(3, str3);
            }
            java.lang.String str4 = this.username;
            if (str4 != null && this.hasSetFields[1]) {
                i18 += b36.f.j(1, str4);
            }
            return this.hasSetFields[2] ? i18 + b36.f.h(2, this.read_time) : i18;
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
            this.username = aVar2.k(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.read_time = aVar2.i(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.status_id = aVar2.k(intValue);
        this.hasSetFields[3] = true;
        return 0;
    }

    public com.tencent.wechat.aff.status.StatusReadUserRecord setReadTime(long j17) {
        this.read_time = j17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusReadUserRecord setStatusId(java.lang.String str) {
        this.status_id = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusReadUserRecord setUsername(java.lang.String str) {
        this.username = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusReadUserRecord mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.status.StatusReadUserRecord parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.status.StatusReadUserRecord) super.parseFrom(bArr);
    }
}
