package com.tencent.wechat.aff;

/* loaded from: classes15.dex */
public class IlinkC2CVideoInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.IlinkC2CVideoInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.IlinkC2CVideoInfo();
    private final boolean[] hasSetFields = new boolean[6];
    private int ori_videoformat;
    private com.tencent.mm.protobuf.g requestflag;
    private com.tencent.mm.protobuf.g svrflag;
    private int videoformat;
    private com.tencent.mm.protobuf.g videopath;

    public static com.tencent.wechat.aff.IlinkC2CVideoInfo create() {
        return new com.tencent.wechat.aff.IlinkC2CVideoInfo();
    }

    public static com.tencent.wechat.aff.IlinkC2CVideoInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.IlinkC2CVideoInfo newBuilder() {
        return new com.tencent.wechat.aff.IlinkC2CVideoInfo();
    }

    public com.tencent.wechat.aff.IlinkC2CVideoInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.IlinkC2CVideoInfo)) {
            return false;
        }
        com.tencent.wechat.aff.IlinkC2CVideoInfo ilinkC2CVideoInfo = (com.tencent.wechat.aff.IlinkC2CVideoInfo) fVar;
        return n51.f.a(this.svrflag, ilinkC2CVideoInfo.svrflag) && n51.f.a(java.lang.Integer.valueOf(this.videoformat), java.lang.Integer.valueOf(ilinkC2CVideoInfo.videoformat)) && n51.f.a(java.lang.Integer.valueOf(this.ori_videoformat), java.lang.Integer.valueOf(ilinkC2CVideoInfo.ori_videoformat)) && n51.f.a(this.videopath, ilinkC2CVideoInfo.videopath) && n51.f.a(this.requestflag, ilinkC2CVideoInfo.requestflag);
    }

    public int getOriVideoformat() {
        return this.ori_videoformat;
    }

    public com.tencent.mm.protobuf.g getRequestflag() {
        return this.hasSetFields[5] ? this.requestflag : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getSvrflag() {
        return this.hasSetFields[1] ? this.svrflag : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getVideoformat() {
        return this.videoformat;
    }

    public com.tencent.mm.protobuf.g getVideopath() {
        return this.hasSetFields[4] ? this.videopath : com.tencent.mm.protobuf.g.f192155b;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasOriVideoformat() {
        return hasFieldNumber(3);
    }

    public boolean hasRequestflag() {
        return hasFieldNumber(5);
    }

    public boolean hasSvrflag() {
        return hasFieldNumber(1);
    }

    public boolean hasVideoformat() {
        return hasFieldNumber(2);
    }

    public boolean hasVideopath() {
        return hasFieldNumber(4);
    }

    public com.tencent.wechat.aff.IlinkC2CVideoInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.IlinkC2CVideoInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.svrflag;
            if (gVar != null && this.hasSetFields[1]) {
                fVar.b(1, gVar);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.videoformat);
            }
            if (this.hasSetFields[3]) {
                fVar.e(3, this.ori_videoformat);
            }
            com.tencent.mm.protobuf.g gVar2 = this.videopath;
            if (gVar2 != null && this.hasSetFields[4]) {
                fVar.b(4, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.requestflag;
            if (gVar3 != null && this.hasSetFields[5]) {
                fVar.b(5, gVar3);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar4 = this.svrflag;
            if (gVar4 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.b(1, gVar4);
            }
            if (this.hasSetFields[2]) {
                i18 += b36.f.e(2, this.videoformat);
            }
            if (this.hasSetFields[3]) {
                i18 += b36.f.e(3, this.ori_videoformat);
            }
            com.tencent.mm.protobuf.g gVar5 = this.videopath;
            if (gVar5 != null && this.hasSetFields[4]) {
                i18 += b36.f.b(4, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.requestflag;
            return (gVar6 == null || !this.hasSetFields[5]) ? i18 : i18 + b36.f.b(5, gVar6);
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
            this.svrflag = aVar2.d(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.videoformat = aVar2.g(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.ori_videoformat = aVar2.g(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.videopath = aVar2.d(intValue);
            this.hasSetFields[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.requestflag = aVar2.d(intValue);
        this.hasSetFields[5] = true;
        return 0;
    }

    public com.tencent.wechat.aff.IlinkC2CVideoInfo setOriVideoformat(int i17) {
        this.ori_videoformat = i17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CVideoInfo setRequestflag(com.tencent.mm.protobuf.g gVar) {
        this.requestflag = gVar;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CVideoInfo setSvrflag(com.tencent.mm.protobuf.g gVar) {
        this.svrflag = gVar;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CVideoInfo setVideoformat(int i17) {
        this.videoformat = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CVideoInfo setVideopath(com.tencent.mm.protobuf.g gVar) {
        this.videopath = gVar;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CVideoInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.IlinkC2CVideoInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.IlinkC2CVideoInfo) super.parseFrom(bArr);
    }
}
