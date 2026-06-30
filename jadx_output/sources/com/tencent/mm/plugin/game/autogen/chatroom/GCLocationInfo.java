package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class GCLocationInfo extends com.tencent.mm.protobuf.f {
    public java.lang.String ad_code;
    public java.lang.String city;
    public java.lang.String country;
    public java.lang.String province;
    public java.lang.String region;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.GCLocationInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.GCLocationInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.GCLocationInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.GCLocationInfo gCLocationInfo = (com.tencent.mm.plugin.game.autogen.chatroom.GCLocationInfo) fVar;
        return n51.f.a(this.province, gCLocationInfo.province) && n51.f.a(this.country, gCLocationInfo.country) && n51.f.a(this.city, gCLocationInfo.city) && n51.f.a(this.ad_code, gCLocationInfo.ad_code) && n51.f.a(this.region, gCLocationInfo.region);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.province;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.country;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.city;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.ad_code;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.region;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.province;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.country;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.city;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.ad_code;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.region;
            return str10 != null ? j17 + b36.f.j(5, str10) : j17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.GCLocationInfo gCLocationInfo = (com.tencent.mm.plugin.game.autogen.chatroom.GCLocationInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gCLocationInfo.province = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            gCLocationInfo.country = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            gCLocationInfo.city = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            gCLocationInfo.ad_code = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        gCLocationInfo.region = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GCLocationInfo setAd_code(java.lang.String str) {
        this.ad_code = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GCLocationInfo setCity(java.lang.String str) {
        this.city = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GCLocationInfo setCountry(java.lang.String str) {
        this.country = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GCLocationInfo setProvince(java.lang.String str) {
        this.province = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GCLocationInfo setRegion(java.lang.String str) {
        this.region = str;
        return this;
    }
}
