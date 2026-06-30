package r45;

/* loaded from: classes4.dex */
public class i93 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public double f376839d;

    /* renamed from: e, reason: collision with root package name */
    public double f376840e;

    /* renamed from: f, reason: collision with root package name */
    public int f376841f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376842g;

    /* renamed from: h, reason: collision with root package name */
    public int f376843h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i93)) {
            return false;
        }
        r45.i93 i93Var = (r45.i93) fVar;
        return n51.f.a(this.BaseRequest, i93Var.BaseRequest) && n51.f.a(java.lang.Double.valueOf(this.f376839d), java.lang.Double.valueOf(i93Var.f376839d)) && n51.f.a(java.lang.Double.valueOf(this.f376840e), java.lang.Double.valueOf(i93Var.f376840e)) && n51.f.a(java.lang.Integer.valueOf(this.f376841f), java.lang.Integer.valueOf(i93Var.f376841f)) && n51.f.a(this.f376842g, i93Var.f376842g) && n51.f.a(java.lang.Integer.valueOf(this.f376843h), java.lang.Integer.valueOf(i93Var.f376843h));
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
            fVar.c(2, this.f376839d);
            fVar.c(3, this.f376840e);
            fVar.e(4, this.f376841f);
            java.lang.String str = this.f376842g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f376843h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.c(2, this.f376839d) + b36.f.c(3, this.f376840e) + b36.f.e(4, this.f376841f);
            java.lang.String str2 = this.f376842g;
            if (str2 != null) {
                i18 += b36.f.j(5, str2);
            }
            return i18 + b36.f.e(6, this.f376843h);
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
        r45.i93 i93Var = (r45.i93) objArr[1];
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
                    i93Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                i93Var.f376839d = aVar2.e(intValue);
                return 0;
            case 3:
                i93Var.f376840e = aVar2.e(intValue);
                return 0;
            case 4:
                i93Var.f376841f = aVar2.g(intValue);
                return 0;
            case 5:
                i93Var.f376842g = aVar2.k(intValue);
                return 0;
            case 6:
                i93Var.f376843h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
