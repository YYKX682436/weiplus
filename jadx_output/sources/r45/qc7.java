package r45;

/* loaded from: classes4.dex */
public class qc7 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383836d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f383837e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qc7)) {
            return false;
        }
        r45.qc7 qc7Var = (r45.qc7) fVar;
        return n51.f.a(this.BaseRequest, qc7Var.BaseRequest) && n51.f.a(this.f383836d, qc7Var.f383836d) && n51.f.a(this.f383837e, qc7Var.f383837e);
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
            java.lang.String str = this.f383836d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, this.f383837e);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f383836d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.g(3, 8, this.f383837e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f383837e.clear();
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
        r45.qc7 qc7Var = (r45.qc7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                qc7Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            qc7Var.f383836d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.hn4 hn4Var = new r45.hn4();
            if (bArr3 != null && bArr3.length > 0) {
                hn4Var.parseFrom(bArr3);
            }
            qc7Var.f383837e.add(hn4Var);
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
            eVar.d(jSONObject, "appId", this.f383836d, false);
            eVar.d(jSONObject, "modAuthItem", this.f383837e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
