package r45;

/* loaded from: classes11.dex */
public class rm extends r45.js5 {
    public r45.am A;
    public r45.qj B;
    public r45.gh0 C;
    public r45.em6 D;
    public r45.tb E;
    public r45.zw6 F;
    public r45.r80 G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public r45.g85 f384990J;
    public r45.ww4 K;

    /* renamed from: d, reason: collision with root package name */
    public r45.y65 f384991d;

    /* renamed from: e, reason: collision with root package name */
    public r45.j9 f384992e;

    /* renamed from: f, reason: collision with root package name */
    public r45.pm f384993f;

    /* renamed from: g, reason: collision with root package name */
    public r45.sd5 f384994g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cz6 f384995h;

    /* renamed from: i, reason: collision with root package name */
    public r45.k5 f384996i;

    /* renamed from: m, reason: collision with root package name */
    public r45.zk5 f384997m;

    /* renamed from: n, reason: collision with root package name */
    public r45.tk4 f384998n;

    /* renamed from: o, reason: collision with root package name */
    public r45.kk f384999o;

    /* renamed from: p, reason: collision with root package name */
    public r45.jm6 f385000p;

    /* renamed from: q, reason: collision with root package name */
    public r45.hl f385001q;

    /* renamed from: r, reason: collision with root package name */
    public r45.sl f385002r;

    /* renamed from: s, reason: collision with root package name */
    public r45.jl f385003s;

    /* renamed from: t, reason: collision with root package name */
    public r45.ev0 f385004t;

    /* renamed from: u, reason: collision with root package name */
    public r45.ul1 f385005u;

    /* renamed from: v, reason: collision with root package name */
    public r45.b43 f385006v;

    /* renamed from: w, reason: collision with root package name */
    public r45.dn f385007w;

    /* renamed from: x, reason: collision with root package name */
    public r45.xn f385008x;

    /* renamed from: y, reason: collision with root package name */
    public r45.hm5 f385009y;

    /* renamed from: z, reason: collision with root package name */
    public r45.bf5 f385010z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rm)) {
            return false;
        }
        r45.rm rmVar = (r45.rm) fVar;
        return n51.f.a(this.BaseResponse, rmVar.BaseResponse) && n51.f.a(this.f384991d, rmVar.f384991d) && n51.f.a(this.f384992e, rmVar.f384992e) && n51.f.a(this.f384993f, rmVar.f384993f) && n51.f.a(this.f384994g, rmVar.f384994g) && n51.f.a(this.f384995h, rmVar.f384995h) && n51.f.a(this.f384996i, rmVar.f384996i) && n51.f.a(this.f384997m, rmVar.f384997m) && n51.f.a(this.f384998n, rmVar.f384998n) && n51.f.a(this.f384999o, rmVar.f384999o) && n51.f.a(this.f385000p, rmVar.f385000p) && n51.f.a(this.f385001q, rmVar.f385001q) && n51.f.a(this.f385002r, rmVar.f385002r) && n51.f.a(this.f385003s, rmVar.f385003s) && n51.f.a(this.f385004t, rmVar.f385004t) && n51.f.a(this.f385005u, rmVar.f385005u) && n51.f.a(this.f385006v, rmVar.f385006v) && n51.f.a(this.f385007w, rmVar.f385007w) && n51.f.a(this.f385008x, rmVar.f385008x) && n51.f.a(this.f385009y, rmVar.f385009y) && n51.f.a(this.f385010z, rmVar.f385010z) && n51.f.a(this.A, rmVar.A) && n51.f.a(this.B, rmVar.B) && n51.f.a(this.C, rmVar.C) && n51.f.a(this.D, rmVar.D) && n51.f.a(this.E, rmVar.E) && n51.f.a(this.F, rmVar.F) && n51.f.a(this.G, rmVar.G) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(rmVar.H)) && n51.f.a(java.lang.Integer.valueOf(this.I), java.lang.Integer.valueOf(rmVar.I)) && n51.f.a(this.f384990J, rmVar.f384990J) && n51.f.a(this.K, rmVar.K);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.y65 y65Var = this.f384991d;
            if (y65Var != null) {
                fVar.i(2, y65Var.computeSize());
                this.f384991d.writeFields(fVar);
            }
            r45.j9 j9Var = this.f384992e;
            if (j9Var != null) {
                fVar.i(3, j9Var.computeSize());
                this.f384992e.writeFields(fVar);
            }
            r45.pm pmVar = this.f384993f;
            if (pmVar != null) {
                fVar.i(4, pmVar.computeSize());
                this.f384993f.writeFields(fVar);
            }
            r45.sd5 sd5Var = this.f384994g;
            if (sd5Var != null) {
                fVar.i(5, sd5Var.computeSize());
                this.f384994g.writeFields(fVar);
            }
            r45.cz6 cz6Var = this.f384995h;
            if (cz6Var != null) {
                fVar.i(6, cz6Var.computeSize());
                this.f384995h.writeFields(fVar);
            }
            r45.k5 k5Var = this.f384996i;
            if (k5Var != null) {
                fVar.i(7, k5Var.computeSize());
                this.f384996i.writeFields(fVar);
            }
            r45.zk5 zk5Var = this.f384997m;
            if (zk5Var != null) {
                fVar.i(8, zk5Var.computeSize());
                this.f384997m.writeFields(fVar);
            }
            r45.tk4 tk4Var = this.f384998n;
            if (tk4Var != null) {
                fVar.i(9, tk4Var.computeSize());
                this.f384998n.writeFields(fVar);
            }
            r45.kk kkVar = this.f384999o;
            if (kkVar != null) {
                fVar.i(10, kkVar.computeSize());
                this.f384999o.writeFields(fVar);
            }
            r45.jm6 jm6Var = this.f385000p;
            if (jm6Var != null) {
                fVar.i(11, jm6Var.computeSize());
                this.f385000p.writeFields(fVar);
            }
            r45.hl hlVar = this.f385001q;
            if (hlVar != null) {
                fVar.i(12, hlVar.computeSize());
                this.f385001q.writeFields(fVar);
            }
            r45.sl slVar = this.f385002r;
            if (slVar != null) {
                fVar.i(13, slVar.computeSize());
                this.f385002r.writeFields(fVar);
            }
            r45.jl jlVar = this.f385003s;
            if (jlVar != null) {
                fVar.i(14, jlVar.computeSize());
                this.f385003s.writeFields(fVar);
            }
            r45.ev0 ev0Var = this.f385004t;
            if (ev0Var != null) {
                fVar.i(15, ev0Var.computeSize());
                this.f385004t.writeFields(fVar);
            }
            r45.ul1 ul1Var = this.f385005u;
            if (ul1Var != null) {
                fVar.i(16, ul1Var.computeSize());
                this.f385005u.writeFields(fVar);
            }
            r45.b43 b43Var = this.f385006v;
            if (b43Var != null) {
                fVar.i(17, b43Var.computeSize());
                this.f385006v.writeFields(fVar);
            }
            r45.dn dnVar = this.f385007w;
            if (dnVar != null) {
                fVar.i(18, dnVar.computeSize());
                this.f385007w.writeFields(fVar);
            }
            r45.xn xnVar = this.f385008x;
            if (xnVar != null) {
                fVar.i(21, xnVar.computeSize());
                this.f385008x.writeFields(fVar);
            }
            r45.hm5 hm5Var = this.f385009y;
            if (hm5Var != null) {
                fVar.i(22, hm5Var.computeSize());
                this.f385009y.writeFields(fVar);
            }
            r45.bf5 bf5Var = this.f385010z;
            if (bf5Var != null) {
                fVar.i(23, bf5Var.computeSize());
                this.f385010z.writeFields(fVar);
            }
            r45.am amVar = this.A;
            if (amVar != null) {
                fVar.i(24, amVar.computeSize());
                this.A.writeFields(fVar);
            }
            r45.qj qjVar = this.B;
            if (qjVar != null) {
                fVar.i(25, qjVar.computeSize());
                this.B.writeFields(fVar);
            }
            r45.gh0 gh0Var = this.C;
            if (gh0Var != null) {
                fVar.i(26, gh0Var.computeSize());
                this.C.writeFields(fVar);
            }
            r45.em6 em6Var = this.D;
            if (em6Var != null) {
                fVar.i(27, em6Var.computeSize());
                this.D.writeFields(fVar);
            }
            r45.tb tbVar = this.E;
            if (tbVar != null) {
                fVar.i(28, tbVar.computeSize());
                this.E.writeFields(fVar);
            }
            r45.zw6 zw6Var = this.F;
            if (zw6Var != null) {
                fVar.i(29, zw6Var.computeSize());
                this.F.writeFields(fVar);
            }
            r45.r80 r80Var = this.G;
            if (r80Var != null) {
                fVar.i(30, r80Var.computeSize());
                this.G.writeFields(fVar);
            }
            fVar.e(31, this.H);
            fVar.e(32, this.I);
            r45.g85 g85Var = this.f384990J;
            if (g85Var != null) {
                fVar.i(33, g85Var.computeSize());
                this.f384990J.writeFields(fVar);
            }
            r45.ww4 ww4Var = this.K;
            if (ww4Var != null) {
                fVar.i(35, ww4Var.computeSize());
                this.K.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0;
            r45.y65 y65Var2 = this.f384991d;
            if (y65Var2 != null) {
                i18 += b36.f.i(2, y65Var2.computeSize());
            }
            r45.j9 j9Var2 = this.f384992e;
            if (j9Var2 != null) {
                i18 += b36.f.i(3, j9Var2.computeSize());
            }
            r45.pm pmVar2 = this.f384993f;
            if (pmVar2 != null) {
                i18 += b36.f.i(4, pmVar2.computeSize());
            }
            r45.sd5 sd5Var2 = this.f384994g;
            if (sd5Var2 != null) {
                i18 += b36.f.i(5, sd5Var2.computeSize());
            }
            r45.cz6 cz6Var2 = this.f384995h;
            if (cz6Var2 != null) {
                i18 += b36.f.i(6, cz6Var2.computeSize());
            }
            r45.k5 k5Var2 = this.f384996i;
            if (k5Var2 != null) {
                i18 += b36.f.i(7, k5Var2.computeSize());
            }
            r45.zk5 zk5Var2 = this.f384997m;
            if (zk5Var2 != null) {
                i18 += b36.f.i(8, zk5Var2.computeSize());
            }
            r45.tk4 tk4Var2 = this.f384998n;
            if (tk4Var2 != null) {
                i18 += b36.f.i(9, tk4Var2.computeSize());
            }
            r45.kk kkVar2 = this.f384999o;
            if (kkVar2 != null) {
                i18 += b36.f.i(10, kkVar2.computeSize());
            }
            r45.jm6 jm6Var2 = this.f385000p;
            if (jm6Var2 != null) {
                i18 += b36.f.i(11, jm6Var2.computeSize());
            }
            r45.hl hlVar2 = this.f385001q;
            if (hlVar2 != null) {
                i18 += b36.f.i(12, hlVar2.computeSize());
            }
            r45.sl slVar2 = this.f385002r;
            if (slVar2 != null) {
                i18 += b36.f.i(13, slVar2.computeSize());
            }
            r45.jl jlVar2 = this.f385003s;
            if (jlVar2 != null) {
                i18 += b36.f.i(14, jlVar2.computeSize());
            }
            r45.ev0 ev0Var2 = this.f385004t;
            if (ev0Var2 != null) {
                i18 += b36.f.i(15, ev0Var2.computeSize());
            }
            r45.ul1 ul1Var2 = this.f385005u;
            if (ul1Var2 != null) {
                i18 += b36.f.i(16, ul1Var2.computeSize());
            }
            r45.b43 b43Var2 = this.f385006v;
            if (b43Var2 != null) {
                i18 += b36.f.i(17, b43Var2.computeSize());
            }
            r45.dn dnVar2 = this.f385007w;
            if (dnVar2 != null) {
                i18 += b36.f.i(18, dnVar2.computeSize());
            }
            r45.xn xnVar2 = this.f385008x;
            if (xnVar2 != null) {
                i18 += b36.f.i(21, xnVar2.computeSize());
            }
            r45.hm5 hm5Var2 = this.f385009y;
            if (hm5Var2 != null) {
                i18 += b36.f.i(22, hm5Var2.computeSize());
            }
            r45.bf5 bf5Var2 = this.f385010z;
            if (bf5Var2 != null) {
                i18 += b36.f.i(23, bf5Var2.computeSize());
            }
            r45.am amVar2 = this.A;
            if (amVar2 != null) {
                i18 += b36.f.i(24, amVar2.computeSize());
            }
            r45.qj qjVar2 = this.B;
            if (qjVar2 != null) {
                i18 += b36.f.i(25, qjVar2.computeSize());
            }
            r45.gh0 gh0Var2 = this.C;
            if (gh0Var2 != null) {
                i18 += b36.f.i(26, gh0Var2.computeSize());
            }
            r45.em6 em6Var2 = this.D;
            if (em6Var2 != null) {
                i18 += b36.f.i(27, em6Var2.computeSize());
            }
            r45.tb tbVar2 = this.E;
            if (tbVar2 != null) {
                i18 += b36.f.i(28, tbVar2.computeSize());
            }
            r45.zw6 zw6Var2 = this.F;
            if (zw6Var2 != null) {
                i18 += b36.f.i(29, zw6Var2.computeSize());
            }
            r45.r80 r80Var2 = this.G;
            if (r80Var2 != null) {
                i18 += b36.f.i(30, r80Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(31, this.H) + b36.f.e(32, this.I);
            r45.g85 g85Var2 = this.f384990J;
            if (g85Var2 != null) {
                e17 += b36.f.i(33, g85Var2.computeSize());
            }
            r45.ww4 ww4Var2 = this.K;
            return ww4Var2 != null ? e17 + b36.f.i(35, ww4Var2.computeSize()) : e17;
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
        r45.rm rmVar = (r45.rm) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    rmVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.y65 y65Var3 = new r45.y65();
                    if (bArr2 != null && bArr2.length > 0) {
                        y65Var3.parseFrom(bArr2);
                    }
                    rmVar.f384991d = y65Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.j9 j9Var3 = new r45.j9();
                    if (bArr3 != null && bArr3.length > 0) {
                        j9Var3.parseFrom(bArr3);
                    }
                    rmVar.f384992e = j9Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.pm pmVar3 = new r45.pm();
                    if (bArr4 != null && bArr4.length > 0) {
                        pmVar3.parseFrom(bArr4);
                    }
                    rmVar.f384993f = pmVar3;
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.sd5 sd5Var3 = new r45.sd5();
                    if (bArr5 != null && bArr5.length > 0) {
                        sd5Var3.parseFrom(bArr5);
                    }
                    rmVar.f384994g = sd5Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.cz6 cz6Var3 = new r45.cz6();
                    if (bArr6 != null && bArr6.length > 0) {
                        cz6Var3.parseFrom(bArr6);
                    }
                    rmVar.f384995h = cz6Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.k5 k5Var3 = new r45.k5();
                    if (bArr7 != null && bArr7.length > 0) {
                        k5Var3.parseFrom(bArr7);
                    }
                    rmVar.f384996i = k5Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    r45.zk5 zk5Var3 = new r45.zk5();
                    if (bArr8 != null && bArr8.length > 0) {
                        zk5Var3.parseFrom(bArr8);
                    }
                    rmVar.f384997m = zk5Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    r45.tk4 tk4Var3 = new r45.tk4();
                    if (bArr9 != null && bArr9.length > 0) {
                        tk4Var3.parseFrom(bArr9);
                    }
                    rmVar.f384998n = tk4Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    r45.kk kkVar3 = new r45.kk();
                    if (bArr10 != null && bArr10.length > 0) {
                        kkVar3.parseFrom(bArr10);
                    }
                    rmVar.f384999o = kkVar3;
                }
                return 0;
            case 11:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    r45.jm6 jm6Var3 = new r45.jm6();
                    if (bArr11 != null && bArr11.length > 0) {
                        jm6Var3.parseFrom(bArr11);
                    }
                    rmVar.f385000p = jm6Var3;
                }
                return 0;
            case 12:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    r45.hl hlVar3 = new r45.hl();
                    if (bArr12 != null && bArr12.length > 0) {
                        hlVar3.parseFrom(bArr12);
                    }
                    rmVar.f385001q = hlVar3;
                }
                return 0;
            case 13:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr13 = (byte[]) j57.get(i59);
                    r45.sl slVar3 = new r45.sl();
                    if (bArr13 != null && bArr13.length > 0) {
                        slVar3.parseFrom(bArr13);
                    }
                    rmVar.f385002r = slVar3;
                }
                return 0;
            case 14:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr14 = (byte[]) j58.get(i66);
                    r45.jl jlVar3 = new r45.jl();
                    if (bArr14 != null && bArr14.length > 0) {
                        jlVar3.parseFrom(bArr14);
                    }
                    rmVar.f385003s = jlVar3;
                }
                return 0;
            case 15:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i67 = 0; i67 < size15; i67++) {
                    byte[] bArr15 = (byte[]) j59.get(i67);
                    r45.ev0 ev0Var3 = new r45.ev0();
                    if (bArr15 != null && bArr15.length > 0) {
                        ev0Var3.parseFrom(bArr15);
                    }
                    rmVar.f385004t = ev0Var3;
                }
                return 0;
            case 16:
                java.util.LinkedList j66 = aVar2.j(intValue);
                int size16 = j66.size();
                for (int i68 = 0; i68 < size16; i68++) {
                    byte[] bArr16 = (byte[]) j66.get(i68);
                    r45.ul1 ul1Var3 = new r45.ul1();
                    if (bArr16 != null && bArr16.length > 0) {
                        ul1Var3.parseFrom(bArr16);
                    }
                    rmVar.f385005u = ul1Var3;
                }
                return 0;
            case 17:
                java.util.LinkedList j67 = aVar2.j(intValue);
                int size17 = j67.size();
                for (int i69 = 0; i69 < size17; i69++) {
                    byte[] bArr17 = (byte[]) j67.get(i69);
                    r45.b43 b43Var3 = new r45.b43();
                    if (bArr17 != null && bArr17.length > 0) {
                        b43Var3.parseFrom(bArr17);
                    }
                    rmVar.f385006v = b43Var3;
                }
                return 0;
            case 18:
                java.util.LinkedList j68 = aVar2.j(intValue);
                int size18 = j68.size();
                for (int i76 = 0; i76 < size18; i76++) {
                    byte[] bArr18 = (byte[]) j68.get(i76);
                    r45.dn dnVar3 = new r45.dn();
                    if (bArr18 != null && bArr18.length > 0) {
                        dnVar3.parseFrom(bArr18);
                    }
                    rmVar.f385007w = dnVar3;
                }
                return 0;
            case 19:
            case 20:
            case 34:
            default:
                return -1;
            case 21:
                java.util.LinkedList j69 = aVar2.j(intValue);
                int size19 = j69.size();
                for (int i77 = 0; i77 < size19; i77++) {
                    byte[] bArr19 = (byte[]) j69.get(i77);
                    r45.xn xnVar3 = new r45.xn();
                    if (bArr19 != null && bArr19.length > 0) {
                        xnVar3.parseFrom(bArr19);
                    }
                    rmVar.f385008x = xnVar3;
                }
                return 0;
            case 22:
                java.util.LinkedList j76 = aVar2.j(intValue);
                int size20 = j76.size();
                for (int i78 = 0; i78 < size20; i78++) {
                    byte[] bArr20 = (byte[]) j76.get(i78);
                    r45.hm5 hm5Var3 = new r45.hm5();
                    if (bArr20 != null && bArr20.length > 0) {
                        hm5Var3.parseFrom(bArr20);
                    }
                    rmVar.f385009y = hm5Var3;
                }
                return 0;
            case 23:
                java.util.LinkedList j77 = aVar2.j(intValue);
                int size21 = j77.size();
                for (int i79 = 0; i79 < size21; i79++) {
                    byte[] bArr21 = (byte[]) j77.get(i79);
                    r45.bf5 bf5Var3 = new r45.bf5();
                    if (bArr21 != null && bArr21.length > 0) {
                        bf5Var3.parseFrom(bArr21);
                    }
                    rmVar.f385010z = bf5Var3;
                }
                return 0;
            case 24:
                java.util.LinkedList j78 = aVar2.j(intValue);
                int size22 = j78.size();
                for (int i86 = 0; i86 < size22; i86++) {
                    byte[] bArr22 = (byte[]) j78.get(i86);
                    r45.am amVar3 = new r45.am();
                    if (bArr22 != null && bArr22.length > 0) {
                        amVar3.parseFrom(bArr22);
                    }
                    rmVar.A = amVar3;
                }
                return 0;
            case 25:
                java.util.LinkedList j79 = aVar2.j(intValue);
                int size23 = j79.size();
                for (int i87 = 0; i87 < size23; i87++) {
                    byte[] bArr23 = (byte[]) j79.get(i87);
                    r45.qj qjVar3 = new r45.qj();
                    if (bArr23 != null && bArr23.length > 0) {
                        qjVar3.parseFrom(bArr23);
                    }
                    rmVar.B = qjVar3;
                }
                return 0;
            case 26:
                java.util.LinkedList j86 = aVar2.j(intValue);
                int size24 = j86.size();
                for (int i88 = 0; i88 < size24; i88++) {
                    byte[] bArr24 = (byte[]) j86.get(i88);
                    r45.gh0 gh0Var3 = new r45.gh0();
                    if (bArr24 != null && bArr24.length > 0) {
                        gh0Var3.parseFrom(bArr24);
                    }
                    rmVar.C = gh0Var3;
                }
                return 0;
            case 27:
                java.util.LinkedList j87 = aVar2.j(intValue);
                int size25 = j87.size();
                for (int i89 = 0; i89 < size25; i89++) {
                    byte[] bArr25 = (byte[]) j87.get(i89);
                    r45.em6 em6Var3 = new r45.em6();
                    if (bArr25 != null && bArr25.length > 0) {
                        em6Var3.parseFrom(bArr25);
                    }
                    rmVar.D = em6Var3;
                }
                return 0;
            case 28:
                java.util.LinkedList j88 = aVar2.j(intValue);
                int size26 = j88.size();
                for (int i96 = 0; i96 < size26; i96++) {
                    byte[] bArr26 = (byte[]) j88.get(i96);
                    r45.tb tbVar3 = new r45.tb();
                    if (bArr26 != null && bArr26.length > 0) {
                        tbVar3.parseFrom(bArr26);
                    }
                    rmVar.E = tbVar3;
                }
                return 0;
            case 29:
                java.util.LinkedList j89 = aVar2.j(intValue);
                int size27 = j89.size();
                for (int i97 = 0; i97 < size27; i97++) {
                    byte[] bArr27 = (byte[]) j89.get(i97);
                    r45.zw6 zw6Var3 = new r45.zw6();
                    if (bArr27 != null && bArr27.length > 0) {
                        zw6Var3.parseFrom(bArr27);
                    }
                    rmVar.F = zw6Var3;
                }
                return 0;
            case 30:
                java.util.LinkedList j96 = aVar2.j(intValue);
                int size28 = j96.size();
                for (int i98 = 0; i98 < size28; i98++) {
                    byte[] bArr28 = (byte[]) j96.get(i98);
                    r45.r80 r80Var3 = new r45.r80();
                    if (bArr28 != null && bArr28.length > 0) {
                        r80Var3.parseFrom(bArr28);
                    }
                    rmVar.G = r80Var3;
                }
                return 0;
            case 31:
                rmVar.H = aVar2.g(intValue);
                return 0;
            case 32:
                rmVar.I = aVar2.g(intValue);
                return 0;
            case 33:
                java.util.LinkedList j97 = aVar2.j(intValue);
                int size29 = j97.size();
                for (int i99 = 0; i99 < size29; i99++) {
                    byte[] bArr29 = (byte[]) j97.get(i99);
                    r45.g85 g85Var3 = new r45.g85();
                    if (bArr29 != null && bArr29.length > 0) {
                        g85Var3.parseFrom(bArr29);
                    }
                    rmVar.f384990J = g85Var3;
                }
                return 0;
            case 35:
                java.util.LinkedList j98 = aVar2.j(intValue);
                int size30 = j98.size();
                for (int i100 = 0; i100 < size30; i100++) {
                    byte[] bArr30 = (byte[]) j98.get(i100);
                    r45.ww4 ww4Var3 = new r45.ww4();
                    if (bArr30 != null && bArr30.length > 0) {
                        ww4Var3.parseFrom(bArr30);
                    }
                    rmVar.K = ww4Var3;
                }
                return 0;
        }
    }
}
