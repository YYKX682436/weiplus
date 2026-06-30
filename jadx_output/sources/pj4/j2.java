package pj4;

/* loaded from: classes2.dex */
public class j2 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f355145d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f355146e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.j2)) {
            return false;
        }
        pj4.j2 j2Var = (pj4.j2) fVar;
        return n51.f.a(this.BaseResponse, j2Var.BaseResponse) && n51.f.a(java.lang.Boolean.valueOf(this.f355145d), java.lang.Boolean.valueOf(j2Var.f355145d)) && n51.f.a(java.lang.Boolean.valueOf(this.f355146e), java.lang.Boolean.valueOf(j2Var.f355146e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.a(2, this.f355145d);
            fVar.a(3, this.f355146e);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.a(2, this.f355145d) + b36.f.a(3, this.f355146e);
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
        pj4.j2 j2Var = (pj4.j2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                j2Var.f355145d = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            j2Var.f355146e = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.ie ieVar3 = new r45.ie();
            if (bArr != null && bArr.length > 0) {
                ieVar3.parseFrom(bArr);
            }
            j2Var.BaseResponse = ieVar3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.BaseResponse;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "skip_send", java.lang.Boolean.valueOf(this.f355145d), false);
            eVar.d(jSONObject, "is_answer", java.lang.Boolean.valueOf(this.f355146e), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
