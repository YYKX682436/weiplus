package r45;

/* loaded from: classes4.dex */
public class y37 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f390766d;

    /* renamed from: e, reason: collision with root package name */
    public long f390767e;

    /* renamed from: f, reason: collision with root package name */
    public int f390768f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y37)) {
            return false;
        }
        r45.y37 y37Var = (r45.y37) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f390766d), java.lang.Long.valueOf(y37Var.f390766d)) && n51.f.a(java.lang.Long.valueOf(this.f390767e), java.lang.Long.valueOf(y37Var.f390767e)) && n51.f.a(java.lang.Integer.valueOf(this.f390768f), java.lang.Integer.valueOf(y37Var.f390768f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f390766d);
            fVar.h(2, this.f390767e);
            fVar.e(3, this.f390768f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f390766d) + 0 + b36.f.h(2, this.f390767e) + b36.f.e(3, this.f390768f);
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
        r45.y37 y37Var = (r45.y37) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            y37Var.f390766d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            y37Var.f390767e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        y37Var.f390768f = aVar2.g(intValue);
        return 0;
    }
}
