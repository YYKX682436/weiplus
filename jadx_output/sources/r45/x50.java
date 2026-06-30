package r45;

/* loaded from: classes8.dex */
public class x50 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389788d;

    /* renamed from: e, reason: collision with root package name */
    public long f389789e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389790f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x50)) {
            return false;
        }
        r45.x50 x50Var = (r45.x50) fVar;
        return n51.f.a(this.f389788d, x50Var.f389788d) && n51.f.a(java.lang.Long.valueOf(this.f389789e), java.lang.Long.valueOf(x50Var.f389789e)) && n51.f.a(this.f389790f, x50Var.f389790f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f389788d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f389789e);
            java.lang.String str2 = this.f389790f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f389788d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.h(2, this.f389789e);
            java.lang.String str4 = this.f389790f;
            return str4 != null ? j17 + b36.f.j(3, str4) : j17;
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
        r45.x50 x50Var = (r45.x50) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            x50Var.f389788d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            x50Var.f389789e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        x50Var.f389790f = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f389788d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "key", str, false);
            eVar.d(jSONObject, "uint_value", java.lang.Long.valueOf(this.f389789e), false);
            eVar.d(jSONObject, "text_value", this.f389790f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
