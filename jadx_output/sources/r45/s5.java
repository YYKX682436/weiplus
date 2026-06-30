package r45;

/* loaded from: classes8.dex */
public class s5 extends com.tencent.mm.protobuf.f {

    /* renamed from: o, reason: collision with root package name */
    public static final r45.s5 f385508o = new r45.s5();

    /* renamed from: d, reason: collision with root package name */
    public r45.y5 f385509d;

    /* renamed from: e, reason: collision with root package name */
    public r45.v5 f385510e;

    /* renamed from: f, reason: collision with root package name */
    public r45.q5 f385511f;

    /* renamed from: g, reason: collision with root package name */
    public r45.x5 f385512g;

    /* renamed from: h, reason: collision with root package name */
    public r45.w5 f385513h;

    /* renamed from: i, reason: collision with root package name */
    public r45.p5 f385514i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f385515m;

    /* renamed from: n, reason: collision with root package name */
    public int f385516n;

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.s5 parseFrom(byte[] bArr) {
        return (r45.s5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s5)) {
            return false;
        }
        r45.s5 s5Var = (r45.s5) fVar;
        return n51.f.a(this.f385509d, s5Var.f385509d) && n51.f.a(this.f385510e, s5Var.f385510e) && n51.f.a(this.f385511f, s5Var.f385511f) && n51.f.a(this.f385512g, s5Var.f385512g) && n51.f.a(this.f385513h, s5Var.f385513h) && n51.f.a(this.f385514i, s5Var.f385514i) && n51.f.a(java.lang.Boolean.valueOf(this.f385515m), java.lang.Boolean.valueOf(s5Var.f385515m)) && n51.f.a(java.lang.Integer.valueOf(this.f385516n), java.lang.Integer.valueOf(s5Var.f385516n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.s5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.y5 y5Var = this.f385509d;
            if (y5Var != null) {
                fVar.i(1, y5Var.computeSize());
                this.f385509d.writeFields(fVar);
            }
            r45.v5 v5Var = this.f385510e;
            if (v5Var != null) {
                fVar.i(2, v5Var.computeSize());
                this.f385510e.writeFields(fVar);
            }
            r45.q5 q5Var = this.f385511f;
            if (q5Var != null) {
                fVar.i(3, q5Var.computeSize());
                this.f385511f.writeFields(fVar);
            }
            r45.x5 x5Var = this.f385512g;
            if (x5Var != null) {
                fVar.i(4, x5Var.computeSize());
                this.f385512g.writeFields(fVar);
            }
            r45.w5 w5Var = this.f385513h;
            if (w5Var != null) {
                fVar.i(5, w5Var.computeSize());
                this.f385513h.writeFields(fVar);
            }
            r45.p5 p5Var = this.f385514i;
            if (p5Var != null) {
                fVar.i(6, p5Var.computeSize());
                this.f385514i.writeFields(fVar);
            }
            fVar.a(900, this.f385515m);
            fVar.e(901, this.f385516n);
            return 0;
        }
        if (i17 == 1) {
            r45.y5 y5Var2 = this.f385509d;
            int i18 = y5Var2 != null ? 0 + b36.f.i(1, y5Var2.computeSize()) : 0;
            r45.v5 v5Var2 = this.f385510e;
            if (v5Var2 != null) {
                i18 += b36.f.i(2, v5Var2.computeSize());
            }
            r45.q5 q5Var2 = this.f385511f;
            if (q5Var2 != null) {
                i18 += b36.f.i(3, q5Var2.computeSize());
            }
            r45.x5 x5Var2 = this.f385512g;
            if (x5Var2 != null) {
                i18 += b36.f.i(4, x5Var2.computeSize());
            }
            r45.w5 w5Var2 = this.f385513h;
            if (w5Var2 != null) {
                i18 += b36.f.i(5, w5Var2.computeSize());
            }
            r45.p5 p5Var2 = this.f385514i;
            if (p5Var2 != null) {
                i18 += b36.f.i(6, p5Var2.computeSize());
            }
            return i18 + b36.f.a(900, this.f385515m) + b36.f.e(901, this.f385516n);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 900) {
            this.f385515m = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 901) {
            this.f385516n = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.y5 y5Var3 = new r45.y5();
                    if (bArr != null && bArr.length > 0) {
                        y5Var3.parseFrom(bArr);
                    }
                    this.f385509d = y5Var3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.v5 v5Var3 = new r45.v5();
                    if (bArr2 != null && bArr2.length > 0) {
                        v5Var3.parseFrom(bArr2);
                    }
                    this.f385510e = v5Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.q5 q5Var3 = new r45.q5();
                    if (bArr3 != null && bArr3.length > 0) {
                        q5Var3.parseFrom(bArr3);
                    }
                    this.f385511f = q5Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.x5 x5Var3 = new r45.x5();
                    if (bArr4 != null && bArr4.length > 0) {
                        x5Var3.parseFrom(bArr4);
                    }
                    this.f385512g = x5Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.w5 w5Var3 = new r45.w5();
                    if (bArr5 != null && bArr5.length > 0) {
                        w5Var3.parseFrom(bArr5);
                    }
                    this.f385513h = w5Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.p5 p5Var3 = new r45.p5();
                    if (bArr6 != null && bArr6.length > 0) {
                        p5Var3.parseFrom(bArr6);
                    }
                    this.f385514i = p5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
