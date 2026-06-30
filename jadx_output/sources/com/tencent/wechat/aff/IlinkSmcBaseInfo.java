package com.tencent.wechat.aff;

/* loaded from: classes15.dex */
public class IlinkSmcBaseInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.IlinkSmcBaseInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.IlinkSmcBaseInfo();
    private java.lang.String device_brand;
    private java.lang.String device_model;
    private final boolean[] hasSetFields = new boolean[6];
    private java.lang.String language_ver;
    private java.lang.String osname;
    private java.lang.String osversion;

    public static com.tencent.wechat.aff.IlinkSmcBaseInfo create() {
        return new com.tencent.wechat.aff.IlinkSmcBaseInfo();
    }

    public static com.tencent.wechat.aff.IlinkSmcBaseInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.IlinkSmcBaseInfo newBuilder() {
        return new com.tencent.wechat.aff.IlinkSmcBaseInfo();
    }

    public com.tencent.wechat.aff.IlinkSmcBaseInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.IlinkSmcBaseInfo)) {
            return false;
        }
        com.tencent.wechat.aff.IlinkSmcBaseInfo ilinkSmcBaseInfo = (com.tencent.wechat.aff.IlinkSmcBaseInfo) fVar;
        return n51.f.a(this.device_model, ilinkSmcBaseInfo.device_model) && n51.f.a(this.device_brand, ilinkSmcBaseInfo.device_brand) && n51.f.a(this.osname, ilinkSmcBaseInfo.osname) && n51.f.a(this.osversion, ilinkSmcBaseInfo.osversion) && n51.f.a(this.language_ver, ilinkSmcBaseInfo.language_ver);
    }

    public java.lang.String getDeviceBrand() {
        return this.hasSetFields[2] ? this.device_brand : "";
    }

    public java.lang.String getDeviceModel() {
        return this.hasSetFields[1] ? this.device_model : "";
    }

    public java.lang.String getLanguageVer() {
        return this.hasSetFields[5] ? this.language_ver : "";
    }

    public java.lang.String getOsname() {
        return this.hasSetFields[3] ? this.osname : "";
    }

    public java.lang.String getOsversion() {
        return this.hasSetFields[4] ? this.osversion : "";
    }

    public boolean hasDeviceBrand() {
        return hasFieldNumber(2);
    }

    public boolean hasDeviceModel() {
        return hasFieldNumber(1);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasLanguageVer() {
        return hasFieldNumber(5);
    }

    public boolean hasOsname() {
        return hasFieldNumber(3);
    }

    public boolean hasOsversion() {
        return hasFieldNumber(4);
    }

    public com.tencent.wechat.aff.IlinkSmcBaseInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.IlinkSmcBaseInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.device_model;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.device_brand;
            if (str2 != null && this.hasSetFields[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.osname;
            if (str3 != null && this.hasSetFields[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.osversion;
            if (str4 != null && this.hasSetFields[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.language_ver;
            if (str5 != null && this.hasSetFields[5]) {
                fVar.j(5, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.device_model;
            if (str6 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.device_brand;
            if (str7 != null && this.hasSetFields[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.osname;
            if (str8 != null && this.hasSetFields[3]) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.osversion;
            if (str9 != null && this.hasSetFields[4]) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.language_ver;
            return (str10 == null || !this.hasSetFields[5]) ? i18 : i18 + b36.f.j(5, str10);
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
            this.device_model = aVar2.k(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.device_brand = aVar2.k(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.osname = aVar2.k(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.osversion = aVar2.k(intValue);
            this.hasSetFields[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.language_ver = aVar2.k(intValue);
        this.hasSetFields[5] = true;
        return 0;
    }

    public com.tencent.wechat.aff.IlinkSmcBaseInfo setDeviceBrand(java.lang.String str) {
        this.device_brand = str;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkSmcBaseInfo setDeviceModel(java.lang.String str) {
        this.device_model = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkSmcBaseInfo setLanguageVer(java.lang.String str) {
        this.language_ver = str;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkSmcBaseInfo setOsname(java.lang.String str) {
        this.osname = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkSmcBaseInfo setOsversion(java.lang.String str) {
        this.osversion = str;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkSmcBaseInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.IlinkSmcBaseInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.IlinkSmcBaseInfo) super.parseFrom(bArr);
    }
}
