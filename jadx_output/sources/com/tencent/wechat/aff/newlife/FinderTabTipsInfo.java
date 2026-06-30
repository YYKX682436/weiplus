package com.tencent.wechat.aff.newlife;

/* loaded from: classes2.dex */
public class FinderTabTipsInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderTabTipsInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderTabTipsInfo();
    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo ctrl_info = com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo.getDefaultInstance();
    public long object_id = 0;
    public java.lang.String object_nonce_id = "";
    public int display_tab_type = 0;

    public static com.tencent.wechat.aff.newlife.FinderTabTipsInfo create() {
        return new com.tencent.wechat.aff.newlife.FinderTabTipsInfo();
    }

    public static com.tencent.wechat.aff.newlife.FinderTabTipsInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderTabTipsInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderTabTipsInfo();
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderTabTipsInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderTabTipsInfo finderTabTipsInfo = (com.tencent.wechat.aff.newlife.FinderTabTipsInfo) fVar;
        return n51.f.a(this.ctrl_info, finderTabTipsInfo.ctrl_info) && n51.f.a(java.lang.Long.valueOf(this.object_id), java.lang.Long.valueOf(finderTabTipsInfo.object_id)) && n51.f.a(this.object_nonce_id, finderTabTipsInfo.object_nonce_id) && n51.f.a(java.lang.Integer.valueOf(this.display_tab_type), java.lang.Integer.valueOf(finderTabTipsInfo.display_tab_type));
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo getCtrlInfo() {
        return this.ctrl_info;
    }

    public com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo getCtrl_info() {
        return this.ctrl_info;
    }

    public int getDisplayTabType() {
        return this.display_tab_type;
    }

    public int getDisplay_tab_type() {
        return this.display_tab_type;
    }

    public long getObjectId() {
        return this.object_id;
    }

    public java.lang.String getObjectNonceId() {
        return this.object_nonce_id;
    }

    public long getObject_id() {
        return this.object_id;
    }

    public java.lang.String getObject_nonce_id() {
        return this.object_nonce_id;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderTabTipsInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo finderRedDotCtrlInfo = this.ctrl_info;
            if (finderRedDotCtrlInfo != null) {
                fVar.i(1, finderRedDotCtrlInfo.computeSize());
                this.ctrl_info.writeFields(fVar);
            }
            fVar.h(2, this.object_id);
            java.lang.String str = this.object_nonce_id;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.display_tab_type);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo finderRedDotCtrlInfo2 = this.ctrl_info;
            int i18 = (finderRedDotCtrlInfo2 != null ? 0 + b36.f.i(1, finderRedDotCtrlInfo2.computeSize()) : 0) + b36.f.h(2, this.object_id);
            java.lang.String str2 = this.object_nonce_id;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.e(4, this.display_tab_type);
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.object_id = aVar2.i(intValue);
                return 0;
            }
            if (intValue == 3) {
                this.object_nonce_id = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.display_tab_type = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo finderRedDotCtrlInfo3 = new com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo();
            if (bArr != null && bArr.length > 0) {
                finderRedDotCtrlInfo3.parseFrom(bArr);
            }
            this.ctrl_info = finderRedDotCtrlInfo3;
        }
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsInfo setCtrlInfo(com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo finderRedDotCtrlInfo) {
        this.ctrl_info = finderRedDotCtrlInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsInfo setCtrl_info(com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo finderRedDotCtrlInfo) {
        this.ctrl_info = finderRedDotCtrlInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsInfo setDisplayTabType(int i17) {
        this.display_tab_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsInfo setDisplay_tab_type(int i17) {
        this.display_tab_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsInfo setObjectId(long j17) {
        this.object_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsInfo setObjectNonceId(java.lang.String str) {
        this.object_nonce_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsInfo setObject_id(long j17) {
        this.object_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsInfo setObject_nonce_id(java.lang.String str) {
        this.object_nonce_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTipsInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderTabTipsInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderTabTipsInfo) super.parseFrom(bArr);
    }
}
