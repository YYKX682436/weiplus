package com.tencent.wechat.aff.finder;

/* loaded from: classes2.dex */
public class FinderPrefetchEchoResponse extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.finder.FinderPrefetchEchoResponse DEFAULT_INSTANCE = new com.tencent.wechat.aff.finder.FinderPrefetchEchoResponse();
    public java.lang.String body = "";

    public static com.tencent.wechat.aff.finder.FinderPrefetchEchoResponse create() {
        return new com.tencent.wechat.aff.finder.FinderPrefetchEchoResponse();
    }

    public static com.tencent.wechat.aff.finder.FinderPrefetchEchoResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.finder.FinderPrefetchEchoResponse newBuilder() {
        return new com.tencent.wechat.aff.finder.FinderPrefetchEchoResponse();
    }

    public com.tencent.wechat.aff.finder.FinderPrefetchEchoResponse build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.aff.finder.FinderPrefetchEchoResponse) && n51.f.a(this.body, ((com.tencent.wechat.aff.finder.FinderPrefetchEchoResponse) fVar).body);
    }

    public java.lang.String getBody() {
        return this.body;
    }

    public com.tencent.wechat.aff.finder.FinderPrefetchEchoResponse mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.finder.FinderPrefetchEchoResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.body;
            if (str != null) {
                fVar.j(1, str);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.body;
            if (str2 != null) {
                return 0 + b36.f.j(1, str2);
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
        this.body = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.finder.FinderPrefetchEchoResponse setBody(java.lang.String str) {
        this.body = str;
        return this;
    }

    public com.tencent.wechat.aff.finder.FinderPrefetchEchoResponse mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.finder.FinderPrefetchEchoResponse parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.finder.FinderPrefetchEchoResponse) super.parseFrom(bArr);
    }
}
