package pj4;

/* loaded from: classes8.dex */
public class n1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f355199d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f355200e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f355201f;

    /* renamed from: g, reason: collision with root package name */
    public int f355202g;

    /* renamed from: h, reason: collision with root package name */
    public int f355203h;

    /* renamed from: i, reason: collision with root package name */
    public int f355204i;

    /* renamed from: m, reason: collision with root package name */
    public long f355205m;

    /* renamed from: n, reason: collision with root package name */
    public int f355206n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f355207o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.n1)) {
            return false;
        }
        pj4.n1 n1Var = (pj4.n1) fVar;
        return n51.f.a(this.f355199d, n1Var.f355199d) && n51.f.a(this.f355200e, n1Var.f355200e) && n51.f.a(this.f355201f, n1Var.f355201f) && n51.f.a(java.lang.Integer.valueOf(this.f355202g), java.lang.Integer.valueOf(n1Var.f355202g)) && n51.f.a(java.lang.Integer.valueOf(this.f355203h), java.lang.Integer.valueOf(n1Var.f355203h)) && n51.f.a(java.lang.Integer.valueOf(this.f355204i), java.lang.Integer.valueOf(n1Var.f355204i)) && n51.f.a(java.lang.Long.valueOf(this.f355205m), java.lang.Long.valueOf(n1Var.f355205m)) && n51.f.a(java.lang.Integer.valueOf(this.f355206n), java.lang.Integer.valueOf(n1Var.f355206n)) && n51.f.a(this.f355207o, n1Var.f355207o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f355199d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f355200e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f355201f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f355202g);
            fVar.e(5, this.f355203h);
            fVar.e(6, this.f355204i);
            fVar.h(7, this.f355205m);
            fVar.e(8, this.f355206n);
            java.lang.String str4 = this.f355207o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f355199d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f355200e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f355201f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int e17 = j17 + b36.f.e(4, this.f355202g) + b36.f.e(5, this.f355203h) + b36.f.e(6, this.f355204i) + b36.f.h(7, this.f355205m) + b36.f.e(8, this.f355206n);
            java.lang.String str8 = this.f355207o;
            return str8 != null ? e17 + b36.f.j(9, str8) : e17;
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
        pj4.n1 n1Var = (pj4.n1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n1Var.f355199d = aVar2.k(intValue);
                return 0;
            case 2:
                n1Var.f355200e = aVar2.k(intValue);
                return 0;
            case 3:
                n1Var.f355201f = aVar2.k(intValue);
                return 0;
            case 4:
                n1Var.f355202g = aVar2.g(intValue);
                return 0;
            case 5:
                n1Var.f355203h = aVar2.g(intValue);
                return 0;
            case 6:
                n1Var.f355204i = aVar2.g(intValue);
                return 0;
            case 7:
                n1Var.f355205m = aVar2.i(intValue);
                return 0;
            case 8:
                n1Var.f355206n = aVar2.g(intValue);
                return 0;
            case 9:
                n1Var.f355207o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f355199d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "text_status_id", str, false);
            eVar.d(jSONObject, "topic_id", this.f355200e, false);
            eVar.d(jSONObject, "ext_info", this.f355201f, false);
            eVar.d(jSONObject, "liked_count", java.lang.Integer.valueOf(this.f355202g), false);
            eVar.d(jSONObject, "create_time", java.lang.Integer.valueOf(this.f355203h), false);
            eVar.d(jSONObject, "referenced_count", java.lang.Integer.valueOf(this.f355204i), false);
            eVar.d(jSONObject, "key", java.lang.Long.valueOf(this.f355205m), false);
            eVar.d(jSONObject, "comment_count", java.lang.Integer.valueOf(this.f355206n), false);
            eVar.d(jSONObject, "private_info", this.f355207o, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
