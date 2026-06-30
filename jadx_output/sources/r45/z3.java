package r45;

/* loaded from: classes4.dex */
public class z3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f391655d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f391656e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f391657f;

    /* renamed from: g, reason: collision with root package name */
    public int f391658g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f391659h;

    /* renamed from: i, reason: collision with root package name */
    public r45.rw3 f391660i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z3)) {
            return false;
        }
        r45.z3 z3Var = (r45.z3) fVar;
        return n51.f.a(this.BaseRequest, z3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f391655d), java.lang.Integer.valueOf(z3Var.f391655d)) && n51.f.a(this.f391656e, z3Var.f391656e) && n51.f.a(this.f391657f, z3Var.f391657f) && n51.f.a(java.lang.Integer.valueOf(this.f391658g), java.lang.Integer.valueOf(z3Var.f391658g)) && n51.f.a(this.f391659h, z3Var.f391659h) && n51.f.a(this.f391660i, z3Var.f391660i);
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
            fVar.e(2, this.f391655d);
            fVar.g(3, 8, this.f391656e);
            r45.du5 du5Var = this.f391657f;
            if (du5Var != null) {
                fVar.i(4, du5Var.computeSize());
                this.f391657f.writeFields(fVar);
            }
            fVar.e(5, this.f391658g);
            java.lang.String str = this.f391659h;
            if (str != null) {
                fVar.j(6, str);
            }
            r45.rw3 rw3Var = this.f391660i;
            if (rw3Var != null) {
                fVar.i(7, rw3Var.computeSize());
                this.f391660i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f391655d) + b36.f.g(3, 8, this.f391656e);
            r45.du5 du5Var2 = this.f391657f;
            if (du5Var2 != null) {
                i18 += b36.f.i(4, du5Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(5, this.f391658g);
            java.lang.String str2 = this.f391659h;
            if (str2 != null) {
                e17 += b36.f.j(6, str2);
            }
            r45.rw3 rw3Var2 = this.f391660i;
            return rw3Var2 != null ? e17 + b36.f.i(7, rw3Var2.computeSize()) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f391656e.clear();
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
        r45.z3 z3Var = (r45.z3) objArr[1];
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
                    z3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                z3Var.f391655d = aVar2.g(intValue);
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
                    z3Var.f391656e.add(kk4Var);
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
                    z3Var.f391657f = du5Var3;
                }
                return 0;
            case 5:
                z3Var.f391658g = aVar2.g(intValue);
                return 0;
            case 6:
                z3Var.f391659h = aVar2.k(intValue);
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
                    z3Var.f391660i = rw3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
