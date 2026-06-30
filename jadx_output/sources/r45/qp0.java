package r45;

/* loaded from: classes9.dex */
public class qp0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f384162d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f384163e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f384164f;

    /* renamed from: g, reason: collision with root package name */
    public int f384165g;

    /* renamed from: h, reason: collision with root package name */
    public int f384166h;

    /* renamed from: i, reason: collision with root package name */
    public int f384167i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f384168m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f384169n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f384170o;

    /* renamed from: p, reason: collision with root package name */
    public int f384171p;

    /* renamed from: q, reason: collision with root package name */
    public r45.rp0 f384172q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f384173r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f384174s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f384175t;

    /* renamed from: u, reason: collision with root package name */
    public int f384176u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qp0)) {
            return false;
        }
        r45.qp0 qp0Var = (r45.qp0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f384162d), java.lang.Integer.valueOf(qp0Var.f384162d)) && n51.f.a(java.lang.Integer.valueOf(this.f384163e), java.lang.Integer.valueOf(qp0Var.f384163e)) && n51.f.a(java.lang.Integer.valueOf(this.f384164f), java.lang.Integer.valueOf(qp0Var.f384164f)) && n51.f.a(java.lang.Integer.valueOf(this.f384165g), java.lang.Integer.valueOf(qp0Var.f384165g)) && n51.f.a(java.lang.Integer.valueOf(this.f384166h), java.lang.Integer.valueOf(qp0Var.f384166h)) && n51.f.a(java.lang.Integer.valueOf(this.f384167i), java.lang.Integer.valueOf(qp0Var.f384167i)) && n51.f.a(this.f384168m, qp0Var.f384168m) && n51.f.a(this.f384169n, qp0Var.f384169n) && n51.f.a(this.f384170o, qp0Var.f384170o) && n51.f.a(java.lang.Integer.valueOf(this.f384171p), java.lang.Integer.valueOf(qp0Var.f384171p)) && n51.f.a(this.f384172q, qp0Var.f384172q) && n51.f.a(this.f384173r, qp0Var.f384173r) && n51.f.a(this.f384174s, qp0Var.f384174s) && n51.f.a(this.f384175t, qp0Var.f384175t) && n51.f.a(java.lang.Integer.valueOf(this.f384176u), java.lang.Integer.valueOf(qp0Var.f384176u));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f384162d);
            fVar.e(2, this.f384163e);
            fVar.e(3, this.f384164f);
            fVar.e(4, this.f384165g);
            fVar.e(5, this.f384166h);
            fVar.e(6, this.f384167i);
            java.lang.String str = this.f384168m;
            if (str != null) {
                fVar.j(7, str);
            }
            java.lang.String str2 = this.f384169n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            java.lang.String str3 = this.f384170o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.e(10, this.f384171p);
            r45.rp0 rp0Var = this.f384172q;
            if (rp0Var != null) {
                fVar.i(11, rp0Var.computeSize());
                this.f384172q.writeFields(fVar);
            }
            java.lang.String str4 = this.f384173r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f384174s;
            if (str5 != null) {
                fVar.j(13, str5);
            }
            java.lang.String str6 = this.f384175t;
            if (str6 != null) {
                fVar.j(14, str6);
            }
            fVar.e(15, this.f384176u);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f384162d) + 0 + b36.f.e(2, this.f384163e) + b36.f.e(3, this.f384164f) + b36.f.e(4, this.f384165g) + b36.f.e(5, this.f384166h) + b36.f.e(6, this.f384167i);
            java.lang.String str7 = this.f384168m;
            if (str7 != null) {
                e17 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f384169n;
            if (str8 != null) {
                e17 += b36.f.j(8, str8);
            }
            java.lang.String str9 = this.f384170o;
            if (str9 != null) {
                e17 += b36.f.j(9, str9);
            }
            int e18 = e17 + b36.f.e(10, this.f384171p);
            r45.rp0 rp0Var2 = this.f384172q;
            if (rp0Var2 != null) {
                e18 += b36.f.i(11, rp0Var2.computeSize());
            }
            java.lang.String str10 = this.f384173r;
            if (str10 != null) {
                e18 += b36.f.j(12, str10);
            }
            java.lang.String str11 = this.f384174s;
            if (str11 != null) {
                e18 += b36.f.j(13, str11);
            }
            java.lang.String str12 = this.f384175t;
            if (str12 != null) {
                e18 += b36.f.j(14, str12);
            }
            return e18 + b36.f.e(15, this.f384176u);
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
        r45.qp0 qp0Var = (r45.qp0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qp0Var.f384162d = aVar2.g(intValue);
                return 0;
            case 2:
                qp0Var.f384163e = aVar2.g(intValue);
                return 0;
            case 3:
                qp0Var.f384164f = aVar2.g(intValue);
                return 0;
            case 4:
                qp0Var.f384165g = aVar2.g(intValue);
                return 0;
            case 5:
                qp0Var.f384166h = aVar2.g(intValue);
                return 0;
            case 6:
                qp0Var.f384167i = aVar2.g(intValue);
                return 0;
            case 7:
                qp0Var.f384168m = aVar2.k(intValue);
                return 0;
            case 8:
                qp0Var.f384169n = aVar2.k(intValue);
                return 0;
            case 9:
                qp0Var.f384170o = aVar2.k(intValue);
                return 0;
            case 10:
                qp0Var.f384171p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.rp0 rp0Var3 = new r45.rp0();
                    if (bArr != null && bArr.length > 0) {
                        rp0Var3.parseFrom(bArr);
                    }
                    qp0Var.f384172q = rp0Var3;
                }
                return 0;
            case 12:
                qp0Var.f384173r = aVar2.k(intValue);
                return 0;
            case 13:
                qp0Var.f384174s = aVar2.k(intValue);
                return 0;
            case 14:
                qp0Var.f384175t = aVar2.k(intValue);
                return 0;
            case 15:
                qp0Var.f384176u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
