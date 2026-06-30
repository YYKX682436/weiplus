package r45;

/* loaded from: classes15.dex */
public class zi5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f392109d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f392110e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f392111f;

    /* renamed from: g, reason: collision with root package name */
    public r45.du5 f392112g;

    /* renamed from: h, reason: collision with root package name */
    public r45.du5 f392113h;

    /* renamed from: i, reason: collision with root package name */
    public r45.du5 f392114i;

    /* renamed from: m, reason: collision with root package name */
    public r45.du5 f392115m;

    /* renamed from: n, reason: collision with root package name */
    public r45.du5 f392116n;

    /* renamed from: o, reason: collision with root package name */
    public r45.du5 f392117o;

    /* renamed from: p, reason: collision with root package name */
    public r45.du5 f392118p;

    /* renamed from: q, reason: collision with root package name */
    public r45.du5 f392119q;

    /* renamed from: r, reason: collision with root package name */
    public r45.du5 f392120r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zi5)) {
            return false;
        }
        r45.zi5 zi5Var = (r45.zi5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f392109d), java.lang.Integer.valueOf(zi5Var.f392109d)) && n51.f.a(this.f392110e, zi5Var.f392110e) && n51.f.a(this.f392111f, zi5Var.f392111f) && n51.f.a(this.f392112g, zi5Var.f392112g) && n51.f.a(this.f392113h, zi5Var.f392113h) && n51.f.a(this.f392114i, zi5Var.f392114i) && n51.f.a(this.f392115m, zi5Var.f392115m) && n51.f.a(this.f392116n, zi5Var.f392116n) && n51.f.a(this.f392117o, zi5Var.f392117o) && n51.f.a(this.f392118p, zi5Var.f392118p) && n51.f.a(this.f392119q, zi5Var.f392119q) && n51.f.a(this.f392120r, zi5Var.f392120r);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f392109d);
            r45.du5 du5Var = this.f392110e;
            if (du5Var != null) {
                fVar.i(2, du5Var.computeSize());
                this.f392110e.writeFields(fVar);
            }
            r45.du5 du5Var2 = this.f392111f;
            if (du5Var2 != null) {
                fVar.i(3, du5Var2.computeSize());
                this.f392111f.writeFields(fVar);
            }
            r45.du5 du5Var3 = this.f392112g;
            if (du5Var3 != null) {
                fVar.i(4, du5Var3.computeSize());
                this.f392112g.writeFields(fVar);
            }
            r45.du5 du5Var4 = this.f392113h;
            if (du5Var4 != null) {
                fVar.i(5, du5Var4.computeSize());
                this.f392113h.writeFields(fVar);
            }
            r45.du5 du5Var5 = this.f392114i;
            if (du5Var5 != null) {
                fVar.i(6, du5Var5.computeSize());
                this.f392114i.writeFields(fVar);
            }
            r45.du5 du5Var6 = this.f392115m;
            if (du5Var6 != null) {
                fVar.i(7, du5Var6.computeSize());
                this.f392115m.writeFields(fVar);
            }
            r45.du5 du5Var7 = this.f392116n;
            if (du5Var7 != null) {
                fVar.i(8, du5Var7.computeSize());
                this.f392116n.writeFields(fVar);
            }
            r45.du5 du5Var8 = this.f392117o;
            if (du5Var8 != null) {
                fVar.i(9, du5Var8.computeSize());
                this.f392117o.writeFields(fVar);
            }
            r45.du5 du5Var9 = this.f392118p;
            if (du5Var9 != null) {
                fVar.i(10, du5Var9.computeSize());
                this.f392118p.writeFields(fVar);
            }
            r45.du5 du5Var10 = this.f392119q;
            if (du5Var10 != null) {
                fVar.i(11, du5Var10.computeSize());
                this.f392119q.writeFields(fVar);
            }
            r45.du5 du5Var11 = this.f392120r;
            if (du5Var11 != null) {
                fVar.i(12, du5Var11.computeSize());
                this.f392120r.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f392109d) + 0;
            r45.du5 du5Var12 = this.f392110e;
            if (du5Var12 != null) {
                e17 += b36.f.i(2, du5Var12.computeSize());
            }
            r45.du5 du5Var13 = this.f392111f;
            if (du5Var13 != null) {
                e17 += b36.f.i(3, du5Var13.computeSize());
            }
            r45.du5 du5Var14 = this.f392112g;
            if (du5Var14 != null) {
                e17 += b36.f.i(4, du5Var14.computeSize());
            }
            r45.du5 du5Var15 = this.f392113h;
            if (du5Var15 != null) {
                e17 += b36.f.i(5, du5Var15.computeSize());
            }
            r45.du5 du5Var16 = this.f392114i;
            if (du5Var16 != null) {
                e17 += b36.f.i(6, du5Var16.computeSize());
            }
            r45.du5 du5Var17 = this.f392115m;
            if (du5Var17 != null) {
                e17 += b36.f.i(7, du5Var17.computeSize());
            }
            r45.du5 du5Var18 = this.f392116n;
            if (du5Var18 != null) {
                e17 += b36.f.i(8, du5Var18.computeSize());
            }
            r45.du5 du5Var19 = this.f392117o;
            if (du5Var19 != null) {
                e17 += b36.f.i(9, du5Var19.computeSize());
            }
            r45.du5 du5Var20 = this.f392118p;
            if (du5Var20 != null) {
                e17 += b36.f.i(10, du5Var20.computeSize());
            }
            r45.du5 du5Var21 = this.f392119q;
            if (du5Var21 != null) {
                e17 += b36.f.i(11, du5Var21.computeSize());
            }
            r45.du5 du5Var22 = this.f392120r;
            return du5Var22 != null ? e17 + b36.f.i(12, du5Var22.computeSize()) : e17;
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
        r45.zi5 zi5Var = (r45.zi5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                zi5Var.f392109d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.du5 du5Var23 = new r45.du5();
                    if (bArr != null && bArr.length > 0) {
                        du5Var23.b(bArr);
                    }
                    zi5Var.f392110e = du5Var23;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.du5 du5Var24 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var24.b(bArr2);
                    }
                    zi5Var.f392111f = du5Var24;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.du5 du5Var25 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var25.b(bArr3);
                    }
                    zi5Var.f392112g = du5Var25;
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.du5 du5Var26 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var26.b(bArr4);
                    }
                    zi5Var.f392113h = du5Var26;
                }
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    r45.du5 du5Var27 = new r45.du5();
                    if (bArr5 != null && bArr5.length > 0) {
                        du5Var27.b(bArr5);
                    }
                    zi5Var.f392114i = du5Var27;
                }
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    r45.du5 du5Var28 = new r45.du5();
                    if (bArr6 != null && bArr6.length > 0) {
                        du5Var28.b(bArr6);
                    }
                    zi5Var.f392115m = du5Var28;
                }
                return 0;
            case 8:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    r45.du5 du5Var29 = new r45.du5();
                    if (bArr7 != null && bArr7.length > 0) {
                        du5Var29.b(bArr7);
                    }
                    zi5Var.f392116n = du5Var29;
                }
                return 0;
            case 9:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    r45.du5 du5Var30 = new r45.du5();
                    if (bArr8 != null && bArr8.length > 0) {
                        du5Var30.b(bArr8);
                    }
                    zi5Var.f392117o = du5Var30;
                }
                return 0;
            case 10:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j39.get(i47);
                    r45.du5 du5Var31 = new r45.du5();
                    if (bArr9 != null && bArr9.length > 0) {
                        du5Var31.b(bArr9);
                    }
                    zi5Var.f392118p = du5Var31;
                }
                return 0;
            case 11:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr10 = (byte[]) j47.get(i48);
                    r45.du5 du5Var32 = new r45.du5();
                    if (bArr10 != null && bArr10.length > 0) {
                        du5Var32.b(bArr10);
                    }
                    zi5Var.f392119q = du5Var32;
                }
                return 0;
            case 12:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i49 = 0; i49 < size11; i49++) {
                    byte[] bArr11 = (byte[]) j48.get(i49);
                    r45.du5 du5Var33 = new r45.du5();
                    if (bArr11 != null && bArr11.length > 0) {
                        du5Var33.b(bArr11);
                    }
                    zi5Var.f392120r = du5Var33;
                }
                return 0;
            default:
                return -1;
        }
    }
}
