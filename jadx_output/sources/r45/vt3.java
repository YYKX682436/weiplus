package r45;

/* loaded from: classes2.dex */
public class vt3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f388515d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f388516e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vt3)) {
            return false;
        }
        r45.vt3 vt3Var = (r45.vt3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f388515d), java.lang.Integer.valueOf(vt3Var.f388515d)) && n51.f.a(this.f388516e, vt3Var.f388516e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f388516e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f388515d);
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f388515d) + 0 + b36.f.g(2, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.vt3 vt3Var = (r45.vt3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vt3Var.f388515d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.ut3 ut3Var = new r45.ut3();
            if (bArr2 != null && bArr2.length > 0) {
                ut3Var.parseFrom(bArr2);
            }
            vt3Var.f388516e.add(ut3Var);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f388515d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Count", valueOf, false);
            eVar.d(jSONObject, "List", this.f388516e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
