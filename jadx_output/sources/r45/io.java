package r45;

/* loaded from: classes9.dex */
public class io extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f377202d;

    /* renamed from: e, reason: collision with root package name */
    public int f377203e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f377204f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f377205g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.io)) {
            return false;
        }
        r45.io ioVar = (r45.io) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f377202d), java.lang.Integer.valueOf(ioVar.f377202d)) && n51.f.a(java.lang.Integer.valueOf(this.f377203e), java.lang.Integer.valueOf(ioVar.f377203e)) && n51.f.a(this.f377204f, ioVar.f377204f) && n51.f.a(this.f377205g, ioVar.f377205g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f377202d);
            fVar.e(2, this.f377203e);
            com.tencent.mm.protobuf.g gVar = this.f377204f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f377205g;
            if (gVar2 != null) {
                fVar.b(4, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f377202d) + 0 + b36.f.e(2, this.f377203e);
            com.tencent.mm.protobuf.g gVar3 = this.f377204f;
            if (gVar3 != null) {
                e17 += b36.f.b(3, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f377205g;
            return gVar4 != null ? e17 + b36.f.b(4, gVar4) : e17;
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
        r45.io ioVar = (r45.io) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ioVar.f377202d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ioVar.f377203e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ioVar.f377204f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ioVar.f377205g = aVar2.d(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f377202d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "type", valueOf, false);
            eVar.d(jSONObject, "port", java.lang.Integer.valueOf(this.f377203e), false);
            eVar.d(jSONObject, "IP", this.f377204f, false);
            eVar.d(jSONObject, "Domain", this.f377205g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
