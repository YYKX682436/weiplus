package r45;

/* loaded from: classes4.dex */
public class fn4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f374462d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374463e;

    /* renamed from: f, reason: collision with root package name */
    public int f374464f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374465g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374466h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fn4)) {
            return false;
        }
        r45.fn4 fn4Var = (r45.fn4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f374462d), java.lang.Integer.valueOf(fn4Var.f374462d)) && n51.f.a(this.f374463e, fn4Var.f374463e) && n51.f.a(java.lang.Integer.valueOf(this.f374464f), java.lang.Integer.valueOf(fn4Var.f374464f)) && n51.f.a(this.f374465g, fn4Var.f374465g) && n51.f.a(this.f374466h, fn4Var.f374466h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f fromJson(java.lang.String str) {
        char c17;
        if (str != null && !"".equals(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    switch (next.hashCode()) {
                        case -1068855134:
                            if (next.equals("mobile")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -239427946:
                            if (next.equals("protocal_url")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 738950403:
                            if (next.equals("channel")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 1836797375:
                            if (next.equals("protocal_title")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 1974666273:
                            if (next.equals("carrier_type")) {
                                c17 = 2;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f374462d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 1) {
                        this.f374463e = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 2) {
                        this.f374464f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 3) {
                        this.f374465g = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 4) {
                        this.f374466h = (java.lang.String) jSONObject.opt(next);
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f374462d);
            java.lang.String str = this.f374463e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f374464f);
            java.lang.String str2 = this.f374465g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f374466h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f374462d) + 0;
            java.lang.String str4 = this.f374463e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            int e18 = e17 + b36.f.e(3, this.f374464f);
            java.lang.String str5 = this.f374465g;
            if (str5 != null) {
                e18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f374466h;
            return str6 != null ? e18 + b36.f.j(5, str6) : e18;
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
        r45.fn4 fn4Var = (r45.fn4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fn4Var.f374462d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            fn4Var.f374463e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            fn4Var.f374464f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            fn4Var.f374465g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        fn4Var.f374466h = aVar2.k(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f374462d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "channel", valueOf, false);
            eVar.d(jSONObject, "mobile", this.f374463e, false);
            eVar.d(jSONObject, "carrier_type", java.lang.Integer.valueOf(this.f374464f), false);
            eVar.d(jSONObject, "protocal_title", this.f374465g, false);
            eVar.d(jSONObject, "protocal_url", this.f374466h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
