package r45;

/* loaded from: classes4.dex */
public class k76 extends com.tencent.mm.protobuf.f {
    public int A;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378458d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378459e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378460f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378461g;

    /* renamed from: h, reason: collision with root package name */
    public int f378462h;

    /* renamed from: i, reason: collision with root package name */
    public int f378463i;

    /* renamed from: m, reason: collision with root package name */
    public int f378464m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f378465n;

    /* renamed from: o, reason: collision with root package name */
    public int f378466o;

    /* renamed from: p, reason: collision with root package name */
    public int f378467p;

    /* renamed from: q, reason: collision with root package name */
    public int f378468q;

    /* renamed from: r, reason: collision with root package name */
    public long f378469r;

    /* renamed from: s, reason: collision with root package name */
    public long f378470s;

    /* renamed from: t, reason: collision with root package name */
    public r45.cu5 f378471t;

    /* renamed from: u, reason: collision with root package name */
    public int f378472u;

    /* renamed from: v, reason: collision with root package name */
    public r45.mo5 f378473v;

    /* renamed from: x, reason: collision with root package name */
    public int f378475x;

    /* renamed from: y, reason: collision with root package name */
    public int f378476y;

    /* renamed from: z, reason: collision with root package name */
    public int f378477z;

    /* renamed from: w, reason: collision with root package name */
    public java.util.LinkedList f378474w = new java.util.LinkedList();
    public java.util.LinkedList B = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k76)) {
            return false;
        }
        r45.k76 k76Var = (r45.k76) fVar;
        return n51.f.a(this.f378458d, k76Var.f378458d) && n51.f.a(this.f378459e, k76Var.f378459e) && n51.f.a(this.f378460f, k76Var.f378460f) && n51.f.a(this.f378461g, k76Var.f378461g) && n51.f.a(java.lang.Integer.valueOf(this.f378462h), java.lang.Integer.valueOf(k76Var.f378462h)) && n51.f.a(java.lang.Integer.valueOf(this.f378463i), java.lang.Integer.valueOf(k76Var.f378463i)) && n51.f.a(java.lang.Integer.valueOf(this.f378464m), java.lang.Integer.valueOf(k76Var.f378464m)) && n51.f.a(this.f378465n, k76Var.f378465n) && n51.f.a(java.lang.Integer.valueOf(this.f378466o), java.lang.Integer.valueOf(k76Var.f378466o)) && n51.f.a(java.lang.Integer.valueOf(this.f378467p), java.lang.Integer.valueOf(k76Var.f378467p)) && n51.f.a(java.lang.Integer.valueOf(this.f378468q), java.lang.Integer.valueOf(k76Var.f378468q)) && n51.f.a(java.lang.Long.valueOf(this.f378469r), java.lang.Long.valueOf(k76Var.f378469r)) && n51.f.a(java.lang.Long.valueOf(this.f378470s), java.lang.Long.valueOf(k76Var.f378470s)) && n51.f.a(this.f378471t, k76Var.f378471t) && n51.f.a(java.lang.Integer.valueOf(this.f378472u), java.lang.Integer.valueOf(k76Var.f378472u)) && n51.f.a(this.f378473v, k76Var.f378473v) && n51.f.a(this.f378474w, k76Var.f378474w) && n51.f.a(java.lang.Integer.valueOf(this.f378475x), java.lang.Integer.valueOf(k76Var.f378475x)) && n51.f.a(java.lang.Integer.valueOf(this.f378476y), java.lang.Integer.valueOf(k76Var.f378476y)) && n51.f.a(java.lang.Integer.valueOf(this.f378477z), java.lang.Integer.valueOf(k76Var.f378477z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(k76Var.A)) && n51.f.a(this.B, k76Var.B);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378458d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f378459e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f378460f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f378461g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f378462h);
            fVar.e(6, this.f378463i);
            fVar.e(7, this.f378464m);
            java.lang.String str5 = this.f378465n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.e(9, this.f378466o);
            fVar.e(10, this.f378467p);
            fVar.e(11, this.f378468q);
            fVar.h(12, this.f378469r);
            fVar.h(13, this.f378470s);
            r45.cu5 cu5Var = this.f378471t;
            if (cu5Var != null) {
                fVar.i(14, cu5Var.computeSize());
                this.f378471t.writeFields(fVar);
            }
            fVar.e(15, this.f378472u);
            r45.mo5 mo5Var = this.f378473v;
            if (mo5Var != null) {
                fVar.i(16, mo5Var.computeSize());
                this.f378473v.writeFields(fVar);
            }
            fVar.g(17, 8, this.f378474w);
            fVar.e(18, this.f378475x);
            fVar.e(22, this.f378476y);
            fVar.e(23, this.f378477z);
            fVar.e(24, this.A);
            fVar.g(25, 8, this.B);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f378458d;
            int j17 = str6 != null ? b36.f.j(1, str6) + 0 : 0;
            java.lang.String str7 = this.f378459e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f378460f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f378461g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f378462h) + b36.f.e(6, this.f378463i) + b36.f.e(7, this.f378464m);
            java.lang.String str10 = this.f378465n;
            if (str10 != null) {
                e17 += b36.f.j(8, str10);
            }
            int e18 = e17 + b36.f.e(9, this.f378466o) + b36.f.e(10, this.f378467p) + b36.f.e(11, this.f378468q) + b36.f.h(12, this.f378469r) + b36.f.h(13, this.f378470s);
            r45.cu5 cu5Var2 = this.f378471t;
            if (cu5Var2 != null) {
                e18 += b36.f.i(14, cu5Var2.computeSize());
            }
            int e19 = e18 + b36.f.e(15, this.f378472u);
            r45.mo5 mo5Var2 = this.f378473v;
            if (mo5Var2 != null) {
                e19 += b36.f.i(16, mo5Var2.computeSize());
            }
            return e19 + b36.f.g(17, 8, this.f378474w) + b36.f.e(18, this.f378475x) + b36.f.e(22, this.f378476y) + b36.f.e(23, this.f378477z) + b36.f.e(24, this.A) + b36.f.g(25, 8, this.B);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f378474w.clear();
            this.B.clear();
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
        r45.k76 k76Var = (r45.k76) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                k76Var.f378458d = aVar2.k(intValue);
                return 0;
            case 2:
                k76Var.f378459e = aVar2.k(intValue);
                return 0;
            case 3:
                k76Var.f378460f = aVar2.k(intValue);
                return 0;
            case 4:
                k76Var.f378461g = aVar2.k(intValue);
                return 0;
            case 5:
                k76Var.f378462h = aVar2.g(intValue);
                return 0;
            case 6:
                k76Var.f378463i = aVar2.g(intValue);
                return 0;
            case 7:
                k76Var.f378464m = aVar2.g(intValue);
                return 0;
            case 8:
                k76Var.f378465n = aVar2.k(intValue);
                return 0;
            case 9:
                k76Var.f378466o = aVar2.g(intValue);
                return 0;
            case 10:
                k76Var.f378467p = aVar2.g(intValue);
                return 0;
            case 11:
                k76Var.f378468q = aVar2.g(intValue);
                return 0;
            case 12:
                k76Var.f378469r = aVar2.i(intValue);
                return 0;
            case 13:
                k76Var.f378470s = aVar2.i(intValue);
                return 0;
            case 14:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    k76Var.f378471t = cu5Var3;
                }
                return 0;
            case 15:
                k76Var.f378472u = aVar2.g(intValue);
                return 0;
            case 16:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.mo5 mo5Var3 = new r45.mo5();
                    if (bArr3 != null && bArr3.length > 0) {
                        mo5Var3.parseFrom(bArr3);
                    }
                    k76Var.f378473v = mo5Var3;
                }
                return 0;
            case 17:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.l86 l86Var = new r45.l86();
                    if (bArr4 != null && bArr4.length > 0) {
                        l86Var.parseFrom(bArr4);
                    }
                    k76Var.f378474w.add(l86Var);
                }
                return 0;
            case 18:
                k76Var.f378475x = aVar2.g(intValue);
                return 0;
            case 19:
            case 20:
            case 21:
            default:
                return -1;
            case 22:
                k76Var.f378476y = aVar2.g(intValue);
                return 0;
            case 23:
                k76Var.f378477z = aVar2.g(intValue);
                return 0;
            case 24:
                k76Var.A = aVar2.g(intValue);
                return 0;
            case 25:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.d86 d86Var = new r45.d86();
                    if (bArr5 != null && bArr5.length > 0) {
                        d86Var.parseFrom(bArr5);
                    }
                    k76Var.B.add(d86Var);
                }
                return 0;
        }
    }
}
