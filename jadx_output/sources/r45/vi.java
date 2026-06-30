package r45;

/* loaded from: classes4.dex */
public class vi extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f388271d;

    /* renamed from: e, reason: collision with root package name */
    public float f388272e;

    /* renamed from: f, reason: collision with root package name */
    public float f388273f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f388274g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vi)) {
            return false;
        }
        r45.vi viVar = (r45.vi) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f388271d), java.lang.Float.valueOf(viVar.f388271d)) && n51.f.a(java.lang.Float.valueOf(this.f388272e), java.lang.Float.valueOf(viVar.f388272e)) && n51.f.a(java.lang.Float.valueOf(this.f388273f), java.lang.Float.valueOf(viVar.f388273f)) && n51.f.a(java.lang.Boolean.valueOf(this.f388274g), java.lang.Boolean.valueOf(viVar.f388274g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f388271d);
            fVar.d(2, this.f388272e);
            fVar.d(3, this.f388273f);
            fVar.a(4, this.f388274g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f388271d) + 0 + b36.f.d(2, this.f388272e) + b36.f.d(3, this.f388273f) + b36.f.a(4, this.f388274g);
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
        r45.vi viVar = (r45.vi) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            viVar.f388271d = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 2) {
            viVar.f388272e = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 3) {
            viVar.f388273f = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        viVar.f388274g = aVar2.c(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Float valueOf = java.lang.Float.valueOf(this.f388271d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "latitude", valueOf, false);
            eVar.d(jSONObject, "longitude", java.lang.Float.valueOf(this.f388272e), false);
            eVar.d(jSONObject, "precision", java.lang.Float.valueOf(this.f388273f), false);
            eVar.d(jSONObject, "is_empty", java.lang.Boolean.valueOf(this.f388274g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
