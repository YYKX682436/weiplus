package r45;

/* loaded from: classes4.dex */
public class hw5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f376516d;

    /* renamed from: e, reason: collision with root package name */
    public int f376517e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f376518f;

    /* renamed from: g, reason: collision with root package name */
    public int f376519g;

    /* renamed from: h, reason: collision with root package name */
    public int f376520h;

    /* renamed from: i, reason: collision with root package name */
    public int f376521i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hw5)) {
            return false;
        }
        r45.hw5 hw5Var = (r45.hw5) fVar;
        return n51.f.a(this.BaseRequest, hw5Var.BaseRequest) && n51.f.a(this.f376516d, hw5Var.f376516d) && n51.f.a(java.lang.Integer.valueOf(this.f376517e), java.lang.Integer.valueOf(hw5Var.f376517e)) && n51.f.a(this.f376518f, hw5Var.f376518f) && n51.f.a(java.lang.Integer.valueOf(this.f376519g), java.lang.Integer.valueOf(hw5Var.f376519g)) && n51.f.a(java.lang.Integer.valueOf(this.f376520h), java.lang.Integer.valueOf(hw5Var.f376520h)) && n51.f.a(java.lang.Integer.valueOf(this.f376521i), java.lang.Integer.valueOf(hw5Var.f376521i));
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
            r45.du5 du5Var = this.f376516d;
            if (du5Var != null) {
                fVar.i(2, du5Var.computeSize());
                this.f376516d.writeFields(fVar);
            }
            fVar.e(3, this.f376517e);
            r45.cu5 cu5Var = this.f376518f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f376518f.writeFields(fVar);
            }
            fVar.e(5, this.f376519g);
            fVar.e(6, this.f376520h);
            fVar.e(7, this.f376521i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.du5 du5Var2 = this.f376516d;
            if (du5Var2 != null) {
                i18 += b36.f.i(2, du5Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f376517e);
            r45.cu5 cu5Var2 = this.f376518f;
            if (cu5Var2 != null) {
                e17 += b36.f.i(4, cu5Var2.computeSize());
            }
            return e17 + b36.f.e(5, this.f376519g) + b36.f.e(6, this.f376520h) + b36.f.e(7, this.f376521i);
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
        r45.hw5 hw5Var = (r45.hw5) objArr[1];
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
                    hw5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var3.b(bArr2);
                    }
                    hw5Var.f376516d = du5Var3;
                }
                return 0;
            case 3:
                hw5Var.f376517e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var3.b(bArr3);
                    }
                    hw5Var.f376518f = cu5Var3;
                }
                return 0;
            case 5:
                hw5Var.f376519g = aVar2.g(intValue);
                return 0;
            case 6:
                hw5Var.f376520h = aVar2.g(intValue);
                return 0;
            case 7:
                hw5Var.f376521i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
