package r45;

/* loaded from: classes4.dex */
public class tn extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.qm1 f386580d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f386581e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tn)) {
            return false;
        }
        r45.tn tnVar = (r45.tn) fVar;
        return n51.f.a(this.f386580d, tnVar.f386580d) && n51.f.a(this.f386581e, tnVar.f386581e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.qm1 qm1Var = this.f386580d;
            if (qm1Var != null) {
                fVar.i(1, qm1Var.computeSize());
                this.f386580d.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f386581e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.qm1 qm1Var2 = this.f386580d;
            int i18 = qm1Var2 != null ? 0 + b36.f.i(1, qm1Var2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f386581e;
            return gVar2 != null ? i18 + b36.f.b(2, gVar2) : i18;
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
        r45.tn tnVar = (r45.tn) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            tnVar.f386581e = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.qm1 qm1Var3 = new r45.qm1();
            if (bArr != null && bArr.length > 0) {
                qm1Var3.parseFrom(bArr);
            }
            tnVar.f386580d = qm1Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.qm1 qm1Var = this.f386580d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "box_id", qm1Var, false);
            eVar.d(jSONObject, "last_buffer", this.f386581e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
