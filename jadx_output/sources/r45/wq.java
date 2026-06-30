package r45;

/* loaded from: classes4.dex */
public class wq extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389382d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389383e;

    /* renamed from: f, reason: collision with root package name */
    public int f389384f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wq)) {
            return false;
        }
        r45.wq wqVar = (r45.wq) fVar;
        return n51.f.a(this.f389382d, wqVar.f389382d) && n51.f.a(this.f389383e, wqVar.f389383e) && n51.f.a(java.lang.Integer.valueOf(this.f389384f), java.lang.Integer.valueOf(wqVar.f389384f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f389382d;
            if (str != null) {
                fVar.j(1, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f389383e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f389384f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f389382d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f389383e;
            if (gVar2 != null) {
                j17 += b36.f.b(2, gVar2);
            }
            return j17 + b36.f.e(3, this.f389384f);
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
        r45.wq wqVar = (r45.wq) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wqVar.f389382d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            wqVar.f389383e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        wqVar.f389384f = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f389382d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "key", str, false);
            eVar.d(jSONObject, "buff", this.f389383e, false);
            eVar.d(jSONObject, "sub_type", java.lang.Integer.valueOf(this.f389384f), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
