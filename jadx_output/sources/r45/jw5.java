package r45;

/* loaded from: classes2.dex */
public class jw5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f378169d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378170e;

    /* renamed from: f, reason: collision with root package name */
    public int f378171f;

    /* renamed from: g, reason: collision with root package name */
    public r45.e64 f378172g;

    /* renamed from: h, reason: collision with root package name */
    public int f378173h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f378174i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public int f378175m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f378176n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jw5)) {
            return false;
        }
        r45.jw5 jw5Var = (r45.jw5) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f378169d), java.lang.Long.valueOf(jw5Var.f378169d)) && n51.f.a(this.f378170e, jw5Var.f378170e) && n51.f.a(java.lang.Integer.valueOf(this.f378171f), java.lang.Integer.valueOf(jw5Var.f378171f)) && n51.f.a(this.f378172g, jw5Var.f378172g) && n51.f.a(java.lang.Integer.valueOf(this.f378173h), java.lang.Integer.valueOf(jw5Var.f378173h)) && n51.f.a(this.f378174i, jw5Var.f378174i) && n51.f.a(java.lang.Integer.valueOf(this.f378175m), java.lang.Integer.valueOf(jw5Var.f378175m)) && n51.f.a(this.f378176n, jw5Var.f378176n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f378174i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f378169d);
            java.lang.String str = this.f378170e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f378171f);
            r45.e64 e64Var = this.f378172g;
            if (e64Var != null) {
                fVar.i(4, e64Var.computeSize());
                this.f378172g.writeFields(fVar);
            }
            fVar.e(5, this.f378173h);
            fVar.g(6, 8, linkedList);
            fVar.e(7, this.f378175m);
            java.lang.String str2 = this.f378176n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f378169d) + 0;
            java.lang.String str3 = this.f378170e;
            if (str3 != null) {
                h17 += b36.f.j(2, str3);
            }
            int e17 = h17 + b36.f.e(3, this.f378171f);
            r45.e64 e64Var2 = this.f378172g;
            if (e64Var2 != null) {
                e17 += b36.f.i(4, e64Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(5, this.f378173h) + b36.f.g(6, 8, linkedList) + b36.f.e(7, this.f378175m);
            java.lang.String str4 = this.f378176n;
            return str4 != null ? e18 + b36.f.j(8, str4) : e18;
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
        r45.jw5 jw5Var = (r45.jw5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jw5Var.f378169d = aVar2.i(intValue);
                return 0;
            case 2:
                jw5Var.f378170e = aVar2.k(intValue);
                return 0;
            case 3:
                jw5Var.f378171f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.e64 e64Var3 = new r45.e64();
                    if (bArr2 != null && bArr2.length > 0) {
                        e64Var3.parseFrom(bArr2);
                    }
                    jw5Var.f378172g = e64Var3;
                }
                return 0;
            case 5:
                jw5Var.f378173h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.fw6 fw6Var = new r45.fw6();
                    if (bArr3 != null && bArr3.length > 0) {
                        fw6Var.parseFrom(bArr3);
                    }
                    jw5Var.f378174i.add(fw6Var);
                }
                return 0;
            case 7:
                jw5Var.f378175m = aVar2.g(intValue);
                return 0;
            case 8:
                jw5Var.f378176n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f378169d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BusinessType", valueOf, false);
            eVar.d(jSONObject, "KeyWord", this.f378170e, false);
            eVar.d(jSONObject, "Offset", java.lang.Integer.valueOf(this.f378171f), false);
            eVar.d(jSONObject, "Location", this.f378172g, false);
            eVar.d(jSONObject, "RequestSrc", java.lang.Integer.valueOf(this.f378173h), false);
            eVar.d(jSONObject, "MatchUserList", this.f378174i, false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f378175m), false);
            eVar.d(jSONObject, "SearchID", this.f378176n, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
