package p33;

/* loaded from: classes8.dex */
public class e0 extends com.tencent.mm.protobuf.f {
    public boolean B;
    public p33.g0 C;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f351537d;

    /* renamed from: e, reason: collision with root package name */
    public long f351538e;

    /* renamed from: f, reason: collision with root package name */
    public p33.k f351539f;

    /* renamed from: g, reason: collision with root package name */
    public p33.f0 f351540g;

    /* renamed from: i, reason: collision with root package name */
    public p33.j f351542i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f351543m;

    /* renamed from: n, reason: collision with root package name */
    public p33.d0 f351544n;

    /* renamed from: p, reason: collision with root package name */
    public int f351546p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f351547q;

    /* renamed from: r, reason: collision with root package name */
    public int f351548r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f351549s;

    /* renamed from: t, reason: collision with root package name */
    public p33.v f351550t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f351552v;

    /* renamed from: w, reason: collision with root package name */
    public int f351553w;

    /* renamed from: x, reason: collision with root package name */
    public p33.e f351554x;

    /* renamed from: y, reason: collision with root package name */
    public p33.t f351555y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f351556z;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f351541h = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f351545o = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f351551u = new java.util.LinkedList();
    public boolean A = false;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p33.e0)) {
            return false;
        }
        p33.e0 e0Var = (p33.e0) fVar;
        return n51.f.a(this.f351537d, e0Var.f351537d) && n51.f.a(java.lang.Long.valueOf(this.f351538e), java.lang.Long.valueOf(e0Var.f351538e)) && n51.f.a(this.f351539f, e0Var.f351539f) && n51.f.a(this.f351540g, e0Var.f351540g) && n51.f.a(this.f351541h, e0Var.f351541h) && n51.f.a(this.f351542i, e0Var.f351542i) && n51.f.a(java.lang.Boolean.valueOf(this.f351543m), java.lang.Boolean.valueOf(e0Var.f351543m)) && n51.f.a(this.f351544n, e0Var.f351544n) && n51.f.a(this.f351545o, e0Var.f351545o) && n51.f.a(java.lang.Integer.valueOf(this.f351546p), java.lang.Integer.valueOf(e0Var.f351546p)) && n51.f.a(this.f351547q, e0Var.f351547q) && n51.f.a(java.lang.Integer.valueOf(this.f351548r), java.lang.Integer.valueOf(e0Var.f351548r)) && n51.f.a(this.f351549s, e0Var.f351549s) && n51.f.a(this.f351550t, e0Var.f351550t) && n51.f.a(this.f351551u, e0Var.f351551u) && n51.f.a(java.lang.Boolean.valueOf(this.f351552v), java.lang.Boolean.valueOf(e0Var.f351552v)) && n51.f.a(java.lang.Integer.valueOf(this.f351553w), java.lang.Integer.valueOf(e0Var.f351553w)) && n51.f.a(this.f351554x, e0Var.f351554x) && n51.f.a(this.f351555y, e0Var.f351555y) && n51.f.a(java.lang.Boolean.valueOf(this.f351556z), java.lang.Boolean.valueOf(e0Var.f351556z)) && n51.f.a(java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(e0Var.A)) && n51.f.a(java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(e0Var.B)) && n51.f.a(this.C, e0Var.C);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f351551u;
        java.util.LinkedList linkedList2 = this.f351545o;
        java.util.LinkedList linkedList3 = this.f351541h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f351537d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f351538e);
            p33.k kVar = this.f351539f;
            if (kVar != null) {
                fVar.i(3, kVar.computeSize());
                this.f351539f.writeFields(fVar);
            }
            p33.f0 f0Var = this.f351540g;
            if (f0Var != null) {
                fVar.i(4, f0Var.computeSize());
                this.f351540g.writeFields(fVar);
            }
            fVar.g(5, 8, linkedList3);
            p33.j jVar = this.f351542i;
            if (jVar != null) {
                fVar.i(6, jVar.computeSize());
                this.f351542i.writeFields(fVar);
            }
            fVar.a(7, this.f351543m);
            p33.d0 d0Var = this.f351544n;
            if (d0Var != null) {
                fVar.i(8, d0Var.computeSize());
                this.f351544n.writeFields(fVar);
            }
            fVar.g(9, 8, linkedList2);
            fVar.e(10, this.f351546p);
            java.lang.String str2 = this.f351547q;
            if (str2 != null) {
                fVar.j(11, str2);
            }
            fVar.e(12, this.f351548r);
            java.lang.String str3 = this.f351549s;
            if (str3 != null) {
                fVar.j(13, str3);
            }
            p33.v vVar = this.f351550t;
            if (vVar != null) {
                fVar.i(14, vVar.computeSize());
                this.f351550t.writeFields(fVar);
            }
            fVar.g(15, 1, linkedList);
            fVar.a(16, this.f351552v);
            fVar.e(17, this.f351553w);
            p33.e eVar = this.f351554x;
            if (eVar != null) {
                fVar.i(18, eVar.computeSize());
                this.f351554x.writeFields(fVar);
            }
            p33.t tVar = this.f351555y;
            if (tVar != null) {
                fVar.i(19, tVar.computeSize());
                this.f351555y.writeFields(fVar);
            }
            fVar.a(20, this.f351556z);
            fVar.a(21, this.A);
            fVar.a(22, this.B);
            p33.g0 g0Var = this.C;
            if (g0Var != null) {
                fVar.i(23, g0Var.computeSize());
                this.C.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f351537d;
            int j17 = (str4 != null ? b36.f.j(1, str4) + 0 : 0) + b36.f.h(2, this.f351538e);
            p33.k kVar2 = this.f351539f;
            if (kVar2 != null) {
                j17 += b36.f.i(3, kVar2.computeSize());
            }
            p33.f0 f0Var2 = this.f351540g;
            if (f0Var2 != null) {
                j17 += b36.f.i(4, f0Var2.computeSize());
            }
            int g17 = j17 + b36.f.g(5, 8, linkedList3);
            p33.j jVar2 = this.f351542i;
            if (jVar2 != null) {
                g17 += b36.f.i(6, jVar2.computeSize());
            }
            int a17 = g17 + b36.f.a(7, this.f351543m);
            p33.d0 d0Var2 = this.f351544n;
            if (d0Var2 != null) {
                a17 += b36.f.i(8, d0Var2.computeSize());
            }
            int g18 = a17 + b36.f.g(9, 8, linkedList2) + b36.f.e(10, this.f351546p);
            java.lang.String str5 = this.f351547q;
            if (str5 != null) {
                g18 += b36.f.j(11, str5);
            }
            int e17 = g18 + b36.f.e(12, this.f351548r);
            java.lang.String str6 = this.f351549s;
            if (str6 != null) {
                e17 += b36.f.j(13, str6);
            }
            p33.v vVar2 = this.f351550t;
            if (vVar2 != null) {
                e17 += b36.f.i(14, vVar2.computeSize());
            }
            int g19 = e17 + b36.f.g(15, 1, linkedList) + b36.f.a(16, this.f351552v) + b36.f.e(17, this.f351553w);
            p33.e eVar2 = this.f351554x;
            if (eVar2 != null) {
                g19 += b36.f.i(18, eVar2.computeSize());
            }
            p33.t tVar2 = this.f351555y;
            if (tVar2 != null) {
                g19 += b36.f.i(19, tVar2.computeSize());
            }
            int a18 = g19 + b36.f.a(20, this.f351556z) + b36.f.a(21, this.A) + b36.f.a(22, this.B);
            p33.g0 g0Var2 = this.C;
            return g0Var2 != null ? a18 + b36.f.i(23, g0Var2.computeSize()) : a18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
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
        p33.e0 e0Var = (p33.e0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                e0Var.f351537d = aVar2.k(intValue);
                return 0;
            case 2:
                e0Var.f351538e = aVar2.i(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    p33.k kVar3 = new p33.k();
                    if (bArr2 != null && bArr2.length > 0) {
                        kVar3.parseFrom(bArr2);
                    }
                    e0Var.f351539f = kVar3;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    p33.f0 f0Var3 = new p33.f0();
                    if (bArr3 != null && bArr3.length > 0) {
                        f0Var3.parseFrom(bArr3);
                    }
                    e0Var.f351540g = f0Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    p33.c0 c0Var = new p33.c0();
                    if (bArr4 != null && bArr4.length > 0) {
                        c0Var.parseFrom(bArr4);
                    }
                    e0Var.f351541h.add(c0Var);
                }
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    p33.j jVar3 = new p33.j();
                    if (bArr5 != null && bArr5.length > 0) {
                        jVar3.parseFrom(bArr5);
                    }
                    e0Var.f351542i = jVar3;
                }
                return 0;
            case 7:
                e0Var.f351543m = aVar2.c(intValue);
                return 0;
            case 8:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j29.get(i29);
                    p33.d0 d0Var3 = new p33.d0();
                    if (bArr6 != null && bArr6.length > 0) {
                        d0Var3.parseFrom(bArr6);
                    }
                    e0Var.f351544n = d0Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size6 = j37.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j37.get(i37);
                    p33.d0 d0Var4 = new p33.d0();
                    if (bArr7 != null && bArr7.length > 0) {
                        d0Var4.parseFrom(bArr7);
                    }
                    e0Var.f351545o.add(d0Var4);
                }
                return 0;
            case 10:
                e0Var.f351546p = aVar2.g(intValue);
                return 0;
            case 11:
                e0Var.f351547q = aVar2.k(intValue);
                return 0;
            case 12:
                e0Var.f351548r = aVar2.g(intValue);
                return 0;
            case 13:
                e0Var.f351549s = aVar2.k(intValue);
                return 0;
            case 14:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size7 = j38.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j38.get(i38);
                    p33.v vVar3 = new p33.v();
                    if (bArr8 != null && bArr8.length > 0) {
                        vVar3.parseFrom(bArr8);
                    }
                    e0Var.f351550t = vVar3;
                }
                return 0;
            case 15:
                e0Var.f351551u.add(aVar2.k(intValue));
                return 0;
            case 16:
                e0Var.f351552v = aVar2.c(intValue);
                return 0;
            case 17:
                e0Var.f351553w = aVar2.g(intValue);
                return 0;
            case 18:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size8 = j39.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr9 = (byte[]) j39.get(i39);
                    p33.e eVar3 = new p33.e();
                    if (bArr9 != null && bArr9.length > 0) {
                        eVar3.parseFrom(bArr9);
                    }
                    e0Var.f351554x = eVar3;
                }
                return 0;
            case 19:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size9 = j47.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr10 = (byte[]) j47.get(i47);
                    p33.t tVar3 = new p33.t();
                    if (bArr10 != null && bArr10.length > 0) {
                        tVar3.parseFrom(bArr10);
                    }
                    e0Var.f351555y = tVar3;
                }
                return 0;
            case 20:
                e0Var.f351556z = aVar2.c(intValue);
                return 0;
            case 21:
                e0Var.A = aVar2.c(intValue);
                return 0;
            case 22:
                e0Var.B = aVar2.c(intValue);
                return 0;
            case 23:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size10 = j48.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr11 = (byte[]) j48.get(i48);
                    p33.g0 g0Var3 = new p33.g0();
                    if (bArr11 != null && bArr11.length > 0) {
                        g0Var3.parseFrom(bArr11);
                    }
                    e0Var.C = g0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
