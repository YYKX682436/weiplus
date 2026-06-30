package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class FinderContactClubInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderContactClubInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderContactClubInfo();
    public java.lang.String chatroomd_id = "";

    public static com.tencent.wechat.aff.newlife.FinderContactClubInfo create() {
        return new com.tencent.wechat.aff.newlife.FinderContactClubInfo();
    }

    public static com.tencent.wechat.aff.newlife.FinderContactClubInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderContactClubInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderContactClubInfo();
    }

    public com.tencent.wechat.aff.newlife.FinderContactClubInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.aff.newlife.FinderContactClubInfo) && n51.f.a(this.chatroomd_id, ((com.tencent.wechat.aff.newlife.FinderContactClubInfo) fVar).chatroomd_id);
    }

    public java.lang.String getChatroomdId() {
        return this.chatroomd_id;
    }

    public java.lang.String getChatroomd_id() {
        return this.chatroomd_id;
    }

    public com.tencent.wechat.aff.newlife.FinderContactClubInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderContactClubInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.chatroomd_id;
            if (str != null) {
                fVar.j(1, str);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.chatroomd_id;
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
        this.chatroomd_id = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderContactClubInfo setChatroomdId(java.lang.String str) {
        this.chatroomd_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContactClubInfo setChatroomd_id(java.lang.String str) {
        this.chatroomd_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContactClubInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderContactClubInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderContactClubInfo) super.parseFrom(bArr);
    }
}
