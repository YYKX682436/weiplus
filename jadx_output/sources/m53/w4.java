package m53;

/* loaded from: classes4.dex */
public class w4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f324160d;

    /* renamed from: e, reason: collision with root package name */
    public long f324161e;

    /* renamed from: f, reason: collision with root package name */
    public int f324162f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.w4)) {
            return false;
        }
        m53.w4 w4Var = (m53.w4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f324160d), java.lang.Long.valueOf(w4Var.f324160d)) && n51.f.a(java.lang.Long.valueOf(this.f324161e), java.lang.Long.valueOf(w4Var.f324161e)) && n51.f.a(java.lang.Integer.valueOf(this.f324162f), java.lang.Integer.valueOf(w4Var.f324162f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f324160d);
            fVar.h(2, this.f324161e);
            fVar.e(3, this.f324162f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f324160d) + 0 + b36.f.h(2, this.f324161e) + b36.f.e(3, this.f324162f);
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
        m53.w4 w4Var = (m53.w4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            w4Var.f324160d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            w4Var.f324161e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        w4Var.f324162f = aVar2.g(intValue);
        return 0;
    }
}
