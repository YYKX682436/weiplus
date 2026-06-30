package r45;

/* loaded from: classes4.dex */
public class rf0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384787d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384788e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384789f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384790g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384791h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f384792i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f384793m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f384794n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f384795o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f384796p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f384797q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f384798r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rf0)) {
            return false;
        }
        r45.rf0 rf0Var = (r45.rf0) fVar;
        return n51.f.a(this.f384787d, rf0Var.f384787d) && n51.f.a(this.f384788e, rf0Var.f384788e) && n51.f.a(this.f384789f, rf0Var.f384789f) && n51.f.a(this.f384790g, rf0Var.f384790g) && n51.f.a(this.f384791h, rf0Var.f384791h) && n51.f.a(this.f384792i, rf0Var.f384792i) && n51.f.a(this.f384793m, rf0Var.f384793m) && n51.f.a(this.f384794n, rf0Var.f384794n) && n51.f.a(this.f384795o, rf0Var.f384795o) && n51.f.a(this.f384796p, rf0Var.f384796p) && n51.f.a(this.f384797q, rf0Var.f384797q) && n51.f.a(this.f384798r, rf0Var.f384798r);
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
                        case -2115358278:
                            if (next.equals("agreement_url")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case -1535794573:
                            if (next.equals("authority_url")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case -1108336905:
                            if (next.equals("record_number")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case -901870406:
                            if (next.equals("app_version")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -80681014:
                            if (next.equals("developer")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 107902:
                            if (next.equals("md5")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 712986815:
                            if (next.equals("author_name")) {
                                c17 = 11;
                                break;
                            }
                            break;
                        case 814534431:
                            if (next.equals("app_desc_url")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 1022406311:
                            if (next.equals("suitable_age")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case 1109408056:
                            if (next.equals("download_url")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 1167501271:
                            if (next.equals("app_icon")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 1167648233:
                            if (next.equals("app_name")) {
                                c17 = 0;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f384787d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f384788e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f384789f = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 3:
                            this.f384790g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f384791h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f384792i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f384793m = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 7:
                            this.f384794n = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\b':
                            this.f384795o = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\t':
                            this.f384796p = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\n':
                            this.f384797q = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 11:
                            this.f384798r = (java.lang.String) jSONObject.opt(next);
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
            java.lang.String str = this.f384787d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f384788e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f384789f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f384790g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f384791h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f384792i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f384793m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f384794n;
            if (str8 != null) {
                fVar.j(8, str8);
            }
            java.lang.String str9 = this.f384795o;
            if (str9 != null) {
                fVar.j(9, str9);
            }
            java.lang.String str10 = this.f384796p;
            if (str10 != null) {
                fVar.j(10, str10);
            }
            java.lang.String str11 = this.f384797q;
            if (str11 != null) {
                fVar.j(11, str11);
            }
            java.lang.String str12 = this.f384798r;
            if (str12 != null) {
                fVar.j(12, str12);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str13 = this.f384787d;
            int j17 = str13 != null ? 0 + b36.f.j(1, str13) : 0;
            java.lang.String str14 = this.f384788e;
            if (str14 != null) {
                j17 += b36.f.j(2, str14);
            }
            java.lang.String str15 = this.f384789f;
            if (str15 != null) {
                j17 += b36.f.j(3, str15);
            }
            java.lang.String str16 = this.f384790g;
            if (str16 != null) {
                j17 += b36.f.j(4, str16);
            }
            java.lang.String str17 = this.f384791h;
            if (str17 != null) {
                j17 += b36.f.j(5, str17);
            }
            java.lang.String str18 = this.f384792i;
            if (str18 != null) {
                j17 += b36.f.j(6, str18);
            }
            java.lang.String str19 = this.f384793m;
            if (str19 != null) {
                j17 += b36.f.j(7, str19);
            }
            java.lang.String str20 = this.f384794n;
            if (str20 != null) {
                j17 += b36.f.j(8, str20);
            }
            java.lang.String str21 = this.f384795o;
            if (str21 != null) {
                j17 += b36.f.j(9, str21);
            }
            java.lang.String str22 = this.f384796p;
            if (str22 != null) {
                j17 += b36.f.j(10, str22);
            }
            java.lang.String str23 = this.f384797q;
            if (str23 != null) {
                j17 += b36.f.j(11, str23);
            }
            java.lang.String str24 = this.f384798r;
            return str24 != null ? j17 + b36.f.j(12, str24) : j17;
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
        r45.rf0 rf0Var = (r45.rf0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rf0Var.f384787d = aVar2.k(intValue);
                return 0;
            case 2:
                rf0Var.f384788e = aVar2.k(intValue);
                return 0;
            case 3:
                rf0Var.f384789f = aVar2.k(intValue);
                return 0;
            case 4:
                rf0Var.f384790g = aVar2.k(intValue);
                return 0;
            case 5:
                rf0Var.f384791h = aVar2.k(intValue);
                return 0;
            case 6:
                rf0Var.f384792i = aVar2.k(intValue);
                return 0;
            case 7:
                rf0Var.f384793m = aVar2.k(intValue);
                return 0;
            case 8:
                rf0Var.f384794n = aVar2.k(intValue);
                return 0;
            case 9:
                rf0Var.f384795o = aVar2.k(intValue);
                return 0;
            case 10:
                rf0Var.f384796p = aVar2.k(intValue);
                return 0;
            case 11:
                rf0Var.f384797q = aVar2.k(intValue);
                return 0;
            case 12:
                rf0Var.f384798r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f384787d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "app_name", str, false);
            eVar.d(jSONObject, "app_icon", this.f384788e, false);
            eVar.d(jSONObject, "md5", this.f384789f, false);
            eVar.d(jSONObject, "download_url", this.f384790g, false);
            eVar.d(jSONObject, "app_version", this.f384791h, false);
            eVar.d(jSONObject, "developer", this.f384792i, false);
            eVar.d(jSONObject, "authority_url", this.f384793m, false);
            eVar.d(jSONObject, "agreement_url", this.f384794n, false);
            eVar.d(jSONObject, "app_desc_url", this.f384795o, false);
            eVar.d(jSONObject, "record_number", this.f384796p, false);
            eVar.d(jSONObject, "suitable_age", this.f384797q, false);
            eVar.d(jSONObject, "author_name", this.f384798r, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
