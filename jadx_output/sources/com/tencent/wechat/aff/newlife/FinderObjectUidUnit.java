package com.tencent.wechat.aff.newlife;

/* loaded from: classes2.dex */
public class FinderObjectUidUnit extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderObjectUidUnit DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderObjectUidUnit();
    public long object_id = 0;
    public java.lang.String object_nonce_id = "";
    public int ad_flag = 0;
    public com.tencent.mm.protobuf.g object_cookie = com.tencent.mm.protobuf.g.f192155b;
    public java.lang.String encrypted_object_id = "";
    public long live_id = 0;
    public long object_product_id = 0;

    public static com.tencent.wechat.aff.newlife.FinderObjectUidUnit create() {
        return new com.tencent.wechat.aff.newlife.FinderObjectUidUnit();
    }

    public static com.tencent.wechat.aff.newlife.FinderObjectUidUnit getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderObjectUidUnit newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderObjectUidUnit();
    }

    public com.tencent.wechat.aff.newlife.FinderObjectUidUnit build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderObjectUidUnit)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderObjectUidUnit finderObjectUidUnit = (com.tencent.wechat.aff.newlife.FinderObjectUidUnit) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.object_id), java.lang.Long.valueOf(finderObjectUidUnit.object_id)) && n51.f.a(this.object_nonce_id, finderObjectUidUnit.object_nonce_id) && n51.f.a(java.lang.Integer.valueOf(this.ad_flag), java.lang.Integer.valueOf(finderObjectUidUnit.ad_flag)) && n51.f.a(this.object_cookie, finderObjectUidUnit.object_cookie) && n51.f.a(this.encrypted_object_id, finderObjectUidUnit.encrypted_object_id) && n51.f.a(java.lang.Long.valueOf(this.live_id), java.lang.Long.valueOf(finderObjectUidUnit.live_id)) && n51.f.a(java.lang.Long.valueOf(this.object_product_id), java.lang.Long.valueOf(finderObjectUidUnit.object_product_id));
    }

    public int getAdFlag() {
        return this.ad_flag;
    }

    public int getAd_flag() {
        return this.ad_flag;
    }

    public java.lang.String getEncryptedObjectId() {
        return this.encrypted_object_id;
    }

    public java.lang.String getEncrypted_object_id() {
        return this.encrypted_object_id;
    }

    public long getLiveId() {
        return this.live_id;
    }

    public long getLive_id() {
        return this.live_id;
    }

    public com.tencent.mm.protobuf.g getObjectCookie() {
        return this.object_cookie;
    }

    public long getObjectId() {
        return this.object_id;
    }

    public java.lang.String getObjectNonceId() {
        return this.object_nonce_id;
    }

    public long getObjectProductId() {
        return this.object_product_id;
    }

    public com.tencent.mm.protobuf.g getObject_cookie() {
        return this.object_cookie;
    }

    public long getObject_id() {
        return this.object_id;
    }

    public java.lang.String getObject_nonce_id() {
        return this.object_nonce_id;
    }

    public long getObject_product_id() {
        return this.object_product_id;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectUidUnit mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderObjectUidUnit();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.object_id);
            java.lang.String str = this.object_nonce_id;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.ad_flag);
            com.tencent.mm.protobuf.g gVar = this.object_cookie;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            java.lang.String str2 = this.encrypted_object_id;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.h(6, this.live_id);
            fVar.h(7, this.object_product_id);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.object_id) + 0;
            java.lang.String str3 = this.object_nonce_id;
            if (str3 != null) {
                h17 += b36.f.j(2, str3);
            }
            int e17 = h17 + b36.f.e(3, this.ad_flag);
            com.tencent.mm.protobuf.g gVar2 = this.object_cookie;
            if (gVar2 != null) {
                e17 += b36.f.b(4, gVar2);
            }
            java.lang.String str4 = this.encrypted_object_id;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            return e17 + b36.f.h(6, this.live_id) + b36.f.h(7, this.object_product_id);
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
        switch (intValue) {
            case 1:
                this.object_id = aVar2.i(intValue);
                return 0;
            case 2:
                this.object_nonce_id = aVar2.k(intValue);
                return 0;
            case 3:
                this.ad_flag = aVar2.g(intValue);
                return 0;
            case 4:
                this.object_cookie = aVar2.d(intValue);
                return 0;
            case 5:
                this.encrypted_object_id = aVar2.k(intValue);
                return 0;
            case 6:
                this.live_id = aVar2.i(intValue);
                return 0;
            case 7:
                this.object_product_id = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.newlife.FinderObjectUidUnit setAdFlag(int i17) {
        this.ad_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectUidUnit setAd_flag(int i17) {
        this.ad_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectUidUnit setEncryptedObjectId(java.lang.String str) {
        this.encrypted_object_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectUidUnit setEncrypted_object_id(java.lang.String str) {
        this.encrypted_object_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectUidUnit setLiveId(long j17) {
        this.live_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectUidUnit setLive_id(long j17) {
        this.live_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectUidUnit setObjectCookie(com.tencent.mm.protobuf.g gVar) {
        this.object_cookie = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectUidUnit setObjectId(long j17) {
        this.object_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectUidUnit setObjectNonceId(java.lang.String str) {
        this.object_nonce_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectUidUnit setObjectProductId(long j17) {
        this.object_product_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectUidUnit setObject_cookie(com.tencent.mm.protobuf.g gVar) {
        this.object_cookie = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectUidUnit setObject_id(long j17) {
        this.object_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectUidUnit setObject_nonce_id(java.lang.String str) {
        this.object_nonce_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectUidUnit setObject_product_id(long j17) {
        this.object_product_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderObjectUidUnit mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderObjectUidUnit parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderObjectUidUnit) super.parseFrom(bArr);
    }
}
