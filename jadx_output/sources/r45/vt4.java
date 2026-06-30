package r45;

/* loaded from: classes12.dex */
public class vt4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.kx3 f388517d;

    /* renamed from: e, reason: collision with root package name */
    public r45.rt4 f388518e;

    /* renamed from: f, reason: collision with root package name */
    public r45.jo f388519f;

    /* renamed from: g, reason: collision with root package name */
    public int f388520g;

    /* renamed from: h, reason: collision with root package name */
    public r45.mx3 f388521h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cu5 f388522i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vt4)) {
            return false;
        }
        r45.vt4 vt4Var = (r45.vt4) fVar;
        return n51.f.a(this.f388517d, vt4Var.f388517d) && n51.f.a(this.f388518e, vt4Var.f388518e) && n51.f.a(this.f388519f, vt4Var.f388519f) && n51.f.a(java.lang.Integer.valueOf(this.f388520g), java.lang.Integer.valueOf(vt4Var.f388520g)) && n51.f.a(this.f388521h, vt4Var.f388521h) && n51.f.a(this.f388522i, vt4Var.f388522i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.kx3 kx3Var = this.f388517d;
            if (kx3Var != null) {
                fVar.i(1, kx3Var.computeSize());
                this.f388517d.writeFields(fVar);
            }
            r45.rt4 rt4Var = this.f388518e;
            if (rt4Var != null) {
                fVar.i(2, rt4Var.computeSize());
                this.f388518e.writeFields(fVar);
            }
            r45.jo joVar = this.f388519f;
            if (joVar != null) {
                fVar.i(3, joVar.computeSize());
                this.f388519f.writeFields(fVar);
            }
            fVar.e(4, this.f388520g);
            r45.mx3 mx3Var = this.f388521h;
            if (mx3Var != null) {
                fVar.i(5, mx3Var.computeSize());
                this.f388521h.writeFields(fVar);
            }
            r45.cu5 cu5Var = this.f388522i;
            if (cu5Var != null) {
                fVar.i(6, cu5Var.computeSize());
                this.f388522i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.kx3 kx3Var2 = this.f388517d;
            int i18 = kx3Var2 != null ? 0 + b36.f.i(1, kx3Var2.computeSize()) : 0;
            r45.rt4 rt4Var2 = this.f388518e;
            if (rt4Var2 != null) {
                i18 += b36.f.i(2, rt4Var2.computeSize());
            }
            r45.jo joVar2 = this.f388519f;
            if (joVar2 != null) {
                i18 += b36.f.i(3, joVar2.computeSize());
            }
            int e17 = i18 + b36.f.e(4, this.f388520g);
            r45.mx3 mx3Var2 = this.f388521h;
            if (mx3Var2 != null) {
                e17 += b36.f.i(5, mx3Var2.computeSize());
            }
            r45.cu5 cu5Var2 = this.f388522i;
            return cu5Var2 != null ? e17 + b36.f.i(6, cu5Var2.computeSize()) : e17;
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
        r45.vt4 vt4Var = (r45.vt4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.kx3 kx3Var3 = new r45.kx3();
                    if (bArr != null && bArr.length > 0) {
                        kx3Var3.parseFrom(bArr);
                    }
                    vt4Var.f388517d = kx3Var3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.rt4 rt4Var3 = new r45.rt4();
                    if (bArr2 != null && bArr2.length > 0) {
                        rt4Var3.parseFrom(bArr2);
                    }
                    vt4Var.f388518e = rt4Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.jo joVar3 = new r45.jo();
                    if (bArr3 != null && bArr3.length > 0) {
                        joVar3.parseFrom(bArr3);
                    }
                    vt4Var.f388519f = joVar3;
                }
                return 0;
            case 4:
                vt4Var.f388520g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.mx3 mx3Var3 = new r45.mx3();
                    if (bArr4 != null && bArr4.length > 0) {
                        mx3Var3.parseFrom(bArr4);
                    }
                    vt4Var.f388521h = mx3Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var3.b(bArr5);
                    }
                    vt4Var.f388522i = cu5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
