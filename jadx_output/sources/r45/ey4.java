package r45;

/* loaded from: classes9.dex */
public class ey4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373810d;

    /* renamed from: e, reason: collision with root package name */
    public r45.fy4 f373811e;

    /* renamed from: f, reason: collision with root package name */
    public int f373812f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f373813g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373814h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f373815i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f373816m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f373817n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f373818o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f373819p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f373820q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f373821r;

    /* renamed from: s, reason: collision with root package name */
    public int f373822s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f373823t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f373824u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f373825v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f373826w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f373827x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f373828y;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ey4)) {
            return false;
        }
        r45.ey4 ey4Var = (r45.ey4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373810d), java.lang.Integer.valueOf(ey4Var.f373810d)) && n51.f.a(this.f373811e, ey4Var.f373811e) && n51.f.a(java.lang.Integer.valueOf(this.f373812f), java.lang.Integer.valueOf(ey4Var.f373812f)) && n51.f.a(this.f373813g, ey4Var.f373813g) && n51.f.a(this.f373814h, ey4Var.f373814h) && n51.f.a(this.f373815i, ey4Var.f373815i) && n51.f.a(this.f373816m, ey4Var.f373816m) && n51.f.a(this.f373817n, ey4Var.f373817n) && n51.f.a(this.f373818o, ey4Var.f373818o) && n51.f.a(this.f373819p, ey4Var.f373819p) && n51.f.a(this.f373820q, ey4Var.f373820q) && n51.f.a(this.f373821r, ey4Var.f373821r) && n51.f.a(java.lang.Integer.valueOf(this.f373822s), java.lang.Integer.valueOf(ey4Var.f373822s)) && n51.f.a(this.f373823t, ey4Var.f373823t) && n51.f.a(this.f373824u, ey4Var.f373824u) && n51.f.a(this.f373825v, ey4Var.f373825v) && n51.f.a(this.f373826w, ey4Var.f373826w) && n51.f.a(this.f373827x, ey4Var.f373827x) && n51.f.a(this.f373828y, ey4Var.f373828y);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373810d);
            r45.fy4 fy4Var = this.f373811e;
            if (fy4Var != null) {
                fVar.i(2, fy4Var.computeSize());
                this.f373811e.writeFields(fVar);
            }
            fVar.e(3, this.f373812f);
            java.lang.String str = this.f373813g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f373814h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f373815i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f373816m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f373817n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f373818o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f373819p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f373820q;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f373821r;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            fVar.e(13, this.f373822s);
            java.lang.String str10 = this.f373823t;
            if (str10 != null) {
                fVar.j(14, str10);
            }
            java.lang.String str11 = this.f373824u;
            if (str11 != null) {
                fVar.j(15, str11);
            }
            java.lang.String str12 = this.f373825v;
            if (str12 != null) {
                fVar.j(16, str12);
            }
            java.lang.String str13 = this.f373826w;
            if (str13 != null) {
                fVar.j(17, str13);
            }
            java.lang.String str14 = this.f373827x;
            if (str14 != null) {
                fVar.j(18, str14);
            }
            java.lang.String str15 = this.f373828y;
            if (str15 != null) {
                fVar.j(19, str15);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f373810d) + 0;
            r45.fy4 fy4Var2 = this.f373811e;
            if (fy4Var2 != null) {
                e17 += b36.f.i(2, fy4Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(3, this.f373812f);
            java.lang.String str16 = this.f373813g;
            if (str16 != null) {
                e18 += b36.f.j(4, str16);
            }
            java.lang.String str17 = this.f373814h;
            if (str17 != null) {
                e18 += b36.f.j(5, str17);
            }
            java.lang.String str18 = this.f373815i;
            if (str18 != null) {
                e18 += b36.f.j(6, str18);
            }
            java.lang.String str19 = this.f373816m;
            if (str19 != null) {
                e18 += b36.f.j(7, str19);
            }
            java.lang.String str20 = this.f373817n;
            if (str20 != null) {
                e18 += b36.f.j(8, str20);
            }
            java.lang.String str21 = this.f373818o;
            if (str21 != null) {
                e18 += b36.f.j(9, str21);
            }
            java.lang.String str22 = this.f373819p;
            if (str22 != null) {
                e18 += b36.f.j(10, str22);
            }
            java.lang.String str23 = this.f373820q;
            if (str23 != null) {
                e18 += b36.f.j(11, str23);
            }
            java.lang.String str24 = this.f373821r;
            if (str24 != null) {
                e18 += b36.f.j(12, str24);
            }
            int e19 = e18 + b36.f.e(13, this.f373822s);
            java.lang.String str25 = this.f373823t;
            if (str25 != null) {
                e19 += b36.f.j(14, str25);
            }
            java.lang.String str26 = this.f373824u;
            if (str26 != null) {
                e19 += b36.f.j(15, str26);
            }
            java.lang.String str27 = this.f373825v;
            if (str27 != null) {
                e19 += b36.f.j(16, str27);
            }
            java.lang.String str28 = this.f373826w;
            if (str28 != null) {
                e19 += b36.f.j(17, str28);
            }
            java.lang.String str29 = this.f373827x;
            if (str29 != null) {
                e19 += b36.f.j(18, str29);
            }
            java.lang.String str30 = this.f373828y;
            return str30 != null ? e19 + b36.f.j(19, str30) : e19;
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
        r45.ey4 ey4Var = (r45.ey4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ey4Var.f373810d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.fy4 fy4Var3 = new r45.fy4();
                    if (bArr != null && bArr.length > 0) {
                        fy4Var3.parseFrom(bArr);
                    }
                    ey4Var.f373811e = fy4Var3;
                }
                return 0;
            case 3:
                ey4Var.f373812f = aVar2.g(intValue);
                return 0;
            case 4:
                ey4Var.f373813g = aVar2.k(intValue);
                return 0;
            case 5:
                ey4Var.f373814h = aVar2.k(intValue);
                return 0;
            case 6:
                ey4Var.f373815i = aVar2.k(intValue);
                return 0;
            case 7:
                ey4Var.f373816m = aVar2.k(intValue);
                return 0;
            case 8:
                ey4Var.f373817n = aVar2.k(intValue);
                return 0;
            case 9:
                ey4Var.f373818o = aVar2.k(intValue);
                return 0;
            case 10:
                ey4Var.f373819p = aVar2.k(intValue);
                return 0;
            case 11:
                ey4Var.f373820q = aVar2.k(intValue);
                return 0;
            case 12:
                ey4Var.f373821r = aVar2.k(intValue);
                return 0;
            case 13:
                ey4Var.f373822s = aVar2.g(intValue);
                return 0;
            case 14:
                ey4Var.f373823t = aVar2.k(intValue);
                return 0;
            case 15:
                ey4Var.f373824u = aVar2.k(intValue);
                return 0;
            case 16:
                ey4Var.f373825v = aVar2.k(intValue);
                return 0;
            case 17:
                ey4Var.f373826w = aVar2.k(intValue);
                return 0;
            case 18:
                ey4Var.f373827x = aVar2.k(intValue);
                return 0;
            case 19:
                ey4Var.f373828y = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
