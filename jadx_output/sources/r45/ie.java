package r45;

/* loaded from: classes4.dex */
public class ie extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f376959d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f376960e;

    static {
        new r45.ie();
    }

    public r45.du5 b() {
        return this.f376960e;
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public r45.ie parseFrom(byte[] bArr) {
        return (r45.ie) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ie)) {
            return false;
        }
        r45.ie ieVar = (r45.ie) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f376959d), java.lang.Integer.valueOf(ieVar.f376959d)) && n51.f.a(this.f376960e, ieVar.f376960e);
    }

    public int getRet() {
        return this.f376959d;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f376959d);
            r45.du5 du5Var = this.f376960e;
            if (du5Var != null) {
                fVar.i(2, du5Var.computeSize());
                this.f376960e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f376959d) + 0;
            r45.du5 du5Var2 = this.f376960e;
            return du5Var2 != null ? e17 + b36.f.i(2, du5Var2.computeSize()) : e17;
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f376959d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.du5 du5Var3 = new r45.du5();
            if (bArr != null && bArr.length > 0) {
                du5Var3.b(bArr);
            }
            this.f376960e = du5Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f376959d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Ret", valueOf, false);
            eVar.d(jSONObject, "ErrMsg", this.f376960e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
