package r45;

/* loaded from: classes2.dex */
public class xw5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f390558d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390559e;

    /* renamed from: f, reason: collision with root package name */
    public r45.e64 f390560f;

    /* renamed from: g, reason: collision with root package name */
    public int f390561g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f390562h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xw5)) {
            return false;
        }
        r45.xw5 xw5Var = (r45.xw5) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f390558d), java.lang.Long.valueOf(xw5Var.f390558d)) && n51.f.a(this.f390559e, xw5Var.f390559e) && n51.f.a(this.f390560f, xw5Var.f390560f) && n51.f.a(java.lang.Integer.valueOf(this.f390561g), java.lang.Integer.valueOf(xw5Var.f390561g)) && n51.f.a(this.f390562h, xw5Var.f390562h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390562h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f390558d);
            java.lang.String str = this.f390559e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.e64 e64Var = this.f390560f;
            if (e64Var != null) {
                fVar.i(3, e64Var.computeSize());
                this.f390560f.writeFields(fVar);
            }
            fVar.e(4, this.f390561g);
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f390558d) + 0;
            java.lang.String str2 = this.f390559e;
            if (str2 != null) {
                h17 += b36.f.j(2, str2);
            }
            r45.e64 e64Var2 = this.f390560f;
            if (e64Var2 != null) {
                h17 += b36.f.i(3, e64Var2.computeSize());
            }
            return h17 + b36.f.e(4, this.f390561g) + b36.f.g(5, 8, linkedList);
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
        r45.xw5 xw5Var = (r45.xw5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xw5Var.f390558d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            xw5Var.f390559e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.e64 e64Var3 = new r45.e64();
                if (bArr2 != null && bArr2.length > 0) {
                    e64Var3.parseFrom(bArr2);
                }
                xw5Var.f390560f = e64Var3;
            }
            return 0;
        }
        if (intValue == 4) {
            xw5Var.f390561g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.fw6 fw6Var = new r45.fw6();
            if (bArr3 != null && bArr3.length > 0) {
                fw6Var.parseFrom(bArr3);
            }
            xw5Var.f390562h.add(fw6Var);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f390558d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BusinessType", valueOf, false);
            eVar.d(jSONObject, "KeyWord", this.f390559e, false);
            eVar.d(jSONObject, "Location", this.f390560f, false);
            eVar.d(jSONObject, "RequestSrc", java.lang.Integer.valueOf(this.f390561g), false);
            eVar.d(jSONObject, "MatchUserList", this.f390562h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
