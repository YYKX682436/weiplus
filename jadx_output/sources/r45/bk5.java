package r45;

/* loaded from: classes2.dex */
public class bk5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f370822d;

    /* renamed from: e, reason: collision with root package name */
    public int f370823e;

    /* renamed from: f, reason: collision with root package name */
    public int f370824f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f370825g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public int f370826h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bk5)) {
            return false;
        }
        r45.bk5 bk5Var = (r45.bk5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f370822d), java.lang.Integer.valueOf(bk5Var.f370822d)) && n51.f.a(java.lang.Integer.valueOf(this.f370823e), java.lang.Integer.valueOf(bk5Var.f370823e)) && n51.f.a(java.lang.Integer.valueOf(this.f370824f), java.lang.Integer.valueOf(bk5Var.f370824f)) && n51.f.a(this.f370825g, bk5Var.f370825g) && n51.f.a(java.lang.Integer.valueOf(this.f370826h), java.lang.Integer.valueOf(bk5Var.f370826h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f370825g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f370822d);
            fVar.e(2, this.f370823e);
            fVar.e(3, this.f370824f);
            fVar.g(4, 1, linkedList);
            fVar.e(5, this.f370826h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f370822d) + 0 + b36.f.e(2, this.f370823e) + b36.f.e(3, this.f370824f) + b36.f.g(4, 1, linkedList) + b36.f.e(5, this.f370826h);
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
        r45.bk5 bk5Var = (r45.bk5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bk5Var.f370822d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            bk5Var.f370823e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            bk5Var.f370824f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            bk5Var.f370825g.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        bk5Var.f370826h = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f370822d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "DirectShowTs", valueOf, false);
            eVar.d(jSONObject, "ShowAndRefleshTs", java.lang.Integer.valueOf(this.f370823e), false);
            eVar.d(jSONObject, "Category", java.lang.Integer.valueOf(this.f370824f), false);
            eVar.d(jSONObject, "DocidList", this.f370825g, false);
            eVar.d(jSONObject, "NeedCache", java.lang.Integer.valueOf(this.f370826h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
