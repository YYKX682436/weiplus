package r45;

/* loaded from: classes8.dex */
public class v66 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387938d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387939e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387940f;

    /* renamed from: g, reason: collision with root package name */
    public int f387941g;

    /* renamed from: h, reason: collision with root package name */
    public int f387942h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f387943i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f387944m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f387945n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f387946o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f387947p;

    /* renamed from: q, reason: collision with root package name */
    public int f387948q;

    /* renamed from: r, reason: collision with root package name */
    public int f387949r;

    /* renamed from: s, reason: collision with root package name */
    public int f387950s;

    /* renamed from: t, reason: collision with root package name */
    public int f387951t;

    /* renamed from: u, reason: collision with root package name */
    public int f387952u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v66)) {
            return false;
        }
        r45.v66 v66Var = (r45.v66) fVar;
        return n51.f.a(this.f387938d, v66Var.f387938d) && n51.f.a(this.f387939e, v66Var.f387939e) && n51.f.a(this.f387940f, v66Var.f387940f) && n51.f.a(java.lang.Integer.valueOf(this.f387941g), java.lang.Integer.valueOf(v66Var.f387941g)) && n51.f.a(java.lang.Integer.valueOf(this.f387942h), java.lang.Integer.valueOf(v66Var.f387942h)) && n51.f.a(this.f387943i, v66Var.f387943i) && n51.f.a(this.f387944m, v66Var.f387944m) && n51.f.a(this.f387945n, v66Var.f387945n) && n51.f.a(this.f387946o, v66Var.f387946o) && n51.f.a(this.f387947p, v66Var.f387947p) && n51.f.a(java.lang.Integer.valueOf(this.f387948q), java.lang.Integer.valueOf(v66Var.f387948q)) && n51.f.a(java.lang.Integer.valueOf(this.f387949r), java.lang.Integer.valueOf(v66Var.f387949r)) && n51.f.a(java.lang.Integer.valueOf(this.f387950s), java.lang.Integer.valueOf(v66Var.f387950s)) && n51.f.a(java.lang.Integer.valueOf(this.f387951t), java.lang.Integer.valueOf(v66Var.f387951t)) && n51.f.a(java.lang.Integer.valueOf(this.f387952u), java.lang.Integer.valueOf(v66Var.f387952u));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f387938d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f387939e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f387940f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f387941g);
            fVar.e(5, this.f387942h);
            java.lang.String str4 = this.f387943i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f387944m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f387945n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f387946o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f387947p;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            fVar.e(11, this.f387948q);
            fVar.e(12, this.f387949r);
            fVar.e(13, this.f387950s);
            fVar.e(14, this.f387951t);
            fVar.e(15, this.f387952u);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f387938d;
            int j17 = str9 != null ? b36.f.j(1, str9) + 0 : 0;
            java.lang.String str10 = this.f387939e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f387940f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            int e17 = j17 + b36.f.e(4, this.f387941g) + b36.f.e(5, this.f387942h);
            java.lang.String str12 = this.f387943i;
            if (str12 != null) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f387944m;
            if (str13 != null) {
                e17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f387945n;
            if (str14 != null) {
                e17 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f387946o;
            if (str15 != null) {
                e17 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f387947p;
            if (str16 != null) {
                e17 += b36.f.j(10, str16);
            }
            return e17 + b36.f.e(11, this.f387948q) + b36.f.e(12, this.f387949r) + b36.f.e(13, this.f387950s) + b36.f.e(14, this.f387951t) + b36.f.e(15, this.f387952u);
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
        r45.v66 v66Var = (r45.v66) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                v66Var.f387938d = aVar2.k(intValue);
                return 0;
            case 2:
                v66Var.f387939e = aVar2.k(intValue);
                return 0;
            case 3:
                v66Var.f387940f = aVar2.k(intValue);
                return 0;
            case 4:
                v66Var.f387941g = aVar2.g(intValue);
                return 0;
            case 5:
                v66Var.f387942h = aVar2.g(intValue);
                return 0;
            case 6:
                v66Var.f387943i = aVar2.k(intValue);
                return 0;
            case 7:
                v66Var.f387944m = aVar2.k(intValue);
                return 0;
            case 8:
                v66Var.f387945n = aVar2.k(intValue);
                return 0;
            case 9:
                v66Var.f387946o = aVar2.k(intValue);
                return 0;
            case 10:
                v66Var.f387947p = aVar2.k(intValue);
                return 0;
            case 11:
                v66Var.f387948q = aVar2.g(intValue);
                return 0;
            case 12:
                v66Var.f387949r = aVar2.g(intValue);
                return 0;
            case 13:
                v66Var.f387950s = aVar2.g(intValue);
                return 0;
            case 14:
                v66Var.f387951t = aVar2.g(intValue);
                return 0;
            case 15:
                v66Var.f387952u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f387938d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "PickedWord", str, false);
            eVar.d(jSONObject, "PrefixText", this.f387939e, false);
            eVar.d(jSONObject, "SuffixText", this.f387940f, false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f387941g), false);
            eVar.d(jSONObject, "MainIndex", java.lang.Integer.valueOf(this.f387942h), false);
            eVar.d(jSONObject, "Url", this.f387943i, false);
            eVar.d(jSONObject, "Title", this.f387944m, false);
            eVar.d(jSONObject, "SubPickedWord", this.f387945n, false);
            eVar.d(jSONObject, "SubPrefixText", this.f387946o, false);
            eVar.d(jSONObject, "SubSuffixText", this.f387947p, false);
            eVar.d(jSONObject, "SubIndex", java.lang.Integer.valueOf(this.f387948q), false);
            eVar.d(jSONObject, "TagNewLineBefore", java.lang.Integer.valueOf(this.f387949r), false);
            eVar.d(jSONObject, "TagNewLineAfter", java.lang.Integer.valueOf(this.f387950s), false);
            eVar.d(jSONObject, "TagNewLineBeforeSub", java.lang.Integer.valueOf(this.f387951t), false);
            eVar.d(jSONObject, "TagNewLineAfterSub", java.lang.Integer.valueOf(this.f387952u), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
