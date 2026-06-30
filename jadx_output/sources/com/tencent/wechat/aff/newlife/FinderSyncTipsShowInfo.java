package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class FinderSyncTipsShowInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo();
    public int show_reddot = 0;
    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo show_info = com.tencent.wechat.aff.newlife.FinderTipsShowInfo.getDefaultInstance();
    public int show_seconds = 0;
    public long tab_tips_object_id = 0;
    public java.lang.String tips_id = "";

    public static com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo create() {
        return new com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo();
    }

    public static com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo();
    }

    public com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo finderSyncTipsShowInfo = (com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.show_reddot), java.lang.Integer.valueOf(finderSyncTipsShowInfo.show_reddot)) && n51.f.a(this.show_info, finderSyncTipsShowInfo.show_info) && n51.f.a(java.lang.Integer.valueOf(this.show_seconds), java.lang.Integer.valueOf(finderSyncTipsShowInfo.show_seconds)) && n51.f.a(java.lang.Long.valueOf(this.tab_tips_object_id), java.lang.Long.valueOf(finderSyncTipsShowInfo.tab_tips_object_id)) && n51.f.a(this.tips_id, finderSyncTipsShowInfo.tips_id);
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo getShowInfo() {
        return this.show_info;
    }

    public int getShowReddot() {
        return this.show_reddot;
    }

    public int getShowSeconds() {
        return this.show_seconds;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo getShow_info() {
        return this.show_info;
    }

    public int getShow_reddot() {
        return this.show_reddot;
    }

    public int getShow_seconds() {
        return this.show_seconds;
    }

    public long getTabTipsObjectId() {
        return this.tab_tips_object_id;
    }

    public long getTab_tips_object_id() {
        return this.tab_tips_object_id;
    }

    public java.lang.String getTipsId() {
        return this.tips_id;
    }

    public java.lang.String getTips_id() {
        return this.tips_id;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.show_reddot);
            com.tencent.wechat.aff.newlife.FinderTipsShowInfo finderTipsShowInfo = this.show_info;
            if (finderTipsShowInfo != null) {
                fVar.i(2, finderTipsShowInfo.computeSize());
                this.show_info.writeFields(fVar);
            }
            fVar.e(3, this.show_seconds);
            fVar.h(4, this.tab_tips_object_id);
            java.lang.String str = this.tips_id;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.show_reddot) + 0;
            com.tencent.wechat.aff.newlife.FinderTipsShowInfo finderTipsShowInfo2 = this.show_info;
            if (finderTipsShowInfo2 != null) {
                e17 += b36.f.i(2, finderTipsShowInfo2.computeSize());
            }
            int e18 = e17 + b36.f.e(3, this.show_seconds) + b36.f.h(4, this.tab_tips_object_id);
            java.lang.String str2 = this.tips_id;
            return str2 != null ? e18 + b36.f.j(5, str2) : e18;
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
            this.show_reddot = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.show_seconds = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 4) {
                this.tab_tips_object_id = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.tips_id = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.aff.newlife.FinderTipsShowInfo finderTipsShowInfo3 = new com.tencent.wechat.aff.newlife.FinderTipsShowInfo();
            if (bArr != null && bArr.length > 0) {
                finderTipsShowInfo3.parseFrom(bArr);
            }
            this.show_info = finderTipsShowInfo3;
        }
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo setShowInfo(com.tencent.wechat.aff.newlife.FinderTipsShowInfo finderTipsShowInfo) {
        this.show_info = finderTipsShowInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo setShowReddot(int i17) {
        this.show_reddot = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo setShowSeconds(int i17) {
        this.show_seconds = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo setShow_info(com.tencent.wechat.aff.newlife.FinderTipsShowInfo finderTipsShowInfo) {
        this.show_info = finderTipsShowInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo setShow_reddot(int i17) {
        this.show_reddot = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo setShow_seconds(int i17) {
        this.show_seconds = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo setTabTipsObjectId(long j17) {
        this.tab_tips_object_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo setTab_tips_object_id(long j17) {
        this.tab_tips_object_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo setTipsId(java.lang.String str) {
        this.tips_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo setTips_id(java.lang.String str) {
        this.tips_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderSyncTipsShowInfo) super.parseFrom(bArr);
    }
}
