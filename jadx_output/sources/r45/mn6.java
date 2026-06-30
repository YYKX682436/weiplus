package r45;

/* loaded from: classes15.dex */
public class mn6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380697d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380698e;

    /* renamed from: f, reason: collision with root package name */
    public int f380699f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380700g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380701h;

    /* renamed from: i, reason: collision with root package name */
    public int f380702i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f380703m;

    /* renamed from: n, reason: collision with root package name */
    public int f380704n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f380705o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f380706p;

    /* renamed from: q, reason: collision with root package name */
    public int f380707q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mn6)) {
            return false;
        }
        r45.mn6 mn6Var = (r45.mn6) fVar;
        return n51.f.a(this.f380697d, mn6Var.f380697d) && n51.f.a(this.f380698e, mn6Var.f380698e) && n51.f.a(java.lang.Integer.valueOf(this.f380699f), java.lang.Integer.valueOf(mn6Var.f380699f)) && n51.f.a(this.f380700g, mn6Var.f380700g) && n51.f.a(this.f380701h, mn6Var.f380701h) && n51.f.a(java.lang.Integer.valueOf(this.f380702i), java.lang.Integer.valueOf(mn6Var.f380702i)) && n51.f.a(this.f380703m, mn6Var.f380703m) && n51.f.a(java.lang.Integer.valueOf(this.f380704n), java.lang.Integer.valueOf(mn6Var.f380704n)) && n51.f.a(this.f380705o, mn6Var.f380705o) && n51.f.a(this.f380706p, mn6Var.f380706p) && n51.f.a(java.lang.Integer.valueOf(this.f380707q), java.lang.Integer.valueOf(mn6Var.f380707q));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380697d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f380698e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f380699f);
            java.lang.String str3 = this.f380700g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f380701h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f380702i);
            java.lang.String str5 = this.f380703m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f380704n);
            java.lang.String str6 = this.f380705o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f380706p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            fVar.e(11, this.f380707q);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f380697d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f380698e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            int e17 = j17 + b36.f.e(3, this.f380699f);
            java.lang.String str10 = this.f380700g;
            if (str10 != null) {
                e17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f380701h;
            if (str11 != null) {
                e17 += b36.f.j(5, str11);
            }
            int e18 = e17 + b36.f.e(6, this.f380702i);
            java.lang.String str12 = this.f380703m;
            if (str12 != null) {
                e18 += b36.f.j(7, str12);
            }
            int e19 = e18 + b36.f.e(8, this.f380704n);
            java.lang.String str13 = this.f380705o;
            if (str13 != null) {
                e19 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f380706p;
            if (str14 != null) {
                e19 += b36.f.j(10, str14);
            }
            return e19 + b36.f.e(11, this.f380707q);
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
        r45.mn6 mn6Var = (r45.mn6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mn6Var.f380697d = aVar2.k(intValue);
                return 0;
            case 2:
                mn6Var.f380698e = aVar2.k(intValue);
                return 0;
            case 3:
                mn6Var.f380699f = aVar2.g(intValue);
                return 0;
            case 4:
                mn6Var.f380700g = aVar2.k(intValue);
                return 0;
            case 5:
                mn6Var.f380701h = aVar2.k(intValue);
                return 0;
            case 6:
                mn6Var.f380702i = aVar2.g(intValue);
                return 0;
            case 7:
                mn6Var.f380703m = aVar2.k(intValue);
                return 0;
            case 8:
                mn6Var.f380704n = aVar2.g(intValue);
                return 0;
            case 9:
                mn6Var.f380705o = aVar2.k(intValue);
                return 0;
            case 10:
                mn6Var.f380706p = aVar2.k(intValue);
                return 0;
            case 11:
                mn6Var.f380707q = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f380697d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "DocId", str, false);
            eVar.d(jSONObject, "CommentId", this.f380698e, false);
            eVar.d(jSONObject, "OpType", java.lang.Integer.valueOf(this.f380699f), false);
            eVar.d(jSONObject, "RequestId", this.f380700g, false);
            eVar.d(jSONObject, "Content", this.f380701h, false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f380702i), false);
            eVar.d(jSONObject, "SearchId", this.f380703m, false);
            eVar.d(jSONObject, "SubScene", java.lang.Integer.valueOf(this.f380704n), false);
            eVar.d(jSONObject, "Vid", this.f380705o, false);
            eVar.d(jSONObject, "ByPass", this.f380706p, false);
            eVar.d(jSONObject, "Source", java.lang.Integer.valueOf(this.f380707q), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
