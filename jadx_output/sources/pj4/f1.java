package pj4;

/* loaded from: classes8.dex */
public class f1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f355039d;

    /* renamed from: e, reason: collision with root package name */
    public long f355040e;

    /* renamed from: f, reason: collision with root package name */
    public long f355041f;

    /* renamed from: g, reason: collision with root package name */
    public long f355042g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f355043h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.f1)) {
            return false;
        }
        pj4.f1 f1Var = (pj4.f1) fVar;
        return n51.f.a(this.BaseRequest, f1Var.BaseRequest) && n51.f.a(this.f355039d, f1Var.f355039d) && n51.f.a(java.lang.Long.valueOf(this.f355040e), java.lang.Long.valueOf(f1Var.f355040e)) && n51.f.a(java.lang.Long.valueOf(this.f355041f), java.lang.Long.valueOf(f1Var.f355041f)) && n51.f.a(java.lang.Long.valueOf(this.f355042g), java.lang.Long.valueOf(f1Var.f355042g)) && n51.f.a(this.f355043h, f1Var.f355043h);
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
            com.tencent.mm.protobuf.g gVar = this.f355039d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.h(3, this.f355040e);
            fVar.h(4, this.f355041f);
            fVar.h(5, this.f355042g);
            fVar.g(6, 1, this.f355043h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f355039d;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            return i18 + b36.f.h(3, this.f355040e) + b36.f.h(4, this.f355041f) + b36.f.h(5, this.f355042g) + b36.f.g(6, 1, this.f355043h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f355043h.clear();
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
        pj4.f1 f1Var = (pj4.f1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    f1Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                f1Var.f355039d = aVar2.d(intValue);
                return 0;
            case 3:
                f1Var.f355040e = aVar2.i(intValue);
                return 0;
            case 4:
                f1Var.f355041f = aVar2.i(intValue);
                return 0;
            case 5:
                f1Var.f355042g = aVar2.i(intValue);
                return 0;
            case 6:
                f1Var.f355043h.add(aVar2.k(intValue));
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
            eVar.d(jSONObject, "context", this.f355039d, false);
            eVar.d(jSONObject, "op", java.lang.Long.valueOf(this.f355040e), false);
            eVar.d(jSONObject, "start_key", java.lang.Long.valueOf(this.f355041f), false);
            eVar.d(jSONObject, "limit", java.lang.Long.valueOf(this.f355042g), false);
            eVar.d(jSONObject, "statusIds", this.f355043h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
