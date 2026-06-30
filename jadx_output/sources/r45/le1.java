package r45;

/* loaded from: classes2.dex */
public class le1 extends com.tencent.mm.protobuf.f {
    public r45.wz2 A;
    public int B;
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo C;
    public int D;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379347d;

    /* renamed from: e, reason: collision with root package name */
    public int f379348e;

    /* renamed from: f, reason: collision with root package name */
    public int f379349f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379351h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379352i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f379353m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f379355o;

    /* renamed from: r, reason: collision with root package name */
    public r45.vz2 f379358r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f379359s;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f379361u;

    /* renamed from: x, reason: collision with root package name */
    public r45.pe1 f379364x;

    /* renamed from: y, reason: collision with root package name */
    public int f379365y;

    /* renamed from: z, reason: collision with root package name */
    public r45.qe1 f379366z;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f379350g = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f379354n = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f379356p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f379357q = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f379360t = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f379362v = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f379363w = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.le1)) {
            return false;
        }
        r45.le1 le1Var = (r45.le1) fVar;
        return n51.f.a(this.f379347d, le1Var.f379347d) && n51.f.a(java.lang.Integer.valueOf(this.f379348e), java.lang.Integer.valueOf(le1Var.f379348e)) && n51.f.a(java.lang.Integer.valueOf(this.f379349f), java.lang.Integer.valueOf(le1Var.f379349f)) && n51.f.a(this.f379350g, le1Var.f379350g) && n51.f.a(this.f379351h, le1Var.f379351h) && n51.f.a(this.f379352i, le1Var.f379352i) && n51.f.a(this.f379353m, le1Var.f379353m) && n51.f.a(this.f379354n, le1Var.f379354n) && n51.f.a(this.f379355o, le1Var.f379355o) && n51.f.a(this.f379356p, le1Var.f379356p) && n51.f.a(this.f379357q, le1Var.f379357q) && n51.f.a(this.f379358r, le1Var.f379358r) && n51.f.a(this.f379359s, le1Var.f379359s) && n51.f.a(this.f379360t, le1Var.f379360t) && n51.f.a(this.f379361u, le1Var.f379361u) && n51.f.a(this.f379362v, le1Var.f379362v) && n51.f.a(this.f379363w, le1Var.f379363w) && n51.f.a(this.f379364x, le1Var.f379364x) && n51.f.a(java.lang.Integer.valueOf(this.f379365y), java.lang.Integer.valueOf(le1Var.f379365y)) && n51.f.a(this.f379366z, le1Var.f379366z) && n51.f.a(this.A, le1Var.A) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(le1Var.B)) && n51.f.a(this.C, le1Var.C) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(le1Var.D));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f379363w;
        java.util.LinkedList linkedList2 = this.f379362v;
        java.util.LinkedList linkedList3 = this.f379360t;
        java.util.LinkedList linkedList4 = this.f379357q;
        java.util.LinkedList linkedList5 = this.f379356p;
        java.util.LinkedList linkedList6 = this.f379354n;
        java.util.LinkedList linkedList7 = this.f379350g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379347d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f379348e);
            fVar.e(3, this.f379349f);
            fVar.g(4, 1, linkedList7);
            java.lang.String str2 = this.f379351h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f379352i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f379353m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.g(8, 1, linkedList6);
            java.lang.String str5 = this.f379355o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.g(10, 8, linkedList5);
            fVar.g(11, 1, linkedList4);
            r45.vz2 vz2Var = this.f379358r;
            if (vz2Var != null) {
                fVar.i(12, vz2Var.computeSize());
                this.f379358r.writeFields(fVar);
            }
            java.lang.String str6 = this.f379359s;
            if (str6 != null) {
                fVar.j(13, str6);
            }
            fVar.g(14, 1, linkedList3);
            com.tencent.mm.protobuf.g gVar = this.f379361u;
            if (gVar != null) {
                fVar.b(15, gVar);
            }
            fVar.g(16, 8, linkedList2);
            fVar.g(17, 8, linkedList);
            r45.pe1 pe1Var = this.f379364x;
            if (pe1Var != null) {
                fVar.i(18, pe1Var.computeSize());
                this.f379364x.writeFields(fVar);
            }
            fVar.e(19, this.f379365y);
            r45.qe1 qe1Var = this.f379366z;
            if (qe1Var != null) {
                fVar.i(20, qe1Var.computeSize());
                this.f379366z.writeFields(fVar);
            }
            r45.wz2 wz2Var = this.A;
            if (wz2Var != null) {
                fVar.i(21, wz2Var.computeSize());
                this.A.writeFields(fVar);
            }
            fVar.e(22, this.B);
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.C;
            if (finderJumpInfo != null) {
                fVar.i(23, finderJumpInfo.computeSize());
                this.C.writeFields(fVar);
            }
            fVar.e(24, this.D);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f379347d;
            int j17 = (str7 != null ? b36.f.j(1, str7) + 0 : 0) + b36.f.e(2, this.f379348e) + b36.f.e(3, this.f379349f) + b36.f.g(4, 1, linkedList7);
            java.lang.String str8 = this.f379351h;
            if (str8 != null) {
                j17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f379352i;
            if (str9 != null) {
                j17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f379353m;
            if (str10 != null) {
                j17 += b36.f.j(7, str10);
            }
            int g17 = j17 + b36.f.g(8, 1, linkedList6);
            java.lang.String str11 = this.f379355o;
            if (str11 != null) {
                g17 += b36.f.j(9, str11);
            }
            int g18 = g17 + b36.f.g(10, 8, linkedList5) + b36.f.g(11, 1, linkedList4);
            r45.vz2 vz2Var2 = this.f379358r;
            if (vz2Var2 != null) {
                g18 += b36.f.i(12, vz2Var2.computeSize());
            }
            java.lang.String str12 = this.f379359s;
            if (str12 != null) {
                g18 += b36.f.j(13, str12);
            }
            int g19 = g18 + b36.f.g(14, 1, linkedList3);
            com.tencent.mm.protobuf.g gVar2 = this.f379361u;
            if (gVar2 != null) {
                g19 += b36.f.b(15, gVar2);
            }
            int g27 = g19 + b36.f.g(16, 8, linkedList2) + b36.f.g(17, 8, linkedList);
            r45.pe1 pe1Var2 = this.f379364x;
            if (pe1Var2 != null) {
                g27 += b36.f.i(18, pe1Var2.computeSize());
            }
            int e17 = g27 + b36.f.e(19, this.f379365y);
            r45.qe1 qe1Var2 = this.f379366z;
            if (qe1Var2 != null) {
                e17 += b36.f.i(20, qe1Var2.computeSize());
            }
            r45.wz2 wz2Var2 = this.A;
            if (wz2Var2 != null) {
                e17 += b36.f.i(21, wz2Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(22, this.B);
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = this.C;
            if (finderJumpInfo2 != null) {
                e18 += b36.f.i(23, finderJumpInfo2.computeSize());
            }
            return e18 + b36.f.e(24, this.D);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList7.clear();
            linkedList6.clear();
            linkedList5.clear();
            linkedList4.clear();
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
        r45.le1 le1Var = (r45.le1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                le1Var.f379347d = aVar2.k(intValue);
                return 0;
            case 2:
                le1Var.f379348e = aVar2.g(intValue);
                return 0;
            case 3:
                le1Var.f379349f = aVar2.g(intValue);
                return 0;
            case 4:
                le1Var.f379350g.add(aVar2.k(intValue));
                return 0;
            case 5:
                le1Var.f379351h = aVar2.k(intValue);
                return 0;
            case 6:
                le1Var.f379352i = aVar2.k(intValue);
                return 0;
            case 7:
                le1Var.f379353m = aVar2.k(intValue);
                return 0;
            case 8:
                le1Var.f379354n.add(aVar2.k(intValue));
                return 0;
            case 9:
                le1Var.f379355o = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.se1 se1Var = new r45.se1();
                    if (bArr2 != null && bArr2.length > 0) {
                        se1Var.parseFrom(bArr2);
                    }
                    le1Var.f379356p.add(se1Var);
                }
                return 0;
            case 11:
                le1Var.f379357q.add(aVar2.k(intValue));
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.vz2 vz2Var3 = new r45.vz2();
                    if (bArr3 != null && bArr3.length > 0) {
                        vz2Var3.parseFrom(bArr3);
                    }
                    le1Var.f379358r = vz2Var3;
                }
                return 0;
            case 13:
                le1Var.f379359s = aVar2.k(intValue);
                return 0;
            case 14:
                le1Var.f379360t.add(aVar2.k(intValue));
                return 0;
            case 15:
                le1Var.f379361u = aVar2.d(intValue);
                return 0;
            case 16:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.ne1 ne1Var = new r45.ne1();
                    if (bArr4 != null && bArr4.length > 0) {
                        ne1Var.parseFrom(bArr4);
                    }
                    le1Var.f379362v.add(ne1Var);
                }
                return 0;
            case 17:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.ue1 ue1Var = new r45.ue1();
                    if (bArr5 != null && bArr5.length > 0) {
                        ue1Var.parseFrom(bArr5);
                    }
                    le1Var.f379363w.add(ue1Var);
                }
                return 0;
            case 18:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j29.get(i29);
                    r45.pe1 pe1Var3 = new r45.pe1();
                    if (bArr6 != null && bArr6.length > 0) {
                        pe1Var3.parseFrom(bArr6);
                    }
                    le1Var.f379364x = pe1Var3;
                }
                return 0;
            case 19:
                le1Var.f379365y = aVar2.g(intValue);
                return 0;
            case 20:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size6 = j37.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j37.get(i37);
                    r45.qe1 qe1Var3 = new r45.qe1();
                    if (bArr7 != null && bArr7.length > 0) {
                        qe1Var3.parseFrom(bArr7);
                    }
                    le1Var.f379366z = qe1Var3;
                }
                return 0;
            case 21:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size7 = j38.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j38.get(i38);
                    r45.wz2 wz2Var3 = new r45.wz2();
                    if (bArr8 != null && bArr8.length > 0) {
                        wz2Var3.parseFrom(bArr8);
                    }
                    le1Var.A = wz2Var3;
                }
                return 0;
            case 22:
                le1Var.B = aVar2.g(intValue);
                return 0;
            case 23:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size8 = j39.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr9 = (byte[]) j39.get(i39);
                    com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo3 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
                    if (bArr9 != null && bArr9.length > 0) {
                        finderJumpInfo3.parseFrom(bArr9);
                    }
                    le1Var.C = finderJumpInfo3;
                }
                return 0;
            case 24:
                le1Var.D = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
