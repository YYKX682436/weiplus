package r45;

/* loaded from: classes8.dex */
public class tp extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f386636d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f386637e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tp)) {
            return false;
        }
        r45.tp tpVar = (r45.tp) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f386636d), java.lang.Long.valueOf(tpVar.f386636d)) && n51.f.a(this.f386637e, tpVar.f386637e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f386636d);
            com.tencent.mm.protobuf.g gVar = this.f386637e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f386636d) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f386637e;
            return gVar2 != null ? h17 + b36.f.b(2, gVar2) : h17;
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
        r45.tp tpVar = (r45.tp) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tpVar.f386636d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        tpVar.f386637e = aVar2.d(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f386636d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BusinessId", valueOf, false);
            eVar.d(jSONObject, "BusinessBuff", this.f386637e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
