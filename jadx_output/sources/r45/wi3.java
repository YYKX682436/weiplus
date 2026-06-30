package r45;

/* loaded from: classes4.dex */
public class wi3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f389204d;

    /* renamed from: e, reason: collision with root package name */
    public int f389205e;

    /* renamed from: f, reason: collision with root package name */
    public double f389206f;

    /* renamed from: g, reason: collision with root package name */
    public double f389207g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wi3)) {
            return false;
        }
        r45.wi3 wi3Var = (r45.wi3) fVar;
        return n51.f.a(this.BaseRequest, wi3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f389204d), java.lang.Integer.valueOf(wi3Var.f389204d)) && n51.f.a(java.lang.Integer.valueOf(this.f389205e), java.lang.Integer.valueOf(wi3Var.f389205e)) && n51.f.a(java.lang.Double.valueOf(this.f389206f), java.lang.Double.valueOf(wi3Var.f389206f)) && n51.f.a(java.lang.Double.valueOf(this.f389207g), java.lang.Double.valueOf(wi3Var.f389207g));
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
            fVar.e(2, this.f389204d);
            fVar.e(3, this.f389205e);
            fVar.c(4, this.f389206f);
            fVar.c(5, this.f389207g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f389204d) + b36.f.e(3, this.f389205e) + b36.f.c(4, this.f389206f) + b36.f.c(5, this.f389207g);
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
        r45.wi3 wi3Var = (r45.wi3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                wi3Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            wi3Var.f389204d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            wi3Var.f389205e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            wi3Var.f389206f = aVar2.e(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        wi3Var.f389207g = aVar2.e(intValue);
        return 0;
    }
}
