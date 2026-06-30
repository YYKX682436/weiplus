package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class FinderCmdItem extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderCmdItem DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderCmdItem();
    public int cmdId = 0;
    public com.tencent.mm.protobuf.g cmdBuf = com.tencent.mm.protobuf.g.f192155b;
    public java.lang.String finderUsername = "";

    public static com.tencent.wechat.aff.newlife.FinderCmdItem create() {
        return new com.tencent.wechat.aff.newlife.FinderCmdItem();
    }

    public static com.tencent.wechat.aff.newlife.FinderCmdItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderCmdItem newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderCmdItem();
    }

    public com.tencent.wechat.aff.newlife.FinderCmdItem build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderCmdItem)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderCmdItem finderCmdItem = (com.tencent.wechat.aff.newlife.FinderCmdItem) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.cmdId), java.lang.Integer.valueOf(finderCmdItem.cmdId)) && n51.f.a(this.cmdBuf, finderCmdItem.cmdBuf) && n51.f.a(this.finderUsername, finderCmdItem.finderUsername);
    }

    public com.tencent.mm.protobuf.g getCmdBuf() {
        return this.cmdBuf;
    }

    public int getCmdId() {
        return this.cmdId;
    }

    public java.lang.String getFinderUsername() {
        return this.finderUsername;
    }

    public com.tencent.wechat.aff.newlife.FinderCmdItem mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderCmdItem();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.cmdId);
            com.tencent.mm.protobuf.g gVar = this.cmdBuf;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            java.lang.String str = this.finderUsername;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.cmdId) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.cmdBuf;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            java.lang.String str2 = this.finderUsername;
            return str2 != null ? e17 + b36.f.j(3, str2) : e17;
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
            this.cmdId = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.cmdBuf = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.finderUsername = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderCmdItem setCmdBuf(com.tencent.mm.protobuf.g gVar) {
        this.cmdBuf = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderCmdItem setCmdId(int i17) {
        this.cmdId = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderCmdItem setFinderUsername(java.lang.String str) {
        this.finderUsername = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderCmdItem mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderCmdItem parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderCmdItem) super.parseFrom(bArr);
    }
}
