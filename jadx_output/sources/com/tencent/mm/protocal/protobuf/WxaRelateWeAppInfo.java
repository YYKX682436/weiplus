package com.tencent.mm.protocal.protobuf;

/* loaded from: classes2.dex */
public class WxaRelateWeAppInfo extends com.tencent.mm.protobuf.f {
    public java.lang.String desc;
    public java.lang.String icon_url;
    public java.lang.String title;
    public java.lang.String username;

    public static final com.tencent.mm.protocal.protobuf.WxaRelateWeAppInfo create() {
        return new com.tencent.mm.protocal.protobuf.WxaRelateWeAppInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.protocal.protobuf.WxaRelateWeAppInfo)) {
            return false;
        }
        com.tencent.mm.protocal.protobuf.WxaRelateWeAppInfo wxaRelateWeAppInfo = (com.tencent.mm.protocal.protobuf.WxaRelateWeAppInfo) fVar;
        return n51.f.a(this.icon_url, wxaRelateWeAppInfo.icon_url) && n51.f.a(this.title, wxaRelateWeAppInfo.title) && n51.f.a(this.desc, wxaRelateWeAppInfo.desc) && n51.f.a(this.username, wxaRelateWeAppInfo.username);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.icon_url;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.title;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.desc;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.username;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.icon_url;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.title;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.desc;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.username;
            return str8 != null ? j17 + b36.f.j(4, str8) : j17;
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
        com.tencent.mm.protocal.protobuf.WxaRelateWeAppInfo wxaRelateWeAppInfo = (com.tencent.mm.protocal.protobuf.WxaRelateWeAppInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wxaRelateWeAppInfo.icon_url = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            wxaRelateWeAppInfo.title = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            wxaRelateWeAppInfo.desc = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        wxaRelateWeAppInfo.username = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.mm.protocal.protobuf.WxaRelateWeAppInfo setDesc(java.lang.String str) {
        this.desc = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.WxaRelateWeAppInfo setIcon_url(java.lang.String str) {
        this.icon_url = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.WxaRelateWeAppInfo setTitle(java.lang.String str) {
        this.title = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.WxaRelateWeAppInfo setUsername(java.lang.String str) {
        this.username = str;
        return this;
    }
}
