package r45;

/* loaded from: classes9.dex */
public class cx6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f371914d;

    /* renamed from: e, reason: collision with root package name */
    public int f371915e;

    /* renamed from: f, reason: collision with root package name */
    public r45.oy3 f371916f;

    /* renamed from: g, reason: collision with root package name */
    public r45.py3 f371917g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cx6)) {
            return false;
        }
        r45.cx6 cx6Var = (r45.cx6) fVar;
        return n51.f.a(this.BaseRequest, cx6Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f371914d), java.lang.Integer.valueOf(cx6Var.f371914d)) && n51.f.a(java.lang.Integer.valueOf(this.f371915e), java.lang.Integer.valueOf(cx6Var.f371915e)) && n51.f.a(this.f371916f, cx6Var.f371916f) && n51.f.a(this.f371917g, cx6Var.f371917g);
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
            fVar.e(2, this.f371914d);
            fVar.e(3, this.f371915e);
            r45.oy3 oy3Var = this.f371916f;
            if (oy3Var != null) {
                fVar.i(4, oy3Var.computeSize());
                this.f371916f.writeFields(fVar);
            }
            r45.py3 py3Var = this.f371917g;
            if (py3Var != null) {
                fVar.i(5, py3Var.computeSize());
                this.f371917g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f371914d) + b36.f.e(3, this.f371915e);
            r45.oy3 oy3Var2 = this.f371916f;
            if (oy3Var2 != null) {
                i18 += b36.f.i(4, oy3Var2.computeSize());
            }
            r45.py3 py3Var2 = this.f371917g;
            return py3Var2 != null ? i18 + b36.f.i(5, py3Var2.computeSize()) : i18;
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
        r45.cx6 cx6Var = (r45.cx6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                cx6Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            cx6Var.f371914d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            cx6Var.f371915e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.oy3 oy3Var3 = new r45.oy3();
                if (bArr2 != null && bArr2.length > 0) {
                    oy3Var3.parseFrom(bArr2);
                }
                cx6Var.f371916f = oy3Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.py3 py3Var3 = new r45.py3();
            if (bArr3 != null && bArr3.length > 0) {
                py3Var3.parseFrom(bArr3);
            }
            cx6Var.f371917g = py3Var3;
        }
        return 0;
    }
}
