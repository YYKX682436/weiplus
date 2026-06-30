package r45;

/* loaded from: classes4.dex */
public class rv extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f385221d;

    /* renamed from: e, reason: collision with root package name */
    public long f385222e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f385223f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rv)) {
            return false;
        }
        r45.rv rvVar = (r45.rv) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f385221d), java.lang.Long.valueOf(rvVar.f385221d)) && n51.f.a(java.lang.Long.valueOf(this.f385222e), java.lang.Long.valueOf(rvVar.f385222e)) && n51.f.a(this.f385223f, rvVar.f385223f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385223f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f385221d);
            fVar.h(2, this.f385222e);
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f385221d) + 0 + b36.f.h(2, this.f385222e) + b36.f.g(3, 8, linkedList);
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
        r45.rv rvVar = (r45.rv) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            rvVar.f385221d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            rvVar.f385222e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.a14 a14Var = new r45.a14();
            if (bArr2 != null && bArr2.length > 0) {
                a14Var.parseFrom(bArr2);
            }
            rvVar.f385223f.add(a14Var);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f385221d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "item_confs_version", valueOf, false);
            eVar.d(jSONObject, "last_get_time", java.lang.Long.valueOf(this.f385222e), false);
            eVar.d(jSONObject, "item_confs", this.f385223f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
