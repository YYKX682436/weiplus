package r45;

/* loaded from: classes4.dex */
public class ve1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388150d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388151e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f388152f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f388153g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ve1)) {
            return false;
        }
        r45.ve1 ve1Var = (r45.ve1) fVar;
        return n51.f.a(this.f388150d, ve1Var.f388150d) && n51.f.a(this.f388151e, ve1Var.f388151e) && n51.f.a(this.f388152f, ve1Var.f388152f) && n51.f.a(java.lang.Boolean.valueOf(this.f388153g), java.lang.Boolean.valueOf(ve1Var.f388153g));
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
                        case -1933542537:
                            if (next.equals("agreement_update_title")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -1350800053:
                            if (next.equals("agreement_items")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -613876125:
                            if (next.equals("enable_backend_agreement")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -449723944:
                            if (next.equals("agreement_update_content")) {
                                c17 = 1;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f388150d = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 1) {
                        this.f388151e = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 2) {
                        java.lang.Object opt = jSONObject.opt(next);
                        if (opt instanceof org.json.JSONArray) {
                            org.json.JSONArray jSONArray = (org.json.JSONArray) opt;
                            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                                java.lang.Object obj = jSONArray.get(i17);
                                if (obj instanceof org.json.JSONObject) {
                                    java.util.LinkedList linkedList = this.f388152f;
                                    r45.s6 s6Var = new r45.s6();
                                    s6Var.fromJson(((org.json.JSONObject) obj).toString());
                                    linkedList.add(s6Var);
                                }
                            }
                        }
                    } else if (c17 == 3) {
                        this.f388153g = ((java.lang.Boolean) jSONObject.opt(next)).booleanValue();
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f388152f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388150d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f388151e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList);
            fVar.a(4, this.f388153g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f388150d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f388151e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.g(3, 8, linkedList) + b36.f.a(4, this.f388153g);
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
        r45.ve1 ve1Var = (r45.ve1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ve1Var.f388150d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ve1Var.f388151e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            ve1Var.f388153g = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.s6 s6Var = new r45.s6();
            if (bArr2 != null && bArr2.length > 0) {
                s6Var.parseFrom(bArr2);
            }
            ve1Var.f388152f.add(s6Var);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f388150d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "agreement_update_title", str, true);
            eVar.d(jSONObject, "agreement_update_content", this.f388151e, true);
            eVar.d(jSONObject, "agreement_items", this.f388152f, true);
            eVar.d(jSONObject, "enable_backend_agreement", java.lang.Boolean.valueOf(this.f388153g), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
