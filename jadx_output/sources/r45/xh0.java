package r45;

/* loaded from: classes15.dex */
public class xh0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390092d;

    /* renamed from: e, reason: collision with root package name */
    public int f390093e;

    /* renamed from: f, reason: collision with root package name */
    public int f390094f;

    /* renamed from: g, reason: collision with root package name */
    public int f390095g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f390096h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f390097i;

    /* renamed from: m, reason: collision with root package name */
    public int f390098m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f390099n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f390100o;

    /* renamed from: p, reason: collision with root package name */
    public int f390101p;

    /* renamed from: q, reason: collision with root package name */
    public int f390102q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f390103r;

    /* renamed from: s, reason: collision with root package name */
    public int f390104s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f390105t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xh0)) {
            return false;
        }
        r45.xh0 xh0Var = (r45.xh0) fVar;
        return n51.f.a(this.f390092d, xh0Var.f390092d) && n51.f.a(java.lang.Integer.valueOf(this.f390093e), java.lang.Integer.valueOf(xh0Var.f390093e)) && n51.f.a(java.lang.Integer.valueOf(this.f390094f), java.lang.Integer.valueOf(xh0Var.f390094f)) && n51.f.a(java.lang.Integer.valueOf(this.f390095g), java.lang.Integer.valueOf(xh0Var.f390095g)) && n51.f.a(this.f390096h, xh0Var.f390096h) && n51.f.a(java.lang.Integer.valueOf(this.f390097i), java.lang.Integer.valueOf(xh0Var.f390097i)) && n51.f.a(java.lang.Integer.valueOf(this.f390098m), java.lang.Integer.valueOf(xh0Var.f390098m)) && n51.f.a(this.f390099n, xh0Var.f390099n) && n51.f.a(this.f390100o, xh0Var.f390100o) && n51.f.a(java.lang.Integer.valueOf(this.f390101p), java.lang.Integer.valueOf(xh0Var.f390101p)) && n51.f.a(java.lang.Integer.valueOf(this.f390102q), java.lang.Integer.valueOf(xh0Var.f390102q)) && n51.f.a(this.f390103r, xh0Var.f390103r) && n51.f.a(java.lang.Integer.valueOf(this.f390104s), java.lang.Integer.valueOf(xh0Var.f390104s)) && n51.f.a(this.f390105t, xh0Var.f390105t);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390096h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f390092d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f390093e);
            fVar.e(3, this.f390094f);
            fVar.e(4, this.f390095g);
            fVar.g(5, 8, linkedList);
            fVar.e(6, this.f390097i);
            fVar.e(7, this.f390098m);
            java.lang.String str2 = this.f390099n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            java.lang.String str3 = this.f390100o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.e(10, this.f390101p);
            fVar.e(11, this.f390102q);
            java.lang.String str4 = this.f390103r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            fVar.e(13, this.f390104s);
            java.lang.String str5 = this.f390105t;
            if (str5 != null) {
                fVar.j(14, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f390092d;
            int j17 = (str6 != null ? b36.f.j(1, str6) + 0 : 0) + b36.f.e(2, this.f390093e) + b36.f.e(3, this.f390094f) + b36.f.e(4, this.f390095g) + b36.f.g(5, 8, linkedList) + b36.f.e(6, this.f390097i) + b36.f.e(7, this.f390098m);
            java.lang.String str7 = this.f390099n;
            if (str7 != null) {
                j17 += b36.f.j(8, str7);
            }
            java.lang.String str8 = this.f390100o;
            if (str8 != null) {
                j17 += b36.f.j(9, str8);
            }
            int e17 = j17 + b36.f.e(10, this.f390101p) + b36.f.e(11, this.f390102q);
            java.lang.String str9 = this.f390103r;
            if (str9 != null) {
                e17 += b36.f.j(12, str9);
            }
            int e18 = e17 + b36.f.e(13, this.f390104s);
            java.lang.String str10 = this.f390105t;
            return str10 != null ? e18 + b36.f.j(14, str10) : e18;
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
        r45.xh0 xh0Var = (r45.xh0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xh0Var.f390092d = aVar2.k(intValue);
                return 0;
            case 2:
                xh0Var.f390093e = aVar2.g(intValue);
                return 0;
            case 3:
                xh0Var.f390094f = aVar2.g(intValue);
                return 0;
            case 4:
                xh0Var.f390095g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.sh0 sh0Var = new r45.sh0();
                    if (bArr2 != null && bArr2.length > 0) {
                        sh0Var.parseFrom(bArr2);
                    }
                    xh0Var.f390096h.add(sh0Var);
                }
                return 0;
            case 6:
                xh0Var.f390097i = aVar2.g(intValue);
                return 0;
            case 7:
                xh0Var.f390098m = aVar2.g(intValue);
                return 0;
            case 8:
                xh0Var.f390099n = aVar2.k(intValue);
                return 0;
            case 9:
                xh0Var.f390100o = aVar2.k(intValue);
                return 0;
            case 10:
                xh0Var.f390101p = aVar2.g(intValue);
                return 0;
            case 11:
                xh0Var.f390102q = aVar2.g(intValue);
                return 0;
            case 12:
                xh0Var.f390103r = aVar2.k(intValue);
                return 0;
            case 13:
                xh0Var.f390104s = aVar2.g(intValue);
                return 0;
            case 14:
                xh0Var.f390105t = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
