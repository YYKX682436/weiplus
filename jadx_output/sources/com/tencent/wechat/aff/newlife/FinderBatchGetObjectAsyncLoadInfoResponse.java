package com.tencent.wechat.aff.newlife;

/* loaded from: classes2.dex */
public class FinderBatchGetObjectAsyncLoadInfoResponse extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse();
    public com.tencent.wechat.aff.newlife.BaseResponse baseResponse = com.tencent.wechat.aff.newlife.BaseResponse.getDefaultInstance();
    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo> object_async_info_map = new java.util.LinkedList<>();
    public java.util.LinkedList<java.lang.Integer> newlife_support_businesstype = new java.util.LinkedList<>();

    public static com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse create() {
        return new com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse();
    }

    public static com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse();
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse addAllElementNewlifeSupportBusinesstype(java.util.Collection<java.lang.Integer> collection) {
        this.newlife_support_businesstype.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse addAllElementNewlife_support_businesstype(java.util.Collection<java.lang.Integer> collection) {
        this.newlife_support_businesstype.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse addAllElementObjectAsyncInfoMap(java.util.Collection<com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo> collection) {
        this.object_async_info_map.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse addAllElementObject_async_info_map(java.util.Collection<com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo> collection) {
        this.object_async_info_map.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse addElementNewlifeSupportBusinesstype(int i17) {
        this.newlife_support_businesstype.add(java.lang.Integer.valueOf(i17));
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse addElementNewlife_support_businesstype(int i17) {
        this.newlife_support_businesstype.add(java.lang.Integer.valueOf(i17));
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse addElementObjectAsyncInfoMap(com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo finderObjectAsyncLoadInfo) {
        this.object_async_info_map.add(finderObjectAsyncLoadInfo);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse addElementObject_async_info_map(com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo finderObjectAsyncLoadInfo) {
        this.object_async_info_map.add(finderObjectAsyncLoadInfo);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse finderBatchGetObjectAsyncLoadInfoResponse = (com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse) fVar;
        return n51.f.a(this.baseResponse, finderBatchGetObjectAsyncLoadInfoResponse.baseResponse) && n51.f.a(this.object_async_info_map, finderBatchGetObjectAsyncLoadInfoResponse.object_async_info_map) && n51.f.a(this.newlife_support_businesstype, finderBatchGetObjectAsyncLoadInfoResponse.newlife_support_businesstype);
    }

    public com.tencent.wechat.aff.newlife.BaseResponse getBaseResponse() {
        return this.baseResponse;
    }

    public java.util.LinkedList<java.lang.Integer> getNewlifeSupportBusinesstype() {
        return this.newlife_support_businesstype;
    }

    public java.util.LinkedList<java.lang.Integer> getNewlife_support_businesstype() {
        return this.newlife_support_businesstype;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo> getObjectAsyncInfoMap() {
        return this.object_async_info_map;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo> getObject_async_info_map() {
        return this.object_async_info_map;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.newlife.BaseResponse baseResponse = this.baseResponse;
            if (baseResponse != null) {
                fVar.i(1, baseResponse.computeSize());
                this.baseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, this.object_async_info_map);
            fVar.g(7, 2, this.newlife_support_businesstype);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.newlife.BaseResponse baseResponse2 = this.baseResponse;
            return (baseResponse2 != null ? 0 + b36.f.i(1, baseResponse2.computeSize()) : 0) + b36.f.g(2, 8, this.object_async_info_map) + b36.f.g(7, 2, this.newlife_support_businesstype);
        }
        if (i17 == 2) {
            this.object_async_info_map.clear();
            this.newlife_support_businesstype.clear();
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.wechat.aff.newlife.BaseResponse baseResponse3 = new com.tencent.wechat.aff.newlife.BaseResponse();
                if (bArr != null && bArr.length > 0) {
                    baseResponse3.parseFrom(bArr);
                }
                this.baseResponse = baseResponse3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 7) {
                return -1;
            }
            this.newlife_support_businesstype.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo finderObjectAsyncLoadInfo = new com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo();
            if (bArr2 != null && bArr2.length > 0) {
                finderObjectAsyncLoadInfo.parseFrom(bArr2);
            }
            this.object_async_info_map.add(finderObjectAsyncLoadInfo);
        }
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse setBaseResponse(com.tencent.wechat.aff.newlife.BaseResponse baseResponse) {
        this.baseResponse = baseResponse;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse setNewlifeSupportBusinesstype(java.util.LinkedList<java.lang.Integer> linkedList) {
        this.newlife_support_businesstype = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse setNewlife_support_businesstype(java.util.LinkedList<java.lang.Integer> linkedList) {
        this.newlife_support_businesstype = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse setObjectAsyncInfoMap(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo> linkedList) {
        this.object_async_info_map = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse setObject_async_info_map(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo> linkedList) {
        this.object_async_info_map = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoResponse) super.parseFrom(bArr);
    }
}
