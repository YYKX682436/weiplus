package r45;

/* loaded from: classes10.dex */
public class bx5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371132d;

    /* renamed from: e, reason: collision with root package name */
    public int f371133e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371134f;

    /* renamed from: g, reason: collision with root package name */
    public r45.vm4 f371135g;

    /* renamed from: h, reason: collision with root package name */
    public r45.u2 f371136h;

    /* renamed from: i, reason: collision with root package name */
    public r45.nu3 f371137i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bx5)) {
            return false;
        }
        r45.bx5 bx5Var = (r45.bx5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371132d), java.lang.Integer.valueOf(bx5Var.f371132d)) && n51.f.a(java.lang.Integer.valueOf(this.f371133e), java.lang.Integer.valueOf(bx5Var.f371133e)) && n51.f.a(this.f371134f, bx5Var.f371134f) && n51.f.a(this.f371135g, bx5Var.f371135g) && n51.f.a(this.f371136h, bx5Var.f371136h) && n51.f.a(this.f371137i, bx5Var.f371137i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371132d);
            fVar.e(2, this.f371133e);
            java.lang.String str = this.f371134f;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.vm4 vm4Var = this.f371135g;
            if (vm4Var != null) {
                fVar.i(4, vm4Var.computeSize());
                this.f371135g.writeFields(fVar);
            }
            r45.u2 u2Var = this.f371136h;
            if (u2Var != null) {
                fVar.i(5, u2Var.computeSize());
                this.f371136h.writeFields(fVar);
            }
            r45.nu3 nu3Var = this.f371137i;
            if (nu3Var != null) {
                fVar.i(6, nu3Var.computeSize());
                this.f371137i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f371132d) + 0 + b36.f.e(2, this.f371133e);
            java.lang.String str2 = this.f371134f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            r45.vm4 vm4Var2 = this.f371135g;
            if (vm4Var2 != null) {
                e17 += b36.f.i(4, vm4Var2.computeSize());
            }
            r45.u2 u2Var2 = this.f371136h;
            if (u2Var2 != null) {
                e17 += b36.f.i(5, u2Var2.computeSize());
            }
            r45.nu3 nu3Var2 = this.f371137i;
            return nu3Var2 != null ? e17 + b36.f.i(6, nu3Var2.computeSize()) : e17;
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
        r45.bx5 bx5Var = (r45.bx5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bx5Var.f371132d = aVar2.g(intValue);
                return 0;
            case 2:
                bx5Var.f371133e = aVar2.g(intValue);
                return 0;
            case 3:
                bx5Var.f371134f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.vm4 vm4Var3 = new r45.vm4();
                    if (bArr != null && bArr.length > 0) {
                        vm4Var3.parseFrom(bArr);
                    }
                    bx5Var.f371135g = vm4Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.u2 u2Var3 = new r45.u2();
                    if (bArr2 != null && bArr2.length > 0) {
                        u2Var3.parseFrom(bArr2);
                    }
                    bx5Var.f371136h = u2Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.nu3 nu3Var3 = new r45.nu3();
                    if (bArr3 != null && bArr3.length > 0) {
                        nu3Var3.parseFrom(bArr3);
                    }
                    bx5Var.f371137i = nu3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
