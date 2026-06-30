package pj4;

/* loaded from: classes8.dex */
public class o1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f355228d;

    /* renamed from: e, reason: collision with root package name */
    public int f355229e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f355230f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f355231g;

    /* renamed from: h, reason: collision with root package name */
    public long f355232h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.o1)) {
            return false;
        }
        pj4.o1 o1Var = (pj4.o1) fVar;
        return n51.f.a(this.f355228d, o1Var.f355228d) && n51.f.a(java.lang.Integer.valueOf(this.f355229e), java.lang.Integer.valueOf(o1Var.f355229e)) && n51.f.a(this.f355230f, o1Var.f355230f) && n51.f.a(java.lang.Integer.valueOf(this.f355231g), java.lang.Integer.valueOf(o1Var.f355231g)) && n51.f.a(java.lang.Long.valueOf(this.f355232h), java.lang.Long.valueOf(o1Var.f355232h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f355230f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f355228d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f355229e);
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f355231g);
            fVar.h(5, this.f355232h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f355228d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f355229e) + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f355231g) + b36.f.h(5, this.f355232h);
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
        pj4.o1 o1Var = (pj4.o1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            o1Var.f355228d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            o1Var.f355229e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                o1Var.f355231g = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            o1Var.f355232h = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            pj4.g0 g0Var = new pj4.g0();
            if (bArr2 != null && bArr2.length > 0) {
                g0Var.parseFrom(bArr2);
            }
            o1Var.f355230f.add(g0Var);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f355228d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "iconId", str, false);
            eVar.d(jSONObject, "showType", java.lang.Integer.valueOf(this.f355229e), false);
            eVar.d(jSONObject, "actions", this.f355230f, false);
            eVar.d(jSONObject, "characterSetType", java.lang.Integer.valueOf(this.f355231g), false);
            eVar.d(jSONObject, "flag", java.lang.Long.valueOf(this.f355232h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
