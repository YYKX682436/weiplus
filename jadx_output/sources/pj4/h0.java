package pj4;

/* loaded from: classes4.dex */
public class h0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f355078d;

    /* renamed from: e, reason: collision with root package name */
    public long f355079e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.h0)) {
            return false;
        }
        pj4.h0 h0Var = (pj4.h0) fVar;
        return n51.f.a(this.f355078d, h0Var.f355078d) && n51.f.a(java.lang.Long.valueOf(this.f355079e), java.lang.Long.valueOf(h0Var.f355079e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f355078d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f355079e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f355078d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f355079e);
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
        pj4.h0 h0Var = (pj4.h0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            h0Var.f355078d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        h0Var.f355079e = aVar2.i(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f355078d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, dm.i4.COL_ID, str, false);
            eVar.d(jSONObject, "key", java.lang.Long.valueOf(this.f355079e), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
