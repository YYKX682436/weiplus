package com.tencent.wechat.aff.newlife;

/* loaded from: classes2.dex */
public class NewLifeConnectShareBarStyle extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.NewLifeConnectShareBarStyle DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.NewLifeConnectShareBarStyle();
    public java.util.LinkedList<java.lang.String> head_url = new java.util.LinkedList<>();

    public static com.tencent.wechat.aff.newlife.NewLifeConnectShareBarStyle create() {
        return new com.tencent.wechat.aff.newlife.NewLifeConnectShareBarStyle();
    }

    public static com.tencent.wechat.aff.newlife.NewLifeConnectShareBarStyle getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.NewLifeConnectShareBarStyle newBuilder() {
        return new com.tencent.wechat.aff.newlife.NewLifeConnectShareBarStyle();
    }

    public com.tencent.wechat.aff.newlife.NewLifeConnectShareBarStyle addAllElementHeadUrl(java.util.Collection<java.lang.String> collection) {
        this.head_url.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeConnectShareBarStyle addAllElementHead_url(java.util.Collection<java.lang.String> collection) {
        this.head_url.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeConnectShareBarStyle addElementHeadUrl(java.lang.String str) {
        this.head_url.add(str);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeConnectShareBarStyle addElementHead_url(java.lang.String str) {
        this.head_url.add(str);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeConnectShareBarStyle build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.aff.newlife.NewLifeConnectShareBarStyle) && n51.f.a(this.head_url, ((com.tencent.wechat.aff.newlife.NewLifeConnectShareBarStyle) fVar).head_url);
    }

    public java.util.LinkedList<java.lang.String> getHeadUrl() {
        return this.head_url;
    }

    public java.util.LinkedList<java.lang.String> getHead_url() {
        return this.head_url;
    }

    public com.tencent.wechat.aff.newlife.NewLifeConnectShareBarStyle mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.NewLifeConnectShareBarStyle();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 1, this.head_url);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 1, this.head_url) + 0;
        }
        if (i17 == 2) {
            this.head_url.clear();
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
        this.head_url.add(aVar2.k(intValue));
        return 0;
    }

    public com.tencent.wechat.aff.newlife.NewLifeConnectShareBarStyle setHeadUrl(java.util.LinkedList<java.lang.String> linkedList) {
        this.head_url = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeConnectShareBarStyle setHead_url(java.util.LinkedList<java.lang.String> linkedList) {
        this.head_url = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeConnectShareBarStyle mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.NewLifeConnectShareBarStyle parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.NewLifeConnectShareBarStyle) super.parseFrom(bArr);
    }
}
