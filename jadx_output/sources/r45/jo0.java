package r45;

/* loaded from: classes12.dex */
public class jo0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.di6 f377986d;

    /* renamed from: e, reason: collision with root package name */
    public int f377987e;

    /* renamed from: f, reason: collision with root package name */
    public long f377988f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jo0)) {
            return false;
        }
        r45.jo0 jo0Var = (r45.jo0) fVar;
        return n51.f.a(this.f377986d, jo0Var.f377986d) && n51.f.a(java.lang.Integer.valueOf(this.f377987e), java.lang.Integer.valueOf(jo0Var.f377987e)) && n51.f.a(java.lang.Long.valueOf(this.f377988f), java.lang.Long.valueOf(jo0Var.f377988f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.di6 di6Var = this.f377986d;
            if (di6Var != null) {
                fVar.i(1, di6Var.computeSize());
                this.f377986d.writeFields(fVar);
            }
            fVar.e(2, this.f377987e);
            fVar.h(3, this.f377988f);
            return 0;
        }
        if (i17 == 1) {
            r45.di6 di6Var2 = this.f377986d;
            return (di6Var2 != null ? 0 + b36.f.i(1, di6Var2.computeSize()) : 0) + b36.f.e(2, this.f377987e) + b36.f.h(3, this.f377988f);
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
        r45.jo0 jo0Var = (r45.jo0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                jo0Var.f377987e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            jo0Var.f377988f = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.di6 di6Var3 = new r45.di6();
            if (bArr != null && bArr.length > 0) {
                di6Var3.parseFrom(bArr);
            }
            jo0Var.f377986d = di6Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.di6 di6Var = this.f377986d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Item", di6Var, false);
            eVar.d(jSONObject, "Index", java.lang.Integer.valueOf(this.f377987e), false);
            eVar.d(jSONObject, "SearchId", java.lang.Long.valueOf(this.f377988f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
