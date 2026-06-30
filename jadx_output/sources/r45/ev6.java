package r45;

/* loaded from: classes4.dex */
public class ev6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f373752d;

    /* renamed from: e, reason: collision with root package name */
    public int f373753e;

    /* renamed from: f, reason: collision with root package name */
    public long f373754f;

    /* renamed from: g, reason: collision with root package name */
    public int f373755g;

    /* renamed from: h, reason: collision with root package name */
    public int f373756h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ev6)) {
            return false;
        }
        r45.ev6 ev6Var = (r45.ev6) fVar;
        return n51.f.a(this.f373752d, ev6Var.f373752d) && n51.f.a(java.lang.Integer.valueOf(this.f373753e), java.lang.Integer.valueOf(ev6Var.f373753e)) && n51.f.a(java.lang.Long.valueOf(this.f373754f), java.lang.Long.valueOf(ev6Var.f373754f)) && n51.f.a(java.lang.Integer.valueOf(this.f373755g), java.lang.Integer.valueOf(ev6Var.f373755g)) && n51.f.a(java.lang.Integer.valueOf(this.f373756h), java.lang.Integer.valueOf(ev6Var.f373756h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f373752d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            fVar.e(2, this.f373753e);
            fVar.h(3, this.f373754f);
            fVar.e(4, this.f373755g);
            fVar.e(5, this.f373756h);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar2 = this.f373752d;
            return (gVar2 != null ? 0 + b36.f.b(1, gVar2) : 0) + b36.f.e(2, this.f373753e) + b36.f.h(3, this.f373754f) + b36.f.e(4, this.f373755g) + b36.f.e(5, this.f373756h);
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
        r45.ev6 ev6Var = (r45.ev6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ev6Var.f373752d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 2) {
            ev6Var.f373753e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ev6Var.f373754f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            ev6Var.f373755g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ev6Var.f373756h = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            com.tencent.mm.protobuf.g gVar = this.f373752d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Url", gVar, false);
            eVar.d(jSONObject, "DurationMs", java.lang.Integer.valueOf(this.f373753e), false);
            eVar.d(jSONObject, "Filesize", java.lang.Long.valueOf(this.f373754f), false);
            eVar.d(jSONObject, "Width", java.lang.Integer.valueOf(this.f373755g), false);
            eVar.d(jSONObject, "Height", java.lang.Integer.valueOf(this.f373756h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
