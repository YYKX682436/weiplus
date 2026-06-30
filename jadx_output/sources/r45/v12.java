package r45;

/* loaded from: classes4.dex */
public class v12 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387797d;

    /* renamed from: e, reason: collision with root package name */
    public int f387798e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387799f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387800g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f387801h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v12)) {
            return false;
        }
        r45.v12 v12Var = (r45.v12) fVar;
        return n51.f.a(this.f387797d, v12Var.f387797d) && n51.f.a(java.lang.Integer.valueOf(this.f387798e), java.lang.Integer.valueOf(v12Var.f387798e)) && n51.f.a(this.f387799f, v12Var.f387799f) && n51.f.a(this.f387800g, v12Var.f387800g) && n51.f.a(this.f387801h, v12Var.f387801h);
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
                        case -791766351:
                            if (next.equals("review_title")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 401088658:
                            if (next.equals("review_button_title")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 732656960:
                            if (next.equals("alert_show_seconds")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 1580530322:
                            if (next.equals("review_content")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 1615403742:
                            if (next.equals("alert_id")) {
                                c17 = 0;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f387797d = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 1) {
                        this.f387798e = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 2) {
                        this.f387799f = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 3) {
                        this.f387800g = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 4) {
                        this.f387801h = (java.lang.String) jSONObject.opt(next);
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
            java.lang.String str = this.f387797d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f387798e);
            java.lang.String str2 = this.f387799f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f387800g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f387801h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f387797d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.e(2, this.f387798e);
            java.lang.String str6 = this.f387799f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f387800g;
            if (str7 != null) {
                j17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f387801h;
            return str8 != null ? j17 + b36.f.j(5, str8) : j17;
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
        r45.v12 v12Var = (r45.v12) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            v12Var.f387797d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            v12Var.f387798e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            v12Var.f387799f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            v12Var.f387800g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        v12Var.f387801h = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f387797d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "alert_id", str, true);
            eVar.d(jSONObject, "alert_show_seconds", java.lang.Integer.valueOf(this.f387798e), true);
            eVar.d(jSONObject, "review_button_title", this.f387799f, true);
            eVar.d(jSONObject, "review_title", this.f387800g, true);
            eVar.d(jSONObject, "review_content", this.f387801h, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
