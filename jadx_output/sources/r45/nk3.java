package r45;

/* loaded from: classes9.dex */
public class nk3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f381458d;

    /* renamed from: e, reason: collision with root package name */
    public int f381459e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381460f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f381461g;

    /* renamed from: h, reason: collision with root package name */
    public double f381462h;

    /* renamed from: i, reason: collision with root package name */
    public double f381463i;

    /* renamed from: m, reason: collision with root package name */
    public double f381464m;

    /* renamed from: n, reason: collision with root package name */
    public double f381465n;

    /* renamed from: o, reason: collision with root package name */
    public int f381466o;

    /* renamed from: p, reason: collision with root package name */
    public double f381467p;

    /* renamed from: q, reason: collision with root package name */
    public int f381468q;

    /* renamed from: r, reason: collision with root package name */
    public int f381469r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f381470s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f381471t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nk3)) {
            return false;
        }
        r45.nk3 nk3Var = (r45.nk3) fVar;
        return n51.f.a(this.BaseRequest, nk3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f381458d), java.lang.Integer.valueOf(nk3Var.f381458d)) && n51.f.a(java.lang.Integer.valueOf(this.f381459e), java.lang.Integer.valueOf(nk3Var.f381459e)) && n51.f.a(this.f381460f, nk3Var.f381460f) && n51.f.a(this.f381461g, nk3Var.f381461g) && n51.f.a(java.lang.Double.valueOf(this.f381462h), java.lang.Double.valueOf(nk3Var.f381462h)) && n51.f.a(java.lang.Double.valueOf(this.f381463i), java.lang.Double.valueOf(nk3Var.f381463i)) && n51.f.a(java.lang.Double.valueOf(this.f381464m), java.lang.Double.valueOf(nk3Var.f381464m)) && n51.f.a(java.lang.Double.valueOf(this.f381465n), java.lang.Double.valueOf(nk3Var.f381465n)) && n51.f.a(java.lang.Integer.valueOf(this.f381466o), java.lang.Integer.valueOf(nk3Var.f381466o)) && n51.f.a(java.lang.Double.valueOf(this.f381467p), java.lang.Double.valueOf(nk3Var.f381467p)) && n51.f.a(java.lang.Integer.valueOf(this.f381468q), java.lang.Integer.valueOf(nk3Var.f381468q)) && n51.f.a(java.lang.Integer.valueOf(this.f381469r), java.lang.Integer.valueOf(nk3Var.f381469r)) && n51.f.a(this.f381470s, nk3Var.f381470s) && n51.f.a(this.f381471t, nk3Var.f381471t);
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
            fVar.e(2, this.f381458d);
            fVar.e(3, this.f381459e);
            java.lang.String str = this.f381460f;
            if (str != null) {
                fVar.j(4, str);
            }
            r45.cu5 cu5Var = this.f381461g;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.computeSize());
                this.f381461g.writeFields(fVar);
            }
            fVar.c(6, this.f381462h);
            fVar.c(7, this.f381463i);
            fVar.c(8, this.f381464m);
            fVar.c(9, this.f381465n);
            fVar.e(10, this.f381466o);
            fVar.c(11, this.f381467p);
            fVar.e(12, this.f381468q);
            fVar.e(13, this.f381469r);
            java.lang.String str2 = this.f381470s;
            if (str2 != null) {
                fVar.j(14, str2);
            }
            java.lang.String str3 = this.f381471t;
            if (str3 != null) {
                fVar.j(15, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f381458d) + b36.f.e(3, this.f381459e);
            java.lang.String str4 = this.f381460f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            r45.cu5 cu5Var2 = this.f381461g;
            if (cu5Var2 != null) {
                i18 += b36.f.i(5, cu5Var2.computeSize());
            }
            int c17 = i18 + b36.f.c(6, this.f381462h) + b36.f.c(7, this.f381463i) + b36.f.c(8, this.f381464m) + b36.f.c(9, this.f381465n) + b36.f.e(10, this.f381466o) + b36.f.c(11, this.f381467p) + b36.f.e(12, this.f381468q) + b36.f.e(13, this.f381469r);
            java.lang.String str5 = this.f381470s;
            if (str5 != null) {
                c17 += b36.f.j(14, str5);
            }
            java.lang.String str6 = this.f381471t;
            return str6 != null ? c17 + b36.f.j(15, str6) : c17;
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
        r45.nk3 nk3Var = (r45.nk3) objArr[1];
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
                    nk3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                nk3Var.f381458d = aVar2.g(intValue);
                return 0;
            case 3:
                nk3Var.f381459e = aVar2.g(intValue);
                return 0;
            case 4:
                nk3Var.f381460f = aVar2.k(intValue);
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
                    nk3Var.f381461g = cu5Var3;
                }
                return 0;
            case 6:
                nk3Var.f381462h = aVar2.e(intValue);
                return 0;
            case 7:
                nk3Var.f381463i = aVar2.e(intValue);
                return 0;
            case 8:
                nk3Var.f381464m = aVar2.e(intValue);
                return 0;
            case 9:
                nk3Var.f381465n = aVar2.e(intValue);
                return 0;
            case 10:
                nk3Var.f381466o = aVar2.g(intValue);
                return 0;
            case 11:
                nk3Var.f381467p = aVar2.e(intValue);
                return 0;
            case 12:
                nk3Var.f381468q = aVar2.g(intValue);
                return 0;
            case 13:
                nk3Var.f381469r = aVar2.g(intValue);
                return 0;
            case 14:
                nk3Var.f381470s = aVar2.k(intValue);
                return 0;
            case 15:
                nk3Var.f381471t = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
