package com.tencent.wechat.aff.status;

/* loaded from: classes4.dex */
public class StatusCgiError extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.status.StatusCgiError DEFAULT_INSTANCE = new com.tencent.wechat.aff.status.StatusCgiError();
    public int ret = 0;
    public int type = 0;
    public int code = 0;

    public static com.tencent.wechat.aff.status.StatusCgiError create() {
        return new com.tencent.wechat.aff.status.StatusCgiError();
    }

    public static com.tencent.wechat.aff.status.StatusCgiError getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.status.StatusCgiError newBuilder() {
        return new com.tencent.wechat.aff.status.StatusCgiError();
    }

    public com.tencent.wechat.aff.status.StatusCgiError build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.status.StatusCgiError)) {
            return false;
        }
        com.tencent.wechat.aff.status.StatusCgiError statusCgiError = (com.tencent.wechat.aff.status.StatusCgiError) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.ret), java.lang.Integer.valueOf(statusCgiError.ret)) && n51.f.a(java.lang.Integer.valueOf(this.type), java.lang.Integer.valueOf(statusCgiError.type)) && n51.f.a(java.lang.Integer.valueOf(this.code), java.lang.Integer.valueOf(statusCgiError.code));
    }

    public int getCode() {
        return this.code;
    }

    public int getRet() {
        return this.ret;
    }

    public int getType() {
        return this.type;
    }

    public com.tencent.wechat.aff.status.StatusCgiError mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.status.StatusCgiError();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.ret);
            fVar.e(2, this.type);
            fVar.e(3, this.code);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.ret) + 0 + b36.f.e(2, this.type) + b36.f.e(3, this.code);
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
            this.ret = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.type = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.code = aVar2.g(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.status.StatusCgiError setCode(int i17) {
        this.code = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusCgiError setRet(int i17) {
        this.ret = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusCgiError setType(int i17) {
        this.type = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusCgiError mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.status.StatusCgiError parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.status.StatusCgiError) super.parseFrom(bArr);
    }
}
