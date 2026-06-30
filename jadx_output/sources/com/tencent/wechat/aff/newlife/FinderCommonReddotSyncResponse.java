package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class FinderCommonReddotSyncResponse extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse();
    public com.tencent.wechat.aff.newlife.BaseResponse BaseResponse = com.tencent.wechat.aff.newlife.BaseResponse.getDefaultInstance();
    public int ContinueFlag = 0;
    public com.tencent.wechat.aff.newlife.SKBuiltinBuffer_t KeyBuf = new com.tencent.wechat.aff.newlife.SKBuiltinBuffer_t();
    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderCmdItem> CmdList = new java.util.LinkedList<>();
    public com.tencent.wechat.aff.newlife.EntranceReportSwitch entrance_expose_switch = com.tencent.wechat.aff.newlife.EntranceReportSwitch.getDefaultInstance();
    public com.tencent.mm.protobuf.g last_buffer = com.tencent.mm.protobuf.g.f192155b;

    public static com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse create() {
        return new com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse();
    }

    public static com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse();
    }

    public com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse addAllElementCmdList(java.util.Collection<com.tencent.wechat.aff.newlife.FinderCmdItem> collection) {
        this.CmdList.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse addElementCmdList(com.tencent.wechat.aff.newlife.FinderCmdItem finderCmdItem) {
        this.CmdList.add(finderCmdItem);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse finderCommonReddotSyncResponse = (com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse) fVar;
        return n51.f.a(this.BaseResponse, finderCommonReddotSyncResponse.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.ContinueFlag), java.lang.Integer.valueOf(finderCommonReddotSyncResponse.ContinueFlag)) && n51.f.a(this.KeyBuf, finderCommonReddotSyncResponse.KeyBuf) && n51.f.a(this.CmdList, finderCommonReddotSyncResponse.CmdList) && n51.f.a(this.entrance_expose_switch, finderCommonReddotSyncResponse.entrance_expose_switch) && n51.f.a(this.last_buffer, finderCommonReddotSyncResponse.last_buffer);
    }

    public com.tencent.wechat.aff.newlife.BaseResponse getBaseResponse() {
        return this.BaseResponse;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderCmdItem> getCmdList() {
        return this.CmdList;
    }

    public int getContinueFlag() {
        return this.ContinueFlag;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch getEntranceExposeSwitch() {
        return this.entrance_expose_switch;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch getEntrance_expose_switch() {
        return this.entrance_expose_switch;
    }

    public com.tencent.wechat.aff.newlife.SKBuiltinBuffer_t getKeyBuf() {
        return this.KeyBuf;
    }

    public com.tencent.mm.protobuf.g getLastBuffer() {
        return this.last_buffer;
    }

    public com.tencent.mm.protobuf.g getLast_buffer() {
        return this.last_buffer;
    }

    public com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.newlife.BaseResponse baseResponse = this.BaseResponse;
            if (baseResponse != null) {
                fVar.i(1, baseResponse.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(3, this.ContinueFlag);
            com.tencent.wechat.aff.newlife.SKBuiltinBuffer_t sKBuiltinBuffer_t = this.KeyBuf;
            if (sKBuiltinBuffer_t != null) {
                fVar.i(4, sKBuiltinBuffer_t.computeSize());
                this.KeyBuf.writeFields(fVar);
            }
            fVar.g(5, 8, this.CmdList);
            com.tencent.wechat.aff.newlife.EntranceReportSwitch entranceReportSwitch = this.entrance_expose_switch;
            if (entranceReportSwitch != null) {
                fVar.i(6, entranceReportSwitch.computeSize());
                this.entrance_expose_switch.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.last_buffer;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.newlife.BaseResponse baseResponse2 = this.BaseResponse;
            int i18 = (baseResponse2 != null ? 0 + b36.f.i(1, baseResponse2.computeSize()) : 0) + b36.f.e(3, this.ContinueFlag);
            com.tencent.wechat.aff.newlife.SKBuiltinBuffer_t sKBuiltinBuffer_t2 = this.KeyBuf;
            if (sKBuiltinBuffer_t2 != null) {
                i18 += b36.f.i(4, sKBuiltinBuffer_t2.computeSize());
            }
            int g17 = i18 + b36.f.g(5, 8, this.CmdList);
            com.tencent.wechat.aff.newlife.EntranceReportSwitch entranceReportSwitch2 = this.entrance_expose_switch;
            if (entranceReportSwitch2 != null) {
                g17 += b36.f.i(6, entranceReportSwitch2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.last_buffer;
            return gVar2 != null ? g17 + b36.f.b(7, gVar2) : g17;
        }
        if (i17 == 2) {
            this.CmdList.clear();
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
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.tencent.wechat.aff.newlife.BaseResponse baseResponse3 = new com.tencent.wechat.aff.newlife.BaseResponse();
                if (bArr != null && bArr.length > 0) {
                    baseResponse3.parseFrom(bArr);
                }
                this.BaseResponse = baseResponse3;
            }
            return 0;
        }
        if (intValue == 3) {
            this.ContinueFlag = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.tencent.wechat.aff.newlife.SKBuiltinBuffer_t sKBuiltinBuffer_t3 = new com.tencent.wechat.aff.newlife.SKBuiltinBuffer_t();
                if (bArr2 != null && bArr2.length > 0) {
                    sKBuiltinBuffer_t3.parseFrom(bArr2);
                }
                this.KeyBuf = sKBuiltinBuffer_t3;
            }
            return 0;
        }
        if (intValue == 5) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                com.tencent.wechat.aff.newlife.FinderCmdItem finderCmdItem = new com.tencent.wechat.aff.newlife.FinderCmdItem();
                if (bArr3 != null && bArr3.length > 0) {
                    finderCmdItem.parseFrom(bArr3);
                }
                this.CmdList.add(finderCmdItem);
            }
            return 0;
        }
        if (intValue != 6) {
            if (intValue != 7) {
                return -1;
            }
            this.last_buffer = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            com.tencent.wechat.aff.newlife.EntranceReportSwitch entranceReportSwitch3 = new com.tencent.wechat.aff.newlife.EntranceReportSwitch();
            if (bArr4 != null && bArr4.length > 0) {
                entranceReportSwitch3.parseFrom(bArr4);
            }
            this.entrance_expose_switch = entranceReportSwitch3;
        }
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse setBaseResponse(com.tencent.wechat.aff.newlife.BaseResponse baseResponse) {
        this.BaseResponse = baseResponse;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse setCmdList(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderCmdItem> linkedList) {
        this.CmdList = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse setContinueFlag(int i17) {
        this.ContinueFlag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse setEntranceExposeSwitch(com.tencent.wechat.aff.newlife.EntranceReportSwitch entranceReportSwitch) {
        this.entrance_expose_switch = entranceReportSwitch;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse setEntrance_expose_switch(com.tencent.wechat.aff.newlife.EntranceReportSwitch entranceReportSwitch) {
        this.entrance_expose_switch = entranceReportSwitch;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse setKeyBuf(com.tencent.wechat.aff.newlife.SKBuiltinBuffer_t sKBuiltinBuffer_t) {
        this.KeyBuf = sKBuiltinBuffer_t;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse setLastBuffer(com.tencent.mm.protobuf.g gVar) {
        this.last_buffer = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse setLast_buffer(com.tencent.mm.protobuf.g gVar) {
        this.last_buffer = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse) super.parseFrom(bArr);
    }
}
