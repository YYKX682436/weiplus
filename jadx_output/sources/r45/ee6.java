package r45;

/* loaded from: classes10.dex */
public class ee6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373368d;

    /* renamed from: e, reason: collision with root package name */
    public float f373369e;

    /* renamed from: f, reason: collision with root package name */
    public r45.fi0 f373370f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ii0 f373371g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ei0 f373372h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ci0 f373373i;

    /* renamed from: m, reason: collision with root package name */
    public r45.ge6 f373374m;

    /* renamed from: n, reason: collision with root package name */
    public int f373375n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ee6)) {
            return false;
        }
        r45.ee6 ee6Var = (r45.ee6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373368d), java.lang.Integer.valueOf(ee6Var.f373368d)) && n51.f.a(java.lang.Float.valueOf(this.f373369e), java.lang.Float.valueOf(ee6Var.f373369e)) && n51.f.a(this.f373370f, ee6Var.f373370f) && n51.f.a(this.f373371g, ee6Var.f373371g) && n51.f.a(this.f373372h, ee6Var.f373372h) && n51.f.a(this.f373373i, ee6Var.f373373i) && n51.f.a(this.f373374m, ee6Var.f373374m) && n51.f.a(java.lang.Integer.valueOf(this.f373375n), java.lang.Integer.valueOf(ee6Var.f373375n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373368d);
            fVar.d(2, this.f373369e);
            r45.fi0 fi0Var = this.f373370f;
            if (fi0Var != null) {
                fVar.i(3, fi0Var.computeSize());
                this.f373370f.writeFields(fVar);
            }
            r45.ii0 ii0Var = this.f373371g;
            if (ii0Var != null) {
                fVar.i(4, ii0Var.computeSize());
                this.f373371g.writeFields(fVar);
            }
            r45.ei0 ei0Var = this.f373372h;
            if (ei0Var != null) {
                fVar.i(5, ei0Var.computeSize());
                this.f373372h.writeFields(fVar);
            }
            r45.ci0 ci0Var = this.f373373i;
            if (ci0Var != null) {
                fVar.i(6, ci0Var.computeSize());
                this.f373373i.writeFields(fVar);
            }
            r45.ge6 ge6Var = this.f373374m;
            if (ge6Var != null) {
                fVar.i(7, ge6Var.computeSize());
                this.f373374m.writeFields(fVar);
            }
            fVar.e(8, this.f373375n);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f373368d) + 0 + b36.f.d(2, this.f373369e);
            r45.fi0 fi0Var2 = this.f373370f;
            if (fi0Var2 != null) {
                e17 += b36.f.i(3, fi0Var2.computeSize());
            }
            r45.ii0 ii0Var2 = this.f373371g;
            if (ii0Var2 != null) {
                e17 += b36.f.i(4, ii0Var2.computeSize());
            }
            r45.ei0 ei0Var2 = this.f373372h;
            if (ei0Var2 != null) {
                e17 += b36.f.i(5, ei0Var2.computeSize());
            }
            r45.ci0 ci0Var2 = this.f373373i;
            if (ci0Var2 != null) {
                e17 += b36.f.i(6, ci0Var2.computeSize());
            }
            r45.ge6 ge6Var2 = this.f373374m;
            if (ge6Var2 != null) {
                e17 += b36.f.i(7, ge6Var2.computeSize());
            }
            return e17 + b36.f.e(8, this.f373375n);
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
        r45.ee6 ee6Var = (r45.ee6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ee6Var.f373368d = aVar2.g(intValue);
                return 0;
            case 2:
                ee6Var.f373369e = aVar2.f(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.fi0 fi0Var3 = new r45.fi0();
                    if (bArr != null && bArr.length > 0) {
                        fi0Var3.parseFrom(bArr);
                    }
                    ee6Var.f373370f = fi0Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.ii0 ii0Var3 = new r45.ii0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ii0Var3.parseFrom(bArr2);
                    }
                    ee6Var.f373371g = ii0Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.ei0 ei0Var3 = new r45.ei0();
                    if (bArr3 != null && bArr3.length > 0) {
                        ei0Var3.parseFrom(bArr3);
                    }
                    ee6Var.f373372h = ei0Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.ci0 ci0Var3 = new r45.ci0();
                    if (bArr4 != null && bArr4.length > 0) {
                        ci0Var3.parseFrom(bArr4);
                    }
                    ee6Var.f373373i = ci0Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    r45.ge6 ge6Var3 = new r45.ge6();
                    if (bArr5 != null && bArr5.length > 0) {
                        ge6Var3.parseFrom(bArr5);
                    }
                    ee6Var.f373374m = ge6Var3;
                }
                return 0;
            case 8:
                ee6Var.f373375n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
