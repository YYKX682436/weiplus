package r45;

/* loaded from: classes4.dex */
public class ef7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.gf7 f373411d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ff7 f373412e;

    /* renamed from: f, reason: collision with root package name */
    public r45.kf7 f373413f;

    /* renamed from: g, reason: collision with root package name */
    public r45.mf7 f373414g;

    /* renamed from: h, reason: collision with root package name */
    public r45.lf7 f373415h;

    /* renamed from: i, reason: collision with root package name */
    public r45.qf7 f373416i;

    /* renamed from: m, reason: collision with root package name */
    public r45.df7 f373417m;

    /* renamed from: n, reason: collision with root package name */
    public r45.of7 f373418n;

    /* renamed from: o, reason: collision with root package name */
    public r45.if7 f373419o;

    /* renamed from: p, reason: collision with root package name */
    public r45.jf7 f373420p;

    /* renamed from: q, reason: collision with root package name */
    public r45.pf7 f373421q;

    /* renamed from: r, reason: collision with root package name */
    public r45.hf7 f373422r;

    /* renamed from: s, reason: collision with root package name */
    public r45.nf7 f373423s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ef7)) {
            return false;
        }
        r45.ef7 ef7Var = (r45.ef7) fVar;
        return n51.f.a(this.f373411d, ef7Var.f373411d) && n51.f.a(this.f373412e, ef7Var.f373412e) && n51.f.a(this.f373413f, ef7Var.f373413f) && n51.f.a(this.f373414g, ef7Var.f373414g) && n51.f.a(this.f373415h, ef7Var.f373415h) && n51.f.a(this.f373416i, ef7Var.f373416i) && n51.f.a(this.f373417m, ef7Var.f373417m) && n51.f.a(this.f373418n, ef7Var.f373418n) && n51.f.a(this.f373419o, ef7Var.f373419o) && n51.f.a(this.f373420p, ef7Var.f373420p) && n51.f.a(this.f373421q, ef7Var.f373421q) && n51.f.a(this.f373422r, ef7Var.f373422r) && n51.f.a(this.f373423s, ef7Var.f373423s);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.gf7 gf7Var = this.f373411d;
            if (gf7Var != null) {
                fVar.i(1, gf7Var.computeSize());
                this.f373411d.writeFields(fVar);
            }
            r45.ff7 ff7Var = this.f373412e;
            if (ff7Var != null) {
                fVar.i(2, ff7Var.computeSize());
                this.f373412e.writeFields(fVar);
            }
            r45.kf7 kf7Var = this.f373413f;
            if (kf7Var != null) {
                fVar.i(3, kf7Var.computeSize());
                this.f373413f.writeFields(fVar);
            }
            r45.mf7 mf7Var = this.f373414g;
            if (mf7Var != null) {
                fVar.i(4, mf7Var.computeSize());
                this.f373414g.writeFields(fVar);
            }
            r45.lf7 lf7Var = this.f373415h;
            if (lf7Var != null) {
                fVar.i(5, lf7Var.computeSize());
                this.f373415h.writeFields(fVar);
            }
            r45.qf7 qf7Var = this.f373416i;
            if (qf7Var != null) {
                fVar.i(6, qf7Var.computeSize());
                this.f373416i.writeFields(fVar);
            }
            r45.df7 df7Var = this.f373417m;
            if (df7Var != null) {
                fVar.i(7, df7Var.computeSize());
                this.f373417m.writeFields(fVar);
            }
            r45.of7 of7Var = this.f373418n;
            if (of7Var != null) {
                fVar.i(8, of7Var.computeSize());
                this.f373418n.writeFields(fVar);
            }
            r45.if7 if7Var = this.f373419o;
            if (if7Var != null) {
                fVar.i(9, if7Var.computeSize());
                this.f373419o.writeFields(fVar);
            }
            r45.jf7 jf7Var = this.f373420p;
            if (jf7Var != null) {
                fVar.i(10, jf7Var.computeSize());
                this.f373420p.writeFields(fVar);
            }
            r45.pf7 pf7Var = this.f373421q;
            if (pf7Var != null) {
                fVar.i(11, pf7Var.computeSize());
                this.f373421q.writeFields(fVar);
            }
            r45.hf7 hf7Var = this.f373422r;
            if (hf7Var != null) {
                fVar.i(12, hf7Var.computeSize());
                this.f373422r.writeFields(fVar);
            }
            r45.nf7 nf7Var = this.f373423s;
            if (nf7Var == null) {
                return 0;
            }
            fVar.i(13, nf7Var.computeSize());
            this.f373423s.writeFields(fVar);
            return 0;
        }
        if (i17 == 1) {
            r45.gf7 gf7Var2 = this.f373411d;
            int i18 = gf7Var2 != null ? 0 + b36.f.i(1, gf7Var2.computeSize()) : 0;
            r45.ff7 ff7Var2 = this.f373412e;
            if (ff7Var2 != null) {
                i18 += b36.f.i(2, ff7Var2.computeSize());
            }
            r45.kf7 kf7Var2 = this.f373413f;
            if (kf7Var2 != null) {
                i18 += b36.f.i(3, kf7Var2.computeSize());
            }
            r45.mf7 mf7Var2 = this.f373414g;
            if (mf7Var2 != null) {
                i18 += b36.f.i(4, mf7Var2.computeSize());
            }
            r45.lf7 lf7Var2 = this.f373415h;
            if (lf7Var2 != null) {
                i18 += b36.f.i(5, lf7Var2.computeSize());
            }
            r45.qf7 qf7Var2 = this.f373416i;
            if (qf7Var2 != null) {
                i18 += b36.f.i(6, qf7Var2.computeSize());
            }
            r45.df7 df7Var2 = this.f373417m;
            if (df7Var2 != null) {
                i18 += b36.f.i(7, df7Var2.computeSize());
            }
            r45.of7 of7Var2 = this.f373418n;
            if (of7Var2 != null) {
                i18 += b36.f.i(8, of7Var2.computeSize());
            }
            r45.if7 if7Var2 = this.f373419o;
            if (if7Var2 != null) {
                i18 += b36.f.i(9, if7Var2.computeSize());
            }
            r45.jf7 jf7Var2 = this.f373420p;
            if (jf7Var2 != null) {
                i18 += b36.f.i(10, jf7Var2.computeSize());
            }
            r45.pf7 pf7Var2 = this.f373421q;
            if (pf7Var2 != null) {
                i18 += b36.f.i(11, pf7Var2.computeSize());
            }
            r45.hf7 hf7Var2 = this.f373422r;
            if (hf7Var2 != null) {
                i18 += b36.f.i(12, hf7Var2.computeSize());
            }
            r45.nf7 nf7Var2 = this.f373423s;
            return nf7Var2 != null ? i18 + b36.f.i(13, nf7Var2.computeSize()) : i18;
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
        r45.ef7 ef7Var = (r45.ef7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.gf7 gf7Var3 = new r45.gf7();
                    if (bArr != null && bArr.length > 0) {
                        gf7Var3.parseFrom(bArr);
                    }
                    ef7Var.f373411d = gf7Var3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ff7 ff7Var3 = new r45.ff7();
                    if (bArr2 != null && bArr2.length > 0) {
                        ff7Var3.parseFrom(bArr2);
                    }
                    ef7Var.f373412e = ff7Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.kf7 kf7Var3 = new r45.kf7();
                    if (bArr3 != null && bArr3.length > 0) {
                        kf7Var3.parseFrom(bArr3);
                    }
                    ef7Var.f373413f = kf7Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.mf7 mf7Var3 = new r45.mf7();
                    if (bArr4 != null && bArr4.length > 0) {
                        mf7Var3.parseFrom(bArr4);
                    }
                    ef7Var.f373414g = mf7Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.lf7 lf7Var3 = new r45.lf7();
                    if (bArr5 != null && bArr5.length > 0) {
                        lf7Var3.parseFrom(bArr5);
                    }
                    ef7Var.f373415h = lf7Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.qf7 qf7Var3 = new r45.qf7();
                    if (bArr6 != null && bArr6.length > 0) {
                        qf7Var3.parseFrom(bArr6);
                    }
                    ef7Var.f373416i = qf7Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.df7 df7Var3 = new r45.df7();
                    if (bArr7 != null && bArr7.length > 0) {
                        df7Var3.parseFrom(bArr7);
                    }
                    ef7Var.f373417m = df7Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    r45.of7 of7Var3 = new r45.of7();
                    if (bArr8 != null && bArr8.length > 0) {
                        of7Var3.parseFrom(bArr8);
                    }
                    ef7Var.f373418n = of7Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    r45.if7 if7Var3 = new r45.if7();
                    if (bArr9 != null && bArr9.length > 0) {
                        if7Var3.parseFrom(bArr9);
                    }
                    ef7Var.f373419o = if7Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    r45.jf7 jf7Var3 = new r45.jf7();
                    if (bArr10 != null && bArr10.length > 0) {
                        jf7Var3.parseFrom(bArr10);
                    }
                    ef7Var.f373420p = jf7Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    r45.pf7 pf7Var3 = new r45.pf7();
                    if (bArr11 != null && bArr11.length > 0) {
                        pf7Var3.parseFrom(bArr11);
                    }
                    ef7Var.f373421q = pf7Var3;
                }
                return 0;
            case 12:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    r45.hf7 hf7Var3 = new r45.hf7();
                    if (bArr12 != null && bArr12.length > 0) {
                        hf7Var3.parseFrom(bArr12);
                    }
                    ef7Var.f373422r = hf7Var3;
                }
                return 0;
            case 13:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr13 = (byte[]) j57.get(i59);
                    r45.nf7 nf7Var3 = new r45.nf7();
                    if (bArr13 != null && bArr13.length > 0) {
                        nf7Var3.parseFrom(bArr13);
                    }
                    ef7Var.f373423s = nf7Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
