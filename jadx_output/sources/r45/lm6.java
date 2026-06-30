package r45;

/* loaded from: classes9.dex */
public class lm6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379637d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379638e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379639f;

    /* renamed from: g, reason: collision with root package name */
    public int f379640g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379641h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379642i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f379643m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f379644n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f379645o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f379646p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lm6)) {
            return false;
        }
        r45.lm6 lm6Var = (r45.lm6) fVar;
        return n51.f.a(this.f379637d, lm6Var.f379637d) && n51.f.a(this.f379638e, lm6Var.f379638e) && n51.f.a(this.f379639f, lm6Var.f379639f) && n51.f.a(java.lang.Integer.valueOf(this.f379640g), java.lang.Integer.valueOf(lm6Var.f379640g)) && n51.f.a(this.f379641h, lm6Var.f379641h) && n51.f.a(this.f379642i, lm6Var.f379642i) && n51.f.a(this.f379643m, lm6Var.f379643m) && n51.f.a(this.f379644n, lm6Var.f379644n) && n51.f.a(this.f379645o, lm6Var.f379645o) && n51.f.a(java.lang.Boolean.valueOf(this.f379646p), java.lang.Boolean.valueOf(lm6Var.f379646p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f379644n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379637d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f379638e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f379639f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f379640g);
            java.lang.String str4 = this.f379641h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f379642i;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f379643m;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            fVar.g(10, 1, linkedList);
            java.lang.String str7 = this.f379645o;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            fVar.a(12, this.f379646p);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f379637d;
            int j17 = str8 != null ? 0 + b36.f.j(2, str8) : 0;
            java.lang.String str9 = this.f379638e;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f379639f;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            int e17 = j17 + b36.f.e(5, this.f379640g);
            java.lang.String str11 = this.f379641h;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f379642i;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f379643m;
            if (str13 != null) {
                e17 += b36.f.j(9, str13);
            }
            int g17 = e17 + b36.f.g(10, 1, linkedList);
            java.lang.String str14 = this.f379645o;
            if (str14 != null) {
                g17 += b36.f.j(11, str14);
            }
            return g17 + b36.f.a(12, this.f379646p);
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
        r45.lm6 lm6Var = (r45.lm6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 2:
                lm6Var.f379637d = aVar2.k(intValue);
                return 0;
            case 3:
                lm6Var.f379638e = aVar2.k(intValue);
                return 0;
            case 4:
                lm6Var.f379639f = aVar2.k(intValue);
                return 0;
            case 5:
                lm6Var.f379640g = aVar2.g(intValue);
                return 0;
            case 6:
                lm6Var.f379641h = aVar2.k(intValue);
                return 0;
            case 7:
            default:
                return -1;
            case 8:
                lm6Var.f379642i = aVar2.k(intValue);
                return 0;
            case 9:
                lm6Var.f379643m = aVar2.k(intValue);
                return 0;
            case 10:
                lm6Var.f379644n.add(aVar2.k(intValue));
                return 0;
            case 11:
                lm6Var.f379645o = aVar2.k(intValue);
                return 0;
            case 12:
                lm6Var.f379646p = aVar2.c(intValue);
                return 0;
        }
    }
}
