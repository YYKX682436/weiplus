package r45;

/* loaded from: classes8.dex */
public class je7 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377769d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377770e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f377771f;

    /* renamed from: g, reason: collision with root package name */
    public int f377772g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f377773h;

    /* renamed from: i, reason: collision with root package name */
    public int f377774i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.je7)) {
            return false;
        }
        r45.je7 je7Var = (r45.je7) fVar;
        return n51.f.a(this.BaseRequest, je7Var.BaseRequest) && n51.f.a(this.f377769d, je7Var.f377769d) && n51.f.a(this.f377770e, je7Var.f377770e) && n51.f.a(this.f377771f, je7Var.f377771f) && n51.f.a(java.lang.Integer.valueOf(this.f377772g), java.lang.Integer.valueOf(je7Var.f377772g)) && n51.f.a(this.f377773h, je7Var.f377773h) && n51.f.a(java.lang.Integer.valueOf(this.f377774i), java.lang.Integer.valueOf(je7Var.f377774i));
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
            java.lang.String str = this.f377769d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f377770e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f377771f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f377772g);
            java.lang.String str4 = this.f377773h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f377774i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str5 = this.f377769d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f377770e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f377771f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            int e17 = i18 + b36.f.e(5, this.f377772g);
            java.lang.String str8 = this.f377773h;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            return e17 + b36.f.e(7, this.f377774i);
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
        r45.je7 je7Var = (r45.je7) objArr[1];
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
                    je7Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                je7Var.f377769d = aVar2.k(intValue);
                return 0;
            case 3:
                je7Var.f377770e = aVar2.k(intValue);
                return 0;
            case 4:
                je7Var.f377771f = aVar2.k(intValue);
                return 0;
            case 5:
                je7Var.f377772g = aVar2.g(intValue);
                return 0;
            case 6:
                je7Var.f377773h = aVar2.k(intValue);
                return 0;
            case 7:
                je7Var.f377774i = aVar2.g(intValue);
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
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, "appid", this.f377769d, false);
            eVar.d(jSONObject, "model_id", this.f377770e, false);
            eVar.d(jSONObject, "sn", this.f377771f, false);
            eVar.d(jSONObject, "status", java.lang.Integer.valueOf(this.f377772g), false);
            eVar.d(jSONObject, "voip_call_template_id", this.f377773h, false);
            eVar.d(jSONObject, "voip_call_status", java.lang.Integer.valueOf(this.f377774i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
