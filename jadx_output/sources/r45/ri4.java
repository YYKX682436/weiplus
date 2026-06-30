package r45;

/* loaded from: classes12.dex */
public class ri4 extends r45.mr5 {
    public int A;
    public java.lang.String B;
    public java.lang.String C;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384918d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384919e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384920f;

    /* renamed from: g, reason: collision with root package name */
    public int f384921g;

    /* renamed from: h, reason: collision with root package name */
    public int f384922h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cu5 f384923i;

    /* renamed from: m, reason: collision with root package name */
    public int f384924m;

    /* renamed from: n, reason: collision with root package name */
    public int f384925n;

    /* renamed from: o, reason: collision with root package name */
    public int f384926o;

    /* renamed from: p, reason: collision with root package name */
    public int f384927p;

    /* renamed from: q, reason: collision with root package name */
    public r45.cu5 f384928q;

    /* renamed from: r, reason: collision with root package name */
    public int f384929r;

    /* renamed from: s, reason: collision with root package name */
    public int f384930s;

    /* renamed from: t, reason: collision with root package name */
    public int f384931t;

    /* renamed from: u, reason: collision with root package name */
    public int f384932u;

    /* renamed from: v, reason: collision with root package name */
    public int f384933v;

    /* renamed from: w, reason: collision with root package name */
    public int f384934w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f384935x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f384936y;

    /* renamed from: z, reason: collision with root package name */
    public int f384937z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ri4)) {
            return false;
        }
        r45.ri4 ri4Var = (r45.ri4) fVar;
        return n51.f.a(this.BaseRequest, ri4Var.BaseRequest) && n51.f.a(this.f384918d, ri4Var.f384918d) && n51.f.a(this.f384919e, ri4Var.f384919e) && n51.f.a(this.f384920f, ri4Var.f384920f) && n51.f.a(java.lang.Integer.valueOf(this.f384921g), java.lang.Integer.valueOf(ri4Var.f384921g)) && n51.f.a(java.lang.Integer.valueOf(this.f384922h), java.lang.Integer.valueOf(ri4Var.f384922h)) && n51.f.a(this.f384923i, ri4Var.f384923i) && n51.f.a(java.lang.Integer.valueOf(this.f384924m), java.lang.Integer.valueOf(ri4Var.f384924m)) && n51.f.a(java.lang.Integer.valueOf(this.f384925n), java.lang.Integer.valueOf(ri4Var.f384925n)) && n51.f.a(java.lang.Integer.valueOf(this.f384926o), java.lang.Integer.valueOf(ri4Var.f384926o)) && n51.f.a(java.lang.Integer.valueOf(this.f384927p), java.lang.Integer.valueOf(ri4Var.f384927p)) && n51.f.a(this.f384928q, ri4Var.f384928q) && n51.f.a(java.lang.Integer.valueOf(this.f384929r), java.lang.Integer.valueOf(ri4Var.f384929r)) && n51.f.a(java.lang.Integer.valueOf(this.f384930s), java.lang.Integer.valueOf(ri4Var.f384930s)) && n51.f.a(java.lang.Integer.valueOf(this.f384931t), java.lang.Integer.valueOf(ri4Var.f384931t)) && n51.f.a(java.lang.Integer.valueOf(this.f384932u), java.lang.Integer.valueOf(ri4Var.f384932u)) && n51.f.a(java.lang.Integer.valueOf(this.f384933v), java.lang.Integer.valueOf(ri4Var.f384933v)) && n51.f.a(java.lang.Integer.valueOf(this.f384934w), java.lang.Integer.valueOf(ri4Var.f384934w)) && n51.f.a(this.f384935x, ri4Var.f384935x) && n51.f.a(this.f384936y, ri4Var.f384936y) && n51.f.a(java.lang.Integer.valueOf(this.f384937z), java.lang.Integer.valueOf(ri4Var.f384937z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(ri4Var.A)) && n51.f.a(this.B, ri4Var.B) && n51.f.a(this.C, ri4Var.C);
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
            java.lang.String str = this.f384918d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f384919e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f384920f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f384921g);
            fVar.e(6, this.f384922h);
            r45.cu5 cu5Var = this.f384923i;
            if (cu5Var != null) {
                fVar.i(7, cu5Var.computeSize());
                this.f384923i.writeFields(fVar);
            }
            fVar.e(8, this.f384924m);
            fVar.e(9, this.f384925n);
            fVar.e(10, this.f384926o);
            fVar.e(11, this.f384927p);
            r45.cu5 cu5Var2 = this.f384928q;
            if (cu5Var2 != null) {
                fVar.i(12, cu5Var2.computeSize());
                this.f384928q.writeFields(fVar);
            }
            fVar.e(13, this.f384929r);
            fVar.e(14, this.f384930s);
            fVar.e(15, this.f384931t);
            fVar.e(16, this.f384932u);
            fVar.e(17, this.f384933v);
            fVar.e(18, this.f384934w);
            java.lang.String str4 = this.f384935x;
            if (str4 != null) {
                fVar.j(19, str4);
            }
            java.lang.String str5 = this.f384936y;
            if (str5 != null) {
                fVar.j(20, str5);
            }
            fVar.e(21, this.f384937z);
            fVar.e(22, this.A);
            java.lang.String str6 = this.B;
            if (str6 != null) {
                fVar.j(23, str6);
            }
            java.lang.String str7 = this.C;
            if (str7 != null) {
                fVar.j(24, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str8 = this.f384918d;
            if (str8 != null) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f384919e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f384920f;
            if (str10 != null) {
                i18 += b36.f.j(4, str10);
            }
            int e17 = i18 + b36.f.e(5, this.f384921g) + b36.f.e(6, this.f384922h);
            r45.cu5 cu5Var3 = this.f384923i;
            if (cu5Var3 != null) {
                e17 += b36.f.i(7, cu5Var3.computeSize());
            }
            int e18 = e17 + b36.f.e(8, this.f384924m) + b36.f.e(9, this.f384925n) + b36.f.e(10, this.f384926o) + b36.f.e(11, this.f384927p);
            r45.cu5 cu5Var4 = this.f384928q;
            if (cu5Var4 != null) {
                e18 += b36.f.i(12, cu5Var4.computeSize());
            }
            int e19 = e18 + b36.f.e(13, this.f384929r) + b36.f.e(14, this.f384930s) + b36.f.e(15, this.f384931t) + b36.f.e(16, this.f384932u) + b36.f.e(17, this.f384933v) + b36.f.e(18, this.f384934w);
            java.lang.String str11 = this.f384935x;
            if (str11 != null) {
                e19 += b36.f.j(19, str11);
            }
            java.lang.String str12 = this.f384936y;
            if (str12 != null) {
                e19 += b36.f.j(20, str12);
            }
            int e27 = e19 + b36.f.e(21, this.f384937z) + b36.f.e(22, this.A);
            java.lang.String str13 = this.B;
            if (str13 != null) {
                e27 += b36.f.j(23, str13);
            }
            java.lang.String str14 = this.C;
            return str14 != null ? e27 + b36.f.j(24, str14) : e27;
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
        r45.ri4 ri4Var = (r45.ri4) objArr[1];
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
                    ri4Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                ri4Var.f384918d = aVar2.k(intValue);
                return 0;
            case 3:
                ri4Var.f384919e = aVar2.k(intValue);
                return 0;
            case 4:
                ri4Var.f384920f = aVar2.k(intValue);
                return 0;
            case 5:
                ri4Var.f384921g = aVar2.g(intValue);
                return 0;
            case 6:
                ri4Var.f384922h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    ri4Var.f384923i = cu5Var5;
                }
                return 0;
            case 8:
                ri4Var.f384924m = aVar2.g(intValue);
                return 0;
            case 9:
                ri4Var.f384925n = aVar2.g(intValue);
                return 0;
            case 10:
                ri4Var.f384926o = aVar2.g(intValue);
                return 0;
            case 11:
                ri4Var.f384927p = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var6.b(bArr3);
                    }
                    ri4Var.f384928q = cu5Var6;
                }
                return 0;
            case 13:
                ri4Var.f384929r = aVar2.g(intValue);
                return 0;
            case 14:
                ri4Var.f384930s = aVar2.g(intValue);
                return 0;
            case 15:
                ri4Var.f384931t = aVar2.g(intValue);
                return 0;
            case 16:
                ri4Var.f384932u = aVar2.g(intValue);
                return 0;
            case 17:
                ri4Var.f384933v = aVar2.g(intValue);
                return 0;
            case 18:
                ri4Var.f384934w = aVar2.g(intValue);
                return 0;
            case 19:
                ri4Var.f384935x = aVar2.k(intValue);
                return 0;
            case 20:
                ri4Var.f384936y = aVar2.k(intValue);
                return 0;
            case 21:
                ri4Var.f384937z = aVar2.g(intValue);
                return 0;
            case 22:
                ri4Var.A = aVar2.g(intValue);
                return 0;
            case 23:
                ri4Var.B = aVar2.k(intValue);
                return 0;
            case 24:
                ri4Var.C = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
