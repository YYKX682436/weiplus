package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class NewLifeSyncRequest extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.NewLifeSyncRequest DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.NewLifeSyncRequest();
    public com.tencent.mm.protobuf.g client_ai_info;
    public com.tencent.mm.protobuf.g client_custom_info;
    public com.tencent.wechat.aff.newlife.FinderSyncClientInfo client_info;
    public com.tencent.wechat.aff.newlife.FinderSyncClientStatus client_status;
    public com.tencent.wechat.aff.newlife.EntranceExposeContent entrance_expose_content;
    public com.tencent.mm.protobuf.g last_buffer;
    public float latitude;
    public int lbs_cache_time;
    public float longitude;
    public java.util.LinkedList<java.lang.String> multi_finder_username;
    public com.tencent.mm.protobuf.g reliable_notify_buff;
    public com.tencent.wechat.aff.newlife.BaseRequest BaseRequest = com.tencent.wechat.aff.newlife.BaseRequest.getDefaultInstance();
    public com.tencent.wechat.aff.newlife.FinderBaseRequest finder_basereq = com.tencent.wechat.aff.newlife.FinderBaseRequest.getDefaultInstance();
    public com.tencent.wechat.aff.newlife.SKBuiltinBuffer_t KeyBuf = new com.tencent.wechat.aff.newlife.SKBuiltinBuffer_t();
    public java.lang.String finder_username = "";
    public com.tencent.wechat.aff.newlife.NewLifeReddotExpose new_life_expose = com.tencent.wechat.aff.newlife.NewLifeReddotExpose.getDefaultInstance();

    public NewLifeSyncRequest() {
        com.tencent.mm.protobuf.g gVar = com.tencent.mm.protobuf.g.f192155b;
        this.client_ai_info = gVar;
        this.client_status = com.tencent.wechat.aff.newlife.FinderSyncClientStatus.getDefaultInstance();
        this.multi_finder_username = new java.util.LinkedList<>();
        this.longitude = 0.0f;
        this.latitude = 0.0f;
        this.entrance_expose_content = com.tencent.wechat.aff.newlife.EntranceExposeContent.getDefaultInstance();
        this.last_buffer = gVar;
        this.reliable_notify_buff = gVar;
        this.client_info = com.tencent.wechat.aff.newlife.FinderSyncClientInfo.getDefaultInstance();
        this.lbs_cache_time = 0;
        this.client_custom_info = gVar;
    }

    public static com.tencent.wechat.aff.newlife.NewLifeSyncRequest create() {
        return new com.tencent.wechat.aff.newlife.NewLifeSyncRequest();
    }

    public static com.tencent.wechat.aff.newlife.NewLifeSyncRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.NewLifeSyncRequest newBuilder() {
        return new com.tencent.wechat.aff.newlife.NewLifeSyncRequest();
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest addAllElementMultiFinderUsername(java.util.Collection<java.lang.String> collection) {
        this.multi_finder_username.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest addAllElementMulti_finder_username(java.util.Collection<java.lang.String> collection) {
        this.multi_finder_username.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest addElementMultiFinderUsername(java.lang.String str) {
        this.multi_finder_username.add(str);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest addElementMulti_finder_username(java.lang.String str) {
        this.multi_finder_username.add(str);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.NewLifeSyncRequest)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.NewLifeSyncRequest newLifeSyncRequest = (com.tencent.wechat.aff.newlife.NewLifeSyncRequest) fVar;
        return n51.f.a(this.BaseRequest, newLifeSyncRequest.BaseRequest) && n51.f.a(this.finder_basereq, newLifeSyncRequest.finder_basereq) && n51.f.a(this.KeyBuf, newLifeSyncRequest.KeyBuf) && n51.f.a(this.finder_username, newLifeSyncRequest.finder_username) && n51.f.a(this.new_life_expose, newLifeSyncRequest.new_life_expose) && n51.f.a(this.client_ai_info, newLifeSyncRequest.client_ai_info) && n51.f.a(this.client_status, newLifeSyncRequest.client_status) && n51.f.a(this.multi_finder_username, newLifeSyncRequest.multi_finder_username) && n51.f.a(java.lang.Float.valueOf(this.longitude), java.lang.Float.valueOf(newLifeSyncRequest.longitude)) && n51.f.a(java.lang.Float.valueOf(this.latitude), java.lang.Float.valueOf(newLifeSyncRequest.latitude)) && n51.f.a(this.entrance_expose_content, newLifeSyncRequest.entrance_expose_content) && n51.f.a(this.last_buffer, newLifeSyncRequest.last_buffer) && n51.f.a(this.reliable_notify_buff, newLifeSyncRequest.reliable_notify_buff) && n51.f.a(this.client_info, newLifeSyncRequest.client_info) && n51.f.a(java.lang.Integer.valueOf(this.lbs_cache_time), java.lang.Integer.valueOf(newLifeSyncRequest.lbs_cache_time)) && n51.f.a(this.client_custom_info, newLifeSyncRequest.client_custom_info);
    }

    public com.tencent.wechat.aff.newlife.BaseRequest getBaseRequest() {
        return this.BaseRequest;
    }

    public com.tencent.mm.protobuf.g getClientAiInfo() {
        return this.client_ai_info;
    }

    public com.tencent.mm.protobuf.g getClientCustomInfo() {
        return this.client_custom_info;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncClientInfo getClientInfo() {
        return this.client_info;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncClientStatus getClientStatus() {
        return this.client_status;
    }

    public com.tencent.mm.protobuf.g getClient_ai_info() {
        return this.client_ai_info;
    }

    public com.tencent.mm.protobuf.g getClient_custom_info() {
        return this.client_custom_info;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncClientInfo getClient_info() {
        return this.client_info;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncClientStatus getClient_status() {
        return this.client_status;
    }

    public com.tencent.wechat.aff.newlife.EntranceExposeContent getEntranceExposeContent() {
        return this.entrance_expose_content;
    }

    public com.tencent.wechat.aff.newlife.EntranceExposeContent getEntrance_expose_content() {
        return this.entrance_expose_content;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest getFinderBasereq() {
        return this.finder_basereq;
    }

    public java.lang.String getFinderUsername() {
        return this.finder_username;
    }

    public com.tencent.wechat.aff.newlife.FinderBaseRequest getFinder_basereq() {
        return this.finder_basereq;
    }

    public java.lang.String getFinder_username() {
        return this.finder_username;
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

    public float getLatitude() {
        return this.latitude;
    }

    public int getLbsCacheTime() {
        return this.lbs_cache_time;
    }

    public int getLbs_cache_time() {
        return this.lbs_cache_time;
    }

    public float getLongitude() {
        return this.longitude;
    }

    public java.util.LinkedList<java.lang.String> getMultiFinderUsername() {
        return this.multi_finder_username;
    }

    public java.util.LinkedList<java.lang.String> getMulti_finder_username() {
        return this.multi_finder_username;
    }

    public com.tencent.wechat.aff.newlife.NewLifeReddotExpose getNewLifeExpose() {
        return this.new_life_expose;
    }

    public com.tencent.wechat.aff.newlife.NewLifeReddotExpose getNew_life_expose() {
        return this.new_life_expose;
    }

    public com.tencent.mm.protobuf.g getReliableNotifyBuff() {
        return this.reliable_notify_buff;
    }

    public com.tencent.mm.protobuf.g getReliable_notify_buff() {
        return this.reliable_notify_buff;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.NewLifeSyncRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.newlife.BaseRequest baseRequest = this.BaseRequest;
            if (baseRequest != null) {
                fVar.i(1, baseRequest.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            com.tencent.wechat.aff.newlife.FinderBaseRequest finderBaseRequest = this.finder_basereq;
            if (finderBaseRequest != null) {
                fVar.i(2, finderBaseRequest.computeSize());
                this.finder_basereq.writeFields(fVar);
            }
            com.tencent.wechat.aff.newlife.SKBuiltinBuffer_t sKBuiltinBuffer_t = this.KeyBuf;
            if (sKBuiltinBuffer_t != null) {
                fVar.i(3, sKBuiltinBuffer_t.computeSize());
                this.KeyBuf.writeFields(fVar);
            }
            java.lang.String str = this.finder_username;
            if (str != null) {
                fVar.j(4, str);
            }
            com.tencent.wechat.aff.newlife.NewLifeReddotExpose newLifeReddotExpose = this.new_life_expose;
            if (newLifeReddotExpose != null) {
                fVar.i(5, newLifeReddotExpose.computeSize());
                this.new_life_expose.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.client_ai_info;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            com.tencent.wechat.aff.newlife.FinderSyncClientStatus finderSyncClientStatus = this.client_status;
            if (finderSyncClientStatus != null) {
                fVar.i(7, finderSyncClientStatus.computeSize());
                this.client_status.writeFields(fVar);
            }
            fVar.g(8, 1, this.multi_finder_username);
            fVar.d(9, this.longitude);
            fVar.d(10, this.latitude);
            com.tencent.wechat.aff.newlife.EntranceExposeContent entranceExposeContent = this.entrance_expose_content;
            if (entranceExposeContent != null) {
                fVar.i(11, entranceExposeContent.computeSize());
                this.entrance_expose_content.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.last_buffer;
            if (gVar2 != null) {
                fVar.b(12, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.reliable_notify_buff;
            if (gVar3 != null) {
                fVar.b(13, gVar3);
            }
            com.tencent.wechat.aff.newlife.FinderSyncClientInfo finderSyncClientInfo = this.client_info;
            if (finderSyncClientInfo != null) {
                fVar.i(14, finderSyncClientInfo.computeSize());
                this.client_info.writeFields(fVar);
            }
            fVar.e(15, this.lbs_cache_time);
            com.tencent.mm.protobuf.g gVar4 = this.client_custom_info;
            if (gVar4 != null) {
                fVar.b(16, gVar4);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.newlife.BaseRequest baseRequest2 = this.BaseRequest;
            int i18 = baseRequest2 != null ? b36.f.i(1, baseRequest2.computeSize()) + 0 : 0;
            com.tencent.wechat.aff.newlife.FinderBaseRequest finderBaseRequest2 = this.finder_basereq;
            if (finderBaseRequest2 != null) {
                i18 += b36.f.i(2, finderBaseRequest2.computeSize());
            }
            com.tencent.wechat.aff.newlife.SKBuiltinBuffer_t sKBuiltinBuffer_t2 = this.KeyBuf;
            if (sKBuiltinBuffer_t2 != null) {
                i18 += b36.f.i(3, sKBuiltinBuffer_t2.computeSize());
            }
            java.lang.String str2 = this.finder_username;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            com.tencent.wechat.aff.newlife.NewLifeReddotExpose newLifeReddotExpose2 = this.new_life_expose;
            if (newLifeReddotExpose2 != null) {
                i18 += b36.f.i(5, newLifeReddotExpose2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar5 = this.client_ai_info;
            if (gVar5 != null) {
                i18 += b36.f.b(6, gVar5);
            }
            com.tencent.wechat.aff.newlife.FinderSyncClientStatus finderSyncClientStatus2 = this.client_status;
            if (finderSyncClientStatus2 != null) {
                i18 += b36.f.i(7, finderSyncClientStatus2.computeSize());
            }
            int g17 = i18 + b36.f.g(8, 1, this.multi_finder_username) + b36.f.d(9, this.longitude) + b36.f.d(10, this.latitude);
            com.tencent.wechat.aff.newlife.EntranceExposeContent entranceExposeContent2 = this.entrance_expose_content;
            if (entranceExposeContent2 != null) {
                g17 += b36.f.i(11, entranceExposeContent2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar6 = this.last_buffer;
            if (gVar6 != null) {
                g17 += b36.f.b(12, gVar6);
            }
            com.tencent.mm.protobuf.g gVar7 = this.reliable_notify_buff;
            if (gVar7 != null) {
                g17 += b36.f.b(13, gVar7);
            }
            com.tencent.wechat.aff.newlife.FinderSyncClientInfo finderSyncClientInfo2 = this.client_info;
            if (finderSyncClientInfo2 != null) {
                g17 += b36.f.i(14, finderSyncClientInfo2.computeSize());
            }
            int e17 = g17 + b36.f.e(15, this.lbs_cache_time);
            com.tencent.mm.protobuf.g gVar8 = this.client_custom_info;
            return gVar8 != null ? e17 + b36.f.b(16, gVar8) : e17;
        }
        if (i17 == 2) {
            this.multi_finder_username.clear();
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wechat.aff.newlife.BaseRequest baseRequest3 = new com.tencent.wechat.aff.newlife.BaseRequest();
                    if (bArr != null && bArr.length > 0) {
                        baseRequest3.parseFrom(bArr);
                    }
                    this.BaseRequest = baseRequest3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.wechat.aff.newlife.FinderBaseRequest finderBaseRequest3 = new com.tencent.wechat.aff.newlife.FinderBaseRequest();
                    if (bArr2 != null && bArr2.length > 0) {
                        finderBaseRequest3.parseFrom(bArr2);
                    }
                    this.finder_basereq = finderBaseRequest3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.tencent.wechat.aff.newlife.SKBuiltinBuffer_t sKBuiltinBuffer_t3 = new com.tencent.wechat.aff.newlife.SKBuiltinBuffer_t();
                    if (bArr3 != null && bArr3.length > 0) {
                        sKBuiltinBuffer_t3.parseFrom(bArr3);
                    }
                    this.KeyBuf = sKBuiltinBuffer_t3;
                }
                return 0;
            case 4:
                this.finder_username = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.tencent.wechat.aff.newlife.NewLifeReddotExpose newLifeReddotExpose3 = new com.tencent.wechat.aff.newlife.NewLifeReddotExpose();
                    if (bArr4 != null && bArr4.length > 0) {
                        newLifeReddotExpose3.parseFrom(bArr4);
                    }
                    this.new_life_expose = newLifeReddotExpose3;
                }
                return 0;
            case 6:
                this.client_ai_info = aVar2.d(intValue);
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    com.tencent.wechat.aff.newlife.FinderSyncClientStatus finderSyncClientStatus3 = new com.tencent.wechat.aff.newlife.FinderSyncClientStatus();
                    if (bArr5 != null && bArr5.length > 0) {
                        finderSyncClientStatus3.parseFrom(bArr5);
                    }
                    this.client_status = finderSyncClientStatus3;
                }
                return 0;
            case 8:
                this.multi_finder_username.add(aVar2.k(intValue));
                return 0;
            case 9:
                this.longitude = aVar2.f(intValue);
                return 0;
            case 10:
                this.latitude = aVar2.f(intValue);
                return 0;
            case 11:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    com.tencent.wechat.aff.newlife.EntranceExposeContent entranceExposeContent3 = new com.tencent.wechat.aff.newlife.EntranceExposeContent();
                    if (bArr6 != null && bArr6.length > 0) {
                        entranceExposeContent3.parseFrom(bArr6);
                    }
                    this.entrance_expose_content = entranceExposeContent3;
                }
                return 0;
            case 12:
                this.last_buffer = aVar2.d(intValue);
                return 0;
            case 13:
                this.reliable_notify_buff = aVar2.d(intValue);
                return 0;
            case 14:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    com.tencent.wechat.aff.newlife.FinderSyncClientInfo finderSyncClientInfo3 = new com.tencent.wechat.aff.newlife.FinderSyncClientInfo();
                    if (bArr7 != null && bArr7.length > 0) {
                        finderSyncClientInfo3.parseFrom(bArr7);
                    }
                    this.client_info = finderSyncClientInfo3;
                }
                return 0;
            case 15:
                this.lbs_cache_time = aVar2.g(intValue);
                return 0;
            case 16:
                this.client_custom_info = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setBaseRequest(com.tencent.wechat.aff.newlife.BaseRequest baseRequest) {
        this.BaseRequest = baseRequest;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setClientAiInfo(com.tencent.mm.protobuf.g gVar) {
        this.client_ai_info = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setClientCustomInfo(com.tencent.mm.protobuf.g gVar) {
        this.client_custom_info = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setClientInfo(com.tencent.wechat.aff.newlife.FinderSyncClientInfo finderSyncClientInfo) {
        this.client_info = finderSyncClientInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setClientStatus(com.tencent.wechat.aff.newlife.FinderSyncClientStatus finderSyncClientStatus) {
        this.client_status = finderSyncClientStatus;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setClient_ai_info(com.tencent.mm.protobuf.g gVar) {
        this.client_ai_info = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setClient_custom_info(com.tencent.mm.protobuf.g gVar) {
        this.client_custom_info = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setClient_info(com.tencent.wechat.aff.newlife.FinderSyncClientInfo finderSyncClientInfo) {
        this.client_info = finderSyncClientInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setClient_status(com.tencent.wechat.aff.newlife.FinderSyncClientStatus finderSyncClientStatus) {
        this.client_status = finderSyncClientStatus;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setEntranceExposeContent(com.tencent.wechat.aff.newlife.EntranceExposeContent entranceExposeContent) {
        this.entrance_expose_content = entranceExposeContent;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setEntrance_expose_content(com.tencent.wechat.aff.newlife.EntranceExposeContent entranceExposeContent) {
        this.entrance_expose_content = entranceExposeContent;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setFinderBasereq(com.tencent.wechat.aff.newlife.FinderBaseRequest finderBaseRequest) {
        this.finder_basereq = finderBaseRequest;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setFinderUsername(java.lang.String str) {
        this.finder_username = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setFinder_basereq(com.tencent.wechat.aff.newlife.FinderBaseRequest finderBaseRequest) {
        this.finder_basereq = finderBaseRequest;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setFinder_username(java.lang.String str) {
        this.finder_username = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setKeyBuf(com.tencent.wechat.aff.newlife.SKBuiltinBuffer_t sKBuiltinBuffer_t) {
        this.KeyBuf = sKBuiltinBuffer_t;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setLastBuffer(com.tencent.mm.protobuf.g gVar) {
        this.last_buffer = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setLast_buffer(com.tencent.mm.protobuf.g gVar) {
        this.last_buffer = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setLatitude(float f17) {
        this.latitude = f17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setLbsCacheTime(int i17) {
        this.lbs_cache_time = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setLbs_cache_time(int i17) {
        this.lbs_cache_time = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setLongitude(float f17) {
        this.longitude = f17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setMultiFinderUsername(java.util.LinkedList<java.lang.String> linkedList) {
        this.multi_finder_username = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setMulti_finder_username(java.util.LinkedList<java.lang.String> linkedList) {
        this.multi_finder_username = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setNewLifeExpose(com.tencent.wechat.aff.newlife.NewLifeReddotExpose newLifeReddotExpose) {
        this.new_life_expose = newLifeReddotExpose;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setNew_life_expose(com.tencent.wechat.aff.newlife.NewLifeReddotExpose newLifeReddotExpose) {
        this.new_life_expose = newLifeReddotExpose;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setReliableNotifyBuff(com.tencent.mm.protobuf.g gVar) {
        this.reliable_notify_buff = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest setReliable_notify_buff(com.tencent.mm.protobuf.g gVar) {
        this.reliable_notify_buff = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.NewLifeSyncRequest parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.NewLifeSyncRequest) super.parseFrom(bArr);
    }
}
