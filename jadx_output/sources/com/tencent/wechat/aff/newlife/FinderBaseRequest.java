package com.tencent.wechat.aff.newlife;

/* loaded from: classes2.dex */
public class FinderBaseRequest extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderBaseRequest DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderBaseRequest();
    public com.tencent.wechat.aff.newlife.FinderAdBaseRequest ad_basereq;
    public int client_flag;
    public com.tencent.wechat.aff.newlife.ClientContextInfo ctx_info;
    public com.tencent.mm.protobuf.g expt_buffer;
    public int expt_flag;
    public com.tencent.mm.protobuf.g extSpamInfo;
    public int live_identity;
    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderObjectBaseInfo> object_base_infos;
    public long request_id;
    public int userver = 0;
    public int scene = 0;

    public FinderBaseRequest() {
        com.tencent.mm.protobuf.g gVar = com.tencent.mm.protobuf.g.f192155b;
        this.extSpamInfo = gVar;
        this.expt_flag = 0;
        this.ctx_info = com.tencent.wechat.aff.newlife.ClientContextInfo.getDefaultInstance();
        this.request_id = 0L;
        this.live_identity = 0;
        this.object_base_infos = new java.util.LinkedList<>();
        this.client_flag = 0;
        this.ad_basereq = com.tencent.wechat.aff.newlife.FinderAdBaseRequest.getDefaultInstance();
        this.expt_buffer = gVar;
    }

    public static com.tencent.wechat.aff.newlife.FinderBaseRequest create() {
        return new com.tencent.wechat.aff.newlife.FinderBaseRequest();
    }

    public static com.tencent.wechat.aff.newlife.FinderBaseRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderBaseRequest newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderBaseRequest();
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest addAllElementObjectBaseInfos(java.util.Collection<com.tencent.wechat.aff.newlife.FinderObjectBaseInfo> collection) {
        this.object_base_infos.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest addAllElementObject_base_infos(java.util.Collection<com.tencent.wechat.aff.newlife.FinderObjectBaseInfo> collection) {
        this.object_base_infos.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest addElementObjectBaseInfos(com.tencent.wechat.aff.newlife.FinderObjectBaseInfo finderObjectBaseInfo) {
        this.object_base_infos.add(finderObjectBaseInfo);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest addElementObject_base_infos(com.tencent.wechat.aff.newlife.FinderObjectBaseInfo finderObjectBaseInfo) {
        this.object_base_infos.add(finderObjectBaseInfo);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderBaseRequest)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderBaseRequest finderBaseRequest = (com.tencent.wechat.aff.newlife.FinderBaseRequest) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.userver), java.lang.Integer.valueOf(finderBaseRequest.userver)) && n51.f.a(java.lang.Integer.valueOf(this.scene), java.lang.Integer.valueOf(finderBaseRequest.scene)) && n51.f.a(this.extSpamInfo, finderBaseRequest.extSpamInfo) && n51.f.a(java.lang.Integer.valueOf(this.expt_flag), java.lang.Integer.valueOf(finderBaseRequest.expt_flag)) && n51.f.a(this.ctx_info, finderBaseRequest.ctx_info) && n51.f.a(java.lang.Long.valueOf(this.request_id), java.lang.Long.valueOf(finderBaseRequest.request_id)) && n51.f.a(java.lang.Integer.valueOf(this.live_identity), java.lang.Integer.valueOf(finderBaseRequest.live_identity)) && n51.f.a(this.object_base_infos, finderBaseRequest.object_base_infos) && n51.f.a(java.lang.Integer.valueOf(this.client_flag), java.lang.Integer.valueOf(finderBaseRequest.client_flag)) && n51.f.a(this.ad_basereq, finderBaseRequest.ad_basereq) && n51.f.a(this.expt_buffer, finderBaseRequest.expt_buffer);
    }

    public com.tencent.wechat.aff.newlife.FinderAdBaseRequest getAdBasereq() {
        return this.ad_basereq;
    }

    public com.tencent.wechat.aff.newlife.FinderAdBaseRequest getAd_basereq() {
        return this.ad_basereq;
    }

    public int getClientFlag() {
        return this.client_flag;
    }

    public int getClient_flag() {
        return this.client_flag;
    }

    public com.tencent.wechat.aff.newlife.ClientContextInfo getCtxInfo() {
        return this.ctx_info;
    }

    public com.tencent.wechat.aff.newlife.ClientContextInfo getCtx_info() {
        return this.ctx_info;
    }

    public com.tencent.mm.protobuf.g getExptBuffer() {
        return this.expt_buffer;
    }

    public int getExptFlag() {
        return this.expt_flag;
    }

    public com.tencent.mm.protobuf.g getExpt_buffer() {
        return this.expt_buffer;
    }

    public int getExpt_flag() {
        return this.expt_flag;
    }

    public com.tencent.mm.protobuf.g getExtSpamInfo() {
        return this.extSpamInfo;
    }

    public int getLiveIdentity() {
        return this.live_identity;
    }

    public int getLive_identity() {
        return this.live_identity;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderObjectBaseInfo> getObjectBaseInfos() {
        return this.object_base_infos;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderObjectBaseInfo> getObject_base_infos() {
        return this.object_base_infos;
    }

    public long getRequestId() {
        return this.request_id;
    }

    public long getRequest_id() {
        return this.request_id;
    }

    public int getScene() {
        return this.scene;
    }

    public int getUserver() {
        return this.userver;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderBaseRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.userver);
            fVar.e(2, this.scene);
            com.tencent.mm.protobuf.g gVar = this.extSpamInfo;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.expt_flag);
            com.tencent.wechat.aff.newlife.ClientContextInfo clientContextInfo = this.ctx_info;
            if (clientContextInfo != null) {
                fVar.i(5, clientContextInfo.computeSize());
                this.ctx_info.writeFields(fVar);
            }
            fVar.h(6, this.request_id);
            fVar.e(7, this.live_identity);
            fVar.g(8, 8, this.object_base_infos);
            fVar.e(10, this.client_flag);
            com.tencent.wechat.aff.newlife.FinderAdBaseRequest finderAdBaseRequest = this.ad_basereq;
            if (finderAdBaseRequest != null) {
                fVar.i(11, finderAdBaseRequest.computeSize());
                this.ad_basereq.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.expt_buffer;
            if (gVar2 != null) {
                fVar.b(12, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.userver) + 0 + b36.f.e(2, this.scene);
            com.tencent.mm.protobuf.g gVar3 = this.extSpamInfo;
            if (gVar3 != null) {
                e17 += b36.f.b(3, gVar3);
            }
            int e18 = e17 + b36.f.e(4, this.expt_flag);
            com.tencent.wechat.aff.newlife.ClientContextInfo clientContextInfo2 = this.ctx_info;
            if (clientContextInfo2 != null) {
                e18 += b36.f.i(5, clientContextInfo2.computeSize());
            }
            int h17 = e18 + b36.f.h(6, this.request_id) + b36.f.e(7, this.live_identity) + b36.f.g(8, 8, this.object_base_infos) + b36.f.e(10, this.client_flag);
            com.tencent.wechat.aff.newlife.FinderAdBaseRequest finderAdBaseRequest2 = this.ad_basereq;
            if (finderAdBaseRequest2 != null) {
                h17 += b36.f.i(11, finderAdBaseRequest2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar4 = this.expt_buffer;
            return gVar4 != null ? h17 + b36.f.b(12, gVar4) : h17;
        }
        if (i17 == 2) {
            this.object_base_infos.clear();
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
        switch (intValue) {
            case 1:
                this.userver = aVar2.g(intValue);
                return 0;
            case 2:
                this.scene = aVar2.g(intValue);
                return 0;
            case 3:
                this.extSpamInfo = aVar2.d(intValue);
                return 0;
            case 4:
                this.expt_flag = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.aff.newlife.ClientContextInfo clientContextInfo3 = new com.tencent.wechat.aff.newlife.ClientContextInfo();
                    if (bArr != null && bArr.length > 0) {
                        clientContextInfo3.parseFrom(bArr);
                    }
                    this.ctx_info = clientContextInfo3;
                }
                return 0;
            case 6:
                this.request_id = aVar2.i(intValue);
                return 0;
            case 7:
                this.live_identity = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.tencent.wechat.aff.newlife.FinderObjectBaseInfo finderObjectBaseInfo = new com.tencent.wechat.aff.newlife.FinderObjectBaseInfo();
                    if (bArr2 != null && bArr2.length > 0) {
                        finderObjectBaseInfo.parseFrom(bArr2);
                    }
                    this.object_base_infos.add(finderObjectBaseInfo);
                }
                return 0;
            case 9:
            default:
                return -1;
            case 10:
                this.client_flag = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.tencent.wechat.aff.newlife.FinderAdBaseRequest finderAdBaseRequest3 = new com.tencent.wechat.aff.newlife.FinderAdBaseRequest();
                    if (bArr3 != null && bArr3.length > 0) {
                        finderAdBaseRequest3.parseFrom(bArr3);
                    }
                    this.ad_basereq = finderAdBaseRequest3;
                }
                return 0;
            case 12:
                this.expt_buffer = aVar2.d(intValue);
                return 0;
        }
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest setAdBasereq(com.tencent.wechat.aff.newlife.FinderAdBaseRequest finderAdBaseRequest) {
        this.ad_basereq = finderAdBaseRequest;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest setAd_basereq(com.tencent.wechat.aff.newlife.FinderAdBaseRequest finderAdBaseRequest) {
        this.ad_basereq = finderAdBaseRequest;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest setClientFlag(int i17) {
        this.client_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest setClient_flag(int i17) {
        this.client_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest setCtxInfo(com.tencent.wechat.aff.newlife.ClientContextInfo clientContextInfo) {
        this.ctx_info = clientContextInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest setCtx_info(com.tencent.wechat.aff.newlife.ClientContextInfo clientContextInfo) {
        this.ctx_info = clientContextInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest setExptBuffer(com.tencent.mm.protobuf.g gVar) {
        this.expt_buffer = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest setExptFlag(int i17) {
        this.expt_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest setExpt_buffer(com.tencent.mm.protobuf.g gVar) {
        this.expt_buffer = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest setExpt_flag(int i17) {
        this.expt_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest setExtSpamInfo(com.tencent.mm.protobuf.g gVar) {
        this.extSpamInfo = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest setLiveIdentity(int i17) {
        this.live_identity = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest setLive_identity(int i17) {
        this.live_identity = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest setObjectBaseInfos(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderObjectBaseInfo> linkedList) {
        this.object_base_infos = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest setObject_base_infos(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderObjectBaseInfo> linkedList) {
        this.object_base_infos = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest setRequestId(long j17) {
        this.request_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest setRequest_id(long j17) {
        this.request_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest setScene(int i17) {
        this.scene = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest setUserver(int i17) {
        this.userver = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderBaseRequest parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderBaseRequest) super.parseFrom(bArr);
    }
}
