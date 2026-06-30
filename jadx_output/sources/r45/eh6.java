package r45;

/* loaded from: classes2.dex */
public class eh6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373501d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373502e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373503f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f373504g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373505h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f373506i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.eh6)) {
            return false;
        }
        r45.eh6 eh6Var = (r45.eh6) fVar;
        return n51.f.a(this.f373501d, eh6Var.f373501d) && n51.f.a(this.f373502e, eh6Var.f373502e) && n51.f.a(this.f373503f, eh6Var.f373503f) && n51.f.a(this.f373504g, eh6Var.f373504g) && n51.f.a(this.f373505h, eh6Var.f373505h) && n51.f.a(this.f373506i, eh6Var.f373506i);
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
                        case -2090050568:
                            if (next.equals("subTitle")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -1878095475:
                            if (next.equals("darkColor")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -1715118778:
                            if (next.equals("iconLightColor")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -234567699:
                            if (next.equals("lightColor")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 1537828116:
                            if (next.equals("iconDarkColor")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 1638765110:
                            if (next.equals("iconUrl")) {
                                c17 = 1;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f373501d = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 1) {
                        this.f373502e = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 2) {
                        this.f373503f = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 3) {
                        this.f373504g = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 4) {
                        this.f373505h = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 5) {
                        this.f373506i = (java.lang.String) jSONObject.opt(next);
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
            java.lang.String str = this.f373501d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f373502e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f373503f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f373504g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f373505h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f373506i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f373501d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f373502e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f373503f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f373504g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f373505h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f373506i;
            return str12 != null ? j17 + b36.f.j(6, str12) : j17;
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
        r45.eh6 eh6Var = (r45.eh6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                eh6Var.f373501d = aVar2.k(intValue);
                return 0;
            case 2:
                eh6Var.f373502e = aVar2.k(intValue);
                return 0;
            case 3:
                eh6Var.f373503f = aVar2.k(intValue);
                return 0;
            case 4:
                eh6Var.f373504g = aVar2.k(intValue);
                return 0;
            case 5:
                eh6Var.f373505h = aVar2.k(intValue);
                return 0;
            case 6:
                eh6Var.f373506i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f373501d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "subTitle", str, true);
            eVar.d(jSONObject, "iconUrl", this.f373502e, true);
            eVar.d(jSONObject, "lightColor", this.f373503f, true);
            eVar.d(jSONObject, "darkColor", this.f373504g, true);
            eVar.d(jSONObject, "iconLightColor", this.f373505h, true);
            eVar.d(jSONObject, "iconDarkColor", this.f373506i, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
