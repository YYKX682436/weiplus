package r45;

/* loaded from: classes4.dex */
public class qi4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384020d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f384021e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f384022f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384023g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384024h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qi4)) {
            return false;
        }
        r45.qi4 qi4Var = (r45.qi4) fVar;
        return n51.f.a(this.f384020d, qi4Var.f384020d) && n51.f.a(this.f384021e, qi4Var.f384021e) && n51.f.a(this.f384022f, qi4Var.f384022f) && n51.f.a(this.f384023g, qi4Var.f384023g) && n51.f.a(this.f384024h, qi4Var.f384024h);
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
                        case -2060540888:
                            if (next.equals("app_package")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -587422972:
                            if (next.equals("market_schema")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 93997959:
                            if (next.equals("brand")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 285271214:
                            if (next.equals("market_name")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 540504899:
                            if (next.equals("market_package")) {
                                c17 = 2;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f384020d = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 1) {
                        java.lang.Object opt = jSONObject.opt(next);
                        if (opt instanceof org.json.JSONArray) {
                            org.json.JSONArray jSONArray = (org.json.JSONArray) opt;
                            while (i17 < jSONArray.length()) {
                                this.f384021e.add((java.lang.String) jSONArray.get(i17));
                                i17++;
                            }
                        }
                    } else if (c17 == 2) {
                        java.lang.Object opt2 = jSONObject.opt(next);
                        if (opt2 instanceof org.json.JSONArray) {
                            org.json.JSONArray jSONArray2 = (org.json.JSONArray) opt2;
                            while (i17 < jSONArray2.length()) {
                                this.f384022f.add((java.lang.String) jSONArray2.get(i17));
                                i17++;
                            }
                        }
                    } else if (c17 == 3) {
                        this.f384023g = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 4) {
                        this.f384024h = (java.lang.String) jSONObject.opt(next);
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f384022f;
        java.util.LinkedList linkedList2 = this.f384021e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f384020d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 1, linkedList2);
            fVar.g(3, 1, linkedList);
            java.lang.String str2 = this.f384023g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f384024h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f384020d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.g(2, 1, linkedList2) + b36.f.g(3, 1, linkedList);
            java.lang.String str5 = this.f384023g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f384024h;
            return str6 != null ? j17 + b36.f.j(5, str6) : j17;
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
        r45.qi4 qi4Var = (r45.qi4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qi4Var.f384020d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            qi4Var.f384021e.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            qi4Var.f384022f.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 4) {
            qi4Var.f384023g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        qi4Var.f384024h = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f384020d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "brand", str, false);
            eVar.d(jSONObject, "market_schema", this.f384021e, false);
            eVar.d(jSONObject, "market_package", this.f384022f, false);
            eVar.d(jSONObject, "app_package", this.f384023g, false);
            eVar.d(jSONObject, "market_name", this.f384024h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
