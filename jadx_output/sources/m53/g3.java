package m53;

/* loaded from: classes8.dex */
public class g3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f323703d;

    /* renamed from: e, reason: collision with root package name */
    public double f323704e;

    /* renamed from: f, reason: collision with root package name */
    public int f323705f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.g3)) {
            return false;
        }
        m53.g3 g3Var = (m53.g3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f323703d), java.lang.Integer.valueOf(g3Var.f323703d)) && n51.f.a(java.lang.Double.valueOf(this.f323704e), java.lang.Double.valueOf(g3Var.f323704e)) && n51.f.a(java.lang.Integer.valueOf(this.f323705f), java.lang.Integer.valueOf(g3Var.f323705f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f323703d);
            fVar.c(2, this.f323704e);
            fVar.e(3, this.f323705f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f323703d) + 0 + b36.f.c(2, this.f323704e) + b36.f.e(3, this.f323705f);
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
        m53.g3 g3Var = (m53.g3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            g3Var.f323703d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            g3Var.f323704e = aVar2.e(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        g3Var.f323705f = aVar2.g(intValue);
        return 0;
    }
}
