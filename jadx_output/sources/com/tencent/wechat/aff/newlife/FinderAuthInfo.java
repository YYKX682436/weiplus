package com.tencent.wechat.aff.newlife;

/* loaded from: classes10.dex */
public class FinderAuthInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderAuthInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderAuthInfo();
    public java.lang.String real_name = "";
    public int auth_icon_type = 0;
    public java.lang.String auth_profession = "";
    public com.tencent.wechat.aff.newlife.FinderContact auth_guarantor = com.tencent.wechat.aff.newlife.FinderContact.getDefaultInstance();
    public java.lang.String detail_link = "";
    public java.lang.String app_name = "";
    public java.lang.String auth_icon_url = "";
    public int customer_type = 0;
    public int auth_verify_identity = 0;
    public int verify_status = 0;
    public java.lang.String unauth_profession = "";

    public static com.tencent.wechat.aff.newlife.FinderAuthInfo create() {
        return new com.tencent.wechat.aff.newlife.FinderAuthInfo();
    }

    public static com.tencent.wechat.aff.newlife.FinderAuthInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderAuthInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderAuthInfo();
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderAuthInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderAuthInfo finderAuthInfo = (com.tencent.wechat.aff.newlife.FinderAuthInfo) fVar;
        return n51.f.a(this.real_name, finderAuthInfo.real_name) && n51.f.a(java.lang.Integer.valueOf(this.auth_icon_type), java.lang.Integer.valueOf(finderAuthInfo.auth_icon_type)) && n51.f.a(this.auth_profession, finderAuthInfo.auth_profession) && n51.f.a(this.auth_guarantor, finderAuthInfo.auth_guarantor) && n51.f.a(this.detail_link, finderAuthInfo.detail_link) && n51.f.a(this.app_name, finderAuthInfo.app_name) && n51.f.a(this.auth_icon_url, finderAuthInfo.auth_icon_url) && n51.f.a(java.lang.Integer.valueOf(this.customer_type), java.lang.Integer.valueOf(finderAuthInfo.customer_type)) && n51.f.a(java.lang.Integer.valueOf(this.auth_verify_identity), java.lang.Integer.valueOf(finderAuthInfo.auth_verify_identity)) && n51.f.a(java.lang.Integer.valueOf(this.verify_status), java.lang.Integer.valueOf(finderAuthInfo.verify_status)) && n51.f.a(this.unauth_profession, finderAuthInfo.unauth_profession);
    }

    public java.lang.String getAppName() {
        return this.app_name;
    }

    public java.lang.String getApp_name() {
        return this.app_name;
    }

    public com.tencent.wechat.aff.newlife.FinderContact getAuthGuarantor() {
        return this.auth_guarantor;
    }

    public int getAuthIconType() {
        return this.auth_icon_type;
    }

    public java.lang.String getAuthIconUrl() {
        return this.auth_icon_url;
    }

    public java.lang.String getAuthProfession() {
        return this.auth_profession;
    }

    public int getAuthVerifyIdentity() {
        return this.auth_verify_identity;
    }

    public com.tencent.wechat.aff.newlife.FinderContact getAuth_guarantor() {
        return this.auth_guarantor;
    }

    public int getAuth_icon_type() {
        return this.auth_icon_type;
    }

    public java.lang.String getAuth_icon_url() {
        return this.auth_icon_url;
    }

    public java.lang.String getAuth_profession() {
        return this.auth_profession;
    }

    public int getAuth_verify_identity() {
        return this.auth_verify_identity;
    }

    public int getCustomerType() {
        return this.customer_type;
    }

    public int getCustomer_type() {
        return this.customer_type;
    }

    public java.lang.String getDetailLink() {
        return this.detail_link;
    }

    public java.lang.String getDetail_link() {
        return this.detail_link;
    }

    public java.lang.String getRealName() {
        return this.real_name;
    }

    public java.lang.String getReal_name() {
        return this.real_name;
    }

    public java.lang.String getUnauthProfession() {
        return this.unauth_profession;
    }

    public java.lang.String getUnauth_profession() {
        return this.unauth_profession;
    }

    public int getVerifyStatus() {
        return this.verify_status;
    }

    public int getVerify_status() {
        return this.verify_status;
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderAuthInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.real_name;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.auth_icon_type);
            java.lang.String str2 = this.auth_profession;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            com.tencent.wechat.aff.newlife.FinderContact finderContact = this.auth_guarantor;
            if (finderContact != null) {
                fVar.i(4, finderContact.computeSize());
                this.auth_guarantor.writeFields(fVar);
            }
            java.lang.String str3 = this.detail_link;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.app_name;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.auth_icon_url;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.customer_type);
            fVar.e(9, this.auth_verify_identity);
            fVar.e(10, this.verify_status);
            java.lang.String str6 = this.unauth_profession;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.real_name;
            int j17 = (str7 != null ? 0 + b36.f.j(1, str7) : 0) + b36.f.e(2, this.auth_icon_type);
            java.lang.String str8 = this.auth_profession;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            com.tencent.wechat.aff.newlife.FinderContact finderContact2 = this.auth_guarantor;
            if (finderContact2 != null) {
                j17 += b36.f.i(4, finderContact2.computeSize());
            }
            java.lang.String str9 = this.detail_link;
            if (str9 != null) {
                j17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.app_name;
            if (str10 != null) {
                j17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.auth_icon_url;
            if (str11 != null) {
                j17 += b36.f.j(7, str11);
            }
            int e17 = j17 + b36.f.e(8, this.customer_type) + b36.f.e(9, this.auth_verify_identity) + b36.f.e(10, this.verify_status);
            java.lang.String str12 = this.unauth_profession;
            return str12 != null ? e17 + b36.f.j(11, str12) : e17;
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
                this.real_name = aVar2.k(intValue);
                return 0;
            case 2:
                this.auth_icon_type = aVar2.g(intValue);
                return 0;
            case 3:
                this.auth_profession = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.wechat.aff.newlife.FinderContact finderContact3 = new com.tencent.wechat.aff.newlife.FinderContact();
                    if (bArr != null && bArr.length > 0) {
                        finderContact3.parseFrom(bArr);
                    }
                    this.auth_guarantor = finderContact3;
                }
                return 0;
            case 5:
                this.detail_link = aVar2.k(intValue);
                return 0;
            case 6:
                this.app_name = aVar2.k(intValue);
                return 0;
            case 7:
                this.auth_icon_url = aVar2.k(intValue);
                return 0;
            case 8:
                this.customer_type = aVar2.g(intValue);
                return 0;
            case 9:
                this.auth_verify_identity = aVar2.g(intValue);
                return 0;
            case 10:
                this.verify_status = aVar2.g(intValue);
                return 0;
            case 11:
                this.unauth_profession = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo setAppName(java.lang.String str) {
        this.app_name = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo setApp_name(java.lang.String str) {
        this.app_name = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo setAuthGuarantor(com.tencent.wechat.aff.newlife.FinderContact finderContact) {
        this.auth_guarantor = finderContact;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo setAuthIconType(int i17) {
        this.auth_icon_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo setAuthIconUrl(java.lang.String str) {
        this.auth_icon_url = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo setAuthProfession(java.lang.String str) {
        this.auth_profession = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo setAuthVerifyIdentity(int i17) {
        this.auth_verify_identity = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo setAuth_guarantor(com.tencent.wechat.aff.newlife.FinderContact finderContact) {
        this.auth_guarantor = finderContact;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo setAuth_icon_type(int i17) {
        this.auth_icon_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo setAuth_icon_url(java.lang.String str) {
        this.auth_icon_url = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo setAuth_profession(java.lang.String str) {
        this.auth_profession = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo setAuth_verify_identity(int i17) {
        this.auth_verify_identity = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo setCustomerType(int i17) {
        this.customer_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo setCustomer_type(int i17) {
        this.customer_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo setDetailLink(java.lang.String str) {
        this.detail_link = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo setDetail_link(java.lang.String str) {
        this.detail_link = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo setRealName(java.lang.String str) {
        this.real_name = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo setReal_name(java.lang.String str) {
        this.real_name = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo setUnauthProfession(java.lang.String str) {
        this.unauth_profession = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo setUnauth_profession(java.lang.String str) {
        this.unauth_profession = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo setVerifyStatus(int i17) {
        this.verify_status = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo setVerify_status(int i17) {
        this.verify_status = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAuthInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderAuthInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderAuthInfo) super.parseFrom(bArr);
    }
}
