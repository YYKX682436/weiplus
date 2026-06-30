package r45;

/* loaded from: classes9.dex */
public class ir0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377277d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377278e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f377279f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ir0)) {
            return false;
        }
        r45.ir0 ir0Var = (r45.ir0) fVar;
        return n51.f.a(this.f377277d, ir0Var.f377277d) && n51.f.a(this.f377278e, ir0Var.f377278e) && n51.f.a(java.lang.Boolean.valueOf(this.f377279f), java.lang.Boolean.valueOf(ir0Var.f377279f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f377277d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f377278e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.a(3, this.f377279f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f377277d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f377278e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.a(3, this.f377279f);
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
        r45.ir0 ir0Var = (r45.ir0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ir0Var.f377277d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ir0Var.f377278e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        ir0Var.f377279f = aVar2.c(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f377277d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, dm.i4.COL_ID, str, false);
            eVar.d(jSONObject, "wording", this.f377278e, false);
            eVar.d(jSONObject, "isUseToConfirm", java.lang.Boolean.valueOf(this.f377279f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
