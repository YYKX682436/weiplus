package pj4;

/* loaded from: classes9.dex */
public class i2 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f355116d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f355117e;

    /* renamed from: f, reason: collision with root package name */
    public long f355118f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f355119g;

    /* renamed from: h, reason: collision with root package name */
    public int f355120h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f355121i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f355122m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f355123n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f355124o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.i2)) {
            return false;
        }
        pj4.i2 i2Var = (pj4.i2) fVar;
        return n51.f.a(this.BaseRequest, i2Var.BaseRequest) && n51.f.a(this.f355116d, i2Var.f355116d) && n51.f.a(this.f355117e, i2Var.f355117e) && n51.f.a(java.lang.Long.valueOf(this.f355118f), java.lang.Long.valueOf(i2Var.f355118f)) && n51.f.a(this.f355119g, i2Var.f355119g) && n51.f.a(java.lang.Integer.valueOf(this.f355120h), java.lang.Integer.valueOf(i2Var.f355120h)) && n51.f.a(this.f355121i, i2Var.f355121i) && n51.f.a(this.f355122m, i2Var.f355122m) && n51.f.a(this.f355123n, i2Var.f355123n) && n51.f.a(this.f355124o, i2Var.f355124o);
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
            java.lang.String str = this.f355116d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f355117e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.h(4, this.f355118f);
            java.lang.String str3 = this.f355119g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f355120h);
            java.lang.String str4 = this.f355121i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f355122m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f355123n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f355124o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str8 = this.f355116d;
            if (str8 != null) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f355117e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            int h17 = i18 + b36.f.h(4, this.f355118f);
            java.lang.String str10 = this.f355119g;
            if (str10 != null) {
                h17 += b36.f.j(5, str10);
            }
            int e17 = h17 + b36.f.e(6, this.f355120h);
            java.lang.String str11 = this.f355121i;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f355122m;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f355123n;
            if (str13 != null) {
                e17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f355124o;
            return str14 != null ? e17 + b36.f.j(10, str14) : e17;
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
        pj4.i2 i2Var = (pj4.i2) objArr[1];
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
                    i2Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                i2Var.f355116d = aVar2.k(intValue);
                return 0;
            case 3:
                i2Var.f355117e = aVar2.k(intValue);
                return 0;
            case 4:
                i2Var.f355118f = aVar2.i(intValue);
                return 0;
            case 5:
                i2Var.f355119g = aVar2.k(intValue);
                return 0;
            case 6:
                i2Var.f355120h = aVar2.g(intValue);
                return 0;
            case 7:
                i2Var.f355121i = aVar2.k(intValue);
                return 0;
            case 8:
                i2Var.f355122m = aVar2.k(intValue);
                return 0;
            case 9:
                i2Var.f355123n = aVar2.k(intValue);
                return 0;
            case 10:
                i2Var.f355124o = aVar2.k(intValue);
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
            eVar.d(jSONObject, "tag", this.f355116d, false);
            eVar.d(jSONObject, "source_id", this.f355117e, false);
            eVar.d(jSONObject, "card_key", java.lang.Long.valueOf(this.f355118f), false);
            eVar.d(jSONObject, "status_id", this.f355119g, false);
            eVar.d(jSONObject, "modify_count", java.lang.Integer.valueOf(this.f355120h), false);
            eVar.d(jSONObject, "to_enc_username", this.f355121i, false);
            eVar.d(jSONObject, "to_hash_username", this.f355122m, false);
            eVar.d(jSONObject, "client_msg_id", this.f355123n, false);
            eVar.d(jSONObject, "session_id", this.f355124o, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
