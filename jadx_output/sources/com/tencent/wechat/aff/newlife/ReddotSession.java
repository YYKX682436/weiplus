package com.tencent.wechat.aff.newlife;

/* loaded from: classes2.dex */
public class ReddotSession extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.ReddotSession DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.ReddotSession();
    public int report_scene = 0;
    public java.lang.String context_id = "";
    public com.tencent.wechat.aff.newlife.ReddotInfo left_reddot_info = com.tencent.wechat.aff.newlife.ReddotInfo.getDefaultInstance();
    public com.tencent.wechat.aff.newlife.ReddotInfo right_reddot_info = com.tencent.wechat.aff.newlife.ReddotInfo.getDefaultInstance();
    public int session_interval = 0;
    public java.lang.String session_id = "";
    public java.util.LinkedList<com.tencent.wechat.aff.newlife.ReddotInfo> left_reddot_info_list = new java.util.LinkedList<>();
    public java.util.LinkedList<com.tencent.wechat.aff.newlife.ReddotInfo> right_reddot_info_list = new java.util.LinkedList<>();

    public static com.tencent.wechat.aff.newlife.ReddotSession create() {
        return new com.tencent.wechat.aff.newlife.ReddotSession();
    }

    public static com.tencent.wechat.aff.newlife.ReddotSession getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.ReddotSession newBuilder() {
        return new com.tencent.wechat.aff.newlife.ReddotSession();
    }

    public com.tencent.wechat.aff.newlife.ReddotSession addAllElementLeftReddotInfoList(java.util.Collection<com.tencent.wechat.aff.newlife.ReddotInfo> collection) {
        this.left_reddot_info_list.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession addAllElementLeft_reddot_info_list(java.util.Collection<com.tencent.wechat.aff.newlife.ReddotInfo> collection) {
        this.left_reddot_info_list.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession addAllElementRightReddotInfoList(java.util.Collection<com.tencent.wechat.aff.newlife.ReddotInfo> collection) {
        this.right_reddot_info_list.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession addAllElementRight_reddot_info_list(java.util.Collection<com.tencent.wechat.aff.newlife.ReddotInfo> collection) {
        this.right_reddot_info_list.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession addElementLeftReddotInfoList(com.tencent.wechat.aff.newlife.ReddotInfo reddotInfo) {
        this.left_reddot_info_list.add(reddotInfo);
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession addElementLeft_reddot_info_list(com.tencent.wechat.aff.newlife.ReddotInfo reddotInfo) {
        this.left_reddot_info_list.add(reddotInfo);
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession addElementRightReddotInfoList(com.tencent.wechat.aff.newlife.ReddotInfo reddotInfo) {
        this.right_reddot_info_list.add(reddotInfo);
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession addElementRight_reddot_info_list(com.tencent.wechat.aff.newlife.ReddotInfo reddotInfo) {
        this.right_reddot_info_list.add(reddotInfo);
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.ReddotSession)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.ReddotSession reddotSession = (com.tencent.wechat.aff.newlife.ReddotSession) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.report_scene), java.lang.Integer.valueOf(reddotSession.report_scene)) && n51.f.a(this.context_id, reddotSession.context_id) && n51.f.a(this.left_reddot_info, reddotSession.left_reddot_info) && n51.f.a(this.right_reddot_info, reddotSession.right_reddot_info) && n51.f.a(java.lang.Integer.valueOf(this.session_interval), java.lang.Integer.valueOf(reddotSession.session_interval)) && n51.f.a(this.session_id, reddotSession.session_id) && n51.f.a(this.left_reddot_info_list, reddotSession.left_reddot_info_list) && n51.f.a(this.right_reddot_info_list, reddotSession.right_reddot_info_list);
    }

    public java.lang.String getContextId() {
        return this.context_id;
    }

    public java.lang.String getContext_id() {
        return this.context_id;
    }

    public com.tencent.wechat.aff.newlife.ReddotInfo getLeftReddotInfo() {
        return this.left_reddot_info;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.ReddotInfo> getLeftReddotInfoList() {
        return this.left_reddot_info_list;
    }

    public com.tencent.wechat.aff.newlife.ReddotInfo getLeft_reddot_info() {
        return this.left_reddot_info;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.ReddotInfo> getLeft_reddot_info_list() {
        return this.left_reddot_info_list;
    }

    public int getReportScene() {
        return this.report_scene;
    }

    public int getReport_scene() {
        return this.report_scene;
    }

    public com.tencent.wechat.aff.newlife.ReddotInfo getRightReddotInfo() {
        return this.right_reddot_info;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.ReddotInfo> getRightReddotInfoList() {
        return this.right_reddot_info_list;
    }

    public com.tencent.wechat.aff.newlife.ReddotInfo getRight_reddot_info() {
        return this.right_reddot_info;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.ReddotInfo> getRight_reddot_info_list() {
        return this.right_reddot_info_list;
    }

    public java.lang.String getSessionId() {
        return this.session_id;
    }

    public int getSessionInterval() {
        return this.session_interval;
    }

    public java.lang.String getSession_id() {
        return this.session_id;
    }

    public int getSession_interval() {
        return this.session_interval;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.ReddotSession();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.report_scene);
            java.lang.String str = this.context_id;
            if (str != null) {
                fVar.j(2, str);
            }
            com.tencent.wechat.aff.newlife.ReddotInfo reddotInfo = this.left_reddot_info;
            if (reddotInfo != null) {
                fVar.i(3, reddotInfo.computeSize());
                this.left_reddot_info.writeFields(fVar);
            }
            com.tencent.wechat.aff.newlife.ReddotInfo reddotInfo2 = this.right_reddot_info;
            if (reddotInfo2 != null) {
                fVar.i(4, reddotInfo2.computeSize());
                this.right_reddot_info.writeFields(fVar);
            }
            fVar.e(5, this.session_interval);
            java.lang.String str2 = this.session_id;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.g(7, 8, this.left_reddot_info_list);
            fVar.g(8, 8, this.right_reddot_info_list);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.report_scene) + 0;
            java.lang.String str3 = this.context_id;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            com.tencent.wechat.aff.newlife.ReddotInfo reddotInfo3 = this.left_reddot_info;
            if (reddotInfo3 != null) {
                e17 += b36.f.i(3, reddotInfo3.computeSize());
            }
            com.tencent.wechat.aff.newlife.ReddotInfo reddotInfo4 = this.right_reddot_info;
            if (reddotInfo4 != null) {
                e17 += b36.f.i(4, reddotInfo4.computeSize());
            }
            int e18 = e17 + b36.f.e(5, this.session_interval);
            java.lang.String str4 = this.session_id;
            if (str4 != null) {
                e18 += b36.f.j(6, str4);
            }
            return e18 + b36.f.g(7, 8, this.left_reddot_info_list) + b36.f.g(8, 8, this.right_reddot_info_list);
        }
        if (i17 == 2) {
            this.left_reddot_info_list.clear();
            this.right_reddot_info_list.clear();
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
                this.report_scene = aVar2.g(intValue);
                return 0;
            case 2:
                this.context_id = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.aff.newlife.ReddotInfo reddotInfo5 = new com.tencent.wechat.aff.newlife.ReddotInfo();
                    if (bArr != null && bArr.length > 0) {
                        reddotInfo5.parseFrom(bArr);
                    }
                    this.left_reddot_info = reddotInfo5;
                }
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.tencent.wechat.aff.newlife.ReddotInfo reddotInfo6 = new com.tencent.wechat.aff.newlife.ReddotInfo();
                    if (bArr2 != null && bArr2.length > 0) {
                        reddotInfo6.parseFrom(bArr2);
                    }
                    this.right_reddot_info = reddotInfo6;
                }
                return 0;
            case 5:
                this.session_interval = aVar2.g(intValue);
                return 0;
            case 6:
                this.session_id = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.tencent.wechat.aff.newlife.ReddotInfo reddotInfo7 = new com.tencent.wechat.aff.newlife.ReddotInfo();
                    if (bArr3 != null && bArr3.length > 0) {
                        reddotInfo7.parseFrom(bArr3);
                    }
                    this.left_reddot_info_list.add(reddotInfo7);
                }
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    com.tencent.wechat.aff.newlife.ReddotInfo reddotInfo8 = new com.tencent.wechat.aff.newlife.ReddotInfo();
                    if (bArr4 != null && bArr4.length > 0) {
                        reddotInfo8.parseFrom(bArr4);
                    }
                    this.right_reddot_info_list.add(reddotInfo8);
                }
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.newlife.ReddotSession setContextId(java.lang.String str) {
        this.context_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession setContext_id(java.lang.String str) {
        this.context_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession setLeftReddotInfo(com.tencent.wechat.aff.newlife.ReddotInfo reddotInfo) {
        this.left_reddot_info = reddotInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession setLeftReddotInfoList(java.util.LinkedList<com.tencent.wechat.aff.newlife.ReddotInfo> linkedList) {
        this.left_reddot_info_list = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession setLeft_reddot_info(com.tencent.wechat.aff.newlife.ReddotInfo reddotInfo) {
        this.left_reddot_info = reddotInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession setLeft_reddot_info_list(java.util.LinkedList<com.tencent.wechat.aff.newlife.ReddotInfo> linkedList) {
        this.left_reddot_info_list = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession setReportScene(int i17) {
        this.report_scene = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession setReport_scene(int i17) {
        this.report_scene = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession setRightReddotInfo(com.tencent.wechat.aff.newlife.ReddotInfo reddotInfo) {
        this.right_reddot_info = reddotInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession setRightReddotInfoList(java.util.LinkedList<com.tencent.wechat.aff.newlife.ReddotInfo> linkedList) {
        this.right_reddot_info_list = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession setRight_reddot_info(com.tencent.wechat.aff.newlife.ReddotInfo reddotInfo) {
        this.right_reddot_info = reddotInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession setRight_reddot_info_list(java.util.LinkedList<com.tencent.wechat.aff.newlife.ReddotInfo> linkedList) {
        this.right_reddot_info_list = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession setSessionId(java.lang.String str) {
        this.session_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession setSessionInterval(int i17) {
        this.session_interval = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession setSession_id(java.lang.String str) {
        this.session_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession setSession_interval(int i17) {
        this.session_interval = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.ReddotSession mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.ReddotSession parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.ReddotSession) super.parseFrom(bArr);
    }
}
