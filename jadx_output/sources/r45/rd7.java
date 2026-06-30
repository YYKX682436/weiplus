package r45;

/* loaded from: classes4.dex */
public class rd7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f384753d;

    /* renamed from: e, reason: collision with root package name */
    public int f384754e;

    /* renamed from: f, reason: collision with root package name */
    public double f384755f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rd7)) {
            return false;
        }
        r45.rd7 rd7Var = (r45.rd7) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f384753d), java.lang.Boolean.valueOf(rd7Var.f384753d)) && n51.f.a(java.lang.Integer.valueOf(this.f384754e), java.lang.Integer.valueOf(rd7Var.f384754e)) && n51.f.a(java.lang.Double.valueOf(this.f384755f), java.lang.Double.valueOf(rd7Var.f384755f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f384753d);
            fVar.e(2, this.f384754e);
            fVar.c(3, this.f384755f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f384753d) + 0 + b36.f.e(2, this.f384754e) + b36.f.c(3, this.f384755f);
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
        r45.rd7 rd7Var = (r45.rd7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            rd7Var.f384753d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            rd7Var.f384754e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        rd7Var.f384755f = aVar2.e(intValue);
        return 0;
    }
}
