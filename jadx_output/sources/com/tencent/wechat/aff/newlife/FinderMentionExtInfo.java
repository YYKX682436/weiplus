package com.tencent.wechat.aff.newlife;

/* loaded from: classes10.dex */
public class FinderMentionExtInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderMentionExtInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderMentionExtInfo();
    public java.lang.String app_name = "";
    public java.lang.String entity_id = "";
    public com.tencent.mm.protobuf.g ext_buff = com.tencent.mm.protobuf.g.f192155b;

    public static com.tencent.wechat.aff.newlife.FinderMentionExtInfo create() {
        return new com.tencent.wechat.aff.newlife.FinderMentionExtInfo();
    }

    public static com.tencent.wechat.aff.newlife.FinderMentionExtInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderMentionExtInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderMentionExtInfo();
    }

    public com.tencent.wechat.aff.newlife.FinderMentionExtInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderMentionExtInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderMentionExtInfo finderMentionExtInfo = (com.tencent.wechat.aff.newlife.FinderMentionExtInfo) fVar;
        return n51.f.a(this.app_name, finderMentionExtInfo.app_name) && n51.f.a(this.entity_id, finderMentionExtInfo.entity_id) && n51.f.a(this.ext_buff, finderMentionExtInfo.ext_buff);
    }

    public java.lang.String getAppName() {
        return this.app_name;
    }

    public java.lang.String getApp_name() {
        return this.app_name;
    }

    public java.lang.String getEntityId() {
        return this.entity_id;
    }

    public java.lang.String getEntity_id() {
        return this.entity_id;
    }

    public com.tencent.mm.protobuf.g getExtBuff() {
        return this.ext_buff;
    }

    public com.tencent.mm.protobuf.g getExt_buff() {
        return this.ext_buff;
    }

    public com.tencent.wechat.aff.newlife.FinderMentionExtInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderMentionExtInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.app_name;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.entity_id;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.ext_buff;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.app_name;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.entity_id;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.ext_buff;
            return gVar2 != null ? j17 + b36.f.b(3, gVar2) : j17;
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
            this.app_name = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.entity_id = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.ext_buff = aVar2.d(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderMentionExtInfo setAppName(java.lang.String str) {
        this.app_name = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMentionExtInfo setApp_name(java.lang.String str) {
        this.app_name = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMentionExtInfo setEntityId(java.lang.String str) {
        this.entity_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMentionExtInfo setEntity_id(java.lang.String str) {
        this.entity_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMentionExtInfo setExtBuff(com.tencent.mm.protobuf.g gVar) {
        this.ext_buff = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMentionExtInfo setExt_buff(com.tencent.mm.protobuf.g gVar) {
        this.ext_buff = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderMentionExtInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderMentionExtInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderMentionExtInfo) super.parseFrom(bArr);
    }
}
