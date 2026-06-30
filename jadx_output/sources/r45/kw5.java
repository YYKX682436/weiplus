package r45;

/* loaded from: classes2.dex */
public class kw5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.qp f379004d;

    /* renamed from: e, reason: collision with root package name */
    public int f379005e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kw5)) {
            return false;
        }
        r45.kw5 kw5Var = (r45.kw5) fVar;
        return n51.f.a(this.BaseResponse, kw5Var.BaseResponse) && n51.f.a(this.f379004d, kw5Var.f379004d) && n51.f.a(java.lang.Integer.valueOf(this.f379005e), java.lang.Integer.valueOf(kw5Var.f379005e));
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
            r45.qp qpVar = this.f379004d;
            if (qpVar != null) {
                fVar.i(2, qpVar.computeSize());
                this.f379004d.writeFields(fVar);
            }
            fVar.e(3, this.f379005e);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.qp qpVar2 = this.f379004d;
            if (qpVar2 != null) {
                i18 += b36.f.i(2, qpVar2.computeSize());
            }
            return i18 + b36.f.e(3, this.f379005e);
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
        r45.kw5 kw5Var = (r45.kw5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                kw5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            kw5Var.f379005e = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.qp qpVar3 = new r45.qp();
            if (bArr2 != null && bArr2.length > 0) {
                qpVar3.parseFrom(bArr2);
            }
            kw5Var.f379004d = qpVar3;
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
            eVar.d(jSONObject, "Content", this.f379004d, false);
            eVar.d(jSONObject, "Offset", java.lang.Integer.valueOf(this.f379005e), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
