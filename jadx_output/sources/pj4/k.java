package pj4;

/* loaded from: classes2.dex */
public class k extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f355147d;

    /* renamed from: e, reason: collision with root package name */
    public int f355148e;

    /* renamed from: f, reason: collision with root package name */
    public long f355149f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f355150g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f355151h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f355152i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.k)) {
            return false;
        }
        pj4.k kVar = (pj4.k) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f355147d), java.lang.Integer.valueOf(kVar.f355147d)) && n51.f.a(java.lang.Integer.valueOf(this.f355148e), java.lang.Integer.valueOf(kVar.f355148e)) && n51.f.a(java.lang.Long.valueOf(this.f355149f), java.lang.Long.valueOf(kVar.f355149f)) && n51.f.a(this.f355150g, kVar.f355150g) && n51.f.a(this.f355151h, kVar.f355151h) && n51.f.a(this.f355152i, kVar.f355152i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(2, this.f355147d);
            fVar.e(3, this.f355148e);
            fVar.h(4, this.f355149f);
            java.lang.String str = this.f355150g;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f355151h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f355152i;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(2, this.f355147d) + 0 + b36.f.e(3, this.f355148e) + b36.f.h(4, this.f355149f);
            java.lang.String str3 = this.f355150g;
            if (str3 != null) {
                e17 += b36.f.j(5, str3);
            }
            java.lang.String str4 = this.f355151h;
            if (str4 != null) {
                e17 += b36.f.j(6, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f355152i;
            return gVar2 != null ? e17 + b36.f.b(7, gVar2) : e17;
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
        pj4.k kVar = (pj4.k) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 2:
                kVar.f355147d = aVar2.g(intValue);
                return 0;
            case 3:
                kVar.f355148e = aVar2.g(intValue);
                return 0;
            case 4:
                kVar.f355149f = aVar2.i(intValue);
                return 0;
            case 5:
                kVar.f355150g = aVar2.k(intValue);
                return 0;
            case 6:
                kVar.f355151h = aVar2.k(intValue);
                return 0;
            case 7:
                kVar.f355152i = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f355147d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "sequence", valueOf, false);
            eVar.d(jSONObject, "create_time", java.lang.Integer.valueOf(this.f355148e), false);
            eVar.d(jSONObject, "amt", java.lang.Long.valueOf(this.f355149f), false);
            eVar.d(jSONObject, "comment_id", this.f355150g, false);
            eVar.d(jSONObject, "wishing", this.f355151h, false);
            eVar.d(jSONObject, "Cover", this.f355152i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
