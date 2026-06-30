package r45;

/* loaded from: classes2.dex */
public class sh4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f385724d;

    /* renamed from: e, reason: collision with root package name */
    public int f385725e;

    /* renamed from: f, reason: collision with root package name */
    public r45.e64 f385726f;

    /* renamed from: g, reason: collision with root package name */
    public int f385727g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f385728h;

    /* renamed from: i, reason: collision with root package name */
    public long f385729i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f385730m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f385731n;

    /* renamed from: o, reason: collision with root package name */
    public r45.j30 f385732o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f385733p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f385734q;

    /* renamed from: r, reason: collision with root package name */
    public int f385735r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sh4)) {
            return false;
        }
        r45.sh4 sh4Var = (r45.sh4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f385724d), java.lang.Integer.valueOf(sh4Var.f385724d)) && n51.f.a(java.lang.Integer.valueOf(this.f385725e), java.lang.Integer.valueOf(sh4Var.f385725e)) && n51.f.a(this.f385726f, sh4Var.f385726f) && n51.f.a(java.lang.Integer.valueOf(this.f385727g), java.lang.Integer.valueOf(sh4Var.f385727g)) && n51.f.a(this.f385728h, sh4Var.f385728h) && n51.f.a(java.lang.Long.valueOf(this.f385729i), java.lang.Long.valueOf(sh4Var.f385729i)) && n51.f.a(this.f385730m, sh4Var.f385730m) && n51.f.a(this.f385731n, sh4Var.f385731n) && n51.f.a(this.f385732o, sh4Var.f385732o) && n51.f.a(this.f385733p, sh4Var.f385733p) && n51.f.a(this.f385734q, sh4Var.f385734q) && n51.f.a(java.lang.Integer.valueOf(this.f385735r), java.lang.Integer.valueOf(sh4Var.f385735r));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385733p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f385724d);
            fVar.e(2, this.f385725e);
            r45.e64 e64Var = this.f385726f;
            if (e64Var != null) {
                fVar.i(3, e64Var.computeSize());
                this.f385726f.writeFields(fVar);
            }
            fVar.e(4, this.f385727g);
            java.lang.String str = this.f385728h;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.h(6, this.f385729i);
            java.lang.String str2 = this.f385730m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f385731n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            r45.j30 j30Var = this.f385732o;
            if (j30Var != null) {
                fVar.i(9, j30Var.computeSize());
                this.f385732o.writeFields(fVar);
            }
            fVar.g(10, 8, linkedList);
            java.lang.String str4 = this.f385734q;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            fVar.e(12, this.f385735r);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f385724d) + 0 + b36.f.e(2, this.f385725e);
            r45.e64 e64Var2 = this.f385726f;
            if (e64Var2 != null) {
                e17 += b36.f.i(3, e64Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(4, this.f385727g);
            java.lang.String str5 = this.f385728h;
            if (str5 != null) {
                e18 += b36.f.j(5, str5);
            }
            int h17 = e18 + b36.f.h(6, this.f385729i);
            java.lang.String str6 = this.f385730m;
            if (str6 != null) {
                h17 += b36.f.j(7, str6);
            }
            java.lang.String str7 = this.f385731n;
            if (str7 != null) {
                h17 += b36.f.j(8, str7);
            }
            r45.j30 j30Var2 = this.f385732o;
            if (j30Var2 != null) {
                h17 += b36.f.i(9, j30Var2.computeSize());
            }
            int g17 = h17 + b36.f.g(10, 8, linkedList);
            java.lang.String str8 = this.f385734q;
            if (str8 != null) {
                g17 += b36.f.j(11, str8);
            }
            return g17 + b36.f.e(12, this.f385735r);
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
        r45.sh4 sh4Var = (r45.sh4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                sh4Var.f385724d = aVar2.g(intValue);
                return 0;
            case 2:
                sh4Var.f385725e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.e64 e64Var3 = new r45.e64();
                    if (bArr2 != null && bArr2.length > 0) {
                        e64Var3.parseFrom(bArr2);
                    }
                    sh4Var.f385726f = e64Var3;
                }
                return 0;
            case 4:
                sh4Var.f385727g = aVar2.g(intValue);
                return 0;
            case 5:
                sh4Var.f385728h = aVar2.k(intValue);
                return 0;
            case 6:
                sh4Var.f385729i = aVar2.i(intValue);
                return 0;
            case 7:
                sh4Var.f385730m = aVar2.k(intValue);
                return 0;
            case 8:
                sh4Var.f385731n = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.j30 j30Var3 = new r45.j30();
                    if (bArr3 != null && bArr3.length > 0) {
                        j30Var3.parseFrom(bArr3);
                    }
                    sh4Var.f385732o = j30Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.x50 x50Var = new r45.x50();
                    if (bArr4 != null && bArr4.length > 0) {
                        x50Var.parseFrom(bArr4);
                    }
                    sh4Var.f385733p.add(x50Var);
                }
                return 0;
            case 11:
                sh4Var.f385734q = aVar2.k(intValue);
                return 0;
            case 12:
                sh4Var.f385735r = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f385724d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Scene", valueOf, false);
            eVar.d(jSONObject, "H5Version", java.lang.Integer.valueOf(this.f385725e), false);
            eVar.d(jSONObject, "Location", this.f385726f, false);
            eVar.d(jSONObject, "BusinessType", java.lang.Integer.valueOf(this.f385727g), false);
            eVar.d(jSONObject, "Language", this.f385728h, false);
            eVar.d(jSONObject, "ConfigParam", java.lang.Long.valueOf(this.f385729i), false);
            eVar.d(jSONObject, "SessionId", this.f385730m, false);
            eVar.d(jSONObject, "GuideInfo", this.f385731n, false);
            eVar.d(jSONObject, "ChildMode", this.f385732o, false);
            eVar.d(jSONObject, "ExtReqParams", this.f385733p, false);
            eVar.d(jSONObject, "RequestId", this.f385734q, false);
            eVar.d(jSONObject, "Reqtype", java.lang.Integer.valueOf(this.f385735r), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
