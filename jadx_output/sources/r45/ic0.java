package r45;

/* loaded from: classes4.dex */
public class ic0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f376923d;

    /* renamed from: e, reason: collision with root package name */
    public int f376924e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f376925f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ic0)) {
            return false;
        }
        r45.ic0 ic0Var = (r45.ic0) fVar;
        return n51.f.a(this.f376923d, ic0Var.f376923d) && n51.f.a(java.lang.Integer.valueOf(this.f376924e), java.lang.Integer.valueOf(ic0Var.f376924e)) && n51.f.a(this.f376925f, ic0Var.f376925f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.du5 du5Var = this.f376923d;
            if (du5Var != null) {
                fVar.i(1, du5Var.computeSize());
                this.f376923d.writeFields(fVar);
            }
            fVar.e(2, this.f376924e);
            fVar.k(3, 2, this.f376925f);
            return 0;
        }
        if (i17 == 1) {
            r45.du5 du5Var2 = this.f376923d;
            return (du5Var2 != null ? 0 + b36.f.i(1, du5Var2.computeSize()) : 0) + b36.f.e(2, this.f376924e) + b36.f.k(3, 2, this.f376925f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f376925f.clear();
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
        r45.ic0 ic0Var = (r45.ic0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.du5 du5Var3 = new r45.du5();
                if (bArr2 != null && bArr2.length > 0) {
                    du5Var3.b(bArr2);
                }
                ic0Var.f376923d = du5Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            ic0Var.f376924e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        byte[] bArr3 = aVar2.d(intValue).f192156a;
        d36.b unknownTagHandler = com.tencent.mm.protobuf.f.unknownTagHandler;
        kotlin.jvm.internal.o.g(unknownTagHandler, "unknownTagHandler");
        e36.a aVar3 = new e36.a(bArr3, 0, bArr3.length);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (aVar3.f247596c < aVar3.f247595b) {
            linkedList.add(java.lang.Integer.valueOf(aVar3.f()));
        }
        ic0Var.f376925f = linkedList;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.du5 du5Var = this.f376923d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "UserName", du5Var, false);
            eVar.d(jSONObject, "Count", java.lang.Integer.valueOf(this.f376924e), false);
            eVar.d(jSONObject, "MsgIdList", this.f376925f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
