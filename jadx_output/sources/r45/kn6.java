package r45;

/* loaded from: classes8.dex */
public class kn6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378862d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378863e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378864f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378865g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378866h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f378867i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f378868m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f378869n;

    /* renamed from: o, reason: collision with root package name */
    public int f378870o;

    /* renamed from: p, reason: collision with root package name */
    public int f378871p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f378872q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f378873r;

    /* renamed from: s, reason: collision with root package name */
    public int f378874s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kn6)) {
            return false;
        }
        r45.kn6 kn6Var = (r45.kn6) fVar;
        return n51.f.a(this.f378862d, kn6Var.f378862d) && n51.f.a(this.f378863e, kn6Var.f378863e) && n51.f.a(this.f378864f, kn6Var.f378864f) && n51.f.a(this.f378865g, kn6Var.f378865g) && n51.f.a(this.f378866h, kn6Var.f378866h) && n51.f.a(this.f378867i, kn6Var.f378867i) && n51.f.a(this.f378868m, kn6Var.f378868m) && n51.f.a(this.f378869n, kn6Var.f378869n) && n51.f.a(java.lang.Integer.valueOf(this.f378870o), java.lang.Integer.valueOf(kn6Var.f378870o)) && n51.f.a(java.lang.Integer.valueOf(this.f378871p), java.lang.Integer.valueOf(kn6Var.f378871p)) && n51.f.a(this.f378872q, kn6Var.f378872q) && n51.f.a(this.f378873r, kn6Var.f378873r) && n51.f.a(java.lang.Integer.valueOf(this.f378874s), java.lang.Integer.valueOf(kn6Var.f378874s));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378862d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f378863e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f378864f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f378865g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f378866h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f378867i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f378868m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f378869n;
            if (str8 != null) {
                fVar.j(8, str8);
            }
            fVar.e(9, this.f378870o);
            fVar.e(10, this.f378871p);
            java.lang.String str9 = this.f378872q;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            java.lang.String str10 = this.f378873r;
            if (str10 != null) {
                fVar.j(12, str10);
            }
            fVar.e(13, this.f378874s);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f378862d;
            int j17 = str11 != null ? 0 + b36.f.j(1, str11) : 0;
            java.lang.String str12 = this.f378863e;
            if (str12 != null) {
                j17 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f378864f;
            if (str13 != null) {
                j17 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f378865g;
            if (str14 != null) {
                j17 += b36.f.j(4, str14);
            }
            java.lang.String str15 = this.f378866h;
            if (str15 != null) {
                j17 += b36.f.j(5, str15);
            }
            java.lang.String str16 = this.f378867i;
            if (str16 != null) {
                j17 += b36.f.j(6, str16);
            }
            java.lang.String str17 = this.f378868m;
            if (str17 != null) {
                j17 += b36.f.j(7, str17);
            }
            java.lang.String str18 = this.f378869n;
            if (str18 != null) {
                j17 += b36.f.j(8, str18);
            }
            int e17 = j17 + b36.f.e(9, this.f378870o) + b36.f.e(10, this.f378871p);
            java.lang.String str19 = this.f378872q;
            if (str19 != null) {
                e17 += b36.f.j(11, str19);
            }
            java.lang.String str20 = this.f378873r;
            if (str20 != null) {
                e17 += b36.f.j(12, str20);
            }
            return e17 + b36.f.e(13, this.f378874s);
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
        r45.kn6 kn6Var = (r45.kn6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                kn6Var.f378862d = aVar2.k(intValue);
                return 0;
            case 2:
                kn6Var.f378863e = aVar2.k(intValue);
                return 0;
            case 3:
                kn6Var.f378864f = aVar2.k(intValue);
                return 0;
            case 4:
                kn6Var.f378865g = aVar2.k(intValue);
                return 0;
            case 5:
                kn6Var.f378866h = aVar2.k(intValue);
                return 0;
            case 6:
                kn6Var.f378867i = aVar2.k(intValue);
                return 0;
            case 7:
                kn6Var.f378868m = aVar2.k(intValue);
                return 0;
            case 8:
                kn6Var.f378869n = aVar2.k(intValue);
                return 0;
            case 9:
                kn6Var.f378870o = aVar2.g(intValue);
                return 0;
            case 10:
                kn6Var.f378871p = aVar2.g(intValue);
                return 0;
            case 11:
                kn6Var.f378872q = aVar2.k(intValue);
                return 0;
            case 12:
                kn6Var.f378873r = aVar2.k(intValue);
                return 0;
            case 13:
                kn6Var.f378874s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f378862d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "RequestId", str, false);
            eVar.d(jSONObject, "DocId", this.f378863e, false);
            eVar.d(jSONObject, "Content", this.f378864f, false);
            eVar.d(jSONObject, "ReplyId", this.f378865g, false);
            eVar.d(jSONObject, "SubReplyId", this.f378866h, false);
            eVar.d(jSONObject, "DocUrl", this.f378867i, false);
            eVar.d(jSONObject, "Title", this.f378868m, false);
            eVar.d(jSONObject, "SearchId", this.f378869n, false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f378870o), false);
            eVar.d(jSONObject, "SubScene", java.lang.Integer.valueOf(this.f378871p), false);
            eVar.d(jSONObject, "ByPass", this.f378872q, false);
            eVar.d(jSONObject, "Vid", this.f378873r, false);
            eVar.d(jSONObject, "Source", java.lang.Integer.valueOf(this.f378874s), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
