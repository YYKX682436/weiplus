package r45;

/* loaded from: classes2.dex */
public class k14 extends r45.mr5 {
    public int A;
    public int B;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378292d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378293e;

    /* renamed from: f, reason: collision with root package name */
    public int f378294f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378295g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378296h;

    /* renamed from: i, reason: collision with root package name */
    public int f378297i;

    /* renamed from: m, reason: collision with root package name */
    public int f378298m;

    /* renamed from: n, reason: collision with root package name */
    public int f378299n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f378300o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f378301p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f378302q;

    /* renamed from: r, reason: collision with root package name */
    public int f378303r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f378304s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f378305t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f378306u;

    /* renamed from: v, reason: collision with root package name */
    public int f378307v;

    /* renamed from: w, reason: collision with root package name */
    public int f378308w;

    /* renamed from: x, reason: collision with root package name */
    public int f378309x;

    /* renamed from: y, reason: collision with root package name */
    public int f378310y;

    /* renamed from: z, reason: collision with root package name */
    public long f378311z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k14)) {
            return false;
        }
        r45.k14 k14Var = (r45.k14) fVar;
        return n51.f.a(this.BaseRequest, k14Var.BaseRequest) && n51.f.a(this.f378292d, k14Var.f378292d) && n51.f.a(this.f378293e, k14Var.f378293e) && n51.f.a(java.lang.Integer.valueOf(this.f378294f), java.lang.Integer.valueOf(k14Var.f378294f)) && n51.f.a(this.f378295g, k14Var.f378295g) && n51.f.a(this.f378296h, k14Var.f378296h) && n51.f.a(java.lang.Integer.valueOf(this.f378297i), java.lang.Integer.valueOf(k14Var.f378297i)) && n51.f.a(java.lang.Integer.valueOf(this.f378298m), java.lang.Integer.valueOf(k14Var.f378298m)) && n51.f.a(java.lang.Integer.valueOf(this.f378299n), java.lang.Integer.valueOf(k14Var.f378299n)) && n51.f.a(this.f378300o, k14Var.f378300o) && n51.f.a(this.f378301p, k14Var.f378301p) && n51.f.a(this.f378302q, k14Var.f378302q) && n51.f.a(java.lang.Integer.valueOf(this.f378303r), java.lang.Integer.valueOf(k14Var.f378303r)) && n51.f.a(this.f378304s, k14Var.f378304s) && n51.f.a(this.f378305t, k14Var.f378305t) && n51.f.a(this.f378306u, k14Var.f378306u) && n51.f.a(java.lang.Integer.valueOf(this.f378307v), java.lang.Integer.valueOf(k14Var.f378307v)) && n51.f.a(java.lang.Integer.valueOf(this.f378308w), java.lang.Integer.valueOf(k14Var.f378308w)) && n51.f.a(java.lang.Integer.valueOf(this.f378309x), java.lang.Integer.valueOf(k14Var.f378309x)) && n51.f.a(java.lang.Integer.valueOf(this.f378310y), java.lang.Integer.valueOf(k14Var.f378310y)) && n51.f.a(java.lang.Long.valueOf(this.f378311z), java.lang.Long.valueOf(k14Var.f378311z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(k14Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(k14Var.B));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f378292d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f378293e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f378294f);
            java.lang.String str3 = this.f378295g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f378296h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f378297i);
            fVar.e(8, this.f378298m);
            fVar.e(9, this.f378299n);
            java.lang.String str5 = this.f378300o;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f378301p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            java.lang.String str7 = this.f378302q;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            fVar.e(13, this.f378303r);
            java.lang.String str8 = this.f378304s;
            if (str8 != null) {
                fVar.j(14, str8);
            }
            java.lang.String str9 = this.f378305t;
            if (str9 != null) {
                fVar.j(15, str9);
            }
            java.lang.String str10 = this.f378306u;
            if (str10 != null) {
                fVar.j(16, str10);
            }
            fVar.e(17, this.f378307v);
            fVar.e(18, this.f378308w);
            fVar.e(19, this.f378309x);
            fVar.e(20, this.f378310y);
            fVar.h(21, this.f378311z);
            fVar.e(22, this.A);
            fVar.e(23, this.B);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str11 = this.f378292d;
            if (str11 != null) {
                i18 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f378293e;
            if (str12 != null) {
                i18 += b36.f.j(3, str12);
            }
            int e17 = i18 + b36.f.e(4, this.f378294f);
            java.lang.String str13 = this.f378295g;
            if (str13 != null) {
                e17 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f378296h;
            if (str14 != null) {
                e17 += b36.f.j(6, str14);
            }
            int e18 = e17 + b36.f.e(7, this.f378297i) + b36.f.e(8, this.f378298m) + b36.f.e(9, this.f378299n);
            java.lang.String str15 = this.f378300o;
            if (str15 != null) {
                e18 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f378301p;
            if (str16 != null) {
                e18 += b36.f.j(11, str16);
            }
            java.lang.String str17 = this.f378302q;
            if (str17 != null) {
                e18 += b36.f.j(12, str17);
            }
            int e19 = e18 + b36.f.e(13, this.f378303r);
            java.lang.String str18 = this.f378304s;
            if (str18 != null) {
                e19 += b36.f.j(14, str18);
            }
            java.lang.String str19 = this.f378305t;
            if (str19 != null) {
                e19 += b36.f.j(15, str19);
            }
            java.lang.String str20 = this.f378306u;
            if (str20 != null) {
                e19 += b36.f.j(16, str20);
            }
            return e19 + b36.f.e(17, this.f378307v) + b36.f.e(18, this.f378308w) + b36.f.e(19, this.f378309x) + b36.f.e(20, this.f378310y) + b36.f.h(21, this.f378311z) + b36.f.e(22, this.A) + b36.f.e(23, this.B);
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
        r45.k14 k14Var = (r45.k14) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    k14Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                k14Var.f378292d = aVar2.k(intValue);
                return 0;
            case 3:
                k14Var.f378293e = aVar2.k(intValue);
                return 0;
            case 4:
                k14Var.f378294f = aVar2.g(intValue);
                return 0;
            case 5:
                k14Var.f378295g = aVar2.k(intValue);
                return 0;
            case 6:
                k14Var.f378296h = aVar2.k(intValue);
                return 0;
            case 7:
                k14Var.f378297i = aVar2.g(intValue);
                return 0;
            case 8:
                k14Var.f378298m = aVar2.g(intValue);
                return 0;
            case 9:
                k14Var.f378299n = aVar2.g(intValue);
                return 0;
            case 10:
                k14Var.f378300o = aVar2.k(intValue);
                return 0;
            case 11:
                k14Var.f378301p = aVar2.k(intValue);
                return 0;
            case 12:
                k14Var.f378302q = aVar2.k(intValue);
                return 0;
            case 13:
                k14Var.f378303r = aVar2.g(intValue);
                return 0;
            case 14:
                k14Var.f378304s = aVar2.k(intValue);
                return 0;
            case 15:
                k14Var.f378305t = aVar2.k(intValue);
                return 0;
            case 16:
                k14Var.f378306u = aVar2.k(intValue);
                return 0;
            case 17:
                k14Var.f378307v = aVar2.g(intValue);
                return 0;
            case 18:
                k14Var.f378308w = aVar2.g(intValue);
                return 0;
            case 19:
                k14Var.f378309x = aVar2.g(intValue);
                return 0;
            case 20:
                k14Var.f378310y = aVar2.g(intValue);
                return 0;
            case 21:
                k14Var.f378311z = aVar2.i(intValue);
                return 0;
            case 22:
                k14Var.A = aVar2.g(intValue);
                return 0;
            case 23:
                k14Var.B = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
