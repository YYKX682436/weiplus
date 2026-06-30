package pj4;

/* loaded from: classes9.dex */
public class u1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f355304d;

    /* renamed from: e, reason: collision with root package name */
    public pj4.v1 f355305e;

    /* renamed from: f, reason: collision with root package name */
    public pj4.s1 f355306f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.u1)) {
            return false;
        }
        pj4.u1 u1Var = (pj4.u1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f355304d), java.lang.Integer.valueOf(u1Var.f355304d)) && n51.f.a(this.f355305e, u1Var.f355305e) && n51.f.a(this.f355306f, u1Var.f355306f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f355304d);
            pj4.v1 v1Var = this.f355305e;
            if (v1Var != null) {
                fVar.i(2, v1Var.computeSize());
                this.f355305e.writeFields(fVar);
            }
            pj4.s1 s1Var = this.f355306f;
            if (s1Var != null) {
                fVar.i(3, s1Var.computeSize());
                this.f355306f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f355304d) + 0;
            pj4.v1 v1Var2 = this.f355305e;
            if (v1Var2 != null) {
                e17 += b36.f.i(2, v1Var2.computeSize());
            }
            pj4.s1 s1Var2 = this.f355306f;
            return s1Var2 != null ? e17 + b36.f.i(3, s1Var2.computeSize()) : e17;
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
        pj4.u1 u1Var = (pj4.u1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            u1Var.f355304d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                pj4.v1 v1Var3 = new pj4.v1();
                if (bArr != null && bArr.length > 0) {
                    v1Var3.parseFrom(bArr);
                }
                u1Var.f355305e = v1Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            pj4.s1 s1Var3 = new pj4.s1();
            if (bArr2 != null && bArr2.length > 0) {
                s1Var3.parseFrom(bArr2);
            }
            u1Var.f355306f = s1Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f355304d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "type", valueOf, false);
            eVar.d(jSONObject, "music", this.f355305e, false);
            eVar.d(jSONObject, "finder", this.f355306f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
