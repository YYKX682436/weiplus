package r45;

/* loaded from: classes4.dex */
public class gr0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375492d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375493e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375494f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f375495g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f375496h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f375497i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f375498m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f375499n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f375500o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f375501p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gr0)) {
            return false;
        }
        r45.gr0 gr0Var = (r45.gr0) fVar;
        return n51.f.a(this.f375492d, gr0Var.f375492d) && n51.f.a(this.f375493e, gr0Var.f375493e) && n51.f.a(this.f375494f, gr0Var.f375494f) && n51.f.a(this.f375495g, gr0Var.f375495g) && n51.f.a(this.f375496h, gr0Var.f375496h) && n51.f.a(this.f375497i, gr0Var.f375497i) && n51.f.a(this.f375498m, gr0Var.f375498m) && n51.f.a(this.f375499n, gr0Var.f375499n) && n51.f.a(this.f375500o, gr0Var.f375500o) && n51.f.a(this.f375501p, gr0Var.f375501p);
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
                    switch (next.hashCode()) {
                        case 116079:
                            if (next.equals("url")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 1111518510:
                            if (next.equals("expand_inside_title_en")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case 1111518984:
                            if (next.equals("expand_inside_title_tw")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 1111519155:
                            if (next.equals("expand_inside_title_zh")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case 1471668303:
                            if (next.equals("expand_outside_title_en")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 1471668777:
                            if (next.equals("expand_outside_title_tw")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 1471668948:
                            if (next.equals("expand_outside_title_zh")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 2104495536:
                            if (next.equals("wording_en")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 2104496010:
                            if (next.equals("wording_tw")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 2104496181:
                            if (next.equals("wording_zh")) {
                                c17 = 1;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f375492d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f375493e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f375494f = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 3:
                            this.f375495g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f375496h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f375497i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f375498m = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 7:
                            this.f375499n = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\b':
                            this.f375500o = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\t':
                            this.f375501p = (java.lang.String) jSONObject.opt(next);
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
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f375492d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f375493e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f375494f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f375495g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f375496h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f375497i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f375498m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f375499n;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            java.lang.String str9 = this.f375500o;
            if (str9 != null) {
                fVar.j(10, str9);
            }
            java.lang.String str10 = this.f375501p;
            if (str10 != null) {
                fVar.j(11, str10);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f375492d;
            int j17 = str11 != null ? 0 + b36.f.j(1, str11) : 0;
            java.lang.String str12 = this.f375493e;
            if (str12 != null) {
                j17 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f375494f;
            if (str13 != null) {
                j17 += b36.f.j(4, str13);
            }
            java.lang.String str14 = this.f375495g;
            if (str14 != null) {
                j17 += b36.f.j(5, str14);
            }
            java.lang.String str15 = this.f375496h;
            if (str15 != null) {
                j17 += b36.f.j(6, str15);
            }
            java.lang.String str16 = this.f375497i;
            if (str16 != null) {
                j17 += b36.f.j(7, str16);
            }
            java.lang.String str17 = this.f375498m;
            if (str17 != null) {
                j17 += b36.f.j(8, str17);
            }
            java.lang.String str18 = this.f375499n;
            if (str18 != null) {
                j17 += b36.f.j(9, str18);
            }
            java.lang.String str19 = this.f375500o;
            if (str19 != null) {
                j17 += b36.f.j(10, str19);
            }
            java.lang.String str20 = this.f375501p;
            return str20 != null ? j17 + b36.f.j(11, str20) : j17;
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
        r45.gr0 gr0Var = (r45.gr0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                gr0Var.f375492d = aVar2.k(intValue);
                return 0;
            case 2:
            default:
                return -1;
            case 3:
                gr0Var.f375493e = aVar2.k(intValue);
                return 0;
            case 4:
                gr0Var.f375494f = aVar2.k(intValue);
                return 0;
            case 5:
                gr0Var.f375495g = aVar2.k(intValue);
                return 0;
            case 6:
                gr0Var.f375496h = aVar2.k(intValue);
                return 0;
            case 7:
                gr0Var.f375497i = aVar2.k(intValue);
                return 0;
            case 8:
                gr0Var.f375498m = aVar2.k(intValue);
                return 0;
            case 9:
                gr0Var.f375499n = aVar2.k(intValue);
                return 0;
            case 10:
                gr0Var.f375500o = aVar2.k(intValue);
                return 0;
            case 11:
                gr0Var.f375501p = aVar2.k(intValue);
                return 0;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f375492d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "url", str, false);
            eVar.d(jSONObject, "wording_zh", this.f375493e, false);
            eVar.d(jSONObject, "wording_tw", this.f375494f, false);
            eVar.d(jSONObject, "wording_en", this.f375495g, false);
            eVar.d(jSONObject, "expand_outside_title_zh", this.f375496h, false);
            eVar.d(jSONObject, "expand_outside_title_tw", this.f375497i, false);
            eVar.d(jSONObject, "expand_outside_title_en", this.f375498m, false);
            eVar.d(jSONObject, "expand_inside_title_zh", this.f375499n, false);
            eVar.d(jSONObject, "expand_inside_title_tw", this.f375500o, false);
            eVar.d(jSONObject, "expand_inside_title_en", this.f375501p, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
