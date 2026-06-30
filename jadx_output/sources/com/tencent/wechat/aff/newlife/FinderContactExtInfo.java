package com.tencent.wechat.aff.newlife;

/* loaded from: classes10.dex */
public class FinderContactExtInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderContactExtInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderContactExtInfo();
    public java.lang.String country = "";
    public java.lang.String province = "";
    public java.lang.String city = "";
    public int sex = 0;
    public int birth_year = 0;
    public int birth_month = 0;
    public int birth_day = 0;

    public static com.tencent.wechat.aff.newlife.FinderContactExtInfo create() {
        return new com.tencent.wechat.aff.newlife.FinderContactExtInfo();
    }

    public static com.tencent.wechat.aff.newlife.FinderContactExtInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderContactExtInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderContactExtInfo();
    }

    public com.tencent.wechat.aff.newlife.FinderContactExtInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderContactExtInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderContactExtInfo finderContactExtInfo = (com.tencent.wechat.aff.newlife.FinderContactExtInfo) fVar;
        return n51.f.a(this.country, finderContactExtInfo.country) && n51.f.a(this.province, finderContactExtInfo.province) && n51.f.a(this.city, finderContactExtInfo.city) && n51.f.a(java.lang.Integer.valueOf(this.sex), java.lang.Integer.valueOf(finderContactExtInfo.sex)) && n51.f.a(java.lang.Integer.valueOf(this.birth_year), java.lang.Integer.valueOf(finderContactExtInfo.birth_year)) && n51.f.a(java.lang.Integer.valueOf(this.birth_month), java.lang.Integer.valueOf(finderContactExtInfo.birth_month)) && n51.f.a(java.lang.Integer.valueOf(this.birth_day), java.lang.Integer.valueOf(finderContactExtInfo.birth_day));
    }

    public int getBirthDay() {
        return this.birth_day;
    }

    public int getBirthMonth() {
        return this.birth_month;
    }

    public int getBirthYear() {
        return this.birth_year;
    }

    public int getBirth_day() {
        return this.birth_day;
    }

    public int getBirth_month() {
        return this.birth_month;
    }

    public int getBirth_year() {
        return this.birth_year;
    }

    public java.lang.String getCity() {
        return this.city;
    }

    public java.lang.String getCountry() {
        return this.country;
    }

    public java.lang.String getProvince() {
        return this.province;
    }

    public int getSex() {
        return this.sex;
    }

    public com.tencent.wechat.aff.newlife.FinderContactExtInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderContactExtInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.country;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.province;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.city;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.sex);
            fVar.e(5, this.birth_year);
            fVar.e(6, this.birth_month);
            fVar.e(7, this.birth_day);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.country;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.province;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.city;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.sex) + b36.f.e(5, this.birth_year) + b36.f.e(6, this.birth_month) + b36.f.e(7, this.birth_day);
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
                this.country = aVar2.k(intValue);
                return 0;
            case 2:
                this.province = aVar2.k(intValue);
                return 0;
            case 3:
                this.city = aVar2.k(intValue);
                return 0;
            case 4:
                this.sex = aVar2.g(intValue);
                return 0;
            case 5:
                this.birth_year = aVar2.g(intValue);
                return 0;
            case 6:
                this.birth_month = aVar2.g(intValue);
                return 0;
            case 7:
                this.birth_day = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.newlife.FinderContactExtInfo setBirthDay(int i17) {
        this.birth_day = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContactExtInfo setBirthMonth(int i17) {
        this.birth_month = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContactExtInfo setBirthYear(int i17) {
        this.birth_year = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContactExtInfo setBirth_day(int i17) {
        this.birth_day = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContactExtInfo setBirth_month(int i17) {
        this.birth_month = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContactExtInfo setBirth_year(int i17) {
        this.birth_year = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContactExtInfo setCity(java.lang.String str) {
        this.city = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContactExtInfo setCountry(java.lang.String str) {
        this.country = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContactExtInfo setProvince(java.lang.String str) {
        this.province = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContactExtInfo setSex(int i17) {
        this.sex = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContactExtInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderContactExtInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderContactExtInfo) super.parseFrom(bArr);
    }
}
