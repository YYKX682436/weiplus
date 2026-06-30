package r45;

/* loaded from: classes11.dex */
public class gy6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375650d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375651e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375652f;

    /* renamed from: g, reason: collision with root package name */
    public int f375653g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f375654h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f375655i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f375656m;

    /* renamed from: n, reason: collision with root package name */
    public int f375657n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f375658o;

    /* renamed from: p, reason: collision with root package name */
    public int f375659p;

    /* renamed from: q, reason: collision with root package name */
    public r45.cu5 f375660q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f375661r;

    /* renamed from: s, reason: collision with root package name */
    public int f375662s;

    /* renamed from: t, reason: collision with root package name */
    public r45.cu5 f375663t;

    /* renamed from: u, reason: collision with root package name */
    public int f375664u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f375665v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f375666w;

    /* renamed from: x, reason: collision with root package name */
    public r45.c85 f375667x;

    /* renamed from: y, reason: collision with root package name */
    public r45.dz3 f375668y;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gy6)) {
            return false;
        }
        r45.gy6 gy6Var = (r45.gy6) fVar;
        return n51.f.a(this.f375650d, gy6Var.f375650d) && n51.f.a(this.f375651e, gy6Var.f375651e) && n51.f.a(this.f375652f, gy6Var.f375652f) && n51.f.a(java.lang.Integer.valueOf(this.f375653g), java.lang.Integer.valueOf(gy6Var.f375653g)) && n51.f.a(this.f375654h, gy6Var.f375654h) && n51.f.a(this.f375655i, gy6Var.f375655i) && n51.f.a(this.f375656m, gy6Var.f375656m) && n51.f.a(java.lang.Integer.valueOf(this.f375657n), java.lang.Integer.valueOf(gy6Var.f375657n)) && n51.f.a(this.f375658o, gy6Var.f375658o) && n51.f.a(java.lang.Integer.valueOf(this.f375659p), java.lang.Integer.valueOf(gy6Var.f375659p)) && n51.f.a(this.f375660q, gy6Var.f375660q) && n51.f.a(this.f375661r, gy6Var.f375661r) && n51.f.a(java.lang.Integer.valueOf(this.f375662s), java.lang.Integer.valueOf(gy6Var.f375662s)) && n51.f.a(this.f375663t, gy6Var.f375663t) && n51.f.a(java.lang.Integer.valueOf(this.f375664u), java.lang.Integer.valueOf(gy6Var.f375664u)) && n51.f.a(this.f375665v, gy6Var.f375665v) && n51.f.a(this.f375666w, gy6Var.f375666w) && n51.f.a(this.f375667x, gy6Var.f375667x) && n51.f.a(this.f375668y, gy6Var.f375668y);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f375650d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f375651e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f375652f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f375653g);
            java.lang.String str4 = this.f375654h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f375655i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f375656m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            fVar.e(8, this.f375657n);
            java.lang.String str7 = this.f375658o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            fVar.e(10, this.f375659p);
            r45.cu5 cu5Var = this.f375660q;
            if (cu5Var != null) {
                fVar.i(11, cu5Var.computeSize());
                this.f375660q.writeFields(fVar);
            }
            java.lang.String str8 = this.f375661r;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            fVar.e(13, this.f375662s);
            r45.cu5 cu5Var2 = this.f375663t;
            if (cu5Var2 != null) {
                fVar.i(14, cu5Var2.computeSize());
                this.f375663t.writeFields(fVar);
            }
            fVar.e(15, this.f375664u);
            java.lang.String str9 = this.f375665v;
            if (str9 != null) {
                fVar.j(16, str9);
            }
            java.lang.String str10 = this.f375666w;
            if (str10 != null) {
                fVar.j(17, str10);
            }
            r45.c85 c85Var = this.f375667x;
            if (c85Var != null) {
                fVar.i(18, c85Var.computeSize());
                this.f375667x.writeFields(fVar);
            }
            r45.dz3 dz3Var = this.f375668y;
            if (dz3Var != null) {
                fVar.i(19, dz3Var.computeSize());
                this.f375668y.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f375650d;
            int j17 = str11 != null ? b36.f.j(1, str11) + 0 : 0;
            java.lang.String str12 = this.f375651e;
            if (str12 != null) {
                j17 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f375652f;
            if (str13 != null) {
                j17 += b36.f.j(3, str13);
            }
            int e17 = j17 + b36.f.e(4, this.f375653g);
            java.lang.String str14 = this.f375654h;
            if (str14 != null) {
                e17 += b36.f.j(5, str14);
            }
            java.lang.String str15 = this.f375655i;
            if (str15 != null) {
                e17 += b36.f.j(6, str15);
            }
            java.lang.String str16 = this.f375656m;
            if (str16 != null) {
                e17 += b36.f.j(7, str16);
            }
            int e18 = e17 + b36.f.e(8, this.f375657n);
            java.lang.String str17 = this.f375658o;
            if (str17 != null) {
                e18 += b36.f.j(9, str17);
            }
            int e19 = e18 + b36.f.e(10, this.f375659p);
            r45.cu5 cu5Var3 = this.f375660q;
            if (cu5Var3 != null) {
                e19 += b36.f.i(11, cu5Var3.computeSize());
            }
            java.lang.String str18 = this.f375661r;
            if (str18 != null) {
                e19 += b36.f.j(12, str18);
            }
            int e27 = e19 + b36.f.e(13, this.f375662s);
            r45.cu5 cu5Var4 = this.f375663t;
            if (cu5Var4 != null) {
                e27 += b36.f.i(14, cu5Var4.computeSize());
            }
            int e28 = e27 + b36.f.e(15, this.f375664u);
            java.lang.String str19 = this.f375665v;
            if (str19 != null) {
                e28 += b36.f.j(16, str19);
            }
            java.lang.String str20 = this.f375666w;
            if (str20 != null) {
                e28 += b36.f.j(17, str20);
            }
            r45.c85 c85Var2 = this.f375667x;
            if (c85Var2 != null) {
                e28 += b36.f.i(18, c85Var2.computeSize());
            }
            r45.dz3 dz3Var2 = this.f375668y;
            return dz3Var2 != null ? e28 + b36.f.i(19, dz3Var2.computeSize()) : e28;
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
        r45.gy6 gy6Var = (r45.gy6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                gy6Var.f375650d = aVar2.k(intValue);
                return 0;
            case 2:
                gy6Var.f375651e = aVar2.k(intValue);
                return 0;
            case 3:
                gy6Var.f375652f = aVar2.k(intValue);
                return 0;
            case 4:
                gy6Var.f375653g = aVar2.g(intValue);
                return 0;
            case 5:
                gy6Var.f375654h = aVar2.k(intValue);
                return 0;
            case 6:
                gy6Var.f375655i = aVar2.k(intValue);
                return 0;
            case 7:
                gy6Var.f375656m = aVar2.k(intValue);
                return 0;
            case 8:
                gy6Var.f375657n = aVar2.g(intValue);
                return 0;
            case 9:
                gy6Var.f375658o = aVar2.k(intValue);
                return 0;
            case 10:
                gy6Var.f375659p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var5.b(bArr);
                    }
                    gy6Var.f375660q = cu5Var5;
                }
                return 0;
            case 12:
                gy6Var.f375661r = aVar2.k(intValue);
                return 0;
            case 13:
                gy6Var.f375662s = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var6.b(bArr2);
                    }
                    gy6Var.f375663t = cu5Var6;
                }
                return 0;
            case 15:
                gy6Var.f375664u = aVar2.g(intValue);
                return 0;
            case 16:
                gy6Var.f375665v = aVar2.k(intValue);
                return 0;
            case 17:
                gy6Var.f375666w = aVar2.k(intValue);
                return 0;
            case 18:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.c85 c85Var3 = new r45.c85();
                    if (bArr3 != null && bArr3.length > 0) {
                        c85Var3.parseFrom(bArr3);
                    }
                    gy6Var.f375667x = c85Var3;
                }
                return 0;
            case 19:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j28.get(i28);
                    r45.dz3 dz3Var3 = new r45.dz3();
                    if (bArr4 != null && bArr4.length > 0) {
                        dz3Var3.parseFrom(bArr4);
                    }
                    gy6Var.f375668y = dz3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
