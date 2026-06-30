package r45;

/* loaded from: classes4.dex */
public class e10 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f372899d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372900e;

    /* renamed from: f, reason: collision with root package name */
    public int f372901f;

    /* renamed from: g, reason: collision with root package name */
    public int f372902g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e10)) {
            return false;
        }
        r45.e10 e10Var = (r45.e10) fVar;
        return n51.f.a(this.BaseRequest, e10Var.BaseRequest) && n51.f.a(this.f372899d, e10Var.f372899d) && n51.f.a(this.f372900e, e10Var.f372900e) && n51.f.a(java.lang.Integer.valueOf(this.f372901f), java.lang.Integer.valueOf(e10Var.f372901f)) && n51.f.a(java.lang.Integer.valueOf(this.f372902g), java.lang.Integer.valueOf(e10Var.f372902g));
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
                        case -1957276818:
                            if (next.equals("OPCode")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -1486671871:
                            if (next.equals("RandomEncryKey")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 2616251:
                            if (next.equals("UUID")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 770051678:
                            if (next.equals("BaseRequest")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 2029541590:
                            if (next.equals("TimeStamp")) {
                                c17 = 3;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        java.lang.Object opt = jSONObject.opt(next);
                        if (opt instanceof org.json.JSONObject) {
                            this.BaseRequest = (r45.he) new r45.he().fromJson(((org.json.JSONObject) opt).toString());
                        }
                    } else if (c17 == 1) {
                        java.lang.Object opt2 = jSONObject.opt(next);
                        if (opt2 instanceof org.json.JSONObject) {
                            this.f372899d = (r45.cu5) new r45.cu5().fromJson(((org.json.JSONObject) opt2).toString());
                        }
                    } else if (c17 == 2) {
                        this.f372900e = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 3) {
                        this.f372901f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 4) {
                        this.f372902g = ((java.lang.Integer) jSONObject.opt(next)).intValue();
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
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            r45.cu5 cu5Var = this.f372899d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f372899d.writeFields(fVar);
            }
            java.lang.String str = this.f372900e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f372901f);
            fVar.e(5, this.f372902g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.cu5 cu5Var2 = this.f372899d;
            if (cu5Var2 != null) {
                i18 += b36.f.i(2, cu5Var2.computeSize());
            }
            java.lang.String str2 = this.f372900e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.e(4, this.f372901f) + b36.f.e(5, this.f372902g);
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
        r45.e10 e10Var = (r45.e10) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                e10Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                e10Var.f372900e = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 4) {
                e10Var.f372901f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            e10Var.f372902g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr2 != null && bArr2.length > 0) {
                cu5Var3.b(bArr2);
            }
            e10Var.f372899d = cu5Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.he heVar = this.BaseRequest;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, "RandomEncryKey", this.f372899d, false);
            eVar.d(jSONObject, "UUID", this.f372900e, false);
            eVar.d(jSONObject, "TimeStamp", java.lang.Integer.valueOf(this.f372901f), false);
            eVar.d(jSONObject, "OPCode", java.lang.Integer.valueOf(this.f372902g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
