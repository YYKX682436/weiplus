package pj4;

/* loaded from: classes2.dex */
public class j1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f355143d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f355144e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.j1)) {
            return false;
        }
        pj4.j1 j1Var = (pj4.j1) fVar;
        return n51.f.a(this.BaseRequest, j1Var.BaseRequest) && n51.f.a(this.f355143d, j1Var.f355143d) && n51.f.a(this.f355144e, j1Var.f355144e);
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
            java.lang.String str = this.f355143d;
            if (str != null) {
                fVar.j(2, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f355144e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f355143d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f355144e;
            return gVar2 != null ? i18 + b36.f.b(3, gVar2) : i18;
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
        pj4.j1 j1Var = (pj4.j1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                j1Var.f355143d = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            j1Var.f355144e = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.he heVar3 = new r45.he();
            if (bArr != null && bArr.length > 0) {
                heVar3.parseFrom(bArr);
            }
            j1Var.BaseRequest = heVar3;
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
            eVar.d(jSONObject, "text_status_id", this.f355143d, false);
            eVar.d(jSONObject, "context", this.f355144e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
