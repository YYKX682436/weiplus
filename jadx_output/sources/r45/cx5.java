package r45;

/* loaded from: classes10.dex */
public class cx5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371900d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371901e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371902f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371903g;

    /* renamed from: h, reason: collision with root package name */
    public int f371904h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f371905i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f371906m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f371907n;

    /* renamed from: o, reason: collision with root package name */
    public int f371908o;

    /* renamed from: p, reason: collision with root package name */
    public r45.b05 f371909p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f371910q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f371911r;

    /* renamed from: s, reason: collision with root package name */
    public int f371912s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f371913t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cx5)) {
            return false;
        }
        r45.cx5 cx5Var = (r45.cx5) fVar;
        return n51.f.a(this.f371900d, cx5Var.f371900d) && n51.f.a(this.f371901e, cx5Var.f371901e) && n51.f.a(this.f371902f, cx5Var.f371902f) && n51.f.a(this.f371903g, cx5Var.f371903g) && n51.f.a(java.lang.Integer.valueOf(this.f371904h), java.lang.Integer.valueOf(cx5Var.f371904h)) && n51.f.a(this.f371905i, cx5Var.f371905i) && n51.f.a(this.f371906m, cx5Var.f371906m) && n51.f.a(this.f371907n, cx5Var.f371907n) && n51.f.a(java.lang.Integer.valueOf(this.f371908o), java.lang.Integer.valueOf(cx5Var.f371908o)) && n51.f.a(this.f371909p, cx5Var.f371909p) && n51.f.a(this.f371910q, cx5Var.f371910q) && n51.f.a(this.f371911r, cx5Var.f371911r) && n51.f.a(java.lang.Integer.valueOf(this.f371912s), java.lang.Integer.valueOf(cx5Var.f371912s)) && n51.f.a(this.f371913t, cx5Var.f371913t);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f371900d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f371901e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f371902f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f371903g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f371904h);
            java.lang.String str5 = this.f371905i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f371906m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f371907n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.e(9, this.f371908o);
            r45.b05 b05Var = this.f371909p;
            if (b05Var != null) {
                fVar.i(10, b05Var.computeSize());
                this.f371909p.writeFields(fVar);
            }
            java.lang.String str8 = this.f371910q;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f371911r;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            fVar.e(13, this.f371912s);
            java.lang.String str10 = this.f371913t;
            if (str10 != null) {
                fVar.j(14, str10);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f371900d;
            int j17 = str11 != null ? b36.f.j(1, str11) + 0 : 0;
            java.lang.String str12 = this.f371901e;
            if (str12 != null) {
                j17 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f371902f;
            if (str13 != null) {
                j17 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f371903g;
            if (str14 != null) {
                j17 += b36.f.j(4, str14);
            }
            int e17 = j17 + b36.f.e(5, this.f371904h);
            java.lang.String str15 = this.f371905i;
            if (str15 != null) {
                e17 += b36.f.j(6, str15);
            }
            java.lang.String str16 = this.f371906m;
            if (str16 != null) {
                e17 += b36.f.j(7, str16);
            }
            java.lang.String str17 = this.f371907n;
            if (str17 != null) {
                e17 += b36.f.j(8, str17);
            }
            int e18 = e17 + b36.f.e(9, this.f371908o);
            r45.b05 b05Var2 = this.f371909p;
            if (b05Var2 != null) {
                e18 += b36.f.i(10, b05Var2.computeSize());
            }
            java.lang.String str18 = this.f371910q;
            if (str18 != null) {
                e18 += b36.f.j(11, str18);
            }
            java.lang.String str19 = this.f371911r;
            if (str19 != null) {
                e18 += b36.f.j(12, str19);
            }
            int e19 = e18 + b36.f.e(13, this.f371912s);
            java.lang.String str20 = this.f371913t;
            return str20 != null ? e19 + b36.f.j(14, str20) : e19;
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
        r45.cx5 cx5Var = (r45.cx5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cx5Var.f371900d = aVar2.k(intValue);
                return 0;
            case 2:
                cx5Var.f371901e = aVar2.k(intValue);
                return 0;
            case 3:
                cx5Var.f371902f = aVar2.k(intValue);
                return 0;
            case 4:
                cx5Var.f371903g = aVar2.k(intValue);
                return 0;
            case 5:
                cx5Var.f371904h = aVar2.g(intValue);
                return 0;
            case 6:
                cx5Var.f371905i = aVar2.k(intValue);
                return 0;
            case 7:
                cx5Var.f371906m = aVar2.k(intValue);
                return 0;
            case 8:
                cx5Var.f371907n = aVar2.k(intValue);
                return 0;
            case 9:
                cx5Var.f371908o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.b05 b05Var3 = new r45.b05();
                    if (bArr != null && bArr.length > 0) {
                        b05Var3.parseFrom(bArr);
                    }
                    cx5Var.f371909p = b05Var3;
                }
                return 0;
            case 11:
                cx5Var.f371910q = aVar2.k(intValue);
                return 0;
            case 12:
                cx5Var.f371911r = aVar2.k(intValue);
                return 0;
            case 13:
                cx5Var.f371912s = aVar2.g(intValue);
                return 0;
            case 14:
                cx5Var.f371913t = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
