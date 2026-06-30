package r45;

/* loaded from: classes9.dex */
public class th6 extends com.tencent.mm.protobuf.f {
    public int A;
    public int B;
    public int C;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386442d;

    /* renamed from: e, reason: collision with root package name */
    public int f386443e;

    /* renamed from: f, reason: collision with root package name */
    public int f386444f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386445g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f386446h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f386447i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f386448m;

    /* renamed from: n, reason: collision with root package name */
    public int f386449n;

    /* renamed from: o, reason: collision with root package name */
    public int f386450o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f386451p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f386452q;

    /* renamed from: r, reason: collision with root package name */
    public int f386453r;

    /* renamed from: s, reason: collision with root package name */
    public int f386454s;

    /* renamed from: t, reason: collision with root package name */
    public int f386455t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f386456u;

    /* renamed from: v, reason: collision with root package name */
    public int f386457v;

    /* renamed from: w, reason: collision with root package name */
    public int f386458w;

    /* renamed from: x, reason: collision with root package name */
    public int f386459x;

    /* renamed from: y, reason: collision with root package name */
    public int f386460y;

    /* renamed from: z, reason: collision with root package name */
    public int f386461z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.th6)) {
            return false;
        }
        r45.th6 th6Var = (r45.th6) fVar;
        return n51.f.a(this.f386442d, th6Var.f386442d) && n51.f.a(java.lang.Integer.valueOf(this.f386443e), java.lang.Integer.valueOf(th6Var.f386443e)) && n51.f.a(java.lang.Integer.valueOf(this.f386444f), java.lang.Integer.valueOf(th6Var.f386444f)) && n51.f.a(this.f386445g, th6Var.f386445g) && n51.f.a(this.f386446h, th6Var.f386446h) && n51.f.a(java.lang.Integer.valueOf(this.f386447i), java.lang.Integer.valueOf(th6Var.f386447i)) && n51.f.a(this.f386448m, th6Var.f386448m) && n51.f.a(java.lang.Integer.valueOf(this.f386449n), java.lang.Integer.valueOf(th6Var.f386449n)) && n51.f.a(java.lang.Integer.valueOf(this.f386450o), java.lang.Integer.valueOf(th6Var.f386450o)) && n51.f.a(this.f386451p, th6Var.f386451p) && n51.f.a(this.f386452q, th6Var.f386452q) && n51.f.a(java.lang.Integer.valueOf(this.f386453r), java.lang.Integer.valueOf(th6Var.f386453r)) && n51.f.a(java.lang.Integer.valueOf(this.f386454s), java.lang.Integer.valueOf(th6Var.f386454s)) && n51.f.a(java.lang.Integer.valueOf(this.f386455t), java.lang.Integer.valueOf(th6Var.f386455t)) && n51.f.a(this.f386456u, th6Var.f386456u) && n51.f.a(java.lang.Integer.valueOf(this.f386457v), java.lang.Integer.valueOf(th6Var.f386457v)) && n51.f.a(java.lang.Integer.valueOf(this.f386458w), java.lang.Integer.valueOf(th6Var.f386458w)) && n51.f.a(java.lang.Integer.valueOf(this.f386459x), java.lang.Integer.valueOf(th6Var.f386459x)) && n51.f.a(java.lang.Integer.valueOf(this.f386460y), java.lang.Integer.valueOf(th6Var.f386460y)) && n51.f.a(java.lang.Integer.valueOf(this.f386461z), java.lang.Integer.valueOf(th6Var.f386461z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(th6Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(th6Var.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(th6Var.C));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f386446h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f386442d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f386443e);
            fVar.e(5, this.f386444f);
            java.lang.String str2 = this.f386445g;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.g(7, 8, linkedList);
            fVar.e(8, this.f386447i);
            java.lang.String str3 = this.f386448m;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.e(10, this.f386449n);
            fVar.e(11, this.f386450o);
            java.lang.String str4 = this.f386451p;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f386452q;
            if (str5 != null) {
                fVar.j(13, str5);
            }
            fVar.e(14, this.f386453r);
            fVar.e(16, this.f386454s);
            fVar.e(17, this.f386455t);
            java.lang.String str6 = this.f386456u;
            if (str6 != null) {
                fVar.j(18, str6);
            }
            fVar.e(19, this.f386457v);
            fVar.e(20, this.f386458w);
            fVar.e(21, this.f386459x);
            fVar.e(23, this.f386460y);
            fVar.e(24, this.f386461z);
            fVar.e(25, this.A);
            fVar.e(26, this.B);
            fVar.e(27, this.C);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f386442d;
            int j17 = (str7 != null ? b36.f.j(1, str7) + 0 : 0) + b36.f.e(2, this.f386443e) + b36.f.e(5, this.f386444f);
            java.lang.String str8 = this.f386445g;
            if (str8 != null) {
                j17 += b36.f.j(6, str8);
            }
            int g17 = j17 + b36.f.g(7, 8, linkedList) + b36.f.e(8, this.f386447i);
            java.lang.String str9 = this.f386448m;
            if (str9 != null) {
                g17 += b36.f.j(9, str9);
            }
            int e17 = g17 + b36.f.e(10, this.f386449n) + b36.f.e(11, this.f386450o);
            java.lang.String str10 = this.f386451p;
            if (str10 != null) {
                e17 += b36.f.j(12, str10);
            }
            java.lang.String str11 = this.f386452q;
            if (str11 != null) {
                e17 += b36.f.j(13, str11);
            }
            int e18 = e17 + b36.f.e(14, this.f386453r) + b36.f.e(16, this.f386454s) + b36.f.e(17, this.f386455t);
            java.lang.String str12 = this.f386456u;
            if (str12 != null) {
                e18 += b36.f.j(18, str12);
            }
            return e18 + b36.f.e(19, this.f386457v) + b36.f.e(20, this.f386458w) + b36.f.e(21, this.f386459x) + b36.f.e(23, this.f386460y) + b36.f.e(24, this.f386461z) + b36.f.e(25, this.A) + b36.f.e(26, this.B) + b36.f.e(27, this.C);
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
        r45.th6 th6Var = (r45.th6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                th6Var.f386442d = aVar2.k(intValue);
                return 0;
            case 2:
                th6Var.f386443e = aVar2.g(intValue);
                return 0;
            case 3:
            case 4:
            case 15:
            case 22:
            default:
                return -1;
            case 5:
                th6Var.f386444f = aVar2.g(intValue);
                return 0;
            case 6:
                th6Var.f386445g = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.s44 s44Var = new r45.s44();
                    if (bArr2 != null && bArr2.length > 0) {
                        s44Var.parseFrom(bArr2);
                    }
                    th6Var.f386446h.add(s44Var);
                }
                return 0;
            case 8:
                th6Var.f386447i = aVar2.g(intValue);
                return 0;
            case 9:
                th6Var.f386448m = aVar2.k(intValue);
                return 0;
            case 10:
                th6Var.f386449n = aVar2.g(intValue);
                return 0;
            case 11:
                th6Var.f386450o = aVar2.g(intValue);
                return 0;
            case 12:
                th6Var.f386451p = aVar2.k(intValue);
                return 0;
            case 13:
                th6Var.f386452q = aVar2.k(intValue);
                return 0;
            case 14:
                th6Var.f386453r = aVar2.g(intValue);
                return 0;
            case 16:
                th6Var.f386454s = aVar2.g(intValue);
                return 0;
            case 17:
                th6Var.f386455t = aVar2.g(intValue);
                return 0;
            case 18:
                th6Var.f386456u = aVar2.k(intValue);
                return 0;
            case 19:
                th6Var.f386457v = aVar2.g(intValue);
                return 0;
            case 20:
                th6Var.f386458w = aVar2.g(intValue);
                return 0;
            case 21:
                th6Var.f386459x = aVar2.g(intValue);
                return 0;
            case 23:
                th6Var.f386460y = aVar2.g(intValue);
                return 0;
            case 24:
                th6Var.f386461z = aVar2.g(intValue);
                return 0;
            case 25:
                th6Var.A = aVar2.g(intValue);
                return 0;
            case 26:
                th6Var.B = aVar2.g(intValue);
                return 0;
            case 27:
                th6Var.C = aVar2.g(intValue);
                return 0;
        }
    }
}
