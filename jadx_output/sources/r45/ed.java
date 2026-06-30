package r45;

/* loaded from: classes11.dex */
public class ed extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373279d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373280e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f373281f;

    /* renamed from: g, reason: collision with root package name */
    public r45.du5 f373282g;

    /* renamed from: h, reason: collision with root package name */
    public r45.du5 f373283h;

    /* renamed from: i, reason: collision with root package name */
    public int f373284i;

    /* renamed from: m, reason: collision with root package name */
    public int f373285m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f373286n;

    /* renamed from: o, reason: collision with root package name */
    public int f373287o;

    /* renamed from: p, reason: collision with root package name */
    public int f373288p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f373289q = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f373290r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public r45.cu5 f373291s;

    /* renamed from: t, reason: collision with root package name */
    public int f373292t;

    /* renamed from: u, reason: collision with root package name */
    public int f373293u;

    /* renamed from: v, reason: collision with root package name */
    public long f373294v;

    /* renamed from: w, reason: collision with root package name */
    public int f373295w;

    /* renamed from: x, reason: collision with root package name */
    public long f373296x;

    /* renamed from: y, reason: collision with root package name */
    public int f373297y;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ed)) {
            return false;
        }
        r45.ed edVar = (r45.ed) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373279d), java.lang.Integer.valueOf(edVar.f373279d)) && n51.f.a(this.f373280e, edVar.f373280e) && n51.f.a(this.f373281f, edVar.f373281f) && n51.f.a(this.f373282g, edVar.f373282g) && n51.f.a(this.f373283h, edVar.f373283h) && n51.f.a(java.lang.Integer.valueOf(this.f373284i), java.lang.Integer.valueOf(edVar.f373284i)) && n51.f.a(java.lang.Integer.valueOf(this.f373285m), java.lang.Integer.valueOf(edVar.f373285m)) && n51.f.a(this.f373286n, edVar.f373286n) && n51.f.a(java.lang.Integer.valueOf(this.f373287o), java.lang.Integer.valueOf(edVar.f373287o)) && n51.f.a(java.lang.Integer.valueOf(this.f373288p), java.lang.Integer.valueOf(edVar.f373288p)) && n51.f.a(this.f373289q, edVar.f373289q) && n51.f.a(this.f373290r, edVar.f373290r) && n51.f.a(this.f373291s, edVar.f373291s) && n51.f.a(java.lang.Integer.valueOf(this.f373292t), java.lang.Integer.valueOf(edVar.f373292t)) && n51.f.a(java.lang.Integer.valueOf(this.f373293u), java.lang.Integer.valueOf(edVar.f373293u)) && n51.f.a(java.lang.Long.valueOf(this.f373294v), java.lang.Long.valueOf(edVar.f373294v)) && n51.f.a(java.lang.Integer.valueOf(this.f373295w), java.lang.Integer.valueOf(edVar.f373295w)) && n51.f.a(java.lang.Long.valueOf(this.f373296x), java.lang.Long.valueOf(edVar.f373296x)) && n51.f.a(java.lang.Integer.valueOf(this.f373297y), java.lang.Integer.valueOf(edVar.f373297y));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f373290r;
        java.util.LinkedList linkedList2 = this.f373289q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373279d);
            java.lang.String str = this.f373280e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.du5 du5Var = this.f373281f;
            if (du5Var != null) {
                fVar.i(3, du5Var.computeSize());
                this.f373281f.writeFields(fVar);
            }
            r45.du5 du5Var2 = this.f373282g;
            if (du5Var2 != null) {
                fVar.i(4, du5Var2.computeSize());
                this.f373282g.writeFields(fVar);
            }
            r45.du5 du5Var3 = this.f373283h;
            if (du5Var3 != null) {
                fVar.i(5, du5Var3.computeSize());
                this.f373283h.writeFields(fVar);
            }
            fVar.e(6, this.f373284i);
            fVar.e(7, this.f373285m);
            java.lang.String str2 = this.f373286n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            fVar.e(9, this.f373287o);
            fVar.e(10, this.f373288p);
            fVar.g(11, 8, linkedList2);
            fVar.g(12, 8, linkedList);
            r45.cu5 cu5Var = this.f373291s;
            if (cu5Var != null) {
                fVar.i(13, cu5Var.computeSize());
                this.f373291s.writeFields(fVar);
            }
            fVar.e(14, this.f373292t);
            fVar.e(15, this.f373293u);
            fVar.h(16, this.f373294v);
            fVar.e(17, this.f373295w);
            fVar.h(18, this.f373296x);
            fVar.e(19, this.f373297y);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f373279d) + 0;
            java.lang.String str3 = this.f373280e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            r45.du5 du5Var4 = this.f373281f;
            if (du5Var4 != null) {
                e17 += b36.f.i(3, du5Var4.computeSize());
            }
            r45.du5 du5Var5 = this.f373282g;
            if (du5Var5 != null) {
                e17 += b36.f.i(4, du5Var5.computeSize());
            }
            r45.du5 du5Var6 = this.f373283h;
            if (du5Var6 != null) {
                e17 += b36.f.i(5, du5Var6.computeSize());
            }
            int e18 = e17 + b36.f.e(6, this.f373284i) + b36.f.e(7, this.f373285m);
            java.lang.String str4 = this.f373286n;
            if (str4 != null) {
                e18 += b36.f.j(8, str4);
            }
            int e19 = e18 + b36.f.e(9, this.f373287o) + b36.f.e(10, this.f373288p) + b36.f.g(11, 8, linkedList2) + b36.f.g(12, 8, linkedList);
            r45.cu5 cu5Var2 = this.f373291s;
            if (cu5Var2 != null) {
                e19 += b36.f.i(13, cu5Var2.computeSize());
            }
            return e19 + b36.f.e(14, this.f373292t) + b36.f.e(15, this.f373293u) + b36.f.h(16, this.f373294v) + b36.f.e(17, this.f373295w) + b36.f.h(18, this.f373296x) + b36.f.e(19, this.f373297y);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.ed edVar = (r45.ed) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                edVar.f373279d = aVar2.g(intValue);
                return 0;
            case 2:
                edVar.f373280e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.du5 du5Var7 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var7.b(bArr2);
                    }
                    edVar.f373281f = du5Var7;
                }
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.du5 du5Var8 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var8.b(bArr3);
                    }
                    edVar.f373282g = du5Var8;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.du5 du5Var9 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var9.b(bArr4);
                    }
                    edVar.f373283h = du5Var9;
                }
                return 0;
            case 6:
                edVar.f373284i = aVar2.g(intValue);
                return 0;
            case 7:
                edVar.f373285m = aVar2.g(intValue);
                return 0;
            case 8:
                edVar.f373286n = aVar2.k(intValue);
                return 0;
            case 9:
                edVar.f373287o = aVar2.g(intValue);
                return 0;
            case 10:
                edVar.f373288p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.du5 du5Var10 = new r45.du5();
                    if (bArr5 != null && bArr5.length > 0) {
                        du5Var10.b(bArr5);
                    }
                    edVar.f373289q.add(du5Var10);
                }
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.eu5 eu5Var = new r45.eu5();
                    if (bArr6 != null && bArr6.length > 0) {
                        eu5Var.b(bArr6);
                    }
                    edVar.f373290r.add(eu5Var);
                }
                return 0;
            case 13:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr7 != null && bArr7.length > 0) {
                        cu5Var3.b(bArr7);
                    }
                    edVar.f373291s = cu5Var3;
                }
                return 0;
            case 14:
                edVar.f373292t = aVar2.g(intValue);
                return 0;
            case 15:
                edVar.f373293u = aVar2.g(intValue);
                return 0;
            case 16:
                edVar.f373294v = aVar2.i(intValue);
                return 0;
            case 17:
                edVar.f373295w = aVar2.g(intValue);
                return 0;
            case 18:
                edVar.f373296x = aVar2.i(intValue);
                return 0;
            case 19:
                edVar.f373297y = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
