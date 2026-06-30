package pj4;

/* loaded from: classes9.dex */
public class j extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f355125d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f355126e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f355127f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f355128g;

    /* renamed from: h, reason: collision with root package name */
    public int f355129h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f355130i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f355131m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f355132n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f355133o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f355134p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f355135q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f355136r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f355137s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f355138t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.j)) {
            return false;
        }
        pj4.j jVar = (pj4.j) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f355125d), java.lang.Integer.valueOf(jVar.f355125d)) && n51.f.a(this.f355126e, jVar.f355126e) && n51.f.a(this.f355127f, jVar.f355127f) && n51.f.a(this.f355128g, jVar.f355128g) && n51.f.a(java.lang.Integer.valueOf(this.f355129h), java.lang.Integer.valueOf(jVar.f355129h)) && n51.f.a(this.f355130i, jVar.f355130i) && n51.f.a(this.f355131m, jVar.f355131m) && n51.f.a(this.f355132n, jVar.f355132n) && n51.f.a(this.f355133o, jVar.f355133o) && n51.f.a(this.f355134p, jVar.f355134p) && n51.f.a(this.f355135q, jVar.f355135q) && n51.f.a(this.f355136r, jVar.f355136r) && n51.f.a(this.f355137s, jVar.f355137s) && n51.f.a(java.lang.Boolean.valueOf(this.f355138t), java.lang.Boolean.valueOf(jVar.f355138t));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f355125d);
            java.lang.String str = this.f355126e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f355127f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f355128g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f355129h);
            java.lang.String str4 = this.f355130i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f355131m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f355132n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f355133o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f355134p;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            java.lang.String str9 = this.f355135q;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            java.lang.String str10 = this.f355136r;
            if (str10 != null) {
                fVar.j(12, str10);
            }
            java.lang.String str11 = this.f355137s;
            if (str11 != null) {
                fVar.j(13, str11);
            }
            fVar.a(14, this.f355138t);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f355125d) + 0;
            java.lang.String str12 = this.f355126e;
            if (str12 != null) {
                e17 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f355127f;
            if (str13 != null) {
                e17 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f355128g;
            if (str14 != null) {
                e17 += b36.f.j(4, str14);
            }
            int e18 = e17 + b36.f.e(5, this.f355129h);
            java.lang.String str15 = this.f355130i;
            if (str15 != null) {
                e18 += b36.f.j(6, str15);
            }
            java.lang.String str16 = this.f355131m;
            if (str16 != null) {
                e18 += b36.f.j(7, str16);
            }
            java.lang.String str17 = this.f355132n;
            if (str17 != null) {
                e18 += b36.f.j(8, str17);
            }
            java.lang.String str18 = this.f355133o;
            if (str18 != null) {
                e18 += b36.f.j(9, str18);
            }
            java.lang.String str19 = this.f355134p;
            if (str19 != null) {
                e18 += b36.f.j(10, str19);
            }
            java.lang.String str20 = this.f355135q;
            if (str20 != null) {
                e18 += b36.f.j(11, str20);
            }
            java.lang.String str21 = this.f355136r;
            if (str21 != null) {
                e18 += b36.f.j(12, str21);
            }
            java.lang.String str22 = this.f355137s;
            if (str22 != null) {
                e18 += b36.f.j(13, str22);
            }
            return e18 + b36.f.a(14, this.f355138t);
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
        pj4.j jVar = (pj4.j) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jVar.f355125d = aVar2.g(intValue);
                return 0;
            case 2:
                jVar.f355126e = aVar2.k(intValue);
                return 0;
            case 3:
                jVar.f355127f = aVar2.k(intValue);
                return 0;
            case 4:
                jVar.f355128g = aVar2.k(intValue);
                return 0;
            case 5:
                jVar.f355129h = aVar2.g(intValue);
                return 0;
            case 6:
                jVar.f355130i = aVar2.k(intValue);
                return 0;
            case 7:
                jVar.f355131m = aVar2.k(intValue);
                return 0;
            case 8:
                jVar.f355132n = aVar2.k(intValue);
                return 0;
            case 9:
                jVar.f355133o = aVar2.k(intValue);
                return 0;
            case 10:
                jVar.f355134p = aVar2.k(intValue);
                return 0;
            case 11:
                jVar.f355135q = aVar2.k(intValue);
                return 0;
            case 12:
                jVar.f355136r = aVar2.k(intValue);
                return 0;
            case 13:
                jVar.f355137s = aVar2.k(intValue);
                return 0;
            case 14:
                jVar.f355138t = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f355125d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "ret", valueOf, false);
            eVar.d(jSONObject, "err_msg", this.f355126e, false);
            eVar.d(jSONObject, "enc_username", this.f355127f, false);
            eVar.d(jSONObject, "nickname", this.f355128g, false);
            eVar.d(jSONObject, "sex", java.lang.Integer.valueOf(this.f355129h), false);
            eVar.d(jSONObject, "province", this.f355130i, false);
            eVar.d(jSONObject, "city", this.f355131m, false);
            eVar.d(jSONObject, "signature", this.f355132n, false);
            eVar.d(jSONObject, "big_head_img_url", this.f355133o, false);
            eVar.d(jSONObject, "small_head_img_url", this.f355134p, false);
            eVar.d(jSONObject, "text_status_ext_info", this.f355135q, false);
            eVar.d(jSONObject, "country", this.f355136r, false);
            eVar.d(jSONObject, "text_status_id", this.f355137s, false);
            eVar.d(jSONObject, "block", java.lang.Boolean.valueOf(this.f355138t), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
