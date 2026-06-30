package pj4;

/* loaded from: classes4.dex */
public class k0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f355153d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f355154e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.k0)) {
            return false;
        }
        pj4.k0 k0Var = (pj4.k0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f355153d), java.lang.Long.valueOf(k0Var.f355153d)) && n51.f.a(this.f355154e, k0Var.f355154e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f355154e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f355153d);
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f355153d) + 0 + b36.f.g(2, 8, linkedList);
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
        pj4.k0 k0Var = (pj4.k0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            k0Var.f355153d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            pj4.l0 l0Var = new pj4.l0();
            if (bArr2 != null && bArr2.length > 0) {
                l0Var.parseFrom(bArr2);
            }
            k0Var.f355154e.add(l0Var);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f355153d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "key", valueOf, false);
            eVar.d(jSONObject, "key_value_items", this.f355154e, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
