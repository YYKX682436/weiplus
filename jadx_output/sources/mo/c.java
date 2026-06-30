package mo;

/* loaded from: classes8.dex */
public class c extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f330251d;

    /* renamed from: e, reason: collision with root package name */
    public long f330252e;

    /* renamed from: f, reason: collision with root package name */
    public long f330253f;

    /* renamed from: g, reason: collision with root package name */
    public long f330254g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof mo.c)) {
            return false;
        }
        mo.c cVar = (mo.c) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f330251d), java.lang.Long.valueOf(cVar.f330251d)) && n51.f.a(java.lang.Long.valueOf(this.f330252e), java.lang.Long.valueOf(cVar.f330252e)) && n51.f.a(java.lang.Long.valueOf(this.f330253f), java.lang.Long.valueOf(cVar.f330253f)) && n51.f.a(java.lang.Long.valueOf(this.f330254g), java.lang.Long.valueOf(cVar.f330254g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f330251d);
            fVar.h(2, this.f330252e);
            fVar.h(3, this.f330253f);
            fVar.h(4, this.f330254g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f330251d) + 0 + b36.f.h(2, this.f330252e) + b36.f.h(3, this.f330253f) + b36.f.h(4, this.f330254g);
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
        mo.c cVar = (mo.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cVar.f330251d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            cVar.f330252e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            cVar.f330253f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        cVar.f330254g = aVar2.i(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f330251d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "firstSeq", valueOf, false);
            eVar.d(jSONObject, "lastSeq", java.lang.Long.valueOf(this.f330252e), false);
            eVar.d(jSONObject, "firstCreateTime", java.lang.Long.valueOf(this.f330253f), false);
            eVar.d(jSONObject, "lastCreateTime", java.lang.Long.valueOf(this.f330254g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
