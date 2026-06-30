package r45;

/* loaded from: classes4.dex */
public class wm4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389277d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389278e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389279f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f389280g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f389281h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f389282i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f389283m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f389284n;

    /* renamed from: o, reason: collision with root package name */
    public int f389285o;

    /* renamed from: p, reason: collision with root package name */
    public int f389286p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f389287q;

    /* renamed from: r, reason: collision with root package name */
    public r45.bo f389288r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f389289s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wm4)) {
            return false;
        }
        r45.wm4 wm4Var = (r45.wm4) fVar;
        return n51.f.a(this.f389277d, wm4Var.f389277d) && n51.f.a(this.f389278e, wm4Var.f389278e) && n51.f.a(this.f389279f, wm4Var.f389279f) && n51.f.a(this.f389280g, wm4Var.f389280g) && n51.f.a(this.f389281h, wm4Var.f389281h) && n51.f.a(this.f389282i, wm4Var.f389282i) && n51.f.a(this.f389283m, wm4Var.f389283m) && n51.f.a(this.f389284n, wm4Var.f389284n) && n51.f.a(java.lang.Integer.valueOf(this.f389285o), java.lang.Integer.valueOf(wm4Var.f389285o)) && n51.f.a(java.lang.Integer.valueOf(this.f389286p), java.lang.Integer.valueOf(wm4Var.f389286p)) && n51.f.a(this.f389287q, wm4Var.f389287q) && n51.f.a(this.f389288r, wm4Var.f389288r) && n51.f.a(this.f389289s, wm4Var.f389289s);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f fromJson(java.lang.String str) {
        char c17;
        if (str != null && !"".equals(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    int i17 = 0;
                    switch (next.hashCode()) {
                        case -1215594452:
                            if (next.equals("marketing_tag_info")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -1210296322:
                            if (next.equals("is_price_begin_show")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case -873413996:
                            if (next.equals("brand_icon_url_dark")) {
                                c17 = '\f';
                                break;
                            }
                            break;
                        case -671925663:
                            if (next.equals("brand_icon_url")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case -154756992:
                            if (next.equals("guarantee_icon_url")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 255822726:
                            if (next.equals("market_price")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 317131841:
                            if (next.equals("is_market_price_show")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 435378657:
                            if (next.equals("guarantee_wording")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 537860823:
                            if (next.equals("platform_name")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 645073231:
                            if (next.equals("brand_icon_size")) {
                                c17 = 11;
                                break;
                            }
                            break;
                        case 1386652424:
                            if (next.equals("product_title")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 1862430963:
                            if (next.equals("selling_price_wording")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case 1901725594:
                            if (next.equals("selling_price")) {
                                c17 = 1;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f389277d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f389278e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f389279f = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 3:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (!(opt instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray = (org.json.JSONArray) opt;
                                while (i17 < jSONArray.length()) {
                                    this.f389280g.add((java.lang.String) jSONArray.get(i17));
                                    i17++;
                                }
                                break;
                            }
                        case 4:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray2 = (org.json.JSONArray) opt2;
                                while (i17 < jSONArray2.length()) {
                                    this.f389281h.add((java.lang.String) jSONArray2.get(i17));
                                    i17++;
                                }
                                break;
                            }
                        case 5:
                            this.f389282i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f389283m = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 7:
                            this.f389284n = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\b':
                            this.f389285o = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\t':
                            this.f389286p = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\n':
                            this.f389287q = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 11:
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (!(opt3 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.bo boVar = new r45.bo();
                                boVar.fromJson(((org.json.JSONObject) opt3).toString());
                                this.f389288r = boVar;
                                break;
                            }
                        case '\f':
                            this.f389289s = (java.lang.String) jSONObject.opt(next);
                            break;
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f389281h;
        java.util.LinkedList linkedList2 = this.f389280g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f389277d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f389278e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f389279f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.g(4, 1, linkedList2);
            fVar.g(5, 1, linkedList);
            java.lang.String str4 = this.f389282i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f389283m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f389284n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            fVar.e(9, this.f389285o);
            fVar.e(10, this.f389286p);
            java.lang.String str7 = this.f389287q;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            r45.bo boVar = this.f389288r;
            if (boVar != null) {
                fVar.i(12, boVar.computeSize());
                this.f389288r.writeFields(fVar);
            }
            java.lang.String str8 = this.f389289s;
            if (str8 != null) {
                fVar.j(13, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f389277d;
            int j17 = str9 != null ? b36.f.j(1, str9) + 0 : 0;
            java.lang.String str10 = this.f389278e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f389279f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            int g17 = j17 + b36.f.g(4, 1, linkedList2) + b36.f.g(5, 1, linkedList);
            java.lang.String str12 = this.f389282i;
            if (str12 != null) {
                g17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f389283m;
            if (str13 != null) {
                g17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f389284n;
            if (str14 != null) {
                g17 += b36.f.j(8, str14);
            }
            int e17 = g17 + b36.f.e(9, this.f389285o) + b36.f.e(10, this.f389286p);
            java.lang.String str15 = this.f389287q;
            if (str15 != null) {
                e17 += b36.f.j(11, str15);
            }
            r45.bo boVar2 = this.f389288r;
            if (boVar2 != null) {
                e17 += b36.f.i(12, boVar2.computeSize());
            }
            java.lang.String str16 = this.f389289s;
            return str16 != null ? e17 + b36.f.j(13, str16) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
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
        r45.wm4 wm4Var = (r45.wm4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                wm4Var.f389277d = aVar2.k(intValue);
                return 0;
            case 2:
                wm4Var.f389278e = aVar2.k(intValue);
                return 0;
            case 3:
                wm4Var.f389279f = aVar2.k(intValue);
                return 0;
            case 4:
                wm4Var.f389280g.add(aVar2.k(intValue));
                return 0;
            case 5:
                wm4Var.f389281h.add(aVar2.k(intValue));
                return 0;
            case 6:
                wm4Var.f389282i = aVar2.k(intValue);
                return 0;
            case 7:
                wm4Var.f389283m = aVar2.k(intValue);
                return 0;
            case 8:
                wm4Var.f389284n = aVar2.k(intValue);
                return 0;
            case 9:
                wm4Var.f389285o = aVar2.g(intValue);
                return 0;
            case 10:
                wm4Var.f389286p = aVar2.g(intValue);
                return 0;
            case 11:
                wm4Var.f389287q = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.bo boVar3 = new r45.bo();
                    if (bArr2 != null && bArr2.length > 0) {
                        boVar3.parseFrom(bArr2);
                    }
                    wm4Var.f389288r = boVar3;
                }
                return 0;
            case 13:
                wm4Var.f389289s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f389277d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "product_title", str, false);
            eVar.d(jSONObject, "selling_price", this.f389278e, false);
            eVar.d(jSONObject, "market_price", this.f389279f, false);
            eVar.d(jSONObject, "marketing_tag_info", this.f389280g, false);
            eVar.d(jSONObject, "guarantee_wording", this.f389281h, false);
            eVar.d(jSONObject, "platform_name", this.f389282i, false);
            eVar.d(jSONObject, "guarantee_icon_url", this.f389283m, false);
            eVar.d(jSONObject, "brand_icon_url", this.f389284n, false);
            eVar.d(jSONObject, "is_market_price_show", java.lang.Integer.valueOf(this.f389285o), false);
            eVar.d(jSONObject, "is_price_begin_show", java.lang.Integer.valueOf(this.f389286p), false);
            eVar.d(jSONObject, "selling_price_wording", this.f389287q, false);
            eVar.d(jSONObject, "brand_icon_size", this.f389288r, false);
            eVar.d(jSONObject, "brand_icon_url_dark", this.f389289s, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
