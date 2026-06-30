package r45;

/* loaded from: classes8.dex */
public class mk5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f380605d;

    /* renamed from: e, reason: collision with root package name */
    public long f380606e;

    /* renamed from: f, reason: collision with root package name */
    public long f380607f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mk5)) {
            return false;
        }
        r45.mk5 mk5Var = (r45.mk5) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f380605d), java.lang.Long.valueOf(mk5Var.f380605d)) && n51.f.a(java.lang.Long.valueOf(this.f380606e), java.lang.Long.valueOf(mk5Var.f380606e)) && n51.f.a(java.lang.Long.valueOf(this.f380607f), java.lang.Long.valueOf(mk5Var.f380607f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f380605d);
            fVar.h(2, this.f380606e);
            fVar.h(3, this.f380607f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f380605d) + 0 + b36.f.h(2, this.f380606e) + b36.f.h(3, this.f380607f);
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
        r45.mk5 mk5Var = (r45.mk5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mk5Var.f380605d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            mk5Var.f380606e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        mk5Var.f380607f = aVar2.i(intValue);
        return 0;
    }
}
