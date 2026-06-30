package r45;

/* loaded from: classes8.dex */
public class q55 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f383695d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f383696e;

    /* renamed from: f, reason: collision with root package name */
    public int f383697f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q55)) {
            return false;
        }
        r45.q55 q55Var = (r45.q55) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f383695d), java.lang.Integer.valueOf(q55Var.f383695d)) && n51.f.a(this.f383696e, q55Var.f383696e) && n51.f.a(java.lang.Integer.valueOf(this.f383697f), java.lang.Integer.valueOf(q55Var.f383697f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f383695d);
            r45.cu5 cu5Var = this.f383696e;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f383696e.writeFields(fVar);
            }
            fVar.e(3, this.f383697f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f383695d) + 0;
            r45.cu5 cu5Var2 = this.f383696e;
            if (cu5Var2 != null) {
                e17 += b36.f.i(2, cu5Var2.computeSize());
            }
            return e17 + b36.f.e(3, this.f383697f);
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
        r45.q55 q55Var = (r45.q55) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            q55Var.f383695d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            q55Var.f383697f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr != null && bArr.length > 0) {
                cu5Var3.b(bArr);
            }
            q55Var.f383696e = cu5Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f383695d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "PatternVersion", valueOf, false);
            eVar.d(jSONObject, "Sign", this.f383696e, false);
            eVar.d(jSONObject, "LockStatus", java.lang.Integer.valueOf(this.f383697f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
