package r45;

/* loaded from: classes2.dex */
public class t60 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f386166d;

    /* renamed from: e, reason: collision with root package name */
    public r45.zo5 f386167e;

    /* renamed from: f, reason: collision with root package name */
    public int f386168f;

    /* renamed from: g, reason: collision with root package name */
    public int f386169g;

    /* renamed from: h, reason: collision with root package name */
    public int f386170h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t60)) {
            return false;
        }
        r45.t60 t60Var = (r45.t60) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f386166d), java.lang.Integer.valueOf(t60Var.f386166d)) && n51.f.a(this.f386167e, t60Var.f386167e) && n51.f.a(java.lang.Integer.valueOf(this.f386168f), java.lang.Integer.valueOf(t60Var.f386168f)) && n51.f.a(java.lang.Integer.valueOf(this.f386169g), java.lang.Integer.valueOf(t60Var.f386169g)) && n51.f.a(java.lang.Integer.valueOf(this.f386170h), java.lang.Integer.valueOf(t60Var.f386170h));
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
                        case -128421636:
                            if (next.equals("vertical_align")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 3321844:
                            if (next.equals("line")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 3530753:
                            if (next.equals("size")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 94842723:
                            if (next.equals("color")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 828740891:
                            if (next.equals("expected_line")) {
                                c17 = 4;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f386166d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 1) {
                        java.lang.Object opt = jSONObject.opt(next);
                        if (opt instanceof org.json.JSONObject) {
                            r45.zo5 zo5Var = new r45.zo5();
                            zo5Var.fromJson(((org.json.JSONObject) opt).toString());
                            this.f386167e = zo5Var;
                        }
                    } else if (c17 == 2) {
                        this.f386168f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 3) {
                        this.f386169g = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 4) {
                        this.f386170h = ((java.lang.Integer) jSONObject.opt(next)).intValue();
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
            fVar.e(1, this.f386166d);
            r45.zo5 zo5Var = this.f386167e;
            if (zo5Var != null) {
                fVar.i(2, zo5Var.computeSize());
                this.f386167e.writeFields(fVar);
            }
            fVar.e(3, this.f386168f);
            fVar.e(4, this.f386169g);
            fVar.e(5, this.f386170h);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f386166d) + 0;
            r45.zo5 zo5Var2 = this.f386167e;
            if (zo5Var2 != null) {
                e17 += b36.f.i(2, zo5Var2.computeSize());
            }
            return e17 + b36.f.e(3, this.f386168f) + b36.f.e(4, this.f386169g) + b36.f.e(5, this.f386170h);
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
        r45.t60 t60Var = (r45.t60) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            t60Var.f386166d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                t60Var.f386168f = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 4) {
                t60Var.f386169g = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            t60Var.f386170h = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.zo5 zo5Var3 = new r45.zo5();
            if (bArr != null && bArr.length > 0) {
                zo5Var3.parseFrom(bArr);
            }
            t60Var.f386167e = zo5Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f386166d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "size", valueOf, true);
            eVar.d(jSONObject, "color", this.f386167e, true);
            eVar.d(jSONObject, "line", java.lang.Integer.valueOf(this.f386168f), true);
            eVar.d(jSONObject, "vertical_align", java.lang.Integer.valueOf(this.f386169g), true);
            eVar.d(jSONObject, "expected_line", java.lang.Integer.valueOf(this.f386170h), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
