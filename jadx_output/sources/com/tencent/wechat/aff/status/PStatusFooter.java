package com.tencent.wechat.aff.status;

/* loaded from: classes8.dex */
public class PStatusFooter extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.status.PStatusFooter DEFAULT_INSTANCE = new com.tencent.wechat.aff.status.PStatusFooter();
    public int uin = 0;
    public java.lang.String sourceId = "";
    public java.lang.String sourceActivityId = "";
    public java.lang.String sourceName = "";
    public java.lang.String sourceIcon = "";
    public int createTime = 0;
    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusJumpInfo> jumps = new java.util.LinkedList<>();

    public static com.tencent.wechat.aff.status.PStatusFooter create() {
        return new com.tencent.wechat.aff.status.PStatusFooter();
    }

    public static com.tencent.wechat.aff.status.PStatusFooter getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.status.PStatusFooter newBuilder() {
        return new com.tencent.wechat.aff.status.PStatusFooter();
    }

    public com.tencent.wechat.aff.status.PStatusFooter addAllElementJumps(java.util.Collection<com.tencent.wechat.aff.status.PStatusJumpInfo> collection) {
        this.jumps.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusFooter addElementJumps(com.tencent.wechat.aff.status.PStatusJumpInfo pStatusJumpInfo) {
        this.jumps.add(pStatusJumpInfo);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusFooter build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.status.PStatusFooter)) {
            return false;
        }
        com.tencent.wechat.aff.status.PStatusFooter pStatusFooter = (com.tencent.wechat.aff.status.PStatusFooter) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.uin), java.lang.Integer.valueOf(pStatusFooter.uin)) && n51.f.a(this.sourceId, pStatusFooter.sourceId) && n51.f.a(this.sourceActivityId, pStatusFooter.sourceActivityId) && n51.f.a(this.sourceName, pStatusFooter.sourceName) && n51.f.a(this.sourceIcon, pStatusFooter.sourceIcon) && n51.f.a(java.lang.Integer.valueOf(this.createTime), java.lang.Integer.valueOf(pStatusFooter.createTime)) && n51.f.a(this.jumps, pStatusFooter.jumps);
    }

    public int getCreateTime() {
        return this.createTime;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusJumpInfo> getJumps() {
        return this.jumps;
    }

    public java.lang.String getSourceActivityId() {
        return this.sourceActivityId;
    }

    public java.lang.String getSourceIcon() {
        return this.sourceIcon;
    }

    public java.lang.String getSourceId() {
        return this.sourceId;
    }

    public java.lang.String getSourceName() {
        return this.sourceName;
    }

    public int getUin() {
        return this.uin;
    }

    public com.tencent.wechat.aff.status.PStatusFooter mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.status.PStatusFooter();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.uin);
            java.lang.String str = this.sourceId;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.sourceActivityId;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.sourceName;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.sourceIcon;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.createTime);
            fVar.g(21, 8, this.jumps);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.uin) + 0;
            java.lang.String str5 = this.sourceId;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.sourceActivityId;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.sourceName;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.sourceIcon;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            return e17 + b36.f.e(6, this.createTime) + b36.f.g(21, 8, this.jumps);
        }
        if (i17 == 2) {
            this.jumps.clear();
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
        if (intValue == 21) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.wechat.aff.status.PStatusJumpInfo pStatusJumpInfo = new com.tencent.wechat.aff.status.PStatusJumpInfo();
                if (bArr != null && bArr.length > 0) {
                    pStatusJumpInfo.parseFrom(bArr);
                }
                this.jumps.add(pStatusJumpInfo);
            }
            return 0;
        }
        switch (intValue) {
            case 1:
                this.uin = aVar2.g(intValue);
                return 0;
            case 2:
                this.sourceId = aVar2.k(intValue);
                return 0;
            case 3:
                this.sourceActivityId = aVar2.k(intValue);
                return 0;
            case 4:
                this.sourceName = aVar2.k(intValue);
                return 0;
            case 5:
                this.sourceIcon = aVar2.k(intValue);
                return 0;
            case 6:
                this.createTime = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.status.PStatusFooter setCreateTime(int i17) {
        this.createTime = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusFooter setJumps(java.util.LinkedList<com.tencent.wechat.aff.status.PStatusJumpInfo> linkedList) {
        this.jumps = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusFooter setSourceActivityId(java.lang.String str) {
        this.sourceActivityId = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusFooter setSourceIcon(java.lang.String str) {
        this.sourceIcon = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusFooter setSourceId(java.lang.String str) {
        this.sourceId = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusFooter setSourceName(java.lang.String str) {
        this.sourceName = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusFooter setUin(int i17) {
        this.uin = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusFooter mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.status.PStatusFooter parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.status.PStatusFooter) super.parseFrom(bArr);
    }
}
