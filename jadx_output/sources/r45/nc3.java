package r45;

/* loaded from: classes4.dex */
public class nc3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public double f381241d;

    /* renamed from: e, reason: collision with root package name */
    public double f381242e;

    /* renamed from: f, reason: collision with root package name */
    public int f381243f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381244g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nc3)) {
            return false;
        }
        r45.nc3 nc3Var = (r45.nc3) fVar;
        return n51.f.a(this.BaseRequest, nc3Var.BaseRequest) && n51.f.a(java.lang.Double.valueOf(this.f381241d), java.lang.Double.valueOf(nc3Var.f381241d)) && n51.f.a(java.lang.Double.valueOf(this.f381242e), java.lang.Double.valueOf(nc3Var.f381242e)) && n51.f.a(java.lang.Integer.valueOf(this.f381243f), java.lang.Integer.valueOf(nc3Var.f381243f)) && n51.f.a(this.f381244g, nc3Var.f381244g);
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
            fVar.c(2, this.f381241d);
            fVar.c(3, this.f381242e);
            fVar.e(4, this.f381243f);
            java.lang.String str = this.f381244g;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.c(2, this.f381241d) + b36.f.c(3, this.f381242e) + b36.f.e(4, this.f381243f);
            java.lang.String str2 = this.f381244g;
            return str2 != null ? i18 + b36.f.j(5, str2) : i18;
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
        r45.nc3 nc3Var = (r45.nc3) objArr[1];
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
                nc3Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            nc3Var.f381241d = aVar2.e(intValue);
            return 0;
        }
        if (intValue == 3) {
            nc3Var.f381242e = aVar2.e(intValue);
            return 0;
        }
        if (intValue == 4) {
            nc3Var.f381243f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        nc3Var.f381244g = aVar2.k(intValue);
        return 0;
    }
}
