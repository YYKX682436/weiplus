package r45;

/* loaded from: classes15.dex */
public class lv extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379843d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379844e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379845f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379846g;

    /* renamed from: h, reason: collision with root package name */
    public long f379847h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379848i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f379849m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f379850n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f379851o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f379852p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f379853q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f379854r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f379855s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lv)) {
            return false;
        }
        r45.lv lvVar = (r45.lv) fVar;
        return n51.f.a(this.f379843d, lvVar.f379843d) && n51.f.a(this.f379844e, lvVar.f379844e) && n51.f.a(this.f379845f, lvVar.f379845f) && n51.f.a(this.f379846g, lvVar.f379846g) && n51.f.a(java.lang.Long.valueOf(this.f379847h), java.lang.Long.valueOf(lvVar.f379847h)) && n51.f.a(this.f379848i, lvVar.f379848i) && n51.f.a(this.f379849m, lvVar.f379849m) && n51.f.a(this.f379850n, lvVar.f379850n) && n51.f.a(this.f379851o, lvVar.f379851o) && n51.f.a(this.f379852p, lvVar.f379852p) && n51.f.a(this.f379853q, lvVar.f379853q) && n51.f.a(this.f379854r, lvVar.f379854r) && n51.f.a(this.f379855s, lvVar.f379855s);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379843d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f379844e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f379845f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f379846g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.h(5, this.f379847h);
            java.lang.String str5 = this.f379848i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f379849m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f379850n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f379851o;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            java.lang.String str9 = this.f379852p;
            if (str9 != null) {
                fVar.j(10, str9);
            }
            java.lang.String str10 = this.f379853q;
            if (str10 != null) {
                fVar.j(11, str10);
            }
            java.lang.String str11 = this.f379854r;
            if (str11 != null) {
                fVar.j(12, str11);
            }
            java.lang.String str12 = this.f379855s;
            if (str12 == null) {
                return 0;
            }
            fVar.j(13, str12);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str13 = this.f379843d;
            int j17 = str13 != null ? 0 + b36.f.j(1, str13) : 0;
            java.lang.String str14 = this.f379844e;
            if (str14 != null) {
                j17 += b36.f.j(2, str14);
            }
            java.lang.String str15 = this.f379845f;
            if (str15 != null) {
                j17 += b36.f.j(3, str15);
            }
            java.lang.String str16 = this.f379846g;
            if (str16 != null) {
                j17 += b36.f.j(4, str16);
            }
            int h17 = j17 + b36.f.h(5, this.f379847h);
            java.lang.String str17 = this.f379848i;
            if (str17 != null) {
                h17 += b36.f.j(6, str17);
            }
            java.lang.String str18 = this.f379849m;
            if (str18 != null) {
                h17 += b36.f.j(7, str18);
            }
            java.lang.String str19 = this.f379850n;
            if (str19 != null) {
                h17 += b36.f.j(8, str19);
            }
            java.lang.String str20 = this.f379851o;
            if (str20 != null) {
                h17 += b36.f.j(9, str20);
            }
            java.lang.String str21 = this.f379852p;
            if (str21 != null) {
                h17 += b36.f.j(10, str21);
            }
            java.lang.String str22 = this.f379853q;
            if (str22 != null) {
                h17 += b36.f.j(11, str22);
            }
            java.lang.String str23 = this.f379854r;
            if (str23 != null) {
                h17 += b36.f.j(12, str23);
            }
            java.lang.String str24 = this.f379855s;
            return str24 != null ? h17 + b36.f.j(13, str24) : h17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.lv lvVar = (r45.lv) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lvVar.f379843d = aVar2.k(intValue);
                return 0;
            case 2:
                lvVar.f379844e = aVar2.k(intValue);
                return 0;
            case 3:
                lvVar.f379845f = aVar2.k(intValue);
                return 0;
            case 4:
                lvVar.f379846g = aVar2.k(intValue);
                return 0;
            case 5:
                lvVar.f379847h = aVar2.i(intValue);
                return 0;
            case 6:
                lvVar.f379848i = aVar2.k(intValue);
                return 0;
            case 7:
                lvVar.f379849m = aVar2.k(intValue);
                return 0;
            case 8:
                lvVar.f379850n = aVar2.k(intValue);
                return 0;
            case 9:
                lvVar.f379851o = aVar2.k(intValue);
                return 0;
            case 10:
                lvVar.f379852p = aVar2.k(intValue);
                return 0;
            case 11:
                lvVar.f379853q = aVar2.k(intValue);
                return 0;
            case 12:
                lvVar.f379854r = aVar2.k(intValue);
                return 0;
            case 13:
                lvVar.f379855s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
