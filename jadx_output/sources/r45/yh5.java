package r45;

/* loaded from: classes9.dex */
public class yh5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public long f391089d;

    /* renamed from: e, reason: collision with root package name */
    public int f391090e;

    /* renamed from: f, reason: collision with root package name */
    public long f391091f;

    /* renamed from: g, reason: collision with root package name */
    public int f391092g;

    /* renamed from: h, reason: collision with root package name */
    public long f391093h;

    /* renamed from: i, reason: collision with root package name */
    public int f391094i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f391095m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f391096n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f391097o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f391098p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f391099q;

    /* renamed from: r, reason: collision with root package name */
    public int f391100r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f391101s;

    /* renamed from: t, reason: collision with root package name */
    public int f391102t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f391103u;

    /* renamed from: v, reason: collision with root package name */
    public int f391104v;

    /* renamed from: w, reason: collision with root package name */
    public int f391105w;

    /* renamed from: x, reason: collision with root package name */
    public int f391106x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f391107y;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yh5)) {
            return false;
        }
        r45.yh5 yh5Var = (r45.yh5) fVar;
        return n51.f.a(this.BaseResponse, yh5Var.BaseResponse) && n51.f.a(java.lang.Long.valueOf(this.f391089d), java.lang.Long.valueOf(yh5Var.f391089d)) && n51.f.a(java.lang.Integer.valueOf(this.f391090e), java.lang.Integer.valueOf(yh5Var.f391090e)) && n51.f.a(java.lang.Long.valueOf(this.f391091f), java.lang.Long.valueOf(yh5Var.f391091f)) && n51.f.a(java.lang.Integer.valueOf(this.f391092g), java.lang.Integer.valueOf(yh5Var.f391092g)) && n51.f.a(java.lang.Long.valueOf(this.f391093h), java.lang.Long.valueOf(yh5Var.f391093h)) && n51.f.a(java.lang.Integer.valueOf(this.f391094i), java.lang.Integer.valueOf(yh5Var.f391094i)) && n51.f.a(this.f391095m, yh5Var.f391095m) && n51.f.a(this.f391096n, yh5Var.f391096n) && n51.f.a(this.f391097o, yh5Var.f391097o) && n51.f.a(this.f391098p, yh5Var.f391098p) && n51.f.a(this.f391099q, yh5Var.f391099q) && n51.f.a(java.lang.Integer.valueOf(this.f391100r), java.lang.Integer.valueOf(yh5Var.f391100r)) && n51.f.a(this.f391101s, yh5Var.f391101s) && n51.f.a(java.lang.Integer.valueOf(this.f391102t), java.lang.Integer.valueOf(yh5Var.f391102t)) && n51.f.a(this.f391103u, yh5Var.f391103u) && n51.f.a(java.lang.Integer.valueOf(this.f391104v), java.lang.Integer.valueOf(yh5Var.f391104v)) && n51.f.a(java.lang.Integer.valueOf(this.f391105w), java.lang.Integer.valueOf(yh5Var.f391105w)) && n51.f.a(java.lang.Integer.valueOf(this.f391106x), java.lang.Integer.valueOf(yh5Var.f391106x)) && n51.f.a(this.f391107y, yh5Var.f391107y);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f391095m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.h(2, this.f391089d);
            fVar.e(3, this.f391090e);
            fVar.h(4, this.f391091f);
            fVar.e(5, this.f391092g);
            fVar.h(6, this.f391093h);
            fVar.e(9, this.f391094i);
            fVar.g(10, 8, linkedList);
            java.lang.String str = this.f391096n;
            if (str != null) {
                fVar.j(11, str);
            }
            java.lang.String str2 = this.f391097o;
            if (str2 != null) {
                fVar.j(12, str2);
            }
            java.lang.String str3 = this.f391098p;
            if (str3 != null) {
                fVar.j(13, str3);
            }
            java.lang.String str4 = this.f391099q;
            if (str4 != null) {
                fVar.j(14, str4);
            }
            fVar.e(15, this.f391100r);
            java.lang.String str5 = this.f391101s;
            if (str5 != null) {
                fVar.j(16, str5);
            }
            fVar.e(17, this.f391102t);
            java.lang.String str6 = this.f391103u;
            if (str6 != null) {
                fVar.j(18, str6);
            }
            fVar.e(19, this.f391104v);
            fVar.e(20, this.f391105w);
            fVar.e(21, this.f391106x);
            java.lang.String str7 = this.f391107y;
            if (str7 != null) {
                fVar.j(22, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.h(2, this.f391089d) + b36.f.e(3, this.f391090e) + b36.f.h(4, this.f391091f) + b36.f.e(5, this.f391092g) + b36.f.h(6, this.f391093h) + b36.f.e(9, this.f391094i) + b36.f.g(10, 8, linkedList);
            java.lang.String str8 = this.f391096n;
            if (str8 != null) {
                i18 += b36.f.j(11, str8);
            }
            java.lang.String str9 = this.f391097o;
            if (str9 != null) {
                i18 += b36.f.j(12, str9);
            }
            java.lang.String str10 = this.f391098p;
            if (str10 != null) {
                i18 += b36.f.j(13, str10);
            }
            java.lang.String str11 = this.f391099q;
            if (str11 != null) {
                i18 += b36.f.j(14, str11);
            }
            int e17 = i18 + b36.f.e(15, this.f391100r);
            java.lang.String str12 = this.f391101s;
            if (str12 != null) {
                e17 += b36.f.j(16, str12);
            }
            int e18 = e17 + b36.f.e(17, this.f391102t);
            java.lang.String str13 = this.f391103u;
            if (str13 != null) {
                e18 += b36.f.j(18, str13);
            }
            int e19 = e18 + b36.f.e(19, this.f391104v) + b36.f.e(20, this.f391105w) + b36.f.e(21, this.f391106x);
            java.lang.String str14 = this.f391107y;
            return str14 != null ? e19 + b36.f.j(22, str14) : e19;
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
        r45.yh5 yh5Var = (r45.yh5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    yh5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                yh5Var.f391089d = aVar2.i(intValue);
                return 0;
            case 3:
                yh5Var.f391090e = aVar2.g(intValue);
                return 0;
            case 4:
                yh5Var.f391091f = aVar2.i(intValue);
                return 0;
            case 5:
                yh5Var.f391092g = aVar2.g(intValue);
                return 0;
            case 6:
                yh5Var.f391093h = aVar2.i(intValue);
                return 0;
            case 7:
            case 8:
            default:
                return -1;
            case 9:
                yh5Var.f391094i = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.vu3 vu3Var = new r45.vu3();
                    if (bArr3 != null && bArr3.length > 0) {
                        vu3Var.parseFrom(bArr3);
                    }
                    yh5Var.f391095m.add(vu3Var);
                }
                return 0;
            case 11:
                yh5Var.f391096n = aVar2.k(intValue);
                return 0;
            case 12:
                yh5Var.f391097o = aVar2.k(intValue);
                return 0;
            case 13:
                yh5Var.f391098p = aVar2.k(intValue);
                return 0;
            case 14:
                yh5Var.f391099q = aVar2.k(intValue);
                return 0;
            case 15:
                yh5Var.f391100r = aVar2.g(intValue);
                return 0;
            case 16:
                yh5Var.f391101s = aVar2.k(intValue);
                return 0;
            case 17:
                yh5Var.f391102t = aVar2.g(intValue);
                return 0;
            case 18:
                yh5Var.f391103u = aVar2.k(intValue);
                return 0;
            case 19:
                yh5Var.f391104v = aVar2.g(intValue);
                return 0;
            case 20:
                yh5Var.f391105w = aVar2.g(intValue);
                return 0;
            case 21:
                yh5Var.f391106x = aVar2.g(intValue);
                return 0;
            case 22:
                yh5Var.f391107y = aVar2.k(intValue);
                return 0;
        }
    }
}
