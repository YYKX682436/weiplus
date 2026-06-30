package r45;

/* loaded from: classes7.dex */
public class y77 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f390843d;

    /* renamed from: e, reason: collision with root package name */
    public long f390844e;

    /* renamed from: f, reason: collision with root package name */
    public r45.a87 f390845f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y77)) {
            return false;
        }
        r45.y77 y77Var = (r45.y77) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f390843d), java.lang.Integer.valueOf(y77Var.f390843d)) && n51.f.a(java.lang.Long.valueOf(this.f390844e), java.lang.Long.valueOf(y77Var.f390844e)) && n51.f.a(this.f390845f, y77Var.f390845f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f390843d);
            fVar.h(2, this.f390844e);
            r45.a87 a87Var = this.f390845f;
            if (a87Var != null) {
                fVar.i(3, a87Var.computeSize());
                this.f390845f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f390843d) + 0 + b36.f.h(2, this.f390844e);
            r45.a87 a87Var2 = this.f390845f;
            return a87Var2 != null ? e17 + b36.f.i(3, a87Var2.computeSize()) : e17;
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
        r45.y77 y77Var = (r45.y77) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            y77Var.f390843d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            y77Var.f390844e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.a87 a87Var3 = new r45.a87();
            if (bArr != null && bArr.length > 0) {
                a87Var3.parseFrom(bArr);
            }
            y77Var.f390845f = a87Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f390843d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "type", valueOf, false);
            eVar.d(jSONObject, "file_size", java.lang.Long.valueOf(this.f390844e), false);
            eVar.d(jSONObject, "fileInfo", this.f390845f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
