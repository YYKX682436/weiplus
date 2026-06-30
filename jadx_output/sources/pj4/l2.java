package pj4;

/* loaded from: classes2.dex */
public class l2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f355171d;

    /* renamed from: e, reason: collision with root package name */
    public int f355172e;

    /* renamed from: f, reason: collision with root package name */
    public int f355173f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.l2)) {
            return false;
        }
        pj4.l2 l2Var = (pj4.l2) fVar;
        return n51.f.a(this.f355171d, l2Var.f355171d) && n51.f.a(java.lang.Integer.valueOf(this.f355172e), java.lang.Integer.valueOf(l2Var.f355172e)) && n51.f.a(java.lang.Integer.valueOf(this.f355173f), java.lang.Integer.valueOf(l2Var.f355173f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f355171d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f355172e);
            fVar.e(3, this.f355173f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f355171d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f355172e) + b36.f.e(3, this.f355173f);
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
        pj4.l2 l2Var = (pj4.l2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            l2Var.f355171d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            l2Var.f355172e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        l2Var.f355173f = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f355171d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, dm.i4.COL_USERNAME, str, false);
            eVar.d(jSONObject, "create_time", java.lang.Integer.valueOf(this.f355172e), false);
            eVar.d(jSONObject, "show_type", java.lang.Integer.valueOf(this.f355173f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
