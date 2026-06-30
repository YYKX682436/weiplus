package r45;

/* loaded from: classes10.dex */
public class bi0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f370772d;

    /* renamed from: e, reason: collision with root package name */
    public long f370773e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bi0)) {
            return false;
        }
        r45.bi0 bi0Var = (r45.bi0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f370772d), java.lang.Long.valueOf(bi0Var.f370772d)) && n51.f.a(java.lang.Long.valueOf(this.f370773e), java.lang.Long.valueOf(bi0Var.f370773e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f370772d);
            fVar.h(2, this.f370773e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f370772d) + 0 + b36.f.h(2, this.f370773e);
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
        r45.bi0 bi0Var = (r45.bi0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bi0Var.f370772d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        bi0Var.f370773e = aVar2.i(intValue);
        return 0;
    }
}
