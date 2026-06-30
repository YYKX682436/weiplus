package r45;

/* loaded from: classes2.dex */
public class bz2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371167d;

    /* renamed from: e, reason: collision with root package name */
    public r45.f03 f371168e;

    /* renamed from: f, reason: collision with root package name */
    public int f371169f;

    /* renamed from: g, reason: collision with root package name */
    public long f371170g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f371171h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bz2)) {
            return false;
        }
        r45.bz2 bz2Var = (r45.bz2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371167d), java.lang.Integer.valueOf(bz2Var.f371167d)) && n51.f.a(this.f371168e, bz2Var.f371168e) && n51.f.a(java.lang.Integer.valueOf(this.f371169f), java.lang.Integer.valueOf(bz2Var.f371169f)) && n51.f.a(java.lang.Long.valueOf(this.f371170g), java.lang.Long.valueOf(bz2Var.f371170g)) && n51.f.a(this.f371171h, bz2Var.f371171h);
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
                        case -1903650640:
                            if (next.equals("show_info")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -1310739582:
                            if (next.equals("tips_id")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -883261635:
                            if (next.equals("show_seconds")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 266611646:
                            if (next.equals("tab_tips_object_id")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 497087130:
                            if (next.equals("show_reddot")) {
                                c17 = 0;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f371167d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 1) {
                        java.lang.Object opt = jSONObject.opt(next);
                        if (opt instanceof org.json.JSONObject) {
                            r45.f03 f03Var = new r45.f03();
                            f03Var.fromJson(((org.json.JSONObject) opt).toString());
                            this.f371168e = f03Var;
                        }
                    } else if (c17 == 2) {
                        this.f371169f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 3) {
                        this.f371170g = jSONObject.optLong(next);
                    } else if (c17 == 4) {
                        this.f371171h = (java.lang.String) jSONObject.opt(next);
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
            fVar.e(1, this.f371167d);
            r45.f03 f03Var = this.f371168e;
            if (f03Var != null) {
                fVar.i(2, f03Var.computeSize());
                this.f371168e.writeFields(fVar);
            }
            fVar.e(3, this.f371169f);
            fVar.h(4, this.f371170g);
            java.lang.String str = this.f371171h;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f371167d) + 0;
            r45.f03 f03Var2 = this.f371168e;
            if (f03Var2 != null) {
                e17 += b36.f.i(2, f03Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(3, this.f371169f) + b36.f.h(4, this.f371170g);
            java.lang.String str2 = this.f371171h;
            return str2 != null ? e18 + b36.f.j(5, str2) : e18;
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
        r45.bz2 bz2Var = (r45.bz2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bz2Var.f371167d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                bz2Var.f371169f = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 4) {
                bz2Var.f371170g = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            bz2Var.f371171h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.f03 f03Var3 = new r45.f03();
            if (bArr != null && bArr.length > 0) {
                f03Var3.parseFrom(bArr);
            }
            bz2Var.f371168e = f03Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f371167d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "show_reddot", valueOf, true);
            eVar.d(jSONObject, "show_info", this.f371168e, true);
            eVar.d(jSONObject, "show_seconds", java.lang.Integer.valueOf(this.f371169f), true);
            eVar.d(jSONObject, "tab_tips_object_id", java.lang.Long.valueOf(this.f371170g), true);
            eVar.d(jSONObject, "tips_id", this.f371171h, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
