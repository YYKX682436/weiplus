package com.tencent.wechat.aff.newlife;

/* loaded from: classes2.dex */
public class FinderBatchGetObjectAsyncLoadInfoRequest extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest();
    public com.tencent.wechat.aff.newlife.BaseRequest baseRequest = com.tencent.wechat.aff.newlife.BaseRequest.getDefaultInstance();
    public com.tencent.wechat.aff.newlife.FinderBaseRequest finder_basereq = com.tencent.wechat.aff.newlife.FinderBaseRequest.getDefaultInstance();
    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderObjectUidUnit> object_uid_list = new java.util.LinkedList<>();
    public int scene = 0;
    public int live_report_scene = 0;
    public int comment_scene = 0;
    public java.lang.String finder_username = "";
    public java.lang.String client_user_agent = "";
    public java.lang.String uxinfo = "";
    public java.util.LinkedList<java.lang.Integer> scenes = new java.util.LinkedList<>();
    public boolean is_refresh = false;
    public int trigger_scene = 0;
    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation user_location = com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation.getDefaultInstance();

    /* loaded from: classes2.dex */
    public static class UserLocation extends com.tencent.mm.protobuf.f {
        private static final com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation();
        public float longitude = 0.0f;
        public float latitude = 0.0f;

        public static com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation create() {
            return new com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation();
        }

        public static com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation newBuilder() {
            return new com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation();
        }

        public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation build() {
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
            if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation)) {
                return false;
            }
            com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation userLocation = (com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation) fVar;
            return n51.f.a(java.lang.Float.valueOf(this.longitude), java.lang.Float.valueOf(userLocation.longitude)) && n51.f.a(java.lang.Float.valueOf(this.latitude), java.lang.Float.valueOf(userLocation.latitude));
        }

        public float getLatitude() {
            return this.latitude;
        }

        public float getLongitude() {
            return this.longitude;
        }

        public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation mergeFrom(com.tencent.mm.protobuf.f fVar) {
            parseFrom(fVar.getData());
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mm.protobuf.f newInstance() {
            return new com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation();
        }

        @Override // com.tencent.mm.protobuf.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                fVar.d(1, this.longitude);
                fVar.d(2, this.latitude);
                return 0;
            }
            if (i17 == 1) {
                return b36.f.d(1, this.longitude) + 0 + b36.f.d(2, this.latitude);
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
                this.longitude = aVar2.f(intValue);
                return 0;
            }
            if (intValue != 2) {
                return -1;
            }
            this.latitude = aVar2.f(intValue);
            return 0;
        }

        public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation setLatitude(float f17) {
            this.latitude = f17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation setLongitude(float f17) {
            this.longitude = f17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation mergeFrom(byte[] bArr) {
            parseFrom(bArr);
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation parseFrom(byte[] bArr) {
            return (com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation) super.parseFrom(bArr);
        }
    }

    public static com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest create() {
        return new com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest();
    }

    public static com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest();
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest addAllElementObjectUidList(java.util.Collection<com.tencent.wechat.aff.newlife.FinderObjectUidUnit> collection) {
        this.object_uid_list.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest addAllElementObject_uid_list(java.util.Collection<com.tencent.wechat.aff.newlife.FinderObjectUidUnit> collection) {
        this.object_uid_list.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest addAllElementScenes(java.util.Collection<java.lang.Integer> collection) {
        this.scenes.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest addElementObjectUidList(com.tencent.wechat.aff.newlife.FinderObjectUidUnit finderObjectUidUnit) {
        this.object_uid_list.add(finderObjectUidUnit);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest addElementObject_uid_list(com.tencent.wechat.aff.newlife.FinderObjectUidUnit finderObjectUidUnit) {
        this.object_uid_list.add(finderObjectUidUnit);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest addElementScenes(int i17) {
        this.scenes.add(java.lang.Integer.valueOf(i17));
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest finderBatchGetObjectAsyncLoadInfoRequest = (com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest) fVar;
        return n51.f.a(this.baseRequest, finderBatchGetObjectAsyncLoadInfoRequest.baseRequest) && n51.f.a(this.finder_basereq, finderBatchGetObjectAsyncLoadInfoRequest.finder_basereq) && n51.f.a(this.object_uid_list, finderBatchGetObjectAsyncLoadInfoRequest.object_uid_list) && n51.f.a(java.lang.Integer.valueOf(this.scene), java.lang.Integer.valueOf(finderBatchGetObjectAsyncLoadInfoRequest.scene)) && n51.f.a(java.lang.Integer.valueOf(this.live_report_scene), java.lang.Integer.valueOf(finderBatchGetObjectAsyncLoadInfoRequest.live_report_scene)) && n51.f.a(java.lang.Integer.valueOf(this.comment_scene), java.lang.Integer.valueOf(finderBatchGetObjectAsyncLoadInfoRequest.comment_scene)) && n51.f.a(this.finder_username, finderBatchGetObjectAsyncLoadInfoRequest.finder_username) && n51.f.a(this.client_user_agent, finderBatchGetObjectAsyncLoadInfoRequest.client_user_agent) && n51.f.a(this.uxinfo, finderBatchGetObjectAsyncLoadInfoRequest.uxinfo) && n51.f.a(this.scenes, finderBatchGetObjectAsyncLoadInfoRequest.scenes) && n51.f.a(java.lang.Boolean.valueOf(this.is_refresh), java.lang.Boolean.valueOf(finderBatchGetObjectAsyncLoadInfoRequest.is_refresh)) && n51.f.a(java.lang.Integer.valueOf(this.trigger_scene), java.lang.Integer.valueOf(finderBatchGetObjectAsyncLoadInfoRequest.trigger_scene)) && n51.f.a(this.user_location, finderBatchGetObjectAsyncLoadInfoRequest.user_location);
    }

    public com.tencent.wechat.aff.newlife.BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public java.lang.String getClientUserAgent() {
        return this.client_user_agent;
    }

    public java.lang.String getClient_user_agent() {
        return this.client_user_agent;
    }

    public int getCommentScene() {
        return this.comment_scene;
    }

    public int getComment_scene() {
        return this.comment_scene;
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

    public boolean getIsRefresh() {
        return this.is_refresh;
    }

    public boolean getIs_refresh() {
        return this.is_refresh;
    }

    public int getLiveReportScene() {
        return this.live_report_scene;
    }

    public int getLive_report_scene() {
        return this.live_report_scene;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderObjectUidUnit> getObjectUidList() {
        return this.object_uid_list;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderObjectUidUnit> getObject_uid_list() {
        return this.object_uid_list;
    }

    public int getScene() {
        return this.scene;
    }

    public java.util.LinkedList<java.lang.Integer> getScenes() {
        return this.scenes;
    }

    public int getTriggerScene() {
        return this.trigger_scene;
    }

    public int getTrigger_scene() {
        return this.trigger_scene;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation getUserLocation() {
        return this.user_location;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation getUser_location() {
        return this.user_location;
    }

    public java.lang.String getUxinfo() {
        return this.uxinfo;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.newlife.BaseRequest baseRequest = this.baseRequest;
            if (baseRequest != null) {
                fVar.i(1, baseRequest.computeSize());
                this.baseRequest.writeFields(fVar);
            }
            com.tencent.wechat.aff.newlife.FinderBaseRequest finderBaseRequest = this.finder_basereq;
            if (finderBaseRequest != null) {
                fVar.i(2, finderBaseRequest.computeSize());
                this.finder_basereq.writeFields(fVar);
            }
            fVar.g(3, 8, this.object_uid_list);
            fVar.e(4, this.scene);
            fVar.e(5, this.live_report_scene);
            fVar.e(6, this.comment_scene);
            java.lang.String str = this.finder_username;
            if (str != null) {
                fVar.j(7, str);
            }
            java.lang.String str2 = this.client_user_agent;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            java.lang.String str3 = this.uxinfo;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.g(10, 2, this.scenes);
            fVar.a(11, this.is_refresh);
            fVar.e(12, this.trigger_scene);
            com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation userLocation = this.user_location;
            if (userLocation == null) {
                return 0;
            }
            fVar.i(13, userLocation.computeSize());
            this.user_location.writeFields(fVar);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.newlife.BaseRequest baseRequest2 = this.baseRequest;
            int i18 = baseRequest2 != null ? 0 + b36.f.i(1, baseRequest2.computeSize()) : 0;
            com.tencent.wechat.aff.newlife.FinderBaseRequest finderBaseRequest2 = this.finder_basereq;
            if (finderBaseRequest2 != null) {
                i18 += b36.f.i(2, finderBaseRequest2.computeSize());
            }
            int g17 = i18 + b36.f.g(3, 8, this.object_uid_list) + b36.f.e(4, this.scene) + b36.f.e(5, this.live_report_scene) + b36.f.e(6, this.comment_scene);
            java.lang.String str4 = this.finder_username;
            if (str4 != null) {
                g17 += b36.f.j(7, str4);
            }
            java.lang.String str5 = this.client_user_agent;
            if (str5 != null) {
                g17 += b36.f.j(8, str5);
            }
            java.lang.String str6 = this.uxinfo;
            if (str6 != null) {
                g17 += b36.f.j(9, str6);
            }
            int g18 = g17 + b36.f.g(10, 2, this.scenes) + b36.f.a(11, this.is_refresh) + b36.f.e(12, this.trigger_scene);
            com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation userLocation2 = this.user_location;
            return userLocation2 != null ? g18 + b36.f.i(13, userLocation2.computeSize()) : g18;
        }
        if (i17 == 2) {
            this.object_uid_list.clear();
            this.scenes.clear();
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
                    this.baseRequest = baseRequest3;
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
                    com.tencent.wechat.aff.newlife.FinderObjectUidUnit finderObjectUidUnit = new com.tencent.wechat.aff.newlife.FinderObjectUidUnit();
                    if (bArr3 != null && bArr3.length > 0) {
                        finderObjectUidUnit.parseFrom(bArr3);
                    }
                    this.object_uid_list.add(finderObjectUidUnit);
                }
                return 0;
            case 4:
                this.scene = aVar2.g(intValue);
                return 0;
            case 5:
                this.live_report_scene = aVar2.g(intValue);
                return 0;
            case 6:
                this.comment_scene = aVar2.g(intValue);
                return 0;
            case 7:
                this.finder_username = aVar2.k(intValue);
                return 0;
            case 8:
                this.client_user_agent = aVar2.k(intValue);
                return 0;
            case 9:
                this.uxinfo = aVar2.k(intValue);
                return 0;
            case 10:
                this.scenes.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 11:
                this.is_refresh = aVar2.c(intValue);
                return 0;
            case 12:
                this.trigger_scene = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation userLocation3 = new com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation();
                    if (bArr4 != null && bArr4.length > 0) {
                        userLocation3.parseFrom(bArr4);
                    }
                    this.user_location = userLocation3;
                }
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest setBaseRequest(com.tencent.wechat.aff.newlife.BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest setClientUserAgent(java.lang.String str) {
        this.client_user_agent = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest setClient_user_agent(java.lang.String str) {
        this.client_user_agent = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest setCommentScene(int i17) {
        this.comment_scene = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest setComment_scene(int i17) {
        this.comment_scene = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest setFinderBasereq(com.tencent.wechat.aff.newlife.FinderBaseRequest finderBaseRequest) {
        this.finder_basereq = finderBaseRequest;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest setFinderUsername(java.lang.String str) {
        this.finder_username = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest setFinder_basereq(com.tencent.wechat.aff.newlife.FinderBaseRequest finderBaseRequest) {
        this.finder_basereq = finderBaseRequest;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest setFinder_username(java.lang.String str) {
        this.finder_username = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest setIsRefresh(boolean z17) {
        this.is_refresh = z17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest setIs_refresh(boolean z17) {
        this.is_refresh = z17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest setLiveReportScene(int i17) {
        this.live_report_scene = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest setLive_report_scene(int i17) {
        this.live_report_scene = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest setObjectUidList(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderObjectUidUnit> linkedList) {
        this.object_uid_list = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest setObject_uid_list(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderObjectUidUnit> linkedList) {
        this.object_uid_list = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest setScene(int i17) {
        this.scene = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest setScenes(java.util.LinkedList<java.lang.Integer> linkedList) {
        this.scenes = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest setTriggerScene(int i17) {
        this.trigger_scene = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest setTrigger_scene(int i17) {
        this.trigger_scene = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest setUserLocation(com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation userLocation) {
        this.user_location = userLocation;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest setUser_location(com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest.UserLocation userLocation) {
        this.user_location = userLocation;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest setUxinfo(java.lang.String str) {
        this.uxinfo = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest) super.parseFrom(bArr);
    }
}
