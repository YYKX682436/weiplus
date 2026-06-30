package pj4;

/* loaded from: classes4.dex */
public class y0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f355341d;

    /* renamed from: e, reason: collision with root package name */
    public int f355342e;

    /* renamed from: f, reason: collision with root package name */
    public int f355343f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.y0)) {
            return false;
        }
        pj4.y0 y0Var = (pj4.y0) fVar;
        return n51.f.a(this.f355341d, y0Var.f355341d) && n51.f.a(java.lang.Integer.valueOf(this.f355342e), java.lang.Integer.valueOf(y0Var.f355342e)) && n51.f.a(java.lang.Integer.valueOf(this.f355343f), java.lang.Integer.valueOf(y0Var.f355343f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f355341d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f355342e);
            fVar.e(3, this.f355343f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f355341d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f355342e) + b36.f.e(3, this.f355343f);
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
        pj4.y0 y0Var = (pj4.y0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            y0Var.f355341d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            y0Var.f355342e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        y0Var.f355343f = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f355341d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "icon_id", str, false);
            eVar.d(jSONObject, "begin_time", java.lang.Integer.valueOf(this.f355342e), false);
            eVar.d(jSONObject, "end_time", java.lang.Integer.valueOf(this.f355343f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
