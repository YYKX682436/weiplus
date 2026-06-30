package r45;

/* loaded from: classes2.dex */
public class hx4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f376538d;

    /* renamed from: e, reason: collision with root package name */
    public long f376539e;

    /* renamed from: f, reason: collision with root package name */
    public long f376540f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hx4)) {
            return false;
        }
        r45.hx4 hx4Var = (r45.hx4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f376538d), java.lang.Integer.valueOf(hx4Var.f376538d)) && n51.f.a(java.lang.Long.valueOf(this.f376539e), java.lang.Long.valueOf(hx4Var.f376539e)) && n51.f.a(java.lang.Long.valueOf(this.f376540f), java.lang.Long.valueOf(hx4Var.f376540f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f376538d);
            fVar.h(2, this.f376539e);
            fVar.h(3, this.f376540f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f376538d) + 0 + b36.f.h(2, this.f376539e) + b36.f.h(3, this.f376540f);
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
        r45.hx4 hx4Var = (r45.hx4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hx4Var.f376538d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            hx4Var.f376539e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        hx4Var.f376540f = aVar2.i(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f376538d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "field", valueOf, false);
            eVar.d(jSONObject, "from", java.lang.Long.valueOf(this.f376539e), false);
            eVar.d(jSONObject, "to", java.lang.Long.valueOf(this.f376540f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
