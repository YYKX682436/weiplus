package r45;

/* loaded from: classes8.dex */
public class ez3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373839d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373840e;

    /* renamed from: f, reason: collision with root package name */
    public int f373841f;

    /* renamed from: g, reason: collision with root package name */
    public long f373842g;

    /* renamed from: h, reason: collision with root package name */
    public int f373843h;

    /* renamed from: i, reason: collision with root package name */
    public int f373844i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ez3)) {
            return false;
        }
        r45.ez3 ez3Var = (r45.ez3) fVar;
        return n51.f.a(this.f373839d, ez3Var.f373839d) && n51.f.a(this.f373840e, ez3Var.f373840e) && n51.f.a(java.lang.Integer.valueOf(this.f373841f), java.lang.Integer.valueOf(ez3Var.f373841f)) && n51.f.a(java.lang.Long.valueOf(this.f373842g), java.lang.Long.valueOf(ez3Var.f373842g)) && n51.f.a(java.lang.Integer.valueOf(this.f373843h), java.lang.Integer.valueOf(ez3Var.f373843h)) && n51.f.a(java.lang.Integer.valueOf(this.f373844i), java.lang.Integer.valueOf(ez3Var.f373844i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f373839d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f373840e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f373841f);
            fVar.h(4, this.f373842g);
            fVar.e(5, this.f373843h);
            fVar.e(6, this.f373844i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f373839d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f373840e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f373841f) + b36.f.h(4, this.f373842g) + b36.f.e(5, this.f373843h) + b36.f.e(6, this.f373844i);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.ez3 ez3Var = (r45.ez3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ez3Var.f373839d = aVar2.k(intValue);
                return 0;
            case 2:
                ez3Var.f373840e = aVar2.k(intValue);
                return 0;
            case 3:
                ez3Var.f373841f = aVar2.g(intValue);
                return 0;
            case 4:
                ez3Var.f373842g = aVar2.i(intValue);
                return 0;
            case 5:
                ez3Var.f373843h = aVar2.g(intValue);
                return 0;
            case 6:
                ez3Var.f373844i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f373839d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "ImageId", str, false);
            eVar.d(jSONObject, "ArticleUrl", this.f373840e, false);
            eVar.d(jSONObject, "ItemShowType", java.lang.Integer.valueOf(this.f373841f), false);
            eVar.d(jSONObject, "Bizuin", java.lang.Long.valueOf(this.f373842g), false);
            eVar.d(jSONObject, "Mid", java.lang.Integer.valueOf(this.f373843h), false);
            eVar.d(jSONObject, "Idx", java.lang.Integer.valueOf(this.f373844i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
