package r45;

/* loaded from: classes4.dex */
public class id3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f376948d;

    /* renamed from: e, reason: collision with root package name */
    public int f376949e;

    /* renamed from: f, reason: collision with root package name */
    public long f376950f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.id3)) {
            return false;
        }
        r45.id3 id3Var = (r45.id3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f376948d), java.lang.Integer.valueOf(id3Var.f376948d)) && n51.f.a(java.lang.Integer.valueOf(this.f376949e), java.lang.Integer.valueOf(id3Var.f376949e)) && n51.f.a(java.lang.Long.valueOf(this.f376950f), java.lang.Long.valueOf(id3Var.f376950f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f376948d);
            fVar.e(2, this.f376949e);
            fVar.h(3, this.f376950f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f376948d) + 0 + b36.f.e(2, this.f376949e) + b36.f.h(3, this.f376950f);
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
        r45.id3 id3Var = (r45.id3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            id3Var.f376948d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            id3Var.f376949e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        id3Var.f376950f = aVar2.i(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f376948d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Type", valueOf, false);
            eVar.d(jSONObject, "Offset", java.lang.Integer.valueOf(this.f376949e), false);
            eVar.d(jSONObject, "Version", java.lang.Long.valueOf(this.f376950f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
