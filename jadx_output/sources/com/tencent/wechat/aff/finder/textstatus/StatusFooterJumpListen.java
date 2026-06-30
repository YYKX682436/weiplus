package com.tencent.wechat.aff.finder.textstatus;

/* loaded from: classes2.dex */
public class StatusFooterJumpListen extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.finder.textstatus.StatusFooterJumpListen DEFAULT_INSTANCE = new com.tencent.wechat.aff.finder.textstatus.StatusFooterJumpListen();
    public java.lang.String listen_id = "";
    public java.lang.String cover_url = "";

    public static com.tencent.wechat.aff.finder.textstatus.StatusFooterJumpListen create() {
        return new com.tencent.wechat.aff.finder.textstatus.StatusFooterJumpListen();
    }

    public static com.tencent.wechat.aff.finder.textstatus.StatusFooterJumpListen getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.finder.textstatus.StatusFooterJumpListen newBuilder() {
        return new com.tencent.wechat.aff.finder.textstatus.StatusFooterJumpListen();
    }

    public com.tencent.wechat.aff.finder.textstatus.StatusFooterJumpListen build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.finder.textstatus.StatusFooterJumpListen)) {
            return false;
        }
        com.tencent.wechat.aff.finder.textstatus.StatusFooterJumpListen statusFooterJumpListen = (com.tencent.wechat.aff.finder.textstatus.StatusFooterJumpListen) fVar;
        return n51.f.a(this.listen_id, statusFooterJumpListen.listen_id) && n51.f.a(this.cover_url, statusFooterJumpListen.cover_url);
    }

    public java.lang.String getCoverUrl() {
        return this.cover_url;
    }

    public java.lang.String getCover_url() {
        return this.cover_url;
    }

    public java.lang.String getListenId() {
        return this.listen_id;
    }

    public java.lang.String getListen_id() {
        return this.listen_id;
    }

    public com.tencent.wechat.aff.finder.textstatus.StatusFooterJumpListen mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.finder.textstatus.StatusFooterJumpListen();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.listen_id;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.cover_url;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.listen_id;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.cover_url;
            return str4 != null ? j17 + b36.f.j(2, str4) : j17;
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
            this.listen_id = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.cover_url = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.finder.textstatus.StatusFooterJumpListen setCoverUrl(java.lang.String str) {
        this.cover_url = str;
        return this;
    }

    public com.tencent.wechat.aff.finder.textstatus.StatusFooterJumpListen setCover_url(java.lang.String str) {
        this.cover_url = str;
        return this;
    }

    public com.tencent.wechat.aff.finder.textstatus.StatusFooterJumpListen setListenId(java.lang.String str) {
        this.listen_id = str;
        return this;
    }

    public com.tencent.wechat.aff.finder.textstatus.StatusFooterJumpListen setListen_id(java.lang.String str) {
        this.listen_id = str;
        return this;
    }

    public com.tencent.wechat.aff.finder.textstatus.StatusFooterJumpListen mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.finder.textstatus.StatusFooterJumpListen parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.finder.textstatus.StatusFooterJumpListen) super.parseFrom(bArr);
    }
}
