package r45;

/* loaded from: classes4.dex */
public class ei6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373542d;

    /* renamed from: e, reason: collision with root package name */
    public long f373543e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ei6)) {
            return false;
        }
        r45.ei6 ei6Var = (r45.ei6) fVar;
        return n51.f.a(this.f373542d, ei6Var.f373542d) && n51.f.a(java.lang.Long.valueOf(this.f373543e), java.lang.Long.valueOf(ei6Var.f373543e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f373542d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f373543e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f373542d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f373543e);
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
        r45.ei6 ei6Var = (r45.ei6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ei6Var.f373542d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        ei6Var.f373543e = aVar2.i(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f373542d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Prefix", str, false);
            eVar.d(jSONObject, "TimestampMs", java.lang.Long.valueOf(this.f373543e), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
