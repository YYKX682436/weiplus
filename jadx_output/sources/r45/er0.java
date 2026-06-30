package r45;

/* loaded from: classes2.dex */
public class er0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f373688d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f373689e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f373690f = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.er0)) {
            return false;
        }
        r45.er0 er0Var = (r45.er0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f373688d), java.lang.Long.valueOf(er0Var.f373688d)) && n51.f.a(java.lang.Long.valueOf(this.f373689e), java.lang.Long.valueOf(er0Var.f373689e)) && n51.f.a(java.lang.Integer.valueOf(this.f373690f), java.lang.Integer.valueOf(er0Var.f373690f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f373688d);
            fVar.h(2, this.f373689e);
            fVar.e(3, this.f373690f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f373688d) + 0 + b36.f.h(2, this.f373689e) + b36.f.e(3, this.f373690f);
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
        r45.er0 er0Var = (r45.er0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            er0Var.f373688d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            er0Var.f373689e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        er0Var.f373690f = aVar2.g(intValue);
        return 0;
    }
}
