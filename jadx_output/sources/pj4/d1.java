package pj4;

/* loaded from: classes4.dex */
public class d1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f355019d;

    /* renamed from: e, reason: collision with root package name */
    public long f355020e;

    /* renamed from: f, reason: collision with root package name */
    public long f355021f;

    /* renamed from: g, reason: collision with root package name */
    public int f355022g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f355023h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.d1)) {
            return false;
        }
        pj4.d1 d1Var = (pj4.d1) fVar;
        return n51.f.a(this.BaseRequest, d1Var.BaseRequest) && n51.f.a(java.lang.Long.valueOf(this.f355019d), java.lang.Long.valueOf(d1Var.f355019d)) && n51.f.a(java.lang.Long.valueOf(this.f355020e), java.lang.Long.valueOf(d1Var.f355020e)) && n51.f.a(java.lang.Long.valueOf(this.f355021f), java.lang.Long.valueOf(d1Var.f355021f)) && n51.f.a(java.lang.Integer.valueOf(this.f355022g), java.lang.Integer.valueOf(d1Var.f355022g)) && n51.f.a(this.f355023h, d1Var.f355023h);
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
            fVar.h(2, this.f355019d);
            fVar.h(3, this.f355020e);
            fVar.h(4, this.f355021f);
            fVar.e(5, this.f355022g);
            fVar.g(6, 8, this.f355023h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.h(2, this.f355019d) + b36.f.h(3, this.f355020e) + b36.f.h(4, this.f355021f) + b36.f.e(5, this.f355022g) + b36.f.g(6, 8, this.f355023h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f355023h.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        pj4.d1 d1Var = (pj4.d1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    d1Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                d1Var.f355019d = aVar2.i(intValue);
                return 0;
            case 3:
                d1Var.f355020e = aVar2.i(intValue);
                return 0;
            case 4:
                d1Var.f355021f = aVar2.i(intValue);
                return 0;
            case 5:
                d1Var.f355022g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    pj4.h0 h0Var = new pj4.h0();
                    if (bArr3 != null && bArr3.length > 0) {
                        h0Var.parseFrom(bArr3);
                    }
                    d1Var.f355023h.add(h0Var);
                }
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
            eVar.d(jSONObject, "key", java.lang.Long.valueOf(this.f355019d), false);
            eVar.d(jSONObject, "cover_agenda_key", java.lang.Long.valueOf(this.f355020e), false);
            eVar.d(jSONObject, "keyValueConfigKey", java.lang.Long.valueOf(this.f355021f), false);
            eVar.d(jSONObject, "flag", java.lang.Integer.valueOf(this.f355022g), false);
            eVar.d(jSONObject, "icon_config_id_keys", this.f355023h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
