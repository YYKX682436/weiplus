package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class NewLifeReddotExpose extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.NewLifeReddotExpose DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.NewLifeReddotExpose();
    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo> expose_list = new java.util.LinkedList<>();
    public java.lang.String entrance_tips_id = "";
    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo> wait_for_prefetch_list = new java.util.LinkedList<>();

    public static com.tencent.wechat.aff.newlife.NewLifeReddotExpose create() {
        return new com.tencent.wechat.aff.newlife.NewLifeReddotExpose();
    }

    public static com.tencent.wechat.aff.newlife.NewLifeReddotExpose getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.NewLifeReddotExpose newBuilder() {
        return new com.tencent.wechat.aff.newlife.NewLifeReddotExpose();
    }

    public com.tencent.wechat.aff.newlife.NewLifeReddotExpose addAllElementExposeList(java.util.Collection<com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo> collection) {
        this.expose_list.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeReddotExpose addAllElementExpose_list(java.util.Collection<com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo> collection) {
        this.expose_list.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeReddotExpose addAllElementWaitForPrefetchList(java.util.Collection<com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo> collection) {
        this.wait_for_prefetch_list.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeReddotExpose addAllElementWait_for_prefetch_list(java.util.Collection<com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo> collection) {
        this.wait_for_prefetch_list.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeReddotExpose addElementExposeList(com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo finderRedDotCtrlInfo) {
        this.expose_list.add(finderRedDotCtrlInfo);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeReddotExpose addElementExpose_list(com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo finderRedDotCtrlInfo) {
        this.expose_list.add(finderRedDotCtrlInfo);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeReddotExpose addElementWaitForPrefetchList(com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo finderRedDotCtrlInfo) {
        this.wait_for_prefetch_list.add(finderRedDotCtrlInfo);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeReddotExpose addElementWait_for_prefetch_list(com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo finderRedDotCtrlInfo) {
        this.wait_for_prefetch_list.add(finderRedDotCtrlInfo);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeReddotExpose build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.NewLifeReddotExpose)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.NewLifeReddotExpose newLifeReddotExpose = (com.tencent.wechat.aff.newlife.NewLifeReddotExpose) fVar;
        return n51.f.a(this.expose_list, newLifeReddotExpose.expose_list) && n51.f.a(this.entrance_tips_id, newLifeReddotExpose.entrance_tips_id) && n51.f.a(this.wait_for_prefetch_list, newLifeReddotExpose.wait_for_prefetch_list);
    }

    public java.lang.String getEntranceTipsId() {
        return this.entrance_tips_id;
    }

    public java.lang.String getEntrance_tips_id() {
        return this.entrance_tips_id;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo> getExposeList() {
        return this.expose_list;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo> getExpose_list() {
        return this.expose_list;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo> getWaitForPrefetchList() {
        return this.wait_for_prefetch_list;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo> getWait_for_prefetch_list() {
        return this.wait_for_prefetch_list;
    }

    public com.tencent.wechat.aff.newlife.NewLifeReddotExpose mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.NewLifeReddotExpose();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.expose_list);
            java.lang.String str = this.entrance_tips_id;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, this.wait_for_prefetch_list);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.expose_list) + 0;
            java.lang.String str2 = this.entrance_tips_id;
            if (str2 != null) {
                g17 += b36.f.j(2, str2);
            }
            return g17 + b36.f.g(3, 8, this.wait_for_prefetch_list);
        }
        if (i17 == 2) {
            this.expose_list.clear();
            this.wait_for_prefetch_list.clear();
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
                com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo finderRedDotCtrlInfo = new com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo();
                if (bArr != null && bArr.length > 0) {
                    finderRedDotCtrlInfo.parseFrom(bArr);
                }
                this.expose_list.add(finderRedDotCtrlInfo);
            }
            return 0;
        }
        if (intValue == 2) {
            this.entrance_tips_id = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo finderRedDotCtrlInfo2 = new com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo();
            if (bArr2 != null && bArr2.length > 0) {
                finderRedDotCtrlInfo2.parseFrom(bArr2);
            }
            this.wait_for_prefetch_list.add(finderRedDotCtrlInfo2);
        }
        return 0;
    }

    public com.tencent.wechat.aff.newlife.NewLifeReddotExpose setEntranceTipsId(java.lang.String str) {
        this.entrance_tips_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeReddotExpose setEntrance_tips_id(java.lang.String str) {
        this.entrance_tips_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeReddotExpose setExposeList(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo> linkedList) {
        this.expose_list = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeReddotExpose setExpose_list(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo> linkedList) {
        this.expose_list = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeReddotExpose setWaitForPrefetchList(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo> linkedList) {
        this.wait_for_prefetch_list = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeReddotExpose setWait_for_prefetch_list(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo> linkedList) {
        this.wait_for_prefetch_list = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeReddotExpose mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.NewLifeReddotExpose parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.NewLifeReddotExpose) super.parseFrom(bArr);
    }
}
