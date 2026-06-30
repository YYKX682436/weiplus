package r45;

/* loaded from: classes2.dex */
public class vd extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388123d;

    /* renamed from: e, reason: collision with root package name */
    public r45.yt5 f388124e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388125f;

    /* renamed from: g, reason: collision with root package name */
    public r45.bz3 f388126g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f388127h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cg0 f388128i;

    /* renamed from: m, reason: collision with root package name */
    public r45.rl6 f388129m;

    /* renamed from: n, reason: collision with root package name */
    public r45.t35 f388130n;

    /* renamed from: o, reason: collision with root package name */
    public r45.cg0 f388131o;

    /* renamed from: p, reason: collision with root package name */
    public r45.cg0 f388132p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vd)) {
            return false;
        }
        r45.vd vdVar = (r45.vd) fVar;
        return n51.f.a(this.f388123d, vdVar.f388123d) && n51.f.a(this.f388124e, vdVar.f388124e) && n51.f.a(this.f388125f, vdVar.f388125f) && n51.f.a(this.f388126g, vdVar.f388126g) && n51.f.a(this.f388127h, vdVar.f388127h) && n51.f.a(this.f388128i, vdVar.f388128i) && n51.f.a(this.f388129m, vdVar.f388129m) && n51.f.a(this.f388130n, vdVar.f388130n) && n51.f.a(this.f388131o, vdVar.f388131o) && n51.f.a(this.f388132p, vdVar.f388132p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388123d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.yt5 yt5Var = this.f388124e;
            if (yt5Var != null) {
                fVar.i(2, yt5Var.computeSize());
                this.f388124e.writeFields(fVar);
            }
            java.lang.String str2 = this.f388125f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.bz3 bz3Var = this.f388126g;
            if (bz3Var != null) {
                fVar.i(4, bz3Var.computeSize());
                this.f388126g.writeFields(fVar);
            }
            java.lang.String str3 = this.f388127h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.cg0 cg0Var = this.f388128i;
            if (cg0Var != null) {
                fVar.i(6, cg0Var.computeSize());
                this.f388128i.writeFields(fVar);
            }
            r45.rl6 rl6Var = this.f388129m;
            if (rl6Var != null) {
                fVar.i(7, rl6Var.computeSize());
                this.f388129m.writeFields(fVar);
            }
            r45.t35 t35Var = this.f388130n;
            if (t35Var != null) {
                fVar.i(8, t35Var.computeSize());
                this.f388130n.writeFields(fVar);
            }
            r45.cg0 cg0Var2 = this.f388131o;
            if (cg0Var2 != null) {
                fVar.i(9, cg0Var2.computeSize());
                this.f388131o.writeFields(fVar);
            }
            r45.cg0 cg0Var3 = this.f388132p;
            if (cg0Var3 != null) {
                fVar.i(10, cg0Var3.computeSize());
                this.f388132p.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f388123d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            r45.yt5 yt5Var2 = this.f388124e;
            if (yt5Var2 != null) {
                j17 += b36.f.i(2, yt5Var2.computeSize());
            }
            java.lang.String str5 = this.f388125f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            r45.bz3 bz3Var2 = this.f388126g;
            if (bz3Var2 != null) {
                j17 += b36.f.i(4, bz3Var2.computeSize());
            }
            java.lang.String str6 = this.f388127h;
            if (str6 != null) {
                j17 += b36.f.j(5, str6);
            }
            r45.cg0 cg0Var4 = this.f388128i;
            if (cg0Var4 != null) {
                j17 += b36.f.i(6, cg0Var4.computeSize());
            }
            r45.rl6 rl6Var2 = this.f388129m;
            if (rl6Var2 != null) {
                j17 += b36.f.i(7, rl6Var2.computeSize());
            }
            r45.t35 t35Var2 = this.f388130n;
            if (t35Var2 != null) {
                j17 += b36.f.i(8, t35Var2.computeSize());
            }
            r45.cg0 cg0Var5 = this.f388131o;
            if (cg0Var5 != null) {
                j17 += b36.f.i(9, cg0Var5.computeSize());
            }
            r45.cg0 cg0Var6 = this.f388132p;
            return cg0Var6 != null ? j17 + b36.f.i(10, cg0Var6.computeSize()) : j17;
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
        r45.vd vdVar = (r45.vd) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vdVar.f388123d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.yt5 yt5Var3 = new r45.yt5();
                    if (bArr != null && bArr.length > 0) {
                        yt5Var3.parseFrom(bArr);
                    }
                    vdVar.f388124e = yt5Var3;
                }
                return 0;
            case 3:
                vdVar.f388125f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.bz3 bz3Var3 = new r45.bz3();
                    if (bArr2 != null && bArr2.length > 0) {
                        bz3Var3.parseFrom(bArr2);
                    }
                    vdVar.f388126g = bz3Var3;
                }
                return 0;
            case 5:
                vdVar.f388127h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.cg0 cg0Var7 = new r45.cg0();
                    if (bArr3 != null && bArr3.length > 0) {
                        cg0Var7.parseFrom(bArr3);
                    }
                    vdVar.f388128i = cg0Var7;
                }
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j28.get(i28);
                    r45.rl6 rl6Var3 = new r45.rl6();
                    if (bArr4 != null && bArr4.length > 0) {
                        rl6Var3.parseFrom(bArr4);
                    }
                    vdVar.f388129m = rl6Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j29.get(i29);
                    r45.t35 t35Var3 = new r45.t35();
                    if (bArr5 != null && bArr5.length > 0) {
                        t35Var3.parseFrom(bArr5);
                    }
                    vdVar.f388130n = t35Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size6 = j37.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j37.get(i37);
                    r45.cg0 cg0Var8 = new r45.cg0();
                    if (bArr6 != null && bArr6.length > 0) {
                        cg0Var8.parseFrom(bArr6);
                    }
                    vdVar.f388131o = cg0Var8;
                }
                return 0;
            case 10:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size7 = j38.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j38.get(i38);
                    r45.cg0 cg0Var9 = new r45.cg0();
                    if (bArr7 != null && bArr7.length > 0) {
                        cg0Var9.parseFrom(bArr7);
                    }
                    vdVar.f388132p = cg0Var9;
                }
                return 0;
            default:
                return -1;
        }
    }
}
