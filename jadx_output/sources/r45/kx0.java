package r45;

/* loaded from: classes2.dex */
public class kx0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f379011d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379012e;

    /* renamed from: f, reason: collision with root package name */
    public int f379013f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kx0)) {
            return false;
        }
        r45.kx0 kx0Var = (r45.kx0) fVar;
        return n51.f.a(this.BaseRequest, kx0Var.BaseRequest) && n51.f.a(this.f379011d, kx0Var.f379011d) && n51.f.a(this.f379012e, kx0Var.f379012e) && n51.f.a(java.lang.Integer.valueOf(this.f379013f), java.lang.Integer.valueOf(kx0Var.f379013f));
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
                        case -559170823:
                            if (next.equals("settlement_mode")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -216295364:
                            if (next.equals("my_finder_username")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 704023828:
                            if (next.equals("finder_basereq")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 770051678:
                            if (next.equals("BaseRequest")) {
                                c17 = 0;
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
                            this.f379011d = (r45.kv0) new r45.kv0().fromJson(((org.json.JSONObject) opt2).toString());
                        }
                    } else if (c17 == 2) {
                        this.f379012e = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 3) {
                        this.f379013f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
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
            r45.kv0 kv0Var = this.f379011d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f379011d.writeFields(fVar);
            }
            java.lang.String str = this.f379012e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f379013f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f379011d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str2 = this.f379012e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.e(4, this.f379013f);
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
        r45.kx0 kx0Var = (r45.kx0) objArr[1];
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
                kx0Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                kx0Var.f379012e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            kx0Var.f379013f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.kv0 kv0Var3 = new r45.kv0();
            if (bArr2 != null && bArr2.length > 0) {
                kv0Var3.parseFrom(bArr2);
            }
            kx0Var.f379011d = kv0Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.he heVar = this.BaseRequest;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseRequest", heVar, true);
            eVar.d(jSONObject, "finder_basereq", this.f379011d, true);
            eVar.d(jSONObject, "my_finder_username", this.f379012e, true);
            eVar.d(jSONObject, "settlement_mode", java.lang.Integer.valueOf(this.f379013f), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
