package r45;

/* loaded from: classes12.dex */
public class ed6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373327d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373328e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373329f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f373330g;

    /* renamed from: h, reason: collision with root package name */
    public int f373331h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f373332i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f373333m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f373334n;

    /* renamed from: o, reason: collision with root package name */
    public int f373335o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f373336p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ed6)) {
            return false;
        }
        r45.ed6 ed6Var = (r45.ed6) fVar;
        return n51.f.a(this.f373327d, ed6Var.f373327d) && n51.f.a(this.f373328e, ed6Var.f373328e) && n51.f.a(this.f373329f, ed6Var.f373329f) && n51.f.a(this.f373330g, ed6Var.f373330g) && n51.f.a(java.lang.Integer.valueOf(this.f373331h), java.lang.Integer.valueOf(ed6Var.f373331h)) && n51.f.a(this.f373332i, ed6Var.f373332i) && n51.f.a(this.f373333m, ed6Var.f373333m) && n51.f.a(this.f373334n, ed6Var.f373334n) && n51.f.a(java.lang.Integer.valueOf(this.f373335o), java.lang.Integer.valueOf(ed6Var.f373335o)) && n51.f.a(this.f373336p, ed6Var.f373336p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f373327d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f373328e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f373329f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f373330g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f373331h);
            java.lang.String str5 = this.f373332i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f373333m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f373334n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.e(9, this.f373335o);
            java.lang.String str8 = this.f373336p;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f373327d;
            int j17 = str9 != null ? 0 + b36.f.j(1, str9) : 0;
            java.lang.String str10 = this.f373328e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f373329f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f373330g;
            if (str12 != null) {
                j17 += b36.f.j(4, str12);
            }
            int e17 = j17 + b36.f.e(5, this.f373331h);
            java.lang.String str13 = this.f373332i;
            if (str13 != null) {
                e17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f373333m;
            if (str14 != null) {
                e17 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f373334n;
            if (str15 != null) {
                e17 += b36.f.j(8, str15);
            }
            int e18 = e17 + b36.f.e(9, this.f373335o);
            java.lang.String str16 = this.f373336p;
            return str16 != null ? e18 + b36.f.j(10, str16) : e18;
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
        r45.ed6 ed6Var = (r45.ed6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ed6Var.f373327d = aVar2.k(intValue);
                return 0;
            case 2:
                ed6Var.f373328e = aVar2.k(intValue);
                return 0;
            case 3:
                ed6Var.f373329f = aVar2.k(intValue);
                return 0;
            case 4:
                ed6Var.f373330g = aVar2.k(intValue);
                return 0;
            case 5:
                ed6Var.f373331h = aVar2.g(intValue);
                return 0;
            case 6:
                ed6Var.f373332i = aVar2.k(intValue);
                return 0;
            case 7:
                ed6Var.f373333m = aVar2.k(intValue);
                return 0;
            case 8:
                ed6Var.f373334n = aVar2.k(intValue);
                return 0;
            case 9:
                ed6Var.f373335o = aVar2.g(intValue);
                return 0;
            case 10:
                ed6Var.f373336p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
