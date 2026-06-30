package r45;

/* loaded from: classes4.dex */
public class un extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.qm1 f387485d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f387486e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.un)) {
            return false;
        }
        r45.un unVar = (r45.un) fVar;
        return n51.f.a(this.f387485d, unVar.f387485d) && n51.f.a(java.lang.Boolean.valueOf(this.f387486e), java.lang.Boolean.valueOf(unVar.f387486e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.qm1 qm1Var = this.f387485d;
            if (qm1Var != null) {
                fVar.i(1, qm1Var.computeSize());
                this.f387485d.writeFields(fVar);
            }
            fVar.a(2, this.f387486e);
            return 0;
        }
        if (i17 == 1) {
            r45.qm1 qm1Var2 = this.f387485d;
            return (qm1Var2 != null ? 0 + b36.f.i(1, qm1Var2.computeSize()) : 0) + b36.f.a(2, this.f387486e);
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
        r45.un unVar = (r45.un) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            unVar.f387486e = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.qm1 qm1Var3 = new r45.qm1();
            if (bArr != null && bArr.length > 0) {
                qm1Var3.parseFrom(bArr);
            }
            unVar.f387485d = qm1Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.qm1 qm1Var = this.f387485d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "box_id", qm1Var, false);
            eVar.d(jSONObject, "has_unread_msg", java.lang.Boolean.valueOf(this.f387486e), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
