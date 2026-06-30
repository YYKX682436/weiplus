package r45;

/* loaded from: classes2.dex */
public class fa2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f374125d;

    /* renamed from: e, reason: collision with root package name */
    public int f374126e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374127f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374128g;

    /* renamed from: i, reason: collision with root package name */
    public int f374130i;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f374132n;

    /* renamed from: o, reason: collision with root package name */
    public int f374133o;

    /* renamed from: p, reason: collision with root package name */
    public r45.dd2 f374134p;

    /* renamed from: q, reason: collision with root package name */
    public r45.uz2 f374135q;

    /* renamed from: r, reason: collision with root package name */
    public r45.ed2 f374136r;

    /* renamed from: s, reason: collision with root package name */
    public r45.hp1 f374137s;

    /* renamed from: t, reason: collision with root package name */
    public int f374138t;

    /* renamed from: u, reason: collision with root package name */
    public r45.nq1 f374139u;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f374129h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f374131m = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fa2)) {
            return false;
        }
        r45.fa2 fa2Var = (r45.fa2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f374125d), java.lang.Integer.valueOf(fa2Var.f374125d)) && n51.f.a(java.lang.Integer.valueOf(this.f374126e), java.lang.Integer.valueOf(fa2Var.f374126e)) && n51.f.a(this.f374127f, fa2Var.f374127f) && n51.f.a(this.f374128g, fa2Var.f374128g) && n51.f.a(this.f374129h, fa2Var.f374129h) && n51.f.a(java.lang.Integer.valueOf(this.f374130i), java.lang.Integer.valueOf(fa2Var.f374130i)) && n51.f.a(this.f374131m, fa2Var.f374131m) && n51.f.a(this.f374132n, fa2Var.f374132n) && n51.f.a(java.lang.Integer.valueOf(this.f374133o), java.lang.Integer.valueOf(fa2Var.f374133o)) && n51.f.a(this.f374134p, fa2Var.f374134p) && n51.f.a(this.f374135q, fa2Var.f374135q) && n51.f.a(this.f374136r, fa2Var.f374136r) && n51.f.a(this.f374137s, fa2Var.f374137s) && n51.f.a(java.lang.Integer.valueOf(this.f374138t), java.lang.Integer.valueOf(fa2Var.f374138t)) && n51.f.a(this.f374139u, fa2Var.f374139u);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f374131m;
        java.util.LinkedList linkedList2 = this.f374129h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f374125d);
            fVar.e(2, this.f374126e);
            java.lang.String str = this.f374127f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f374128g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.g(5, 8, linkedList2);
            fVar.e(6, this.f374130i);
            fVar.g(7, 1, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f374132n;
            if (gVar != null) {
                fVar.b(8, gVar);
            }
            fVar.e(9, this.f374133o);
            r45.dd2 dd2Var = this.f374134p;
            if (dd2Var != null) {
                fVar.i(10, dd2Var.computeSize());
                this.f374134p.writeFields(fVar);
            }
            r45.uz2 uz2Var = this.f374135q;
            if (uz2Var != null) {
                fVar.i(11, uz2Var.computeSize());
                this.f374135q.writeFields(fVar);
            }
            r45.ed2 ed2Var = this.f374136r;
            if (ed2Var != null) {
                fVar.i(12, ed2Var.computeSize());
                this.f374136r.writeFields(fVar);
            }
            r45.hp1 hp1Var = this.f374137s;
            if (hp1Var != null) {
                fVar.i(13, hp1Var.computeSize());
                this.f374137s.writeFields(fVar);
            }
            fVar.e(14, this.f374138t);
            r45.nq1 nq1Var = this.f374139u;
            if (nq1Var != null) {
                fVar.i(15, nq1Var.computeSize());
                this.f374139u.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f374125d) + 0 + b36.f.e(2, this.f374126e);
            java.lang.String str3 = this.f374127f;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f374128g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            int g17 = e17 + b36.f.g(5, 8, linkedList2) + b36.f.e(6, this.f374130i) + b36.f.g(7, 1, linkedList);
            com.tencent.mm.protobuf.g gVar2 = this.f374132n;
            if (gVar2 != null) {
                g17 += b36.f.b(8, gVar2);
            }
            int e18 = g17 + b36.f.e(9, this.f374133o);
            r45.dd2 dd2Var2 = this.f374134p;
            if (dd2Var2 != null) {
                e18 += b36.f.i(10, dd2Var2.computeSize());
            }
            r45.uz2 uz2Var2 = this.f374135q;
            if (uz2Var2 != null) {
                e18 += b36.f.i(11, uz2Var2.computeSize());
            }
            r45.ed2 ed2Var2 = this.f374136r;
            if (ed2Var2 != null) {
                e18 += b36.f.i(12, ed2Var2.computeSize());
            }
            r45.hp1 hp1Var2 = this.f374137s;
            if (hp1Var2 != null) {
                e18 += b36.f.i(13, hp1Var2.computeSize());
            }
            int e19 = e18 + b36.f.e(14, this.f374138t);
            r45.nq1 nq1Var2 = this.f374139u;
            return nq1Var2 != null ? e19 + b36.f.i(15, nq1Var2.computeSize()) : e19;
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
        r45.fa2 fa2Var = (r45.fa2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fa2Var.f374125d = aVar2.g(intValue);
                return 0;
            case 2:
                fa2Var.f374126e = aVar2.g(intValue);
                return 0;
            case 3:
                fa2Var.f374127f = aVar2.k(intValue);
                return 0;
            case 4:
                fa2Var.f374128g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.ea2 ea2Var = new r45.ea2();
                    if (bArr2 != null && bArr2.length > 0) {
                        ea2Var.parseFrom(bArr2);
                    }
                    fa2Var.f374129h.add(ea2Var);
                }
                return 0;
            case 6:
                fa2Var.f374130i = aVar2.g(intValue);
                return 0;
            case 7:
                fa2Var.f374131m.add(aVar2.k(intValue));
                return 0;
            case 8:
                fa2Var.f374132n = aVar2.d(intValue);
                return 0;
            case 9:
                fa2Var.f374133o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.dd2 dd2Var3 = new r45.dd2();
                    if (bArr3 != null && bArr3.length > 0) {
                        dd2Var3.parseFrom(bArr3);
                    }
                    fa2Var.f374134p = dd2Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.uz2 uz2Var3 = new r45.uz2();
                    if (bArr4 != null && bArr4.length > 0) {
                        uz2Var3.parseFrom(bArr4);
                    }
                    fa2Var.f374135q = uz2Var3;
                }
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.ed2 ed2Var3 = new r45.ed2();
                    if (bArr5 != null && bArr5.length > 0) {
                        ed2Var3.parseFrom(bArr5);
                    }
                    fa2Var.f374136r = ed2Var3;
                }
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.hp1 hp1Var3 = new r45.hp1();
                    if (bArr6 != null && bArr6.length > 0) {
                        hp1Var3.parseFrom(bArr6);
                    }
                    fa2Var.f374137s = hp1Var3;
                }
                return 0;
            case 14:
                fa2Var.f374138t = aVar2.g(intValue);
                return 0;
            case 15:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.nq1 nq1Var3 = new r45.nq1();
                    if (bArr7 != null && bArr7.length > 0) {
                        nq1Var3.parseFrom(bArr7);
                    }
                    fa2Var.f374139u = nq1Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
