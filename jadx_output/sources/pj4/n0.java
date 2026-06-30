package pj4;

/* loaded from: classes9.dex */
public class n0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f355193d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f355194e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f355195f;

    /* renamed from: g, reason: collision with root package name */
    public long f355196g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f355197h;

    /* renamed from: i, reason: collision with root package name */
    public int f355198i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.n0)) {
            return false;
        }
        pj4.n0 n0Var = (pj4.n0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f355193d), java.lang.Integer.valueOf(n0Var.f355193d)) && n51.f.a(this.f355194e, n0Var.f355194e) && n51.f.a(this.f355195f, n0Var.f355195f) && n51.f.a(java.lang.Long.valueOf(this.f355196g), java.lang.Long.valueOf(n0Var.f355196g)) && n51.f.a(this.f355197h, n0Var.f355197h) && n51.f.a(java.lang.Integer.valueOf(this.f355198i), java.lang.Integer.valueOf(n0Var.f355198i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f355193d);
            java.lang.String str = this.f355194e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f355195f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.h(4, this.f355196g);
            java.lang.String str3 = this.f355197h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f355198i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f355193d) + 0;
            java.lang.String str4 = this.f355194e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f355195f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            int h17 = e17 + b36.f.h(4, this.f355196g);
            java.lang.String str6 = this.f355197h;
            if (str6 != null) {
                h17 += b36.f.j(5, str6);
            }
            return h17 + b36.f.e(6, this.f355198i);
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
        pj4.n0 n0Var = (pj4.n0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n0Var.f355193d = aVar2.g(intValue);
                return 0;
            case 2:
                n0Var.f355194e = aVar2.k(intValue);
                return 0;
            case 3:
                n0Var.f355195f = aVar2.k(intValue);
                return 0;
            case 4:
                n0Var.f355196g = aVar2.i(intValue);
                return 0;
            case 5:
                n0Var.f355197h = aVar2.k(intValue);
                return 0;
            case 6:
                n0Var.f355198i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f355193d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "action", valueOf, false);
            eVar.d(jSONObject, "tag", this.f355194e, false);
            eVar.d(jSONObject, "source_id", this.f355195f, false);
            eVar.d(jSONObject, "card_key", java.lang.Long.valueOf(this.f355196g), false);
            eVar.d(jSONObject, "status_id", this.f355197h, false);
            eVar.d(jSONObject, "modify_count", java.lang.Integer.valueOf(this.f355198i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
