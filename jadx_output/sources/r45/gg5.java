package r45;

/* loaded from: classes4.dex */
public class gg5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375233d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375234e;

    /* renamed from: f, reason: collision with root package name */
    public int f375235f;

    /* renamed from: g, reason: collision with root package name */
    public int f375236g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gg5)) {
            return false;
        }
        r45.gg5 gg5Var = (r45.gg5) fVar;
        return n51.f.a(this.f375233d, gg5Var.f375233d) && n51.f.a(this.f375234e, gg5Var.f375234e) && n51.f.a(java.lang.Integer.valueOf(this.f375235f), java.lang.Integer.valueOf(gg5Var.f375235f)) && n51.f.a(java.lang.Integer.valueOf(this.f375236g), java.lang.Integer.valueOf(gg5Var.f375236g));
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
                        case -1540862722:
                            if (next.equals("qr_result_type")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -951645615:
                            if (next.equals("qr_url")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -543709538:
                            if (next.equals("need_update_qr_url")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 439171178:
                            if (next.equals("qr_ext_info")) {
                                c17 = 1;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f375233d = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 1) {
                        this.f375234e = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 2) {
                        this.f375235f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 3) {
                        this.f375236g = ((java.lang.Integer) jSONObject.opt(next)).intValue();
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
            java.lang.String str = this.f375233d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f375234e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f375235f);
            fVar.e(4, this.f375236g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f375233d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f375234e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f375235f) + b36.f.e(4, this.f375236g);
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
        r45.gg5 gg5Var = (r45.gg5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gg5Var.f375233d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            gg5Var.f375234e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            gg5Var.f375235f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        gg5Var.f375236g = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f375233d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "qr_url", str, false);
            eVar.d(jSONObject, "qr_ext_info", this.f375234e, false);
            eVar.d(jSONObject, "need_update_qr_url", java.lang.Integer.valueOf(this.f375235f), false);
            eVar.d(jSONObject, "qr_result_type", java.lang.Integer.valueOf(this.f375236g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
