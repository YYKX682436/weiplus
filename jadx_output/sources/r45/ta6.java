package r45;

/* loaded from: classes4.dex */
public class ta6 extends r45.mr5 {
    public int A;
    public int B;
    public int D;
    public int E;
    public r45.cu5 F;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386239d;

    /* renamed from: e, reason: collision with root package name */
    public long f386240e;

    /* renamed from: f, reason: collision with root package name */
    public long f386241f;

    /* renamed from: g, reason: collision with root package name */
    public int f386242g;

    /* renamed from: h, reason: collision with root package name */
    public long f386243h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cu5 f386244i;

    /* renamed from: m, reason: collision with root package name */
    public int f386245m;

    /* renamed from: n, reason: collision with root package name */
    public int f386246n;

    /* renamed from: p, reason: collision with root package name */
    public int f386248p;

    /* renamed from: q, reason: collision with root package name */
    public int f386249q;

    /* renamed from: r, reason: collision with root package name */
    public long f386250r;

    /* renamed from: s, reason: collision with root package name */
    public long f386251s;

    /* renamed from: t, reason: collision with root package name */
    public long f386252t;

    /* renamed from: u, reason: collision with root package name */
    public int f386253u;

    /* renamed from: v, reason: collision with root package name */
    public long f386254v;

    /* renamed from: w, reason: collision with root package name */
    public r45.cu5 f386255w;

    /* renamed from: x, reason: collision with root package name */
    public int f386256x;

    /* renamed from: z, reason: collision with root package name */
    public long f386258z;

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f386247o = new java.util.LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public java.util.LinkedList f386257y = new java.util.LinkedList();
    public java.util.LinkedList C = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ta6)) {
            return false;
        }
        r45.ta6 ta6Var = (r45.ta6) fVar;
        return n51.f.a(this.BaseRequest, ta6Var.BaseRequest) && n51.f.a(this.f386239d, ta6Var.f386239d) && n51.f.a(java.lang.Long.valueOf(this.f386240e), java.lang.Long.valueOf(ta6Var.f386240e)) && n51.f.a(java.lang.Long.valueOf(this.f386241f), java.lang.Long.valueOf(ta6Var.f386241f)) && n51.f.a(java.lang.Integer.valueOf(this.f386242g), java.lang.Integer.valueOf(ta6Var.f386242g)) && n51.f.a(java.lang.Long.valueOf(this.f386243h), java.lang.Long.valueOf(ta6Var.f386243h)) && n51.f.a(this.f386244i, ta6Var.f386244i) && n51.f.a(java.lang.Integer.valueOf(this.f386245m), java.lang.Integer.valueOf(ta6Var.f386245m)) && n51.f.a(java.lang.Integer.valueOf(this.f386246n), java.lang.Integer.valueOf(ta6Var.f386246n)) && n51.f.a(this.f386247o, ta6Var.f386247o) && n51.f.a(java.lang.Integer.valueOf(this.f386248p), java.lang.Integer.valueOf(ta6Var.f386248p)) && n51.f.a(java.lang.Integer.valueOf(this.f386249q), java.lang.Integer.valueOf(ta6Var.f386249q)) && n51.f.a(java.lang.Long.valueOf(this.f386250r), java.lang.Long.valueOf(ta6Var.f386250r)) && n51.f.a(java.lang.Long.valueOf(this.f386251s), java.lang.Long.valueOf(ta6Var.f386251s)) && n51.f.a(java.lang.Long.valueOf(this.f386252t), java.lang.Long.valueOf(ta6Var.f386252t)) && n51.f.a(java.lang.Integer.valueOf(this.f386253u), java.lang.Integer.valueOf(ta6Var.f386253u)) && n51.f.a(java.lang.Long.valueOf(this.f386254v), java.lang.Long.valueOf(ta6Var.f386254v)) && n51.f.a(this.f386255w, ta6Var.f386255w) && n51.f.a(java.lang.Integer.valueOf(this.f386256x), java.lang.Integer.valueOf(ta6Var.f386256x)) && n51.f.a(this.f386257y, ta6Var.f386257y) && n51.f.a(java.lang.Long.valueOf(this.f386258z), java.lang.Long.valueOf(ta6Var.f386258z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(ta6Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(ta6Var.B)) && n51.f.a(this.C, ta6Var.C) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(ta6Var.D)) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(ta6Var.E)) && n51.f.a(this.F, ta6Var.F);
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
            java.lang.String str = this.f386239d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f386240e);
            fVar.h(4, this.f386241f);
            fVar.e(5, this.f386242g);
            fVar.h(6, this.f386243h);
            r45.cu5 cu5Var = this.f386244i;
            if (cu5Var != null) {
                fVar.i(7, cu5Var.computeSize());
                this.f386244i.writeFields(fVar);
            }
            fVar.e(8, this.f386245m);
            fVar.e(11, this.f386246n);
            fVar.k(12, 3, this.f386247o);
            fVar.e(13, this.f386248p);
            fVar.e(14, this.f386249q);
            fVar.h(15, this.f386250r);
            fVar.h(16, this.f386251s);
            fVar.h(17, this.f386252t);
            fVar.e(18, this.f386253u);
            fVar.h(19, this.f386254v);
            r45.cu5 cu5Var2 = this.f386255w;
            if (cu5Var2 != null) {
                fVar.i(20, cu5Var2.computeSize());
                this.f386255w.writeFields(fVar);
            }
            fVar.e(21, this.f386256x);
            fVar.k(22, 3, this.f386257y);
            fVar.h(23, this.f386258z);
            fVar.e(24, this.A);
            fVar.e(25, this.B);
            fVar.g(26, 8, this.C);
            fVar.e(27, this.D);
            fVar.e(28, this.E);
            r45.cu5 cu5Var3 = this.F;
            if (cu5Var3 == null) {
                return 0;
            }
            fVar.i(29, cu5Var3.computeSize());
            this.F.writeFields(fVar);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f386239d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int h17 = i18 + b36.f.h(3, this.f386240e) + b36.f.h(4, this.f386241f) + b36.f.e(5, this.f386242g) + b36.f.h(6, this.f386243h);
            r45.cu5 cu5Var4 = this.f386244i;
            if (cu5Var4 != null) {
                h17 += b36.f.i(7, cu5Var4.computeSize());
            }
            int e17 = h17 + b36.f.e(8, this.f386245m) + b36.f.e(11, this.f386246n) + b36.f.k(12, 3, this.f386247o) + b36.f.e(13, this.f386248p) + b36.f.e(14, this.f386249q) + b36.f.h(15, this.f386250r) + b36.f.h(16, this.f386251s) + b36.f.h(17, this.f386252t) + b36.f.e(18, this.f386253u) + b36.f.h(19, this.f386254v);
            r45.cu5 cu5Var5 = this.f386255w;
            if (cu5Var5 != null) {
                e17 += b36.f.i(20, cu5Var5.computeSize());
            }
            int e18 = e17 + b36.f.e(21, this.f386256x) + b36.f.k(22, 3, this.f386257y) + b36.f.h(23, this.f386258z) + b36.f.e(24, this.A) + b36.f.e(25, this.B) + b36.f.g(26, 8, this.C) + b36.f.e(27, this.D) + b36.f.e(28, this.E);
            r45.cu5 cu5Var6 = this.F;
            return cu5Var6 != null ? e18 + b36.f.i(29, cu5Var6.computeSize()) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f386247o.clear();
            this.f386257y.clear();
            this.C.clear();
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
        r45.ta6 ta6Var = (r45.ta6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    ta6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                ta6Var.f386239d = aVar2.k(intValue);
                return 0;
            case 3:
                ta6Var.f386240e = aVar2.i(intValue);
                return 0;
            case 4:
                ta6Var.f386241f = aVar2.i(intValue);
                return 0;
            case 5:
                ta6Var.f386242g = aVar2.g(intValue);
                return 0;
            case 6:
                ta6Var.f386243h = aVar2.i(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var7 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var7.b(bArr3);
                    }
                    ta6Var.f386244i = cu5Var7;
                }
                return 0;
            case 8:
                ta6Var.f386245m = aVar2.g(intValue);
                return 0;
            case 9:
            case 10:
            default:
                return -1;
            case 11:
                ta6Var.f386246n = aVar2.g(intValue);
                return 0;
            case 12:
                byte[] bArr4 = aVar2.d(intValue).f192156a;
                d36.b unknownTagHandler = com.tencent.mm.protobuf.f.unknownTagHandler;
                kotlin.jvm.internal.o.g(unknownTagHandler, "unknownTagHandler");
                e36.a aVar3 = new e36.a(bArr4, 0, bArr4.length);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                while (aVar3.f247596c < aVar3.f247595b) {
                    linkedList.add(java.lang.Long.valueOf(aVar3.g()));
                }
                ta6Var.f386247o = linkedList;
                return 0;
            case 13:
                ta6Var.f386248p = aVar2.g(intValue);
                return 0;
            case 14:
                ta6Var.f386249q = aVar2.g(intValue);
                return 0;
            case 15:
                ta6Var.f386250r = aVar2.i(intValue);
                return 0;
            case 16:
                ta6Var.f386251s = aVar2.i(intValue);
                return 0;
            case 17:
                ta6Var.f386252t = aVar2.i(intValue);
                return 0;
            case 18:
                ta6Var.f386253u = aVar2.g(intValue);
                return 0;
            case 19:
                ta6Var.f386254v = aVar2.i(intValue);
                return 0;
            case 20:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr5 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var8 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var8.b(bArr5);
                    }
                    ta6Var.f386255w = cu5Var8;
                }
                return 0;
            case 21:
                ta6Var.f386256x = aVar2.g(intValue);
                return 0;
            case 22:
                byte[] bArr6 = aVar2.d(intValue).f192156a;
                d36.b unknownTagHandler2 = com.tencent.mm.protobuf.f.unknownTagHandler;
                kotlin.jvm.internal.o.g(unknownTagHandler2, "unknownTagHandler");
                e36.a aVar4 = new e36.a(bArr6, 0, bArr6.length);
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                while (aVar4.f247596c < aVar4.f247595b) {
                    linkedList2.add(java.lang.Long.valueOf(aVar4.g()));
                }
                ta6Var.f386257y = linkedList2;
                return 0;
            case 23:
                ta6Var.f386258z = aVar2.i(intValue);
                return 0;
            case 24:
                ta6Var.A = aVar2.g(intValue);
                return 0;
            case 25:
                ta6Var.B = aVar2.g(intValue);
                return 0;
            case 26:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr7 = (byte[]) j27.get(i29);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr7 != null && bArr7.length > 0) {
                        du5Var.b(bArr7);
                    }
                    ta6Var.C.add(du5Var);
                }
                return 0;
            case 27:
                ta6Var.D = aVar2.g(intValue);
                return 0;
            case 28:
                ta6Var.E = aVar2.g(intValue);
                return 0;
            case 29:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr8 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var9 = new r45.cu5();
                    if (bArr8 != null && bArr8.length > 0) {
                        cu5Var9.b(bArr8);
                    }
                    ta6Var.F = cu5Var9;
                }
                return 0;
        }
    }
}
