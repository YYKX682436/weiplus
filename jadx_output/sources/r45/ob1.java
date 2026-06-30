package r45;

/* loaded from: classes2.dex */
public class ob1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f382110d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382111e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f382112f;

    /* renamed from: g, reason: collision with root package name */
    public r45.o23 f382113g;

    /* renamed from: h, reason: collision with root package name */
    public r45.yx0 f382114h;

    /* renamed from: i, reason: collision with root package name */
    public int f382115i;

    /* renamed from: m, reason: collision with root package name */
    public r45.yr2 f382116m;

    /* renamed from: n, reason: collision with root package name */
    public r45.gj2 f382117n;

    /* renamed from: o, reason: collision with root package name */
    public r45.aj2 f382118o;

    /* renamed from: p, reason: collision with root package name */
    public r45.pz2 f382119p;

    /* renamed from: q, reason: collision with root package name */
    public r45.h72 f382120q;

    /* renamed from: r, reason: collision with root package name */
    public r45.mg2 f382121r;

    /* renamed from: s, reason: collision with root package name */
    public r45.kk2 f382122s;

    /* renamed from: t, reason: collision with root package name */
    public r45.tu0 f382123t;

    /* renamed from: u, reason: collision with root package name */
    public r45.u11 f382124u;

    /* renamed from: v, reason: collision with root package name */
    public r45.vj6 f382125v;

    /* renamed from: w, reason: collision with root package name */
    public int f382126w;

    /* renamed from: x, reason: collision with root package name */
    public r45.eo2 f382127x;

    /* renamed from: y, reason: collision with root package name */
    public r45.sv2 f382128y;

    /* renamed from: z, reason: collision with root package name */
    public r45.sj2 f382129z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ob1)) {
            return false;
        }
        r45.ob1 ob1Var = (r45.ob1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f382110d), java.lang.Integer.valueOf(ob1Var.f382110d)) && n51.f.a(this.f382111e, ob1Var.f382111e) && n51.f.a(this.f382112f, ob1Var.f382112f) && n51.f.a(this.f382113g, ob1Var.f382113g) && n51.f.a(this.f382114h, ob1Var.f382114h) && n51.f.a(java.lang.Integer.valueOf(this.f382115i), java.lang.Integer.valueOf(ob1Var.f382115i)) && n51.f.a(this.f382116m, ob1Var.f382116m) && n51.f.a(this.f382117n, ob1Var.f382117n) && n51.f.a(this.f382118o, ob1Var.f382118o) && n51.f.a(this.f382119p, ob1Var.f382119p) && n51.f.a(this.f382120q, ob1Var.f382120q) && n51.f.a(this.f382121r, ob1Var.f382121r) && n51.f.a(this.f382122s, ob1Var.f382122s) && n51.f.a(this.f382123t, ob1Var.f382123t) && n51.f.a(this.f382124u, ob1Var.f382124u) && n51.f.a(this.f382125v, ob1Var.f382125v) && n51.f.a(java.lang.Integer.valueOf(this.f382126w), java.lang.Integer.valueOf(ob1Var.f382126w)) && n51.f.a(this.f382127x, ob1Var.f382127x) && n51.f.a(this.f382128y, ob1Var.f382128y) && n51.f.a(this.f382129z, ob1Var.f382129z);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f382110d);
            java.lang.String str = this.f382111e;
            if (str != null) {
                fVar.j(2, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f382112f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            r45.o23 o23Var = this.f382113g;
            if (o23Var != null) {
                fVar.i(4, o23Var.computeSize());
                this.f382113g.writeFields(fVar);
            }
            r45.yx0 yx0Var = this.f382114h;
            if (yx0Var != null) {
                fVar.i(5, yx0Var.computeSize());
                this.f382114h.writeFields(fVar);
            }
            fVar.e(6, this.f382115i);
            r45.yr2 yr2Var = this.f382116m;
            if (yr2Var != null) {
                fVar.i(7, yr2Var.computeSize());
                this.f382116m.writeFields(fVar);
            }
            r45.gj2 gj2Var = this.f382117n;
            if (gj2Var != null) {
                fVar.i(8, gj2Var.computeSize());
                this.f382117n.writeFields(fVar);
            }
            r45.aj2 aj2Var = this.f382118o;
            if (aj2Var != null) {
                fVar.i(9, aj2Var.computeSize());
                this.f382118o.writeFields(fVar);
            }
            r45.pz2 pz2Var = this.f382119p;
            if (pz2Var != null) {
                fVar.i(10, pz2Var.computeSize());
                this.f382119p.writeFields(fVar);
            }
            r45.h72 h72Var = this.f382120q;
            if (h72Var != null) {
                fVar.i(11, h72Var.computeSize());
                this.f382120q.writeFields(fVar);
            }
            r45.mg2 mg2Var = this.f382121r;
            if (mg2Var != null) {
                fVar.i(12, mg2Var.computeSize());
                this.f382121r.writeFields(fVar);
            }
            r45.kk2 kk2Var = this.f382122s;
            if (kk2Var != null) {
                fVar.i(13, kk2Var.computeSize());
                this.f382122s.writeFields(fVar);
            }
            r45.tu0 tu0Var = this.f382123t;
            if (tu0Var != null) {
                fVar.i(14, tu0Var.computeSize());
                this.f382123t.writeFields(fVar);
            }
            r45.u11 u11Var = this.f382124u;
            if (u11Var != null) {
                fVar.i(15, u11Var.computeSize());
                this.f382124u.writeFields(fVar);
            }
            r45.vj6 vj6Var = this.f382125v;
            if (vj6Var != null) {
                fVar.i(16, vj6Var.computeSize());
                this.f382125v.writeFields(fVar);
            }
            fVar.e(18, this.f382126w);
            r45.eo2 eo2Var = this.f382127x;
            if (eo2Var != null) {
                fVar.i(19, eo2Var.computeSize());
                this.f382127x.writeFields(fVar);
            }
            r45.sv2 sv2Var = this.f382128y;
            if (sv2Var != null) {
                fVar.i(20, sv2Var.computeSize());
                this.f382128y.writeFields(fVar);
            }
            r45.sj2 sj2Var = this.f382129z;
            if (sj2Var != null) {
                fVar.i(21, sj2Var.computeSize());
                this.f382129z.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f382110d) + 0;
            java.lang.String str2 = this.f382111e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f382112f;
            if (gVar2 != null) {
                e17 += b36.f.b(3, gVar2);
            }
            r45.o23 o23Var2 = this.f382113g;
            if (o23Var2 != null) {
                e17 += b36.f.i(4, o23Var2.computeSize());
            }
            r45.yx0 yx0Var2 = this.f382114h;
            if (yx0Var2 != null) {
                e17 += b36.f.i(5, yx0Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(6, this.f382115i);
            r45.yr2 yr2Var2 = this.f382116m;
            if (yr2Var2 != null) {
                e18 += b36.f.i(7, yr2Var2.computeSize());
            }
            r45.gj2 gj2Var2 = this.f382117n;
            if (gj2Var2 != null) {
                e18 += b36.f.i(8, gj2Var2.computeSize());
            }
            r45.aj2 aj2Var2 = this.f382118o;
            if (aj2Var2 != null) {
                e18 += b36.f.i(9, aj2Var2.computeSize());
            }
            r45.pz2 pz2Var2 = this.f382119p;
            if (pz2Var2 != null) {
                e18 += b36.f.i(10, pz2Var2.computeSize());
            }
            r45.h72 h72Var2 = this.f382120q;
            if (h72Var2 != null) {
                e18 += b36.f.i(11, h72Var2.computeSize());
            }
            r45.mg2 mg2Var2 = this.f382121r;
            if (mg2Var2 != null) {
                e18 += b36.f.i(12, mg2Var2.computeSize());
            }
            r45.kk2 kk2Var2 = this.f382122s;
            if (kk2Var2 != null) {
                e18 += b36.f.i(13, kk2Var2.computeSize());
            }
            r45.tu0 tu0Var2 = this.f382123t;
            if (tu0Var2 != null) {
                e18 += b36.f.i(14, tu0Var2.computeSize());
            }
            r45.u11 u11Var2 = this.f382124u;
            if (u11Var2 != null) {
                e18 += b36.f.i(15, u11Var2.computeSize());
            }
            r45.vj6 vj6Var2 = this.f382125v;
            if (vj6Var2 != null) {
                e18 += b36.f.i(16, vj6Var2.computeSize());
            }
            int e19 = e18 + b36.f.e(18, this.f382126w);
            r45.eo2 eo2Var2 = this.f382127x;
            if (eo2Var2 != null) {
                e19 += b36.f.i(19, eo2Var2.computeSize());
            }
            r45.sv2 sv2Var2 = this.f382128y;
            if (sv2Var2 != null) {
                e19 += b36.f.i(20, sv2Var2.computeSize());
            }
            r45.sj2 sj2Var2 = this.f382129z;
            return sj2Var2 != null ? e19 + b36.f.i(21, sj2Var2.computeSize()) : e19;
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
        r45.ob1 ob1Var = (r45.ob1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ob1Var.f382110d = aVar2.g(intValue);
                return 0;
            case 2:
                ob1Var.f382111e = aVar2.k(intValue);
                return 0;
            case 3:
                ob1Var.f382112f = aVar2.d(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.o23 o23Var3 = new r45.o23();
                    if (bArr != null && bArr.length > 0) {
                        o23Var3.parseFrom(bArr);
                    }
                    ob1Var.f382113g = o23Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.yx0 yx0Var3 = new r45.yx0();
                    if (bArr2 != null && bArr2.length > 0) {
                        yx0Var3.parseFrom(bArr2);
                    }
                    ob1Var.f382114h = yx0Var3;
                }
                return 0;
            case 6:
                ob1Var.f382115i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.yr2 yr2Var3 = new r45.yr2();
                    if (bArr3 != null && bArr3.length > 0) {
                        yr2Var3.parseFrom(bArr3);
                    }
                    ob1Var.f382116m = yr2Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.gj2 gj2Var3 = new r45.gj2();
                    if (bArr4 != null && bArr4.length > 0) {
                        gj2Var3.parseFrom(bArr4);
                    }
                    ob1Var.f382117n = gj2Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    r45.aj2 aj2Var3 = new r45.aj2();
                    if (bArr5 != null && bArr5.length > 0) {
                        aj2Var3.parseFrom(bArr5);
                    }
                    ob1Var.f382118o = aj2Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    r45.pz2 pz2Var3 = new r45.pz2();
                    if (bArr6 != null && bArr6.length > 0) {
                        pz2Var3.parseFrom(bArr6);
                    }
                    ob1Var.f382119p = pz2Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    r45.h72 h72Var3 = new r45.h72();
                    if (bArr7 != null && bArr7.length > 0) {
                        h72Var3.parseFrom(bArr7);
                    }
                    ob1Var.f382120q = h72Var3;
                }
                return 0;
            case 12:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    r45.mg2 mg2Var3 = new r45.mg2();
                    if (bArr8 != null && bArr8.length > 0) {
                        mg2Var3.parseFrom(bArr8);
                    }
                    ob1Var.f382121r = mg2Var3;
                }
                return 0;
            case 13:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j39.get(i47);
                    r45.kk2 kk2Var3 = new r45.kk2();
                    if (bArr9 != null && bArr9.length > 0) {
                        kk2Var3.parseFrom(bArr9);
                    }
                    ob1Var.f382122s = kk2Var3;
                }
                return 0;
            case 14:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr10 = (byte[]) j47.get(i48);
                    r45.tu0 tu0Var3 = new r45.tu0();
                    if (bArr10 != null && bArr10.length > 0) {
                        tu0Var3.parseFrom(bArr10);
                    }
                    ob1Var.f382123t = tu0Var3;
                }
                return 0;
            case 15:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i49 = 0; i49 < size11; i49++) {
                    byte[] bArr11 = (byte[]) j48.get(i49);
                    r45.u11 u11Var3 = new r45.u11();
                    if (bArr11 != null && bArr11.length > 0) {
                        u11Var3.parseFrom(bArr11);
                    }
                    ob1Var.f382124u = u11Var3;
                }
                return 0;
            case 16:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i57 = 0; i57 < size12; i57++) {
                    byte[] bArr12 = (byte[]) j49.get(i57);
                    r45.vj6 vj6Var3 = new r45.vj6();
                    if (bArr12 != null && bArr12.length > 0) {
                        vj6Var3.parseFrom(bArr12);
                    }
                    ob1Var.f382125v = vj6Var3;
                }
                return 0;
            case 17:
            default:
                return -1;
            case 18:
                ob1Var.f382126w = aVar2.g(intValue);
                return 0;
            case 19:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i58 = 0; i58 < size13; i58++) {
                    byte[] bArr13 = (byte[]) j57.get(i58);
                    r45.eo2 eo2Var3 = new r45.eo2();
                    if (bArr13 != null && bArr13.length > 0) {
                        eo2Var3.parseFrom(bArr13);
                    }
                    ob1Var.f382127x = eo2Var3;
                }
                return 0;
            case 20:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i59 = 0; i59 < size14; i59++) {
                    byte[] bArr14 = (byte[]) j58.get(i59);
                    r45.sv2 sv2Var3 = new r45.sv2();
                    if (bArr14 != null && bArr14.length > 0) {
                        sv2Var3.parseFrom(bArr14);
                    }
                    ob1Var.f382128y = sv2Var3;
                }
                return 0;
            case 21:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i66 = 0; i66 < size15; i66++) {
                    byte[] bArr15 = (byte[]) j59.get(i66);
                    r45.sj2 sj2Var3 = new r45.sj2();
                    if (bArr15 != null && bArr15.length > 0) {
                        sj2Var3.parseFrom(bArr15);
                    }
                    ob1Var.f382129z = sj2Var3;
                }
                return 0;
        }
    }
}
