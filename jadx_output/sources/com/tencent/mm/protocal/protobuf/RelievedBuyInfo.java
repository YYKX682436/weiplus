package com.tencent.mm.protocal.protobuf;

/* loaded from: classes2.dex */
public class RelievedBuyInfo extends com.tencent.mm.protobuf.f {
    public java.lang.String bottom_sheet_icon_desc;
    public java.lang.String bottom_sheet_icon_desc_color;
    public int bottom_sheet_icon_height;
    public java.lang.String bottom_sheet_icon_url;
    public int bottom_sheet_icon_width;
    public java.lang.String click_url;
    public java.lang.String click_wording;
    public java.lang.String icon_desc;
    public java.lang.String icon_desc_color;
    public int icon_height;
    public java.lang.String icon_url;
    public int icon_width;
    public int show_flag;
    public java.util.LinkedList<com.tencent.mm.protocal.protobuf.RelievedBuySubInfo> sub_info = new java.util.LinkedList<>();
    public java.lang.String subtitle;

    public static final com.tencent.mm.protocal.protobuf.RelievedBuyInfo create() {
        return new com.tencent.mm.protocal.protobuf.RelievedBuyInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.protocal.protobuf.RelievedBuyInfo)) {
            return false;
        }
        com.tencent.mm.protocal.protobuf.RelievedBuyInfo relievedBuyInfo = (com.tencent.mm.protocal.protobuf.RelievedBuyInfo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.show_flag), java.lang.Integer.valueOf(relievedBuyInfo.show_flag)) && n51.f.a(this.sub_info, relievedBuyInfo.sub_info) && n51.f.a(this.subtitle, relievedBuyInfo.subtitle) && n51.f.a(this.click_wording, relievedBuyInfo.click_wording) && n51.f.a(this.click_url, relievedBuyInfo.click_url) && n51.f.a(this.icon_url, relievedBuyInfo.icon_url) && n51.f.a(java.lang.Integer.valueOf(this.icon_width), java.lang.Integer.valueOf(relievedBuyInfo.icon_width)) && n51.f.a(java.lang.Integer.valueOf(this.icon_height), java.lang.Integer.valueOf(relievedBuyInfo.icon_height)) && n51.f.a(this.icon_desc, relievedBuyInfo.icon_desc) && n51.f.a(this.icon_desc_color, relievedBuyInfo.icon_desc_color) && n51.f.a(this.bottom_sheet_icon_url, relievedBuyInfo.bottom_sheet_icon_url) && n51.f.a(java.lang.Integer.valueOf(this.bottom_sheet_icon_width), java.lang.Integer.valueOf(relievedBuyInfo.bottom_sheet_icon_width)) && n51.f.a(java.lang.Integer.valueOf(this.bottom_sheet_icon_height), java.lang.Integer.valueOf(relievedBuyInfo.bottom_sheet_icon_height)) && n51.f.a(this.bottom_sheet_icon_desc, relievedBuyInfo.bottom_sheet_icon_desc) && n51.f.a(this.bottom_sheet_icon_desc_color, relievedBuyInfo.bottom_sheet_icon_desc_color);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.show_flag);
            fVar.g(2, 8, this.sub_info);
            java.lang.String str = this.subtitle;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.click_wording;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.click_url;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.icon_url;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.icon_width);
            fVar.e(8, this.icon_height);
            java.lang.String str5 = this.icon_desc;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.icon_desc_color;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.bottom_sheet_icon_url;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            fVar.e(12, this.bottom_sheet_icon_width);
            fVar.e(13, this.bottom_sheet_icon_height);
            java.lang.String str8 = this.bottom_sheet_icon_desc;
            if (str8 != null) {
                fVar.j(14, str8);
            }
            java.lang.String str9 = this.bottom_sheet_icon_desc_color;
            if (str9 != null) {
                fVar.j(15, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.show_flag) + 0 + b36.f.g(2, 8, this.sub_info);
            java.lang.String str10 = this.subtitle;
            if (str10 != null) {
                e17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.click_wording;
            if (str11 != null) {
                e17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.click_url;
            if (str12 != null) {
                e17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.icon_url;
            if (str13 != null) {
                e17 += b36.f.j(6, str13);
            }
            int e18 = e17 + b36.f.e(7, this.icon_width) + b36.f.e(8, this.icon_height);
            java.lang.String str14 = this.icon_desc;
            if (str14 != null) {
                e18 += b36.f.j(9, str14);
            }
            java.lang.String str15 = this.icon_desc_color;
            if (str15 != null) {
                e18 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.bottom_sheet_icon_url;
            if (str16 != null) {
                e18 += b36.f.j(11, str16);
            }
            int e19 = e18 + b36.f.e(12, this.bottom_sheet_icon_width) + b36.f.e(13, this.bottom_sheet_icon_height);
            java.lang.String str17 = this.bottom_sheet_icon_desc;
            if (str17 != null) {
                e19 += b36.f.j(14, str17);
            }
            java.lang.String str18 = this.bottom_sheet_icon_desc_color;
            return str18 != null ? e19 + b36.f.j(15, str18) : e19;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.sub_info.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        com.tencent.mm.protocal.protobuf.RelievedBuyInfo relievedBuyInfo = (com.tencent.mm.protocal.protobuf.RelievedBuyInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                relievedBuyInfo.show_flag = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    com.tencent.mm.protocal.protobuf.RelievedBuySubInfo relievedBuySubInfo = new com.tencent.mm.protocal.protobuf.RelievedBuySubInfo();
                    if (bArr2 != null && bArr2.length > 0) {
                        relievedBuySubInfo.parseFrom(bArr2);
                    }
                    relievedBuyInfo.sub_info.add(relievedBuySubInfo);
                }
                return 0;
            case 3:
                relievedBuyInfo.subtitle = aVar2.k(intValue);
                return 0;
            case 4:
                relievedBuyInfo.click_wording = aVar2.k(intValue);
                return 0;
            case 5:
                relievedBuyInfo.click_url = aVar2.k(intValue);
                return 0;
            case 6:
                relievedBuyInfo.icon_url = aVar2.k(intValue);
                return 0;
            case 7:
                relievedBuyInfo.icon_width = aVar2.g(intValue);
                return 0;
            case 8:
                relievedBuyInfo.icon_height = aVar2.g(intValue);
                return 0;
            case 9:
                relievedBuyInfo.icon_desc = aVar2.k(intValue);
                return 0;
            case 10:
                relievedBuyInfo.icon_desc_color = aVar2.k(intValue);
                return 0;
            case 11:
                relievedBuyInfo.bottom_sheet_icon_url = aVar2.k(intValue);
                return 0;
            case 12:
                relievedBuyInfo.bottom_sheet_icon_width = aVar2.g(intValue);
                return 0;
            case 13:
                relievedBuyInfo.bottom_sheet_icon_height = aVar2.g(intValue);
                return 0;
            case 14:
                relievedBuyInfo.bottom_sheet_icon_desc = aVar2.k(intValue);
                return 0;
            case 15:
                relievedBuyInfo.bottom_sheet_icon_desc_color = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mm.protocal.protobuf.RelievedBuyInfo setBottom_sheet_icon_desc(java.lang.String str) {
        this.bottom_sheet_icon_desc = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.RelievedBuyInfo setBottom_sheet_icon_desc_color(java.lang.String str) {
        this.bottom_sheet_icon_desc_color = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.RelievedBuyInfo setBottom_sheet_icon_height(int i17) {
        this.bottom_sheet_icon_height = i17;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.RelievedBuyInfo setBottom_sheet_icon_url(java.lang.String str) {
        this.bottom_sheet_icon_url = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.RelievedBuyInfo setBottom_sheet_icon_width(int i17) {
        this.bottom_sheet_icon_width = i17;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.RelievedBuyInfo setClick_url(java.lang.String str) {
        this.click_url = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.RelievedBuyInfo setClick_wording(java.lang.String str) {
        this.click_wording = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.RelievedBuyInfo setIcon_desc(java.lang.String str) {
        this.icon_desc = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.RelievedBuyInfo setIcon_desc_color(java.lang.String str) {
        this.icon_desc_color = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.RelievedBuyInfo setIcon_height(int i17) {
        this.icon_height = i17;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.RelievedBuyInfo setIcon_url(java.lang.String str) {
        this.icon_url = str;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.RelievedBuyInfo setIcon_width(int i17) {
        this.icon_width = i17;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.RelievedBuyInfo setShow_flag(int i17) {
        this.show_flag = i17;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.RelievedBuyInfo setSub_info(java.util.LinkedList<com.tencent.mm.protocal.protobuf.RelievedBuySubInfo> linkedList) {
        this.sub_info = linkedList;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.RelievedBuyInfo setSubtitle(java.lang.String str) {
        this.subtitle = str;
        return this;
    }
}
