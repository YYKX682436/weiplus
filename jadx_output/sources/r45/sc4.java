package r45;

/* loaded from: classes4.dex */
public class sc4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f385624d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385625e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f385626f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public long f385627g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sc4)) {
            return false;
        }
        r45.sc4 sc4Var = (r45.sc4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f385624d), java.lang.Integer.valueOf(sc4Var.f385624d)) && n51.f.a(this.f385625e, sc4Var.f385625e) && n51.f.a(this.f385626f, sc4Var.f385626f) && n51.f.a(java.lang.Long.valueOf(this.f385627g), java.lang.Long.valueOf(sc4Var.f385627g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385626f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f385624d);
            java.lang.String str = this.f385625e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList);
            fVar.h(4, this.f385627g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f385624d) + 0;
            java.lang.String str2 = this.f385625e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.g(3, 8, linkedList) + b36.f.h(4, this.f385627g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.sc4 sc4Var = (r45.sc4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            sc4Var.f385624d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            sc4Var.f385625e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            sc4Var.f385627g = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.pq5 pq5Var = new r45.pq5();
            if (bArr2 != null && bArr2.length > 0) {
                pq5Var.parseFrom(bArr2);
            }
            sc4Var.f385626f.add(pq5Var);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f385624d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "businessId", valueOf, false);
            eVar.d(jSONObject, "collectKey", this.f385625e, false);
            eVar.d(jSONObject, "itemDataList", this.f385626f, false);
            eVar.d(jSONObject, "collectStartTimeMs", java.lang.Long.valueOf(this.f385627g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
