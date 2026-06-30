package r45;

/* loaded from: classes4.dex */
public class lz4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379998d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379999e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380000f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380001g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380002h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380003i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f380004m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f380005n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public int f380006o;

    /* renamed from: p, reason: collision with root package name */
    public int f380007p;

    /* renamed from: q, reason: collision with root package name */
    public int f380008q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lz4)) {
            return false;
        }
        r45.lz4 lz4Var = (r45.lz4) fVar;
        return n51.f.a(this.f379998d, lz4Var.f379998d) && n51.f.a(this.f379999e, lz4Var.f379999e) && n51.f.a(this.f380000f, lz4Var.f380000f) && n51.f.a(this.f380001g, lz4Var.f380001g) && n51.f.a(this.f380002h, lz4Var.f380002h) && n51.f.a(this.f380003i, lz4Var.f380003i) && n51.f.a(this.f380004m, lz4Var.f380004m) && n51.f.a(this.f380005n, lz4Var.f380005n) && n51.f.a(java.lang.Integer.valueOf(this.f380006o), java.lang.Integer.valueOf(lz4Var.f380006o)) && n51.f.a(java.lang.Integer.valueOf(this.f380007p), java.lang.Integer.valueOf(lz4Var.f380007p)) && n51.f.a(java.lang.Integer.valueOf(this.f380008q), java.lang.Integer.valueOf(lz4Var.f380008q));
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
                        case -678315036:
                            if (next.equals("button_wider_style")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case 77933481:
                            if (next.equals("expand_click_area")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 109780401:
                            if (next.equals("style")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 110367737:
                            if (next.equals("tips1")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 110367738:
                            if (next.equals("tips2")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 921718240:
                            if (next.equals("app_image_list")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case 936955573:
                            if (next.equals("btn_title")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 1091086503:
                            if (next.equals("forbid_tap_bg_to_close")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case 1167354351:
                            if (next.equals("app_desc")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 1167501271:
                            if (next.equals("app_icon")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 1167648233:
                            if (next.equals("app_name")) {
                                c17 = 1;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f379998d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f379999e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f380000f = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 3:
                            this.f380001g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f380002h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f380003i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f380004m = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 7:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (opt instanceof org.json.JSONArray) {
                                org.json.JSONArray jSONArray = (org.json.JSONArray) opt;
                                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                                    this.f380005n.add((java.lang.String) jSONArray.get(i17));
                                }
                                break;
                            } else {
                                break;
                            }
                        case '\b':
                            this.f380006o = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\t':
                            this.f380007p = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\n':
                            this.f380008q = ((java.lang.Integer) jSONObject.opt(next)).intValue();
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
        java.util.LinkedList linkedList = this.f380005n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379998d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f379999e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f380000f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f380001g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f380002h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f380003i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f380004m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            fVar.g(8, 1, linkedList);
            fVar.e(9, this.f380006o);
            fVar.e(10, this.f380007p);
            fVar.e(11, this.f380008q);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f379998d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f379999e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f380000f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f380001g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f380002h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f380003i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f380004m;
            if (str14 != null) {
                j17 += b36.f.j(7, str14);
            }
            return j17 + b36.f.g(8, 1, linkedList) + b36.f.e(9, this.f380006o) + b36.f.e(10, this.f380007p) + b36.f.e(11, this.f380008q);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.lz4 lz4Var = (r45.lz4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lz4Var.f379998d = aVar2.k(intValue);
                return 0;
            case 2:
                lz4Var.f379999e = aVar2.k(intValue);
                return 0;
            case 3:
                lz4Var.f380000f = aVar2.k(intValue);
                return 0;
            case 4:
                lz4Var.f380001g = aVar2.k(intValue);
                return 0;
            case 5:
                lz4Var.f380002h = aVar2.k(intValue);
                return 0;
            case 6:
                lz4Var.f380003i = aVar2.k(intValue);
                return 0;
            case 7:
                lz4Var.f380004m = aVar2.k(intValue);
                return 0;
            case 8:
                lz4Var.f380005n.add(aVar2.k(intValue));
                return 0;
            case 9:
                lz4Var.f380006o = aVar2.g(intValue);
                return 0;
            case 10:
                lz4Var.f380007p = aVar2.g(intValue);
                return 0;
            case 11:
                lz4Var.f380008q = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f379998d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "app_icon", str, false);
            eVar.d(jSONObject, "app_name", this.f379999e, false);
            eVar.d(jSONObject, "btn_title", this.f380000f, false);
            eVar.d(jSONObject, "tips1", this.f380001g, false);
            eVar.d(jSONObject, "tips2", this.f380002h, false);
            eVar.d(jSONObject, "style", this.f380003i, false);
            eVar.d(jSONObject, "app_desc", this.f380004m, false);
            eVar.d(jSONObject, "app_image_list", this.f380005n, false);
            eVar.d(jSONObject, "expand_click_area", java.lang.Integer.valueOf(this.f380006o), false);
            eVar.d(jSONObject, "button_wider_style", java.lang.Integer.valueOf(this.f380007p), false);
            eVar.d(jSONObject, "forbid_tap_bg_to_close", java.lang.Integer.valueOf(this.f380008q), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
