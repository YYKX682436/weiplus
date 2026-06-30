package com.tencent.wechat.aff.newlife;

/* loaded from: classes2.dex */
public class FinderWecomInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderWecomInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderWecomInfo();
    public java.lang.String kf_url = "";
    public java.lang.String contact_id = "";
    public java.lang.String contact_wording = "";

    public static com.tencent.wechat.aff.newlife.FinderWecomInfo create() {
        return new com.tencent.wechat.aff.newlife.FinderWecomInfo();
    }

    public static com.tencent.wechat.aff.newlife.FinderWecomInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderWecomInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderWecomInfo();
    }

    public com.tencent.wechat.aff.newlife.FinderWecomInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderWecomInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderWecomInfo finderWecomInfo = (com.tencent.wechat.aff.newlife.FinderWecomInfo) fVar;
        return n51.f.a(this.kf_url, finderWecomInfo.kf_url) && n51.f.a(this.contact_id, finderWecomInfo.contact_id) && n51.f.a(this.contact_wording, finderWecomInfo.contact_wording);
    }

    public java.lang.String getContactId() {
        return this.contact_id;
    }

    public java.lang.String getContactWording() {
        return this.contact_wording;
    }

    public java.lang.String getContact_id() {
        return this.contact_id;
    }

    public java.lang.String getContact_wording() {
        return this.contact_wording;
    }

    public java.lang.String getKfUrl() {
        return this.kf_url;
    }

    public java.lang.String getKf_url() {
        return this.kf_url;
    }

    public com.tencent.wechat.aff.newlife.FinderWecomInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderWecomInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.kf_url;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.contact_id;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.contact_wording;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.kf_url;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.contact_id;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.contact_wording;
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
            this.kf_url = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.contact_id = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.contact_wording = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderWecomInfo setContactId(java.lang.String str) {
        this.contact_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderWecomInfo setContactWording(java.lang.String str) {
        this.contact_wording = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderWecomInfo setContact_id(java.lang.String str) {
        this.contact_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderWecomInfo setContact_wording(java.lang.String str) {
        this.contact_wording = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderWecomInfo setKfUrl(java.lang.String str) {
        this.kf_url = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderWecomInfo setKf_url(java.lang.String str) {
        this.kf_url = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderWecomInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderWecomInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderWecomInfo) super.parseFrom(bArr);
    }
}
