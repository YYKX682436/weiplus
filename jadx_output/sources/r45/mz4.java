package r45;

/* loaded from: classes4.dex */
public class mz4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380943d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380944e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380945f;

    /* renamed from: g, reason: collision with root package name */
    public int f380946g;

    /* renamed from: h, reason: collision with root package name */
    public int f380947h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380948i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f380949m = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mz4)) {
            return false;
        }
        r45.mz4 mz4Var = (r45.mz4) fVar;
        return n51.f.a(this.f380943d, mz4Var.f380943d) && n51.f.a(this.f380944e, mz4Var.f380944e) && n51.f.a(this.f380945f, mz4Var.f380945f) && n51.f.a(java.lang.Integer.valueOf(this.f380946g), java.lang.Integer.valueOf(mz4Var.f380946g)) && n51.f.a(java.lang.Integer.valueOf(this.f380947h), java.lang.Integer.valueOf(mz4Var.f380947h)) && n51.f.a(this.f380948i, mz4Var.f380948i) && n51.f.a(this.f380949m, mz4Var.f380949m);
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
                        case 77933481:
                            if (next.equals("expand_click_area")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 921718240:
                            if (next.equals("app_image_list")) {
                                c17 = 6;
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
                                c17 = 4;
                                break;
                            }
                            break;
                        case 1167354351:
                            if (next.equals("app_desc")) {
                                c17 = 5;
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
                            this.f380943d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f380944e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f380945f = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 3:
                            this.f380946g = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 4:
                            this.f380947h = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 5:
                            this.f380948i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (opt instanceof org.json.JSONArray) {
                                org.json.JSONArray jSONArray = (org.json.JSONArray) opt;
                                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                                    this.f380949m.add((java.lang.String) jSONArray.get(i17));
                                }
                                break;
                            } else {
                                break;
                            }
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f380949m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380943d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f380944e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f380945f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f380946g);
            fVar.e(5, this.f380947h);
            java.lang.String str4 = this.f380948i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.g(7, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f380943d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f380944e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f380945f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int e17 = j17 + b36.f.e(4, this.f380946g) + b36.f.e(5, this.f380947h);
            java.lang.String str8 = this.f380948i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            return e17 + b36.f.g(7, 1, linkedList);
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
        r45.mz4 mz4Var = (r45.mz4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mz4Var.f380943d = aVar2.k(intValue);
                return 0;
            case 2:
                mz4Var.f380944e = aVar2.k(intValue);
                return 0;
            case 3:
                mz4Var.f380945f = aVar2.k(intValue);
                return 0;
            case 4:
                mz4Var.f380946g = aVar2.g(intValue);
                return 0;
            case 5:
                mz4Var.f380947h = aVar2.g(intValue);
                return 0;
            case 6:
                mz4Var.f380948i = aVar2.k(intValue);
                return 0;
            case 7:
                mz4Var.f380949m.add(aVar2.k(intValue));
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f380943d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "app_icon", str, false);
            eVar.d(jSONObject, "app_name", this.f380944e, false);
            eVar.d(jSONObject, "btn_title", this.f380945f, false);
            eVar.d(jSONObject, "expand_click_area", java.lang.Integer.valueOf(this.f380946g), false);
            eVar.d(jSONObject, "forbid_tap_bg_to_close", java.lang.Integer.valueOf(this.f380947h), false);
            eVar.d(jSONObject, "app_desc", this.f380948i, false);
            eVar.d(jSONObject, "app_image_list", this.f380949m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
