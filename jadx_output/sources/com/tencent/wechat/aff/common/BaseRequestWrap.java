package com.tencent.wechat.aff.common;

/* loaded from: classes2.dex */
public class BaseRequestWrap extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.common.BaseRequestWrap DEFAULT_INSTANCE = new com.tencent.wechat.aff.common.BaseRequestWrap();
    public r45.he BaseRequest = r45.he.f376076m;

    public static com.tencent.wechat.aff.common.BaseRequestWrap create() {
        return new com.tencent.wechat.aff.common.BaseRequestWrap();
    }

    public static com.tencent.wechat.aff.common.BaseRequestWrap getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.common.BaseRequestWrap newBuilder() {
        return new com.tencent.wechat.aff.common.BaseRequestWrap();
    }

    public com.tencent.wechat.aff.common.BaseRequestWrap build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.aff.common.BaseRequestWrap) && n51.f.a(this.BaseRequest, ((com.tencent.wechat.aff.common.BaseRequestWrap) fVar).BaseRequest);
    }

    public r45.he getBaseRequest() {
        return this.BaseRequest;
    }

    public com.tencent.wechat.aff.common.BaseRequestWrap mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.common.BaseRequestWrap();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            if (heVar2 != null) {
                return 0 + b36.f.i(1, heVar2.computeSize());
            }
            return 0;
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
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.he heVar3 = new r45.he();
            if (bArr != null && bArr.length > 0) {
                heVar3.parseFrom(bArr);
            }
            this.BaseRequest = heVar3;
        }
        return 0;
    }

    public com.tencent.wechat.aff.common.BaseRequestWrap setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        return this;
    }

    public com.tencent.wechat.aff.common.BaseRequestWrap mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.common.BaseRequestWrap parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.common.BaseRequestWrap) super.parseFrom(bArr);
    }
}
