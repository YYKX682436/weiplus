package r45;

/* loaded from: classes4.dex */
public class za6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f391859d;

    /* renamed from: e, reason: collision with root package name */
    public int f391860e;

    /* renamed from: f, reason: collision with root package name */
    public int f391861f;

    /* renamed from: g, reason: collision with root package name */
    public int f391862g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f391863h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f391864i;

    /* renamed from: m, reason: collision with root package name */
    public int f391865m;

    /* renamed from: n, reason: collision with root package name */
    public int f391866n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f391867o;

    /* renamed from: p, reason: collision with root package name */
    public int f391868p;

    /* renamed from: q, reason: collision with root package name */
    public int f391869q;

    /* renamed from: r, reason: collision with root package name */
    public r45.kq6 f391870r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f391871s;

    /* renamed from: t, reason: collision with root package name */
    public int f391872t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f391873u;

    /* renamed from: v, reason: collision with root package name */
    public int f391874v;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.za6)) {
            return false;
        }
        r45.za6 za6Var = (r45.za6) fVar;
        return n51.f.a(this.BaseRequest, za6Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f391859d), java.lang.Integer.valueOf(za6Var.f391859d)) && n51.f.a(java.lang.Integer.valueOf(this.f391860e), java.lang.Integer.valueOf(za6Var.f391860e)) && n51.f.a(java.lang.Integer.valueOf(this.f391861f), java.lang.Integer.valueOf(za6Var.f391861f)) && n51.f.a(java.lang.Integer.valueOf(this.f391862g), java.lang.Integer.valueOf(za6Var.f391862g)) && n51.f.a(this.f391863h, za6Var.f391863h) && n51.f.a(this.f391864i, za6Var.f391864i) && n51.f.a(java.lang.Integer.valueOf(this.f391865m), java.lang.Integer.valueOf(za6Var.f391865m)) && n51.f.a(java.lang.Integer.valueOf(this.f391866n), java.lang.Integer.valueOf(za6Var.f391866n)) && n51.f.a(this.f391867o, za6Var.f391867o) && n51.f.a(java.lang.Integer.valueOf(this.f391868p), java.lang.Integer.valueOf(za6Var.f391868p)) && n51.f.a(java.lang.Integer.valueOf(this.f391869q), java.lang.Integer.valueOf(za6Var.f391869q)) && n51.f.a(this.f391870r, za6Var.f391870r) && n51.f.a(this.f391871s, za6Var.f391871s) && n51.f.a(java.lang.Integer.valueOf(this.f391872t), java.lang.Integer.valueOf(za6Var.f391872t)) && n51.f.a(this.f391873u, za6Var.f391873u) && n51.f.a(java.lang.Integer.valueOf(this.f391874v), java.lang.Integer.valueOf(za6Var.f391874v));
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
            fVar.e(2, this.f391859d);
            fVar.e(3, this.f391860e);
            fVar.e(17, this.f391861f);
            fVar.e(4, this.f391862g);
            r45.cu5 cu5Var = this.f391863h;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.computeSize());
                this.f391863h.writeFields(fVar);
            }
            java.lang.String str = this.f391864i;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.e(7, this.f391865m);
            fVar.e(8, this.f391866n);
            java.lang.String str2 = this.f391867o;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            fVar.e(10, this.f391868p);
            fVar.e(11, this.f391869q);
            r45.kq6 kq6Var = this.f391870r;
            if (kq6Var != null) {
                fVar.i(12, kq6Var.computeSize());
                this.f391870r.writeFields(fVar);
            }
            java.lang.String str3 = this.f391871s;
            if (str3 != null) {
                fVar.j(13, str3);
            }
            fVar.e(14, this.f391872t);
            java.lang.String str4 = this.f391873u;
            if (str4 != null) {
                fVar.j(15, str4);
            }
            fVar.e(16, this.f391874v);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f391859d) + b36.f.e(3, this.f391860e) + b36.f.e(17, this.f391861f) + b36.f.e(4, this.f391862g);
            r45.cu5 cu5Var2 = this.f391863h;
            if (cu5Var2 != null) {
                i18 += b36.f.i(5, cu5Var2.computeSize());
            }
            java.lang.String str5 = this.f391864i;
            if (str5 != null) {
                i18 += b36.f.j(6, str5);
            }
            int e17 = i18 + b36.f.e(7, this.f391865m) + b36.f.e(8, this.f391866n);
            java.lang.String str6 = this.f391867o;
            if (str6 != null) {
                e17 += b36.f.j(9, str6);
            }
            int e18 = e17 + b36.f.e(10, this.f391868p) + b36.f.e(11, this.f391869q);
            r45.kq6 kq6Var2 = this.f391870r;
            if (kq6Var2 != null) {
                e18 += b36.f.i(12, kq6Var2.computeSize());
            }
            java.lang.String str7 = this.f391871s;
            if (str7 != null) {
                e18 += b36.f.j(13, str7);
            }
            int e19 = e18 + b36.f.e(14, this.f391872t);
            java.lang.String str8 = this.f391873u;
            if (str8 != null) {
                e19 += b36.f.j(15, str8);
            }
            return e19 + b36.f.e(16, this.f391874v);
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
        r45.za6 za6Var = (r45.za6) objArr[1];
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
                    za6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                za6Var.f391859d = aVar2.g(intValue);
                return 0;
            case 3:
                za6Var.f391860e = aVar2.g(intValue);
                return 0;
            case 4:
                za6Var.f391862g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    za6Var.f391863h = cu5Var3;
                }
                return 0;
            case 6:
                za6Var.f391864i = aVar2.k(intValue);
                return 0;
            case 7:
                za6Var.f391865m = aVar2.g(intValue);
                return 0;
            case 8:
                za6Var.f391866n = aVar2.g(intValue);
                return 0;
            case 9:
                za6Var.f391867o = aVar2.k(intValue);
                return 0;
            case 10:
                za6Var.f391868p = aVar2.g(intValue);
                return 0;
            case 11:
                za6Var.f391869q = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.kq6 kq6Var3 = new r45.kq6();
                    if (bArr3 != null && bArr3.length > 0) {
                        kq6Var3.parseFrom(bArr3);
                    }
                    za6Var.f391870r = kq6Var3;
                }
                return 0;
            case 13:
                za6Var.f391871s = aVar2.k(intValue);
                return 0;
            case 14:
                za6Var.f391872t = aVar2.g(intValue);
                return 0;
            case 15:
                za6Var.f391873u = aVar2.k(intValue);
                return 0;
            case 16:
                za6Var.f391874v = aVar2.g(intValue);
                return 0;
            case 17:
                za6Var.f391861f = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
