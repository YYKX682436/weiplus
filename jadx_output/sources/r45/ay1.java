package r45;

/* loaded from: classes10.dex */
public class ay1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370350d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370351e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370352f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f370353g;

    /* renamed from: h, reason: collision with root package name */
    public int f370354h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f370355i;

    /* renamed from: m, reason: collision with root package name */
    public int f370356m;

    /* renamed from: n, reason: collision with root package name */
    public int f370357n;

    /* renamed from: o, reason: collision with root package name */
    public int f370358o;

    /* renamed from: p, reason: collision with root package name */
    public r45.gy1 f370359p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f370360q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f370361r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ay1)) {
            return false;
        }
        r45.ay1 ay1Var = (r45.ay1) fVar;
        return n51.f.a(this.f370350d, ay1Var.f370350d) && n51.f.a(this.f370351e, ay1Var.f370351e) && n51.f.a(this.f370352f, ay1Var.f370352f) && n51.f.a(this.f370353g, ay1Var.f370353g) && n51.f.a(java.lang.Integer.valueOf(this.f370354h), java.lang.Integer.valueOf(ay1Var.f370354h)) && n51.f.a(this.f370355i, ay1Var.f370355i) && n51.f.a(java.lang.Integer.valueOf(this.f370356m), java.lang.Integer.valueOf(ay1Var.f370356m)) && n51.f.a(java.lang.Integer.valueOf(this.f370357n), java.lang.Integer.valueOf(ay1Var.f370357n)) && n51.f.a(java.lang.Integer.valueOf(this.f370358o), java.lang.Integer.valueOf(ay1Var.f370358o)) && n51.f.a(this.f370359p, ay1Var.f370359p) && n51.f.a(java.lang.Boolean.valueOf(this.f370360q), java.lang.Boolean.valueOf(ay1Var.f370360q)) && n51.f.a(this.f370361r, ay1Var.f370361r);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370350d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f370351e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f370352f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f370353g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f370354h);
            java.lang.String str5 = this.f370355i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f370356m);
            fVar.e(8, this.f370357n);
            fVar.e(9, this.f370358o);
            r45.gy1 gy1Var = this.f370359p;
            if (gy1Var != null) {
                fVar.i(10, gy1Var.computeSize());
                this.f370359p.writeFields(fVar);
            }
            fVar.a(11, this.f370360q);
            java.lang.String str6 = this.f370361r;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f370350d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f370351e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f370352f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f370353g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            int e17 = j17 + b36.f.e(5, this.f370354h);
            java.lang.String str11 = this.f370355i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            int e18 = e17 + b36.f.e(7, this.f370356m) + b36.f.e(8, this.f370357n) + b36.f.e(9, this.f370358o);
            r45.gy1 gy1Var2 = this.f370359p;
            if (gy1Var2 != null) {
                e18 += b36.f.i(10, gy1Var2.computeSize());
            }
            int a17 = e18 + b36.f.a(11, this.f370360q);
            java.lang.String str12 = this.f370361r;
            return str12 != null ? a17 + b36.f.j(12, str12) : a17;
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
        r45.ay1 ay1Var = (r45.ay1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ay1Var.f370350d = aVar2.k(intValue);
                return 0;
            case 2:
                ay1Var.f370351e = aVar2.k(intValue);
                return 0;
            case 3:
                ay1Var.f370352f = aVar2.k(intValue);
                return 0;
            case 4:
                ay1Var.f370353g = aVar2.k(intValue);
                return 0;
            case 5:
                ay1Var.f370354h = aVar2.g(intValue);
                return 0;
            case 6:
                ay1Var.f370355i = aVar2.k(intValue);
                return 0;
            case 7:
                ay1Var.f370356m = aVar2.g(intValue);
                return 0;
            case 8:
                ay1Var.f370357n = aVar2.g(intValue);
                return 0;
            case 9:
                ay1Var.f370358o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.gy1 gy1Var3 = new r45.gy1();
                    if (bArr != null && bArr.length > 0) {
                        gy1Var3.parseFrom(bArr);
                    }
                    ay1Var.f370359p = gy1Var3;
                }
                return 0;
            case 11:
                ay1Var.f370360q = aVar2.c(intValue);
                return 0;
            case 12:
                ay1Var.f370361r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
