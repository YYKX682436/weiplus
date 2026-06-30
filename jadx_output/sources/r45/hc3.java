package r45;

/* loaded from: classes4.dex */
public class hc3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376042d;

    /* renamed from: e, reason: collision with root package name */
    public double f376043e;

    /* renamed from: f, reason: collision with root package name */
    public double f376044f;

    /* renamed from: g, reason: collision with root package name */
    public long f376045g;

    /* renamed from: h, reason: collision with root package name */
    public int f376046h;

    /* renamed from: i, reason: collision with root package name */
    public int f376047i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hc3)) {
            return false;
        }
        r45.hc3 hc3Var = (r45.hc3) fVar;
        return n51.f.a(this.BaseRequest, hc3Var.BaseRequest) && n51.f.a(this.f376042d, hc3Var.f376042d) && n51.f.a(java.lang.Double.valueOf(this.f376043e), java.lang.Double.valueOf(hc3Var.f376043e)) && n51.f.a(java.lang.Double.valueOf(this.f376044f), java.lang.Double.valueOf(hc3Var.f376044f)) && n51.f.a(java.lang.Long.valueOf(this.f376045g), java.lang.Long.valueOf(hc3Var.f376045g)) && n51.f.a(java.lang.Integer.valueOf(this.f376046h), java.lang.Integer.valueOf(hc3Var.f376046h)) && n51.f.a(java.lang.Integer.valueOf(this.f376047i), java.lang.Integer.valueOf(hc3Var.f376047i));
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
            java.lang.String str = this.f376042d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.c(3, this.f376043e);
            fVar.c(4, this.f376044f);
            fVar.h(5, this.f376045g);
            fVar.e(6, this.f376046h);
            fVar.e(7, this.f376047i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f376042d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.c(3, this.f376043e) + b36.f.c(4, this.f376044f) + b36.f.h(5, this.f376045g) + b36.f.e(6, this.f376046h) + b36.f.e(7, this.f376047i);
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
        r45.hc3 hc3Var = (r45.hc3) objArr[1];
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
                    hc3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                hc3Var.f376042d = aVar2.k(intValue);
                return 0;
            case 3:
                hc3Var.f376043e = aVar2.e(intValue);
                return 0;
            case 4:
                hc3Var.f376044f = aVar2.e(intValue);
                return 0;
            case 5:
                hc3Var.f376045g = aVar2.i(intValue);
                return 0;
            case 6:
                hc3Var.f376046h = aVar2.g(intValue);
                return 0;
            case 7:
                hc3Var.f376047i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
