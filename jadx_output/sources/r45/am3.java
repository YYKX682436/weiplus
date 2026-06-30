package r45;

/* loaded from: classes8.dex */
public class am3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f370119d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f370120e;

    /* renamed from: f, reason: collision with root package name */
    public int f370121f;

    /* renamed from: g, reason: collision with root package name */
    public int f370122g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f370123h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.am3)) {
            return false;
        }
        r45.am3 am3Var = (r45.am3) fVar;
        return n51.f.a(this.BaseRequest, am3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f370119d), java.lang.Integer.valueOf(am3Var.f370119d)) && n51.f.a(this.f370120e, am3Var.f370120e) && n51.f.a(java.lang.Integer.valueOf(this.f370121f), java.lang.Integer.valueOf(am3Var.f370121f)) && n51.f.a(java.lang.Integer.valueOf(this.f370122g), java.lang.Integer.valueOf(am3Var.f370122g)) && n51.f.a(this.f370123h, am3Var.f370123h);
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
            fVar.e(2, this.f370119d);
            r45.cu5 cu5Var = this.f370120e;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f370120e.writeFields(fVar);
            }
            fVar.e(4, this.f370121f);
            fVar.e(5, this.f370122g);
            r45.cu5 cu5Var2 = this.f370123h;
            if (cu5Var2 != null) {
                fVar.i(6, cu5Var2.computeSize());
                this.f370123h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f370119d);
            r45.cu5 cu5Var3 = this.f370120e;
            if (cu5Var3 != null) {
                i18 += b36.f.i(3, cu5Var3.computeSize());
            }
            int e17 = i18 + b36.f.e(4, this.f370121f) + b36.f.e(5, this.f370122g);
            r45.cu5 cu5Var4 = this.f370123h;
            return cu5Var4 != null ? e17 + b36.f.i(6, cu5Var4.computeSize()) : e17;
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
        r45.am3 am3Var = (r45.am3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    am3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                am3Var.f370119d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    am3Var.f370120e = cu5Var5;
                }
                return 0;
            case 4:
                am3Var.f370121f = aVar2.g(intValue);
                return 0;
            case 5:
                am3Var.f370122g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var6.b(bArr3);
                    }
                    am3Var.f370123h = cu5Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
