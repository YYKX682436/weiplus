package r45;

/* loaded from: classes4.dex */
public class o87 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f382039d;

    /* renamed from: e, reason: collision with root package name */
    public float f382040e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o87)) {
            return false;
        }
        r45.o87 o87Var = (r45.o87) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f382039d), java.lang.Float.valueOf(o87Var.f382039d)) && n51.f.a(java.lang.Float.valueOf(this.f382040e), java.lang.Float.valueOf(o87Var.f382040e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f382039d);
            fVar.d(2, this.f382040e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f382039d) + 0 + b36.f.d(2, this.f382040e);
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
        r45.o87 o87Var = (r45.o87) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            o87Var.f382039d = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        o87Var.f382040e = aVar2.f(intValue);
        return 0;
    }
}
