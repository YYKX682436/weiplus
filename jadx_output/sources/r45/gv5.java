package r45;

/* loaded from: classes7.dex */
public class gv5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f375553d;

    /* renamed from: e, reason: collision with root package name */
    public int f375554e = 10;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gv5)) {
            return false;
        }
        r45.gv5 gv5Var = (r45.gv5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f375553d), java.lang.Integer.valueOf(gv5Var.f375553d)) && n51.f.a(java.lang.Integer.valueOf(this.f375554e), java.lang.Integer.valueOf(gv5Var.f375554e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f375553d);
            fVar.e(2, this.f375554e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f375553d) + 0 + b36.f.e(2, this.f375554e);
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
        r45.gv5 gv5Var = (r45.gv5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gv5Var.f375553d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        gv5Var.f375554e = aVar2.g(intValue);
        return 0;
    }
}
