package pj4;

/* loaded from: classes8.dex */
public class z1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f355361d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f355362e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f355363f;

    /* renamed from: g, reason: collision with root package name */
    public int f355364g;

    /* renamed from: h, reason: collision with root package name */
    public int f355365h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f355366i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.z1)) {
            return false;
        }
        pj4.z1 z1Var = (pj4.z1) fVar;
        return n51.f.a(this.BaseRequest, z1Var.BaseRequest) && n51.f.a(this.f355361d, z1Var.f355361d) && n51.f.a(this.f355362e, z1Var.f355362e) && n51.f.a(this.f355363f, z1Var.f355363f) && n51.f.a(java.lang.Integer.valueOf(this.f355364g), java.lang.Integer.valueOf(z1Var.f355364g)) && n51.f.a(java.lang.Integer.valueOf(this.f355365h), java.lang.Integer.valueOf(z1Var.f355365h)) && n51.f.a(this.f355366i, z1Var.f355366i);
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
            java.lang.String str = this.f355361d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f355362e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f355363f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f355364g);
            fVar.e(6, this.f355365h);
            java.lang.String str4 = this.f355366i;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str5 = this.f355361d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f355362e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f355363f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            int e17 = i18 + b36.f.e(5, this.f355364g) + b36.f.e(6, this.f355365h);
            java.lang.String str8 = this.f355366i;
            return str8 != null ? e17 + b36.f.j(8, str8) : e17;
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
        pj4.z1 z1Var = (pj4.z1) objArr[1];
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
                    z1Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                z1Var.f355361d = aVar2.k(intValue);
                return 0;
            case 3:
                z1Var.f355362e = aVar2.k(intValue);
                return 0;
            case 4:
                z1Var.f355363f = aVar2.k(intValue);
                return 0;
            case 5:
                z1Var.f355364g = aVar2.g(intValue);
                return 0;
            case 6:
                z1Var.f355365h = aVar2.g(intValue);
                return 0;
            case 7:
            default:
                return -1;
            case 8:
                z1Var.f355366i = aVar2.k(intValue);
                return 0;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.he heVar = this.BaseRequest;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, "topic_id", this.f355361d, false);
            eVar.d(jSONObject, "text_status_id", this.f355362e, false);
            eVar.d(jSONObject, dm.i4.COL_USERNAME, this.f355363f, false);
            eVar.d(jSONObject, "delete_flag", java.lang.Integer.valueOf(this.f355364g), false);
            eVar.d(jSONObject, "type", java.lang.Integer.valueOf(this.f355365h), false);
            eVar.d(jSONObject, com.tencent.tmassistantsdk.storage.table.ClientInfoTable.Columns.CLIENTID, this.f355366i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
