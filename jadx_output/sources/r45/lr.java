package r45;

/* loaded from: classes12.dex */
public class lr extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379765d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379766e;

    /* renamed from: f, reason: collision with root package name */
    public int f379767f;

    /* renamed from: g, reason: collision with root package name */
    public int f379768g;

    /* renamed from: h, reason: collision with root package name */
    public int f379769h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379770i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f379771m;

    /* renamed from: n, reason: collision with root package name */
    public int f379772n;

    /* renamed from: o, reason: collision with root package name */
    public int f379773o;

    /* renamed from: p, reason: collision with root package name */
    public int f379774p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f379775q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f379776r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f379777s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lr)) {
            return false;
        }
        r45.lr lrVar = (r45.lr) fVar;
        return n51.f.a(this.f379765d, lrVar.f379765d) && n51.f.a(this.f379766e, lrVar.f379766e) && n51.f.a(java.lang.Integer.valueOf(this.f379767f), java.lang.Integer.valueOf(lrVar.f379767f)) && n51.f.a(java.lang.Integer.valueOf(this.f379768g), java.lang.Integer.valueOf(lrVar.f379768g)) && n51.f.a(java.lang.Integer.valueOf(this.f379769h), java.lang.Integer.valueOf(lrVar.f379769h)) && n51.f.a(this.f379770i, lrVar.f379770i) && n51.f.a(this.f379771m, lrVar.f379771m) && n51.f.a(java.lang.Integer.valueOf(this.f379772n), java.lang.Integer.valueOf(lrVar.f379772n)) && n51.f.a(java.lang.Integer.valueOf(this.f379773o), java.lang.Integer.valueOf(lrVar.f379773o)) && n51.f.a(java.lang.Integer.valueOf(this.f379774p), java.lang.Integer.valueOf(lrVar.f379774p)) && n51.f.a(this.f379775q, lrVar.f379775q) && n51.f.a(this.f379776r, lrVar.f379776r) && n51.f.a(this.f379777s, lrVar.f379777s);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379765d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f379766e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f379767f);
            fVar.e(4, this.f379768g);
            fVar.e(5, this.f379769h);
            java.lang.String str3 = this.f379770i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f379771m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f379772n);
            fVar.e(9, this.f379773o);
            fVar.e(10, this.f379774p);
            java.lang.String str5 = this.f379775q;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f379776r;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            java.lang.String str7 = this.f379777s;
            if (str7 == null) {
                return 0;
            }
            fVar.j(13, str7);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f379765d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f379766e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            int e17 = j17 + b36.f.e(3, this.f379767f) + b36.f.e(4, this.f379768g) + b36.f.e(5, this.f379769h);
            java.lang.String str10 = this.f379770i;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f379771m;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            int e18 = e17 + b36.f.e(8, this.f379772n) + b36.f.e(9, this.f379773o) + b36.f.e(10, this.f379774p);
            java.lang.String str12 = this.f379775q;
            if (str12 != null) {
                e18 += b36.f.j(11, str12);
            }
            java.lang.String str13 = this.f379776r;
            if (str13 != null) {
                e18 += b36.f.j(12, str13);
            }
            java.lang.String str14 = this.f379777s;
            return str14 != null ? e18 + b36.f.j(13, str14) : e18;
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
        r45.lr lrVar = (r45.lr) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lrVar.f379765d = aVar2.k(intValue);
                return 0;
            case 2:
                lrVar.f379766e = aVar2.k(intValue);
                return 0;
            case 3:
                lrVar.f379767f = aVar2.g(intValue);
                return 0;
            case 4:
                lrVar.f379768g = aVar2.g(intValue);
                return 0;
            case 5:
                lrVar.f379769h = aVar2.g(intValue);
                return 0;
            case 6:
                lrVar.f379770i = aVar2.k(intValue);
                return 0;
            case 7:
                lrVar.f379771m = aVar2.k(intValue);
                return 0;
            case 8:
                lrVar.f379772n = aVar2.g(intValue);
                return 0;
            case 9:
                lrVar.f379773o = aVar2.g(intValue);
                return 0;
            case 10:
                lrVar.f379774p = aVar2.g(intValue);
                return 0;
            case 11:
                lrVar.f379775q = aVar2.k(intValue);
                return 0;
            case 12:
                lrVar.f379776r = aVar2.k(intValue);
                return 0;
            case 13:
                lrVar.f379777s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
