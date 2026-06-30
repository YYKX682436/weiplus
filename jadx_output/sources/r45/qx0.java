package r45;

/* loaded from: classes2.dex */
public class qx0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f384326d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384327e;

    /* renamed from: f, reason: collision with root package name */
    public long f384328f;

    /* renamed from: g, reason: collision with root package name */
    public long f384329g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f384330h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f384331i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qx0)) {
            return false;
        }
        r45.qx0 qx0Var = (r45.qx0) fVar;
        return n51.f.a(this.BaseRequest, qx0Var.BaseRequest) && n51.f.a(this.f384326d, qx0Var.f384326d) && n51.f.a(this.f384327e, qx0Var.f384327e) && n51.f.a(java.lang.Long.valueOf(this.f384328f), java.lang.Long.valueOf(qx0Var.f384328f)) && n51.f.a(java.lang.Long.valueOf(this.f384329g), java.lang.Long.valueOf(qx0Var.f384329g)) && n51.f.a(java.lang.Boolean.valueOf(this.f384330h), java.lang.Boolean.valueOf(qx0Var.f384330h)) && n51.f.a(this.f384331i, qx0Var.f384331i);
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
                        case -1671727813:
                            if (next.equals("screenshot_detected")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -216295364:
                            if (next.equals("my_finder_username")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 351608024:
                            if (next.equals("version")) {
                                c17 = 4;
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
                        case 851453825:
                            if (next.equals("invitation_id")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 1263068863:
                            if (next.equals("initiator_finder_username")) {
                                c17 = 6;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (!(opt instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.BaseRequest = (r45.he) new r45.he().fromJson(((org.json.JSONObject) opt).toString());
                                break;
                            }
                        case 1:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f384326d = (r45.kv0) new r45.kv0().fromJson(((org.json.JSONObject) opt2).toString());
                                break;
                            }
                        case 2:
                            this.f384327e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 3:
                            this.f384328f = jSONObject.optLong(next);
                            break;
                        case 4:
                            this.f384329g = jSONObject.optLong(next);
                            break;
                        case 5:
                            this.f384330h = ((java.lang.Boolean) jSONObject.opt(next)).booleanValue();
                            break;
                        case 6:
                            this.f384331i = (java.lang.String) jSONObject.opt(next);
                            break;
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
            r45.kv0 kv0Var = this.f384326d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f384326d.writeFields(fVar);
            }
            java.lang.String str = this.f384327e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f384328f);
            fVar.h(5, this.f384329g);
            fVar.a(6, this.f384330h);
            java.lang.String str2 = this.f384331i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f384326d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str3 = this.f384327e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int h17 = i18 + b36.f.h(4, this.f384328f) + b36.f.h(5, this.f384329g) + b36.f.a(6, this.f384330h);
            java.lang.String str4 = this.f384331i;
            return str4 != null ? h17 + b36.f.j(7, str4) : h17;
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
        r45.qx0 qx0Var = (r45.qx0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    qx0Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.parseFrom(bArr2);
                    }
                    qx0Var.f384326d = kv0Var3;
                }
                return 0;
            case 3:
                qx0Var.f384327e = aVar2.k(intValue);
                return 0;
            case 4:
                qx0Var.f384328f = aVar2.i(intValue);
                return 0;
            case 5:
                qx0Var.f384329g = aVar2.i(intValue);
                return 0;
            case 6:
                qx0Var.f384330h = aVar2.c(intValue);
                return 0;
            case 7:
                qx0Var.f384331i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.he heVar = this.BaseRequest;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseRequest", heVar, true);
            eVar.d(jSONObject, "finder_basereq", this.f384326d, true);
            eVar.d(jSONObject, "my_finder_username", this.f384327e, true);
            eVar.d(jSONObject, "invitation_id", java.lang.Long.valueOf(this.f384328f), true);
            eVar.d(jSONObject, "version", java.lang.Long.valueOf(this.f384329g), true);
            eVar.d(jSONObject, "screenshot_detected", java.lang.Boolean.valueOf(this.f384330h), true);
            eVar.d(jSONObject, "initiator_finder_username", this.f384331i, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
