package r45;

/* loaded from: classes7.dex */
public class qd7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f383875d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f383876e;

    /* renamed from: f, reason: collision with root package name */
    public int f383877f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qd7)) {
            return false;
        }
        r45.qd7 qd7Var = (r45.qd7) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f383875d), java.lang.Boolean.valueOf(qd7Var.f383875d)) && n51.f.a(java.lang.Boolean.valueOf(this.f383876e), java.lang.Boolean.valueOf(qd7Var.f383876e)) && n51.f.a(java.lang.Integer.valueOf(this.f383877f), java.lang.Integer.valueOf(qd7Var.f383877f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f383875d);
            fVar.a(2, this.f383876e);
            fVar.e(3, this.f383877f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f383875d) + 0 + b36.f.a(2, this.f383876e) + b36.f.e(3, this.f383877f);
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
        r45.qd7 qd7Var = (r45.qd7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qd7Var.f383875d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            qd7Var.f383876e = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        qd7Var.f383877f = aVar2.g(intValue);
        return 0;
    }
}
