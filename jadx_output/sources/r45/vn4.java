package r45;

/* loaded from: classes4.dex */
public class vn4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f388396d;

    /* renamed from: e, reason: collision with root package name */
    public r45.un4 f388397e;

    /* renamed from: f, reason: collision with root package name */
    public int f388398f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vn4)) {
            return false;
        }
        r45.vn4 vn4Var = (r45.vn4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f388396d), java.lang.Integer.valueOf(vn4Var.f388396d)) && n51.f.a(this.f388397e, vn4Var.f388397e) && n51.f.a(java.lang.Integer.valueOf(this.f388398f), java.lang.Integer.valueOf(vn4Var.f388398f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f388396d);
            r45.un4 un4Var = this.f388397e;
            if (un4Var != null) {
                fVar.i(2, un4Var.computeSize());
                this.f388397e.writeFields(fVar);
            }
            fVar.e(3, this.f388398f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f388396d) + 0;
            r45.un4 un4Var2 = this.f388397e;
            if (un4Var2 != null) {
                e17 += b36.f.i(2, un4Var2.computeSize());
            }
            return e17 + b36.f.e(3, this.f388398f);
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
        r45.vn4 vn4Var = (r45.vn4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vn4Var.f388396d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            vn4Var.f388398f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.un4 un4Var3 = new r45.un4();
            if (bArr != null && bArr.length > 0) {
                un4Var3.parseFrom(bArr);
            }
            vn4Var.f388397e = un4Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f388396d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Ret", valueOf, false);
            eVar.d(jSONObject, "ModOperation", this.f388397e, false);
            eVar.d(jSONObject, "ResInfo", java.lang.Integer.valueOf(this.f388398f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
