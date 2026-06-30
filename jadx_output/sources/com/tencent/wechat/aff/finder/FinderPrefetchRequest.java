package com.tencent.wechat.aff.finder;

/* loaded from: classes4.dex */
public class FinderPrefetchRequest extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.finder.FinderPrefetchRequest DEFAULT_INSTANCE = new com.tencent.wechat.aff.finder.FinderPrefetchRequest();
    public java.lang.String from_username = "";
    public java.lang.String to_username = "";
    public java.lang.String config_dir = "";

    public static com.tencent.wechat.aff.finder.FinderPrefetchRequest create() {
        return new com.tencent.wechat.aff.finder.FinderPrefetchRequest();
    }

    public static com.tencent.wechat.aff.finder.FinderPrefetchRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.finder.FinderPrefetchRequest newBuilder() {
        return new com.tencent.wechat.aff.finder.FinderPrefetchRequest();
    }

    public com.tencent.wechat.aff.finder.FinderPrefetchRequest build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.finder.FinderPrefetchRequest)) {
            return false;
        }
        com.tencent.wechat.aff.finder.FinderPrefetchRequest finderPrefetchRequest = (com.tencent.wechat.aff.finder.FinderPrefetchRequest) fVar;
        return n51.f.a(this.from_username, finderPrefetchRequest.from_username) && n51.f.a(this.to_username, finderPrefetchRequest.to_username) && n51.f.a(this.config_dir, finderPrefetchRequest.config_dir);
    }

    public java.lang.String getConfigDir() {
        return this.config_dir;
    }

    public java.lang.String getConfig_dir() {
        return this.config_dir;
    }

    public java.lang.String getFromUsername() {
        return this.from_username;
    }

    public java.lang.String getFrom_username() {
        return this.from_username;
    }

    public java.lang.String getToUsername() {
        return this.to_username;
    }

    public java.lang.String getTo_username() {
        return this.to_username;
    }

    public com.tencent.wechat.aff.finder.FinderPrefetchRequest mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.finder.FinderPrefetchRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.from_username;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.to_username;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.config_dir;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.from_username;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.to_username;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.config_dir;
            return str6 != null ? j17 + b36.f.j(3, str6) : j17;
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
            this.from_username = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.to_username = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.config_dir = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.finder.FinderPrefetchRequest setConfigDir(java.lang.String str) {
        this.config_dir = str;
        return this;
    }

    public com.tencent.wechat.aff.finder.FinderPrefetchRequest setConfig_dir(java.lang.String str) {
        this.config_dir = str;
        return this;
    }

    public com.tencent.wechat.aff.finder.FinderPrefetchRequest setFromUsername(java.lang.String str) {
        this.from_username = str;
        return this;
    }

    public com.tencent.wechat.aff.finder.FinderPrefetchRequest setFrom_username(java.lang.String str) {
        this.from_username = str;
        return this;
    }

    public com.tencent.wechat.aff.finder.FinderPrefetchRequest setToUsername(java.lang.String str) {
        this.to_username = str;
        return this;
    }

    public com.tencent.wechat.aff.finder.FinderPrefetchRequest setTo_username(java.lang.String str) {
        this.to_username = str;
        return this;
    }

    public com.tencent.wechat.aff.finder.FinderPrefetchRequest mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.finder.FinderPrefetchRequest parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.finder.FinderPrefetchRequest) super.parseFrom(bArr);
    }
}
