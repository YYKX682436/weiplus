package com.tencent.wechat.aff.newlife;

/* loaded from: classes2.dex */
public class NewLifeJumpInfoSupportBusinessTypes extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.NewLifeJumpInfoSupportBusinessTypes DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.NewLifeJumpInfoSupportBusinessTypes();
    public java.util.LinkedList<java.lang.Integer> business_types = new java.util.LinkedList<>();

    public static com.tencent.wechat.aff.newlife.NewLifeJumpInfoSupportBusinessTypes create() {
        return new com.tencent.wechat.aff.newlife.NewLifeJumpInfoSupportBusinessTypes();
    }

    public static com.tencent.wechat.aff.newlife.NewLifeJumpInfoSupportBusinessTypes getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.NewLifeJumpInfoSupportBusinessTypes newBuilder() {
        return new com.tencent.wechat.aff.newlife.NewLifeJumpInfoSupportBusinessTypes();
    }

    public com.tencent.wechat.aff.newlife.NewLifeJumpInfoSupportBusinessTypes addAllElementBusinessTypes(java.util.Collection<java.lang.Integer> collection) {
        this.business_types.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeJumpInfoSupportBusinessTypes addAllElementBusiness_types(java.util.Collection<java.lang.Integer> collection) {
        this.business_types.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeJumpInfoSupportBusinessTypes addElementBusinessTypes(int i17) {
        this.business_types.add(java.lang.Integer.valueOf(i17));
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeJumpInfoSupportBusinessTypes addElementBusiness_types(int i17) {
        this.business_types.add(java.lang.Integer.valueOf(i17));
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeJumpInfoSupportBusinessTypes build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.aff.newlife.NewLifeJumpInfoSupportBusinessTypes) && n51.f.a(this.business_types, ((com.tencent.wechat.aff.newlife.NewLifeJumpInfoSupportBusinessTypes) fVar).business_types);
    }

    public java.util.LinkedList<java.lang.Integer> getBusinessTypes() {
        return this.business_types;
    }

    public java.util.LinkedList<java.lang.Integer> getBusiness_types() {
        return this.business_types;
    }

    public com.tencent.wechat.aff.newlife.NewLifeJumpInfoSupportBusinessTypes mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.NewLifeJumpInfoSupportBusinessTypes();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 2, this.business_types);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 2, this.business_types) + 0;
        }
        if (i17 == 2) {
            this.business_types.clear();
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
        this.business_types.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
        return 0;
    }

    public com.tencent.wechat.aff.newlife.NewLifeJumpInfoSupportBusinessTypes setBusinessTypes(java.util.LinkedList<java.lang.Integer> linkedList) {
        this.business_types = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeJumpInfoSupportBusinessTypes setBusiness_types(java.util.LinkedList<java.lang.Integer> linkedList) {
        this.business_types = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeJumpInfoSupportBusinessTypes mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.NewLifeJumpInfoSupportBusinessTypes parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.NewLifeJumpInfoSupportBusinessTypes) super.parseFrom(bArr);
    }
}
