package pj4;

/* loaded from: classes4.dex */
public class w0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f355317d;

    /* renamed from: e, reason: collision with root package name */
    public int f355318e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f355319f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f355320g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.w0)) {
            return false;
        }
        pj4.w0 w0Var = (pj4.w0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f355317d), java.lang.Integer.valueOf(w0Var.f355317d)) && n51.f.a(java.lang.Integer.valueOf(this.f355318e), java.lang.Integer.valueOf(w0Var.f355318e)) && n51.f.a(this.f355319f, w0Var.f355319f) && n51.f.a(this.f355320g, w0Var.f355320g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f355317d);
            fVar.e(2, this.f355318e);
            java.lang.String str = this.f355319f;
            if (str != null) {
                fVar.j(3, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f355320g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f355317d) + 0 + b36.f.e(2, this.f355318e);
            java.lang.String str2 = this.f355319f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f355320g;
            return gVar2 != null ? e17 + b36.f.b(4, gVar2) : e17;
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
        pj4.w0 w0Var = (pj4.w0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            w0Var.f355317d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            w0Var.f355318e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            w0Var.f355319f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        w0Var.f355320g = aVar2.d(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f355317d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "cmd_id", valueOf, false);
            eVar.d(jSONObject, "ret_code", java.lang.Integer.valueOf(this.f355318e), false);
            eVar.d(jSONObject, "ret_msg", this.f355319f, false);
            eVar.d(jSONObject, "ret_buf", this.f355320g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
