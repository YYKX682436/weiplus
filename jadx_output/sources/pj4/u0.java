package pj4;

/* loaded from: classes4.dex */
public class u0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f355303d = -1;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof pj4.u0) && n51.f.a(java.lang.Integer.valueOf(this.f355303d), java.lang.Integer.valueOf(((pj4.u0) fVar).f355303d));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).e(1, this.f355303d);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f355303d) + 0;
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
        pj4.u0 u0Var = (pj4.u0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        u0Var.f355303d = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.f335114a.d(jSONObject, "likeAndRefNum", java.lang.Integer.valueOf(this.f355303d), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
