package r45;

/* loaded from: classes2.dex */
public class l77 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379208d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379209e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379210f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379211g;

    /* renamed from: h, reason: collision with root package name */
    public int f379212h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379213i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f379214m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f379215n;

    /* renamed from: o, reason: collision with root package name */
    public int f379216o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f379217p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l77)) {
            return false;
        }
        r45.l77 l77Var = (r45.l77) fVar;
        return n51.f.a(this.f379208d, l77Var.f379208d) && n51.f.a(this.f379209e, l77Var.f379209e) && n51.f.a(this.f379210f, l77Var.f379210f) && n51.f.a(this.f379211g, l77Var.f379211g) && n51.f.a(java.lang.Integer.valueOf(this.f379212h), java.lang.Integer.valueOf(l77Var.f379212h)) && n51.f.a(this.f379213i, l77Var.f379213i) && n51.f.a(this.f379214m, l77Var.f379214m) && n51.f.a(this.f379215n, l77Var.f379215n) && n51.f.a(java.lang.Integer.valueOf(this.f379216o), java.lang.Integer.valueOf(l77Var.f379216o)) && n51.f.a(this.f379217p, l77Var.f379217p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379208d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f379209e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f379210f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f379211g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f379212h);
            java.lang.String str5 = this.f379213i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f379214m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f379215n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.e(9, this.f379216o);
            java.lang.String str8 = this.f379217p;
            if (str8 != null) {
                fVar.j(19, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f379208d;
            int j17 = str9 != null ? 0 + b36.f.j(1, str9) : 0;
            java.lang.String str10 = this.f379209e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f379210f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f379211g;
            if (str12 != null) {
                j17 += b36.f.j(4, str12);
            }
            int e17 = j17 + b36.f.e(5, this.f379212h);
            java.lang.String str13 = this.f379213i;
            if (str13 != null) {
                e17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f379214m;
            if (str14 != null) {
                e17 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f379215n;
            if (str15 != null) {
                e17 += b36.f.j(8, str15);
            }
            int e18 = e17 + b36.f.e(9, this.f379216o);
            java.lang.String str16 = this.f379217p;
            return str16 != null ? e18 + b36.f.j(19, str16) : e18;
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
        r45.l77 l77Var = (r45.l77) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 19) {
            l77Var.f379217p = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                l77Var.f379208d = aVar2.k(intValue);
                return 0;
            case 2:
                l77Var.f379209e = aVar2.k(intValue);
                return 0;
            case 3:
                l77Var.f379210f = aVar2.k(intValue);
                return 0;
            case 4:
                l77Var.f379211g = aVar2.k(intValue);
                return 0;
            case 5:
                l77Var.f379212h = aVar2.g(intValue);
                return 0;
            case 6:
                l77Var.f379213i = aVar2.k(intValue);
                return 0;
            case 7:
                l77Var.f379214m = aVar2.k(intValue);
                return 0;
            case 8:
                l77Var.f379215n = aVar2.k(intValue);
                return 0;
            case 9:
                l77Var.f379216o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
