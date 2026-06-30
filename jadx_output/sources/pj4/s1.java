package pj4;

/* loaded from: classes9.dex */
public class s1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f355286d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f355287e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.s1)) {
            return false;
        }
        pj4.s1 s1Var = (pj4.s1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f355286d), java.lang.Long.valueOf(s1Var.f355286d)) && n51.f.a(this.f355287e, s1Var.f355287e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f355286d);
            java.lang.String str = this.f355287e;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f355286d) + 0;
            java.lang.String str2 = this.f355287e;
            return str2 != null ? h17 + b36.f.j(2, str2) : h17;
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
        pj4.s1 s1Var = (pj4.s1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            s1Var.f355286d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        s1Var.f355287e = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f355286d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "feed_id", valueOf, false);
            eVar.d(jSONObject, "nonce_id", this.f355287e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
