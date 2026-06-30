package com.tencent.wechat.aff.newlife;

/* loaded from: classes2.dex */
public class FinderTipsShowDiscoveryExtInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderTipsShowDiscoveryExtInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderTipsShowDiscoveryExtInfo();
    public java.lang.String show_ext_info = "";

    public static com.tencent.wechat.aff.newlife.FinderTipsShowDiscoveryExtInfo create() {
        return new com.tencent.wechat.aff.newlife.FinderTipsShowDiscoveryExtInfo();
    }

    public static com.tencent.wechat.aff.newlife.FinderTipsShowDiscoveryExtInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderTipsShowDiscoveryExtInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderTipsShowDiscoveryExtInfo();
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowDiscoveryExtInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.aff.newlife.FinderTipsShowDiscoveryExtInfo) && n51.f.a(this.show_ext_info, ((com.tencent.wechat.aff.newlife.FinderTipsShowDiscoveryExtInfo) fVar).show_ext_info);
    }

    public java.lang.String getShowExtInfo() {
        return this.show_ext_info;
    }

    public java.lang.String getShow_ext_info() {
        return this.show_ext_info;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowDiscoveryExtInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderTipsShowDiscoveryExtInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.show_ext_info;
            if (str != null) {
                fVar.j(1, str);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.show_ext_info;
            if (str2 != null) {
                return 0 + b36.f.j(1, str2);
            }
            return 0;
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
            return -1;
        }
        this.show_ext_info = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowDiscoveryExtInfo setShowExtInfo(java.lang.String str) {
        this.show_ext_info = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowDiscoveryExtInfo setShow_ext_info(java.lang.String str) {
        this.show_ext_info = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowDiscoveryExtInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderTipsShowDiscoveryExtInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderTipsShowDiscoveryExtInfo) super.parseFrom(bArr);
    }
}
