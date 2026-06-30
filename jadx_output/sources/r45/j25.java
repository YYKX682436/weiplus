package r45;

/* loaded from: classes11.dex */
public class j25 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f377517d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f377518e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f377519f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j25)) {
            return false;
        }
        r45.j25 j25Var = (r45.j25) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f377517d), java.lang.Integer.valueOf(j25Var.f377517d)) && n51.f.a(this.f377518e, j25Var.f377518e) && n51.f.a(this.f377519f, j25Var.f377519f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f377519f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f377517d);
            fVar.k(2, 2, this.f377518e);
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f377517d) + 0 + b36.f.k(2, 2, this.f377518e) + b36.f.g(3, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f377518e.clear();
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
        r45.j25 j25Var = (r45.j25) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            j25Var.f377517d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            byte[] bArr2 = aVar2.d(intValue).f192156a;
            d36.b unknownTagHandler = com.tencent.mm.protobuf.f.unknownTagHandler;
            kotlin.jvm.internal.o.g(unknownTagHandler, "unknownTagHandler");
            e36.a aVar3 = new e36.a(bArr2, 0, bArr2.length);
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            while (aVar3.f247596c < aVar3.f247595b) {
                linkedList2.add(java.lang.Integer.valueOf(aVar3.f()));
            }
            j25Var.f377518e = linkedList2;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr3 = (byte[]) j17.get(i18);
            r45.g25 g25Var = new r45.g25();
            if (bArr3 != null && bArr3.length > 0) {
                g25Var.parseFrom(bArr3);
            }
            j25Var.f377519f.add(g25Var);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f377517d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Count", valueOf, false);
            eVar.d(jSONObject, "Ret", this.f377518e, false);
            eVar.d(jSONObject, "ErrMsg", this.f377519f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
