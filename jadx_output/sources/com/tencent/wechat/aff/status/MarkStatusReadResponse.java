package com.tencent.wechat.aff.status;

/* loaded from: classes8.dex */
public class MarkStatusReadResponse extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.status.MarkStatusReadResponse DEFAULT_INSTANCE = new com.tencent.wechat.aff.status.MarkStatusReadResponse();
    private int error_code;
    private java.lang.String error_msg;
    private final boolean[] hasSetFields = new boolean[4];
    private boolean result;

    public static com.tencent.wechat.aff.status.MarkStatusReadResponse create() {
        return new com.tencent.wechat.aff.status.MarkStatusReadResponse();
    }

    public static com.tencent.wechat.aff.status.MarkStatusReadResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.status.MarkStatusReadResponse newBuilder() {
        return new com.tencent.wechat.aff.status.MarkStatusReadResponse();
    }

    public com.tencent.wechat.aff.status.MarkStatusReadResponse build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.status.MarkStatusReadResponse)) {
            return false;
        }
        com.tencent.wechat.aff.status.MarkStatusReadResponse markStatusReadResponse = (com.tencent.wechat.aff.status.MarkStatusReadResponse) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.result), java.lang.Boolean.valueOf(markStatusReadResponse.result)) && n51.f.a(java.lang.Integer.valueOf(this.error_code), java.lang.Integer.valueOf(markStatusReadResponse.error_code)) && n51.f.a(this.error_msg, markStatusReadResponse.error_msg);
    }

    public int getErrorCode() {
        return this.error_code;
    }

    public java.lang.String getErrorMsg() {
        return this.hasSetFields[3] ? this.error_msg : "";
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

    public boolean hasResult() {
        return hasFieldNumber(1);
    }

    public com.tencent.wechat.aff.status.MarkStatusReadResponse mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.status.MarkStatusReadResponse();
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
            return 0;
        }
        if (i17 == 1) {
            int a17 = this.hasSetFields[1] ? 0 + b36.f.a(1, this.result) : 0;
            if (this.hasSetFields[2]) {
                a17 += b36.f.e(2, this.error_code);
            }
            java.lang.String str2 = this.error_msg;
            return (str2 == null || !this.hasSetFields[3]) ? a17 : a17 + b36.f.j(3, str2);
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
            this.result = aVar2.c(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.error_code = aVar2.g(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.error_msg = aVar2.k(intValue);
        this.hasSetFields[3] = true;
        return 0;
    }

    public com.tencent.wechat.aff.status.MarkStatusReadResponse setErrorCode(int i17) {
        this.error_code = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.status.MarkStatusReadResponse setErrorMsg(java.lang.String str) {
        this.error_msg = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.wechat.aff.status.MarkStatusReadResponse setResult(boolean z17) {
        this.result = z17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.status.MarkStatusReadResponse mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.status.MarkStatusReadResponse parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.status.MarkStatusReadResponse) super.parseFrom(bArr);
    }
}
