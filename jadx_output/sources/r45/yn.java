package r45;

/* loaded from: classes2.dex */
public class yn extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391222d;

    /* renamed from: e, reason: collision with root package name */
    public int f391223e;

    /* renamed from: f, reason: collision with root package name */
    public int f391224f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f391225g;

    /* renamed from: h, reason: collision with root package name */
    public int f391226h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f391227i;

    /* renamed from: m, reason: collision with root package name */
    public int f391228m;

    /* renamed from: n, reason: collision with root package name */
    public int f391229n;

    /* renamed from: o, reason: collision with root package name */
    public int f391230o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f391231p;

    /* renamed from: q, reason: collision with root package name */
    public int f391232q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yn)) {
            return false;
        }
        r45.yn ynVar = (r45.yn) fVar;
        return n51.f.a(this.f391222d, ynVar.f391222d) && n51.f.a(java.lang.Integer.valueOf(this.f391223e), java.lang.Integer.valueOf(ynVar.f391223e)) && n51.f.a(java.lang.Integer.valueOf(this.f391224f), java.lang.Integer.valueOf(ynVar.f391224f)) && n51.f.a(this.f391225g, ynVar.f391225g) && n51.f.a(java.lang.Integer.valueOf(this.f391226h), java.lang.Integer.valueOf(ynVar.f391226h)) && n51.f.a(this.f391227i, ynVar.f391227i) && n51.f.a(java.lang.Integer.valueOf(this.f391228m), java.lang.Integer.valueOf(ynVar.f391228m)) && n51.f.a(java.lang.Integer.valueOf(this.f391229n), java.lang.Integer.valueOf(ynVar.f391229n)) && n51.f.a(java.lang.Integer.valueOf(this.f391230o), java.lang.Integer.valueOf(ynVar.f391230o)) && n51.f.a(this.f391231p, ynVar.f391231p) && n51.f.a(java.lang.Integer.valueOf(this.f391232q), java.lang.Integer.valueOf(ynVar.f391232q));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f391222d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f391223e);
            fVar.e(3, this.f391224f);
            java.lang.String str2 = this.f391225g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f391226h);
            java.lang.String str3 = this.f391227i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f391228m);
            fVar.e(8, this.f391229n);
            fVar.e(9, this.f391230o);
            java.lang.String str4 = this.f391231p;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            fVar.e(15, this.f391232q);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f391222d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.e(2, this.f391223e) + b36.f.e(3, this.f391224f);
            java.lang.String str6 = this.f391225g;
            if (str6 != null) {
                j17 += b36.f.j(4, str6);
            }
            int e17 = j17 + b36.f.e(5, this.f391226h);
            java.lang.String str7 = this.f391227i;
            if (str7 != null) {
                e17 += b36.f.j(6, str7);
            }
            int e18 = e17 + b36.f.e(7, this.f391228m) + b36.f.e(8, this.f391229n) + b36.f.e(9, this.f391230o);
            java.lang.String str8 = this.f391231p;
            if (str8 != null) {
                e18 += b36.f.j(10, str8);
            }
            return e18 + b36.f.e(15, this.f391232q);
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
        r45.yn ynVar = (r45.yn) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 15) {
            ynVar.f391232q = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                ynVar.f391222d = aVar2.k(intValue);
                return 0;
            case 2:
                ynVar.f391223e = aVar2.g(intValue);
                return 0;
            case 3:
                ynVar.f391224f = aVar2.g(intValue);
                return 0;
            case 4:
                ynVar.f391225g = aVar2.k(intValue);
                return 0;
            case 5:
                ynVar.f391226h = aVar2.g(intValue);
                return 0;
            case 6:
                ynVar.f391227i = aVar2.k(intValue);
                return 0;
            case 7:
                ynVar.f391228m = aVar2.g(intValue);
                return 0;
            case 8:
                ynVar.f391229n = aVar2.g(intValue);
                return 0;
            case 9:
                ynVar.f391230o = aVar2.g(intValue);
                return 0;
            case 10:
                ynVar.f391231p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f391222d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "appid", str, false);
            eVar.d(jSONObject, "version_type", java.lang.Integer.valueOf(this.f391223e), false);
            eVar.d(jSONObject, "app_version", java.lang.Integer.valueOf(this.f391224f), false);
            eVar.d(jSONObject, "extinfo", this.f391225g, false);
            eVar.d(jSONObject, "appuin", java.lang.Integer.valueOf(this.f391226h), false);
            eVar.d(jSONObject, "debugurl", this.f391227i, false);
            eVar.d(jSONObject, "isrefresh", java.lang.Integer.valueOf(this.f391228m), false);
            eVar.d(jSONObject, "isdevtools", java.lang.Integer.valueOf(this.f391229n), false);
            eVar.d(jSONObject, "isusing_cached_location", java.lang.Integer.valueOf(this.f391230o), false);
            eVar.d(jSONObject, "from_url", this.f391231p, false);
            eVar.d(jSONObject, "screen_width", java.lang.Integer.valueOf(this.f391232q), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
