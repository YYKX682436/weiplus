package r45;

/* loaded from: classes2.dex */
public class s21 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385426d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385427e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385428f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f385429g;

    /* renamed from: h, reason: collision with root package name */
    public int f385430h;

    /* renamed from: i, reason: collision with root package name */
    public int f385431i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f385432m;

    /* renamed from: n, reason: collision with root package name */
    public int f385433n;

    /* renamed from: o, reason: collision with root package name */
    public int f385434o;

    /* renamed from: p, reason: collision with root package name */
    public int f385435p;

    /* renamed from: q, reason: collision with root package name */
    public int f385436q;

    /* renamed from: r, reason: collision with root package name */
    public int f385437r;

    /* renamed from: s, reason: collision with root package name */
    public r45.so2 f385438s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f385439t = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public r45.ub1 f385440u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s21)) {
            return false;
        }
        r45.s21 s21Var = (r45.s21) fVar;
        return n51.f.a(this.f385426d, s21Var.f385426d) && n51.f.a(this.f385427e, s21Var.f385427e) && n51.f.a(this.f385428f, s21Var.f385428f) && n51.f.a(this.f385429g, s21Var.f385429g) && n51.f.a(java.lang.Integer.valueOf(this.f385430h), java.lang.Integer.valueOf(s21Var.f385430h)) && n51.f.a(java.lang.Integer.valueOf(this.f385431i), java.lang.Integer.valueOf(s21Var.f385431i)) && n51.f.a(this.f385432m, s21Var.f385432m) && n51.f.a(java.lang.Integer.valueOf(this.f385433n), java.lang.Integer.valueOf(s21Var.f385433n)) && n51.f.a(java.lang.Integer.valueOf(this.f385434o), java.lang.Integer.valueOf(s21Var.f385434o)) && n51.f.a(java.lang.Integer.valueOf(this.f385435p), java.lang.Integer.valueOf(s21Var.f385435p)) && n51.f.a(java.lang.Integer.valueOf(this.f385436q), java.lang.Integer.valueOf(s21Var.f385436q)) && n51.f.a(java.lang.Integer.valueOf(this.f385437r), java.lang.Integer.valueOf(s21Var.f385437r)) && n51.f.a(this.f385438s, s21Var.f385438s) && n51.f.a(this.f385439t, s21Var.f385439t) && n51.f.a(this.f385440u, s21Var.f385440u);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385439t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385426d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f385427e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f385428f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f385429g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f385430h);
            fVar.e(6, this.f385431i);
            java.lang.String str5 = this.f385432m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f385433n);
            fVar.e(9, this.f385434o);
            fVar.e(10, this.f385435p);
            fVar.e(11, this.f385436q);
            fVar.e(12, this.f385437r);
            r45.so2 so2Var = this.f385438s;
            if (so2Var != null) {
                fVar.i(13, so2Var.computeSize());
                this.f385438s.writeFields(fVar);
            }
            fVar.g(14, 8, linkedList);
            r45.ub1 ub1Var = this.f385440u;
            if (ub1Var != null) {
                fVar.i(15, ub1Var.computeSize());
                this.f385440u.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f385426d;
            int j17 = str6 != null ? b36.f.j(1, str6) + 0 : 0;
            java.lang.String str7 = this.f385427e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f385428f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f385429g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f385430h) + b36.f.e(6, this.f385431i);
            java.lang.String str10 = this.f385432m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            int e18 = e17 + b36.f.e(8, this.f385433n) + b36.f.e(9, this.f385434o) + b36.f.e(10, this.f385435p) + b36.f.e(11, this.f385436q) + b36.f.e(12, this.f385437r);
            r45.so2 so2Var2 = this.f385438s;
            if (so2Var2 != null) {
                e18 += b36.f.i(13, so2Var2.computeSize());
            }
            int g17 = e18 + b36.f.g(14, 8, linkedList);
            r45.ub1 ub1Var2 = this.f385440u;
            return ub1Var2 != null ? g17 + b36.f.i(15, ub1Var2.computeSize()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.s21 s21Var = (r45.s21) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                s21Var.f385426d = aVar2.k(intValue);
                return 0;
            case 2:
                s21Var.f385427e = aVar2.k(intValue);
                return 0;
            case 3:
                s21Var.f385428f = aVar2.k(intValue);
                return 0;
            case 4:
                s21Var.f385429g = aVar2.k(intValue);
                return 0;
            case 5:
                s21Var.f385430h = aVar2.g(intValue);
                return 0;
            case 6:
                s21Var.f385431i = aVar2.g(intValue);
                return 0;
            case 7:
                s21Var.f385432m = aVar2.k(intValue);
                return 0;
            case 8:
                s21Var.f385433n = aVar2.g(intValue);
                return 0;
            case 9:
                s21Var.f385434o = aVar2.g(intValue);
                return 0;
            case 10:
                s21Var.f385435p = aVar2.g(intValue);
                return 0;
            case 11:
                s21Var.f385436q = aVar2.g(intValue);
                return 0;
            case 12:
                s21Var.f385437r = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.so2 so2Var3 = new r45.so2();
                    if (bArr2 != null && bArr2.length > 0) {
                        so2Var3.parseFrom(bArr2);
                    }
                    s21Var.f385438s = so2Var3;
                }
                return 0;
            case 14:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.zb1 zb1Var = new r45.zb1();
                    if (bArr3 != null && bArr3.length > 0) {
                        zb1Var.parseFrom(bArr3);
                    }
                    s21Var.f385439t.add(zb1Var);
                }
                return 0;
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.ub1 ub1Var3 = new r45.ub1();
                    if (bArr4 != null && bArr4.length > 0) {
                        ub1Var3.parseFrom(bArr4);
                    }
                    s21Var.f385440u = ub1Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
