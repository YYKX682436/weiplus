package r45;

/* loaded from: classes2.dex */
public class gg4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375221d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375222e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375223f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f375224g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f375225h;

    /* renamed from: i, reason: collision with root package name */
    public int f375226i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f375227m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f375228n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f375229o;

    /* renamed from: p, reason: collision with root package name */
    public r45.ag4 f375230p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f375231q;

    /* renamed from: r, reason: collision with root package name */
    public int f375232r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gg4)) {
            return false;
        }
        r45.gg4 gg4Var = (r45.gg4) fVar;
        return n51.f.a(this.f375221d, gg4Var.f375221d) && n51.f.a(this.f375222e, gg4Var.f375222e) && n51.f.a(this.f375223f, gg4Var.f375223f) && n51.f.a(this.f375224g, gg4Var.f375224g) && n51.f.a(this.f375225h, gg4Var.f375225h) && n51.f.a(java.lang.Integer.valueOf(this.f375226i), java.lang.Integer.valueOf(gg4Var.f375226i)) && n51.f.a(this.f375227m, gg4Var.f375227m) && n51.f.a(this.f375228n, gg4Var.f375228n) && n51.f.a(java.lang.Boolean.valueOf(this.f375229o), java.lang.Boolean.valueOf(gg4Var.f375229o)) && n51.f.a(this.f375230p, gg4Var.f375230p) && n51.f.a(this.f375231q, gg4Var.f375231q) && n51.f.a(java.lang.Integer.valueOf(this.f375232r), java.lang.Integer.valueOf(gg4Var.f375232r));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f375221d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f375222e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f375223f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f375224g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f375225h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f375226i);
            java.lang.String str6 = this.f375227m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f375228n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.a(9, this.f375229o);
            r45.ag4 ag4Var = this.f375230p;
            if (ag4Var != null) {
                fVar.i(10, ag4Var.computeSize());
                this.f375230p.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f375231q;
            if (gVar != null) {
                fVar.b(11, gVar);
            }
            fVar.e(22, this.f375232r);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f375221d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f375222e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f375223f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f375224g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f375225h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            int e17 = j17 + b36.f.e(6, this.f375226i);
            java.lang.String str13 = this.f375227m;
            if (str13 != null) {
                e17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f375228n;
            if (str14 != null) {
                e17 += b36.f.j(8, str14);
            }
            int a17 = e17 + b36.f.a(9, this.f375229o);
            r45.ag4 ag4Var2 = this.f375230p;
            if (ag4Var2 != null) {
                a17 += b36.f.i(10, ag4Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f375231q;
            if (gVar2 != null) {
                a17 += b36.f.b(11, gVar2);
            }
            return a17 + b36.f.e(22, this.f375232r);
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
        r45.gg4 gg4Var = (r45.gg4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 22) {
            gg4Var.f375232r = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                gg4Var.f375221d = aVar2.k(intValue);
                return 0;
            case 2:
                gg4Var.f375222e = aVar2.k(intValue);
                return 0;
            case 3:
                gg4Var.f375223f = aVar2.k(intValue);
                return 0;
            case 4:
                gg4Var.f375224g = aVar2.k(intValue);
                return 0;
            case 5:
                gg4Var.f375225h = aVar2.k(intValue);
                return 0;
            case 6:
                gg4Var.f375226i = aVar2.g(intValue);
                return 0;
            case 7:
                gg4Var.f375227m = aVar2.k(intValue);
                return 0;
            case 8:
                gg4Var.f375228n = aVar2.k(intValue);
                return 0;
            case 9:
                gg4Var.f375229o = aVar2.c(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.ag4 ag4Var3 = new r45.ag4();
                    if (bArr != null && bArr.length > 0) {
                        ag4Var3.parseFrom(bArr);
                    }
                    gg4Var.f375230p = ag4Var3;
                }
                return 0;
            case 11:
                gg4Var.f375231q = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
