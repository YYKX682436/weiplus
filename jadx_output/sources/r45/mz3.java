package r45;

/* loaded from: classes9.dex */
public class mz3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f380939d;

    /* renamed from: e, reason: collision with root package name */
    public long f380940e;

    /* renamed from: f, reason: collision with root package name */
    public int f380941f;

    /* renamed from: g, reason: collision with root package name */
    public int f380942g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mz3)) {
            return false;
        }
        r45.mz3 mz3Var = (r45.mz3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f380939d), java.lang.Integer.valueOf(mz3Var.f380939d)) && n51.f.a(java.lang.Long.valueOf(this.f380940e), java.lang.Long.valueOf(mz3Var.f380940e)) && n51.f.a(java.lang.Integer.valueOf(this.f380941f), java.lang.Integer.valueOf(mz3Var.f380941f)) && n51.f.a(java.lang.Integer.valueOf(this.f380942g), java.lang.Integer.valueOf(mz3Var.f380942g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f380939d);
            fVar.h(2, this.f380940e);
            fVar.e(3, this.f380941f);
            fVar.e(4, this.f380942g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f380939d) + 0 + b36.f.h(2, this.f380940e) + b36.f.e(3, this.f380941f) + b36.f.e(4, this.f380942g);
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
        r45.mz3 mz3Var = (r45.mz3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mz3Var.f380939d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            mz3Var.f380940e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            mz3Var.f380941f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        mz3Var.f380942g = aVar2.g(intValue);
        return 0;
    }
}
