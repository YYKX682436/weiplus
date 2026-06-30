package r45;

/* loaded from: classes10.dex */
public class yx1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391458d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391459e;

    /* renamed from: f, reason: collision with root package name */
    public int f391460f;

    /* renamed from: g, reason: collision with root package name */
    public int f391461g;

    /* renamed from: h, reason: collision with root package name */
    public int f391462h;

    /* renamed from: i, reason: collision with root package name */
    public r45.xn1 f391463i;

    /* renamed from: m, reason: collision with root package name */
    public int f391464m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f391465n;

    /* renamed from: o, reason: collision with root package name */
    public r45.by1 f391466o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f391467p;

    /* renamed from: q, reason: collision with root package name */
    public int f391468q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f391469r;

    /* renamed from: s, reason: collision with root package name */
    public int f391470s;

    /* renamed from: t, reason: collision with root package name */
    public int f391471t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yx1)) {
            return false;
        }
        r45.yx1 yx1Var = (r45.yx1) fVar;
        return n51.f.a(this.f391458d, yx1Var.f391458d) && n51.f.a(this.f391459e, yx1Var.f391459e) && n51.f.a(java.lang.Integer.valueOf(this.f391460f), java.lang.Integer.valueOf(yx1Var.f391460f)) && n51.f.a(java.lang.Integer.valueOf(this.f391461g), java.lang.Integer.valueOf(yx1Var.f391461g)) && n51.f.a(java.lang.Integer.valueOf(this.f391462h), java.lang.Integer.valueOf(yx1Var.f391462h)) && n51.f.a(this.f391463i, yx1Var.f391463i) && n51.f.a(java.lang.Integer.valueOf(this.f391464m), java.lang.Integer.valueOf(yx1Var.f391464m)) && n51.f.a(java.lang.Boolean.valueOf(this.f391465n), java.lang.Boolean.valueOf(yx1Var.f391465n)) && n51.f.a(this.f391466o, yx1Var.f391466o) && n51.f.a(this.f391467p, yx1Var.f391467p) && n51.f.a(java.lang.Integer.valueOf(this.f391468q), java.lang.Integer.valueOf(yx1Var.f391468q)) && n51.f.a(this.f391469r, yx1Var.f391469r) && n51.f.a(java.lang.Integer.valueOf(this.f391470s), java.lang.Integer.valueOf(yx1Var.f391470s)) && n51.f.a(java.lang.Integer.valueOf(this.f391471t), java.lang.Integer.valueOf(yx1Var.f391471t));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f391458d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f391459e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f391460f);
            fVar.e(4, this.f391461g);
            fVar.e(5, this.f391462h);
            r45.xn1 xn1Var = this.f391463i;
            if (xn1Var != null) {
                fVar.i(6, xn1Var.computeSize());
                this.f391463i.writeFields(fVar);
            }
            fVar.e(7, this.f391464m);
            fVar.a(8, this.f391465n);
            r45.by1 by1Var = this.f391466o;
            if (by1Var != null) {
                fVar.i(9, by1Var.computeSize());
                this.f391466o.writeFields(fVar);
            }
            java.lang.String str3 = this.f391467p;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            fVar.e(11, this.f391468q);
            java.lang.String str4 = this.f391469r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            fVar.e(13, this.f391470s);
            fVar.e(14, this.f391471t);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f391458d;
            int j17 = str5 != null ? b36.f.j(1, str5) + 0 : 0;
            java.lang.String str6 = this.f391459e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f391460f) + b36.f.e(4, this.f391461g) + b36.f.e(5, this.f391462h);
            r45.xn1 xn1Var2 = this.f391463i;
            if (xn1Var2 != null) {
                e17 += b36.f.i(6, xn1Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(7, this.f391464m) + b36.f.a(8, this.f391465n);
            r45.by1 by1Var2 = this.f391466o;
            if (by1Var2 != null) {
                e18 += b36.f.i(9, by1Var2.computeSize());
            }
            java.lang.String str7 = this.f391467p;
            if (str7 != null) {
                e18 += b36.f.j(10, str7);
            }
            int e19 = e18 + b36.f.e(11, this.f391468q);
            java.lang.String str8 = this.f391469r;
            if (str8 != null) {
                e19 += b36.f.j(12, str8);
            }
            return e19 + b36.f.e(13, this.f391470s) + b36.f.e(14, this.f391471t);
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
        r45.yx1 yx1Var = (r45.yx1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                yx1Var.f391458d = aVar2.k(intValue);
                return 0;
            case 2:
                yx1Var.f391459e = aVar2.k(intValue);
                return 0;
            case 3:
                yx1Var.f391460f = aVar2.g(intValue);
                return 0;
            case 4:
                yx1Var.f391461g = aVar2.g(intValue);
                return 0;
            case 5:
                yx1Var.f391462h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.xn1 xn1Var3 = new r45.xn1();
                    if (bArr != null && bArr.length > 0) {
                        xn1Var3.parseFrom(bArr);
                    }
                    yx1Var.f391463i = xn1Var3;
                }
                return 0;
            case 7:
                yx1Var.f391464m = aVar2.g(intValue);
                return 0;
            case 8:
                yx1Var.f391465n = aVar2.c(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.by1 by1Var3 = new r45.by1();
                    if (bArr2 != null && bArr2.length > 0) {
                        by1Var3.parseFrom(bArr2);
                    }
                    yx1Var.f391466o = by1Var3;
                }
                return 0;
            case 10:
                yx1Var.f391467p = aVar2.k(intValue);
                return 0;
            case 11:
                yx1Var.f391468q = aVar2.g(intValue);
                return 0;
            case 12:
                yx1Var.f391469r = aVar2.k(intValue);
                return 0;
            case 13:
                yx1Var.f391470s = aVar2.g(intValue);
                return 0;
            case 14:
                yx1Var.f391471t = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
