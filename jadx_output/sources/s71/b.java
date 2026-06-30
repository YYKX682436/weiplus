package s71;

/* loaded from: classes12.dex */
public class b extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f403970d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f403971e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f403972f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f403973g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f403974h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f403975i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f403976m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f403977n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f403978o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f403979p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f403980q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f403981r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof s71.b)) {
            return false;
        }
        s71.b bVar = (s71.b) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f403970d), java.lang.Integer.valueOf(bVar.f403970d)) && n51.f.a(this.f403971e, bVar.f403971e) && n51.f.a(this.f403972f, bVar.f403972f) && n51.f.a(this.f403973g, bVar.f403973g) && n51.f.a(this.f403974h, bVar.f403974h) && n51.f.a(this.f403975i, bVar.f403975i) && n51.f.a(this.f403976m, bVar.f403976m) && n51.f.a(this.f403977n, bVar.f403977n) && n51.f.a(this.f403978o, bVar.f403978o) && n51.f.a(this.f403979p, bVar.f403979p) && n51.f.a(this.f403980q, bVar.f403980q) && n51.f.a(this.f403981r, bVar.f403981r);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f403970d);
            java.lang.String str = this.f403971e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f403972f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f403973g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f403974h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f403975i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f403976m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f403977n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f403978o;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            java.lang.String str9 = this.f403979p;
            if (str9 != null) {
                fVar.j(10, str9);
            }
            java.lang.String str10 = this.f403980q;
            if (str10 != null) {
                fVar.j(11, str10);
            }
            java.lang.String str11 = this.f403981r;
            if (str11 != null) {
                fVar.j(12, str11);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f403970d) + 0;
            java.lang.String str12 = this.f403971e;
            if (str12 != null) {
                e17 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f403972f;
            if (str13 != null) {
                e17 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f403973g;
            if (str14 != null) {
                e17 += b36.f.j(4, str14);
            }
            java.lang.String str15 = this.f403974h;
            if (str15 != null) {
                e17 += b36.f.j(5, str15);
            }
            java.lang.String str16 = this.f403975i;
            if (str16 != null) {
                e17 += b36.f.j(6, str16);
            }
            java.lang.String str17 = this.f403976m;
            if (str17 != null) {
                e17 += b36.f.j(7, str17);
            }
            java.lang.String str18 = this.f403977n;
            if (str18 != null) {
                e17 += b36.f.j(8, str18);
            }
            java.lang.String str19 = this.f403978o;
            if (str19 != null) {
                e17 += b36.f.j(9, str19);
            }
            java.lang.String str20 = this.f403979p;
            if (str20 != null) {
                e17 += b36.f.j(10, str20);
            }
            java.lang.String str21 = this.f403980q;
            if (str21 != null) {
                e17 += b36.f.j(11, str21);
            }
            java.lang.String str22 = this.f403981r;
            return str22 != null ? e17 + b36.f.j(12, str22) : e17;
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
        s71.b bVar = (s71.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bVar.f403970d = aVar2.g(intValue);
                return 0;
            case 2:
                bVar.f403971e = aVar2.k(intValue);
                return 0;
            case 3:
                bVar.f403972f = aVar2.k(intValue);
                return 0;
            case 4:
                bVar.f403973g = aVar2.k(intValue);
                return 0;
            case 5:
                bVar.f403974h = aVar2.k(intValue);
                return 0;
            case 6:
                bVar.f403975i = aVar2.k(intValue);
                return 0;
            case 7:
                bVar.f403976m = aVar2.k(intValue);
                return 0;
            case 8:
                bVar.f403977n = aVar2.k(intValue);
                return 0;
            case 9:
                bVar.f403978o = aVar2.k(intValue);
                return 0;
            case 10:
                bVar.f403979p = aVar2.k(intValue);
                return 0;
            case 11:
                bVar.f403980q = aVar2.k(intValue);
                return 0;
            case 12:
                bVar.f403981r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
