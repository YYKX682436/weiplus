package r45;

/* loaded from: classes4.dex */
public class nb0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381218d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381219e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381220f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381221g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381222h;

    /* renamed from: i, reason: collision with root package name */
    public r45.lz4 f381223i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f381224m;

    /* renamed from: n, reason: collision with root package name */
    public int f381225n;

    /* renamed from: o, reason: collision with root package name */
    public int f381226o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nb0)) {
            return false;
        }
        r45.nb0 nb0Var = (r45.nb0) fVar;
        return n51.f.a(this.f381218d, nb0Var.f381218d) && n51.f.a(this.f381219e, nb0Var.f381219e) && n51.f.a(this.f381220f, nb0Var.f381220f) && n51.f.a(this.f381221g, nb0Var.f381221g) && n51.f.a(this.f381222h, nb0Var.f381222h) && n51.f.a(this.f381223i, nb0Var.f381223i) && n51.f.a(this.f381224m, nb0Var.f381224m) && n51.f.a(java.lang.Integer.valueOf(this.f381225n), java.lang.Integer.valueOf(nb0Var.f381225n)) && n51.f.a(java.lang.Integer.valueOf(this.f381226o), java.lang.Integer.valueOf(nb0Var.f381226o));
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
                        case -1722607999:
                            if (next.equals("open_sdk_app_id_ios")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -1721287849:
                            if (next.equals("b_internal_jump_app_store")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case -660267064:
                            if (next.equals("open_app_half_screen_info")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -103254963:
                            if (next.equals("app_page_url_android")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 126245340:
                            if (next.equals("ulink_allow_no_prompt")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case 175756063:
                            if (next.equals("ulink_url")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 793212139:
                            if (next.equals("app_page_url_ios")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 1265457891:
                            if (next.equals("open_sdk_app_id_android")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 2001845878:
                            if (next.equals("deep_link_package_name")) {
                                c17 = 2;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f381218d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f381219e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f381220f = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 3:
                            this.f381221g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f381222h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (!(opt instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.lz4 lz4Var = new r45.lz4();
                                lz4Var.fromJson(((org.json.JSONObject) opt).toString());
                                this.f381223i = lz4Var;
                                break;
                            }
                        case 6:
                            this.f381224m = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 7:
                            this.f381225n = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\b':
                            this.f381226o = ((java.lang.Integer) jSONObject.opt(next)).intValue();
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
            java.lang.String str = this.f381218d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f381219e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f381220f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f381221g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f381222h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            r45.lz4 lz4Var = this.f381223i;
            if (lz4Var != null) {
                fVar.i(6, lz4Var.computeSize());
                this.f381223i.writeFields(fVar);
            }
            java.lang.String str6 = this.f381224m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            fVar.e(8, this.f381225n);
            fVar.e(9, this.f381226o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f381218d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f381219e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f381220f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f381221g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f381222h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            r45.lz4 lz4Var2 = this.f381223i;
            if (lz4Var2 != null) {
                j17 += b36.f.i(6, lz4Var2.computeSize());
            }
            java.lang.String str12 = this.f381224m;
            if (str12 != null) {
                j17 += b36.f.j(7, str12);
            }
            return j17 + b36.f.e(8, this.f381225n) + b36.f.e(9, this.f381226o);
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
        r45.nb0 nb0Var = (r45.nb0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                nb0Var.f381218d = aVar2.k(intValue);
                return 0;
            case 2:
                nb0Var.f381219e = aVar2.k(intValue);
                return 0;
            case 3:
                nb0Var.f381220f = aVar2.k(intValue);
                return 0;
            case 4:
                nb0Var.f381221g = aVar2.k(intValue);
                return 0;
            case 5:
                nb0Var.f381222h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.lz4 lz4Var3 = new r45.lz4();
                    if (bArr != null && bArr.length > 0) {
                        lz4Var3.parseFrom(bArr);
                    }
                    nb0Var.f381223i = lz4Var3;
                }
                return 0;
            case 7:
                nb0Var.f381224m = aVar2.k(intValue);
                return 0;
            case 8:
                nb0Var.f381225n = aVar2.g(intValue);
                return 0;
            case 9:
                nb0Var.f381226o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f381218d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "app_page_url_ios", str, false);
            eVar.d(jSONObject, "app_page_url_android", this.f381219e, false);
            eVar.d(jSONObject, "deep_link_package_name", this.f381220f, false);
            eVar.d(jSONObject, "open_sdk_app_id_ios", this.f381221g, false);
            eVar.d(jSONObject, "open_sdk_app_id_android", this.f381222h, false);
            eVar.d(jSONObject, "open_app_half_screen_info", this.f381223i, false);
            eVar.d(jSONObject, "ulink_url", this.f381224m, false);
            eVar.d(jSONObject, "ulink_allow_no_prompt", java.lang.Integer.valueOf(this.f381225n), false);
            eVar.d(jSONObject, "b_internal_jump_app_store", java.lang.Integer.valueOf(this.f381226o), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
