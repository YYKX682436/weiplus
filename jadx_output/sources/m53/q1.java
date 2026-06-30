package m53;

/* loaded from: classes8.dex */
public class q1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f323980d;

    /* renamed from: e, reason: collision with root package name */
    public long f323981e;

    /* renamed from: f, reason: collision with root package name */
    public long f323982f;

    /* renamed from: g, reason: collision with root package name */
    public long f323983g;

    /* renamed from: h, reason: collision with root package name */
    public long f323984h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.q1)) {
            return false;
        }
        m53.q1 q1Var = (m53.q1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f323980d), java.lang.Long.valueOf(q1Var.f323980d)) && n51.f.a(java.lang.Long.valueOf(this.f323981e), java.lang.Long.valueOf(q1Var.f323981e)) && n51.f.a(java.lang.Long.valueOf(this.f323982f), java.lang.Long.valueOf(q1Var.f323982f)) && n51.f.a(java.lang.Long.valueOf(this.f323983g), java.lang.Long.valueOf(q1Var.f323983g)) && n51.f.a(java.lang.Long.valueOf(this.f323984h), java.lang.Long.valueOf(q1Var.f323984h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f323980d);
            fVar.h(2, this.f323981e);
            fVar.h(3, this.f323982f);
            fVar.h(4, this.f323983g);
            fVar.h(5, this.f323984h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f323980d) + 0 + b36.f.h(2, this.f323981e) + b36.f.h(3, this.f323982f) + b36.f.h(4, this.f323983g) + b36.f.h(5, this.f323984h);
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
        m53.q1 q1Var = (m53.q1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            q1Var.f323980d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            q1Var.f323981e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            q1Var.f323982f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            q1Var.f323983g = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        q1Var.f323984h = aVar2.i(intValue);
        return 0;
    }
}
