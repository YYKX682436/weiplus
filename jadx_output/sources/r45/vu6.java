package r45;

/* loaded from: classes2.dex */
public class vu6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public double f388587d;

    /* renamed from: e, reason: collision with root package name */
    public double f388588e;

    /* renamed from: f, reason: collision with root package name */
    public double f388589f;

    /* renamed from: g, reason: collision with root package name */
    public double f388590g;

    /* renamed from: h, reason: collision with root package name */
    public double f388591h;

    /* renamed from: i, reason: collision with root package name */
    public int f388592i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vu6)) {
            return false;
        }
        r45.vu6 vu6Var = (r45.vu6) fVar;
        return n51.f.a(this.BaseRequest, vu6Var.BaseRequest) && n51.f.a(java.lang.Double.valueOf(this.f388587d), java.lang.Double.valueOf(vu6Var.f388587d)) && n51.f.a(java.lang.Double.valueOf(this.f388588e), java.lang.Double.valueOf(vu6Var.f388588e)) && n51.f.a(java.lang.Double.valueOf(this.f388589f), java.lang.Double.valueOf(vu6Var.f388589f)) && n51.f.a(java.lang.Double.valueOf(this.f388590g), java.lang.Double.valueOf(vu6Var.f388590g)) && n51.f.a(java.lang.Double.valueOf(this.f388591h), java.lang.Double.valueOf(vu6Var.f388591h)) && n51.f.a(java.lang.Integer.valueOf(this.f388592i), java.lang.Integer.valueOf(vu6Var.f388592i));
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
            fVar.c(2, this.f388587d);
            fVar.c(3, this.f388588e);
            fVar.c(4, this.f388589f);
            fVar.c(5, this.f388590g);
            fVar.c(6, this.f388591h);
            fVar.e(7, this.f388592i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.c(2, this.f388587d) + b36.f.c(3, this.f388588e) + b36.f.c(4, this.f388589f) + b36.f.c(5, this.f388590g) + b36.f.c(6, this.f388591h) + b36.f.e(7, this.f388592i);
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
        r45.vu6 vu6Var = (r45.vu6) objArr[1];
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
                    vu6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                vu6Var.f388587d = aVar2.e(intValue);
                return 0;
            case 3:
                vu6Var.f388588e = aVar2.e(intValue);
                return 0;
            case 4:
                vu6Var.f388589f = aVar2.e(intValue);
                return 0;
            case 5:
                vu6Var.f388590g = aVar2.e(intValue);
                return 0;
            case 6:
                vu6Var.f388591h = aVar2.e(intValue);
                return 0;
            case 7:
                vu6Var.f388592i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
