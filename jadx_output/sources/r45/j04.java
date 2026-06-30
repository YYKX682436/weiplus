package r45;

/* loaded from: classes4.dex */
public class j04 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f377467d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f377468e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f377469f;

    /* renamed from: g, reason: collision with root package name */
    public int f377470g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f377471h;

    /* renamed from: i, reason: collision with root package name */
    public r45.rw3 f377472i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j04)) {
            return false;
        }
        r45.j04 j04Var = (r45.j04) fVar;
        return n51.f.a(this.BaseRequest, j04Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f377467d), java.lang.Integer.valueOf(j04Var.f377467d)) && n51.f.a(this.f377468e, j04Var.f377468e) && n51.f.a(this.f377469f, j04Var.f377469f) && n51.f.a(java.lang.Integer.valueOf(this.f377470g), java.lang.Integer.valueOf(j04Var.f377470g)) && n51.f.a(this.f377471h, j04Var.f377471h) && n51.f.a(this.f377472i, j04Var.f377472i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f377467d);
            fVar.g(3, 8, this.f377468e);
            r45.du5 du5Var = this.f377469f;
            if (du5Var != null) {
                fVar.i(4, du5Var.computeSize());
                this.f377469f.writeFields(fVar);
            }
            fVar.e(5, this.f377470g);
            java.lang.String str = this.f377471h;
            if (str != null) {
                fVar.j(6, str);
            }
            r45.rw3 rw3Var = this.f377472i;
            if (rw3Var != null) {
                fVar.i(7, rw3Var.computeSize());
                this.f377472i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f377467d) + b36.f.g(3, 8, this.f377468e);
            r45.du5 du5Var2 = this.f377469f;
            if (du5Var2 != null) {
                i18 += b36.f.i(4, du5Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(5, this.f377470g);
            java.lang.String str2 = this.f377471h;
            if (str2 != null) {
                e17 += b36.f.j(6, str2);
            }
            r45.rw3 rw3Var2 = this.f377472i;
            return rw3Var2 != null ? e17 + b36.f.i(7, rw3Var2.computeSize()) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f377468e.clear();
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
        r45.j04 j04Var = (r45.j04) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    j04Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                j04Var.f377467d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.kk4 kk4Var = new r45.kk4();
                    if (bArr3 != null && bArr3.length > 0) {
                        kk4Var.parseFrom(bArr3);
                    }
                    j04Var.f377468e.add(kk4Var);
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var3.b(bArr4);
                    }
                    j04Var.f377469f = du5Var3;
                }
                return 0;
            case 5:
                j04Var.f377470g = aVar2.g(intValue);
                return 0;
            case 6:
                j04Var.f377471h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.rw3 rw3Var3 = new r45.rw3();
                    if (bArr5 != null && bArr5.length > 0) {
                        rw3Var3.parseFrom(bArr5);
                    }
                    j04Var.f377472i = rw3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
