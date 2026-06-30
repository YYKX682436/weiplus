package com.tencent.wechat.aff;

/* loaded from: classes4.dex */
public class IlinkCmdItem extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.IlinkCmdItem DEFAULT_INSTANCE = new com.tencent.wechat.aff.IlinkCmdItem();
    private com.tencent.mm.protobuf.g cmdbuf;
    private int cmdid;
    private final boolean[] hasSetFields = new boolean[3];

    public static com.tencent.wechat.aff.IlinkCmdItem create() {
        return new com.tencent.wechat.aff.IlinkCmdItem();
    }

    public static com.tencent.wechat.aff.IlinkCmdItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.IlinkCmdItem newBuilder() {
        return new com.tencent.wechat.aff.IlinkCmdItem();
    }

    public com.tencent.wechat.aff.IlinkCmdItem build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.IlinkCmdItem)) {
            return false;
        }
        com.tencent.wechat.aff.IlinkCmdItem ilinkCmdItem = (com.tencent.wechat.aff.IlinkCmdItem) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.cmdid), java.lang.Integer.valueOf(ilinkCmdItem.cmdid)) && n51.f.a(this.cmdbuf, ilinkCmdItem.cmdbuf);
    }

    public com.tencent.mm.protobuf.g getCmdbuf() {
        return this.hasSetFields[2] ? this.cmdbuf : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getCmdid() {
        return this.cmdid;
    }

    public boolean hasCmdbuf() {
        return hasFieldNumber(2);
    }

    public boolean hasCmdid() {
        return hasFieldNumber(1);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public com.tencent.wechat.aff.IlinkCmdItem mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.IlinkCmdItem();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.cmdid);
            }
            com.tencent.mm.protobuf.g gVar = this.cmdbuf;
            if (gVar != null && this.hasSetFields[2]) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.cmdid) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.cmdbuf;
            return (gVar2 == null || !this.hasSetFields[2]) ? e17 : e17 + b36.f.b(2, gVar2);
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
            this.cmdid = aVar2.g(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.cmdbuf = aVar2.d(intValue);
        this.hasSetFields[2] = true;
        return 0;
    }

    public com.tencent.wechat.aff.IlinkCmdItem setCmdbuf(com.tencent.mm.protobuf.g gVar) {
        this.cmdbuf = gVar;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkCmdItem setCmdid(int i17) {
        this.cmdid = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkCmdItem mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.IlinkCmdItem parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.IlinkCmdItem) super.parseFrom(bArr);
    }
}
