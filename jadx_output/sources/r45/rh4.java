package r45;

/* loaded from: classes2.dex */
public class rh4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f384871d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384872e;

    /* renamed from: f, reason: collision with root package name */
    public long f384873f;

    /* renamed from: g, reason: collision with root package name */
    public long f384874g;

    /* renamed from: h, reason: collision with root package name */
    public int f384875h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rh4)) {
            return false;
        }
        r45.rh4 rh4Var = (r45.rh4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f384871d), java.lang.Integer.valueOf(rh4Var.f384871d)) && n51.f.a(this.f384872e, rh4Var.f384872e) && n51.f.a(java.lang.Long.valueOf(this.f384873f), java.lang.Long.valueOf(rh4Var.f384873f)) && n51.f.a(java.lang.Long.valueOf(this.f384874g), java.lang.Long.valueOf(rh4Var.f384874g)) && n51.f.a(java.lang.Integer.valueOf(this.f384875h), java.lang.Integer.valueOf(rh4Var.f384875h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f384871d);
            java.lang.String str = this.f384872e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f384873f);
            fVar.h(4, this.f384874g);
            fVar.e(5, this.f384875h);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f384871d) + 0;
            java.lang.String str2 = this.f384872e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.h(3, this.f384873f) + b36.f.h(4, this.f384874g) + b36.f.e(5, this.f384875h);
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
        r45.rh4 rh4Var = (r45.rh4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            rh4Var.f384871d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            rh4Var.f384872e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            rh4Var.f384873f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            rh4Var.f384874g = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        rh4Var.f384875h = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f384871d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Scene", valueOf, false);
            eVar.d(jSONObject, "Json", this.f384872e, false);
            eVar.d(jSONObject, "Interval", java.lang.Long.valueOf(this.f384873f), false);
            eVar.d(jSONObject, "LastCacheSecond", java.lang.Long.valueOf(this.f384874g), false);
            eVar.d(jSONObject, "IsPreload", java.lang.Integer.valueOf(this.f384875h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
