package com.tencent.wechat.aff.status;

/* loaded from: classes2.dex */
public class GetStatusReadListResponse extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.status.GetStatusReadListResponse DEFAULT_INSTANCE = new com.tencent.wechat.aff.status.GetStatusReadListResponse();
    private int error_code;
    private java.lang.String error_msg;
    private boolean from_cache;
    private boolean result;
    private java.util.LinkedList<com.tencent.wechat.aff.status.StatusReadUserRecord> read_users = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[6];

    public static com.tencent.wechat.aff.status.GetStatusReadListResponse create() {
        return new com.tencent.wechat.aff.status.GetStatusReadListResponse();
    }

    public static com.tencent.wechat.aff.status.GetStatusReadListResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.status.GetStatusReadListResponse newBuilder() {
        return new com.tencent.wechat.aff.status.GetStatusReadListResponse();
    }

    public com.tencent.wechat.aff.status.GetStatusReadListResponse addAllElementReadUsers(java.util.Collection<com.tencent.wechat.aff.status.StatusReadUserRecord> collection) {
        this.read_users.addAll(collection);
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.wechat.aff.status.GetStatusReadListResponse addElementReadUsers(com.tencent.wechat.aff.status.StatusReadUserRecord statusReadUserRecord) {
        this.read_users.add(statusReadUserRecord);
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.wechat.aff.status.GetStatusReadListResponse build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.status.GetStatusReadListResponse)) {
            return false;
        }
        com.tencent.wechat.aff.status.GetStatusReadListResponse getStatusReadListResponse = (com.tencent.wechat.aff.status.GetStatusReadListResponse) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.result), java.lang.Boolean.valueOf(getStatusReadListResponse.result)) && n51.f.a(java.lang.Integer.valueOf(this.error_code), java.lang.Integer.valueOf(getStatusReadListResponse.error_code)) && n51.f.a(this.error_msg, getStatusReadListResponse.error_msg) && n51.f.a(this.read_users, getStatusReadListResponse.read_users) && n51.f.a(java.lang.Boolean.valueOf(this.from_cache), java.lang.Boolean.valueOf(getStatusReadListResponse.from_cache));
    }

    public int getErrorCode() {
        return this.error_code;
    }

    public java.lang.String getErrorMsg() {
        return this.hasSetFields[3] ? this.error_msg : "";
    }

    public boolean getFromCache() {
        return this.from_cache;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.status.StatusReadUserRecord> getReadUsers() {
        return this.read_users;
    }

    public boolean getResult() {
        return this.result;
    }

    public boolean hasErrorCode() {
        return hasFieldNumber(2);
    }

    public boolean hasErrorMsg() {
        return hasFieldNumber(3);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFromCache() {
        return hasFieldNumber(5);
    }

    public boolean hasReadUsers() {
        return hasFieldNumber(4);
    }

    public boolean hasResult() {
        return hasFieldNumber(1);
    }

    public com.tencent.wechat.aff.status.GetStatusReadListResponse mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.status.GetStatusReadListResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.a(1, this.result);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.error_code);
            }
            java.lang.String str = this.error_msg;
            if (str != null && this.hasSetFields[3]) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, this.read_users);
            if (this.hasSetFields[5]) {
                fVar.a(5, this.from_cache);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = this.hasSetFields[1] ? 0 + b36.f.a(1, this.result) : 0;
            if (this.hasSetFields[2]) {
                a17 += b36.f.e(2, this.error_code);
            }
            java.lang.String str2 = this.error_msg;
            if (str2 != null && this.hasSetFields[3]) {
                a17 += b36.f.j(3, str2);
            }
            int g17 = a17 + b36.f.g(4, 8, this.read_users);
            return this.hasSetFields[5] ? g17 + b36.f.a(5, this.from_cache) : g17;
        }
        if (i17 == 2) {
            this.read_users.clear();
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
            this.result = aVar2.c(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.error_code = aVar2.g(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.error_msg = aVar2.k(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            this.from_cache = aVar2.c(intValue);
            this.hasSetFields[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.aff.status.StatusReadUserRecord statusReadUserRecord = new com.tencent.wechat.aff.status.StatusReadUserRecord();
            if (bArr != null && bArr.length > 0) {
                statusReadUserRecord.parseFrom(bArr);
            }
            this.read_users.add(statusReadUserRecord);
        }
        this.hasSetFields[4] = true;
        return 0;
    }

    public com.tencent.wechat.aff.status.GetStatusReadListResponse setErrorCode(int i17) {
        this.error_code = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.status.GetStatusReadListResponse setErrorMsg(java.lang.String str) {
        this.error_msg = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.wechat.aff.status.GetStatusReadListResponse setFromCache(boolean z17) {
        this.from_cache = z17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.wechat.aff.status.GetStatusReadListResponse setReadUsers(java.util.LinkedList<com.tencent.wechat.aff.status.StatusReadUserRecord> linkedList) {
        this.read_users = linkedList;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.wechat.aff.status.GetStatusReadListResponse setResult(boolean z17) {
        this.result = z17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.status.GetStatusReadListResponse mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.status.GetStatusReadListResponse parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.status.GetStatusReadListResponse) super.parseFrom(bArr);
    }
}
