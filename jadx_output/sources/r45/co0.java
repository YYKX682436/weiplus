package r45;

/* loaded from: classes8.dex */
public class co0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f371679d;

    /* renamed from: e, reason: collision with root package name */
    public int f371680e;

    /* renamed from: f, reason: collision with root package name */
    public int f371681f;

    /* renamed from: g, reason: collision with root package name */
    public int f371682g;

    /* renamed from: h, reason: collision with root package name */
    public double f371683h;

    /* renamed from: i, reason: collision with root package name */
    public double f371684i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.co0)) {
            return false;
        }
        r45.co0 co0Var = (r45.co0) fVar;
        return n51.f.a(this.BaseRequest, co0Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f371679d), java.lang.Integer.valueOf(co0Var.f371679d)) && n51.f.a(java.lang.Integer.valueOf(this.f371680e), java.lang.Integer.valueOf(co0Var.f371680e)) && n51.f.a(java.lang.Integer.valueOf(this.f371681f), java.lang.Integer.valueOf(co0Var.f371681f)) && n51.f.a(java.lang.Integer.valueOf(this.f371682g), java.lang.Integer.valueOf(co0Var.f371682g)) && n51.f.a(java.lang.Double.valueOf(this.f371683h), java.lang.Double.valueOf(co0Var.f371683h)) && n51.f.a(java.lang.Double.valueOf(this.f371684i), java.lang.Double.valueOf(co0Var.f371684i));
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
            fVar.e(2, this.f371679d);
            fVar.e(3, this.f371680e);
            fVar.e(4, this.f371681f);
            fVar.e(5, this.f371682g);
            fVar.c(6, this.f371683h);
            fVar.c(7, this.f371684i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f371679d) + b36.f.e(3, this.f371680e) + b36.f.e(4, this.f371681f) + b36.f.e(5, this.f371682g) + b36.f.c(6, this.f371683h) + b36.f.c(7, this.f371684i);
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
        r45.co0 co0Var = (r45.co0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    co0Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                co0Var.f371679d = aVar2.g(intValue);
                return 0;
            case 3:
                co0Var.f371680e = aVar2.g(intValue);
                return 0;
            case 4:
                co0Var.f371681f = aVar2.g(intValue);
                return 0;
            case 5:
                co0Var.f371682g = aVar2.g(intValue);
                return 0;
            case 6:
                co0Var.f371683h = aVar2.e(intValue);
                return 0;
            case 7:
                co0Var.f371684i = aVar2.e(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
