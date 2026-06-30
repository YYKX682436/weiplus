package r45;

/* loaded from: classes2.dex */
public class tm4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386571d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386572e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386573f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386574g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386575h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f386576i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f386577m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tm4)) {
            return false;
        }
        r45.tm4 tm4Var = (r45.tm4) fVar;
        return n51.f.a(this.f386571d, tm4Var.f386571d) && n51.f.a(this.f386572e, tm4Var.f386572e) && n51.f.a(this.f386573f, tm4Var.f386573f) && n51.f.a(this.f386574g, tm4Var.f386574g) && n51.f.a(this.f386575h, tm4Var.f386575h) && n51.f.a(this.f386576i, tm4Var.f386576i) && n51.f.a(this.f386577m, tm4Var.f386577m);
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
                        case -265713450:
                            if (next.equals(dm.i4.COL_USERNAME)) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -206642229:
                            if (next.equals("ecs_jump_info_base64_str")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 3433509:
                            if (next.equals(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH)) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 37109963:
                            if (next.equals("request_id")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 1599514594:
                            if (next.equals("preload_flag")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 1753008747:
                            if (next.equals("product_id")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 2067081988:
                            if (next.equals("shop_id")) {
                                c17 = 1;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f386571d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f386572e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f386573f = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 3:
                            this.f386574g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f386575h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f386576i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f386577m = (java.lang.String) jSONObject.opt(next);
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
            java.lang.String str = this.f386571d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f386572e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f386573f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f386574g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f386575h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f386576i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f386577m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f386571d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f386572e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f386573f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f386574g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f386575h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f386576i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f386577m;
            return str14 != null ? j17 + b36.f.j(7, str14) : j17;
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
        r45.tm4 tm4Var = (r45.tm4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tm4Var.f386571d = aVar2.k(intValue);
                return 0;
            case 2:
                tm4Var.f386572e = aVar2.k(intValue);
                return 0;
            case 3:
                tm4Var.f386573f = aVar2.k(intValue);
                return 0;
            case 4:
                tm4Var.f386574g = aVar2.k(intValue);
                return 0;
            case 5:
                tm4Var.f386575h = aVar2.k(intValue);
                return 0;
            case 6:
                tm4Var.f386576i = aVar2.k(intValue);
                return 0;
            case 7:
                tm4Var.f386577m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f386571d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "product_id", str, false);
            eVar.d(jSONObject, "shop_id", this.f386572e, false);
            eVar.d(jSONObject, dm.i4.COL_USERNAME, this.f386573f, false);
            eVar.d(jSONObject, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, this.f386574g, false);
            eVar.d(jSONObject, "request_id", this.f386575h, false);
            eVar.d(jSONObject, "preload_flag", this.f386576i, false);
            eVar.d(jSONObject, "ecs_jump_info_base64_str", this.f386577m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
